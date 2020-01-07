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

import sculptordsl.DslResource;
import sculptordsl.DslResourceOperation;
import sculptordsl.DslServiceDependency;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslResourceImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceImpl#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceImpl#isNoGapClass <em>No Gap Class</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceImpl#isScaffold <em>Scaffold</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceImpl#getPath <em>Path</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslResourceImpl extends MinimalEObjectImpl.Container implements DslResource {
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
	 * The default value of the '{@link #isScaffold() <em>Scaffold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScaffold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCAFFOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isScaffold() <em>Scaffold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScaffold()
	 * @generated
	 * @ordered
	 */
	protected boolean scaffold = SCAFFOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<DslServiceDependency> dependencies;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DslResourceOperation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE__DOC, oldDoc, doc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE__GAP_CLASS, oldGapClass, gapClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE__NO_GAP_CLASS, oldNoGapClass, noGapClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE__HINT, oldHint, hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isScaffold() {
		return scaffold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaffold(boolean newScaffold) {
		boolean oldScaffold = scaffold;
		scaffold = newScaffold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE__SCAFFOLD, oldScaffold, scaffold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslServiceDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<DslServiceDependency>(DslServiceDependency.class, this, SculptordslPackage.DSL_RESOURCE__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslResourceOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<DslResourceOperation>(DslResourceOperation.class, this, SculptordslPackage.DSL_RESOURCE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptordslPackage.DSL_RESOURCE__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_RESOURCE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case SculptordslPackage.DSL_RESOURCE__DOC:
				return getDoc();
			case SculptordslPackage.DSL_RESOURCE__NAME:
				return getName();
			case SculptordslPackage.DSL_RESOURCE__GAP_CLASS:
				return isGapClass();
			case SculptordslPackage.DSL_RESOURCE__NO_GAP_CLASS:
				return isNoGapClass();
			case SculptordslPackage.DSL_RESOURCE__HINT:
				return getHint();
			case SculptordslPackage.DSL_RESOURCE__SCAFFOLD:
				return isScaffold();
			case SculptordslPackage.DSL_RESOURCE__PATH:
				return getPath();
			case SculptordslPackage.DSL_RESOURCE__DEPENDENCIES:
				return getDependencies();
			case SculptordslPackage.DSL_RESOURCE__OPERATIONS:
				return getOperations();
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
			case SculptordslPackage.DSL_RESOURCE__DOC:
				setDoc((String)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE__GAP_CLASS:
				setGapClass((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE__NO_GAP_CLASS:
				setNoGapClass((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE__HINT:
				setHint((String)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE__SCAFFOLD:
				setScaffold((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE__PATH:
				setPath((String)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends DslServiceDependency>)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends DslResourceOperation>)newValue);
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
			case SculptordslPackage.DSL_RESOURCE__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE__GAP_CLASS:
				setGapClass(GAP_CLASS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE__NO_GAP_CLASS:
				setNoGapClass(NO_GAP_CLASS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE__HINT:
				setHint(HINT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE__SCAFFOLD:
				setScaffold(SCAFFOLD_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case SculptordslPackage.DSL_RESOURCE__OPERATIONS:
				getOperations().clear();
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
			case SculptordslPackage.DSL_RESOURCE__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case SculptordslPackage.DSL_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SculptordslPackage.DSL_RESOURCE__GAP_CLASS:
				return gapClass != GAP_CLASS_EDEFAULT;
			case SculptordslPackage.DSL_RESOURCE__NO_GAP_CLASS:
				return noGapClass != NO_GAP_CLASS_EDEFAULT;
			case SculptordslPackage.DSL_RESOURCE__HINT:
				return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
			case SculptordslPackage.DSL_RESOURCE__SCAFFOLD:
				return scaffold != SCAFFOLD_EDEFAULT;
			case SculptordslPackage.DSL_RESOURCE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case SculptordslPackage.DSL_RESOURCE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case SculptordslPackage.DSL_RESOURCE__OPERATIONS:
				return operations != null && !operations.isEmpty();
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
		result.append(", scaffold: ");
		result.append(scaffold);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //DslResourceImpl
