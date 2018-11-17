package uk.ac.york.cs.ecss.newproc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SimpleSignifier {
	private String ruleGroup;
	//For templates??
	//private String subName;
	private List<Object> paramters;
	private int hashCode;

	public SimpleSignifier(String ruleGroup, /*String subName,*/ List<Object> parameters) {
		this.ruleGroup = ruleGroup;
		//this.subName = subName;
		this.paramters = parameters;
		this.hashCode = Objects.hash(ruleGroup, /*subName,*/ parameters);
	}
	
	public SimpleSignifier(String ruleGroup, /*String subName, */Object... parameters) {
		this(ruleGroup, /*subName, */Arrays.asList(parameters));
	}
			
	
	@Override
	public int hashCode() {
		return this.hashCode;
	}
	
	public boolean equals(SimpleSignifier other)  {
		return this.hashCode == other.hashCode && Objects.equals(ruleGroup, other.ruleGroup) &&
				/*Objects.equals(subName, other.subName) && */paramters.equals(other.paramters);
	}
	
	@Override
	public boolean equals(Object o) {
		return (o instanceof SimpleSignifier) && equals((SimpleSignifier)o);
	}
	
}
