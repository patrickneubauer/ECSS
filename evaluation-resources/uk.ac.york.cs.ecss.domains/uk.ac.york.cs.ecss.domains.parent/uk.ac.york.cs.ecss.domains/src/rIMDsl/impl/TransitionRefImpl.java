/**
 */
package rIMDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rIMDsl.Event;
import rIMDsl.RIMDslPackage;
import rIMDsl.ResourceLocator;
import rIMDsl.State;
import rIMDsl.TransitionRef;
import rIMDsl.TransitionSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.impl.TransitionRefImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link rIMDsl.impl.TransitionRefImpl#getState <em>State</em>}</li>
 *   <li>{@link rIMDsl.impl.TransitionRefImpl#getLocator <em>Locator</em>}</li>
 *   <li>{@link rIMDsl.impl.TransitionRefImpl#getName <em>Name</em>}</li>
 *   <li>{@link rIMDsl.impl.TransitionRefImpl#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionRefImpl extends MinimalEObjectImpl.Container implements TransitionRef {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * The cached value of the '{@link #getLocator() <em>Locator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocator()
	 * @generated
	 * @ordered
	 */
	protected ResourceLocator locator;

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
	 * The cached value of the '{@link #getSpec() <em>Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected TransitionSpec spec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMDslPackage.Literals.TRANSITION_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (Event)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RIMDslPackage.TRANSITION_REF__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvent(Event newEvent) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_REF__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (State)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RIMDslPackage.TRANSITION_REF__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_REF__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getLocator() {
		return locator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocator(ResourceLocator newLocator, NotificationChain msgs) {
		ResourceLocator oldLocator = locator;
		locator = newLocator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_REF__LOCATOR, oldLocator, newLocator);
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
	public void setLocator(ResourceLocator newLocator) {
		if (newLocator != locator) {
			NotificationChain msgs = null;
			if (locator != null)
				msgs = ((InternalEObject)locator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_REF__LOCATOR, null, msgs);
			if (newLocator != null)
				msgs = ((InternalEObject)newLocator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_REF__LOCATOR, null, msgs);
			msgs = basicSetLocator(newLocator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_REF__LOCATOR, newLocator, newLocator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_REF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionSpec getSpec() {
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpec(TransitionSpec newSpec, NotificationChain msgs) {
		TransitionSpec oldSpec = spec;
		spec = newSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_REF__SPEC, oldSpec, newSpec);
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
	public void setSpec(TransitionSpec newSpec) {
		if (newSpec != spec) {
			NotificationChain msgs = null;
			if (spec != null)
				msgs = ((InternalEObject)spec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_REF__SPEC, null, msgs);
			if (newSpec != null)
				msgs = ((InternalEObject)newSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_REF__SPEC, null, msgs);
			msgs = basicSetSpec(newSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_REF__SPEC, newSpec, newSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RIMDslPackage.TRANSITION_REF__LOCATOR:
				return basicSetLocator(null, msgs);
			case RIMDslPackage.TRANSITION_REF__SPEC:
				return basicSetSpec(null, msgs);
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
			case RIMDslPackage.TRANSITION_REF__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case RIMDslPackage.TRANSITION_REF__STATE:
				if (resolve) return getState();
				return basicGetState();
			case RIMDslPackage.TRANSITION_REF__LOCATOR:
				return getLocator();
			case RIMDslPackage.TRANSITION_REF__NAME:
				return getName();
			case RIMDslPackage.TRANSITION_REF__SPEC:
				return getSpec();
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
			case RIMDslPackage.TRANSITION_REF__EVENT:
				setEvent((Event)newValue);
				return;
			case RIMDslPackage.TRANSITION_REF__STATE:
				setState((State)newValue);
				return;
			case RIMDslPackage.TRANSITION_REF__LOCATOR:
				setLocator((ResourceLocator)newValue);
				return;
			case RIMDslPackage.TRANSITION_REF__NAME:
				setName((String)newValue);
				return;
			case RIMDslPackage.TRANSITION_REF__SPEC:
				setSpec((TransitionSpec)newValue);
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
			case RIMDslPackage.TRANSITION_REF__EVENT:
				setEvent((Event)null);
				return;
			case RIMDslPackage.TRANSITION_REF__STATE:
				setState((State)null);
				return;
			case RIMDslPackage.TRANSITION_REF__LOCATOR:
				setLocator((ResourceLocator)null);
				return;
			case RIMDslPackage.TRANSITION_REF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RIMDslPackage.TRANSITION_REF__SPEC:
				setSpec((TransitionSpec)null);
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
			case RIMDslPackage.TRANSITION_REF__EVENT:
				return event != null;
			case RIMDslPackage.TRANSITION_REF__STATE:
				return state != null;
			case RIMDslPackage.TRANSITION_REF__LOCATOR:
				return locator != null;
			case RIMDslPackage.TRANSITION_REF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RIMDslPackage.TRANSITION_REF__SPEC:
				return spec != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransitionRefImpl
