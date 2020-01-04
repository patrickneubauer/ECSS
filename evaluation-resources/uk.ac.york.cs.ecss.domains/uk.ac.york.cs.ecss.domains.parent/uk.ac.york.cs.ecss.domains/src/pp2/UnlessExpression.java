/**
 */
package pp2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unless Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.UnlessExpression#getCondExpr <em>Cond Expr</em>}</li>
 *   <li>{@link pp2.UnlessExpression#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getUnlessExpression()
 * @model
 * @generated
 */
public interface UnlessExpression extends ExpressionBlock {
	/**
	 * Returns the value of the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Expr</em>' containment reference.
	 * @see #setCondExpr(Expression)
	 * @see pp2.Pp2Package#getUnlessExpression_CondExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondExpr();

	/**
	 * Sets the value of the '{@link pp2.UnlessExpression#getCondExpr <em>Cond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Expr</em>' containment reference.
	 * @see #getCondExpr()
	 * @generated
	 */
	void setCondExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' containment reference.
	 * @see #setElseStatement(Expression)
	 * @see pp2.Pp2Package#getUnlessExpression_ElseStatement()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElseStatement();

	/**
	 * Sets the value of the '{@link pp2.UnlessExpression#getElseStatement <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Statement</em>' containment reference.
	 * @see #getElseStatement()
	 * @generated
	 */
	void setElseStatement(Expression value);

} // UnlessExpression
