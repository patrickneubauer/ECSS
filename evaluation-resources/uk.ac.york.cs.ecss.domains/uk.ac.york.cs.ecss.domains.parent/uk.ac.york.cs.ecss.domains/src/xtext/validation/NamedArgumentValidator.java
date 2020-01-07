/**
 *
 * $Id$
 */
package xtext.validation;

import xtext.Condition;
import xtext.Parameter;

/**
 * A sample validator interface for {@link xtext.NamedArgument}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NamedArgumentValidator {
	boolean validate();

	boolean validateParameter(Parameter value);
	boolean validateValue(Condition value);
	boolean validateCalledByName(boolean value);
}