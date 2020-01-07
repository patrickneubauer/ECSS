/**
 */
package wollokDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WNumber Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WNumberLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWNumberLiteral()
 * @model
 * @generated
 */
public interface WNumberLiteral extends WExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see wollokDsl.WollokDslPackage#getWNumberLiteral_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link wollokDsl.WNumberLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // WNumberLiteral
