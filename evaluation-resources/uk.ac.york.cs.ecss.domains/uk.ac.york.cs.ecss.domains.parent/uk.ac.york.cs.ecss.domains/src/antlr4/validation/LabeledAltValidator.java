/**
 *
 * $Id$
 */
package antlr4.validation;

import antlr4.Alternative;

/**
 * A sample validator interface for {@link antlr4.LabeledAlt}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LabeledAltValidator {
	boolean validate();

	boolean validateBody(Alternative value);
	boolean validatePoundSymbol(String value);
	boolean validateLabel(String value);
}
