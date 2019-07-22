package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.common.util.EList;
import uk.ac.york.cs.ecss.language.ecssLanguage.*;
import uk.ac.york.cs.ecss.newproc.TemplateList.ConcreteTemplatePossibilities;

import java.util.*;

public class TemplateManager {

	private TemplateList allTemplates = new TemplateList();
	private CompleteManager completeManager;
	private Map<String, TemplateList> templatesForGroup = new HashMap<>();
	
	private int maxRulesPerOption = 5;
	private double maxDecrement = 1.0;
	private double minImprovement = 0.0;
	
	private Map<TemplateDef, Class<? extends AbstractEcssXtendRule>> knownTemplates = new HashMap<>();
	private Map<TemplateGenDef, Class<? extends AbstractXtendRuleGenerator>> knownTemplateGens = new HashMap<>();
	private Map<TemplateRule, Class<? extends AbstractEcssXtendRule>> knownTemplateRules = new HashMap<>();
	
	private Map<String, Class<?>> predefinedTypeNames = new HashMap<>();
	{
		predefinedTypeNames.put("String", String.class);
		predefinedTypeNames.put("bool", boolean.class);
		predefinedTypeNames.put("int", int.class);
		predefinedTypeNames.put("double", double.class);
	}

	
	
	public Class<?> getClassOrNull(String name) {
		try {
			return predefinedTypeNames.computeIfAbsent(name,nm->{
				try {
					return Class.forName(nm);
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					System.err.println("Could not retrieve class "+nm+": "+e.getMessage());
					return null;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Could not retrieve class "+name+": "+e.getMessage());
			return null;
		}
	}
	
	public Class<? extends AbstractEcssXtendRule> know(TemplateDef def) {
		Class<?> cl = getClassOrNull(def.getJavaClass());
		if (cl != null && AbstractEcssXtendRule.class.isAssignableFrom(cl)) {
			asssociateTemplate(def, (Class)cl);
			return (Class)cl;
		} else {
			System.err.println("Could not associate template def class "+def.getName()+" -> "+def.getJavaClass());
			return null;
		}
	}
	

	public void know(TemplateRule td) {
		getXtendRule(td);
	}
	
	public Class<? extends AbstractXtendRuleGenerator> know(TemplateGenDef tgd) {
		Class<?> cl = tgd.getJavaClass()==null?CompilingRuleGenerator.class:getClassOrNull(tgd.getJavaClass());
		if (cl != null && AbstractXtendRuleGenerator.class.isAssignableFrom(cl)) {
			asssociateTemplateGen(tgd, (Class)cl);
			return (Class)cl;
		} else {
			System.err.println("Could not associate template gen class "+tgd.getName()+" -> "+tgd.getJavaClass());
			return null;
		}
	}
	
	public Class<? extends AbstractEcssXtendRule> getClass(TemplateDef forDef) {
		return knownTemplates.computeIfAbsent(forDef, x->know(x));
	}
	
	public Class<? extends AbstractXtendRuleGenerator> getClass(TemplateGenDef forDef) {
		return knownTemplateGens.computeIfAbsent(forDef, x->know(x));
	}
	
	public void asssociateTemplate(TemplateDef def, Class<? extends AbstractEcssXtendRule> cl) {
		knownTemplates.put(def, cl);
	}

	public void asssociateTemplateGen(TemplateGenDef def, Class<? extends AbstractXtendRuleGenerator> cl) {
		knownTemplateGens.put(def, cl);
	}
	
	private Map<TemplateRule, Class<? extends AbstractEcssXtendRule>> generatedTemplates = new HashMap<>();
	private Map<String, Class<?>> usedNames = new HashMap<>();
	
	public Class<? extends AbstractEcssXtendRule> getXtendRule(TemplateRule r) {
		return generatedTemplates.computeIfAbsent(r, (tr)->{
			Class<? extends AbstractEcssXtendRule> cl = null;
			EList<String> groups = tr.getGroups();
			String name = tr.getName();
			if (tr instanceof BasicTemplateRule) {
				BasicTemplateRule btr = (BasicTemplateRule)tr;
				TemplateDef td = btr.getType();
				cl = getClass(td);
			} else if (tr instanceof TemplateGeneratorRule) {
				TemplateGeneratorRule tgr = (TemplateGeneratorRule)tr;
				TemplateGenDef tgd = tgr.getType();
				Class<? extends AbstractXtendRuleGenerator> gencl = getClass(tgd);
				String className = "?"+name;
				try {
					AbstractXtendRuleGenerator gen = gencl.newInstance();
					className = getNewName(name);
					cl = gen.generate(this, tgr, className);
				} catch (Exception e) {
					e.printStackTrace();
					System.err.println("Generators must have an empty constructor!");
					System.err.println("Error in class "+gencl.getName()+"::"+className);
				}
			} else {
				System.err.println("Unimplemented rule type: "+tr);
			}
			if (cl != null) { 
				addTemplate(cl, groups.toArray(new String[]{}));
			}
			return cl;
		});
	}
	
	public String getNewName(String baseName) {
		Class<?> cur = usedNames.get(baseName);
		if (cur != null) { 
			//You need another one
			int ind = 2;
			for(;;) {
				String newName = baseName+"_"+ind;
				if (!usedNames.containsKey(newName)) {
					return newName;
				}
				++ind;
			}
		}
		return baseName;
	}
	
	
	public TemplateManager(CompleteManager cm) {
		this.completeManager = cm;
	}
	
	/**A group name can also be the template's name itself*/
	public void addTemplate(Class<? extends AbstractEcssXtendRule> cl, String... groupNames) {
		addTemplate(TemplateCreator.createClassTC(cl), groupNames);
	}
	
	public void addTemplate(TemplateCreator<? extends AbstractEcssXtendRule> cl, String... groupNames) {
		allTemplates.addTemplate(cl);
		for (String gn: groupNames) {
			getTemplateList(gn).addTemplate(cl);
		}
	}
	
	public TemplateList getTemplateList(String groupName) {
		return templatesForGroup.computeIfAbsent(groupName, x->new TemplateList());
	}
	
	private Map<String, Map<List<Object>, List<AbstractEcssXtendRule>>> usedRules = new HashMap<String, Map<List<Object>,List<AbstractEcssXtendRule>>>();
	
	public void putRule(String groupName, List<Object> parameters, AbstractEcssXtendRule newRule) {
		getRules(groupName,parameters).add(newRule);
	}
	
	public List<AbstractEcssXtendRule> getRules(String groupName, List<Object> parameters) {
		return usedRules.computeIfAbsent(groupName, x->new HashMap<>()).computeIfAbsent(parameters, x->new ArrayList<>());
	}
	
	public AbstractEcssXtendRule generateRule(AbstractEcssXtendRule parent, String groupName, List<Object> parameters, Collection<? extends TemplateMatchSelector> selectors) {
		TemplateList list = allTemplates;
		TemplateList subList = templatesForGroup.get(groupName);
		if (subList != null && !subList.isEmpty()) {
			list = subList;
		}
		ConcreteTemplatePossibilities possibilities = list.instanciatePossible(parent, parameters);
		List<AbstractEcssXtendRule> curRules = getRules(groupName, parameters);
		if (!curRules.isEmpty()) {
			possibilities.addSpecialRules(curRules, minImprovement, maxRulesPerOption, maxDecrement);
		}
		AbstractEcssXtendRule ret = possibilities.getBestRule(selectors);
		if (!curRules.contains(ret)) {
			curRules.add(ret);
		}
		return ret;
	}

	public CompleteManager getCompleteManager() {
		return completeManager;
	}

	public void setMaxDegression(double doubleValue) {
		this.maxDecrement = doubleValue;
	}

	public void setMaxThings(int doubleValue) {
		this.maxRulesPerOption = doubleValue;
	}
	

	public void setMinImprovement(double doubleValue) {
		this.minImprovement = doubleValue;
	}
	/*
	private List<Runnable> postProcessings = new ArrayList<Runnable>();

	public void addPostProcessings(List<Runnable> postProcessings) {
		this.postProcessings.addAll(postProcessings);
	}
	
	public void afterGenerating() {
		while (!postProcessings.isEmpty()) {
			new ArrayList<>(postProcessings).forEach(x->x.run());
		}
	}*/

	private List<AbstractEcssXtendRule> rules = new ArrayList<AbstractEcssXtendRule>();
	
	public void register(AbstractEcssXtendRule abstractEcssXtendRule) {
		rules.add(abstractEcssXtendRule);
	}
	
	public void afterGenerating() {
		for (AbstractEcssXtendRule ar: new ArrayList<>(rules)) {
			ar.getString();
		}
	}
	
}
