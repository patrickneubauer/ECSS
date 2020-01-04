/**
 *
 * $Id$
 */
package yang.validation;

import org.eclipse.emf.common.util.EList;

import yang.TypedefSubstatement;

/**
 * A sample validator interface for {@link yang.TypedefStatement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TypedefStatementValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateTypedefsubstatemnet(EList<TypedefSubstatement> value);
}