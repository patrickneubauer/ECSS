/**
 */
package wollokDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WAssignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WAssignment#getFeature <em>Feature</em>}</li>
 *   <li>{@link wollokDsl.WAssignment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWAssignment()
 * @model
 * @generated
 */
public interface WAssignment extends WExpression {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(WVariableReference)
	 * @see wollokDsl.WollokDslPackage#getWAssignment_Feature()
	 * @model containment="true"
	 * @generated
	 */
	WVariableReference getFeature();

	/**
	 * Sets the value of the '{@link wollokDsl.WAssignment#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(WVariableReference value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWAssignment_Value()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getValue();

	/**
	 * Sets the value of the '{@link wollokDsl.WAssignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(WExpression value);

} // WAssignment
