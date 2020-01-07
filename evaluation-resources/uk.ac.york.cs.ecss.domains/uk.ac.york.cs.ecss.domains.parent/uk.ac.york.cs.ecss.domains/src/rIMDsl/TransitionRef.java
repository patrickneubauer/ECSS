/**
 */
package rIMDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.TransitionRef#getEvent <em>Event</em>}</li>
 *   <li>{@link rIMDsl.TransitionRef#getState <em>State</em>}</li>
 *   <li>{@link rIMDsl.TransitionRef#getLocator <em>Locator</em>}</li>
 *   <li>{@link rIMDsl.TransitionRef#getName <em>Name</em>}</li>
 *   <li>{@link rIMDsl.TransitionRef#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getTransitionRef()
 * @model
 * @generated
 */
public interface TransitionRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see rIMDsl.RIMDslPackage#getTransitionRef_Event()
	 * @model
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link rIMDsl.TransitionRef#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see rIMDsl.RIMDslPackage#getTransitionRef_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link rIMDsl.TransitionRef#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locator</em>' containment reference.
	 * @see #setLocator(ResourceLocator)
	 * @see rIMDsl.RIMDslPackage#getTransitionRef_Locator()
	 * @model containment="true"
	 * @generated
	 */
	ResourceLocator getLocator();

	/**
	 * Sets the value of the '{@link rIMDsl.TransitionRef#getLocator <em>Locator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locator</em>' containment reference.
	 * @see #getLocator()
	 * @generated
	 */
	void setLocator(ResourceLocator value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rIMDsl.RIMDslPackage#getTransitionRef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rIMDsl.TransitionRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' containment reference.
	 * @see #setSpec(TransitionSpec)
	 * @see rIMDsl.RIMDslPackage#getTransitionRef_Spec()
	 * @model containment="true"
	 * @generated
	 */
	TransitionSpec getSpec();

	/**
	 * Sets the value of the '{@link rIMDsl.TransitionRef#getSpec <em>Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' containment reference.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(TransitionSpec value);

} // TransitionRef
