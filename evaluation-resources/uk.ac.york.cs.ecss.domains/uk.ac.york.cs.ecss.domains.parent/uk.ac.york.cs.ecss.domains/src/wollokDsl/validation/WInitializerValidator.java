/**
 *
 * $Id$
 */
package wollokDsl.validation;

import wollokDsl.WExpression;
import wollokDsl.WVariable;

/**
 * A sample validator interface for {@link wollokDsl.WInitializer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WInitializerValidator {
	boolean validate();

	boolean validateInitializer(WVariable value);
	boolean validateInitialValue(WExpression value);
}
