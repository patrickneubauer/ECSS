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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rIMDsl.BasePath;
import rIMDsl.Command;
import rIMDsl.Event;
import rIMDsl.MdfAnnotation;
import rIMDsl.RIMDslPackage;
import rIMDsl.Relation;
import rIMDsl.ResourceInteractionModel;
import rIMDsl.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Interaction Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.impl.ResourceInteractionModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link rIMDsl.impl.ResourceInteractionModelImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link rIMDsl.impl.ResourceInteractionModelImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link rIMDsl.impl.ResourceInteractionModelImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link rIMDsl.impl.ResourceInteractionModelImpl#getBasepath <em>Basepath</em>}</li>
 *   <li>{@link rIMDsl.impl.ResourceInteractionModelImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link rIMDsl.impl.ResourceInteractionModelImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceInteractionModelImpl extends RefImpl implements ResourceInteractionModel {
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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<MdfAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The cached value of the '{@link #getBasepath() <em>Basepath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasepath()
	 * @generated
	 * @ordered
	 */
	protected BasePath basepath;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInteractionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMDslPackage.Literals.RESOURCE_INTERACTION_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.RESOURCE_INTERACTION_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MdfAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<MdfAnnotation>(MdfAnnotation.class, this, RIMDslPackage.RESOURCE_INTERACTION_MODEL__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, RIMDslPackage.RESOURCE_INTERACTION_MODEL__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<Command>(Command.class, this, RIMDslPackage.RESOURCE_INTERACTION_MODEL__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasePath getBasepath() {
		return basepath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasepath(BasePath newBasepath, NotificationChain msgs) {
		BasePath oldBasepath = basepath;
		basepath = newBasepath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.RESOURCE_INTERACTION_MODEL__BASEPATH, oldBasepath, newBasepath);
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
	public void setBasepath(BasePath newBasepath) {
		if (newBasepath != basepath) {
			NotificationChain msgs = null;
			if (basepath != null)
				msgs = ((InternalEObject)basepath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.RESOURCE_INTERACTION_MODEL__BASEPATH, null, msgs);
			if (newBasepath != null)
				msgs = ((InternalEObject)newBasepath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.RESOURCE_INTERACTION_MODEL__BASEPATH, null, msgs);
			msgs = basicSetBasepath(newBasepath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.RESOURCE_INTERACTION_MODEL__BASEPATH, newBasepath, newBasepath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, RIMDslPackage.RESOURCE_INTERACTION_MODEL__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, RIMDslPackage.RESOURCE_INTERACTION_MODEL__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__BASEPATH:
				return basicSetBasepath(null, msgs);
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__NAME:
				return getName();
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__ANNOTATIONS:
				return getAnnotations();
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__EVENTS:
				return getEvents();
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__COMMANDS:
				return getCommands();
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__BASEPATH:
				return getBasepath();
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__RELATIONS:
				return getRelations();
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__STATES:
				return getStates();
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
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__NAME:
				setName((String)newValue);
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends MdfAnnotation>)newValue);
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__BASEPATH:
				setBasepath((BasePath)newValue);
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__EVENTS:
				getEvents().clear();
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__COMMANDS:
				getCommands().clear();
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__BASEPATH:
				setBasepath((BasePath)null);
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__RELATIONS:
				getRelations().clear();
				return;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__STATES:
				getStates().clear();
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
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__EVENTS:
				return events != null && !events.isEmpty();
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__COMMANDS:
				return commands != null && !commands.isEmpty();
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__BASEPATH:
				return basepath != null;
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__RELATIONS:
				return relations != null && !relations.isEmpty();
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL__STATES:
				return states != null && !states.isEmpty();
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

} //ResourceInteractionModelImpl
