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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sculptordsl.DslComplexType;
import sculptordsl.DslParameter;
import sculptordsl.DslPublish;
import sculptordsl.DslRepositoryOperation;
import sculptordsl.DslVisibility;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Repository Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getThrows <em>Throws</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#isCache <em>Cache</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#isGapOperation <em>Gap Operation</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#isNoGapOperation <em>No Gap Operation</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#isConstruct <em>Construct</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#isBuild <em>Build</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#isMap <em>Map</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getPublish <em>Publish</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#isDelegateToAccessObject <em>Delegate To Access Object</em>}</li>
 *   <li>{@link sculptordsl.impl.DslRepositoryOperationImpl#getAccessObjectName <em>Access Object Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslRepositoryOperationImpl extends DslDomainObjectTypedElementImpl implements DslRepositoryOperation {
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
	 * The default value of the '{@link #isCache() <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCache()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCache() <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCache()
	 * @generated
	 * @ordered
	 */
	protected boolean cache = CACHE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGapOperation() <em>Gap Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapOperation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GAP_OPERATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGapOperation() <em>Gap Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapOperation()
	 * @generated
	 * @ordered
	 */
	protected boolean gapOperation = GAP_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoGapOperation() <em>No Gap Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoGapOperation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_GAP_OPERATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoGapOperation() <em>No Gap Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoGapOperation()
	 * @generated
	 * @ordered
	 */
	protected boolean noGapOperation = NO_GAP_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelect() <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected String select = SELECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupBy() <em>Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupBy()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupBy()
	 * @generated
	 * @ordered
	 */
	protected String groupBy = GROUP_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderBy()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderBy()
	 * @generated
	 * @ordered
	 */
	protected String orderBy = ORDER_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstruct() <em>Construct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstruct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRUCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstruct() <em>Construct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstruct()
	 * @generated
	 * @ordered
	 */
	protected boolean construct = CONSTRUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBuild() <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuild()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUILD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBuild() <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuild()
	 * @generated
	 * @ordered
	 */
	protected boolean build = BUILD_EDEFAULT;

	/**
	 * The default value of the '{@link #isMap() <em>Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMap()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMap() <em>Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMap()
	 * @generated
	 * @ordered
	 */
	protected boolean map = MAP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublish() <em>Publish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublish()
	 * @generated
	 * @ordered
	 */
	protected DslPublish publish;

	/**
	 * The default value of the '{@link #isDelegateToAccessObject() <em>Delegate To Access Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelegateToAccessObject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELEGATE_TO_ACCESS_OBJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDelegateToAccessObject() <em>Delegate To Access Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelegateToAccessObject()
	 * @generated
	 * @ordered
	 */
	protected boolean delegateToAccessObject = DELEGATE_TO_ACCESS_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessObjectName() <em>Access Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessObjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_OBJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessObjectName() <em>Access Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessObjectName()
	 * @generated
	 * @ordered
	 */
	protected String accessObjectName = ACCESS_OBJECT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslRepositoryOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_REPOSITORY_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__DOC, oldDoc, doc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__VISIBILITY, oldVisibility, visibility));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__RETURN_TYPE, oldReturnType, newReturnType);
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
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_REPOSITORY_OPERATION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_REPOSITORY_OPERATION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__RETURN_TYPE, newReturnType, newReturnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<DslParameter>(DslParameter.class, this, SculptordslPackage.DSL_REPOSITORY_OPERATION__PARAMETERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__THROWS, oldThrows, throws_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__HINT, oldHint, hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCache() {
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCache(boolean newCache) {
		boolean oldCache = cache;
		cache = newCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__CACHE, oldCache, cache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGapOperation() {
		return gapOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGapOperation(boolean newGapOperation) {
		boolean oldGapOperation = gapOperation;
		gapOperation = newGapOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__GAP_OPERATION, oldGapOperation, gapOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoGapOperation() {
		return noGapOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoGapOperation(boolean newNoGapOperation) {
		boolean oldNoGapOperation = noGapOperation;
		noGapOperation = newNoGapOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__NO_GAP_OPERATION, oldNoGapOperation, noGapOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelect(String newSelect) {
		String oldSelect = select;
		select = newSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__SELECT, oldSelect, select));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupBy() {
		return groupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupBy(String newGroupBy) {
		String oldGroupBy = groupBy;
		groupBy = newGroupBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__GROUP_BY, oldGroupBy, groupBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderBy(String newOrderBy) {
		String oldOrderBy = orderBy;
		orderBy = newOrderBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__ORDER_BY, oldOrderBy, orderBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConstruct() {
		return construct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstruct(boolean newConstruct) {
		boolean oldConstruct = construct;
		construct = newConstruct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__CONSTRUCT, oldConstruct, construct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBuild() {
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuild(boolean newBuild) {
		boolean oldBuild = build;
		build = newBuild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__BUILD, oldBuild, build));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMap(boolean newMap) {
		boolean oldMap = map;
		map = newMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__MAP, oldMap, map));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslPublish getPublish() {
		return publish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublish(DslPublish newPublish, NotificationChain msgs) {
		DslPublish oldPublish = publish;
		publish = newPublish;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__PUBLISH, oldPublish, newPublish);
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
	public void setPublish(DslPublish newPublish) {
		if (newPublish != publish) {
			NotificationChain msgs = null;
			if (publish != null)
				msgs = ((InternalEObject)publish).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_REPOSITORY_OPERATION__PUBLISH, null, msgs);
			if (newPublish != null)
				msgs = ((InternalEObject)newPublish).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_REPOSITORY_OPERATION__PUBLISH, null, msgs);
			msgs = basicSetPublish(newPublish, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__PUBLISH, newPublish, newPublish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDelegateToAccessObject() {
		return delegateToAccessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegateToAccessObject(boolean newDelegateToAccessObject) {
		boolean oldDelegateToAccessObject = delegateToAccessObject;
		delegateToAccessObject = newDelegateToAccessObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT, oldDelegateToAccessObject, delegateToAccessObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessObjectName() {
		return accessObjectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessObjectName(String newAccessObjectName) {
		String oldAccessObjectName = accessObjectName;
		accessObjectName = newAccessObjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REPOSITORY_OPERATION__ACCESS_OBJECT_NAME, oldAccessObjectName, accessObjectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__PUBLISH:
				return basicSetPublish(null, msgs);
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
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__DOC:
				return getDoc();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__VISIBILITY:
				return getVisibility();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__RETURN_TYPE:
				return getReturnType();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__NAME:
				return getName();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__PARAMETERS:
				return getParameters();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__THROWS:
				return getThrows();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__HINT:
				return getHint();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CACHE:
				return isCache();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__GAP_OPERATION:
				return isGapOperation();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__NO_GAP_OPERATION:
				return isNoGapOperation();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__QUERY:
				return getQuery();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CONDITION:
				return getCondition();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__SELECT:
				return getSelect();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__GROUP_BY:
				return getGroupBy();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__ORDER_BY:
				return getOrderBy();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CONSTRUCT:
				return isConstruct();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__BUILD:
				return isBuild();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__MAP:
				return isMap();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__PUBLISH:
				return getPublish();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT:
				return isDelegateToAccessObject();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__ACCESS_OBJECT_NAME:
				return getAccessObjectName();
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
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__DOC:
				setDoc((String)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__VISIBILITY:
				setVisibility((DslVisibility)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__RETURN_TYPE:
				setReturnType((DslComplexType)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__NAME:
				setName((String)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DslParameter>)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__THROWS:
				setThrows((String)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__HINT:
				setHint((String)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CACHE:
				setCache((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__GAP_OPERATION:
				setGapOperation((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__NO_GAP_OPERATION:
				setNoGapOperation((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__QUERY:
				setQuery((String)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CONDITION:
				setCondition((String)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__SELECT:
				setSelect((String)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__GROUP_BY:
				setGroupBy((String)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__ORDER_BY:
				setOrderBy((String)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CONSTRUCT:
				setConstruct((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__BUILD:
				setBuild((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__MAP:
				setMap((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__PUBLISH:
				setPublish((DslPublish)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT:
				setDelegateToAccessObject((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__ACCESS_OBJECT_NAME:
				setAccessObjectName((String)newValue);
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
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__RETURN_TYPE:
				setReturnType((DslComplexType)null);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__THROWS:
				setThrows(THROWS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__HINT:
				setHint(HINT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CACHE:
				setCache(CACHE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__GAP_OPERATION:
				setGapOperation(GAP_OPERATION_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__NO_GAP_OPERATION:
				setNoGapOperation(NO_GAP_OPERATION_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__SELECT:
				setSelect(SELECT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__GROUP_BY:
				setGroupBy(GROUP_BY_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__ORDER_BY:
				setOrderBy(ORDER_BY_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CONSTRUCT:
				setConstruct(CONSTRUCT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__BUILD:
				setBuild(BUILD_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__MAP:
				setMap(MAP_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__PUBLISH:
				setPublish((DslPublish)null);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT:
				setDelegateToAccessObject(DELEGATE_TO_ACCESS_OBJECT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__ACCESS_OBJECT_NAME:
				setAccessObjectName(ACCESS_OBJECT_NAME_EDEFAULT);
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
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__RETURN_TYPE:
				return returnType != null;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__THROWS:
				return THROWS_EDEFAULT == null ? throws_ != null : !THROWS_EDEFAULT.equals(throws_);
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__HINT:
				return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CACHE:
				return cache != CACHE_EDEFAULT;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__GAP_OPERATION:
				return gapOperation != GAP_OPERATION_EDEFAULT;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__NO_GAP_OPERATION:
				return noGapOperation != NO_GAP_OPERATION_EDEFAULT;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__SELECT:
				return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__GROUP_BY:
				return GROUP_BY_EDEFAULT == null ? groupBy != null : !GROUP_BY_EDEFAULT.equals(groupBy);
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__ORDER_BY:
				return ORDER_BY_EDEFAULT == null ? orderBy != null : !ORDER_BY_EDEFAULT.equals(orderBy);
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__CONSTRUCT:
				return construct != CONSTRUCT_EDEFAULT;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__BUILD:
				return build != BUILD_EDEFAULT;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__MAP:
				return map != MAP_EDEFAULT;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__PUBLISH:
				return publish != null;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT:
				return delegateToAccessObject != DELEGATE_TO_ACCESS_OBJECT_EDEFAULT;
			case SculptordslPackage.DSL_REPOSITORY_OPERATION__ACCESS_OBJECT_NAME:
				return ACCESS_OBJECT_NAME_EDEFAULT == null ? accessObjectName != null : !ACCESS_OBJECT_NAME_EDEFAULT.equals(accessObjectName);
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
		result.append(", cache: ");
		result.append(cache);
		result.append(", gapOperation: ");
		result.append(gapOperation);
		result.append(", noGapOperation: ");
		result.append(noGapOperation);
		result.append(", query: ");
		result.append(query);
		result.append(", condition: ");
		result.append(condition);
		result.append(", select: ");
		result.append(select);
		result.append(", groupBy: ");
		result.append(groupBy);
		result.append(", orderBy: ");
		result.append(orderBy);
		result.append(", construct: ");
		result.append(construct);
		result.append(", build: ");
		result.append(build);
		result.append(", map: ");
		result.append(map);
		result.append(", delegateToAccessObject: ");
		result.append(delegateToAccessObject);
		result.append(", accessObjectName: ");
		result.append(accessObjectName);
		result.append(')');
		return result.toString();
	}

} //DslRepositoryOperationImpl
