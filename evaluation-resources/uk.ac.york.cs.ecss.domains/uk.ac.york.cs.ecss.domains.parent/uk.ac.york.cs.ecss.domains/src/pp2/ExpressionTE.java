/**
 */
package pp2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression TE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.ExpressionTE#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getExpressionTE()
 * @model
 * @generated
 */
public interface ExpressionTE extends TextExpression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see pp2.Pp2Package#getExpressionTE_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link pp2.ExpressionTE#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ExpressionTE
