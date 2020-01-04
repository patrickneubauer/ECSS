/**
 */
package pp2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Quoted String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.SingleQuotedString#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getSingleQuotedString()
 * @model
 * @generated
 */
public interface SingleQuotedString extends StringExpression, IQuotedString {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see pp2.Pp2Package#getSingleQuotedString_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link pp2.SingleQuotedString#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // SingleQuotedString
