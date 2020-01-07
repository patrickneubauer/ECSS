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

import wollokDsl.WExpression;
import wollokDsl.WMethodDeclaration;
import wollokDsl.WParameter;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WMethod Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WMethodDeclarationImpl#isOverrides <em>Overrides</em>}</li>
 *   <li>{@link wollokDsl.impl.WMethodDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link wollokDsl.impl.WMethodDeclarationImpl#isNative <em>Native</em>}</li>
 *   <li>{@link wollokDsl.impl.WMethodDeclarationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link wollokDsl.impl.WMethodDeclarationImpl#isExpressionReturns <em>Expression Returns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WMethodDeclarationImpl extends WNamedImpl implements WMethodDeclaration {
	/**
	 * The default value of the '{@link #isOverrides() <em>Overrides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverrides()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERRIDES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverrides() <em>Overrides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverrides()
	 * @generated
	 * @ordered
	 */
	protected boolean overrides = OVERRIDES_EDEFAULT;

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
	 * The default value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected boolean native_ = NATIVE_EDEFAULT;

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
	 * The default value of the '{@link #isExpressionReturns() <em>Expression Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpressionReturns()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPRESSION_RETURNS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpressionReturns() <em>Expression Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpressionReturns()
	 * @generated
	 * @ordered
	 */
	protected boolean expressionReturns = EXPRESSION_RETURNS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WMethodDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WMETHOD_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOverrides() {
		return overrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrides(boolean newOverrides) {
		boolean oldOverrides = overrides;
		overrides = newOverrides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WMETHOD_DECLARATION__OVERRIDES, oldOverrides, overrides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<WParameter>(WParameter.class, this, WollokDslPackage.WMETHOD_DECLARATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNative() {
		return native_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNative(boolean newNative) {
		boolean oldNative = native_;
		native_ = newNative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WMETHOD_DECLARATION__NATIVE, oldNative, native_));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExpressionReturns() {
		return expressionReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionReturns(boolean newExpressionReturns) {
		boolean oldExpressionReturns = expressionReturns;
		expressionReturns = newExpressionReturns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION_RETURNS, oldExpressionReturns, expressionReturns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WollokDslPackage.WMETHOD_DECLARATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION:
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
			case WollokDslPackage.WMETHOD_DECLARATION__OVERRIDES:
				return isOverrides();
			case WollokDslPackage.WMETHOD_DECLARATION__PARAMETERS:
				return getParameters();
			case WollokDslPackage.WMETHOD_DECLARATION__NATIVE:
				return isNative();
			case WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION:
				return getExpression();
			case WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION_RETURNS:
				return isExpressionReturns();
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
			case WollokDslPackage.WMETHOD_DECLARATION__OVERRIDES:
				setOverrides((Boolean)newValue);
				return;
			case WollokDslPackage.WMETHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends WParameter>)newValue);
				return;
			case WollokDslPackage.WMETHOD_DECLARATION__NATIVE:
				setNative((Boolean)newValue);
				return;
			case WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION:
				setExpression((WExpression)newValue);
				return;
			case WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION_RETURNS:
				setExpressionReturns((Boolean)newValue);
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
			case WollokDslPackage.WMETHOD_DECLARATION__OVERRIDES:
				setOverrides(OVERRIDES_EDEFAULT);
				return;
			case WollokDslPackage.WMETHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				return;
			case WollokDslPackage.WMETHOD_DECLARATION__NATIVE:
				setNative(NATIVE_EDEFAULT);
				return;
			case WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION:
				setExpression((WExpression)null);
				return;
			case WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION_RETURNS:
				setExpressionReturns(EXPRESSION_RETURNS_EDEFAULT);
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
			case WollokDslPackage.WMETHOD_DECLARATION__OVERRIDES:
				return overrides != OVERRIDES_EDEFAULT;
			case WollokDslPackage.WMETHOD_DECLARATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case WollokDslPackage.WMETHOD_DECLARATION__NATIVE:
				return native_ != NATIVE_EDEFAULT;
			case WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION:
				return expression != null;
			case WollokDslPackage.WMETHOD_DECLARATION__EXPRESSION_RETURNS:
				return expressionReturns != EXPRESSION_RETURNS_EDEFAULT;
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
		result.append(" (overrides: ");
		result.append(overrides);
		result.append(", native: ");
		result.append(native_);
		result.append(", expressionReturns: ");
		result.append(expressionReturns);
		result.append(')');
		return result.toString();
	}

} //WMethodDeclarationImpl
