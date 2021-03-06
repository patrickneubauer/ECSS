/**
 *
 * $Id$
 */
package pp2.validation;

import pp2.Expression;

/**
 * A sample validator interface for {@link pp2.UnquotedString}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UnquotedStringValidator {
	boolean validate();

	boolean validateExpression(Expression value);
}
