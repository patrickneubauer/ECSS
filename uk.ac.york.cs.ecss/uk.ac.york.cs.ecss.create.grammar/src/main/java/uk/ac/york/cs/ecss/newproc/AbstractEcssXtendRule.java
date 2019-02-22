package uk.ac.york.cs.ecss.newproc;

//import com.ibm.icu.math.BigDecimal;
import uk.ac.york.cs.ecss.priority.rigen.SlotAssignmentProblem;
import uk.ac.york.cs.ecss.priority.rigen.SlotAssignmentProblem.Slot;
import util.NamedElement;

import javax.annotation.Nonnull;

import org.eclipse.emf.ecore.EStructuralFeature;

import java.math.BigDecimal;
import java.util.*;

public abstract class AbstractEcssXtendRule implements NamedElement {
	
	protected ProcessingState processingState;
	protected AbstractEcssXtendRule parentRule;
	protected CurrentRuleSelectionState ruleSelectionState;
	private BasicInjector injector;
	protected TemplateManager manager;
	private String cachedString;
	
	public AbstractEcssXtendRule() {
		
	}
	
	public void initManager(TemplateManager manager) {
		this.manager = manager;
		
	} 
	
	public void initParent(AbstractEcssXtendRule parentRule) {
		this.parentRule = parentRule;
		this.manager.getCompleteManager().addCompoundDependentRule(parentRule, this);
		
		if (parentRule != null) {
			this.ruleSelectionState = new CurrentRuleSelectionState(this, parentRule.ruleSelectionState);	
		} else {
			this.ruleSelectionState = new CurrentRuleSelectionState(this, this.manager.getCompleteManager());
		}
		this.ruleSelectionState.applyApplicable();
		
		init(this.ruleSelectionState.getProcessingState());
	}
	
	private void init(ProcessingState state) {
		this.processingState = state;
		this.injector = new BasicInjector(this, this.processingState);
		
		this.injector.injectValues();
	}
	
	public class SubRuleCall implements RuleCall {
		private String groupName;
		
		public SubRuleCall(String name) {
			this.groupName = name;
		}

		@Override
		public String apply(Object... parameters) {
			return callRule(groupName, parameters);
		}

		@Override
		public String getName() {
			return groupName;
		}
	}
	
	public class SubRuleCallRef implements RuleCallRef {
		private String groupName;
		
		public SubRuleCallRef(String name) {
			this.groupName = name;
		}

		@Override
		public String apply(Object... parameters) {
			return callRuleRef(groupName, parameters);
		}

		@Override
		public String getName() {
			return groupName;
		}
	}
	
	public RuleCall getRuleCall(String name) {
		return new SubRuleCall(name);
	}

	public RuleCallRef getRuleCallRef(String name) {
		return new SubRuleCallRef(name);
	}
	public String callRule(String groupName, Object... parameters) {
		Collection<? extends TemplateMatchSelector> selectors = processingState.getPropState().getAllTemplateMatchSelectors();
		AbstractEcssXtendRule usedRule = manager.generateRule(this, groupName, Arrays.asList(parameters), selectors);
		if (usedRule == null) {
			return "/* Could not find "+groupName+" for "+Arrays.asList(parameters)+" */";
		}
		return usedRule.generateString(manager, this);
	}

	public String callRuleRef(String groupName, Object... parameters) {
		Collection<? extends TemplateMatchSelector> selectors = processingState.getPropState().getAllTemplateMatchSelectors();
		//Hier wird aber immer ein neues generiert ...
		AbstractEcssXtendRule usedRule = manager.generateRule(this, groupName, Arrays.asList(parameters), selectors);
		if (usedRule == null) {
			return "/* Could not find "+groupName+" for "+Arrays.asList(parameters)+" */";
		}
		return manager.getCompleteManager().getChildIdentificator(this, usedRule);
	}
	
	
	//TODO: Think about it

	public @Nonnull RulePropertyValue getValue(String propName) {
		return processingState.getPropState().getRPV(propName);
	}
	
