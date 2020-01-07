/**
 *
 * $Id$
 */
package sculptordsl.validation;

import sculptordsl.DslComplexType;

/**
 * A sample validator interface for {@link sculptordsl.DslParameter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DslParameterValidator {
	boolean validate();

	boolean validateDoc(String value);
	boolean validateParameterType(DslComplexType value);
	boolean validateName(String value);
}
