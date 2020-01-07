/**
 */
package wollokDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import wollokDsl.WDelegatingConstructorCall;
import wollokDsl.WPositionalArgumentsList;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WDelegating Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WDelegatingConstructorCallImpl#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WDelegatingConstructorCallImpl extends MinimalEObjectImpl.Container implements WDelegatingConstructorCall {
	/**
	 * The cached value of the '{@link #getArgumentList() <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentList()
	 * @generated
	 * @ordered
	 */
	protected WPositionalArgumentsList argumentList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WDelegatingConstructorCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WDELEGATING_CONSTRUCTOR_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WPositionalArgumentsList getArgumentList() {
		return argumentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentList(WPositionalArgumentsList newArgumentList, NotificationChain msgs) {
		WPositionalArgumentsList oldArgumentList = argumentList;
		argumentList = newArgumentList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST, oldArgumentList, newArgumentList);
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
	public void setArgumentList(WPositionalArgumentsList newArgumentList) {
		if (newArgumentList != argumentList) {
			NotificationChain msgs = null;
			if (argumentList != null)
				msgs = ((InternalEObject)argumentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST, null, msgs);
			if (newArgumentList != null)
				msgs = ((InternalEObject)newArgumentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST, null, msgs);
			msgs = basicSetArgumentList(newArgumentList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST, newArgumentList, newArgumentList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WollokDslPackage.WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST:
				return basicSetArgumentList(null, msgs);
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
			case WollokDslPackage.WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST:
				return getArgumentList();
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
			case WollokDslPackage.WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST:
				setArgumentList((WPositionalArgumentsList)newValue);
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
			case WollokDslPackage.WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST:
				setArgumentList((WPositionalArgumentsList)null);
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
			case WollokDslPackage.WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST:
				return argumentList != null;
		}
		return super.eIsSet(featureID);
	}

} //WDelegatingConstructorCallImpl
