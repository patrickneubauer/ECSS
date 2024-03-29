/**
 *
 * $Id$
 */
package antlr4.validation;

import antlr4.RuleAltList;

/**
 * A sample validator interface for {@link antlr4.RuleBlock}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RuleBlockValidator {
	boolean validate();

	boolean validateBody(RuleAltList value);
}
