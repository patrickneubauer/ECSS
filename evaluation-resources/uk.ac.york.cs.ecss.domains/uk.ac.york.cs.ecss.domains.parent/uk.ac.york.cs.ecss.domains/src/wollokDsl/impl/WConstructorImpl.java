/**
 */
package wollokDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wollokDsl.WConstructor;
import wollokDsl.WDelegatingConstructorCall;
import wollokDsl.WExpression;
import wollokDsl.WParameter;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WConstructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WConstructorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link wollokDsl.impl.WConstructorImpl#getDelegatingConstructorCall <em>Delegating Constructor Call</em>}</li>
 *   <li>{@link wollokDsl.impl.WConstructorImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WConstructorImpl extends MinimalEObjectImpl.Container implements WConstructor {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<WParameter> parameters;

	/**
	 * The cached value of the '{@link #getDelegatingConstructorCall() <em>Delegating Constructor Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatingConstructorCall()
	 * @generated
	 * @ordered
	 */
	protected WDelegatingConstructorCall delegatingConstructorCall;

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
	protected WConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WCONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<WParameter>(WParameter.class, this, WollokDslPackage.WCONSTRUCTOR__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WDelegatingConstructorCall getDelegatingConstructorCall() {
		return delegatingConstructorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegatingConstructorCall(WDelegatingConstructorCall newDelegatingConstructorCall, NotificationChain msgs) {
		WDelegatingConstructorCall oldDelegatingConstructorCall = delegatingConstructorCall;
		delegatingConstructorCall = newDelegatingConstructorCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL, oldDelegatingConstructorCall, newDelegatingConstructorCall);
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
	public void setDelegatingConstructorCall(WDelegatingConstructorCall newDelegatingConstructorCall) {
		if (newDelegatingConstructorCall != delegatingConstructorCall) {
			NotificationChain msgs = null;
			if (delegatingConstructorCall != null)
				msgs = ((InternalEObject)delegatingConstructorCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL, null, msgs);
			if (newDelegatingConstructorCall != null)
				msgs = ((InternalEObject)newDelegatingConstructorCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL, null, msgs);
			msgs = basicSetDelegatingConstructorCall(newDelegatingConstructorCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL, newDelegatingConstructorCall, newDelegatingConstructorCall));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCONSTRUCTOR__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WCONSTRUCTOR__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WCONSTRUCTOR__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCONSTRUCTOR__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WollokDslPackage.WCONSTRUCTOR__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case WollokDslPackage.WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL:
				return basicSetDelegatingConstructorCall(null, msgs);
			case WollokDslPackage.WCONSTRUCTOR__EXPRESSION:
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
			case WollokDslPackage.WCONSTRUCTOR__PARAMETERS:
				return getParameters();
			case WollokDslPackage.WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL:
				return getDelegatingConstructorCall();
			case WollokDslPackage.WCONSTRUCTOR__EXPRESSION:
				return getExpression();
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
			case WollokDslPackage.WCONSTRUCTOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends WParameter>)newValue);
				return;
			case WollokDslPackage.WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL:
				setDelegatingConstructorCall((WDelegatingConstructorCall)newValue);
				return;
			case WollokDslPackage.WCONSTRUCTOR__EXPRESSION:
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
			case WollokDslPackage.WCONSTRUCTOR__PARAMETERS:
				getParameters().clear();
				return;
			case WollokDslPackage.WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL:
				setDelegatingConstructorCall((WDelegatingConstructorCall)null);
				return;
			case WollokDslPackage.WCONSTRUCTOR__EXPRESSION:
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
			case WollokDslPackage.WCONSTRUCTOR__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case WollokDslPackage.WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL:
				return delegatingConstructorCall != null;
			case WollokDslPackage.WCONSTRUCTOR__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //WConstructorImpl