	public String getString(String propName)  {
		return getValue(propName).getStringValue();
	}
	
	public double getDouble(String propName) {
		return getValue(propName).getValue();
	}
	
	public Map<Object, Map<Slot, Double>> objectToSlotMap = new HashMap<>();
	
	/**Does everything from initialization to string generation*/
	public String generateString(TemplateManager manager, AbstractEcssXtendRule parentRule) {
		initManager(manager);
		initParent(parentRule);
		afterInit();
		return cachedString=getString();
	}
	
	/**For things like slot value processing*/
	public abstract void afterInit();
	
	public String getOrCreateString(TemplateManager manager, AbstractEcssXtendRule parentRule) {
		if (cachedString == null) {
			generateString(manager, parentRule);
		}
		return cachedString;
	}
	
	public abstract String getString();
	
	private Object identifier;
	
	/**Subclasses can override it so that the supplied simplesignifier is not used*/
	public void initIdentifier(SimpleSignifier ss) {
		this.identifier = ss;
	}
	
	public Object getIdentifier() {
		return this.identifier;
	}
	
	
	protected boolean isTrue(Object variable) {
		if (variable == null) {
			return false;
		} else
		if (variable instanceof Boolean) {
			return (Boolean)variable;
		} else
		if (variable instanceof Double) {
			return ((Double)variable)>=0.5;
		} else  if (variable instanceof BigDecimal) {
			return ((BigDecimal)variable).doubleValue()>=0.5;
		} else if (variable instanceof Float) {
			return ((Float)variable) >= 0.5;
		} else if (variable instanceof SlotContainer) {
			return !((SlotContainer)variable).getValues().isEmpty();
		} else {
			System.err.println("Unknown object "+variable+"!");
			//Just return whether it is set or not
			return true;
		}
		
	}
	
	//public List<SlotMatchSelector> allSelectors = new ArrayList<SlotMatchSelector>();
	
	public Iterable<SlotMatchSelector> getAllSlotMatchSelectors() {
		return this.ruleSelectionState.getProcessingState().getPropState().getAllSlotMatchSelectors();
	}
	
	public void distributeOn(List<?> slotValues, SlotContainer... slotContainers) {
		distributeOn(slotValues, Arrays.asList(slotContainers));
	}
	
	public void distributeOn(List<?> slotValues, List<SlotContainer> slotContainers) {
		Map<Slot, SlotContainer> map = new HashMap<SlotAssignmentProblem.Slot, SlotContainer>();
		List<Slot> slots = new ArrayList<SlotAssignmentProblem.Slot>();
		for (SlotContainer sc: slotContainers) {
			slots.add(sc.getSlot());
			map.put(sc.getSlot(), sc);
		}
		Map<Object, Map<String, Double>> priorities = new HashMap<>();
		for (Object sv: slotValues) {
			Map<String, Double> subMap = new HashMap<>();
			priorities.put(sv,subMap);
			for (Slot slot: slots) {
				double val = 0.0;
				//Hier auch priorityAdd und so?!
				for (SlotMatchSelector sms: getAllSlotMatchSelectors()) {
					double nextVal = sms.getQuality(this, sv, slot);
					val = Math.max(val, nextVal);
				}
				subMap.put(slot.getName(), val);
			}
		}
		SlotAssignmentProblem<Object> sap = new SlotAssignmentProblem<Object>(slots, new ArrayList<>(slotValues), priorities);
		Map<Slot, List<Object>> assignments = sap.getAssignments();
		assignments.forEach((k,v)->{
			SlotContainer sc = map.get(k);
			v.forEach(y->sc.addValue(y));
		});
	}
	
	public String getName() {
		return getClass().getSimpleName();
	}
	
	private Identificator id;
	
	public Identificator getIdentificator() {
		if (id == null) {
			CompleteManager cm = manager.getCompleteManager();
			id = cm.getIdentificator(this);
		}
		return id;
	}
	
	public abstract String getSubName();

	public  AbstractEcssXtendRule getParentRule() {
		return parentRule;
	}
}
