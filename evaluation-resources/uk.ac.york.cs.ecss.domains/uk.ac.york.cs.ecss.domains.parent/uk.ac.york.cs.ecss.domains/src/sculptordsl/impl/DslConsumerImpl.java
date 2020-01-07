/**
 */
package sculptordsl.impl;

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

import sculptordsl.DslConsumer;
import sculptordsl.DslDependency;
import sculptordsl.DslDomainObject;
import sculptordsl.DslSubscribe;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslConsumerImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.impl.DslConsumerImpl#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.impl.DslConsumerImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.impl.DslConsumerImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link sculptordsl.impl.DslConsumerImpl#getMessageRoot <em>Message Root</em>}</li>
 *   <li>{@link sculptordsl.impl.DslConsumerImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link sculptordsl.impl.DslConsumerImpl#getSubscribe <em>Subscribe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslConsumerImpl extends MinimalEObjectImpl.Container implements DslConsumer {
	/**
	 * The default value of the '{@link #getDoc() <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoc() <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected String doc = DOC_EDEFAULT;

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
	 * The default value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected static final String HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected String hint = HINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<DslDependency> dependencies;

	/**
	 * The cached value of the '{@link #getMessageRoot() <em>Message Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRoot()
	 * @generated
	 * @ordered
	 */
	protected DslDomainObject messageRoot;

	/**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected String channel = CHANNEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscribe() <em>Subscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribe()
	 * @generated
	 * @ordered
	 */
	protected DslSubscribe subscribe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoc() {
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoc(String newDoc) {
		String oldDoc = doc;
		doc = newDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_CONSUMER__DOC, oldDoc, doc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_CONSUMER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHint() {
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHint(String newHint) {
		String oldHint = hint;
		hint = newHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_CONSUMER__HINT, oldHint, hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<DslDependency>(DslDependency.class, this, SculptordslPackage.DSL_CONSUMER__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDomainObject getMessageRoot() {
		if (messageRoot != null && messageRoot.eIsProxy()) {
			InternalEObject oldMessageRoot = (InternalEObject)messageRoot;
			messageRoot = (DslDomainObject)eResolveProxy(oldMessageRoot);
			if (messageRoot != oldMessageRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptordslPackage.DSL_CONSUMER__MESSAGE_ROOT, oldMessageRoot, messageRoot));
			}
		}
		return messageRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslDomainObject basicGetMessageRoot() {
		return messageRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageRoot(DslDomainObject newMessageRoot) {
		DslDomainObject oldMessageRoot = messageRoot;
		messageRoot = newMessageRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_CONSUMER__MESSAGE_ROOT, oldMessageRoot, messageRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannel(String newChannel) {
		String oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_CONSUMER__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslSubscribe getSubscribe() {
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribe(DslSubscribe newSubscribe, NotificationChain msgs) {
		DslSubscribe oldSubscribe = subscribe;
		subscribe = newSubscribe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_CONSUMER__SUBSCRIBE, oldSubscribe, newSubscribe);
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
	public void setSubscribe(DslSubscribe newSubscribe) {
		if (newSubscribe != subscribe) {
			NotificationChain msgs = null;
			if (subscribe != null)
				msgs = ((InternalEObject)subscribe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_CONSUMER__SUBSCRIBE, null, msgs);
			if (newSubscribe != null)
				msgs = ((InternalEObject)newSubscribe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_CONSUMER__SUBSCRIBE, null, msgs);
			msgs = basicSetSubscribe(newSubscribe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_CONSUMER__SUBSCRIBE, newSubscribe, newSubscribe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptordslPackage.DSL_CONSUMER__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_CONSUMER__SUBSCRIBE:
				return basicSetSubscribe(null, msgs);
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
			case SculptordslPackage.DSL_CONSUMER__DOC:
				return getDoc();
			case SculptordslPackage.DSL_CONSUMER__NAME:
				return getName();
			case SculptordslPackage.DSL_CONSUMER__HINT:
				return getHint();
			case SculptordslPackage.DSL_CONSUMER__DEPENDENCIES:
				return getDependencies();
			case SculptordslPackage.DSL_CONSUMER__MESSAGE_ROOT:
				if (resolve) return getMessageRoot();
				return basicGetMessageRoot();
			case SculptordslPackage.DSL_CONSUMER__CHANNEL:
				return getChannel();
			case SculptordslPackage.DSL_CONSUMER__SUBSCRIBE:
				return getSubscribe();
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
			case SculptordslPackage.DSL_CONSUMER__DOC:
				setDoc((String)newValue);
				return;
			case SculptordslPackage.DSL_CONSUMER__NAME:
				setName((String)newValue);
				return;
			case SculptordslPackage.DSL_CONSUMER__HINT:
				setHint((String)newValue);
				return;
			case SculptordslPackage.DSL_CONSUMER__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends DslDependency>)newValue);
				return;
			case SculptordslPackage.DSL_CONSUMER__MESSAGE_ROOT:
				setMessageRoot((DslDomainObject)newValue);
				return;
			case SculptordslPackage.DSL_CONSUMER__CHANNEL:
				setChannel((String)newValue);
				return;
			case SculptordslPackage.DSL_CONSUMER__SUBSCRIBE:
				setSubscribe((DslSubscribe)newValue);
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
			case SculptordslPackage.DSL_CONSUMER__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case SculptordslPackage.DSL_CONSUMER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SculptordslPackage.DSL_CONSUMER__HINT:
				setHint(HINT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_CONSUMER__DEPENDENCIES:
				getDependencies().clear();
				return;
			case SculptordslPackage.DSL_CONSUMER__MESSAGE_ROOT:
				setMessageRoot((DslDomainObject)null);
				return;
			case SculptordslPackage.DSL_CONSUMER__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
			case SculptordslPackage.DSL_CONSUMER__SUBSCRIBE:
				setSubscribe((DslSubscribe)null);
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
			case SculptordslPackage.DSL_CONSUMER__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case SculptordslPackage.DSL_CONSUMER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SculptordslPackage.DSL_CONSUMER__HINT:
				return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
			case SculptordslPackage.DSL_CONSUMER__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case SculptordslPackage.DSL_CONSUMER__MESSAGE_ROOT:
				return messageRoot != null;
			case SculptordslPackage.DSL_CONSUMER__CHANNEL:
				return CHANNEL_EDEFAULT == null ? channel != null : !CHANNEL_EDEFAULT.equals(channel);
			case SculptordslPackage.DSL_CONSUMER__SUBSCRIBE:
				return subscribe != null;
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
		result.append(" (doc: ");
		result.append(doc);
		result.append(", name: ");
		result.append(name);
		result.append(", hint: ");
		result.append(hint);
		result.append(", channel: ");
		result.append(channel);
		result.append(')');
		return result.toString();
	}

} //DslConsumerImpl
