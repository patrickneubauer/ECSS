package uk.ac.york.cs.ecss.migrated;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.CharacterRange;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import uk.ac.york.cs.ecss.migrated.KeywordConfig.SparseInfo;
import weka.core.Attribute;
import weka.core.EuclideanDistance;
import weka.core.Instance;
import weka.core.Instances;


public class KeywordRelation extends AbstractRelation {

	private static final Logger logger = LogManager.getLogger(KeywordRelation.class);
	
	public static void getKeywordMap(Grammar g, Map<String,Double> map, KeywordConfig config) {
		for (EObject eobj: (Iterable<EObject>)(()->g.eAllContents())) {
			if (eobj instanceof Keyword) {
				Keyword kw = (Keyword)eobj;
				String val = getValue(kw,config);
				map.put(val, map.getOrDefault(val, 0.0)+1);
			}
		}
	}
	
	public int getAttributeNums() {
		//Initialize nameSet if necessary
		getMatrix();
		return keywordConfig.getNameSet().size();
	}
	
	public Set<String> getAttributeNames() {
		//Initialize nameSet if necessary
		getMatrix();
		return keywordConfig.getNameSet();
	}
	
	public static String getValue(Keyword kw, KeywordConfig cfg) {
		String ret = kw.getValue();
		if (ret != null) {
			if (cfg.lowercaseTerminal) {
				ret = ret.toLowerCase();
			}
		}
		return ret;
	}

	
	public String getNormalizedString(EObject rule, KeywordConfig config) {
		ICompositeNode node = NodeModelUtils.getNode(rule);
		if (node == null) {
			logger.error("Can't get text for rule "+rule);
		} else {
			String tokenText = NodeModelUtils.getTokenText(node);
			if (tokenText != null) {
				if (config.ignoreRuleSpecial || config.ignoreRuleReturnType) {
					String[] parts = tokenText.split("\\:",2);
					parts[0] = parts[0].split("\\s",2)[0];
					if (parts.length > 1) {
						parts[1] = parts[1].trim();
						if (parts[1].startsWith("{")) {
							int firstInd = parts[1].indexOf('}');
							if (firstInd != -1) {
								parts[1] = parts[1].substring(firstInd+1);
							}
						}
						tokenText=parts[0]+":"+parts[1];
					} else {
						tokenText=parts[0];
					}
				}
				String normalizedText = RuleNormalize.normalizeString(tokenText, config.normalizeTerminals);
				logger.debug("Normalized "+tokenText+" to "+normalizedText);
				return normalizedText;
			} else {
				logger.error("Null token text for "+node+"!");
			}
		}
		return null;
	}
	
	public void traverseRule(Grammar myGrammar, AbstractRule rule, Map<AbstractRule, Double> ruleWeight, Map<AbstractRule, Map<String,Double>> ruleOccurrence,
			Map<AbstractRule, String> ruleNormalizedString,
			KeywordConfig config, double curWeight) {
		if (rule == null) {
			return;
		}
		if (ruleOccurrence.containsKey(rule)) {
			return;
		}
		if (config.useAbstractRules) {
			String normalized = getNormalizedString(rule,config);
			if (normalized != null) {
				ruleNormalizedString.put(rule, normalized);
			}
		}
		Map<String,Double> myMap = new HashMap<String, Double>();
		ruleOccurrence.put(rule, myMap);
		for (EObject eobj: ((Iterable<EObject>)()->rule.eAllContents())) {
			boolean excludeTerminal = config.excludeComplexTerminal && (rule instanceof TerminalRule);
			EObject cont = eobj;
			boolean realExclude = false;
			double supWeight = curWeight;
			while (cont != null && !(cont instanceof AbstractRule)) {
				if (cont instanceof org.eclipse.xtext.AbstractElement) {
					String card = ((org.eclipse.xtext.AbstractElement)cont).getCardinality();
					if ("*".equals(card) || "+".equals(card)) {
						realExclude = true;
					}
					if ("*".equals(card)) {
						supWeight*= config.starFactor;
					} else if ("+".equals(card)) {
						supWeight*= config.plusFactor;
					} else if ("?".equals(card)) {
						supWeight*= config.optionalFactor;
					}
				}
				if (cont instanceof CharacterRange) {
					realExclude = true;
				}
				cont = cont.eContainer();
			}
			excludeTerminal&=realExclude;
			if (excludeTerminal) {
				continue;
			}
			if (eobj instanceof Keyword) {
				if (config.useKeywords) {
					//TODO: ...
					Keyword kw = (Keyword)eobj;
					String val = getValue(kw,config);
					boolean alphanumerical = true;
					for (int i = 0; i < val.length(); ++i) {
						char c = val.charAt(i);
						if (!RuleNormalize.isLetterAllowed(c)) {
							alphanumerical = false;
							break;
						}
					}
					if (config.excludeAlphanumericalKeyword && alphanumerical) {
						//Exclude keyword
					} else {
						myMap.put(val, myMap.getOrDefault(val, 0.0)+supWeight);
					}
				}
			} else if (eobj instanceof RuleCall) {
				RuleCall rc = (RuleCall)eobj;
				AbstractRule ac = rc.getRule();
				if (ac == null) {
					continue;
				}
				Grammar g = null;
				EObject accont = ac;
				while (accont != null) {
					if (accont instanceof Grammar) {
						g = (Grammar)accont;
						break;
					}
					accont = accont.eContainer();
				}
				if (!config.traverseImported && !Objects.equals(accont, myGrammar)) {
					continue;
				}
				ruleWeight.put(rc.getRule(), ruleWeight.getOrDefault(rc.getRule(),0.0)+supWeight);
				if (realExclude && rc.getRule() instanceof TerminalRule) {
					continue;
				}
				traverseRule(myGrammar,rc.getRule(), ruleWeight, ruleOccurrence, ruleNormalizedString, config, supWeight);
			}
		}
	}
	
	
	public Map<String,Double>[] getFeatureMaps(Resource res, KeywordConfig config) {
		Map<String,Double> keywordMap = new HashMap<>();
		Map<String,Double> ruleMap = new HashMap<>();
		
		if (config.traverseRoot) {
			AbstractRule rootRule = null;
			Grammar myGr = null;
			for (EObject eobj: res.getContents()) {
				if (eobj instanceof Grammar) {
					Grammar g = (Grammar)eobj;
					if (g.getRules().size() > 0) {
						myGr = g;
						rootRule = g.getRules().get(0);
						break;
					}
				}
			}
			if (rootRule != null) {
				Map<AbstractRule,Double> ruleWeight = new HashMap<AbstractRule, Double>();
				Map<AbstractRule,String> ruleNormalizedString = new HashMap<>();
				Map<AbstractRule,Map<String,Double>> ruleOccurrence = new HashMap<AbstractRule, Map<String,Double>>();
				ruleWeight.put(rootRule, 1.0);
				//TODO: NYI
				traverseRule(myGr, rootRule, ruleWeight, ruleOccurrence, ruleNormalizedString,  config, 1.0);
				for (Entry<AbstractRule,Map<String,Double>> entr: ruleOccurrence.entrySet()) {
					double weight = ruleWeight.getOrDefault(entr.getKey(), 1.0);
					for (Entry<String,Double> toAdd: entr.getValue().entrySet()) {
						keywordMap.put(toAdd.getKey(), keywordMap.getOrDefault(toAdd.getKey(), 0.0)+weight*toAdd.getValue());
					}
				}
				for (Entry<AbstractRule,String> entr: ruleNormalizedString.entrySet()) {
					double weight = ruleWeight.getOrDefault(entr.getKey(), 1.0);
					ruleMap.put(entr.getValue(), ruleMap.getOrDefault(entr.getValue(), 0.0)+weight);
				}
			}
		} else {
			//TODO: Only use used rules
			Set<Grammar> allGrammars = new HashSet<Grammar>();
			Stack<Grammar> processGrammar = new Stack<>();
			for (EObject eobj: res.getContents()) {
				if (eobj instanceof Grammar) {
					Grammar g = (Grammar)eobj;
					if (allGrammars.add(g)) {
						processGrammar.add(g);
					}
				}
			}
			while (!processGrammar.isEmpty()) {
				Grammar cur = processGrammar.pop();
				for (Grammar used: cur.getUsedGrammars()) {
					if (config.traverseImported && allGrammars.add(used)) {
						processGrammar.add(used);
					}
				}
			}
			for (Grammar g: allGrammars) {
				if (config.useKeywords) {
					getKeywordMap(g, keywordMap, config);
				}
				if (config.useAbstractRules) {
					for (AbstractRule rule: g.getRules()) {						
						String normalized = getNormalizedString(rule,config);
						if (normalized != null) {
							ruleMap.put(normalized, ruleMap.getOrDefault(normalized, 0.0)+1.0);
						}
					}
				}
			}
		}
		return new Map[]{keywordMap,ruleMap};
	}
	
