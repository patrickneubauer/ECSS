/**
 */
package wollokDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wollokDsl.WArgumentList;
import wollokDsl.WCanExtendClass;
import wollokDsl.WClass;
import wollokDsl.WMember;
import wollokDsl.WMethodContainer;
import wollokDsl.WMixin;
import wollokDsl.WNamed;
import wollokDsl.WNamedObject;
import wollokDsl.WReferenciable;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WNamed Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WNamedObjectImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link wollokDsl.impl.WNamedObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link wollokDsl.impl.WNamedObjectImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link wollokDsl.impl.WNamedObjectImpl#getParentParameters <em>Parent Parameters</em>}</li>
 *   <li>{@link wollokDsl.impl.WNamedObjectImpl#getMixins <em>Mixins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WNamedObjectImpl extends WLibraryElementImpl implements WNamedObject {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<WMember> members;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected WClass parent;

	/**
	 * The cached value of the '{@link #getParentParameters() <em>Parent Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentParameters()
	 * @generated
	 * @ordered
	 */
	protected WArgumentList parentParameters;

	/**
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<WMixin> mixins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WNamedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WNAMED_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WMember> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<WMember>(WMember.class, this, WollokDslPackage.WNAMED_OBJECT__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WNAMED_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WClass getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (WClass)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WollokDslPackage.WNAMED_OBJECT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WClass basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(WClass newParent) {
		WClass oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WNAMED_OBJECT__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WArgumentList getParentParameters() {
		return parentParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentParameters(WArgumentList newParentParameters, NotificationChain msgs) {
		WArgumentList oldParentParameters = parentParameters;
		parentParameters = newParentParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WNAMED_OBJECT__PARENT_PARAMETERS, oldParentParameters, newParentParameters);
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
	public void setParentParameters(WArgumentList newParentParameters) {
		if (newParentParameters != parentParameters) {
			NotificationChain msgs = null;
			if (parentParameters != null)
				msgs = ((InternalEObject)parentParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WNAMED_OBJECT__PARENT_PARAMETERS, null, msgs);
			if (newParentParameters != null)
				msgs = ((InternalEObject)newParentParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WNAMED_OBJECT__PARENT_PARAMETERS, null, msgs);
			msgs = basicSetParentParameters(newParentParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WNAMED_OBJECT__PARENT_PARAMETERS, newParentParameters, newParentParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WMixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectResolvingEList<WMixin>(WMixin.class, this, WollokDslPackage.WNAMED_OBJECT__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WollokDslPackage.WNAMED_OBJECT__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case WollokDslPackage.WNAMED_OBJECT__PARENT_PARAMETERS:
				return basicSetParentParameters(null, msgs);
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
			case WollokDslPackage.WNAMED_OBJECT__MEMBERS:
				return getMembers();
			case WollokDslPackage.WNAMED_OBJECT__NAME:
				return getName();
			case WollokDslPackage.WNAMED_OBJECT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case WollokDslPackage.WNAMED_OBJECT__PARENT_PARAMETERS:
				return getParentParameters();
			case WollokDslPackage.WNAMED_OBJECT__MIXINS:
				return getMixins();
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
			case WollokDslPackage.WNAMED_OBJECT__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends WMember>)newValue);
				return;
			case WollokDslPackage.WNAMED_OBJECT__NAME:
				setName((String)newValue);
				return;
			case WollokDslPackage.WNAMED_OBJECT__PARENT:
				setParent((WClass)newValue);
				return;
			case WollokDslPackage.WNAMED_OBJECT__PARENT_PARAMETERS:
				setParentParameters((WArgumentList)newValue);
				return;
			case WollokDslPackage.WNAMED_OBJECT__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends WMixin>)newValue);
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
			case WollokDslPackage.WNAMED_OBJECT__MEMBERS:
				getMembers().clear();
				return;
			case WollokDslPackage.WNAMED_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WollokDslPackage.WNAMED_OBJECT__PARENT:
				setParent((WClass)null);
				return;
			case WollokDslPackage.WNAMED_OBJECT__PARENT_PARAMETERS:
				setParentParameters((WArgumentList)null);
				return;
			case WollokDslPackage.WNAMED_OBJECT__MIXINS:
				getMixins().clear();
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
			case WollokDslPackage.WNAMED_OBJECT__MEMBERS:
				return members != null && !members.isEmpty();
			case WollokDslPackage.WNAMED_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WollokDslPackage.WNAMED_OBJECT__PARENT:
				return parent != null;
			case WollokDslPackage.WNAMED_OBJECT__PARENT_PARAMETERS:
				return parentParameters != null;
			case WollokDslPackage.WNAMED_OBJECT__MIXINS:
				return mixins != null && !mixins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == WMethodContainer.class) {
			switch (derivedFeatureID) {
				case WollokDslPackage.WNAMED_OBJECT__MEMBERS: return WollokDslPackage.WMETHOD_CONTAINER__MEMBERS;
				default: return -1;
			}
		}
		if (baseClass == WNamed.class) {
			switch (derivedFeatureID) {
				case WollokDslPackage.WNAMED_OBJECT__NAME: return WollokDslPackage.WNAMED__NAME;
				default: return -1;
			}
		}
		if (baseClass == WReferenciable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == WCanExtendClass.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == WMethodContainer.class) {
			switch (baseFeatureID) {
				case WollokDslPackage.WMETHOD_CONTAINER__MEMBERS: return WollokDslPackage.WNAMED_OBJECT__MEMBERS;
				default: return -1;
			}
		}
		if (baseClass == WNamed.class) {
			switch (baseFeatureID) {
				case WollokDslPackage.WNAMED__NAME: return WollokDslPackage.WNAMED_OBJECT__NAME;
				default: return -1;
			}
		}
		if (baseClass == WReferenciable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == WCanExtendClass.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WNamedObjectImpl
