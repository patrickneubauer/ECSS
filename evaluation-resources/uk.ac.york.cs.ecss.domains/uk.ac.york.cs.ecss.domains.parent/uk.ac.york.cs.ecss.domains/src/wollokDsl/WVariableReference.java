/**
 */
package wollokDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WVariable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WVariableReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWVariableReference()
 * @model
 * @generated
 */
public interface WVariableReference extends WExpression {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(WReferenciable)
	 * @see wollokDsl.WollokDslPackage#getWVariableReference_Ref()
	 * @model
	 * @generated
	 */
	WReferenciable getRef();

	/**
	 * Sets the value of the '{@link wollokDsl.WVariableReference#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(WReferenciable value);

} // WVariableReference
