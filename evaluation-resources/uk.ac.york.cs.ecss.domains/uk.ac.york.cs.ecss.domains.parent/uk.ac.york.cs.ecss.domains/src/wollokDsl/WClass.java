/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WClass#getParent <em>Parent</em>}</li>
 *   <li>{@link wollokDsl.WClass#getMixins <em>Mixins</em>}</li>
 *   <li>{@link wollokDsl.WClass#getConstructors <em>Constructors</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWClass()
 * @model
 * @generated
 */
public interface WClass extends WLibraryElement, WNamed, WMethodContainer, WCanExtendClass {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(WClass)
	 * @see wollokDsl.WollokDslPackage#getWClass_Parent()
	 * @model
	 * @generated
	 */
	WClass getParent();

	/**
	 * Sets the value of the '{@link wollokDsl.WClass#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(WClass value);

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' reference list.
	 * The list contents are of type {@link wollokDsl.WMixin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' reference list.
	 * @see wollokDsl.WollokDslPackage#getWClass_Mixins()
	 * @model
	 * @generated
	 */
	EList<WMixin> getMixins();

	/**
	 * Returns the value of the '<em><b>Constructors</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WConstructor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructors</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWClass_Constructors()
	 * @model containment="true"
	 * @generated
	 */
	EList<WConstructor> getConstructors();

} // WClass
