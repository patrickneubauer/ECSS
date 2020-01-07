/**
 */
package rIMDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rIMDsl.RIMDslPackage;
import rIMDsl.ResourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.impl.ResourceTypeImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link rIMDsl.impl.ResourceTypeImpl#isIsItem <em>Is Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTypeImpl extends MinimalEObjectImpl.Container implements ResourceType {
	/**
	 * The default value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLLECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected boolean isCollection = IS_COLLECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsItem() <em>Is Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ITEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsItem() <em>Is Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItem()
	 * @generated
	 * @ordered
	 */
	protected boolean isItem = IS_ITEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMDslPackage.Literals.RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsCollection() {
		return isCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsCollection(boolean newIsCollection) {
		boolean oldIsCollection = isCollection;
		isCollection = newIsCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.RESOURCE_TYPE__IS_COLLECTION, oldIsCollection, isCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsItem() {
		return isItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsItem(boolean newIsItem) {
		boolean oldIsItem = isItem;
		isItem = newIsItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.RESOURCE_TYPE__IS_ITEM, oldIsItem, isItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RIMDslPackage.RESOURCE_TYPE__IS_COLLECTION:
				return isIsCollection();
			case RIMDslPackage.RESOURCE_TYPE__IS_ITEM:
				return isIsItem();
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
			case RIMDslPackage.RESOURCE_TYPE__IS_COLLECTION:
				setIsCollection((Boolean)newValue);
				return;
			case RIMDslPackage.RESOURCE_TYPE__IS_ITEM:
				setIsItem((Boolean)newValue);
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
			case RIMDslPackage.RESOURCE_TYPE__IS_COLLECTION:
				setIsCollection(IS_COLLECTION_EDEFAULT);
				return;
			case RIMDslPackage.RESOURCE_TYPE__IS_ITEM:
				setIsItem(IS_ITEM_EDEFAULT);
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
			case RIMDslPackage.RESOURCE_TYPE__IS_COLLECTION:
				return isCollection != IS_COLLECTION_EDEFAULT;
			case RIMDslPackage.RESOURCE_TYPE__IS_ITEM:
				return isItem != IS_ITEM_EDEFAULT;
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
		result.append(" (isCollection: ");
		result.append(isCollection);
		result.append(", isItem: ");
		result.append(isItem);
		result.append(')');
		return result.toString();
	}

} //ResourceTypeImpl
