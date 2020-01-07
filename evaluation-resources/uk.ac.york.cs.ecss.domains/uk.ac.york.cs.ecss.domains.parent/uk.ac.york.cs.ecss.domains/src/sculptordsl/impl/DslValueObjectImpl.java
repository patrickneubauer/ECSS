/**
 */
package sculptordsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sculptordsl.DslValueObject;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Value Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslValueObjectImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link sculptordsl.impl.DslValueObjectImpl#isNotOptimisticLocking <em>Not Optimistic Locking</em>}</li>
 *   <li>{@link sculptordsl.impl.DslValueObjectImpl#isNotImmutable <em>Not Immutable</em>}</li>
 *   <li>{@link sculptordsl.impl.DslValueObjectImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link sculptordsl.impl.DslValueObjectImpl#isNotPersistent <em>Not Persistent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslValueObjectImpl extends DslDomainObjectImpl implements DslValueObject {
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected DslValueObject extends_;

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
	 * The default value of the '{@link #isNotImmutable() <em>Not Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotImmutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_IMMUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotImmutable() <em>Not Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotImmutable()
	 * @generated
	 * @ordered
	 */
	protected boolean notImmutable = NOT_IMMUTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotPersistent() <em>Not Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotPersistent() <em>Not Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean notPersistent = NOT_PERSISTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslValueObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_VALUE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslValueObject getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (DslValueObject)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptordslPackage.DSL_VALUE_OBJECT__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslValueObject basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtends(DslValueObject newExtends) {
		DslValueObject oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_VALUE_OBJECT__EXTENDS, oldExtends, extends_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_VALUE_OBJECT__NOT_OPTIMISTIC_LOCKING, oldNotOptimisticLocking, notOptimisticLocking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNotImmutable() {
		return notImmutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotImmutable(boolean newNotImmutable) {
		boolean oldNotImmutable = notImmutable;
		notImmutable = newNotImmutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_VALUE_OBJECT__NOT_IMMUTABLE, oldNotImmutable, notImmutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_VALUE_OBJECT__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNotPersistent() {
		return notPersistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotPersistent(boolean newNotPersistent) {
		boolean oldNotPersistent = notPersistent;
		notPersistent = newNotPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_VALUE_OBJECT__NOT_PERSISTENT, oldNotPersistent, notPersistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptordslPackage.DSL_VALUE_OBJECT__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_OPTIMISTIC_LOCKING:
				return isNotOptimisticLocking();
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_IMMUTABLE:
				return isNotImmutable();
			case SculptordslPackage.DSL_VALUE_OBJECT__PERSISTENT:
				return isPersistent();
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_PERSISTENT:
				return isNotPersistent();
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
			case SculptordslPackage.DSL_VALUE_OBJECT__EXTENDS:
				setExtends((DslValueObject)newValue);
				return;
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_OPTIMISTIC_LOCKING:
				setNotOptimisticLocking((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_IMMUTABLE:
				setNotImmutable((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_VALUE_OBJECT__PERSISTENT:
				setPersistent((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_PERSISTENT:
				setNotPersistent((Boolean)newValue);
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
			case SculptordslPackage.DSL_VALUE_OBJECT__EXTENDS:
				setExtends((DslValueObject)null);
				return;
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_OPTIMISTIC_LOCKING:
				setNotOptimisticLocking(NOT_OPTIMISTIC_LOCKING_EDEFAULT);
				return;
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_IMMUTABLE:
				setNotImmutable(NOT_IMMUTABLE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_VALUE_OBJECT__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_PERSISTENT:
				setNotPersistent(NOT_PERSISTENT_EDEFAULT);
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
			case SculptordslPackage.DSL_VALUE_OBJECT__EXTENDS:
				return extends_ != null;
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_OPTIMISTIC_LOCKING:
				return notOptimisticLocking != NOT_OPTIMISTIC_LOCKING_EDEFAULT;
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_IMMUTABLE:
				return notImmutable != NOT_IMMUTABLE_EDEFAULT;
			case SculptordslPackage.DSL_VALUE_OBJECT__PERSISTENT:
				return persistent != PERSISTENT_EDEFAULT;
			case SculptordslPackage.DSL_VALUE_OBJECT__NOT_PERSISTENT:
				return notPersistent != NOT_PERSISTENT_EDEFAULT;
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
		result.append(", notImmutable: ");
		result.append(notImmutable);
		result.append(", persistent: ");
		result.append(persistent);
		result.append(", notPersistent: ");
		result.append(notPersistent);
		result.append(')');
		return result.toString();
	}

} //DslValueObjectImpl
