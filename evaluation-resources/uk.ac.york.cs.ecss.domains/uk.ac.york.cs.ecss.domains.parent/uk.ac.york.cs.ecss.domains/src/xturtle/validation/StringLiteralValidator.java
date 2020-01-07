/**
 *
 * $Id$
 */
package xturtle.validation;

import xturtle.ResourceRef;

/**
 * A sample validator interface for {@link xturtle.StringLiteral}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StringLiteralValidator {
	boolean validate();

	boolean validateType(ResourceRef value);
	boolean validateLanguage(String value);
}
