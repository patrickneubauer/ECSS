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

import rIMDsl.Entity;
import rIMDsl.ImplRef;
import rIMDsl.MdfAnnotation;
import rIMDsl.Path;
import rIMDsl.RIMDslPackage;
import rIMDsl.RelationRef;
import rIMDsl.ResourceType;
import rIMDsl.State;
import rIMDsl.TransitionRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.impl.StateImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link rIMDsl.impl.StateImpl#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link rIMDsl.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link rIMDsl.impl.StateImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link rIMDsl.impl.StateImpl#getType <em>Type</em>}</li>
 *   <li>{@link rIMDsl.impl.StateImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link rIMDsl.impl.StateImpl#getImpl <em>Impl</em>}</li>
 *   <li>{@link rIMDsl.impl.StateImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link rIMDsl.impl.StateImpl#getPath <em>Path</em>}</li>
 *   <li>{@link rIMDsl.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link rIMDsl.impl.StateImpl#getErrorState <em>Error State</em>}</li>
 *   <li>{@link rIMDsl.impl.StateImpl#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitial = IS_INITIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsException()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXCEPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsException()
	 * @generated
	 * @ordered
	 */
	protected boolean isException = IS_EXCEPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType type;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getImpl() <em>Impl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpl()
	 * @generated
	 * @ordered
	 */
	protected ImplRef impl;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationRef> relations;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected Path path;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionRef> transitions;

	/**
	 * The cached value of the '{@link #getErrorState() <em>Error State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorState()
	 * @generated
	 * @ordered
	 */
	protected State errorState;

	/**
	 * The default value of the '{@link #getCache() <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected static final int CACHE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected int cache = CACHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMDslPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsInitial() {
		return isInitial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsInitial(boolean newIsInitial) {
		boolean oldIsInitial = isInitial;
		isInitial = newIsInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__IS_INITIAL, oldIsInitial, isInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsException() {
		return isException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsException(boolean newIsException) {
		boolean oldIsException = isException;
		isException = newIsException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__IS_EXCEPTION, oldIsException, isException));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MdfAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<MdfAnnotation>(MdfAnnotation.class, this, RIMDslPackage.STATE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ResourceType newType, NotificationChain msgs) {
		ResourceType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__TYPE, oldType, newType);
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
	public void setType(ResourceType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.STATE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.STATE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__ENTITY, oldEntity, newEntity);
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
	public void setEntity(Entity newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.STATE__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.STATE__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplRef getImpl() {
		return impl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImpl(ImplRef newImpl, NotificationChain msgs) {
		ImplRef oldImpl = impl;
		impl = newImpl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__IMPL, oldImpl, newImpl);
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
	public void setImpl(ImplRef newImpl) {
		if (newImpl != impl) {
			NotificationChain msgs = null;
			if (impl != null)
				msgs = ((InternalEObject)impl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.STATE__IMPL, null, msgs);
			if (newImpl != null)
				msgs = ((InternalEObject)newImpl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.STATE__IMPL, null, msgs);
			msgs = basicSetImpl(newImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__IMPL, newImpl, newImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationRef> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<RelationRef>(RelationRef.class, this, RIMDslPackage.STATE__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(Path newPath, NotificationChain msgs) {
		Path oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__PATH, oldPath, newPath);
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
	public void setPath(Path newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.STATE__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.STATE__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransitionRef> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<TransitionRef>(TransitionRef.class, this, RIMDslPackage.STATE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getErrorState() {
		if (errorState != null && errorState.eIsProxy()) {
			InternalEObject oldErrorState = (InternalEObject)errorState;
			errorState = (State)eResolveProxy(oldErrorState);
			if (errorState != oldErrorState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RIMDslPackage.STATE__ERROR_STATE, oldErrorState, errorState));
			}
		}
		return errorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetErrorState() {
		return errorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorState(State newErrorState) {
		State oldErrorState = errorState;
		errorState = newErrorState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__ERROR_STATE, oldErrorState, errorState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCache() {
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCache(int newCache) {
		int oldCache = cache;
		cache = newCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.STATE__CACHE, oldCache, cache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RIMDslPackage.STATE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case RIMDslPackage.STATE__TYPE:
				return basicSetType(null, msgs);
			case RIMDslPackage.STATE__ENTITY:
				return basicSetEntity(null, msgs);
			case RIMDslPackage.STATE__IMPL:
				return basicSetImpl(null, msgs);
			case RIMDslPackage.STATE__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case RIMDslPackage.STATE__PATH:
				return basicSetPath(null, msgs);
			case RIMDslPackage.STATE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case RIMDslPackage.STATE__IS_INITIAL:
				return isIsInitial();
			case RIMDslPackage.STATE__IS_EXCEPTION:
				return isIsException();
			case RIMDslPackage.STATE__NAME:
				return getName();
			case RIMDslPackage.STATE__ANNOTATIONS:
				return getAnnotations();
			case RIMDslPackage.STATE__TYPE:
				return getType();
			case RIMDslPackage.STATE__ENTITY:
				return getEntity();
			case RIMDslPackage.STATE__IMPL:
				return getImpl();
			case RIMDslPackage.STATE__RELATIONS:
				return getRelations();
			case RIMDslPackage.STATE__PATH:
				return getPath();
			case RIMDslPackage.STATE__TRANSITIONS:
				return getTransitions();
			case RIMDslPackage.STATE__ERROR_STATE:
				if (resolve) return getErrorState();
				return basicGetErrorState();
			case RIMDslPackage.STATE__CACHE:
				return getCache();
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
			case RIMDslPackage.STATE__IS_INITIAL:
				setIsInitial((Boolean)newValue);
				return;
			case RIMDslPackage.STATE__IS_EXCEPTION:
				setIsException((Boolean)newValue);
				return;
			case RIMDslPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case RIMDslPackage.STATE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends MdfAnnotation>)newValue);
				return;
			case RIMDslPackage.STATE__TYPE:
				setType((ResourceType)newValue);
				return;
			case RIMDslPackage.STATE__ENTITY:
				setEntity((Entity)newValue);
				return;
			case RIMDslPackage.STATE__IMPL:
				setImpl((ImplRef)newValue);
				return;
			case RIMDslPackage.STATE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends RelationRef>)newValue);
				return;
			case RIMDslPackage.STATE__PATH:
				setPath((Path)newValue);
				return;
			case RIMDslPackage.STATE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends TransitionRef>)newValue);
				return;
			case RIMDslPackage.STATE__ERROR_STATE:
				setErrorState((State)newValue);
				return;
			case RIMDslPackage.STATE__CACHE:
				setCache((Integer)newValue);
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
			case RIMDslPackage.STATE__IS_INITIAL:
				setIsInitial(IS_INITIAL_EDEFAULT);
				return;
			case RIMDslPackage.STATE__IS_EXCEPTION:
				setIsException(IS_EXCEPTION_EDEFAULT);
				return;
			case RIMDslPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RIMDslPackage.STATE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case RIMDslPackage.STATE__TYPE:
				setType((ResourceType)null);
				return;
			case RIMDslPackage.STATE__ENTITY:
				setEntity((Entity)null);
				return;
			case RIMDslPackage.STATE__IMPL:
				setImpl((ImplRef)null);
				return;
			case RIMDslPackage.STATE__RELATIONS:
				getRelations().clear();
				return;
			case RIMDslPackage.STATE__PATH:
				setPath((Path)null);
				return;
			case RIMDslPackage.STATE__TRANSITIONS:
				getTransitions().clear();
				return;
			case RIMDslPackage.STATE__ERROR_STATE:
				setErrorState((State)null);
				return;
			case RIMDslPackage.STATE__CACHE:
				setCache(CACHE_EDEFAULT);
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
			case RIMDslPackage.STATE__IS_INITIAL:
				return isInitial != IS_INITIAL_EDEFAULT;
			case RIMDslPackage.STATE__IS_EXCEPTION:
				return isException != IS_EXCEPTION_EDEFAULT;
			case RIMDslPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RIMDslPackage.STATE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case RIMDslPackage.STATE__TYPE:
				return type != null;
			case RIMDslPackage.STATE__ENTITY:
				return entity != null;
			case RIMDslPackage.STATE__IMPL:
				return impl != null;
			case RIMDslPackage.STATE__RELATIONS:
				return relations != null && !relations.isEmpty();
			case RIMDslPackage.STATE__PATH:
				return path != null;
			case RIMDslPackage.STATE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case RIMDslPackage.STATE__ERROR_STATE:
				return errorState != null;
			case RIMDslPackage.STATE__CACHE:
				return cache != CACHE_EDEFAULT;
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
		result.append(" (isInitial: ");
		result.append(isInitial);
		result.append(", isException: ");
		result.append(isException);
		result.append(", name: ");
		result.append(name);
		result.append(", cache: ");
		result.append(cache);
		result.append(')');
		return result.toString();
	}

} //StateImpl
