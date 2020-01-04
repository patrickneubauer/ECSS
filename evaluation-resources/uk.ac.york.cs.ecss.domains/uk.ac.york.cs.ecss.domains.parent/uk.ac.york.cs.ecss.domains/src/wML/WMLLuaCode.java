/**
 */
package wML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lua Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wML.WMLLuaCode#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see wML.WMLPackage#getWMLLuaCode()
 * @model
 * @generated
 */
public interface WMLLuaCode extends WMLKeyValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see wML.WMLPackage#getWMLLuaCode_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link wML.WMLLuaCode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // WMLLuaCode
