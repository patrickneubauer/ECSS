/**
 */
package xturtle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QName Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xturtle.QNameDef#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link xturtle.QNameDef#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see xturtle.XturtlePackage#getQNameDef()
 * @model
 * @generated
 */
public interface QNameDef extends Resource {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' reference.
	 * @see #setPrefix(PrefixId)
	 * @see xturtle.XturtlePackage#getQNameDef_Prefix()
	 * @model
	 * @generated
	 */
	PrefixId getPrefix();

	/**
	 * Sets the value of the '{@link xturtle.QNameDef#getPrefix <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(PrefixId value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see xturtle.XturtlePackage#getQNameDef_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link xturtle.QNameDef#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // QNameDef
