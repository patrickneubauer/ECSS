/**
 */
package yang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import yang.NotificationStatement;
import yang.NotificationSubstatement;
import yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yang.impl.NotificationStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link yang.impl.NotificationStatementImpl#getNotificationsubstatements <em>Notificationsubstatements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationStatementImpl extends ModuleStatementImpl implements NotificationStatement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotificationsubstatements() <em>Notificationsubstatements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationsubstatements()
	 * @generated
	 * @ordered
	 */
	protected EList<NotificationSubstatement> notificationsubstatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YangPackage.eINSTANCE.getNotificationStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.NOTIFICATION_STATEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NotificationSubstatement> getNotificationsubstatements() {
		if (notificationsubstatements == null) {
			notificationsubstatements = new EObjectContainmentEList<NotificationSubstatement>(NotificationSubstatement.class, this, YangPackage.NOTIFICATION_STATEMENT__NOTIFICATIONSUBSTATEMENTS);
		}
		return notificationsubstatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YangPackage.NOTIFICATION_STATEMENT__NOTIFICATIONSUBSTATEMENTS:
				return ((InternalEList<?>)getNotificationsubstatements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YangPackage.NOTIFICATION_STATEMENT__NAME:
				return getName();
			case YangPackage.NOTIFICATION_STATEMENT__NOTIFICATIONSUBSTATEMENTS:
				return getNotificationsubstatements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YangPackage.NOTIFICATION_STATEMENT__NAME:
				setName((String)newValue);
				return;
			case YangPackage.NOTIFICATION_STATEMENT__NOTIFICATIONSUBSTATEMENTS:
				getNotificationsubstatements().clear();
				getNotificationsubstatements().addAll((Collection<? extends NotificationSubstatement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case YangPackage.NOTIFICATION_STATEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case YangPackage.NOTIFICATION_STATEMENT__NOTIFICATIONSUBSTATEMENTS:
				getNotificationsubstatements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case YangPackage.NOTIFICATION_STATEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case YangPackage.NOTIFICATION_STATEMENT__NOTIFICATIONSUBSTATEMENTS:
				return notificationsubstatements != null && !notificationsubstatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NotificationStatementImpl
