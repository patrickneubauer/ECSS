/**
 */
package wollokDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WUnary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WUnaryOperation#getFeature <em>Feature</em>}</li>
 *   <li>{@link wollokDsl.WUnaryOperation#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWUnaryOperation()
 * @model
 * @generated
 */
public interface WUnaryOperation extends WExpression {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see wollokDsl.WollokDslPackage#getWUnaryOperation_Feature()
	 * @model
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link wollokDsl.WUnaryOperation#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWUnaryOperation_Operand()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getOperand();

	/**
	 * Sets the value of the '{@link wollokDsl.WUnaryOperation#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(WExpression value);

} // WUnaryOperation
