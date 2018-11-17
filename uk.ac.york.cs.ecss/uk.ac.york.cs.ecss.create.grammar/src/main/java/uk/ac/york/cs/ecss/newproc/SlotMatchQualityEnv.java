package uk.ac.york.cs.ecss.newproc;

import uk.ac.york.cs.ecss.priority.rigen.SlotAssignmentProblem.Slot;

public interface SlotMatchQualityEnv extends RuleQualityEnv {

	public Slot getSlot();
	
	public Object getValue();
	
	static class SlotMatchQualityEnvImpl implements SlotMatchQualityEnv {

		private AbstractEcssXtendRule rule;
		private Object sv;

		private Slot slot;
		
		public SlotMatchQualityEnvImpl(AbstractEcssXtendRule parent, 
				Object sv, Slot slot) {
			this.rule = parent;
			this.sv = sv;
			this.slot = slot;
		}
		
		
		@Override
		public AbstractEcssXtendRule getRule() {
			return rule;
		}
		
		@Override
		public Object getValue() {
			return sv;
		}
		
		@Override
		public Slot getSlot() {
			return slot;
		}
		

	}

	public static SlotMatchQualityEnv get(AbstractEcssXtendRule parent, Object sv, Slot slot) {
		return new SlotMatchQualityEnvImpl(parent, sv, slot);
	}
}
