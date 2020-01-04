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

import yang.ArgumentStatement;
import yang.ArgumentSubstatement;
import yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yang.impl.ArgumentStatementImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.impl.ArgumentStatementImpl#getArgumentsubstatements <em>Argumentsubstatements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentStatementImpl extends ExtensionSubstatementImpl implements ArgumentStatement {
	/**
	 * The default value of the '{@link #getArg() <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg()
	 * @generated
	 * @ordered
	 */
	protected static final String ARG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArg() <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg()
	 * @generated
	 * @ordered
	 */
	protected String arg = ARG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgumentsubstatements() <em>Argumentsubstatements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentsubstatements()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentSubstatement> argumentsubstatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YangPackage.eINSTANCE.getArgumentStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArg() {
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArg(String newArg) {
		String oldArg = arg;
		arg = newArg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.ARGUMENT_STATEMENT__ARG, oldArg, arg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArgumentSubstatement> getArgumentsubstatements() {
		if (argumentsubstatements == null) {
			argumentsubstatements = new EObjectContainmentEList<ArgumentSubstatement>(ArgumentSubstatement.class, this, YangPackage.ARGUMENT_STATEMENT__ARGUMENTSUBSTATEMENTS);
		}
		return argumentsubstatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YangPackage.ARGUMENT_STATEMENT__ARGUMENTSUBSTATEMENTS:
				return ((InternalEList<?>)getArgumentsubstatements()).basicRemove(otherEnd, msgs);
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
			case YangPackage.ARGUMENT_STATEMENT__ARG:
				return getArg();
			case YangPackage.ARGUMENT_STATEMENT__ARGUMENTSUBSTATEMENTS:
				return getArgumentsubstatements();
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
			case YangPackage.ARGUMENT_STATEMENT__ARG:
				setArg((String)newValue);
				return;
			case YangPackage.ARGUMENT_STATEMENT__ARGUMENTSUBSTATEMENTS:
				getArgumentsubstatements().clear();
				getArgumentsubstatements().addAll((Collection<? extends ArgumentSubstatement>)newValue);
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
			case YangPackage.ARGUMENT_STATEMENT__ARG:
				setArg(ARG_EDEFAULT);
				return;
			case YangPackage.ARGUMENT_STATEMENT__ARGUMENTSUBSTATEMENTS:
				getArgumentsubstatements().clear();
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
			case YangPackage.ARGUMENT_STATEMENT__ARG:
				return ARG_EDEFAULT == null ? arg != null : !ARG_EDEFAULT.equals(arg);
			case YangPackage.ARGUMENT_STATEMENT__ARGUMENTSUBSTATEMENTS:
				return argumentsubstatements != null && !argumentsubstatements.isEmpty();
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
		result.append(" (arg: ");
		result.append(arg);
		result.append(')');
		return result.toString();
	}

} //ArgumentStatementImpl
