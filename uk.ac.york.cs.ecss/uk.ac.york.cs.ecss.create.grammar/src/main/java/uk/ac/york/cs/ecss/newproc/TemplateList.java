package uk.ac.york.cs.ecss.newproc;

import java.util.*;
import java.util.Map.Entry;


public class TemplateList {
	
	private List<TemplateCreator<? extends AbstractEcssXtendRule>> ruleGroup = new ArrayList<>();
	
	public class ConcreteTemplatePossibilities {
		private List<AbstractEcssXtendRule> rules = new ArrayList<AbstractEcssXtendRule>();
		private List<AbstractEcssXtendRule> specialRules = new ArrayList<AbstractEcssXtendRule>();
		AbstractEcssXtendRule parent;
		double minImprovement;
		int maxRulesPerOption;
		double maxDecrement;
		
		public ConcreteTemplatePossibilities(AbstractEcssXtendRule parent, List<Object> parameters) {
			Object[] inputParArray = parameters.toArray();
			//TODO: there should be better ways ...
			for (TemplateCreator<? extends AbstractEcssXtendRule> cl: ruleGroup) {
				rules.addAll(cl.create(inputParArray));
			}	
		}
		
		public AbstractEcssXtendRule getBestRule(Collection<? extends TemplateMatchSelector> selectors) {
			//TODO: Should this maybe also include things like add/avoid like the other properties?
			Map<AbstractEcssXtendRule, Double> ret = new HashMap<>();
			Map<AbstractEcssXtendRule, Double> specialRet = new HashMap<>();
			AbstractEcssXtendRule bestRule = null;
			double best = Double.NEGATIVE_INFINITY; //Always try to choose one, even if really bad
			
			
			//First evaluate special rules
			for (TemplateMatchSelector tms: selectors) {
				for (AbstractEcssXtendRule rule: specialRules) {
					double quality = tms.getQuality(parent,rule);
					//However, we want that these rules are at least minImprovement better (or even more, if we are beyond the boundary)
					quality+= specialRules.size()>=maxRulesPerOption?maxDecrement:minImprovement;
					specialRet.merge(rule, quality, (x,y)->Math.max(x,y));
				}
			}
			
			if (selectors.isEmpty()) {
				//Take any
				if (!specialRules.isEmpty()) {
					bestRule = specialRules.iterator().next();
				} else if (!rules.isEmpty()) {
					bestRule = rules.iterator().next();
				}
			}
			for (TemplateMatchSelector tms: selectors) {
				for (AbstractEcssXtendRule rule: rules) {
					double quality = tms.getQuality(parent,rule);
					ret.merge(rule, quality, (x,y)->Math.max(x,y));
				}
			}
			for (Entry<AbstractEcssXtendRule,Double> entr: specialRet.entrySet()) {
				if (entr.getValue() > best) {
					bestRule = entr.getKey();
					best = entr.getValue();
				}
			}
			for (Entry<AbstractEcssXtendRule,Double> entr: ret.entrySet()) {
				if (entr.getValue() > best) {
					bestRule = entr.getKey();
					best = entr.getValue();
				}
			}
			return bestRule;
			
		}
		
		public List<AbstractEcssXtendRule> getPossibilities() {
			return rules;
		}

		/**It is not possible to use multiple different minImprovements etc. for different rule sets*/
		public void addSpecialRules(List<AbstractEcssXtendRule> curRules, double minImprovement, int maxRulesPerOption,
				double maxDecrement) {
			this.minImprovement = minImprovement;
			this.maxRulesPerOption = maxRulesPerOption;
			this.maxDecrement = maxDecrement;
			this.specialRules.addAll(curRules);
		}
	}
	
	public ConcreteTemplatePossibilities instanciatePossible(AbstractEcssXtendRule parent, List<Object> parameters) {
		return new ConcreteTemplatePossibilities(parent,parameters);
	}

	public void addTemplate(TemplateCreator<? extends AbstractEcssXtendRule> cl) {
		ruleGroup.add(cl);
	}
	
	public void addTemplate(Class<? extends AbstractEcssXtendRule> cl) {
		ruleGroup.add(TemplateCreator.createClassTC(cl));
	}


	public boolean isEmpty() {
		return ruleGroup.isEmpty();
	}

}