/**
 */
package wML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wML.WMLMacroParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see wML.WMLPackage#getWMLMacroParameter()
 * @model
 * @generated
 */
public interface WMLMacroParameter extends WMLMacroCallParameter {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see wML.WMLPackage#getWMLMacroParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link wML.WMLMacroParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // WMLMacroParameter
