/**
 *
 * $Id$
 */
package antlr4.validation;

import antlr4.GrammarType;
import antlr4.Mode;
import antlr4.PrequelConstruct;
import antlr4.Rule;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link antlr4.Grammar}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GrammarValidator {
	boolean validate();

	boolean validateType(GrammarType value);
	boolean validateName(String value);
	boolean validatePrequels(EList<PrequelConstruct> value);
	boolean validateRules(EList<Rule> value);
	boolean validateModes(EList<Mode> value);
}
