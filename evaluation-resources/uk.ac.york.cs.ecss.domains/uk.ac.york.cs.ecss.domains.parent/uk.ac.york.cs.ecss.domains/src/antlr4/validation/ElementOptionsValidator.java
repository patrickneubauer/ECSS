/**
 *
 * $Id$
 */
package antlr4.validation;

import antlr4.ElementOption;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link antlr4.ElementOptions}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ElementOptionsValidator {
	boolean validate();

	boolean validateBegin(String value);
	boolean validateOptions(EList<ElementOption> value);
	boolean validateEnd(String value);
}