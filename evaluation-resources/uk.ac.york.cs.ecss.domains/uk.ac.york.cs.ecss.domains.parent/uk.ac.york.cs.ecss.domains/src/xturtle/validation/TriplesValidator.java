/**
 *
 * $Id$
 */
package xturtle.validation;

import org.eclipse.emf.common.util.EList;

import xturtle.PredicateObjectList;
import xturtle.Subject;

/**
 * A sample validator interface for {@link xturtle.Triples}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TriplesValidator {
	boolean validate();

	boolean validateSubject(Subject value);
	boolean validatePredObjs(EList<PredicateObjectList> value);
}
