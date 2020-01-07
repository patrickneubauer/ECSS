/**
 */
package sculptordsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sculptordsl.DslOppositeHolder;
import sculptordsl.DslReference;
import sculptordsl.DslSimpleDomainObject;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#getDomainObjectType <em>Domain Object Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#isCache <em>Cache</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#isInverse <em>Inverse</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#getDatabaseJoinTable <em>Database Join Table</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#getDatabaseJoinColumn <em>Database Join Column</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#getValidMessage <em>Valid Message</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#isOrderColumn <em>Order Column</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#getOrderColumnName <em>Order Column Name</em>}</li>
 *   <li>{@link sculptordsl.impl.DslReferenceImpl#getOppositeHolder <em>Opposite Holder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslReferenceImpl extends DslPropertyImpl implements DslReference {
	/**
	 * The cached value of the '{@link #getDomainObjectType() <em>Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectType()
	 * @generated
	 * @ordered
	 */
	protected DslSimpleDomainObject domainObjectType;

	/**
	 * The default value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected static final String CASCADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected String cascade = CASCADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected static final String FETCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected String fetch = FETCH_EDEFAULT;

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
	 * The default value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected boolean inverse = INVERSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseJoinTable() <em>Database Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseJoinTable()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_JOIN_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseJoinTable() <em>Database Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseJoinTable()
	 * @generated
	 * @ordered
	 */
	protected String databaseJoinTable = DATABASE_JOIN_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseJoinColumn() <em>Database Join Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseJoinColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_JOIN_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseJoinColumn() <em>Database Join Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseJoinColumn()
	 * @generated
	 * @ordered
	 */
	protected String databaseJoinColumn = DATABASE_JOIN_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected boolean valid = VALID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidMessage() <em>Valid Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidMessage() <em>Valid Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidMessage()
	 * @generated
	 * @ordered
	 */
	protected String validMessage = VALID_MESSAGE_EDEFAULT;

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
	 * The default value of the '{@link #isOrderColumn() <em>Order Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrderColumn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDER_COLUMN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrderColumn() <em>Order Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrderColumn()
	 * @generated
	 * @ordered
	 */
	protected boolean orderColumn = ORDER_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderColumnName() <em>Order Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderColumnName() <em>Order Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderColumnName()
	 * @generated
	 * @ordered
	 */
	protected String orderColumnName = ORDER_COLUMN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOppositeHolder() <em>Opposite Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeHolder()
	 * @generated
	 * @ordered
	 */
	protected DslOppositeHolder oppositeHolder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslSimpleDomainObject getDomainObjectType() {
		if (domainObjectType != null && domainObjectType.eIsProxy()) {
			InternalEObject oldDomainObjectType = (InternalEObject)domainObjectType;
			domainObjectType = (DslSimpleDomainObject)eResolveProxy(oldDomainObjectType);
			if (domainObjectType != oldDomainObjectType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptordslPackage.DSL_REFERENCE__DOMAIN_OBJECT_TYPE, oldDomainObjectType, domainObjectType));
			}
		}
		return domainObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslSimpleDomainObject basicGetDomainObjectType() {
		return domainObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainObjectType(DslSimpleDomainObject newDomainObjectType) {
		DslSimpleDomainObject oldDomainObjectType = domainObjectType;
		domainObjectType = newDomainObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__DOMAIN_OBJECT_TYPE, oldDomainObjectType, domainObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCascade() {
		return cascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCascade(String newCascade) {
		String oldCascade = cascade;
		cascade = newCascade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__CASCADE, oldCascade, cascade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFetch() {
		return fetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFetch(String newFetch) {
		String oldFetch = fetch;
		fetch = newFetch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__FETCH, oldFetch, fetch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__CACHE, oldCache, cache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInverse() {
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInverse(boolean newInverse) {
		boolean oldInverse = inverse;
		inverse = newInverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__INVERSE, oldInverse, inverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatabaseJoinTable() {
		return databaseJoinTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseJoinTable(String newDatabaseJoinTable) {
		String oldDatabaseJoinTable = databaseJoinTable;
		databaseJoinTable = newDatabaseJoinTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__DATABASE_JOIN_TABLE, oldDatabaseJoinTable, databaseJoinTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatabaseJoinColumn() {
		return databaseJoinColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseJoinColumn(String newDatabaseJoinColumn) {
		String oldDatabaseJoinColumn = databaseJoinColumn;
		databaseJoinColumn = newDatabaseJoinColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__DATABASE_JOIN_COLUMN, oldDatabaseJoinColumn, databaseJoinColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValid() {
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValid(boolean newValid) {
		boolean oldValid = valid;
		valid = newValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidMessage() {
		return validMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidMessage(String newValidMessage) {
		String oldValidMessage = validMessage;
		validMessage = newValidMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__VALID_MESSAGE, oldValidMessage, validMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__ORDER_BY, oldOrderBy, orderBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrderColumn() {
		return orderColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderColumn(boolean newOrderColumn) {
		boolean oldOrderColumn = orderColumn;
		orderColumn = newOrderColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__ORDER_COLUMN, oldOrderColumn, orderColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderColumnName() {
		return orderColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderColumnName(String newOrderColumnName) {
		String oldOrderColumnName = orderColumnName;
		orderColumnName = newOrderColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__ORDER_COLUMN_NAME, oldOrderColumnName, orderColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslOppositeHolder getOppositeHolder() {
		return oppositeHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOppositeHolder(DslOppositeHolder newOppositeHolder, NotificationChain msgs) {
		DslOppositeHolder oldOppositeHolder = oppositeHolder;
		oppositeHolder = newOppositeHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__OPPOSITE_HOLDER, oldOppositeHolder, newOppositeHolder);
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
	public void setOppositeHolder(DslOppositeHolder newOppositeHolder) {
		if (newOppositeHolder != oppositeHolder) {
			NotificationChain msgs = null;
			if (oppositeHolder != null)
				msgs = ((InternalEObject)oppositeHolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_REFERENCE__OPPOSITE_HOLDER, null, msgs);
			if (newOppositeHolder != null)
				msgs = ((InternalEObject)newOppositeHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_REFERENCE__OPPOSITE_HOLDER, null, msgs);
			msgs = basicSetOppositeHolder(newOppositeHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_REFERENCE__OPPOSITE_HOLDER, newOppositeHolder, newOppositeHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptordslPackage.DSL_REFERENCE__OPPOSITE_HOLDER:
				return basicSetOppositeHolder(null, msgs);
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
			case SculptordslPackage.DSL_REFERENCE__DOMAIN_OBJECT_TYPE:
				if (resolve) return getDomainObjectType();
				return basicGetDomainObjectType();
			case SculptordslPackage.DSL_REFERENCE__CASCADE:
				return getCascade();
			case SculptordslPackage.DSL_REFERENCE__FETCH:
				return getFetch();
			case SculptordslPackage.DSL_REFERENCE__CACHE:
				return isCache();
			case SculptordslPackage.DSL_REFERENCE__INVERSE:
				return isInverse();
			case SculptordslPackage.DSL_REFERENCE__DATABASE_JOIN_TABLE:
				return getDatabaseJoinTable();
			case SculptordslPackage.DSL_REFERENCE__DATABASE_JOIN_COLUMN:
				return getDatabaseJoinColumn();
			case SculptordslPackage.DSL_REFERENCE__VALID:
				return isValid();
			case SculptordslPackage.DSL_REFERENCE__VALID_MESSAGE:
				return getValidMessage();
			case SculptordslPackage.DSL_REFERENCE__ORDER_BY:
				return getOrderBy();
			case SculptordslPackage.DSL_REFERENCE__ORDER_COLUMN:
				return isOrderColumn();
			case SculptordslPackage.DSL_REFERENCE__ORDER_COLUMN_NAME:
				return getOrderColumnName();
			case SculptordslPackage.DSL_REFERENCE__OPPOSITE_HOLDER:
				return getOppositeHolder();
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
			case SculptordslPackage.DSL_REFERENCE__DOMAIN_OBJECT_TYPE:
				setDomainObjectType((DslSimpleDomainObject)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__CASCADE:
				setCascade((String)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__FETCH:
				setFetch((String)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__CACHE:
				setCache((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__INVERSE:
				setInverse((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__DATABASE_JOIN_TABLE:
				setDatabaseJoinTable((String)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__DATABASE_JOIN_COLUMN:
				setDatabaseJoinColumn((String)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__VALID:
				setValid((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__VALID_MESSAGE:
				setValidMessage((String)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__ORDER_BY:
				setOrderBy((String)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__ORDER_COLUMN:
				setOrderColumn((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__ORDER_COLUMN_NAME:
				setOrderColumnName((String)newValue);
				return;
			case SculptordslPackage.DSL_REFERENCE__OPPOSITE_HOLDER:
				setOppositeHolder((DslOppositeHolder)newValue);
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
			case SculptordslPackage.DSL_REFERENCE__DOMAIN_OBJECT_TYPE:
				setDomainObjectType((DslSimpleDomainObject)null);
				return;
			case SculptordslPackage.DSL_REFERENCE__CASCADE:
				setCascade(CASCADE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REFERENCE__FETCH:
				setFetch(FETCH_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REFERENCE__CACHE:
				setCache(CACHE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REFERENCE__INVERSE:
				setInverse(INVERSE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REFERENCE__DATABASE_JOIN_TABLE:
				setDatabaseJoinTable(DATABASE_JOIN_TABLE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REFERENCE__DATABASE_JOIN_COLUMN:
				setDatabaseJoinColumn(DATABASE_JOIN_COLUMN_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REFERENCE__VALID:
				setValid(VALID_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REFERENCE__VALID_MESSAGE:
				setValidMessage(VALID_MESSAGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REFERENCE__ORDER_BY:
				setOrderBy(ORDER_BY_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REFERENCE__ORDER_COLUMN:
				setOrderColumn(ORDER_COLUMN_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REFERENCE__ORDER_COLUMN_NAME:
				setOrderColumnName(ORDER_COLUMN_NAME_EDEFAULT);
				return;
			case SculptordslPackage.DSL_REFERENCE__OPPOSITE_HOLDER:
				setOppositeHolder((DslOppositeHolder)null);
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
			case SculptordslPackage.DSL_REFERENCE__DOMAIN_OBJECT_TYPE:
				return domainObjectType != null;
			case SculptordslPackage.DSL_REFERENCE__CASCADE:
				return CASCADE_EDEFAULT == null ? cascade != null : !CASCADE_EDEFAULT.equals(cascade);
			case SculptordslPackage.DSL_REFERENCE__FETCH:
				return FETCH_EDEFAULT == null ? fetch != null : !FETCH_EDEFAULT.equals(fetch);
			case SculptordslPackage.DSL_REFERENCE__CACHE:
				return cache != CACHE_EDEFAULT;
			case SculptordslPackage.DSL_REFERENCE__INVERSE:
				return inverse != INVERSE_EDEFAULT;
			case SculptordslPackage.DSL_REFERENCE__DATABASE_JOIN_TABLE:
				return DATABASE_JOIN_TABLE_EDEFAULT == null ? databaseJoinTable != null : !DATABASE_JOIN_TABLE_EDEFAULT.equals(databaseJoinTable);
			case SculptordslPackage.DSL_REFERENCE__DATABASE_JOIN_COLUMN:
				return DATABASE_JOIN_COLUMN_EDEFAULT == null ? databaseJoinColumn != null : !DATABASE_JOIN_COLUMN_EDEFAULT.equals(databaseJoinColumn);
			case SculptordslPackage.DSL_REFERENCE__VALID:
				return valid != VALID_EDEFAULT;
			case SculptordslPackage.DSL_REFERENCE__VALID_MESSAGE:
				return VALID_MESSAGE_EDEFAULT == null ? validMessage != null : !VALID_MESSAGE_EDEFAULT.equals(validMessage);
			case SculptordslPackage.DSL_REFERENCE__ORDER_BY:
				return ORDER_BY_EDEFAULT == null ? orderBy != null : !ORDER_BY_EDEFAULT.equals(orderBy);
			case SculptordslPackage.DSL_REFERENCE__ORDER_COLUMN:
				return orderColumn != ORDER_COLUMN_EDEFAULT;
			case SculptordslPackage.DSL_REFERENCE__ORDER_COLUMN_NAME:
				return ORDER_COLUMN_NAME_EDEFAULT == null ? orderColumnName != null : !ORDER_COLUMN_NAME_EDEFAULT.equals(orderColumnName);
			case SculptordslPackage.DSL_REFERENCE__OPPOSITE_HOLDER:
				return oppositeHolder != null;
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
		result.append(" (cascade: ");
		result.append(cascade);
		result.append(", fetch: ");
		result.append(fetch);
		result.append(", cache: ");
		result.append(cache);
		result.append(", inverse: ");
		result.append(inverse);
		result.append(", databaseJoinTable: ");
		result.append(databaseJoinTable);
		result.append(", databaseJoinColumn: ");
		result.append(databaseJoinColumn);
		result.append(", valid: ");
		result.append(valid);
		result.append(", validMessage: ");
		result.append(validMessage);
		result.append(", orderBy: ");
		result.append(orderBy);
		result.append(", orderColumn: ");
		result.append(orderColumn);
		result.append(", orderColumnName: ");
		result.append(orderColumnName);
		result.append(')');
		return result.toString();
	}

} //DslReferenceImpl
