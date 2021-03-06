/**
 *
 * $Id$
 */
package xturtle.validation;

import org.eclipse.emf.common.util.EList;

import xturtle.PredicateObjectList;

/**
 * A sample validator interface for {@link xturtle.BlankObjects}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BlankObjectsValidator {
	boolean validate();

	boolean validatePredObjs(EList<PredicateObjectList> value);
}
