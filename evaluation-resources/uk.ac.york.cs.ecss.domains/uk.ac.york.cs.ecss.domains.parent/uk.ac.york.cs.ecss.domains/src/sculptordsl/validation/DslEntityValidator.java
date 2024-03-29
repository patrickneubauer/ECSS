/**
 *
 * $Id$
 */
package sculptordsl.validation;

import sculptordsl.DslEntity;

/**
 * A sample validator interface for {@link sculptordsl.DslEntity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DslEntityValidator {
	boolean validate();

	boolean validateExtends(DslEntity value);
	boolean validateNotOptimisticLocking(boolean value);
	boolean validateNotAuditable(boolean value);
}
