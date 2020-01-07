/**
 */
package xturtle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QName Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xturtle.QNameRef#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see xturtle.XturtlePackage#getQNameRef()
 * @model
 * @generated
 */
public interface QNameRef extends ResourceRef {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' reference.
	 * @see #setPrefix(PrefixId)
	 * @see xturtle.XturtlePackage#getQNameRef_Prefix()
	 * @model
	 * @generated
	 */
	PrefixId getPrefix();

	/**
	 * Sets the value of the '{@link xturtle.QNameRef#getPrefix <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(PrefixId value);

} // QNameRef
