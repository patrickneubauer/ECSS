/**
 *
 * $Id$
 */
package wollokDsl.validation;

import org.eclipse.emf.common.util.EList;

import wollokDsl.WExpression;

/**
 * A sample validator interface for {@link wollokDsl.WProgram}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WProgramValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateElements(EList<WExpression> value);
}
