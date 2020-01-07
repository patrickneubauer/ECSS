/**
 *
 * $Id$
 */
package sculptordsl.validation;

import sculptordsl.DslCollectionType;
import sculptordsl.DslVisibility;

/**
 * A sample validator interface for {@link sculptordsl.DslAnyProperty}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DslAnyPropertyValidator {
	boolean validate();

	boolean validateDoc(String value);
	boolean validateVisibility(DslVisibility value);
	boolean validateCollectionType(DslCollectionType value);
	boolean validateName(String value);
	boolean validateKey(boolean value);
	boolean validateNotChangeable(boolean value);
	boolean validateRequired(boolean value);
	boolean validateNullable(boolean value);
	boolean validateNullableMessage(String value);
	boolean validateHint(String value);
	boolean validateNotEmpty(boolean value);
	boolean validateNotEmptyMessage(String value);
	boolean validateSize(String value);
	boolean validateValidate(String value);
	boolean validateTransient(boolean value);
}
