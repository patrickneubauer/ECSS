package uk.ac.york.cs.ecss.newproc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CurrentRuleSelectionState {
	private AbstractEcssXtendRule rule;
	private CurrentRuleSelectionState parent;
	//TODO: Brauche ich hier boolans oder doubles?
	private Map<SubSelector<? super CurrentRuleSelectionState>, SingleRuleSelectionState<CurrentRuleSelectionState>> currentState;
	private CompleteManager manager;
	private ProcessingState pstate;
	
	public CurrentRuleSelectionState(AbstractEcssXtendRule selectedThing, CurrentRuleSelectionState parent) {
		this.rule = selectedThing;
		this.parent = parent;
		this.manager = parent.manager;
		this.pstate = new ProcessingState(parent.pstate);
	}
	

	public CurrentRuleSelectionState(AbstractEcssXtendRule selectedThing, CompleteManager manager) {
		this.rule = selectedThing;
		this.manager = manager;
		this.pstate = new ProcessingState(null);
	}
	
	
	private Collection<SubSelector<? super CurrentRuleSelectionState>> getAllSubSelectors() {
		return manager.getPropertyRules();
	}
	
	private Map<SubSelector<? super CurrentRuleSelectionState>, SingleRuleSelectionState<CurrentRuleSelectionState>> getPreviousState() {
		if (parent == null) {
			Map<SubSelector<? super CurrentRuleSelectionState>, SingleRuleSelectionState<CurrentRuleSelectionState>> ret = new HashMap<>();
			for (SubSelector<? super CurrentRuleSelectionState> ss: getAllSubSelectors()) {
				ret.put(ss, new SingleRuleSelectionState<CurrentRuleSelectionState>(ss, this));
			}
			return ret;
		}
		return parent.getCurrentState();
	}
	

	private Map<SubSelector<? super CurrentRuleSelectionState>, SingleRuleSelectionState<CurrentRuleSelectionState>> getCurrentState() {
		if (currentState == null) {
			// Calculate next state
			currentState = new HashMap<>(getPreviousState());
			currentState.replaceAll((ss, vals) -> {
				SingleRuleSelectionState<CurrentRuleSelectionState> next = new SingleRuleSelectionState<>(vals, this);
				next.updateVals();
				return next;
			});
		}
		return currentState;
	}

	public Map<SubSelector<? super CurrentRuleSelectionState>,Double> getApplicableSelectors() {
		Map<SubSelector<? super CurrentRuleSelectionState>, Double> ret = new HashMap<>();
		Map<SubSelector<? super CurrentRuleSelectionState>, SingleRuleSelectionState<CurrentRuleSelectionState>> nextState = getCurrentState();
		nextState.forEach((k, v) -> {
			double applicability = v.getApplicability();
			if (applicability > 0.0) {
				ret.put(k, applicability);
			}
		});
		return ret;
	}
	
	public void applyApplicable() {
		Map<SubSelector<? super CurrentRuleSelectionState>,Double> applicable = getApplicableSelectors();
		//I hope that being a set doesn't create problems.
		//I think in _principle_ property rules should not depend on the order, but who knows?
		applicable.forEach((k,v)->{
			SubPropertyRule spr = k.getPropertyRule();
			spr.modifyState(this, pstate,v); 
		});
		pstate.getPropState().recalc(this);
	}


	public ProcessingState getProcessingState() {
		return pstate;
	}


	public AbstractEcssXtendRule getRule() {
		return rule;
	}
	

}
