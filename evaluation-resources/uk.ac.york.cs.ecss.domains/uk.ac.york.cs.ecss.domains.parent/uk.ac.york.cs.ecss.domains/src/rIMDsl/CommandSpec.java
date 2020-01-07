/**
 */
package rIMDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.CommandSpec#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getCommandSpec()
 * @model
 * @generated
 */
public interface CommandSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.CommandProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getCommandSpec_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandProperty> getProperties();

} // CommandSpec
