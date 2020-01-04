/**
 */
package pp1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pp1.DefinitionArgument;
import pp1.Expression;
import pp1.Pp1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pp1.impl.DefinitionArgumentImpl#getArgName <em>Arg Name</em>}</li>
 *   <li>{@link pp1.impl.DefinitionArgumentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link pp1.impl.DefinitionArgumentImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionArgumentImpl extends MinimalEObjectImpl.Container implements DefinitionArgument {
	/**
	 * The default value of the '{@link #getArgName() <em>Arg Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgName() <em>Arg Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgName()
	 * @generated
	 * @ordered
	 */
	protected String argName = ARG_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final String OP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected String op = OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pp1Package.Literals.DEFINITION_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArgName() {
		return argName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgName(String newArgName) {
		String oldArgName = argName;
		argName = newArgName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp1Package.DEFINITION_ARGUMENT__ARG_NAME, oldArgName, argName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		Expression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pp1Package.DEFINITION_ARGUMENT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Expression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pp1Package.DEFINITION_ARGUMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pp1Package.DEFINITION_ARGUMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp1Package.DEFINITION_ARGUMENT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOp(String newOp) {
		String oldOp = op;
		op = newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp1Package.DEFINITION_ARGUMENT__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pp1Package.DEFINITION_ARGUMENT__VALUE:
				return basicSetValue(null, msgs);
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
			case Pp1Package.DEFINITION_ARGUMENT__ARG_NAME:
				return getArgName();
			case Pp1Package.DEFINITION_ARGUMENT__VALUE:
				return getValue();
			case Pp1Package.DEFINITION_ARGUMENT__OP:
				return getOp();
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
			case Pp1Package.DEFINITION_ARGUMENT__ARG_NAME:
				setArgName((String)newValue);
				return;
			case Pp1Package.DEFINITION_ARGUMENT__VALUE:
				setValue((Expression)newValue);
				return;
			case Pp1Package.DEFINITION_ARGUMENT__OP:
				setOp((String)newValue);
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
			case Pp1Package.DEFINITION_ARGUMENT__ARG_NAME:
				setArgName(ARG_NAME_EDEFAULT);
				return;
			case Pp1Package.DEFINITION_ARGUMENT__VALUE:
				setValue((Expression)null);
				return;
			case Pp1Package.DEFINITION_ARGUMENT__OP:
				setOp(OP_EDEFAULT);
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
			case Pp1Package.DEFINITION_ARGUMENT__ARG_NAME:
				return ARG_NAME_EDEFAULT == null ? argName != null : !ARG_NAME_EDEFAULT.equals(argName);
			case Pp1Package.DEFINITION_ARGUMENT__VALUE:
				return value != null;
			case Pp1Package.DEFINITION_ARGUMENT__OP:
				return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
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
		result.append(" (argName: ");
		result.append(argName);
		result.append(", op: ");
		result.append(op);
		result.append(')');
		return result.toString();
	}

} //DefinitionArgumentImpl
