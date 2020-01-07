/**
 */
package rIMDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.ResourceType#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link rIMDsl.ResourceType#isIsItem <em>Is Item</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getResourceType()
 * @model
 * @generated
 */
public interface ResourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collection</em>' attribute.
	 * @see #setIsCollection(boolean)
	 * @see rIMDsl.RIMDslPackage#getResourceType_IsCollection()
	 * @model
	 * @generated
	 */
	boolean isIsCollection();

	/**
	 * Sets the value of the '{@link rIMDsl.ResourceType#isIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #isIsCollection()
	 * @generated
	 */
	void setIsCollection(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Item</em>' attribute.
	 * @see #setIsItem(boolean)
	 * @see rIMDsl.RIMDslPackage#getResourceType_IsItem()
	 * @model
	 * @generated
	 */
	boolean isIsItem();

	/**
	 * Sets the value of the '{@link rIMDsl.ResourceType#isIsItem <em>Is Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Item</em>' attribute.
	 * @see #isIsItem()
	 * @generated
	 */
	void setIsItem(boolean value);

} // ResourceType
