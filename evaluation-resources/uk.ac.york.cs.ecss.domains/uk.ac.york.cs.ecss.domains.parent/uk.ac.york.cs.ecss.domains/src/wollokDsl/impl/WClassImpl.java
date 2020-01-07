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

import wollokDsl.WCanExtendClass;
import wollokDsl.WClass;
import wollokDsl.WConstructor;
import wollokDsl.WMember;
import wollokDsl.WMethodContainer;
import wollokDsl.WMixin;
import wollokDsl.WNamed;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link wollokDsl.impl.WClassImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link wollokDsl.impl.WClassImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link wollokDsl.impl.WClassImpl#getMixins <em>Mixins</em>}</li>
 *   <li>{@link wollokDsl.impl.WClassImpl#getConstructors <em>Constructors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WClassImpl extends WLibraryElementImpl implements WClass {
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
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<WMember> members;

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
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<WMixin> mixins;

	/**
	 * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructors()
	 * @generated
	 * @ordered
	 */
	protected EList<WConstructor> constructors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WCLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WMember> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<WMember>(WMember.class, this, WollokDslPackage.WCLASS__MEMBERS);
		}
		return members;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WollokDslPackage.WCLASS__PARENT, oldParent, parent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCLASS__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WMixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectResolvingEList<WMixin>(WMixin.class, this, WollokDslPackage.WCLASS__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WConstructor> getConstructors() {
		if (constructors == null) {
			constructors = new EObjectContainmentEList<WConstructor>(WConstructor.class, this, WollokDslPackage.WCLASS__CONSTRUCTORS);
		}
		return constructors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WollokDslPackage.WCLASS__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case WollokDslPackage.WCLASS__CONSTRUCTORS:
				return ((InternalEList<?>)getConstructors()).basicRemove(otherEnd, msgs);
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
			case WollokDslPackage.WCLASS__NAME:
				return getName();
			case WollokDslPackage.WCLASS__MEMBERS:
				return getMembers();
			case WollokDslPackage.WCLASS__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case WollokDslPackage.WCLASS__MIXINS:
				return getMixins();
			case WollokDslPackage.WCLASS__CONSTRUCTORS:
				return getConstructors();
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
			case WollokDslPackage.WCLASS__NAME:
				setName((String)newValue);
				return;
			case WollokDslPackage.WCLASS__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends WMember>)newValue);
				return;
			case WollokDslPackage.WCLASS__PARENT:
				setParent((WClass)newValue);
				return;
			case WollokDslPackage.WCLASS__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends WMixin>)newValue);
				return;
			case WollokDslPackage.WCLASS__CONSTRUCTORS:
				getConstructors().clear();
				getConstructors().addAll((Collection<? extends WConstructor>)newValue);
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
			case WollokDslPackage.WCLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WollokDslPackage.WCLASS__MEMBERS:
				getMembers().clear();
				return;
			case WollokDslPackage.WCLASS__PARENT:
				setParent((WClass)null);
				return;
			case WollokDslPackage.WCLASS__MIXINS:
				getMixins().clear();
				return;
			case WollokDslPackage.WCLASS__CONSTRUCTORS:
				getConstructors().clear();
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
			case WollokDslPackage.WCLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WollokDslPackage.WCLASS__MEMBERS:
				return members != null && !members.isEmpty();
			case WollokDslPackage.WCLASS__PARENT:
				return parent != null;
			case WollokDslPackage.WCLASS__MIXINS:
				return mixins != null && !mixins.isEmpty();
			case WollokDslPackage.WCLASS__CONSTRUCTORS:
				return constructors != null && !constructors.isEmpty();
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
		if (baseClass == WNamed.class) {
			switch (derivedFeatureID) {
				case WollokDslPackage.WCLASS__NAME: return WollokDslPackage.WNAMED__NAME;
				default: return -1;
			}
		}
		if (baseClass == WMethodContainer.class) {
			switch (derivedFeatureID) {
				case WollokDslPackage.WCLASS__MEMBERS: return WollokDslPackage.WMETHOD_CONTAINER__MEMBERS;
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
		if (baseClass == WNamed.class) {
			switch (baseFeatureID) {
				case WollokDslPackage.WNAMED__NAME: return WollokDslPackage.WCLASS__NAME;
				default: return -1;
			}
		}
		if (baseClass == WMethodContainer.class) {
			switch (baseFeatureID) {
				case WollokDslPackage.WMETHOD_CONTAINER__MEMBERS: return WollokDslPackage.WCLASS__MEMBERS;
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

} //WClassImpl
