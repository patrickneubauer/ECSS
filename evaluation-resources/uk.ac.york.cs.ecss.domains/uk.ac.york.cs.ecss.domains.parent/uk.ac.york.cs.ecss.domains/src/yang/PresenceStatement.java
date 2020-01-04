/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presence Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.PresenceStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.PresenceStatement#getPresenceunknownstatements <em>Presenceunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getPresenceStatement()
 * @model
 * @generated
 */
public interface PresenceStatement extends ContainerSubstatement, RefineSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getPresenceStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.PresenceStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Presenceunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presenceunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getPresenceStatement_Presenceunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getPresenceunknownstatements();

} // PresenceStatement