	public KeywordRelation(String reportFile, List<Resource> resources, ResourceSet resourceSet, KeywordConfig config) {
		super(reportFile);
		this.keywordConfig.setFrom(config);
		for (Resource r: resources) {
			keywordConfig.getResources().add(r);
		}
		initNameListWithResources();
	}
	
	public KeywordRelation(String reportFile, ResourceSet resourceSet, ArrayList<ClassInstance> classInstances, File[] files, 
			KeywordConfig config) {
		super(reportFile);
		//String reportFile, String matrixFile, ResourceSet resourceSet, ArrayList<ClassInstance> classInstances, File[] files, Resource ecssalModelResource, Root ecssalRoot
		//this(reportFile, resourceSet, classInstances, files, ecssalModelResource, ecssalRoot);
		
		this.keywordConfig = config; // otherwise only "normalizeVectors" is used (see below)
		
		//this.files = files;
		this.keywordConfig.setNormalizeVectors(config.normalizeVectors);
		this.keywordConfig.setFrom(config);
		logger.info("Calculating relation distances ...");

		this.keywordConfig.setFiles(files);
		//this.resourceSet = resourceSet;
		//Directly get file because needed
		for (int i = 0; i < files.length; ++i) {
			File file = files[i];
			List<File> curList = keywordConfig.getFilesWithLength().get(file.length());
			//Skip file if already equal exists
			boolean skip = false;
			if (curList != null) {
				for (File current: curList) {
					try {
						if (FileUtils.contentEquals(current, file)) {
							skip = true;
							break;
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} else {
				curList = new ArrayList<File>();
				keywordConfig.getFilesWithLength().put(file.length(), curList);
			}
			if (skip) {
				continue;
			}
			curList.add(file);
			
			try {
				//Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath().toString()), true);
				//Initialize loading - maybe helps - at least it might weed out some resources??
				/*Injector inj = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
				
				XtextResourceSet xtextResourceSet = inj.getInstance(XtextResourceSet.class);
				Resource xtextMetamodelResource = xtextResourceSet.getResource(URI.createFileURI(SimpleXtextClusterGenerator.XTEXT_METAMODEL_FILE_LOCATION), true);
				
			    try {
			    		xtextMetamodelResource.load(null);
			    } catch (IOException e) {
				}
//				Resource xtextMetamodelResource = xtextResourceSet.getResource(URI.createFileURI("resources/Xtext.ecore"), true);*/
				
				Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath().toString()), true);
			    try {
			    	resource.load(null);
			    	
			    } catch (IOException e) {
					e.printStackTrace();
				}	
			    resource.getContents();
				keywordConfig.getResources().add(resource);
//				logger.info(keywordConfig.getFilesList().size()+":"+file.getAbsolutePath());
				keywordConfig.getFilesList().add(file);
				if (keywordConfig.getFilesList().size()%NUMBER_OF_RESOURCES_LOADED_STATUS_UPDATE == 0) {
					logger.info("Loaded " + keywordConfig.getFilesList().size()+"/"+(files.length-(i-keywordConfig.getFilesList().size()-1))+" files ...");
				}
			} catch (Exception e) {
				logger.error("Could not load resource "+file);
			}
		}
		//I guess you need to do it?
		initNameList();
		
	}
	
	private Map<String,String> filenameToNormalizedName = new HashMap<>();

	
	private void initNameList() {
		filenameToNormalizedName = new HashMap<>();
		keywordConfig.setNames(new ArrayList<String>());
		int i = 0;
		for (File file: keywordConfig.getFilesList()) {
			String fn = file.getName().replaceFirst("[.][^.]+$", "");
			while (keywordConfig.getNames().contains(fn)) {
				fn = fn+"_";
			}
			filenameToNormalizedName.put(file.getName(), fn);
			keywordConfig.getNames().add(fn);
			Resource r = keywordConfig.getResources().get(i);
			
			Map<String,Double>[] curMaps = getFeatureMaps(r,keywordConfig);
//			if ( !keywordConfig.microPatternGroupNames.isEmpty() ) {
//				curMaps = Arrays.copyOf(curMaps, curMaps.length+1);
//				AnalysisElement el = EcssalHelper.obtainAnalysisElement(keywordConfig.getEcssalRoot(), file);
//				if (el == null) {
//					logger.error("Could not retrieve anaylsis element for "+file.getAbsolutePath()+"!");
//				} else {
//					keywordConfig.getAnalysisElements().put(fn, el);
//					curMaps[curMaps.length-1] = getMicropatternMap(el,keywordConfig);
//				}
//			}
			keywordConfig.getPreMatrix().put(fn, curMaps);
			++i;
		}
	}
	
	private void initNameListWithResources() {
		filenameToNormalizedName = new HashMap<>();
		keywordConfig.setNames(new ArrayList<String>());
		int i = 0;
		for (Resource r: keywordConfig.getResources()) {
			URI uri = r.getURI();
			File file = new File(uri.toFileString());
			String fn = file.getName().replaceFirst("[.][^.]+$", "");
			if (i > 0) {
				fn = fn+i;
			}
			while (keywordConfig.getNames().contains(fn)) {
				fn = fn+"_";
			}
			if (i > 0) {
				filenameToNormalizedName.put(file.getName()+i, fn);
			} else {
				filenameToNormalizedName.put(file.getName(), fn);
			}
			keywordConfig.getNames().add(fn);
			
			Map<String,Double>[] curMaps = getFeatureMaps(r,keywordConfig);
//			if ( !keywordConfig.microPatternGroupNames.isEmpty() ) {
//				curMaps = Arrays.copyOf(curMaps, curMaps.length+1);
//				AnalysisElement el = EcssalHelper.obtainAnalysisElement(keywordConfig.getEcssalRoot(), file);
//				if (el == null) {
//					logger.error("Could not retrieve anaylsis element for "+file.getAbsolutePath()+"!");
//				} else {
//					keywordConfig.getAnalysisElements().put(fn, el);
//					curMaps[curMaps.length-1] = getMicropatternMap(el,keywordConfig);
//				}
//			}
			keywordConfig.getPreMatrix().put(fn, curMaps);
			++i;
		}
	}
	
	@Override
	public void process() {
		
	}
	
	public void clear() {
	}
	
	public static int[] mergeArrays(int[]... matrix) {
		int retSize = 0;
		for (int[] m: matrix) {
			retSize+= m.length;
		}
		int[] ret = new int[retSize];
		int curOffset = 0;
		for (int[] vec: matrix) {
			for (int i = 0; i < vec.length; ++i) {
				ret[curOffset+i] = vec[i];
			}
			curOffset+= vec.length;
		}
		return ret;
	}
	
	public static double[] mergeArrays(double[]... matrix) {
		int retSize = 0;
		for (double[] m: matrix) {
			retSize+= m.length;
		}
		double[] ret = new double[retSize];
		int curOffset = 0;
		for (double[] vec: matrix) {
			for (int i = 0; i < vec.length; ++i) {
				ret[curOffset+i] = vec[i];
			}
			curOffset+= vec.length;
		}
		return ret;
	}
 
	public Map<String,SparseInfo> getMatrix() {
		if (keywordConfig.getMatrix() == null || keywordConfig.getMatrix().size() != keywordConfig.getPreMatrix().size()) {
			//Recalc
			attributes = new ArrayList<Attribute>();
			keywordConfig.setMatrix(new HashMap<>(keywordConfig.getPreMatrix().size()*4));
			
			keywordConfig.setNameSet(new TreeSet<String>());
			int indexOffset = 0;
			int endIndex = 2;
			for (int mapIndex = 0; mapIndex < endIndex; ++mapIndex) {
				Set<String> allStrings = new HashSet<String>();
				for (Map<String,Double>[] map: keywordConfig.getPreMatrix().values())  {
					endIndex = Math.max(endIndex, map.length);
					allStrings.addAll(map[mapIndex].keySet());
				}
				Set<String> subNameSet = new TreeSet<String>(allStrings);
				Map<String,Integer> index = new HashMap<String, Integer>();
				{
					int i = 0;
					for (String str: subNameSet) {
						index.put(str, i);
						keywordConfig.getNameSet().add(mapIndex+""+str);
						attributes.add(new Attribute(mapIndex+" "+str));
						++i;
					}
				}
				for (Entry<String,Map<String,Double>[]> entr: keywordConfig.getPreMatrix().entrySet()) {
					String name = entr.getKey();
					Map<String,Double> val = entr.getValue()[mapIndex];
					List<Object[]> intVals = new ArrayList<>();
					;
					for (Entry<String,Double> sentr: val.entrySet()) {
						intVals.add(new Object[]{index.get(sentr.getKey()),sentr.getValue()});
					}
					Collections.sort(intVals, (x,y)->Integer.compare((Integer)x[0], (Integer)y[0]));
					int[] indices = new int[intVals.size()];
					double[] values = new double[intVals.size()];
					for (int i = 0; i < intVals.size(); ++i) {
						indices[i] = (Integer)intVals.get(i)[0]+indexOffset;
						values[i] = (Double)intVals.get(i)[1];
					}
					if (keywordConfig.isNormalizeVectors()) {
						double length = 0.0;
						for (int i = 0; i < values.length; ++i) {
							length+= values[i]*values[i];
						}
						length = Math.sqrt(length);
						if (length > 0) {
							for (int i = 0; i < values.length; ++i) {
								values[i]/=length;
							}
						}
					}
					KeywordConfig.SparseInfo sparseInfo = keywordConfig.getMatrix().get(name);
					if (sparseInfo == null) {
						sparseInfo = new KeywordConfig.SparseInfo(indices, values);
						keywordConfig.getMatrix().put(name, sparseInfo);
					} else {
						sparseInfo.indices = mergeArrays(sparseInfo.indices, indices);
						sparseInfo.values = mergeArrays(sparseInfo.values, values);
					}
				}
				indexOffset+= index.size();
			}
		} 
		return keywordConfig.getMatrix();
	}

	public List<String> getNames() {
		return keywordConfig.getNames();
	}

	protected KeywordConfig keywordConfig = new KeywordConfig(new HashMap<String, KeywordConfig.SparseInfo>(), new HashMap<>(),
			new TreeSet<String>(), new ArrayList(), new ArrayList<Resource>(), new ArrayList<CompletableFuture<DistanceCalculator>>(), new HashMap<Long, List<File>>(), System.currentTimeMillis());

	private ArrayList<Attribute> attributes;
	
	private Instances instances;
	private EuclideanDistance distance;
	private Map<String,Instance> haveInstances;
	
	public void notifyProcessInfo(Instances instances, EuclideanDistance distance, Map<String,Instance> haveInstances) {
		this.instances = instances;
		this.distance = distance;
		this.haveInstances = haveInstances;
	}
	
	@Override
	public double getMatrixDistance(String from, String to) {
		String normalizedFrom = filenameToNormalizedName.get(from);
		String normalizedTo = filenameToNormalizedName.get(to);
		if (normalizedFrom == null || normalizedTo == null || normalizedFrom.isEmpty() || normalizedTo.isEmpty()) {
			return Double.NaN;
		}
		/*SparseInfo fromSi = getMatrix().get(normalizedFrom);
		SparseInfo toSi = getMatrix().get(normalizedTo);
		if (fromSi == null || fromSi.values.length == 0 || toSi == null || toSi.values.length == 0) {
			return Double.NaN;
		}*/
		Instance fromInstance = haveInstances.get(normalizedFrom);//new SparseInstance(1.0, fromSi.values, fromSi.indices, fromSi.indices.length);
		Instance toInstance = haveInstances.get(normalizedTo); //new SparseInstance(1.0, toSi.values, toSi.indices, toSi.indices.length);
		if (fromInstance == null || toInstance == null) {
			return Double.NaN;
		}
		double ret = distance.distance(fromInstance, toInstance);
		return ret;
	}
	

}