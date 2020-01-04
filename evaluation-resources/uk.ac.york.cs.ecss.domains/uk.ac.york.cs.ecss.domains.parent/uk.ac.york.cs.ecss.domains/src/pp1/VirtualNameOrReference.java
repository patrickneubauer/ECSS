/**
 */
package pp1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Name Or Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.VirtualNameOrReference#getValue <em>Value</em>}</li>
 *   <li>{@link pp1.VirtualNameOrReference#isExported <em>Exported</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getVirtualNameOrReference()
 * @model
 * @generated
 */
public interface VirtualNameOrReference extends LiteralExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see pp1.Pp1Package#getVirtualNameOrReference_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link pp1.VirtualNameOrReference#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported</em>' attribute.
	 * @see #setExported(boolean)
	 * @see pp1.Pp1Package#getVirtualNameOrReference_Exported()
	 * @model
	 * @generated
	 */
	boolean isExported();

	/**
	 * Sets the value of the '{@link pp1.VirtualNameOrReference#isExported <em>Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported</em>' attribute.
	 * @see #isExported()
	 * @generated
	 */
	void setExported(boolean value);

} // VirtualNameOrReference
