/**
 *
 * $Id$
 */
package antlr4.validation;

import antlr4.Block;
import antlr4.EbnfSuffix;

/**
 * A sample validator interface for {@link antlr4.Ebnf}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EbnfValidator {
	boolean validate();

	boolean validateBody(Block value);
	boolean validateOperator(EbnfSuffix value);
}