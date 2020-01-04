/**
 */
package pp2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pp2.DoubleQuotedString;
import pp2.Pp2Package;
import pp2.TextExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Quoted String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pp2.impl.DoubleQuotedStringImpl#getStringPart <em>String Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoubleQuotedStringImpl extends StringExpressionImpl implements DoubleQuotedString {
	/**
	 * The cached value of the '{@link #getStringPart() <em>String Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringPart()
	 * @generated
	 * @ordered
	 */
	protected EList<TextExpression> stringPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleQuotedStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pp2Package.Literals.DOUBLE_QUOTED_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextExpression> getStringPart() {
		if (stringPart == null) {
			stringPart = new EObjectContainmentEList<TextExpression>(TextExpression.class, this, Pp2Package.DOUBLE_QUOTED_STRING__STRING_PART);
		}
		return stringPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pp2Package.DOUBLE_QUOTED_STRING__STRING_PART:
				return ((InternalEList<?>)getStringPart()).basicRemove(otherEnd, msgs);
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
			case Pp2Package.DOUBLE_QUOTED_STRING__STRING_PART:
				return getStringPart();
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
			case Pp2Package.DOUBLE_QUOTED_STRING__STRING_PART:
				getStringPart().clear();
				getStringPart().addAll((Collection<? extends TextExpression>)newValue);
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
			case Pp2Package.DOUBLE_QUOTED_STRING__STRING_PART:
				getStringPart().clear();
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
			case Pp2Package.DOUBLE_QUOTED_STRING__STRING_PART:
				return stringPart != null && !stringPart.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DoubleQuotedStringImpl
