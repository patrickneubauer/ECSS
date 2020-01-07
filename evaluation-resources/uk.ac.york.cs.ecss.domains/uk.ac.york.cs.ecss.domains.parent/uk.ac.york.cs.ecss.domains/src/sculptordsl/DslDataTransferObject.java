/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Data Transfer Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslDataTransferObject#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link sculptordsl.DslDataTransferObject#getExtends <em>Extends</em>}</li>
 *   <li>{@link sculptordsl.DslDataTransferObject#getExtendsName <em>Extends Name</em>}</li>
 *   <li>{@link sculptordsl.DslDataTransferObject#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link sculptordsl.DslDataTransferObject#isNoGapClass <em>No Gap Class</em>}</li>
 *   <li>{@link sculptordsl.DslDataTransferObject#getValidate <em>Validate</em>}</li>
 *   <li>{@link sculptordsl.DslDataTransferObject#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sculptordsl.DslDataTransferObject#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslDataTransferObject()
 * @model
 * @generated
 */
public interface DslDataTransferObject extends DslSimpleDomainObject {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslDataTransferObject_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDataTransferObject#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(DslDataTransferObject)
	 * @see sculptordsl.SculptordslPackage#getDslDataTransferObject_Extends()
	 * @model
	 * @generated
	 */
	DslDataTransferObject getExtends();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDataTransferObject#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(DslDataTransferObject value);

	/**
	 * Returns the value of the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Name</em>' attribute.
	 * @see #setExtendsName(String)
	 * @see sculptordsl.SculptordslPackage#getDslDataTransferObject_ExtendsName()
	 * @model
	 * @generated
	 */
	String getExtendsName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDataTransferObject#getExtendsName <em>Extends Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends Name</em>' attribute.
	 * @see #getExtendsName()
	 * @generated
	 */
	void setExtendsName(String value);

	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslDataTransferObject_GapClass()
	 * @model
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDataTransferObject#isGapClass <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Class</em>' attribute.
	 * @see #isGapClass()
	 * @generated
	 */
	void setGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Gap Class</em>' attribute.
	 * @see #setNoGapClass(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslDataTransferObject_NoGapClass()
	 * @model
	 * @generated
	 */
	boolean isNoGapClass();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDataTransferObject#isNoGapClass <em>No Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Gap Class</em>' attribute.
	 * @see #isNoGapClass()
	 * @generated
	 */
	void setNoGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see #setValidate(String)
	 * @see sculptordsl.SculptordslPackage#getDslDataTransferObject_Validate()
	 * @model
	 * @generated
	 */
	String getValidate();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDataTransferObject#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslDtoAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslDataTransferObject_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslDtoAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslDtoReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslDataTransferObject_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslDtoReference> getReferences();

} // DslDataTransferObject
