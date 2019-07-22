package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import uk.ac.york.cs.ecss.language.ecssLanguage.*;
import uk.ac.york.cs.ecss.migrated.ResourceLoader;
import uk.ac.york.cs.ecss.postproc.regexp.RegexpManager;
import util.GrammarUtils;
import util.XtextSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompleteManager {
	
	private ResourceLoader resourceLoader;

	public CompleteManager(ResourceLoader loader) {
		this.resourceLoader = loader;
	}

	private Set<SubSelector<? super CurrentRuleSelectionState>> propertyRules = new HashSet<>();
	private TemplateManager tm = new TemplateManager(this);

	public Set<SubSelector<? super CurrentRuleSelectionState>> getPropertyRules() {
		// These are probably all 'normal' rules
		return propertyRules;
	}

	private static Map<EClass, Set<EClass>> subClasses = new HashMap<>();
	private static Set<EClass> knownEClasses = new HashSet<EClass>();

	public static void knowEClass(EClass cl) {
		if (knownEClasses.add(cl)) {
			cl.getESuperTypes().forEach(sup -> subClasses.computeIfAbsent(sup, x -> new HashSet<>()).add(cl));
		}
	}

	public Collection<EClass> getSubClasses(EClass cl) {
		return subClasses.getOrDefault(cl, Collections.emptySet());
	}

	public void prepareFor(Resource inputEcore) {
		this.mainEcoreFile = inputEcore;
		Set<Resource> allResources = new HashSet<Resource>();
		Stack<Resource> remainingResources = new Stack<>();
		List<EClass> allClasses = new ArrayList<>();
		remainingResources.add(inputEcore);
		allResources.add(inputEcore);
		while (!remainingResources.isEmpty()) {
			Resource res = remainingResources.pop();
			res.getAllContents().forEachRemaining(x -> {
				if (x instanceof EClass) {
					EClass ecl = (EClass) x;
					allClasses.add(ecl);
					for (EReference ref : ecl.getEReferences()) {
						if (ref.getEType() == null) {
							continue;
						}
						Resource altRes = ref.getEType().eResource();
						if (allResources.add(altRes)) {
							remainingResources.add(altRes);
						}
					}
				}
			});
		}
		prepareFor(allClasses);
	}

	private Resource mainEcoreFile;
	// private List<Resource> allUsedEcoreFiles = new ArrayList<>();
	private String grammarName;

	public void setGrammarName(String grammarName) {
		this.grammarName = grammarName;
	}

	public void prepareFor(Collection<EClass> inputEcore) {
		inputEcore.forEach(ecl -> knowEClass(ecl));
	}

	public String getGrammarName() {
		return grammarName;	
	}

	/**
	 * Generate header w/o use of 'org.eclipse.xtext.common.Terminals'.
	 * 
	 * @return
	 */
	public String generateHeader() {
		return generateHeader(false);
	}
	
	/**
	 * 	Generate header w/ or w/o use of 'org.eclipse.xtext.common.Terminals'.
	 * 
	 * Side effect: will (!) set grammar name if null.
	 * 
	 * @param useXtextCommonTerminals 
	 * @return
	 */
	public String generateHeader(boolean useXtextCommonTerminals) {
		StringBuilder builder = new StringBuilder();
		if ( grammarName == null ) {
			setDefaultGrammarName();
		}
		
		if ( useXtextCommonTerminals ) {
			builder.append("grammar " + getGrammarName() + " with org.eclipse.xtext.common.Terminals \n");			
		} else {
			builder.append("grammar " + getGrammarName() + " \n");			
		}
		builder.append("\n");
		if (mainEcoreFile == null) {

			String uri = "http://" + getGrammarName().replace('.', '/');
			builder.append("generate mylang \"" + uri + "\"\n");
		} else {
			String uri = mainEcoreFile.getURI().toString();
			builder.append("import mylang \"" + uri + "\"\n");
		}
		builder.append("import \"http://www.eclipse.org/emf/2002/Ecore\" as ecore\n\n");
		//builder.append("import \"http://www.eclipse.org/2008/Xtext\"\n\n");
				
		return builder.toString();
	}

	/**
	 * Sets default grammar name derived from Ns URI in language meta-model
	 * 
	 * (!) BEWARE: if a resource with the same name already exists in the ResourceSet, the serialization of an equally named Resource will fail !
	 */
	private void setDefaultGrammarName() {
		if ( mainEcoreFile != null ) {
			for ( EObject eObject : mainEcoreFile.getContents() ) {
				if ( eObject instanceof EPackageImpl ) {
					EPackageImpl ePackage = (EPackageImpl) eObject;
					grammarName = GrammarUtils.extractGrammarUriPartFromNsURI(ePackage.getNsURI());						
					String languageName = ePackage.getName().substring(0, 1).toUpperCase() + ePackage.getName().substring(1);
					languageName += "Language";// + styleName; // TODO (eventually): add ecss model file name, e.g. hutn.ecss (= LanguageHutn)
					grammarName += "." + languageName;
				}
			}
		}
	}

	public static class GenerationOutput<T> {
		public final T value;
		public final String string;
		public final Set<String> dataTypeNames = new HashSet<String>();

		public GenerationOutput(T value, String string) {
			this.value = value;
			this.string = string;
		}
	}

	public GenerationOutput<Grammar> generateFull() {
		StringBuilder ret = new StringBuilder();
		ret.append(generateHeader());
		ret.append("\n");
		List<EClass> allClasses = new ArrayList<>();
		StringBuilder lateRet = new StringBuilder();
		if (mainEcoreFile != null) {
			mainEcoreFile.getAllContents().forEachRemaining(x -> {
				if (x instanceof EEnum) {
					/*String str = generateStringForGroup("enumRules", x);
					lateRet.append(str + "\n\n");*/
				} else if (x instanceof EClass) {
					allClasses.add((EClass) x);
				}
			});
		}
		EClass rootClass = this.getBestRootClass(allClasses);

		AbstractEcssXtendRule rootRule = generateRuleForGroup("classRules", rootClass);
		String str = rootRule.getString();
		ret.append(str + "\n\n");
		
		Set<AbstractEcssXtendRule> allDepSet = new HashSet<>();
		allDepSet.add(rootRule);
		for(;;) {
			List<AbstractEcssXtendRule> allDependentRules = getAllDependentRules(rootRule);
			allDependentRules = new ArrayList<AbstractEcssXtendRule>(allDependentRules);
			allDependentRules.removeAll(allDepSet);
			allDepSet.addAll(allDependentRules);
			if (allDependentRules.isEmpty()) {
				break;
			}
			for (AbstractEcssXtendRule generatedRule : allDependentRules) {
				if (generatedRule == rootRule) {
					continue;
				}
				String generated = generatedRule.getString();
				ret.append(generated+"\n\n");
			}
		}
		
		lateRet.append("terminal ID returns ecore::EString: '^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;");

		ret.append(lateRet);

		String preRet = ret.toString();
//		System.out.println("PreRet: "+preRet);
		// Now first read the model
		Grammar gr = XtextSerialization.getGrammar(preRet);
		if (gr != null) {

			Set<String> dataTypeNames = new HashSet<String>();
			List<AbstractRule> newRules = RegexpManager.postProcess(gr.getRules(), dataTypeNames);
			if (gr.getRules() != newRules) {
				gr.getRules().clear();
				gr.getRules().addAll(newRules);
			}
			String newRet = XtextSerialization.getString(gr, dataTypeNames);
			
			if (newRet != null && !newRet.isEmpty()) {
				preRet = newRet;
			}
		}
		GenerationOutput<Grammar> retG = new GenerationOutput<Grammar>(gr, preRet);

		return retG;
	}

	public void saveInResource(Resource r) {
		GenerationOutput<Grammar> generated = generateFull();
		try {
			boolean saved = false;
			if (generated.value != null) {
				r.getContents().add(generated.value);
				try {
					r.save(Collections.emptyMap());
					saved  = true;
				} catch (Exception e) {
					System.err.println("Could not save model: "+e.getMessage());
					e.printStackTrace();
				}
			} 
			//TODO: Postprocessing wird dann nicht aufgerufen!
			if (true || !saved) {
				FileOutputStream fos = new FileOutputStream(r.getURI().toFileString());
				fos.write(generated.string.getBytes());
				fos.flush();
				fos.close();
			}
		} catch (IOException e) {
			System.err.println("Could not save resource: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public String generateString(Object... parameters) {
		AbstractEcssXtendRule rule = generateRule(parameters);
		if (rule == null) {
			System.err.println("No rule found for " + Arrays.asList(parameters) + "!");
			return "/*No rule found for " + Arrays.asList(parameters) + "!*/";
		}
		return rule.getOrCreateString(tm, null);
	}

	/** Complete, so that the string can directly be got */
	public AbstractEcssXtendRule generateRule(Object... parameters) {
		AbstractEcssXtendRule rule = tm.generateRule(null, null, Arrays.asList(parameters), Collections.emptyList());
		if (rule == null) {
			return null;
		}
		rule.generateString(tm, null);
		return rule;
	}

	public String generateStringForGroup(String group, Object... parameters) {
		AbstractEcssXtendRule rule = tm.generateRule(null, group, Arrays.asList(parameters), Collections.emptyList());
		if (rule == null) {
			System.err.println("No rule found for " + Arrays.asList(parameters) + ", group " + group + "!");
			return "/*No rule found for " + Arrays.asList(parameters) + ", group " + group + "!*/";
		}
		return rule.getOrCreateString(tm, null);
	}

	public AbstractEcssXtendRule generateRuleForGroup(String group, Object... parameters) {
		AbstractEcssXtendRule rule = tm.generateRule(null, group, Arrays.asList(parameters), Collections.emptyList());
		if (rule != null) {
			rule.generateString(tm, null);
		}
		return rule;
	}

	public void addPropertyRule(SubSelector<? super CurrentRuleSelectionState> ss) {
		propertyRules.add(ss);
	}

	public TemplateManager getTemplateManager() {
		return tm;
	}

	public void know(TemplateDef td) {
		tm.know(td);
	}

	public void know(TemplateGenDef td) {
		tm.know(td);
	}

	public void know(TemplateRule td) {
		tm.know(td);
	}

	private Set<Resource> haveImported = new HashSet<Resource>();
//	private String styleName;

	public void read(Resource baseRes, Model m) {
		Config cfg = m.getConfig();
		if (cfg != null) {
			if (cfg.isHasMaxDegression()) {
				tm.setMaxDegression(cfg.getMaxDegression().doubleValue());
			}
			if (cfg.isHasMinImprovement()) {
				tm.setMinImprovement(cfg.getMinImprovement().doubleValue());
			}
			if (cfg.isHaxMaxThings()) {
				tm.setMaxThings(cfg.getMaxThings());
			}
		}
		for (Import imp : m.getImportStatement()) {
			URI uri = URI.createURI(imp.getName());
			if (uri.isRelative()) {
				uri = uri.resolve(baseRes.getURI());
			}
			try {
				Resource resource = baseRes.getResourceSet().getResource(uri, true);
				if (haveImported.add(resource)) {
					read(resource);
				}
			} catch (Exception e) {
				System.err.println("Could not resolve URI " + uri + " from import " + imp.getName() + " of resource "
						+ baseRes.getURI());
			}
		}
		for (TemplateDef td : m.getTemplateDefs()) {
			know(td);
		}
		for (TemplateGenDef tgd : m.getTemplateGenDefs()) {
			know(tgd);
		}
		for (TemplateRule tr : m.getTemplates()) {
			know(tr);
		}

		for (PropertyRule pr : m.getProperties()) {
			SubSelector<CurrentRuleSelectionState> ss = PropLangConverter.convert(pr);
			addPropertyRule(ss);
		}
	}

	public void read(Resource r) {
		//styleName = GrammarUtils.getStyleName(r.getURI().segment(r.getURI().segmentCount()-1));
		r.getContents().forEach(x -> {
			if (x instanceof Model) {
				read(r, (Model) x);
			}
		});
	}

	public static void main(String[] args) {

	}

	private boolean ensureAllUnique = true;

	private Map<String, AbstractEcssXtendRule> lowerByIdentificator = new HashMap<String, AbstractEcssXtendRule>();
	private Map<Identificator, AbstractEcssXtendRule> ruleByIdentificator = new HashMap<>();

	// A rule is dependent if it refers to another rule but does not include it
	// (i.e. that would be a reference)
	private Map<AbstractEcssXtendRule, Map<AbstractEcssXtendRule,Boolean>> dependentRules = new HashMap<>();

	public List<AbstractEcssXtendRule> getAllDependentRules(AbstractEcssXtendRule... roots) {
		Set<AbstractEcssXtendRule> ret = new HashSet<AbstractEcssXtendRule>();
		Set<AbstractEcssXtendRule> processed = new HashSet<AbstractEcssXtendRule>();		
		List<AbstractEcssXtendRule> retL = new ArrayList<AbstractEcssXtendRule>();
		Stack<AbstractEcssXtendRule> stack = new Stack<>();
		for (AbstractEcssXtendRule root : roots) {
			if (ret.add(root)) {
				stack.add(root);
				retL.add(root);
			}
		}
		while (!stack.isEmpty()) {
			Map<AbstractEcssXtendRule,Boolean> nextMap = dependentRules.getOrDefault(stack.pop(), Collections.emptyMap());
			for (Entry<AbstractEcssXtendRule,Boolean> entry : nextMap.entrySet()) {
				AbstractEcssXtendRule n = entry.getKey();
				boolean addReal = entry.getValue();
				if (addReal) {
					if (ret.add(n)) {
						retL.add(n);
					}
				}
				if (processed.add(n)) {
					stack.push(n);
				}
			}
		}
		return retL;
	}

	public void addCompoundDependentRule(AbstractEcssXtendRule parent, AbstractEcssXtendRule child) {
		dependentRules.computeIfAbsent(parent, x -> new HashMap<>()).putIfAbsent(child,false);
	}
	
	public String getChildIdentificator(AbstractEcssXtendRule parent, AbstractEcssXtendRule child) {
		dependentRules.computeIfAbsent(parent, x -> new HashMap<>()).put(child,true);
		// Generate child, just to be sure
		//Don't do it, it may give more problems 
		// child.getOrCreateString(getTemplateManager(), parent);
		child.initForGeneration(getTemplateManager(), parent);
		//TODO: ... what needs to be done?
		return child.getIdentificator().getSimpleName();
	}

	public Identificator getIdentificator(AbstractEcssXtendRule forRule) {
		String subName = forRule.getSubName();
		Identificator parent = null;
		if (forRule.getParentRule() != null) {
			parent = forRule.getParentRule().getIdentificator();
		}
		NameIdentificator ni = new NameIdentificator(parent, subName);
		if (ensureAllUnique ? lowerByIdentificator.containsKey(subName) : ruleByIdentificator.containsKey(ni)) {
			int subIndex = 2;
			for (;;) {
				String sndSubName = subName + "_" + subIndex;
				ni = new NameIdentificator(parent, sndSubName);
				if (!(ensureAllUnique ? lowerByIdentificator.containsKey(ni.getSimpleName())
						: ruleByIdentificator.containsKey(ni))) {
					break;
				}
				++subIndex;
			}
		}
		ruleByIdentificator.put(ni, forRule);
		lowerByIdentificator.put(ni.getSimpleName(), forRule);
		return ni;
	}

	// ----------- MOVED FROM GrammarCreator START ---------------
	public EClass getBestRootClass(List<EClass> possibleClasses) {
		Map<EClass, Set<EClass>> containedClasses = new HashMap<>();
		Map<EClass, Set<EClass>> subTypes = getSubtypes(possibleClasses);
		Map<EClass, Set<EClass>> superTypes = getSupertypes(possibleClasses);
		Set<EReference> containment = new HashSet<EReference>();
		for (EClass cl: possibleClasses) {
			for (EReference ref: cl.getEReferences()) {
				if (ref.isContainment()) {
					containment.add(ref);
				}
			}
			//Superclasses are 'containers' for this purpose
			for (EClass supCl: cl.getEAllSuperTypes()) {
				Set<EClass> cls = containedClasses.get(supCl);
				if (cls == null) {
					containedClasses.put(supCl, cls = new HashSet<EClass>());
				}
				cls.add(cl);
			}
		}
		for (EReference ref: containment) {
			EClass containing = ref.getEContainingClass();
			if (!(ref.getEType() instanceof EClass)) {
				System.err.println("Strange reference "+ref);
				continue;
			}
			EClass type = (EClass)ref.getEType();
			//All subclasses have this reference
			Collection<EClass> subContaining = subTypes.getOrDefault(containing, Collections.singleton(containing));
			//All subclasses can be referenced
			Collection<EClass> subContained = subTypes.getOrDefault(type, Collections.singleton(type));
			for (EClass subC: subContaining) {
				for (EClass subCont: subContained) {
					Set<EClass> cur = containedClasses.get(subC);
					if (cur == null) {
						containedClasses.put(subC, cur = new HashSet<EClass>());
					}
					cur.add(subCont);
				}
			}
		}

		//recursively calculate
		fixPoint(containedClasses);

		//A root class should contain as many other classes as possible (primary point)
		//and should be contained by as little other classes as possible (secondary point)
		int maxContains = -1;
		int minContained = Integer.MAX_VALUE;
		EClass rootClass = null;
		for (EClass ecl: possibleClasses) {
			containedClasses.putIfAbsent(ecl, new HashSet<>());
		}
		for (Entry<EClass, Set<EClass>> entr: containedClasses.entrySet()) {

			EClass possibleRoot = entr.getKey();
			int curContains = entr.getValue().size();
			if (curContains >= maxContains) {
				int curContained = 0;
				for (Set<EClass> cl: containedClasses.values()) {
					if (cl.contains(possibleRoot)) {
						++curContained;
					}
				}
				if (curContains > maxContains || curContained < minContained) {
					maxContains = curContains;
					minContained = curContained;
					rootClass = possibleRoot;
				}
			}
		}
		if (rootClass == null) {
			rootClass = EcoreFactory.eINSTANCE.createEClass();
			XMIResource fakeResource = new XMIResourceImpl();
			fakeResource.getContents().add(rootClass);
			rootClass.setName("PseudoTop");

//			List<EClass> subTypesN = new ArrayList<EClass>();

			// re-written for the use of Set instead of List as in GrammarCreator
			Set<EClass> subTypesN = new HashSet<EClass>();
			for (EClass cl: possibleClasses) {
				if (cl.getESuperTypes().isEmpty()) {
					subTypesN.add(cl);
					cl.getESuperTypes().add(rootClass);
				}
			}
			// ------------

			this.subClasses.put(rootClass, subTypesN);
		}
		return rootClass;
	}

	public static Map<EClass, Set<EClass>> getSubtypes(Collection<EClass> from) {
		Map<EClass, Set<EClass>> ret = new HashMap<EClass, Set<EClass>>();
		for (EClass f: from) {
			Set<EClass> cur = ret.get(f);
			if (cur == null) {
				ret.put(f, cur = new HashSet<EClass>());
			}
			cur.add(f);
			for (EClass superType: f.getEAllSuperTypes()) {
				Set<EClass> cur2 = ret.get(superType);
				if (cur2 == null) {
					ret.put(superType, cur2  = new HashSet<EClass>());
				}
				cur2.add(f);
			}
		}
		return ret;
	}


	public static<T> void fixPoint(Map<T, Set<T>> map) {
		boolean changed = false;
		do {
			changed = false;
			for (Entry<T,Set<T>> entr: map.entrySet()) {
				Set<T> add = new HashSet<>();
				for (T t: entr.getValue()) {
					Set<T> ref = map.getOrDefault(t, Collections.emptySet());
					add.addAll(ref);
				}
				if (entr.getValue().addAll(add)) {
					changed = true;
				}
			}
		} while (changed);
	}

	public static Map<EClass, Set<EClass>> getSupertypes(Collection<EClass> from) {
		Map<EClass, Set<EClass>> ret = new HashMap<EClass, Set<EClass>>();
		for (EClass f: from) {
			HashSet<EClass> cur = new HashSet<EClass>(f.getEAllSuperTypes());
			cur.add(f);
			ret.put(f, cur);
		}
		return ret;
	}
	// ----------- MOVED FROM GrammarCreator END ---------------

}
