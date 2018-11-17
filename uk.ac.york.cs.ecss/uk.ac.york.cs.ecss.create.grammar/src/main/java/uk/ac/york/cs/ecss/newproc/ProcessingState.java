package uk.ac.york.cs.ecss.newproc;

public class ProcessingState {

	private ProcessingState parent;
	private VarState varState;
	private PropState propState;
	
	public ProcessingState(ProcessingState parent) {
		this.parent = parent;
		this.varState = new VarState(parent==null?null:parent.varState);
		this.propState = new PropState(parent==null?null:parent.propState);
	}
	
	
	public void putVariable(String key, Object var) {
		varState.putVar(key, var);
	}
	
	public Object getVariable(String key) {
		return varState.getVar(key);
	}
	
	public String getProperty(String key) {
		return propState.getStringValue(key);
	}
	
	public double getValue(String key, String property) {
		return propState.getValue(key, property);
	}
	
	public void putProperty(String key, String property, String propKey, double importance, double value) {
		if (value >= 0.0) {
			propState.addProperty(key, property, propKey, importance, value);
		} else {
			propState.removeProperty(key, property, propKey, importance, value);
		}
	}


	public PropState getPropState() {
		return propState;
	}
	
}
