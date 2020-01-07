/**
 */
package sculptordsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sculptordsl.DslCollectionType;
import sculptordsl.DslComplexType;
import sculptordsl.DslSimpleDomainObject;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslComplexTypeImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslComplexTypeImpl#getDomainObjectType <em>Domain Object Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslComplexTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslComplexTypeImpl#getMapCollectionType <em>Map Collection Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslComplexTypeImpl#getMapKeyType <em>Map Key Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslComplexTypeImpl#getMapKeyDomainObjectType <em>Map Key Domain Object Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslComplexTypeImpl extends MinimalEObjectImpl.Container implements DslComplexType {
	/**
	 * The default value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected static final DslCollectionType COLLECTION_TYPE_EDEFAULT = DslCollectionType.NONE;

	/**
	 * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected DslCollectionType collectionType = COLLECTION_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapCollectionType() <em>Map Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapCollectionType()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_COLLECTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapCollectionType() <em>Map Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapCollectionType()
	 * @generated
	 * @ordered
	 */
	protected String mapCollectionType = MAP_COLLECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapKeyType() <em>Map Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKeyType()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_KEY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapKeyType() <em>Map Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKeyType()
	 * @generated
	 * @ordered
	 */
	protected String mapKeyType = MAP_KEY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMapKeyDomainObjectType() <em>Map Key Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKeyDomainObjectType()
	 * @generated
	 * @ordered
	 */
	protected DslSimpleDomainObject mapKeyDomainObjectType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslComplexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_COMPLEX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslCollectionType getCollectionType() {
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionType(DslCollectionType newCollectionType) {
		DslCollectionType oldCollectionType = collectionType;
		collectionType = newCollectionType == null ? COLLECTION_TYPE_EDEFAULT : newCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_COMPLEX_TYPE__COLLECTION_TYPE, oldCollectionType, collectionType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptordslPackage.DSL_COMPLEX_TYPE__DOMAIN_OBJECT_TYPE, oldDomainObjectType, domainObjectType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_COMPLEX_TYPE__DOMAIN_OBJECT_TYPE, oldDomainObjectType, domainObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_COMPLEX_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMapCollectionType() {
		return mapCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapCollectionType(String newMapCollectionType) {
		String oldMapCollectionType = mapCollectionType;
		mapCollectionType = newMapCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_COMPLEX_TYPE__MAP_COLLECTION_TYPE, oldMapCollectionType, mapCollectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMapKeyType() {
		return mapKeyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapKeyType(String newMapKeyType) {
		String oldMapKeyType = mapKeyType;
		mapKeyType = newMapKeyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_COMPLEX_TYPE__MAP_KEY_TYPE, oldMapKeyType, mapKeyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslSimpleDomainObject getMapKeyDomainObjectType() {
		if (mapKeyDomainObjectType != null && mapKeyDomainObjectType.eIsProxy()) {
			InternalEObject oldMapKeyDomainObjectType = (InternalEObject)mapKeyDomainObjectType;
			mapKeyDomainObjectType = (DslSimpleDomainObject)eResolveProxy(oldMapKeyDomainObjectType);
			if (mapKeyDomainObjectType != oldMapKeyDomainObjectType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptordslPackage.DSL_COMPLEX_TYPE__MAP_KEY_DOMAIN_OBJECT_TYPE, oldMapKeyDomainObjectType, mapKeyDomainObjectType));
			}
		}
		return mapKeyDomainObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslSimpleDomainObject basicGetMapKeyDomainObjectType() {
		return mapKeyDomainObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapKeyDomainObjectType(DslSimpleDomainObject newMapKeyDomainObjectType) {
		DslSimpleDomainObject oldMapKeyDomainObjectType = mapKeyDomainObjectType;
		mapKeyDomainObjectType = newMapKeyDomainObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_COMPLEX_TYPE__MAP_KEY_DOMAIN_OBJECT_TYPE, oldMapKeyDomainObjectType, mapKeyDomainObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptordslPackage.DSL_COMPLEX_TYPE__COLLECTION_TYPE:
				return getCollectionType();
			case SculptordslPackage.DSL_COMPLEX_TYPE__DOMAIN_OBJECT_TYPE:
				if (resolve) return getDomainObjectType();
				return basicGetDomainObjectType();
			case SculptordslPackage.DSL_COMPLEX_TYPE__TYPE:
				return getType();
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_COLLECTION_TYPE:
				return getMapCollectionType();
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_KEY_TYPE:
				return getMapKeyType();
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_KEY_DOMAIN_OBJECT_TYPE:
				if (resolve) return getMapKeyDomainObjectType();
				return basicGetMapKeyDomainObjectType();
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
			case SculptordslPackage.DSL_COMPLEX_TYPE__COLLECTION_TYPE:
				setCollectionType((DslCollectionType)newValue);
				return;
			case SculptordslPackage.DSL_COMPLEX_TYPE__DOMAIN_OBJECT_TYPE:
				setDomainObjectType((DslSimpleDomainObject)newValue);
				return;
			case SculptordslPackage.DSL_COMPLEX_TYPE__TYPE:
				setType((String)newValue);
				return;
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_COLLECTION_TYPE:
				setMapCollectionType((String)newValue);
				return;
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_KEY_TYPE:
				setMapKeyType((String)newValue);
				return;
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_KEY_DOMAIN_OBJECT_TYPE:
				setMapKeyDomainObjectType((DslSimpleDomainObject)newValue);
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
			case SculptordslPackage.DSL_COMPLEX_TYPE__COLLECTION_TYPE:
				setCollectionType(COLLECTION_TYPE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_COMPLEX_TYPE__DOMAIN_OBJECT_TYPE:
				setDomainObjectType((DslSimpleDomainObject)null);
				return;
			case SculptordslPackage.DSL_COMPLEX_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_COLLECTION_TYPE:
				setMapCollectionType(MAP_COLLECTION_TYPE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_KEY_TYPE:
				setMapKeyType(MAP_KEY_TYPE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_KEY_DOMAIN_OBJECT_TYPE:
				setMapKeyDomainObjectType((DslSimpleDomainObject)null);
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
			case SculptordslPackage.DSL_COMPLEX_TYPE__COLLECTION_TYPE:
				return collectionType != COLLECTION_TYPE_EDEFAULT;
			case SculptordslPackage.DSL_COMPLEX_TYPE__DOMAIN_OBJECT_TYPE:
				return domainObjectType != null;
			case SculptordslPackage.DSL_COMPLEX_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_COLLECTION_TYPE:
				return MAP_COLLECTION_TYPE_EDEFAULT == null ? mapCollectionType != null : !MAP_COLLECTION_TYPE_EDEFAULT.equals(mapCollectionType);
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_KEY_TYPE:
				return MAP_KEY_TYPE_EDEFAULT == null ? mapKeyType != null : !MAP_KEY_TYPE_EDEFAULT.equals(mapKeyType);
			case SculptordslPackage.DSL_COMPLEX_TYPE__MAP_KEY_DOMAIN_OBJECT_TYPE:
				return mapKeyDomainObjectType != null;
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
		result.append(" (collectionType: ");
		result.append(collectionType);
		result.append(", type: ");
		result.append(type);
		result.append(", mapCollectionType: ");
		result.append(mapCollectionType);
		result.append(", mapKeyType: ");
		result.append(mapKeyType);
		result.append(')');
		return result.toString();
	}

} //DslComplexTypeImpl
