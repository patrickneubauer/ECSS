/**
 *
 * $Id$
 */
package sculptordsl.validation;

import org.eclipse.emf.common.util.EList;

import sculptordsl.DslAttribute;
import sculptordsl.DslDomainObjectOperation;
import sculptordsl.DslReference;

/**
 * A sample validator interface for {@link sculptordsl.DslTrait}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DslTraitValidator {
	boolean validate();

	boolean validateAttributes(EList<DslAttribute> value);
	boolean validateReferences(EList<DslReference> value);
	boolean validateOperations(EList<DslDomainObjectOperation> value);
}