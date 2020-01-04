/**
 */
package pp2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pp2.AttributeOperations;
import pp2.Expression;
import pp2.Pp2Package;
import pp2.ResourceBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pp2.impl.ResourceBodyImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link pp2.impl.ResourceBodyImpl#getNameExpr <em>Name Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceBodyImpl extends MinimalEObjectImpl.Container implements ResourceBody {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected AttributeOperations attributes;

	/**
	 * The cached value of the '{@link #getNameExpr() <em>Name Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression nameExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pp2Package.Literals.RESOURCE_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeOperations getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(AttributeOperations newAttributes, NotificationChain msgs) {
		AttributeOperations oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pp2Package.RESOURCE_BODY__ATTRIBUTES, oldAttributes, newAttributes);
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
	public void setAttributes(AttributeOperations newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pp2Package.RESOURCE_BODY__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pp2Package.RESOURCE_BODY__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp2Package.RESOURCE_BODY__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getNameExpr() {
		return nameExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameExpr(Expression newNameExpr, NotificationChain msgs) {
		Expression oldNameExpr = nameExpr;
		nameExpr = newNameExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pp2Package.RESOURCE_BODY__NAME_EXPR, oldNameExpr, newNameExpr);
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
	public void setNameExpr(Expression newNameExpr) {
		if (newNameExpr != nameExpr) {
			NotificationChain msgs = null;
			if (nameExpr != null)
				msgs = ((InternalEObject)nameExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pp2Package.RESOURCE_BODY__NAME_EXPR, null, msgs);
			if (newNameExpr != null)
				msgs = ((InternalEObject)newNameExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pp2Package.RESOURCE_BODY__NAME_EXPR, null, msgs);
			msgs = basicSetNameExpr(newNameExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pp2Package.RESOURCE_BODY__NAME_EXPR, newNameExpr, newNameExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pp2Package.RESOURCE_BODY__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case Pp2Package.RESOURCE_BODY__NAME_EXPR:
				return basicSetNameExpr(null, msgs);
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
			case Pp2Package.RESOURCE_BODY__ATTRIBUTES:
				return getAttributes();
			case Pp2Package.RESOURCE_BODY__NAME_EXPR:
				return getNameExpr();
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
			case Pp2Package.RESOURCE_BODY__ATTRIBUTES:
				setAttributes((AttributeOperations)newValue);
				return;
			case Pp2Package.RESOURCE_BODY__NAME_EXPR:
				setNameExpr((Expression)newValue);
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
			case Pp2Package.RESOURCE_BODY__ATTRIBUTES:
				setAttributes((AttributeOperations)null);
				return;
			case Pp2Package.RESOURCE_BODY__NAME_EXPR:
				setNameExpr((Expression)null);
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
			case Pp2Package.RESOURCE_BODY__ATTRIBUTES:
				return attributes != null;
			case Pp2Package.RESOURCE_BODY__NAME_EXPR:
				return nameExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceBodyImpl
