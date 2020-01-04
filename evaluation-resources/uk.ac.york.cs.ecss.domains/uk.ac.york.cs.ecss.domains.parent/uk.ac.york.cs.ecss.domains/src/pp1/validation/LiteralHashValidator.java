/**
 *
 * $Id$
 */
package pp1.validation;

import org.eclipse.emf.common.util.EList;

import pp1.HashEntry;

/**
 * A sample validator interface for {@link pp1.LiteralHash}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LiteralHashValidator {
	boolean validate();

	boolean validateElements(EList<HashEntry> value);
}
