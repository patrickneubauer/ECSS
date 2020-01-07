/**
 */
package wollokDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WIf Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WIfExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link wollokDsl.WIfExpression#getThen <em>Then</em>}</li>
 *   <li>{@link wollokDsl.WIfExpression#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWIfExpression()
 * @model
 * @generated
 */
public interface WIfExpression extends WExpression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWIfExpression_Condition()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getCondition();

	/**
	 * Sets the value of the '{@link wollokDsl.WIfExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(WExpression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWIfExpression_Then()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getThen();

	/**
	 * Sets the value of the '{@link wollokDsl.WIfExpression#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(WExpression value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWIfExpression_Else()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getElse();

	/**
	 * Sets the value of the '{@link wollokDsl.WIfExpression#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(WExpression value);

} // WIfExpression
