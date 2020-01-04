/**
 */
package wML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wML.WMLExpression;
import wML.WMLMacroCall;
import wML.WMLMacroCallParameter;
import wML.WMLPackage;
import wML.WMLRootExpression;
import wML.WMLValuedExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Macro Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wML.impl.WMLMacroCallImpl#getName <em>Name</em>}</li>
 *   <li>{@link wML.impl.WMLMacroCallImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link wML.impl.WMLMacroCallImpl#getRelative <em>Relative</em>}</li>
 *   <li>{@link wML.impl.WMLMacroCallImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WMLMacroCallImpl extends WMLKeyValueImpl implements WMLMacroCall {
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
	 * The default value of the '{@link #getPoint() <em>Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected String point = POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelative()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelative()
	 * @generated
	 * @ordered
	 */
	protected String relative = RELATIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<WMLMacroCallParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WMLMacroCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMLPackage.Literals.WML_MACRO_CALL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WMLPackage.WML_MACRO_CALL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPoint() {
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoint(String newPoint) {
		String oldPoint = point;
		point = newPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMLPackage.WML_MACRO_CALL__POINT, oldPoint, point));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelative() {
		return relative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelative(String newRelative) {
		String oldRelative = relative;
		relative = newRelative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMLPackage.WML_MACRO_CALL__RELATIVE, oldRelative, relative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WMLMacroCallParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<WMLMacroCallParameter>(WMLMacroCallParameter.class, this, WMLPackage.WML_MACRO_CALL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WMLPackage.WML_MACRO_CALL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case WMLPackage.WML_MACRO_CALL__NAME:
				return getName();
			case WMLPackage.WML_MACRO_CALL__POINT:
				return getPoint();
			case WMLPackage.WML_MACRO_CALL__RELATIVE:
				return getRelative();
			case WMLPackage.WML_MACRO_CALL__PARAMETERS:
				return getParameters();
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
			case WMLPackage.WML_MACRO_CALL__NAME:
				setName((String)newValue);
				return;
			case WMLPackage.WML_MACRO_CALL__POINT:
				setPoint((String)newValue);
				return;
			case WMLPackage.WML_MACRO_CALL__RELATIVE:
				setRelative((String)newValue);
				return;
			case WMLPackage.WML_MACRO_CALL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends WMLMacroCallParameter>)newValue);
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
			case WMLPackage.WML_MACRO_CALL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WMLPackage.WML_MACRO_CALL__POINT:
				setPoint(POINT_EDEFAULT);
				return;
			case WMLPackage.WML_MACRO_CALL__RELATIVE:
				setRelative(RELATIVE_EDEFAULT);
				return;
			case WMLPackage.WML_MACRO_CALL__PARAMETERS:
				getParameters().clear();
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
			case WMLPackage.WML_MACRO_CALL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WMLPackage.WML_MACRO_CALL__POINT:
				return POINT_EDEFAULT == null ? point != null : !POINT_EDEFAULT.equals(point);
			case WMLPackage.WML_MACRO_CALL__RELATIVE:
				return RELATIVE_EDEFAULT == null ? relative != null : !RELATIVE_EDEFAULT.equals(relative);
			case WMLPackage.WML_MACRO_CALL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == WMLMacroCallParameter.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == WMLValuedExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == WMLExpression.class) {
			switch (derivedFeatureID) {
				case WMLPackage.WML_MACRO_CALL__NAME: return WMLPackage.WML_EXPRESSION__NAME;
				default: return -1;
			}
		}
		if (baseClass == WMLRootExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == WMLMacroCallParameter.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == WMLValuedExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == WMLExpression.class) {
			switch (baseFeatureID) {
				case WMLPackage.WML_EXPRESSION__NAME: return WMLPackage.WML_MACRO_CALL__NAME;
				default: return -1;
			}
		}
		if (baseClass == WMLRootExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", point: ");
		result.append(point);
		result.append(", relative: ");
		result.append(relative);
		result.append(')');
		return result.toString();
	}

} //WMLMacroCallImpl
