/**
 *
 * $Id$
 */
package xtext.validation;

import org.eclipse.emf.common.util.EList;

import xtext.AbstractMetamodelDeclaration;
import xtext.AbstractRule;
import xtext.Grammar;

/**
 * A sample validator interface for {@link xtext.Grammar}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GrammarValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateUsedGrammars(EList<Grammar> value);
	boolean validateDefinesHiddenTokens(boolean value);
	boolean validateHiddenTokens(EList<AbstractRule> value);
	boolean validateMetamodelDeclarations(EList<AbstractMetamodelDeclaration> value);
	boolean validateRules(EList<AbstractRule> value);
}