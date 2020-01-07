/**
 */
package sculptordsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sculptordsl.DslServiceOperationDelegate;
import sculptordsl.DslServiceRepositoryOperationOption;
import sculptordsl.DslServiceRepositoryOption;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Service Operation Delegate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslServiceOperationDelegateImpl#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link sculptordsl.impl.DslServiceOperationDelegateImpl#getDelegateOperation <em>Delegate Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslServiceOperationDelegateImpl extends MinimalEObjectImpl.Container implements DslServiceOperationDelegate {
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected DslServiceRepositoryOption delegate;

	/**
	 * The cached value of the '{@link #getDelegateOperation() <em>Delegate Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateOperation()
	 * @generated
	 * @ordered
	 */
	protected DslServiceRepositoryOperationOption delegateOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslServiceOperationDelegateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_SERVICE_OPERATION_DELEGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslServiceRepositoryOption getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (DslServiceRepositoryOption)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslServiceRepositoryOption basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegate(DslServiceRepositoryOption newDelegate) {
		DslServiceRepositoryOption oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslServiceRepositoryOperationOption getDelegateOperation() {
		if (delegateOperation != null && delegateOperation.eIsProxy()) {
			InternalEObject oldDelegateOperation = (InternalEObject)delegateOperation;
			delegateOperation = (DslServiceRepositoryOperationOption)eResolveProxy(oldDelegateOperation);
			if (delegateOperation != oldDelegateOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE_OPERATION, oldDelegateOperation, delegateOperation));
			}
		}
		return delegateOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslServiceRepositoryOperationOption basicGetDelegateOperation() {
		return delegateOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegateOperation(DslServiceRepositoryOperationOption newDelegateOperation) {
		DslServiceRepositoryOperationOption oldDelegateOperation = delegateOperation;
		delegateOperation = newDelegateOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE_OPERATION, oldDelegateOperation, delegateOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE:
				if (resolve) return getDelegate();
				return basicGetDelegate();
			case SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE_OPERATION:
				if (resolve) return getDelegateOperation();
				return basicGetDelegateOperation();
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
			case SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE:
				setDelegate((DslServiceRepositoryOption)newValue);
				return;
			case SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE_OPERATION:
				setDelegateOperation((DslServiceRepositoryOperationOption)newValue);
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
			case SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE:
				setDelegate((DslServiceRepositoryOption)null);
				return;
			case SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE_OPERATION:
				setDelegateOperation((DslServiceRepositoryOperationOption)null);
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
			case SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE:
				return delegate != null;
			case SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE__DELEGATE_OPERATION:
				return delegateOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //DslServiceOperationDelegateImpl
