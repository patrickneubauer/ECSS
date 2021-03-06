/**
 *
 * $Id$
 */
package classDiagram.validation;

import classDiagram.CompType;
import classDiagram.RelationType;

/**
 * A sample validator interface for {@link classDiagram.RelationParse}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RelationParseValidator {
	boolean validate();

	boolean validateComp(CompType value);
	boolean validateType(RelationType value);
	boolean validateDirect(boolean value);
	boolean validateMulti(String value);
	boolean validateExt(boolean value);
}
