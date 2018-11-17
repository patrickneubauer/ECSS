package uk.ac.york.cs.ecss.newproc;

import uk.ac.york.cs.ecss.language.ecssLanguage.TemplateGeneratorRule;

public interface AbstractXtendRuleGenerator {

	public Class<? extends AbstractEcssXtendRule> generate(TemplateManager tm, TemplateGeneratorRule rule, String classSimpleName);
}
