/**
 *
 * $Id$
 */
package xtext.validation;

import org.eclipse.emf.ecore.EClassifier;

import xtext.AbstractMetamodelDeclaration;

/**
 * A sample validator interface for {@link xtext.TypeRef}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TypeRefValidator {
	boolean validate();

	boolean validateMetamodel(AbstractMetamodelDeclaration value);
	boolean validateClassifier(EClassifier value);
}
