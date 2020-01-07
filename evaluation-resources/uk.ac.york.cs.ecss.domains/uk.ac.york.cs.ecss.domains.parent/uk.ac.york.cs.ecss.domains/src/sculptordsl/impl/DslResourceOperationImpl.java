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

import sculptordsl.DslComplexType;
import sculptordsl.DslHttpMethod;
import sculptordsl.DslParameter;
import sculptordsl.DslResourceOperation;
import sculptordsl.DslResourceOperationDelegate;
import sculptordsl.DslVisibility;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Resource Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslResourceOperationImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceOperationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceOperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceOperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceOperationImpl#getThrows <em>Throws</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceOperationImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceOperationImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceOperationImpl#getPath <em>Path</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceOperationImpl#getReturnString <em>Return String</em>}</li>
 *   <li>{@link sculptordsl.impl.DslResourceOperationImpl#getDelegateHolder <em>Delegate Holder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslResourceOperationImpl extends MinimalEObjectImpl.Container implements DslResourceOperation {
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
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final DslVisibility VISIBILITY_EDEFAULT = DslVisibility.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected DslVisibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected DslComplexType returnType;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DslParameter> parameters;

	/**
	 * The default value of the '{@link #getThrows() <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected static final String THROWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThrows() <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected String throws_ = THROWS_EDEFAULT;

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
	 * The default value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected static final DslHttpMethod HTTP_METHOD_EDEFAULT = DslHttpMethod.NONE;

	/**
	 * The cached value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected DslHttpMethod httpMethod = HTTP_METHOD_EDEFAULT;

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
	 * The default value of the '{@link #getReturnString() <em>Return String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnString()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnString() <em>Return String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnString()
	 * @generated
	 * @ordered
	 */
	protected String returnString = RETURN_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDelegateHolder() <em>Delegate Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateHolder()
	 * @generated
	 * @ordered
	 */
	protected DslResourceOperationDelegate delegateHolder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslResourceOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_RESOURCE_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__DOC, oldDoc, doc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslVisibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(DslVisibility newVisibility) {
		DslVisibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslComplexType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(DslComplexType newReturnType, NotificationChain msgs) {
		DslComplexType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_TYPE, oldReturnType, newReturnType);
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
	public void setReturnType(DslComplexType newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_TYPE, newReturnType, newReturnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<DslParameter>(DslParameter.class, this, SculptordslPackage.DSL_RESOURCE_OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThrows() {
		return throws_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrows(String newThrows) {
		String oldThrows = throws_;
		throws_ = newThrows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__THROWS, oldThrows, throws_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__HINT, oldHint, hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslHttpMethod getHttpMethod() {
		return httpMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpMethod(DslHttpMethod newHttpMethod) {
		DslHttpMethod oldHttpMethod = httpMethod;
		httpMethod = newHttpMethod == null ? HTTP_METHOD_EDEFAULT : newHttpMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__HTTP_METHOD, oldHttpMethod, httpMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnString() {
		return returnString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnString(String newReturnString) {
		String oldReturnString = returnString;
		returnString = newReturnString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_STRING, oldReturnString, returnString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslResourceOperationDelegate getDelegateHolder() {
		return delegateHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegateHolder(DslResourceOperationDelegate newDelegateHolder, NotificationChain msgs) {
		DslResourceOperationDelegate oldDelegateHolder = delegateHolder;
		delegateHolder = newDelegateHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__DELEGATE_HOLDER, oldDelegateHolder, newDelegateHolder);
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
	public void setDelegateHolder(DslResourceOperationDelegate newDelegateHolder) {
		if (newDelegateHolder != delegateHolder) {
			NotificationChain msgs = null;
			if (delegateHolder != null)
				msgs = ((InternalEObject)delegateHolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_RESOURCE_OPERATION__DELEGATE_HOLDER, null, msgs);
			if (newDelegateHolder != null)
				msgs = ((InternalEObject)newDelegateHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_RESOURCE_OPERATION__DELEGATE_HOLDER, null, msgs);
			msgs = basicSetDelegateHolder(newDelegateHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_RESOURCE_OPERATION__DELEGATE_HOLDER, newDelegateHolder, newDelegateHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case SculptordslPackage.DSL_RESOURCE_OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_RESOURCE_OPERATION__DELEGATE_HOLDER:
				return basicSetDelegateHolder(null, msgs);
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
			case SculptordslPackage.DSL_RESOURCE_OPERATION__DOC:
				return getDoc();
			case SculptordslPackage.DSL_RESOURCE_OPERATION__VISIBILITY:
				return getVisibility();
			case SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_TYPE:
				return getReturnType();
			case SculptordslPackage.DSL_RESOURCE_OPERATION__NAME:
				return getName();
			case SculptordslPackage.DSL_RESOURCE_OPERATION__PARAMETERS:
				return getParameters();
			case SculptordslPackage.DSL_RESOURCE_OPERATION__THROWS:
				return getThrows();
			case SculptordslPackage.DSL_RESOURCE_OPERATION__HINT:
				return getHint();
			case SculptordslPackage.DSL_RESOURCE_OPERATION__HTTP_METHOD:
				return getHttpMethod();
			case SculptordslPackage.DSL_RESOURCE_OPERATION__PATH:
				return getPath();
			case SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_STRING:
				return getReturnString();
			case SculptordslPackage.DSL_RESOURCE_OPERATION__DELEGATE_HOLDER:
				return getDelegateHolder();
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
			case SculptordslPackage.DSL_RESOURCE_OPERATION__DOC:
				setDoc((String)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__VISIBILITY:
				setVisibility((DslVisibility)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_TYPE:
				setReturnType((DslComplexType)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__NAME:
				setName((String)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DslParameter>)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__THROWS:
				setThrows((String)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__HINT:
				setHint((String)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__HTTP_METHOD:
				setHttpMethod((DslHttpMethod)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__PATH:
				setPath((String)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_STRING:
				setReturnString((String)newValue);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__DELEGATE_HOLDER:
				setDelegateHolder((DslResourceOperationDelegate)newValue);
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
			case SculptordslPackage.DSL_RESOURCE_OPERATION__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_TYPE:
				setReturnType((DslComplexType)null);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__THROWS:
				setThrows(THROWS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__HINT:
				setHint(HINT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__HTTP_METHOD:
				setHttpMethod(HTTP_METHOD_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_STRING:
				setReturnString(RETURN_STRING_EDEFAULT);
				return;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__DELEGATE_HOLDER:
				setDelegateHolder((DslResourceOperationDelegate)null);
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
			case SculptordslPackage.DSL_RESOURCE_OPERATION__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case SculptordslPackage.DSL_RESOURCE_OPERATION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_TYPE:
				return returnType != null;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SculptordslPackage.DSL_RESOURCE_OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SculptordslPackage.DSL_RESOURCE_OPERATION__THROWS:
				return THROWS_EDEFAULT == null ? throws_ != null : !THROWS_EDEFAULT.equals(throws_);
			case SculptordslPackage.DSL_RESOURCE_OPERATION__HINT:
				return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
			case SculptordslPackage.DSL_RESOURCE_OPERATION__HTTP_METHOD:
				return httpMethod != HTTP_METHOD_EDEFAULT;
			case SculptordslPackage.DSL_RESOURCE_OPERATION__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case SculptordslPackage.DSL_RESOURCE_OPERATION__RETURN_STRING:
				return RETURN_STRING_EDEFAULT == null ? returnString != null : !RETURN_STRING_EDEFAULT.equals(returnString);
			case SculptordslPackage.DSL_RESOURCE_OPERATION__DELEGATE_HOLDER:
				return delegateHolder != null;
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
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", name: ");
		result.append(name);
		result.append(", throws: ");
		result.append(throws_);
		result.append(", hint: ");
		result.append(hint);
		result.append(", httpMethod: ");
		result.append(httpMethod);
		result.append(", path: ");
		result.append(path);
		result.append(", returnString: ");
		result.append(returnString);
		result.append(')');
		return result.toString();
	}

} //DslResourceOperationImpl
