package uk.ac.york.cs.ecss.newproc;

public interface RuleCall {
	
	public String apply(Object... parameters);
	
	public String getName();
	
}
