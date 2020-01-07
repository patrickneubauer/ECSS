/**
 *
 * $Id$
 */
package sculptordsl.validation;

import org.eclipse.emf.common.util.EList;

import sculptordsl.DslComplexType;
import sculptordsl.DslParameter;
import sculptordsl.DslPublish;
import sculptordsl.DslVisibility;

/**
 * A sample validator interface for {@link sculptordsl.DslRepositoryOperation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DslRepositoryOperationValidator {
	boolean validate();

	boolean validateDoc(String value);
	boolean validateVisibility(DslVisibility value);
	boolean validateReturnType(DslComplexType value);
	boolean validateName(String value);
	boolean validateParameters(EList<DslParameter> value);
	boolean validateThrows(String value);
	boolean validateHint(String value);
	boolean validateCache(boolean value);
	boolean validateGapOperation(boolean value);
	boolean validateNoGapOperation(boolean value);
	boolean validateQuery(String value);
	boolean validateCondition(String value);
	boolean validateSelect(String value);
	boolean validateGroupBy(String value);
	boolean validateOrderBy(String value);
	boolean validateConstruct(boolean value);
	boolean validateBuild(boolean value);
	boolean validateMap(boolean value);
	boolean validatePublish(DslPublish value);
	boolean validateDelegateToAccessObject(boolean value);
	boolean validateAccessObjectName(String value);
}
