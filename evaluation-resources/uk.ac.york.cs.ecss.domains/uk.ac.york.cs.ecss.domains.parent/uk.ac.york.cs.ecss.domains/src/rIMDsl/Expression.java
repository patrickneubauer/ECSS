/**
 */
package rIMDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.Expression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getExpression_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getExpressions();

} // Expression
