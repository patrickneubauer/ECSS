/**
 *
 * $Id$
 */
package yang.validation;

import org.eclipse.emf.common.util.EList;

import yang.UnknownStatement;

/**
 * A sample validator interface for {@link yang.UnitsStatement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UnitsStatementValidator {
	boolean validate();

	boolean validateArg(String value);
	boolean validateUnitsunknownstatements(EList<UnknownStatement> value);
}
