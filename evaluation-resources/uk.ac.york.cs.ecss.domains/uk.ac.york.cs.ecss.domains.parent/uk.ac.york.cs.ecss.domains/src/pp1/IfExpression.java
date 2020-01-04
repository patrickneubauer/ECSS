/**
 */
package pp1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.IfExpression#getCondExpr <em>Cond Expr</em>}</li>
 *   <li>{@link pp1.IfExpression#getThenStatements <em>Then Statements</em>}</li>
 *   <li>{@link pp1.IfExpression#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getIfExpression()
 * @model
 * @generated
 */
public interface IfExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Expr</em>' containment reference.
	 * @see #setCondExpr(Expression)
	 * @see pp1.Pp1Package#getIfExpression_CondExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondExpr();

	/**
	 * Sets the value of the '{@link pp1.IfExpression#getCondExpr <em>Cond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Expr</em>' containment reference.
	 * @see #getCondExpr()
	 * @generated
	 */
	void setCondExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Then Statements</b></em>' containment reference list.
	 * The list contents are of type {@link pp1.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Statements</em>' containment reference list.
	 * @see pp1.Pp1Package#getIfExpression_ThenStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getThenStatements();

	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' containment reference.
	 * @see #setElseStatement(Expression)
	 * @see pp1.Pp1Package#getIfExpression_ElseStatement()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElseStatement();

	/**
	 * Sets the value of the '{@link pp1.IfExpression#getElseStatement <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Statement</em>' containment reference.
	 * @see #getElseStatement()
	 * @generated
	 */
	void setElseStatement(Expression value);

} // IfExpression
