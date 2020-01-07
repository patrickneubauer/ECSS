/**
 */
package sculptordsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Enum Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslEnumParameter#getValue <em>Value</em>}</li>
 *   <li>{@link sculptordsl.DslEnumParameter#getIntegerValue <em>Integer Value</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslEnumParameter()
 * @model
 * @generated
 */
public interface DslEnumParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see sculptordsl.SculptordslPackage#getDslEnumParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link sculptordsl.DslEnumParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' attribute.
	 * @see #setIntegerValue(int)
	 * @see sculptordsl.SculptordslPackage#getDslEnumParameter_IntegerValue()
	 * @model
	 * @generated
	 */
	int getIntegerValue();

	/**
	 * Sets the value of the '{@link sculptordsl.DslEnumParameter#getIntegerValue <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' attribute.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(int value);

} // DslEnumParameter
