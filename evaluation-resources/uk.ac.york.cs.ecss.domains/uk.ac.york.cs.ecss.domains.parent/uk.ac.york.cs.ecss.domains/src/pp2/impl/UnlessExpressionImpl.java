/**
 */
package pp2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pp2.Expression;
import pp2.Pp2Package;
import pp2.UnlessExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unless Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pp2.impl.UnlessExpressionImpl#getCondExpr <em>Cond Expr</em>}</li>
 *   <li>{@link pp2.impl.UnlessExpressionImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnlessExpressionImpl extends ExpressionBlockImpl implements UnlessExpression {
	/**
	 * The cached value of the '{@link #getCondExpr() <em>Cond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression condExpr;

	/**
	 * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatement()
	 * @generated
	 * @ordered
	 */
	protected Expression elseStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnlessExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pp2Package.Literals.UNLESS_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCondExpr() {
		return condExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondExpr(Expression newCondExpr, NotificationChain msgs) {
		Expression oldCondExpr = condExpr;
		condExpr = newCondExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pp2Package.UNLESS_EXPRESSION__COND_EXPR, oldCondExpr, newCondExpr);
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
	public void setCondExpr(Expression newCondExpr) {
		if (newCondExpr != condExpr) {
			NotificationChain msgs = null;
			if (condExpr != null)
				msgs = ((InternalEObject)condExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pp2Package.UNLESS_EXPRESSION__COND_EXPR, null, msgs);
			if (newCondExpr != null)
				msgs = ((InternalEObject)newCondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pp2Package.UNLESS_EXPRESSION__COND_EXPR, null, msgs);
			msgs = basicSetCondExpr(newCondExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp2Package.UNLESS_EXPRESSION__COND_EXPR, newCondExpr, newCondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getElseStatement() {
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseStatement(Expression newElseStatement, NotificationChain msgs) {
		Expression oldElseStatement = elseStatement;
		elseStatement = newElseStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pp2Package.UNLESS_EXPRESSION__ELSE_STATEMENT, oldElseStatement, newElseStatement);
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
	public void setElseStatement(Expression newElseStatement) {
		if (newElseStatement != elseStatement) {
			NotificationChain msgs = null;
			if (elseStatement != null)
				msgs = ((InternalEObject)elseStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pp2Package.UNLESS_EXPRESSION__ELSE_STATEMENT, null, msgs);
			if (newElseStatement != null)
				msgs = ((InternalEObject)newElseStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pp2Package.UNLESS_EXPRESSION__ELSE_STATEMENT, null, msgs);
			msgs = basicSetElseStatement(newElseStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp2Package.UNLESS_EXPRESSION__ELSE_STATEMENT, newElseStatement, newElseStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pp2Package.UNLESS_EXPRESSION__COND_EXPR:
				return basicSetCondExpr(null, msgs);
			case Pp2Package.UNLESS_EXPRESSION__ELSE_STATEMENT:
				return basicSetElseStatement(null, msgs);
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
			case Pp2Package.UNLESS_EXPRESSION__COND_EXPR:
				return getCondExpr();
			case Pp2Package.UNLESS_EXPRESSION__ELSE_STATEMENT:
				return getElseStatement();
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
			case Pp2Package.UNLESS_EXPRESSION__COND_EXPR:
				setCondExpr((Expression)newValue);
				return;
			case Pp2Package.UNLESS_EXPRESSION__ELSE_STATEMENT:
				setElseStatement((Expression)newValue);
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
			case Pp2Package.UNLESS_EXPRESSION__COND_EXPR:
				setCondExpr((Expression)null);
				return;
			case Pp2Package.UNLESS_EXPRESSION__ELSE_STATEMENT:
				setElseStatement((Expression)null);
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
			case Pp2Package.UNLESS_EXPRESSION__COND_EXPR:
				return condExpr != null;
			case Pp2Package.UNLESS_EXPRESSION__ELSE_STATEMENT:
				return elseStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //UnlessExpressionImpl
