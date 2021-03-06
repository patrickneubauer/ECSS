/**
 */
package pp1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Op Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.BinaryOpExpression#getOpName <em>Op Name</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getBinaryOpExpression()
 * @model abstract="true"
 * @generated
 */
public interface BinaryOpExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Name</em>' attribute.
	 * @see #setOpName(String)
	 * @see pp1.Pp1Package#getBinaryOpExpression_OpName()
	 * @model
	 * @generated
	 */
	String getOpName();

	/**
	 * Sets the value of the '{@link pp1.BinaryOpExpression#getOpName <em>Op Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Name</em>' attribute.
	 * @see #getOpName()
	 * @generated
	 */
	void setOpName(String value);

} // BinaryOpExpression
