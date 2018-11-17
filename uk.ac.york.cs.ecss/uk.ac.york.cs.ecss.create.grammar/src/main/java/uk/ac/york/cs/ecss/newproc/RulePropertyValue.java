package uk.ac.york.cs.ecss.newproc;

public interface RulePropertyValue {

	public double getValue();
	
	public double getImportance();
	
	public default RulePropertyValue getSubOrEmpty(String key) {
		RulePropertyValue ret = getSubOrNull(key);
		if (ret == null) {
			return EMPTY;
		}
		return ret;
	}
	
	public String getStringValue();
	
	public RulePropertyValue getSubOrNull(String key);
	
	public static RulePropertyValue EMPTY = new RulePropertyValue() {
		
		@Override
		public double getValue() {
			return 0.0;
		}
		
		@Override
		public RulePropertyValue getSubOrNull(String key) {
			return null;
		}
		
		@Override
		public double getImportance() {
			return 0.0;
		}

		@Override
		public String getStringValue() {
			return null;
		}
		
	}; 
	
	
}
