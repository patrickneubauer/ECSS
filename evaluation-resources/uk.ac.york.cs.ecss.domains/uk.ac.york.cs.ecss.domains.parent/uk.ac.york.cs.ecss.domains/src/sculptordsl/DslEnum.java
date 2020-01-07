/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslEnum#isOrdinal <em>Ordinal</em>}</li>
 *   <li>{@link sculptordsl.DslEnum#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sculptordsl.DslEnum#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslEnum()
 * @model
 * @generated
 */
public interface DslEnum extends DslSimpleDomainObject {
	/**
	 * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal</em>' attribute.
	 * @see #setOrdinal(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslEnum_Ordinal()
	 * @model
	 * @generated
	 */
	boolean isOrdinal();

	/**
	 * Sets the value of the '{@link sculptordsl.DslEnum#isOrdinal <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal</em>' attribute.
	 * @see #isOrdinal()
	 * @generated
	 */
	void setOrdinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslEnumAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslEnum_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslEnumAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslEnumValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslEnum_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslEnumValue> getValues();

} // DslEnum
