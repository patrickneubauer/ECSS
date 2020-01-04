/**
 */
package pp2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pp2.Expression;
import pp2.MethodCall;
import pp2.Pp2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pp2.impl.MethodCallImpl#isParenthesized <em>Parenthesized</em>}</li>
 *   <li>{@link pp2.impl.MethodCallImpl#getMethodExpr <em>Method Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCallImpl extends WithLambdaExpressionImpl implements MethodCall {
	/**
	 * The default value of the '{@link #isParenthesized() <em>Parenthesized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParenthesized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARENTHESIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParenthesized() <em>Parenthesized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParenthesized()
	 * @generated
	 * @ordered
	 */
	protected boolean parenthesized = PARENTHESIZED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethodExpr() <em>Method Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression methodExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pp2Package.Literals.METHOD_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isParenthesized() {
		return parenthesized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParenthesized(boolean newParenthesized) {
		boolean oldParenthesized = parenthesized;
		parenthesized = newParenthesized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp2Package.METHOD_CALL__PARENTHESIZED, oldParenthesized, parenthesized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getMethodExpr() {
		return methodExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodExpr(Expression newMethodExpr, NotificationChain msgs) {
		Expression oldMethodExpr = methodExpr;
		methodExpr = newMethodExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pp2Package.METHOD_CALL__METHOD_EXPR, oldMethodExpr, newMethodExpr);
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
	public void setMethodExpr(Expression newMethodExpr) {
		if (newMethodExpr != methodExpr) {
			NotificationChain msgs = null;
			if (methodExpr != null)
				msgs = ((InternalEObject)methodExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pp2Package.METHOD_CALL__METHOD_EXPR, null, msgs);
			if (newMethodExpr != null)
				msgs = ((InternalEObject)newMethodExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pp2Package.METHOD_CALL__METHOD_EXPR, null, msgs);
			msgs = basicSetMethodExpr(newMethodExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp2Package.METHOD_CALL__METHOD_EXPR, newMethodExpr, newMethodExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pp2Package.METHOD_CALL__METHOD_EXPR:
				return basicSetMethodExpr(null, msgs);
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
			case Pp2Package.METHOD_CALL__PARENTHESIZED:
				return isParenthesized();
			case Pp2Package.METHOD_CALL__METHOD_EXPR:
				return getMethodExpr();
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
			case Pp2Package.METHOD_CALL__PARENTHESIZED:
				setParenthesized((Boolean)newValue);
				return;
			case Pp2Package.METHOD_CALL__METHOD_EXPR:
				setMethodExpr((Expression)newValue);
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
			case Pp2Package.METHOD_CALL__PARENTHESIZED:
				setParenthesized(PARENTHESIZED_EDEFAULT);
				return;
			case Pp2Package.METHOD_CALL__METHOD_EXPR:
				setMethodExpr((Expression)null);
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
			case Pp2Package.METHOD_CALL__PARENTHESIZED:
				return parenthesized != PARENTHESIZED_EDEFAULT;
			case Pp2Package.METHOD_CALL__METHOD_EXPR:
				return methodExpr != null;
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
		result.append(" (parenthesized: ");
		result.append(parenthesized);
		result.append(')');
		return result.toString();
	}

} //MethodCallImpl
