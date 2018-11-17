package uk.ac.york.cs.ecss.newproc;

public interface RuleCallRef {
	
	public String apply(Object... parameters);
	
	public String getName();
	
}
