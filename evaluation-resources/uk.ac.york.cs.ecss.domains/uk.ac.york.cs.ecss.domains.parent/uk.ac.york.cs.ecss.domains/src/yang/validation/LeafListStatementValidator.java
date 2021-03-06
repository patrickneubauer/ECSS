/**
 *
 * $Id$
 */
package yang.validation;

import org.eclipse.emf.common.util.EList;

import yang.LeafListSubstatement;

/**
 * A sample validator interface for {@link yang.LeafListStatement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LeafListStatementValidator {
	boolean validate();

	boolean validateArg(String value);
	boolean validateLeaflistsubstatements(EList<LeafListSubstatement> value);
}
