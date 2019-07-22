package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.york.cs.ecss.language.ecssLanguage.*;
import uk.ac.york.cs.ecss.newproc.PropState.DynamicValuator;
import uk.ac.york.cs.ecss.newproc.PropState.PropertyStore;
import uk.ac.york.cs.ecss.newproc.ecore.OclEvaluator;
import uk.ac.york.cs.ecss.priority.rigen.SlotAssignmentProblem.Slot;
import util.NamedElement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;

public class PropLangConverter {

	public static void evaluate(double importance, List<PropertyValue> pvs, PropertyStore onStore, Object oclContext, double subWeight) {
		pvs = new ArrayList<>(pvs);
		pvs.replaceAll(x->EcoreUtil.copy(x));
		reduce(pvs,oclContext);
		//Jetzt habe ich nur noch Strings und doubles überall
		BigDecimal mainValue = null;
		String mainString = null;
		for (PropertyValue pv: pvs) {
			if (pv.getValueNumb() != null) {
				mainValue = pv.getValueNumb();
			} else if (pv.getValue() != null && pv.getArgument().isEmpty()) {
				mainString = pv.getValue();
			}
		}
		if (mainString != null && mainValue == null) {
			mainValue = BigDecimal.ONE;
		}
		if (mainValue != null) {
			onStore.addValue(importance, mainString, null, mainValue.doubleValue()*subWeight);
		}
		for (PropertyValue pv: pvs) {
			if (pv.getValue() != null && pv.getValue().startsWith("priority")) {
				if (pv.getArgument().size() == 1) {
					String key = pv.getValue().substring("priority".length());
					BigDecimal value = pv.getArgument().get(0).getValueNumb();
					if (value != null) {
						onStore.addValue(importance, mainString, key, value.doubleValue()*subWeight);
					}
				}
			}
		}
	}
	
	/**Evaluate OCL expressions*/
	private static void reduce(List<PropertyValue> pvs, Object oclContext) {
		for (int i = 0; i < pvs.size(); ++i) {
			PropertyValue pv = pvs.get(i);
			reduce(pv.getArgument(), oclContext);
			SpecificationCS spec = pv.getOclvalue();
			if (spec != null) {
				String oclExpr = spec.getOwnedExpression();
				Object result = OclEvaluator.evaluate(oclExpr, oclContext);
				if (result instanceof String) {
					pv.setValue((String)result);
				} else {
					pv.setValueNumb(BigDecimal.valueOf(object2Double(result)));
				}
			}
		}
	}
	
	public static SubSelector<CurrentRuleSelectionState> convert(PropertyRule rule) {
		Selector s = rule.getSelector();
		
		List<SubSingleSelector<CurrentRuleSelectionState>> subSelectors = new ArrayList<SubSingleSelector<CurrentRuleSelectionState>>();
		
		if (s != null) {
			for (SingleSelector ss: s.getSelectors()) {
				SubSingleSelector<CurrentRuleSelectionState> sss = convert(ss, CurrentRuleSelectionState.class);
				subSelectors.add(sss);
			}
		}
		
		SubPropertyRule propertyRule = new SubPropertyRule() {
			
			@Override
			public void modifyState(CurrentRuleSelectionState crss, ProcessingState state, double weight) {
				if (weight <= 0.0) {
					return;
				} 
				for (Property prop: rule.getProperty()) {
					
					SlotMatch sm = prop.getSlotMatch();
					TemplateMatch tm = prop.getTemplateMatch();
					double subWeight = weight;
					double subWeightF = subWeight;
					Condition con = prop.getCondition();
					String oclCond = null;
					if (con != null) {
						oclCond = con.getExpression().getOwnedExpression();
					}
					if (oclCond != null) {
						subWeight*= OclEvaluator.selectionValue(oclCond, crss);
					}
					int importance = subSelectors.size()+1;
		
					if (sm != null) {
						//SlotMatch
						SubSingleSelector<Object> valueSelector = convert(sm.getFirst(), Object.class);
						SubSingleSelector<Slot> slotSelector = convert(sm.getSecond(), Slot.class);
						BiConsumer<? super SlotMatchQualityEnv, ? super PropertyStore> consumers = (smqe,ps)->{
							evaluate(importance, prop.getValue(), ps, smqe, subWeightF);
						};
						SlotMatchSelector sms = new SlotMatchSelector(valueSelector, slotSelector, consumers );
						state.getPropState().addSlotMatchSelector(sms);
					} else if (tm != null) {
						//TemplateMatch
						BiConsumer<? super TemplateMatchQualityEnv, ? super PropertyStore> consumers = (smqe,ps)->{
							evaluate(importance, prop.getValue(), ps, smqe, subWeightF);
						};
						SubSingleSelector<? super AbstractEcssXtendRule> ruleSelector = convert(tm.getSelector(), AbstractEcssXtendRule.class);
						TemplateMatchSelector sms = new TemplateMatchSelector(ruleSelector, consumers);
						state.getPropState().addTemplateMatchSelector(sms );
					} else {
						//Normal
						String key = prop.getName();
						DynamicValuator valuator = new DynamicValuator() {
							
							@Override
							public void modify(CurrentRuleSelectionState state, PropertyStore store) {
								evaluate(importance, prop.getValue(), store, state, subWeightF);
							}
						};
						state.getPropState().addValuator(key, valuator );
					}
					
					
				}
			}
		};
		
		SubSelector<CurrentRuleSelectionState> ret = new SubSelector<CurrentRuleSelectionState>() {

			@Override
			public List<SubSingleSelector<CurrentRuleSelectionState>> getSubSelectors() {
				return subSelectors;
			}

			@Override
			public SubPropertyRule getPropertyRule() {
				return propertyRule;
			}
		};
		return ret;
	}

