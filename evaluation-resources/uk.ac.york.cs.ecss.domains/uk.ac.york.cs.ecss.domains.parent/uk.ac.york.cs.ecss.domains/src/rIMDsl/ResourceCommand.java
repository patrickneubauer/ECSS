/**
 */
package rIMDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.ResourceCommand#getCommand <em>Command</em>}</li>
 *   <li>{@link rIMDsl.ResourceCommand#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getResourceCommand()
 * @model
 * @generated
 */
public interface ResourceCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see rIMDsl.RIMDslPackage#getResourceCommand_Command()
	 * @model
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link rIMDsl.ResourceCommand#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.CommandProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getResourceCommand_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandProperty> getProperties();

} // ResourceCommand
