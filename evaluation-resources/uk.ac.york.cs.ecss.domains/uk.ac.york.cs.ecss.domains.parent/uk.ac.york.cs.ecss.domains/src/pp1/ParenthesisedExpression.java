/**
 */
package pp1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesised Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.ParenthesisedExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getParenthesisedExpression()
 * @model
 * @generated
 */
public interface ParenthesisedExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see pp1.Pp1Package#getParenthesisedExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link pp1.ParenthesisedExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // ParenthesisedExpression
