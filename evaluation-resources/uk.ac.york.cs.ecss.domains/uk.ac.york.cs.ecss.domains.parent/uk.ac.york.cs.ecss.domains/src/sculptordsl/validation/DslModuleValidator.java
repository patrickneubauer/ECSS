/**
 *
 * $Id$
 */
package sculptordsl.validation;

import org.eclipse.emf.common.util.EList;

import sculptordsl.DslConsumer;
import sculptordsl.DslResource;
import sculptordsl.DslService;
import sculptordsl.DslSimpleDomainObject;

/**
 * A sample validator interface for {@link sculptordsl.DslModule}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DslModuleValidator {
	boolean validate();

	boolean validateDoc(String value);
	boolean validateName(String value);
	boolean validateExternal(boolean value);
	boolean validateBasePackage(String value);
	boolean validateHint(String value);
	boolean validateServices(EList<DslService> value);
	boolean validateResources(EList<DslResource> value);
	boolean validateConsumers(EList<DslConsumer> value);
	boolean validateDomainObjects(EList<DslSimpleDomainObject> value);
}
