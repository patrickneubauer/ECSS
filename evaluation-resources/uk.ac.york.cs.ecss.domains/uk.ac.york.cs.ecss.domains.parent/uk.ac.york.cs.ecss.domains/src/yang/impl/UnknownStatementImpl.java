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

import yang.UnknownStatement;
import yang.UnknownSubstatements;
import yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yang.impl.UnknownStatementImpl#getPref <em>Pref</em>}</li>
 *   <li>{@link yang.impl.UnknownStatementImpl#getNamestat <em>Namestat</em>}</li>
 *   <li>{@link yang.impl.UnknownStatementImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link yang.impl.UnknownStatementImpl#getUnknownsubstatements <em>Unknownsubstatements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnknownStatementImpl extends ModuleStatementImpl implements UnknownStatement {
	/**
	 * The default value of the '{@link #getPref() <em>Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPref()
	 * @generated
	 * @ordered
	 */
	protected static final String PREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPref() <em>Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPref()
	 * @generated
	 * @ordered
	 */
	protected String pref = PREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamestat() <em>Namestat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamestat()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESTAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamestat() <em>Namestat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamestat()
	 * @generated
	 * @ordered
	 */
	protected String namestat = NAMESTAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgument() <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected String argument = ARGUMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnknownsubstatements() <em>Unknownsubstatements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownsubstatements()
	 * @generated
	 * @ordered
	 */
	protected EList<UnknownSubstatements> unknownsubstatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnknownStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YangPackage.eINSTANCE.getUnknownStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPref() {
		return pref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPref(String newPref) {
		String oldPref = pref;
		pref = newPref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.UNKNOWN_STATEMENT__PREF, oldPref, pref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamestat() {
		return namestat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamestat(String newNamestat) {
		String oldNamestat = namestat;
		namestat = newNamestat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.UNKNOWN_STATEMENT__NAMESTAT, oldNamestat, namestat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument(String newArgument) {
		String oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.UNKNOWN_STATEMENT__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnknownSubstatements> getUnknownsubstatements() {
		if (unknownsubstatements == null) {
			unknownsubstatements = new EObjectContainmentEList<UnknownSubstatements>(UnknownSubstatements.class, this, YangPackage.UNKNOWN_STATEMENT__UNKNOWNSUBSTATEMENTS);
		}
		return unknownsubstatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YangPackage.UNKNOWN_STATEMENT__UNKNOWNSUBSTATEMENTS:
				return ((InternalEList<?>)getUnknownsubstatements()).basicRemove(otherEnd, msgs);
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
			case YangPackage.UNKNOWN_STATEMENT__PREF:
				return getPref();
			case YangPackage.UNKNOWN_STATEMENT__NAMESTAT:
				return getNamestat();
			case YangPackage.UNKNOWN_STATEMENT__ARGUMENT:
				return getArgument();
			case YangPackage.UNKNOWN_STATEMENT__UNKNOWNSUBSTATEMENTS:
				return getUnknownsubstatements();
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
			case YangPackage.UNKNOWN_STATEMENT__PREF:
				setPref((String)newValue);
				return;
			case YangPackage.UNKNOWN_STATEMENT__NAMESTAT:
				setNamestat((String)newValue);
				return;
			case YangPackage.UNKNOWN_STATEMENT__ARGUMENT:
				setArgument((String)newValue);
				return;
			case YangPackage.UNKNOWN_STATEMENT__UNKNOWNSUBSTATEMENTS:
				getUnknownsubstatements().clear();
				getUnknownsubstatements().addAll((Collection<? extends UnknownSubstatements>)newValue);
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
			case YangPackage.UNKNOWN_STATEMENT__PREF:
				setPref(PREF_EDEFAULT);
				return;
			case YangPackage.UNKNOWN_STATEMENT__NAMESTAT:
				setNamestat(NAMESTAT_EDEFAULT);
				return;
			case YangPackage.UNKNOWN_STATEMENT__ARGUMENT:
				setArgument(ARGUMENT_EDEFAULT);
				return;
			case YangPackage.UNKNOWN_STATEMENT__UNKNOWNSUBSTATEMENTS:
				getUnknownsubstatements().clear();
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
			case YangPackage.UNKNOWN_STATEMENT__PREF:
				return PREF_EDEFAULT == null ? pref != null : !PREF_EDEFAULT.equals(pref);
			case YangPackage.UNKNOWN_STATEMENT__NAMESTAT:
				return NAMESTAT_EDEFAULT == null ? namestat != null : !NAMESTAT_EDEFAULT.equals(namestat);
			case YangPackage.UNKNOWN_STATEMENT__ARGUMENT:
				return ARGUMENT_EDEFAULT == null ? argument != null : !ARGUMENT_EDEFAULT.equals(argument);
			case YangPackage.UNKNOWN_STATEMENT__UNKNOWNSUBSTATEMENTS:
				return unknownsubstatements != null && !unknownsubstatements.isEmpty();
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
		result.append(" (pref: ");
		result.append(pref);
		result.append(", namestat: ");
		result.append(namestat);
		result.append(", argument: ");
		result.append(argument);
		result.append(')');
		return result.toString();
	}

} //UnknownStatementImpl
