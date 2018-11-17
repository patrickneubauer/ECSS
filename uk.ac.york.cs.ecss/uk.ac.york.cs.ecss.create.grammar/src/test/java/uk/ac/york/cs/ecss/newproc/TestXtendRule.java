package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.*;
import uk.ac.york.cs.ecss.newproc.PropState.DynamicValuator;
import uk.ac.york.cs.ecss.newproc.PropState.PropertyStore;
import uk.ac.york.cs.ecss.priority.rigen.SlotAssignmentProblem.Slot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestXtendRule extends AbstractEcssXtendRule {
	
	
	private EClass loc_class;
	private String val_a;
	private List<String> loc_slotValues = new ArrayList<>();
	private SlotContainer slot_name;
	private SlotContainer slotm_other;
	private SlotContainer[] allSlots;
	private List<EStructuralFeature> loc_features;

	private static class SelectNameSelector implements SubSingleSelector<Slot> {

		String name;
		
		public SelectNameSelector(String name) {
			this.name = name;
		}
		
		@Override
		public double getQuality(Slot state) {
			return (name.equals(state.getName()))?1.0:0.0;
		}
		
	}
	
	public TestXtendRule(EClass cl) {
		//slot("name") --> get value of that one
		//Automatically inject slots! Default: slot_ --> 1,1, slotm_ --> 0,*, slotp_ --> 1,* - put into lists according to key
		this.loc_class = cl;
		loc_slotValues.addAll(Arrays.asList("car", "auto", "name"));
		
		this.loc_features = loc_class.getEAllStructuralFeatures();
	}


	@Override
	public void afterInit() {
		distributeOn(loc_features, allSlots);
	}
	
	@Override
	public String getString() {
		return "rule "+loc_class.getName()+": "+
				callRule("attributeRules",slot_name.getValues())+
				" <something> '"+val_a+"' "+
				callRule("attributeRules",slotm_other.getValues());
	}
	
	private static void addFeat(EClass cl, String name, EClassifier type) {
		EStructuralFeature feat;
		if (type instanceof EClass) {
			EReference ref = EcoreFactory.eINSTANCE.createEReference();
			feat = ref;
		} else {
			EAttribute ref = EcoreFactory.eINSTANCE.createEAttribute();
			feat = ref;
		}
		feat.setName(name);
		feat.setEType(type);
		cl.getEStructuralFeatures().add(feat);
	}
	
	public static EClass getTestEClass() {
		EClass temp = EcoreFactory.eINSTANCE.createEClass();
		temp.setName("MeineKlasse");
		EClassifier cl;
		addFeat(temp, "car", EcorePackage.eINSTANCE.getEString());
		addFeat(temp, "other", EcorePackage.eINSTANCE.getEString());
		addFeat(temp, "other2", EcorePackage.eINSTANCE.getEString());
		addFeat(temp, "name", EcorePackage.eINSTANCE.getEString());
		return temp;
	}
	public static EClass getTestEClass2() {
		EClass temp = EcoreFactory.eINSTANCE.createEClass();
		temp.setName("Car");
		EClassifier cl;
		addFeat(temp, "bla", EcorePackage.eINSTANCE.getEString());
		addFeat(temp, "other", EcorePackage.eINSTANCE.getEString());
		addFeat(temp, "other2", EcorePackage.eINSTANCE.getEString());
		return temp;
	}
	public static TestXtendRule getTestRule() {
		EClass temp = getTestEClass();
		TestXtendRule rule = new TestXtendRule(temp);
		return rule;
	}
	
	public static ShorterXtendClass getShorterTest() {
		EClass temp = getTestEClass();
		ShorterXtendClass rule = new ShorterXtendClass(temp);
		return rule;
	}
	
	public static void main(String[] args) {
		TestXtendRule rule = getTestRule();
		CompleteManager cm = new CompleteManager();
		SubSelector<CurrentRuleSelectionState> ss = new SubSelector<CurrentRuleSelectionState>() {
			
			@Override
			public List<SubSingleSelector<CurrentRuleSelectionState>> getSubSelectors() {
				return Collections.singletonList(new SubSingleSelector<CurrentRuleSelectionState>() {

					@Override
					public double getQuality(CurrentRuleSelectionState state) {
						return 1.0;
					}
				});
			}
			
			@Override
			public SubPropertyRule getPropertyRule() {
				return new SubPropertyRule() {
					
					@Override
					public void modifyState(CurrentRuleSelectionState crss, ProcessingState state, double weight) {
						// TODO Auto-generated method stub
						//Here I need to add a match-rule, don't I?
						//The slot match selector
						SubSingleSelector<Slot> selectNameSlot = new SelectNameSelector("name");
						SubSingleSelector<Object> selectName = (obj)->{
								if ("name".equals(obj)){
									return 1.0;
								}
								if (obj instanceof EStructuralFeature) {
									EStructuralFeature esf = (EStructuralFeature)obj;
									return "name".equals(esf.getName())?1.0:0.0;
								}
								return 0.0;
						};
						SlotMatchSelector sms = new SlotMatchSelector(selectName, selectNameSlot);
						sms.addChange(1.0);
						state.getPropState().addSlotMatchSelector(sms);
						
						SubSingleSelector<? super AbstractEcssXtendRule> ruleSelector = new SubSingleSelector<AbstractEcssXtendRule>() {

							@Override
							public double getQuality(AbstractEcssXtendRule state) {
								return 1.0;
							}
						};
						//The template match selector		
						TemplateMatchSelector tms = new TemplateMatchSelector(ruleSelector);
						state.getPropState().addTemplateMatchSelector(tms);
						tms.addChange(weight);
						//Add value
						state.getPropState().addValuator("a", new DynamicValuator() {
							
							@Override
							public void modify(CurrentRuleSelectionState state, PropertyStore store) {
								// TODO Auto-generated method stub
								store.addValue(1.0, "output", null, 1.0);
							}
						});
					}
				};
			}
		};
		cm.addPropertyRule(ss);
		TemplateManager manager = new TemplateManager(cm );
		manager.addTemplate(TestXtendRule.class, "classRules");
		manager.addTemplate(AttributeXtendRule.class, "attributeRules");
		String generated = rule.generateString(manager, null);
		
		System.out.println("Generated: "+generated);
	}


	@Override
	public String getSubName() {
		return loc_class.getName();
	}



}
