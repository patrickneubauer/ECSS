/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WNamed Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WNamedObject#getParent <em>Parent</em>}</li>
 *   <li>{@link wollokDsl.WNamedObject#getParentParameters <em>Parent Parameters</em>}</li>
 *   <li>{@link wollokDsl.WNamedObject#getMixins <em>Mixins</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWNamedObject()
 * @model
 * @generated
 */
public interface WNamedObject extends WLibraryElement, WMethodContainer, WReferenciable, WCanExtendClass {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(WClass)
	 * @see wollokDsl.WollokDslPackage#getWNamedObject_Parent()
	 * @model
	 * @generated
	 */
	WClass getParent();

	/**
	 * Sets the value of the '{@link wollokDsl.WNamedObject#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(WClass value);

	/**
	 * Returns the value of the '<em><b>Parent Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Parameters</em>' containment reference.
	 * @see #setParentParameters(WArgumentList)
	 * @see wollokDsl.WollokDslPackage#getWNamedObject_ParentParameters()
	 * @model containment="true"
	 * @generated
	 */
	WArgumentList getParentParameters();

	/**
	 * Sets the value of the '{@link wollokDsl.WNamedObject#getParentParameters <em>Parent Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Parameters</em>' containment reference.
	 * @see #getParentParameters()
	 * @generated
	 */
	void setParentParameters(WArgumentList value);

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' reference list.
	 * The list contents are of type {@link wollokDsl.WMixin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' reference list.
	 * @see wollokDsl.WollokDslPackage#getWNamedObject_Mixins()
	 * @model
	 * @generated
	 */
	EList<WMixin> getMixins();

} // WNamedObject
