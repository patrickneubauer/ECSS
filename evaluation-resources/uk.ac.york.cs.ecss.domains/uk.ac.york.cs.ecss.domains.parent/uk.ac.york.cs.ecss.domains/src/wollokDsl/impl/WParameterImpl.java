/**
 */
package wollokDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wollokDsl.WParameter;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WParameterImpl#isVarArg <em>Var Arg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WParameterImpl extends WReferenciableImpl implements WParameter {
	/**
	 * The default value of the '{@link #isVarArg() <em>Var Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarArg()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VAR_ARG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVarArg() <em>Var Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarArg()
	 * @generated
	 * @ordered
	 */
	protected boolean varArg = VAR_ARG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WPARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVarArg() {
		return varArg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarArg(boolean newVarArg) {
		boolean oldVarArg = varArg;
		varArg = newVarArg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WPARAMETER__VAR_ARG, oldVarArg, varArg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WollokDslPackage.WPARAMETER__VAR_ARG:
				return isVarArg();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WollokDslPackage.WPARAMETER__VAR_ARG:
				setVarArg((Boolean)newValue);
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
			case WollokDslPackage.WPARAMETER__VAR_ARG:
				setVarArg(VAR_ARG_EDEFAULT);
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
			case WollokDslPackage.WPARAMETER__VAR_ARG:
				return varArg != VAR_ARG_EDEFAULT;
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
		result.append(" (varArg: ");
		result.append(varArg);
		result.append(')');
		return result.toString();
	}

} //WParameterImpl
