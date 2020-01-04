/**
 */
package pp2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.MethodCall#isParenthesized <em>Parenthesized</em>}</li>
 *   <li>{@link pp2.MethodCall#getMethodExpr <em>Method Expr</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends WithLambdaExpression {
	/**
	 * Returns the value of the '<em><b>Parenthesized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parenthesized</em>' attribute.
	 * @see #setParenthesized(boolean)
	 * @see pp2.Pp2Package#getMethodCall_Parenthesized()
	 * @model
	 * @generated
	 */
	boolean isParenthesized();

	/**
	 * Sets the value of the '{@link pp2.MethodCall#isParenthesized <em>Parenthesized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parenthesized</em>' attribute.
	 * @see #isParenthesized()
	 * @generated
	 */
	void setParenthesized(boolean value);

	/**
	 * Returns the value of the '<em><b>Method Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Expr</em>' containment reference.
	 * @see #setMethodExpr(Expression)
	 * @see pp2.Pp2Package#getMethodCall_MethodExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMethodExpr();

	/**
	 * Sets the value of the '{@link pp2.MethodCall#getMethodExpr <em>Method Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Expr</em>' containment reference.
	 * @see #getMethodExpr()
	 * @generated
	 */
	void setMethodExpr(Expression value);

} // MethodCall
