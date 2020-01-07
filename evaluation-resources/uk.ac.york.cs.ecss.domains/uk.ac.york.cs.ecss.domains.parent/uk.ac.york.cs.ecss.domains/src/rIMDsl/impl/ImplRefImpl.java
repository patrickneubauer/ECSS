/**
 */
package rIMDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rIMDsl.ImplRef;
import rIMDsl.MethodRef;
import rIMDsl.RIMDslPackage;
import rIMDsl.ResourceCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impl Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.impl.ImplRefImpl#getView <em>View</em>}</li>
 *   <li>{@link rIMDsl.impl.ImplRefImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link rIMDsl.impl.ImplRefImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplRefImpl extends MinimalEObjectImpl.Container implements ImplRef {
	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected ResourceCommand view;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceCommand> actions;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodRef> methods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMDslPackage.Literals.IMPL_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceCommand getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetView(ResourceCommand newView, NotificationChain msgs) {
		ResourceCommand oldView = view;
		view = newView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.IMPL_REF__VIEW, oldView, newView);
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
	public void setView(ResourceCommand newView) {
		if (newView != view) {
			NotificationChain msgs = null;
			if (view != null)
				msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.IMPL_REF__VIEW, null, msgs);
			if (newView != null)
				msgs = ((InternalEObject)newView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.IMPL_REF__VIEW, null, msgs);
			msgs = basicSetView(newView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.IMPL_REF__VIEW, newView, newView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceCommand> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<ResourceCommand>(ResourceCommand.class, this, RIMDslPackage.IMPL_REF__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodRef> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<MethodRef>(MethodRef.class, this, RIMDslPackage.IMPL_REF__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RIMDslPackage.IMPL_REF__VIEW:
				return basicSetView(null, msgs);
			case RIMDslPackage.IMPL_REF__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case RIMDslPackage.IMPL_REF__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
			case RIMDslPackage.IMPL_REF__VIEW:
				return getView();
			case RIMDslPackage.IMPL_REF__ACTIONS:
				return getActions();
			case RIMDslPackage.IMPL_REF__METHODS:
				return getMethods();
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
			case RIMDslPackage.IMPL_REF__VIEW:
				setView((ResourceCommand)newValue);
				return;
			case RIMDslPackage.IMPL_REF__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends ResourceCommand>)newValue);
				return;
			case RIMDslPackage.IMPL_REF__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends MethodRef>)newValue);
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
			case RIMDslPackage.IMPL_REF__VIEW:
				setView((ResourceCommand)null);
				return;
			case RIMDslPackage.IMPL_REF__ACTIONS:
				getActions().clear();
				return;
			case RIMDslPackage.IMPL_REF__METHODS:
				getMethods().clear();
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
			case RIMDslPackage.IMPL_REF__VIEW:
				return view != null;
			case RIMDslPackage.IMPL_REF__ACTIONS:
				return actions != null && !actions.isEmpty();
			case RIMDslPackage.IMPL_REF__METHODS:
				return methods != null && !methods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplRefImpl
