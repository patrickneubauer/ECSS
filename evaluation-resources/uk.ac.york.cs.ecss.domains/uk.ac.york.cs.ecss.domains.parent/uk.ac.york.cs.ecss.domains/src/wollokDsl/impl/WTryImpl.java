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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wollokDsl.WCatch;
import wollokDsl.WExpression;
import wollokDsl.WTry;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WTry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WTryImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link wollokDsl.impl.WTryImpl#getCatchBlocks <em>Catch Blocks</em>}</li>
 *   <li>{@link wollokDsl.impl.WTryImpl#getAlwaysExpression <em>Always Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WTryImpl extends WExpressionImpl implements WTry {
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
	 * The cached value of the '{@link #getCatchBlocks() <em>Catch Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<WCatch> catchBlocks;

	/**
	 * The cached value of the '{@link #getAlwaysExpression() <em>Always Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlwaysExpression()
	 * @generated
	 * @ordered
	 */
	protected WExpression alwaysExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WTryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WTRY;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WTRY__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WTRY__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WTRY__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WTRY__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WCatch> getCatchBlocks() {
		if (catchBlocks == null) {
			catchBlocks = new EObjectContainmentEList<WCatch>(WCatch.class, this, WollokDslPackage.WTRY__CATCH_BLOCKS);
		}
		return catchBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WExpression getAlwaysExpression() {
		return alwaysExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlwaysExpression(WExpression newAlwaysExpression, NotificationChain msgs) {
		WExpression oldAlwaysExpression = alwaysExpression;
		alwaysExpression = newAlwaysExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WTRY__ALWAYS_EXPRESSION, oldAlwaysExpression, newAlwaysExpression);
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
	public void setAlwaysExpression(WExpression newAlwaysExpression) {
		if (newAlwaysExpression != alwaysExpression) {
			NotificationChain msgs = null;
			if (alwaysExpression != null)
				msgs = ((InternalEObject)alwaysExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WTRY__ALWAYS_EXPRESSION, null, msgs);
			if (newAlwaysExpression != null)
				msgs = ((InternalEObject)newAlwaysExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WTRY__ALWAYS_EXPRESSION, null, msgs);
			msgs = basicSetAlwaysExpression(newAlwaysExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WTRY__ALWAYS_EXPRESSION, newAlwaysExpression, newAlwaysExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WollokDslPackage.WTRY__EXPRESSION:
				return basicSetExpression(null, msgs);
			case WollokDslPackage.WTRY__CATCH_BLOCKS:
				return ((InternalEList<?>)getCatchBlocks()).basicRemove(otherEnd, msgs);
			case WollokDslPackage.WTRY__ALWAYS_EXPRESSION:
				return basicSetAlwaysExpression(null, msgs);
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
			case WollokDslPackage.WTRY__EXPRESSION:
				return getExpression();
			case WollokDslPackage.WTRY__CATCH_BLOCKS:
				return getCatchBlocks();
			case WollokDslPackage.WTRY__ALWAYS_EXPRESSION:
				return getAlwaysExpression();
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
			case WollokDslPackage.WTRY__EXPRESSION:
				setExpression((WExpression)newValue);
				return;
			case WollokDslPackage.WTRY__CATCH_BLOCKS:
				getCatchBlocks().clear();
				getCatchBlocks().addAll((Collection<? extends WCatch>)newValue);
				return;
			case WollokDslPackage.WTRY__ALWAYS_EXPRESSION:
				setAlwaysExpression((WExpression)newValue);
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
			case WollokDslPackage.WTRY__EXPRESSION:
				setExpression((WExpression)null);
				return;
			case WollokDslPackage.WTRY__CATCH_BLOCKS:
				getCatchBlocks().clear();
				return;
			case WollokDslPackage.WTRY__ALWAYS_EXPRESSION:
				setAlwaysExpression((WExpression)null);
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
			case WollokDslPackage.WTRY__EXPRESSION:
				return expression != null;
			case WollokDslPackage.WTRY__CATCH_BLOCKS:
				return catchBlocks != null && !catchBlocks.isEmpty();
			case WollokDslPackage.WTRY__ALWAYS_EXPRESSION:
				return alwaysExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //WTryImpl
