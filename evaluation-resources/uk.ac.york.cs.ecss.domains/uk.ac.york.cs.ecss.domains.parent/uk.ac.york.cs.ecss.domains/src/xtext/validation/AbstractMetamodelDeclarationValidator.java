/**
 *
 * $Id$
 */
package xtext.validation;

import org.eclipse.emf.ecore.EPackage;

/**
 * A sample validator interface for {@link xtext.AbstractMetamodelDeclaration}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractMetamodelDeclarationValidator {
	boolean validate();

	boolean validateEPackage(EPackage value);
	boolean validateAlias(String value);
}