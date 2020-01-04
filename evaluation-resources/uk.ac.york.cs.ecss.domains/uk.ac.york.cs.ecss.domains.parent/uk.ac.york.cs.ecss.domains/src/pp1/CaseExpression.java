/**
 */
package pp1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.CaseExpression#getSwitchExpr <em>Switch Expr</em>}</li>
 *   <li>{@link pp1.CaseExpression#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getCaseExpression()
 * @model
 * @generated
 */
public interface CaseExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Switch Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Expr</em>' containment reference.
	 * @see #setSwitchExpr(Expression)
	 * @see pp1.Pp1Package#getCaseExpression_SwitchExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSwitchExpr();

	/**
	 * Sets the value of the '{@link pp1.CaseExpression#getSwitchExpr <em>Switch Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Expr</em>' containment reference.
	 * @see #getSwitchExpr()
	 * @generated
	 */
	void setSwitchExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link pp1.Case}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see pp1.Pp1Package#getCaseExpression_Cases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Case> getCases();

} // CaseExpression
