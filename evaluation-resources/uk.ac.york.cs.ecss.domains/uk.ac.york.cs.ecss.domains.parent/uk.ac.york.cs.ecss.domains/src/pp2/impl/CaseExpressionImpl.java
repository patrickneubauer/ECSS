/**
 */
package pp2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pp2.Case;
import pp2.CaseExpression;
import pp2.Expression;
import pp2.Pp2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pp2.impl.CaseExpressionImpl#getSwitchExpr <em>Switch Expr</em>}</li>
 *   <li>{@link pp2.impl.CaseExpressionImpl#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseExpressionImpl extends ExpressionImpl implements CaseExpression {
	/**
	 * The cached value of the '{@link #getSwitchExpr() <em>Switch Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression switchExpr;

	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<Case> cases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pp2Package.Literals.CASE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getSwitchExpr() {
		return switchExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchExpr(Expression newSwitchExpr, NotificationChain msgs) {
		Expression oldSwitchExpr = switchExpr;
		switchExpr = newSwitchExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pp2Package.CASE_EXPRESSION__SWITCH_EXPR, oldSwitchExpr, newSwitchExpr);
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
	public void setSwitchExpr(Expression newSwitchExpr) {
		if (newSwitchExpr != switchExpr) {
			NotificationChain msgs = null;
			if (switchExpr != null)
				msgs = ((InternalEObject)switchExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pp2Package.CASE_EXPRESSION__SWITCH_EXPR, null, msgs);
			if (newSwitchExpr != null)
				msgs = ((InternalEObject)newSwitchExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pp2Package.CASE_EXPRESSION__SWITCH_EXPR, null, msgs);
			msgs = basicSetSwitchExpr(newSwitchExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp2Package.CASE_EXPRESSION__SWITCH_EXPR, newSwitchExpr, newSwitchExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Case> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList<Case>(Case.class, this, Pp2Package.CASE_EXPRESSION__CASES);
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pp2Package.CASE_EXPRESSION__SWITCH_EXPR:
				return basicSetSwitchExpr(null, msgs);
			case Pp2Package.CASE_EXPRESSION__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
			case Pp2Package.CASE_EXPRESSION__SWITCH_EXPR:
				return getSwitchExpr();
			case Pp2Package.CASE_EXPRESSION__CASES:
				return getCases();
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
			case Pp2Package.CASE_EXPRESSION__SWITCH_EXPR:
				setSwitchExpr((Expression)newValue);
				return;
			case Pp2Package.CASE_EXPRESSION__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends Case>)newValue);
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
			case Pp2Package.CASE_EXPRESSION__SWITCH_EXPR:
				setSwitchExpr((Expression)null);
				return;
			case Pp2Package.CASE_EXPRESSION__CASES:
				getCases().clear();
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
			case Pp2Package.CASE_EXPRESSION__SWITCH_EXPR:
				return switchExpr != null;
			case Pp2Package.CASE_EXPRESSION__CASES:
				return cases != null && !cases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaseExpressionImpl
