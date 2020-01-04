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

import yang.FractionDigitsStatement;
import yang.UnknownStatement;
import yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fraction Digits Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yang.impl.FractionDigitsStatementImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.impl.FractionDigitsStatementImpl#getFractiondigitsunknownstatements <em>Fractiondigitsunknownstatements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FractionDigitsStatementImpl extends TypeSubStatementImpl implements FractionDigitsStatement {
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
	 * The cached value of the '{@link #getFractiondigitsunknownstatements() <em>Fractiondigitsunknownstatements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFractiondigitsunknownstatements()
	 * @generated
	 * @ordered
	 */
	protected EList<UnknownStatement> fractiondigitsunknownstatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FractionDigitsStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YangPackage.eINSTANCE.getFractionDigitsStatement();
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
			eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.FRACTION_DIGITS_STATEMENT__ARG, oldArg, arg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnknownStatement> getFractiondigitsunknownstatements() {
		if (fractiondigitsunknownstatements == null) {
			fractiondigitsunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.FRACTION_DIGITS_STATEMENT__FRACTIONDIGITSUNKNOWNSTATEMENTS);
		}
		return fractiondigitsunknownstatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YangPackage.FRACTION_DIGITS_STATEMENT__FRACTIONDIGITSUNKNOWNSTATEMENTS:
				return ((InternalEList<?>)getFractiondigitsunknownstatements()).basicRemove(otherEnd, msgs);
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
			case YangPackage.FRACTION_DIGITS_STATEMENT__ARG:
				return getArg();
			case YangPackage.FRACTION_DIGITS_STATEMENT__FRACTIONDIGITSUNKNOWNSTATEMENTS:
				return getFractiondigitsunknownstatements();
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
			case YangPackage.FRACTION_DIGITS_STATEMENT__ARG:
				setArg((String)newValue);
				return;
			case YangPackage.FRACTION_DIGITS_STATEMENT__FRACTIONDIGITSUNKNOWNSTATEMENTS:
				getFractiondigitsunknownstatements().clear();
				getFractiondigitsunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
			case YangPackage.FRACTION_DIGITS_STATEMENT__ARG:
				setArg(ARG_EDEFAULT);
				return;
			case YangPackage.FRACTION_DIGITS_STATEMENT__FRACTIONDIGITSUNKNOWNSTATEMENTS:
				getFractiondigitsunknownstatements().clear();
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
			case YangPackage.FRACTION_DIGITS_STATEMENT__ARG:
				return ARG_EDEFAULT == null ? arg != null : !ARG_EDEFAULT.equals(arg);
			case YangPackage.FRACTION_DIGITS_STATEMENT__FRACTIONDIGITSUNKNOWNSTATEMENTS:
				return fractiondigitsunknownstatements != null && !fractiondigitsunknownstatements.isEmpty();
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

} //FractionDigitsStatementImpl
