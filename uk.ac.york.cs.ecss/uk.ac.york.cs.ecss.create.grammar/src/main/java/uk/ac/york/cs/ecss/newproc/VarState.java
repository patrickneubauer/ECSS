package uk.ac.york.cs.ecss.newproc;

import java.util.HashMap;
import java.util.Map;

public class VarState {
	
	private VarState parent;
	private Map<String,Object> vars = new HashMap<>();
	
	public VarState(VarState parent) {
		this.parent = parent;
	}
	
	public Object getVar(String key) {
		if (vars.containsKey(key)) {
			return vars.get(key);
		}
		if (parent != null) {
			return parent.getVar(key);
		}
		return null;
	}
	
	public void putVar(String key, Object var) {
		vars.put(key, var);
	}

}
