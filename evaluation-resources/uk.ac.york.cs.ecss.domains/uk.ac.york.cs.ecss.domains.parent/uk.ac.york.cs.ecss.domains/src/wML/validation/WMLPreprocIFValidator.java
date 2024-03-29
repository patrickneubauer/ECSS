/**
 *
 * $Id$
 */
package wML.validation;

import org.eclipse.emf.common.util.EList;

import wML.WMLValuedExpression;

/**
 * A sample validator interface for {@link wML.WMLPreprocIF}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WMLPreprocIFValidator {
	boolean validate();

	boolean validateExpressions(EList<WMLValuedExpression> value);
	boolean validateElses(String value);
	boolean validateElseExpressions(EList<WMLValuedExpression> value);
	boolean validateEndName(String value);
}
