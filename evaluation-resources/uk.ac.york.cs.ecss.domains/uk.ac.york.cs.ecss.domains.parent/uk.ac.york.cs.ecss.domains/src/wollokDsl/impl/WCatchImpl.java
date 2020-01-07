/**
 */
package wollokDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import wollokDsl.WCatch;
import wollokDsl.WClass;
import wollokDsl.WExpression;
import wollokDsl.WVariable;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WCatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WCatchImpl#getExceptionVarName <em>Exception Var Name</em>}</li>
 *   <li>{@link wollokDsl.impl.WCatchImpl#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link wollokDsl.impl.WCatchImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WCatchImpl extends MinimalEObjectImpl.Container implements WCatch {
	/**
	 * The cached value of the '{@link #getExceptionVarName() <em>Exception Var Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionVarName()
	 * @generated
	 * @ordered
	 */
	protected WVariable exceptionVarName;

	/**
	 * The cached value of the '{@link #getExceptionType() <em>Exception Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected WClass exceptionType;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected WExpression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WCatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WCATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WVariable getExceptionVarName() {
		return exceptionVarName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionVarName(WVariable newExceptionVarName, NotificationChain msgs) {
		WVariable oldExceptionVarName = exceptionVarName;
		exceptionVarName = newExceptionVarName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCATCH__EXCEPTION_VAR_NAME, oldExceptionVarName, newExceptionVarName);
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
	public void setExceptionVarName(WVariable newExceptionVarName) {
		if (newExceptionVarName != exceptionVarName) {
			NotificationChain msgs = null;
			if (exceptionVarName != null)
				msgs = ((InternalEObject)exceptionVarName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WCATCH__EXCEPTION_VAR_NAME, null, msgs);
			if (newExceptionVarName != null)
				msgs = ((InternalEObject)newExceptionVarName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WCATCH__EXCEPTION_VAR_NAME, null, msgs);
			msgs = basicSetExceptionVarName(newExceptionVarName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCATCH__EXCEPTION_VAR_NAME, newExceptionVarName, newExceptionVarName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WClass getExceptionType() {
		if (exceptionType != null && exceptionType.eIsProxy()) {
			InternalEObject oldExceptionType = (InternalEObject)exceptionType;
			exceptionType = (WClass)eResolveProxy(oldExceptionType);
			if (exceptionType != oldExceptionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WollokDslPackage.WCATCH__EXCEPTION_TYPE, oldExceptionType, exceptionType));
			}
		}
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WClass basicGetExceptionType() {
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionType(WClass newExceptionType) {
		WClass oldExceptionType = exceptionType;
		exceptionType = newExceptionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCATCH__EXCEPTION_TYPE, oldExceptionType, exceptionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(WExpression newExpression, NotificationChain msgs) {
		WExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCATCH__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(WExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WCATCH__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WCATCH__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCATCH__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WollokDslPackage.WCATCH__EXCEPTION_VAR_NAME:
				return basicSetExceptionVarName(null, msgs);
			case WollokDslPackage.WCATCH__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case WollokDslPackage.WCATCH__EXCEPTION_VAR_NAME:
				return getExceptionVarName();
			case WollokDslPackage.WCATCH__EXCEPTION_TYPE:
				if (resolve) return getExceptionType();
				return basicGetExceptionType();
			case WollokDslPackage.WCATCH__EXPRESSION:
				return getExpression();
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
			case WollokDslPackage.WCATCH__EXCEPTION_VAR_NAME:
				setExceptionVarName((WVariable)newValue);
				return;
			case WollokDslPackage.WCATCH__EXCEPTION_TYPE:
				setExceptionType((WClass)newValue);
				return;
			case WollokDslPackage.WCATCH__EXPRESSION:
				setExpression((WExpression)newValue);
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
			case WollokDslPackage.WCATCH__EXCEPTION_VAR_NAME:
				setExceptionVarName((WVariable)null);
				return;
			case WollokDslPackage.WCATCH__EXCEPTION_TYPE:
				setExceptionType((WClass)null);
				return;
			case WollokDslPackage.WCATCH__EXPRESSION:
				setExpression((WExpression)null);
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
			case WollokDslPackage.WCATCH__EXCEPTION_VAR_NAME:
				return exceptionVarName != null;
			case WollokDslPackage.WCATCH__EXCEPTION_TYPE:
				return exceptionType != null;
			case WollokDslPackage.WCATCH__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //WCatchImpl