	private static<T> SubSingleSelector<T> convert(SingleSelector ss, Class<T> cl) {
		SubSingleSelector<T> ret = new SubSingleSelector<T>() {
			
			@Override
			public double getQuality(T state) {
				Condition condition = ss.getCondition();
				String oclString = null;
				if (condition != null) {
					SpecificationCS spec = condition.getExpression();
					oclString = spec.getOwnedExpression();
				}
				String name = ss.getReferredName();
				double ret = 1.0;
				if (name != null && !"*".equals(name)) {
					if (state instanceof CurrentRuleSelectionState) {
						
						CurrentRuleSelectionState crss = (CurrentRuleSelectionState)state;
						double mult = crss.getProcessingState().getValue(name, null); 
							if (crss.getRule() instanceof AbstractClassBasedXtendRule) {
								AbstractClassBasedXtendRule acbx = (AbstractClassBasedXtendRule)crss.getRule();
								EClass stateCl = acbx.loc_class;
								if (stateCl != null) {
									if (ss.isAndSubtypes()) {
										
									Map<String,Double> allNames = getAllSuperName((EClass)stateCl,1.0);
									mult = Math.max(mult, allNames.getOrDefault(name,0.0));
									} else {
										mult = Math.max(mult, Objects.equals(stateCl.getName(), name)?1.0:0.0);
									}
								}
							}
							if (crss.getRule() instanceof SingleAttributeXtendRule) {
								SingleAttributeXtendRule acbx = (SingleAttributeXtendRule)crss.getRule();
								EStructuralFeature ft = acbx.feature;
								if (ft != null) {
									mult = Math.max(mult, Objects.equals(ft.getName(), name)?1.0:0.0);
								}
							}
						ret*= mult;
						
					} else if (state instanceof PropState) {
						PropState ps = (PropState)state;
						ret*= ps.getValue(name, null);
					} else if (state instanceof NamedElement) {
						double mult = ((NamedElement)state).getName().equals(name)?1.0:0.0;
						if (ss.isAndSubtypes() && state instanceof EClass) {
							Map<String,Double> allNames = getAllSuperName((EClass)state,1.0);
							mult = Math.max(mult, allNames.getOrDefault(name,0.0));
						}
						ret*= mult;
					} else if (state instanceof ENamedElement) {
						double mult = ((ENamedElement)state).getName().equals(name)?1.0:0.0;
						if (ss.isAndSubtypes() && state instanceof EClass) {
							Map<String,Double> allNames = getAllSuperName((EClass)state,1.0);
							mult = Math.max(mult, allNames.getOrDefault(name,0.0));
						}
						ret*= mult;
					} 
				}
				if (ret > 0.0 && oclString != null) {
					ret*= OclEvaluator.selectionValue(oclString, state);
				}
				return ret;
			}
			
			private void augmentAllSuperNames(EClass cl, Map<String,Double> names, double val) {
				if (names.getOrDefault(cl.getName(),0.0) < val) {
					names.put(cl.getName(), val);
					for (EClass scl: cl.getESuperTypes()) {
						//TODO: Why 0.9??
						augmentAllSuperNames(scl, names, val*0.9);
					}
				}
			}

			private Map<String,Double> getAllSuperName(EClass state, double initV) {
				Map<String,Double> ret  =new HashMap<>();
				augmentAllSuperNames(state, ret, initV);
				return ret;
			}
		};
		return ret;
	}

	// ----------- MOVED FROM PrioritySource START ---------------
	public static Double object2Double(Object result) {
		if (result instanceof Boolean) {
			return ((Boolean)result)?1.0:0.0;
		} else if (result instanceof Double) {
			return Math.max(0.0, (Double)result);
		} else {
			return 0.0;
		}
	}
	// ----------- MOVED FROM PrioritySource END ---------------
}
