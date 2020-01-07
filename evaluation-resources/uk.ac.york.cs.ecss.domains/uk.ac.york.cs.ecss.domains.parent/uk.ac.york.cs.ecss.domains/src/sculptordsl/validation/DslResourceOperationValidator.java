/**
 *
 * $Id$
 */
package sculptordsl.validation;

import org.eclipse.emf.common.util.EList;

import sculptordsl.DslComplexType;
import sculptordsl.DslHttpMethod;
import sculptordsl.DslParameter;
import sculptordsl.DslResourceOperationDelegate;
import sculptordsl.DslVisibility;

/**
 * A sample validator interface for {@link sculptordsl.DslResourceOperation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DslResourceOperationValidator {
	boolean validate();

	boolean validateDoc(String value);
	boolean validateVisibility(DslVisibility value);
	boolean validateReturnType(DslComplexType value);
	boolean validateName(String value);
	boolean validateParameters(EList<DslParameter> value);
	boolean validateThrows(String value);
	boolean validateHint(String value);
	boolean validateHttpMethod(DslHttpMethod value);
	boolean validatePath(String value);
	boolean validateReturnString(String value);
	boolean validateDelegateHolder(DslResourceOperationDelegate value);
}