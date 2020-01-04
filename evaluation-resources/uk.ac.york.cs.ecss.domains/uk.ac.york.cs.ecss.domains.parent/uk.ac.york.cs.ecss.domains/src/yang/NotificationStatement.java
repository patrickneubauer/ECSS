/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.NotificationStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.NotificationStatement#getNotificationsubstatements <em>Notificationsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getNotificationStatement()
 * @model
 * @generated
 */
public interface NotificationStatement extends ModuleStatement, SubmoduleStatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getNotificationStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.NotificationStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Notificationsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.NotificationSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notificationsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getNotificationStatement_Notificationsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<NotificationSubstatement> getNotificationsubstatements();

} // NotificationStatement
