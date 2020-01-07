/**
 *
 * $Id$
 */
package sculptordsl.validation;

import org.eclipse.emf.common.util.EList;

import sculptordsl.DslEnumParameter;

/**
 * A sample validator interface for {@link sculptordsl.DslEnumValue}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DslEnumValueValidator {
	boolean validate();

	boolean validateDoc(String value);
	boolean validateName(String value);
	boolean validateParameters(EList<DslEnumParameter> value);
}