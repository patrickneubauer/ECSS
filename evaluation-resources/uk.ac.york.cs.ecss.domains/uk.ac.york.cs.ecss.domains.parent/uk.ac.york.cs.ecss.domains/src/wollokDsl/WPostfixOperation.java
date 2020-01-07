/**
 */
package wollokDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WPostfix Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WPostfixOperation#getOperand <em>Operand</em>}</li>
 *   <li>{@link wollokDsl.WPostfixOperation#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWPostfixOperation()
 * @model
 * @generated
 */
public interface WPostfixOperation extends WExpression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWPostfixOperation_Operand()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getOperand();

	/**
	 * Sets the value of the '{@link wollokDsl.WPostfixOperation#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(WExpression value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see wollokDsl.WollokDslPackage#getWPostfixOperation_Feature()
	 * @model
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link wollokDsl.WPostfixOperation#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

} // WPostfixOperation
