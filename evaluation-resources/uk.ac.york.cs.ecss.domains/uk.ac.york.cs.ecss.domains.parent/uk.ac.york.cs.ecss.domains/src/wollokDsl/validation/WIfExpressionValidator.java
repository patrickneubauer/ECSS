/**
 *
 * $Id$
 */
package wollokDsl.validation;

import wollokDsl.WExpression;

/**
 * A sample validator interface for {@link wollokDsl.WIfExpression}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WIfExpressionValidator {
	boolean validate();

	boolean validateCondition(WExpression value);
	boolean validateThen(WExpression value);
	boolean validateElse(WExpression value);
}