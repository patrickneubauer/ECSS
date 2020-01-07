/**
 *
 * $Id$
 */
package sculptordsl.validation;

import org.eclipse.emf.common.util.EList;

import sculptordsl.DslDataTransferObject;
import sculptordsl.DslDtoAttribute;
import sculptordsl.DslDtoReference;

/**
 * A sample validator interface for {@link sculptordsl.DslDataTransferObject}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DslDataTransferObjectValidator {
	boolean validate();

	boolean validateAbstract(boolean value);
	boolean validateExtends(DslDataTransferObject value);
	boolean validateExtendsName(String value);
	boolean validateGapClass(boolean value);
	boolean validateNoGapClass(boolean value);
	boolean validateValidate(String value);
	boolean validateAttributes(EList<DslDtoAttribute> value);
	boolean validateReferences(EList<DslDtoReference> value);
}
