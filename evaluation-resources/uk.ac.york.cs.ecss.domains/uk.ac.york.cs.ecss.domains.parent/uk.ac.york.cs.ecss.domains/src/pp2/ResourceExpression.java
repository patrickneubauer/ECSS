/**
 */
package pp2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.ResourceExpression#getResourceExpr <em>Resource Expr</em>}</li>
 *   <li>{@link pp2.ResourceExpression#getResourceData <em>Resource Data</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getResourceExpression()
 * @model
 * @generated
 */
public interface ResourceExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Resource Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Expr</em>' containment reference.
	 * @see #setResourceExpr(Expression)
	 * @see pp2.Pp2Package#getResourceExpression_ResourceExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getResourceExpr();

	/**
	 * Sets the value of the '{@link pp2.ResourceExpression#getResourceExpr <em>Resource Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Expr</em>' containment reference.
	 * @see #getResourceExpr()
	 * @generated
	 */
	void setResourceExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Resource Data</b></em>' containment reference list.
	 * The list contents are of type {@link pp2.ResourceBody}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Data</em>' containment reference list.
	 * @see pp2.Pp2Package#getResourceExpression_ResourceData()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceBody> getResourceData();

} // ResourceExpression
