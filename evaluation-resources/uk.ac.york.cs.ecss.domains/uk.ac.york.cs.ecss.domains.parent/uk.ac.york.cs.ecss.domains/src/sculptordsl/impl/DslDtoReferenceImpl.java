/**
 */
package sculptordsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sculptordsl.DslDtoReference;
import sculptordsl.DslSimpleDomainObject;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Dto Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslDtoReferenceImpl#getDomainObjectType <em>Domain Object Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDtoReferenceImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDtoReferenceImpl#getValidMessage <em>Valid Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslDtoReferenceImpl extends DslDtoPropertyImpl implements DslDtoReference {
	/**
	 * The cached value of the '{@link #getDomainObjectType() <em>Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectType()
	 * @generated
	 * @ordered
	 */
	protected DslSimpleDomainObject domainObjectType;

	/**
	 * The default value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected boolean valid = VALID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidMessage() <em>Valid Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidMessage() <em>Valid Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidMessage()
	 * @generated
	 * @ordered
	 */
	protected String validMessage = VALID_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslDtoReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_DTO_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslSimpleDomainObject getDomainObjectType() {
		if (domainObjectType != null && domainObjectType.eIsProxy()) {
			InternalEObject oldDomainObjectType = (InternalEObject)domainObjectType;
			domainObjectType = (DslSimpleDomainObject)eResolveProxy(oldDomainObjectType);
			if (domainObjectType != oldDomainObjectType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptordslPackage.DSL_DTO_REFERENCE__DOMAIN_OBJECT_TYPE, oldDomainObjectType, domainObjectType));
			}
		}
		return domainObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslSimpleDomainObject basicGetDomainObjectType() {
		return domainObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainObjectType(DslSimpleDomainObject newDomainObjectType) {
		DslSimpleDomainObject oldDomainObjectType = domainObjectType;
		domainObjectType = newDomainObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DTO_REFERENCE__DOMAIN_OBJECT_TYPE, oldDomainObjectType, domainObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValid() {
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValid(boolean newValid) {
		boolean oldValid = valid;
		valid = newValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DTO_REFERENCE__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidMessage() {
		return validMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidMessage(String newValidMessage) {
		String oldValidMessage = validMessage;
		validMessage = newValidMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DTO_REFERENCE__VALID_MESSAGE, oldValidMessage, validMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptordslPackage.DSL_DTO_REFERENCE__DOMAIN_OBJECT_TYPE:
				if (resolve) return getDomainObjectType();
				return basicGetDomainObjectType();
			case SculptordslPackage.DSL_DTO_REFERENCE__VALID:
				return isValid();
			case SculptordslPackage.DSL_DTO_REFERENCE__VALID_MESSAGE:
				return getValidMessage();
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
			case SculptordslPackage.DSL_DTO_REFERENCE__DOMAIN_OBJECT_TYPE:
				setDomainObjectType((DslSimpleDomainObject)newValue);
				return;
			case SculptordslPackage.DSL_DTO_REFERENCE__VALID:
				setValid((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_DTO_REFERENCE__VALID_MESSAGE:
				setValidMessage((String)newValue);
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
			case SculptordslPackage.DSL_DTO_REFERENCE__DOMAIN_OBJECT_TYPE:
				setDomainObjectType((DslSimpleDomainObject)null);
				return;
			case SculptordslPackage.DSL_DTO_REFERENCE__VALID:
				setValid(VALID_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DTO_REFERENCE__VALID_MESSAGE:
				setValidMessage(VALID_MESSAGE_EDEFAULT);
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
			case SculptordslPackage.DSL_DTO_REFERENCE__DOMAIN_OBJECT_TYPE:
				return domainObjectType != null;
			case SculptordslPackage.DSL_DTO_REFERENCE__VALID:
				return valid != VALID_EDEFAULT;
			case SculptordslPackage.DSL_DTO_REFERENCE__VALID_MESSAGE:
				return VALID_MESSAGE_EDEFAULT == null ? validMessage != null : !VALID_MESSAGE_EDEFAULT.equals(validMessage);
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
		result.append(" (valid: ");
		result.append(valid);
		result.append(", validMessage: ");
		result.append(validMessage);
		result.append(')');
		return result.toString();
	}

} //DslDtoReferenceImpl
