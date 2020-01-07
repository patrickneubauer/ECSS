/**
 */
package sculptordsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sculptordsl.DslEnum;
import sculptordsl.DslEnumAttribute;
import sculptordsl.DslEnumValue;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslEnumImpl#isOrdinal <em>Ordinal</em>}</li>
 *   <li>{@link sculptordsl.impl.DslEnumImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sculptordsl.impl.DslEnumImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslEnumImpl extends DslSimpleDomainObjectImpl implements DslEnum {
	/**
	 * The default value of the '{@link #isOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdinal()
	 * @generated
	 * @ordered
	 */
	protected boolean ordinal = ORDINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DslEnumAttribute> attributes;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DslEnumValue> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_ENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrdinal() {
		return ordinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdinal(boolean newOrdinal) {
		boolean oldOrdinal = ordinal;
		ordinal = newOrdinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ENUM__ORDINAL, oldOrdinal, ordinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslEnumAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<DslEnumAttribute>(DslEnumAttribute.class, this, SculptordslPackage.DSL_ENUM__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslEnumValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<DslEnumValue>(DslEnumValue.class, this, SculptordslPackage.DSL_ENUM__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptordslPackage.DSL_ENUM__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_ENUM__VALUES:
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
			case SculptordslPackage.DSL_ENUM__ORDINAL:
				return isOrdinal();
			case SculptordslPackage.DSL_ENUM__ATTRIBUTES:
				return getAttributes();
			case SculptordslPackage.DSL_ENUM__VALUES:
				return getValues();
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
			case SculptordslPackage.DSL_ENUM__ORDINAL:
				setOrdinal((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ENUM__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends DslEnumAttribute>)newValue);
				return;
			case SculptordslPackage.DSL_ENUM__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends DslEnumValue>)newValue);
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
			case SculptordslPackage.DSL_ENUM__ORDINAL:
				setOrdinal(ORDINAL_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ENUM__ATTRIBUTES:
				getAttributes().clear();
				return;
			case SculptordslPackage.DSL_ENUM__VALUES:
				getValues().clear();
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
			case SculptordslPackage.DSL_ENUM__ORDINAL:
				return ordinal != ORDINAL_EDEFAULT;
			case SculptordslPackage.DSL_ENUM__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case SculptordslPackage.DSL_ENUM__VALUES:
				return values != null && !values.isEmpty();
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
		result.append(" (ordinal: ");
		result.append(ordinal);
		result.append(')');
		return result.toString();
	}

} //DslEnumImpl
