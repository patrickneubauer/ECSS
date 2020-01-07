/**
 */
package wollokDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WBinary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WBinaryOperation#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link wollokDsl.WBinaryOperation#getFeature <em>Feature</em>}</li>
 *   <li>{@link wollokDsl.WBinaryOperation#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWBinaryOperation()
 * @model
 * @generated
 */
public interface WBinaryOperation extends WExpression {
	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWBinaryOperation_LeftOperand()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getLeftOperand();

	/**
	 * Sets the value of the '{@link wollokDsl.WBinaryOperation#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(WExpression value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see wollokDsl.WollokDslPackage#getWBinaryOperation_Feature()
	 * @model
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link wollokDsl.WBinaryOperation#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWBinaryOperation_RightOperand()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getRightOperand();

	/**
	 * Sets the value of the '{@link wollokDsl.WBinaryOperation#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(WExpression value);

} // WBinaryOperation
