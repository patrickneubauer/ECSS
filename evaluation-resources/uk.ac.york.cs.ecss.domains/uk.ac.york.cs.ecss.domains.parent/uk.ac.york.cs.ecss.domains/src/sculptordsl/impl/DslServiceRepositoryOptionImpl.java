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

import sculptordsl.DslDependency;
import sculptordsl.DslServiceRepositoryOption;
import sculptordsl.DslSubscribe;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Service Repository Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslServiceRepositoryOptionImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.impl.DslServiceRepositoryOptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.impl.DslServiceRepositoryOptionImpl#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link sculptordsl.impl.DslServiceRepositoryOptionImpl#isNoGapClass <em>No Gap Class</em>}</li>
 *   <li>{@link sculptordsl.impl.DslServiceRepositoryOptionImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.impl.DslServiceRepositoryOptionImpl#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link sculptordsl.impl.DslServiceRepositoryOptionImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslServiceRepositoryOptionImpl extends MinimalEObjectImpl.Container implements DslServiceRepositoryOption {
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
	 * The default value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GAP_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected boolean gapClass = GAP_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoGapClass() <em>No Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoGapClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_GAP_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoGapClass() <em>No Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoGapClass()
	 * @generated
	 * @ordered
	 */
	protected boolean noGapClass = NO_GAP_CLASS_EDEFAULT;

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
	 * The cached value of the '{@link #getSubscribe() <em>Subscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribe()
	 * @generated
	 * @ordered
	 */
	protected DslSubscribe subscribe;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslServiceRepositoryOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_SERVICE_REPOSITORY_OPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__DOC, oldDoc, doc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGapClass() {
		return gapClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGapClass(boolean newGapClass) {
		boolean oldGapClass = gapClass;
		gapClass = newGapClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__GAP_CLASS, oldGapClass, gapClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoGapClass() {
		return noGapClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoGapClass(boolean newNoGapClass) {
		boolean oldNoGapClass = noGapClass;
		noGapClass = newNoGapClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__NO_GAP_CLASS, oldNoGapClass, noGapClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__HINT, oldHint, hint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE, oldSubscribe, newSubscribe);
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
				msgs = ((InternalEObject)subscribe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE, null, msgs);
			if (newSubscribe != null)
				msgs = ((InternalEObject)newSubscribe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE, null, msgs);
			msgs = basicSetSubscribe(newSubscribe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE, newSubscribe, newSubscribe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<DslDependency>(DslDependency.class, this, SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE:
				return basicSetSubscribe(null, msgs);
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__DOC:
				return getDoc();
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__NAME:
				return getName();
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__GAP_CLASS:
				return isGapClass();
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__NO_GAP_CLASS:
				return isNoGapClass();
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__HINT:
				return getHint();
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE:
				return getSubscribe();
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__DEPENDENCIES:
				return getDependencies();
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
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__DOC:
				setDoc((String)newValue);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__NAME:
				setName((String)newValue);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__GAP_CLASS:
				setGapClass((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__NO_GAP_CLASS:
				setNoGapClass((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__HINT:
				setHint((String)newValue);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE:
				setSubscribe((DslSubscribe)newValue);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends DslDependency>)newValue);
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
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__GAP_CLASS:
				setGapClass(GAP_CLASS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__NO_GAP_CLASS:
				setNoGapClass(NO_GAP_CLASS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__HINT:
				setHint(HINT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE:
				setSubscribe((DslSubscribe)null);
				return;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__DEPENDENCIES:
				getDependencies().clear();
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
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__GAP_CLASS:
				return gapClass != GAP_CLASS_EDEFAULT;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__NO_GAP_CLASS:
				return noGapClass != NO_GAP_CLASS_EDEFAULT;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__HINT:
				return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE:
				return subscribe != null;
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
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
		result.append(", gapClass: ");
		result.append(gapClass);
		result.append(", noGapClass: ");
		result.append(noGapClass);
		result.append(", hint: ");
		result.append(hint);
		result.append(')');
		return result.toString();
	}

} //DslServiceRepositoryOptionImpl
