package uk.ac.york.cs.ecss.newproc;

public interface TemplateMatchQualityEnv extends RuleQualityEnv {

	public AbstractEcssXtendRule getSubRule();

	static class TemplateMatchQualityEnvImpl implements TemplateMatchQualityEnv {

		private AbstractEcssXtendRule parent;
		private AbstractEcssXtendRule sub;
		
		public TemplateMatchQualityEnvImpl(AbstractEcssXtendRule parent, AbstractEcssXtendRule sub) {
			this.parent = parent;
			this.sub = sub;
		}
		
		@Override
		public AbstractEcssXtendRule getRule() {
			return parent;
		}

		@Override
		public AbstractEcssXtendRule getSubRule() {
			return sub;
		}
		

	}
	
	public static TemplateMatchQualityEnv get(AbstractEcssXtendRule parent, AbstractEcssXtendRule sub) {
		return new TemplateMatchQualityEnvImpl(parent, sub);
	}
	
}
