/**
 *
 * $Id$
 */
package sculptordsl.validation;

import sculptordsl.DslServiceRepositoryOperationOption;
import sculptordsl.DslServiceRepositoryOption;

/**
 * A sample validator interface for {@link sculptordsl.DslServiceOperationDelegate}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DslServiceOperationDelegateValidator {
	boolean validate();

	boolean validateDelegate(DslServiceRepositoryOption value);
	boolean validateDelegateOperation(DslServiceRepositoryOperationOption value);
}
