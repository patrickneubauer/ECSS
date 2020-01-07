/**
 */
package rIMDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rIMDsl.RIMDslPackage;
import rIMDsl.UriLink;
import rIMDsl.UriLinkage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uri Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.impl.UriLinkImpl#getTemplateProperty <em>Template Property</em>}</li>
 *   <li>{@link rIMDsl.impl.UriLinkImpl#getEntityProperty <em>Entity Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UriLinkImpl extends MinimalEObjectImpl.Container implements UriLink {
	/**
	 * The default value of the '{@link #getTemplateProperty() <em>Template Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateProperty() <em>Template Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateProperty()
	 * @generated
	 * @ordered
	 */
	protected String templateProperty = TEMPLATE_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntityProperty() <em>Entity Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityProperty()
	 * @generated
	 * @ordered
	 */
	protected UriLinkage entityProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UriLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMDslPackage.Literals.URI_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateProperty() {
		return templateProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateProperty(String newTemplateProperty) {
		String oldTemplateProperty = templateProperty;
		templateProperty = newTemplateProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.URI_LINK__TEMPLATE_PROPERTY, oldTemplateProperty, templateProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UriLinkage getEntityProperty() {
		return entityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityProperty(UriLinkage newEntityProperty, NotificationChain msgs) {
		UriLinkage oldEntityProperty = entityProperty;
		entityProperty = newEntityProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.URI_LINK__ENTITY_PROPERTY, oldEntityProperty, newEntityProperty);
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
	public void setEntityProperty(UriLinkage newEntityProperty) {
		if (newEntityProperty != entityProperty) {
			NotificationChain msgs = null;
			if (entityProperty != null)
				msgs = ((InternalEObject)entityProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.URI_LINK__ENTITY_PROPERTY, null, msgs);
			if (newEntityProperty != null)
				msgs = ((InternalEObject)newEntityProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.URI_LINK__ENTITY_PROPERTY, null, msgs);
			msgs = basicSetEntityProperty(newEntityProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.URI_LINK__ENTITY_PROPERTY, newEntityProperty, newEntityProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RIMDslPackage.URI_LINK__ENTITY_PROPERTY:
				return basicSetEntityProperty(null, msgs);
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
			case RIMDslPackage.URI_LINK__TEMPLATE_PROPERTY:
				return getTemplateProperty();
			case RIMDslPackage.URI_LINK__ENTITY_PROPERTY:
				return getEntityProperty();
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
			case RIMDslPackage.URI_LINK__TEMPLATE_PROPERTY:
				setTemplateProperty((String)newValue);
				return;
			case RIMDslPackage.URI_LINK__ENTITY_PROPERTY:
				setEntityProperty((UriLinkage)newValue);
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
			case RIMDslPackage.URI_LINK__TEMPLATE_PROPERTY:
				setTemplateProperty(TEMPLATE_PROPERTY_EDEFAULT);
				return;
			case RIMDslPackage.URI_LINK__ENTITY_PROPERTY:
				setEntityProperty((UriLinkage)null);
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
			case RIMDslPackage.URI_LINK__TEMPLATE_PROPERTY:
				return TEMPLATE_PROPERTY_EDEFAULT == null ? templateProperty != null : !TEMPLATE_PROPERTY_EDEFAULT.equals(templateProperty);
			case RIMDslPackage.URI_LINK__ENTITY_PROPERTY:
				return entityProperty != null;
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
		result.append(" (templateProperty: ");
		result.append(templateProperty);
		result.append(')');
		return result.toString();
	}

} //UriLinkImpl
