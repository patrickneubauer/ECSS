/**
 */
package sculptordsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sculptordsl.DslEntity;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslEntityImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link sculptordsl.impl.DslEntityImpl#isNotOptimisticLocking <em>Not Optimistic Locking</em>}</li>
 *   <li>{@link sculptordsl.impl.DslEntityImpl#isNotAuditable <em>Not Auditable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslEntityImpl extends DslDomainObjectImpl implements DslEntity {
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected DslEntity extends_;

	/**
	 * The default value of the '{@link #isNotOptimisticLocking() <em>Not Optimistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotOptimisticLocking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_OPTIMISTIC_LOCKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotOptimisticLocking() <em>Not Optimistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotOptimisticLocking()
	 * @generated
	 * @ordered
	 */
	protected boolean notOptimisticLocking = NOT_OPTIMISTIC_LOCKING_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotAuditable() <em>Not Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotAuditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_AUDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotAuditable() <em>Not Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotAuditable()
	 * @generated
	 * @ordered
	 */
	protected boolean notAuditable = NOT_AUDITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslEntity getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (DslEntity)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptordslPackage.DSL_ENTITY__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslEntity basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtends(DslEntity newExtends) {
		DslEntity oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ENTITY__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNotOptimisticLocking() {
		return notOptimisticLocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotOptimisticLocking(boolean newNotOptimisticLocking) {
		boolean oldNotOptimisticLocking = notOptimisticLocking;
		notOptimisticLocking = newNotOptimisticLocking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ENTITY__NOT_OPTIMISTIC_LOCKING, oldNotOptimisticLocking, notOptimisticLocking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNotAuditable() {
		return notAuditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotAuditable(boolean newNotAuditable) {
		boolean oldNotAuditable = notAuditable;
		notAuditable = newNotAuditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ENTITY__NOT_AUDITABLE, oldNotAuditable, notAuditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptordslPackage.DSL_ENTITY__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case SculptordslPackage.DSL_ENTITY__NOT_OPTIMISTIC_LOCKING:
				return isNotOptimisticLocking();
			case SculptordslPackage.DSL_ENTITY__NOT_AUDITABLE:
				return isNotAuditable();
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
			case SculptordslPackage.DSL_ENTITY__EXTENDS:
				setExtends((DslEntity)newValue);
				return;
			case SculptordslPackage.DSL_ENTITY__NOT_OPTIMISTIC_LOCKING:
				setNotOptimisticLocking((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ENTITY__NOT_AUDITABLE:
				setNotAuditable((Boolean)newValue);
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
			case SculptordslPackage.DSL_ENTITY__EXTENDS:
				setExtends((DslEntity)null);
				return;
			case SculptordslPackage.DSL_ENTITY__NOT_OPTIMISTIC_LOCKING:
				setNotOptimisticLocking(NOT_OPTIMISTIC_LOCKING_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ENTITY__NOT_AUDITABLE:
				setNotAuditable(NOT_AUDITABLE_EDEFAULT);
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
			case SculptordslPackage.DSL_ENTITY__EXTENDS:
				return extends_ != null;
			case SculptordslPackage.DSL_ENTITY__NOT_OPTIMISTIC_LOCKING:
				return notOptimisticLocking != NOT_OPTIMISTIC_LOCKING_EDEFAULT;
			case SculptordslPackage.DSL_ENTITY__NOT_AUDITABLE:
				return notAuditable != NOT_AUDITABLE_EDEFAULT;
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
		result.append(" (notOptimisticLocking: ");
		result.append(notOptimisticLocking);
		result.append(", notAuditable: ");
		result.append(notAuditable);
		result.append(')');
		return result.toString();
	}

} //DslEntityImpl
