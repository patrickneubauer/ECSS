/**
 */
package pp1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pp1.Lambda;
import pp1.Pp1Package;
import pp1.WithLambdaExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>With Lambda Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pp1.impl.WithLambdaExpressionImpl#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WithLambdaExpressionImpl extends ParameterizedExpressionImpl implements WithLambdaExpression {
	/**
	 * The cached value of the '{@link #getLambda() <em>Lambda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambda()
	 * @generated
	 * @ordered
	 */
	protected Lambda lambda;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WithLambdaExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pp1Package.Literals.WITH_LAMBDA_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lambda getLambda() {
		return lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLambda(Lambda newLambda, NotificationChain msgs) {
		Lambda oldLambda = lambda;
		lambda = newLambda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pp1Package.WITH_LAMBDA_EXPRESSION__LAMBDA, oldLambda, newLambda);
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
	public void setLambda(Lambda newLambda) {
		if (newLambda != lambda) {
			NotificationChain msgs = null;
			if (lambda != null)
				msgs = ((InternalEObject)lambda).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pp1Package.WITH_LAMBDA_EXPRESSION__LAMBDA, null, msgs);
			if (newLambda != null)
				msgs = ((InternalEObject)newLambda).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pp1Package.WITH_LAMBDA_EXPRESSION__LAMBDA, null, msgs);
			msgs = basicSetLambda(newLambda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp1Package.WITH_LAMBDA_EXPRESSION__LAMBDA, newLambda, newLambda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pp1Package.WITH_LAMBDA_EXPRESSION__LAMBDA:
				return basicSetLambda(null, msgs);
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
			case Pp1Package.WITH_LAMBDA_EXPRESSION__LAMBDA:
				return getLambda();
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
			case Pp1Package.WITH_LAMBDA_EXPRESSION__LAMBDA:
				setLambda((Lambda)newValue);
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
			case Pp1Package.WITH_LAMBDA_EXPRESSION__LAMBDA:
				setLambda((Lambda)null);
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
			case Pp1Package.WITH_LAMBDA_EXPRESSION__LAMBDA:
				return lambda != null;
		}
		return super.eIsSet(featureID);
	}

} //WithLambdaExpressionImpl
