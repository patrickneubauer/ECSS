/**
 *
 * $Id$
 */
package yang.validation;

import org.eclipse.emf.common.util.EList;

import yang.GroupingStatement;
import yang.UsesSubstatement;

/**
 * A sample validator interface for {@link yang.UsesStatement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UsesStatementValidator {
	boolean validate();

	boolean validatePre(String value);
	boolean validateArg(GroupingStatement value);
	boolean validateUsessubstatements(EList<UsesSubstatement> value);
}
