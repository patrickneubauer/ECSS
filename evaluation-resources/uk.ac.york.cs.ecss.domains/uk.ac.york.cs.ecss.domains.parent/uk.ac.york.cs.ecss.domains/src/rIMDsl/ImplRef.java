/**
 */
package rIMDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impl Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.ImplRef#getView <em>View</em>}</li>
 *   <li>{@link rIMDsl.ImplRef#getActions <em>Actions</em>}</li>
 *   <li>{@link rIMDsl.ImplRef#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getImplRef()
 * @model
 * @generated
 */
public interface ImplRef extends EObject {
	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference.
	 * @see #setView(ResourceCommand)
	 * @see rIMDsl.RIMDslPackage#getImplRef_View()
	 * @model containment="true"
	 * @generated
	 */
	ResourceCommand getView();

	/**
	 * Sets the value of the '{@link rIMDsl.ImplRef#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' containment reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(ResourceCommand value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.ResourceCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getImplRef_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceCommand> getActions();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.MethodRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getImplRef_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodRef> getMethods();

} // ImplRef
