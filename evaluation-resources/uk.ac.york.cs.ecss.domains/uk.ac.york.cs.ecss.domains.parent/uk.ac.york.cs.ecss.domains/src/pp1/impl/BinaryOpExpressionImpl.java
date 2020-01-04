/**
 */
package pp1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pp1.BinaryOpExpression;
import pp1.Pp1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Op Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pp1.impl.BinaryOpExpressionImpl#getOpName <em>Op Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BinaryOpExpressionImpl extends BinaryExpressionImpl implements BinaryOpExpression {
	/**
	 * The default value of the '{@link #getOpName() <em>Op Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpName()
	 * @generated
	 * @ordered
	 */
	protected static final String OP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpName() <em>Op Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpName()
	 * @generated
	 * @ordered
	 */
	protected String opName = OP_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOpExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pp1Package.Literals.BINARY_OP_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpName() {
		return opName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpName(String newOpName) {
		String oldOpName = opName;
		opName = newOpName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp1Package.BINARY_OP_EXPRESSION__OP_NAME, oldOpName, opName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pp1Package.BINARY_OP_EXPRESSION__OP_NAME:
				return getOpName();
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
			case Pp1Package.BINARY_OP_EXPRESSION__OP_NAME:
				setOpName((String)newValue);
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
			case Pp1Package.BINARY_OP_EXPRESSION__OP_NAME:
				setOpName(OP_NAME_EDEFAULT);
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
			case Pp1Package.BINARY_OP_EXPRESSION__OP_NAME:
				return OP_NAME_EDEFAULT == null ? opName != null : !OP_NAME_EDEFAULT.equals(opName);
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
		result.append(" (opName: ");
		result.append(opName);
		result.append(')');
		return result.toString();
	}

} //BinaryOpExpressionImpl
