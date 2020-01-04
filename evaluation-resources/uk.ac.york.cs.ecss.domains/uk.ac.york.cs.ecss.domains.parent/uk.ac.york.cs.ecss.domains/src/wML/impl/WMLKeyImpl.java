/**
 */
package wML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wML.WMLKey;
import wML.WMLKeyValue;
import wML.WMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wML.impl.WMLKeyImpl#getValues <em>Values</em>}</li>
 *   <li>{@link wML.impl.WMLKeyImpl#getEol <em>Eol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WMLKeyImpl extends WMLExpressionImpl implements WMLKey {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<WMLKeyValue> values;

	/**
	 * The cached value of the '{@link #getEol() <em>Eol</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEol()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WMLKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMLPackage.Literals.WML_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WMLKeyValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<WMLKeyValue>(WMLKeyValue.class, this, WMLPackage.WML_KEY__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEol() {
		if (eol == null) {
			eol = new EDataTypeEList<String>(String.class, this, WMLPackage.WML_KEY__EOL);
		}
		return eol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WMLPackage.WML_KEY__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case WMLPackage.WML_KEY__VALUES:
				return getValues();
			case WMLPackage.WML_KEY__EOL:
				return getEol();
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
			case WMLPackage.WML_KEY__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends WMLKeyValue>)newValue);
				return;
			case WMLPackage.WML_KEY__EOL:
				getEol().clear();
				getEol().addAll((Collection<? extends String>)newValue);
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
			case WMLPackage.WML_KEY__VALUES:
				getValues().clear();
				return;
			case WMLPackage.WML_KEY__EOL:
				getEol().clear();
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
			case WMLPackage.WML_KEY__VALUES:
				return values != null && !values.isEmpty();
			case WMLPackage.WML_KEY__EOL:
				return eol != null && !eol.isEmpty();
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
		result.append(" (eol: ");
		result.append(eol);
		result.append(')');
		return result.toString();
	}

} //WMLKeyImpl
