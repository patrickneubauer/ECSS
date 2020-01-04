/**
 */
package pp1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pp1.Expression;
import pp1.Pp1Package;
import pp1.ResourceBody;
import pp1.ResourceExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pp1.impl.ResourceExpressionImpl#getResourceExpr <em>Resource Expr</em>}</li>
 *   <li>{@link pp1.impl.ResourceExpressionImpl#getResourceData <em>Resource Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceExpressionImpl extends ExpressionImpl implements ResourceExpression {
	/**
	 * The cached value of the '{@link #getResourceExpr() <em>Resource Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression resourceExpr;

	/**
	 * The cached value of the '{@link #getResourceData() <em>Resource Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceData()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceBody> resourceData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pp1Package.Literals.RESOURCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getResourceExpr() {
		return resourceExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceExpr(Expression newResourceExpr, NotificationChain msgs) {
		Expression oldResourceExpr = resourceExpr;
		resourceExpr = newResourceExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pp1Package.RESOURCE_EXPRESSION__RESOURCE_EXPR, oldResourceExpr, newResourceExpr);
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
	public void setResourceExpr(Expression newResourceExpr) {
		if (newResourceExpr != resourceExpr) {
			NotificationChain msgs = null;
			if (resourceExpr != null)
				msgs = ((InternalEObject)resourceExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pp1Package.RESOURCE_EXPRESSION__RESOURCE_EXPR, null, msgs);
			if (newResourceExpr != null)
				msgs = ((InternalEObject)newResourceExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pp1Package.RESOURCE_EXPRESSION__RESOURCE_EXPR, null, msgs);
			msgs = basicSetResourceExpr(newResourceExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp1Package.RESOURCE_EXPRESSION__RESOURCE_EXPR, newResourceExpr, newResourceExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceBody> getResourceData() {
		if (resourceData == null) {
			resourceData = new EObjectContainmentEList<ResourceBody>(ResourceBody.class, this, Pp1Package.RESOURCE_EXPRESSION__RESOURCE_DATA);
		}
		return resourceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pp1Package.RESOURCE_EXPRESSION__RESOURCE_EXPR:
				return basicSetResourceExpr(null, msgs);
			case Pp1Package.RESOURCE_EXPRESSION__RESOURCE_DATA:
				return ((InternalEList<?>)getResourceData()).basicRemove(otherEnd, msgs);
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
			case Pp1Package.RESOURCE_EXPRESSION__RESOURCE_EXPR:
				return getResourceExpr();
			case Pp1Package.RESOURCE_EXPRESSION__RESOURCE_DATA:
				return getResourceData();
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
			case Pp1Package.RESOURCE_EXPRESSION__RESOURCE_EXPR:
				setResourceExpr((Expression)newValue);
				return;
			case Pp1Package.RESOURCE_EXPRESSION__RESOURCE_DATA:
				getResourceData().clear();
				getResourceData().addAll((Collection<? extends ResourceBody>)newValue);
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
			case Pp1Package.RESOURCE_EXPRESSION__RESOURCE_EXPR:
				setResourceExpr((Expression)null);
				return;
			case Pp1Package.RESOURCE_EXPRESSION__RESOURCE_DATA:
				getResourceData().clear();
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
			case Pp1Package.RESOURCE_EXPRESSION__RESOURCE_EXPR:
				return resourceExpr != null;
			case Pp1Package.RESOURCE_EXPRESSION__RESOURCE_DATA:
				return resourceData != null && !resourceData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceExpressionImpl
