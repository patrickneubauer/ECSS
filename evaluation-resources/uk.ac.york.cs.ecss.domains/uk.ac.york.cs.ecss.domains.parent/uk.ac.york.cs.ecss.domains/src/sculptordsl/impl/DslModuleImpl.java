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
import sculptordsl.DslModule;
import sculptordsl.DslResource;
import sculptordsl.DslService;
import sculptordsl.DslSimpleDomainObject;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslModuleImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.impl.DslModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.impl.DslModuleImpl#isExternal <em>External</em>}</li>
 *   <li>{@link sculptordsl.impl.DslModuleImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link sculptordsl.impl.DslModuleImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.impl.DslModuleImpl#getServices <em>Services</em>}</li>
 *   <li>{@link sculptordsl.impl.DslModuleImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link sculptordsl.impl.DslModuleImpl#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link sculptordsl.impl.DslModuleImpl#getDomainObjects <em>Domain Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslModuleImpl extends MinimalEObjectImpl.Container implements DslModule {
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
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<DslService> services;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<DslResource> resources;

	/**
	 * The cached value of the '{@link #getConsumers() <em>Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<DslConsumer> consumers;

	/**
	 * The cached value of the '{@link #getDomainObjects() <em>Domain Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DslSimpleDomainObject> domainObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_MODULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_MODULE__DOC, oldDoc, doc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal(boolean newExternal) {
		boolean oldExternal = external;
		external = newExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_MODULE__EXTERNAL, oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_MODULE__BASE_PACKAGE, oldBasePackage, basePackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_MODULE__HINT, oldHint, hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslService> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<DslService>(DslService.class, this, SculptordslPackage.DSL_MODULE__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<DslResource>(DslResource.class, this, SculptordslPackage.DSL_MODULE__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslConsumer> getConsumers() {
		if (consumers == null) {
			consumers = new EObjectContainmentEList<DslConsumer>(DslConsumer.class, this, SculptordslPackage.DSL_MODULE__CONSUMERS);
		}
		return consumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslSimpleDomainObject> getDomainObjects() {
		if (domainObjects == null) {
			domainObjects = new EObjectContainmentEList<DslSimpleDomainObject>(DslSimpleDomainObject.class, this, SculptordslPackage.DSL_MODULE__DOMAIN_OBJECTS);
		}
		return domainObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptordslPackage.DSL_MODULE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_MODULE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_MODULE__CONSUMERS:
				return ((InternalEList<?>)getConsumers()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_MODULE__DOMAIN_OBJECTS:
				return ((InternalEList<?>)getDomainObjects()).basicRemove(otherEnd, msgs);
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
			case SculptordslPackage.DSL_MODULE__DOC:
				return getDoc();
			case SculptordslPackage.DSL_MODULE__NAME:
				return getName();
			case SculptordslPackage.DSL_MODULE__EXTERNAL:
				return isExternal();
			case SculptordslPackage.DSL_MODULE__BASE_PACKAGE:
				return getBasePackage();
			case SculptordslPackage.DSL_MODULE__HINT:
				return getHint();
			case SculptordslPackage.DSL_MODULE__SERVICES:
				return getServices();
			case SculptordslPackage.DSL_MODULE__RESOURCES:
				return getResources();
			case SculptordslPackage.DSL_MODULE__CONSUMERS:
				return getConsumers();
			case SculptordslPackage.DSL_MODULE__DOMAIN_OBJECTS:
				return getDomainObjects();
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
			case SculptordslPackage.DSL_MODULE__DOC:
				setDoc((String)newValue);
				return;
			case SculptordslPackage.DSL_MODULE__NAME:
				setName((String)newValue);
				return;
			case SculptordslPackage.DSL_MODULE__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_MODULE__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case SculptordslPackage.DSL_MODULE__HINT:
				setHint((String)newValue);
				return;
			case SculptordslPackage.DSL_MODULE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends DslService>)newValue);
				return;
			case SculptordslPackage.DSL_MODULE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends DslResource>)newValue);
				return;
			case SculptordslPackage.DSL_MODULE__CONSUMERS:
				getConsumers().clear();
				getConsumers().addAll((Collection<? extends DslConsumer>)newValue);
				return;
			case SculptordslPackage.DSL_MODULE__DOMAIN_OBJECTS:
				getDomainObjects().clear();
				getDomainObjects().addAll((Collection<? extends DslSimpleDomainObject>)newValue);
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
			case SculptordslPackage.DSL_MODULE__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case SculptordslPackage.DSL_MODULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SculptordslPackage.DSL_MODULE__EXTERNAL:
				setExternal(EXTERNAL_EDEFAULT);
				return;
			case SculptordslPackage.DSL_MODULE__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_MODULE__HINT:
				setHint(HINT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_MODULE__SERVICES:
				getServices().clear();
				return;
			case SculptordslPackage.DSL_MODULE__RESOURCES:
				getResources().clear();
				return;
			case SculptordslPackage.DSL_MODULE__CONSUMERS:
				getConsumers().clear();
				return;
			case SculptordslPackage.DSL_MODULE__DOMAIN_OBJECTS:
				getDomainObjects().clear();
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
			case SculptordslPackage.DSL_MODULE__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case SculptordslPackage.DSL_MODULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SculptordslPackage.DSL_MODULE__EXTERNAL:
				return external != EXTERNAL_EDEFAULT;
			case SculptordslPackage.DSL_MODULE__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case SculptordslPackage.DSL_MODULE__HINT:
				return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
			case SculptordslPackage.DSL_MODULE__SERVICES:
				return services != null && !services.isEmpty();
			case SculptordslPackage.DSL_MODULE__RESOURCES:
				return resources != null && !resources.isEmpty();
			case SculptordslPackage.DSL_MODULE__CONSUMERS:
				return consumers != null && !consumers.isEmpty();
			case SculptordslPackage.DSL_MODULE__DOMAIN_OBJECTS:
				return domainObjects != null && !domainObjects.isEmpty();
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
		result.append(", external: ");
		result.append(external);
		result.append(", basePackage: ");
		result.append(basePackage);
		result.append(", hint: ");
		result.append(hint);
		result.append(')');
		return result.toString();
	}

} //DslModuleImpl
