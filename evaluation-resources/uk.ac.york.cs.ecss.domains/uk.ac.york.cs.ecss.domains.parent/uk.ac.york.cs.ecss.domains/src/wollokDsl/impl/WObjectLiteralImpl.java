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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import wollokDsl.WArgumentList;
import wollokDsl.WClass;
import wollokDsl.WMixin;
import wollokDsl.WObjectLiteral;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WObject Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WObjectLiteralImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link wollokDsl.impl.WObjectLiteralImpl#getParentParameters <em>Parent Parameters</em>}</li>
 *   <li>{@link wollokDsl.impl.WObjectLiteralImpl#getMixins <em>Mixins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WObjectLiteralImpl extends WMethodContainerImpl implements WObjectLiteral {
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
	protected WObjectLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WOBJECT_LITERAL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WollokDslPackage.WOBJECT_LITERAL__PARENT, oldParent, parent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WOBJECT_LITERAL__PARENT, oldParent, parent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WOBJECT_LITERAL__PARENT_PARAMETERS, oldParentParameters, newParentParameters);
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
				msgs = ((InternalEObject)parentParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WOBJECT_LITERAL__PARENT_PARAMETERS, null, msgs);
			if (newParentParameters != null)
				msgs = ((InternalEObject)newParentParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WOBJECT_LITERAL__PARENT_PARAMETERS, null, msgs);
			msgs = basicSetParentParameters(newParentParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WOBJECT_LITERAL__PARENT_PARAMETERS, newParentParameters, newParentParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WMixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectResolvingEList<WMixin>(WMixin.class, this, WollokDslPackage.WOBJECT_LITERAL__MIXINS);
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
			case WollokDslPackage.WOBJECT_LITERAL__PARENT_PARAMETERS:
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
			case WollokDslPackage.WOBJECT_LITERAL__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case WollokDslPackage.WOBJECT_LITERAL__PARENT_PARAMETERS:
				return getParentParameters();
			case WollokDslPackage.WOBJECT_LITERAL__MIXINS:
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
			case WollokDslPackage.WOBJECT_LITERAL__PARENT:
				setParent((WClass)newValue);
				return;
			case WollokDslPackage.WOBJECT_LITERAL__PARENT_PARAMETERS:
				setParentParameters((WArgumentList)newValue);
				return;
			case WollokDslPackage.WOBJECT_LITERAL__MIXINS:
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
			case WollokDslPackage.WOBJECT_LITERAL__PARENT:
				setParent((WClass)null);
				return;
			case WollokDslPackage.WOBJECT_LITERAL__PARENT_PARAMETERS:
				setParentParameters((WArgumentList)null);
				return;
			case WollokDslPackage.WOBJECT_LITERAL__MIXINS:
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
			case WollokDslPackage.WOBJECT_LITERAL__PARENT:
				return parent != null;
			case WollokDslPackage.WOBJECT_LITERAL__PARENT_PARAMETERS:
				return parentParameters != null;
			case WollokDslPackage.WOBJECT_LITERAL__MIXINS:
				return mixins != null && !mixins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WObjectLiteralImpl
