/**
 */
package rIMDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OK Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.OKFunction#getState <em>State</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getOKFunction()
 * @model
 * @generated
 */
public interface OKFunction extends Function_OK {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see rIMDsl.RIMDslPackage#getOKFunction_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link rIMDsl.OKFunction#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // OKFunction
