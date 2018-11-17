package uk.ac.york.cs.ecss.newproc;

public interface SubPropertyRule {
	
	public void modifyState(CurrentRuleSelectionState crss, ProcessingState state, double weight);

}
