/**
 */
package rIMDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.MethodRef#getEvent <em>Event</em>}</li>
 *   <li>{@link rIMDsl.MethodRef#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getMethodRef()
 * @model
 * @generated
 */
public interface MethodRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see rIMDsl.RIMDslPackage#getMethodRef_Event()
	 * @model
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link rIMDsl.MethodRef#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(ResourceCommand)
	 * @see rIMDsl.RIMDslPackage#getMethodRef_Command()
	 * @model containment="true"
	 * @generated
	 */
	ResourceCommand getCommand();

	/**
	 * Sets the value of the '{@link rIMDsl.MethodRef#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(ResourceCommand value);

} // MethodRef
