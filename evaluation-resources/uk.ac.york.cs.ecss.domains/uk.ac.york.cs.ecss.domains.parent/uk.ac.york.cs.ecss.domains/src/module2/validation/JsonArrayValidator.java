/**
 *
 * $Id$
 */
package module2.validation;

import module2.Value;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link module2.JsonArray}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface JsonArrayValidator {
	boolean validate();

	boolean validateValue(EList<Value> value);
}
