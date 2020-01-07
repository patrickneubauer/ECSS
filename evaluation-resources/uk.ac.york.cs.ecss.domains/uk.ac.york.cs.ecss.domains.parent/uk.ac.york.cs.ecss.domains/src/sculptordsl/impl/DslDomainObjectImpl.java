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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sculptordsl.DslAttribute;
import sculptordsl.DslDiscriminatorType;
import sculptordsl.DslDomainObject;
import sculptordsl.DslDomainObjectOperation;
import sculptordsl.DslInheritanceType;
import sculptordsl.DslReference;
import sculptordsl.DslRepository;
import sculptordsl.DslTrait;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Domain Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getExtendsName <em>Extends Name</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getTraits <em>Traits</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#isCache <em>Cache</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#isNoGapClass <em>No Gap Class</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#isScaffold <em>Scaffold</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getDatabaseTable <em>Database Table</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getDiscriminatorValue <em>Discriminator Value</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getDiscriminatorType <em>Discriminator Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getDiscriminatorLength <em>Discriminator Length</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getInheritanceType <em>Inheritance Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#isNotAggregateRoot <em>Not Aggregate Root</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getReferences <em>References</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDomainObjectImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslDomainObjectImpl extends DslSimpleDomainObjectImpl implements DslDomainObject {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtendsName() <em>Extends Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendsName() <em>Extends Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsName()
	 * @generated
	 * @ordered
	 */
	protected String extendsName = EXTENDS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraits() <em>Traits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraits()
	 * @generated
	 * @ordered
	 */
	protected EList<DslTrait> traits;

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
	 * The default value of the '{@link #getDatabaseTable() <em>Database Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTable()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseTable() <em>Database Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTable()
	 * @generated
	 * @ordered
	 */
	protected String databaseTable = DATABASE_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscriminatorValue() <em>Discriminator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminatorValue() <em>Discriminator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorValue()
	 * @generated
	 * @ordered
	 */
	protected String discriminatorValue = DISCRIMINATOR_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscriminatorColumn() <em>Discriminator Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminatorColumn() <em>Discriminator Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorColumn()
	 * @generated
	 * @ordered
	 */
	protected String discriminatorColumn = DISCRIMINATOR_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscriminatorType() <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorType()
	 * @generated
	 * @ordered
	 */
	protected static final DslDiscriminatorType DISCRIMINATOR_TYPE_EDEFAULT = DslDiscriminatorType.STRING;

	/**
	 * The cached value of the '{@link #getDiscriminatorType() <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorType()
	 * @generated
	 * @ordered
	 */
	protected DslDiscriminatorType discriminatorType = DISCRIMINATOR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscriminatorLength() <em>Discriminator Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorLength()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminatorLength() <em>Discriminator Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorLength()
	 * @generated
	 * @ordered
	 */
	protected String discriminatorLength = DISCRIMINATOR_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritanceType() <em>Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceType()
	 * @generated
	 * @ordered
	 */
	protected static final DslInheritanceType INHERITANCE_TYPE_EDEFAULT = DslInheritanceType.JOINED;

	/**
	 * The cached value of the '{@link #getInheritanceType() <em>Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceType()
	 * @generated
	 * @ordered
	 */
	protected DslInheritanceType inheritanceType = INHERITANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected String validate = VALIDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotAggregateRoot() <em>Not Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotAggregateRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_AGGREGATE_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotAggregateRoot() <em>Not Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotAggregateRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean notAggregateRoot = NOT_AGGREGATE_ROOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected DslDomainObject belongsTo;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DslAttribute> attributes;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<DslReference> references;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DslDomainObjectOperation> operations;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected DslRepository repository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslDomainObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_DOMAIN_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtendsName() {
		return extendsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendsName(String newExtendsName) {
		String oldExtendsName = extendsName;
		extendsName = newExtendsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__EXTENDS_NAME, oldExtendsName, extendsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslTrait> getTraits() {
		if (traits == null) {
			traits = new EObjectResolvingEList<DslTrait>(DslTrait.class, this, SculptordslPackage.DSL_DOMAIN_OBJECT__TRAITS);
		}
		return traits;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__CACHE, oldCache, cache));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__GAP_CLASS, oldGapClass, gapClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__NO_GAP_CLASS, oldNoGapClass, noGapClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__SCAFFOLD, oldScaffold, scaffold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatabaseTable() {
		return databaseTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseTable(String newDatabaseTable) {
		String oldDatabaseTable = databaseTable;
		databaseTable = newDatabaseTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__DATABASE_TABLE, oldDatabaseTable, databaseTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscriminatorValue() {
		return discriminatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscriminatorValue(String newDiscriminatorValue) {
		String oldDiscriminatorValue = discriminatorValue;
		discriminatorValue = newDiscriminatorValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_VALUE, oldDiscriminatorValue, discriminatorValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscriminatorColumn() {
		return discriminatorColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscriminatorColumn(String newDiscriminatorColumn) {
		String oldDiscriminatorColumn = discriminatorColumn;
		discriminatorColumn = newDiscriminatorColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_COLUMN, oldDiscriminatorColumn, discriminatorColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDiscriminatorType getDiscriminatorType() {
		return discriminatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscriminatorType(DslDiscriminatorType newDiscriminatorType) {
		DslDiscriminatorType oldDiscriminatorType = discriminatorType;
		discriminatorType = newDiscriminatorType == null ? DISCRIMINATOR_TYPE_EDEFAULT : newDiscriminatorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_TYPE, oldDiscriminatorType, discriminatorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscriminatorLength() {
		return discriminatorLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscriminatorLength(String newDiscriminatorLength) {
		String oldDiscriminatorLength = discriminatorLength;
		discriminatorLength = newDiscriminatorLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_LENGTH, oldDiscriminatorLength, discriminatorLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslInheritanceType getInheritanceType() {
		return inheritanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInheritanceType(DslInheritanceType newInheritanceType) {
		DslInheritanceType oldInheritanceType = inheritanceType;
		inheritanceType = newInheritanceType == null ? INHERITANCE_TYPE_EDEFAULT : newInheritanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__INHERITANCE_TYPE, oldInheritanceType, inheritanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidate() {
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidate(String newValidate) {
		String oldValidate = validate;
		validate = newValidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__VALIDATE, oldValidate, validate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNotAggregateRoot() {
		return notAggregateRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotAggregateRoot(boolean newNotAggregateRoot) {
		boolean oldNotAggregateRoot = notAggregateRoot;
		notAggregateRoot = newNotAggregateRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__NOT_AGGREGATE_ROOT, oldNotAggregateRoot, notAggregateRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDomainObject getBelongsTo() {
		if (belongsTo != null && belongsTo.eIsProxy()) {
			InternalEObject oldBelongsTo = (InternalEObject)belongsTo;
			belongsTo = (DslDomainObject)eResolveProxy(oldBelongsTo);
			if (belongsTo != oldBelongsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptordslPackage.DSL_DOMAIN_OBJECT__BELONGS_TO, oldBelongsTo, belongsTo));
			}
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslDomainObject basicGetBelongsTo() {
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBelongsTo(DslDomainObject newBelongsTo) {
		DslDomainObject oldBelongsTo = belongsTo;
		belongsTo = newBelongsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__BELONGS_TO, oldBelongsTo, belongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<DslAttribute>(DslAttribute.class, this, SculptordslPackage.DSL_DOMAIN_OBJECT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<DslReference>(DslReference.class, this, SculptordslPackage.DSL_DOMAIN_OBJECT__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslDomainObjectOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<DslDomainObjectOperation>(DslDomainObjectOperation.class, this, SculptordslPackage.DSL_DOMAIN_OBJECT__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslRepository getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(DslRepository newRepository, NotificationChain msgs) {
		DslRepository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__REPOSITORY, oldRepository, newRepository);
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
	public void setRepository(DslRepository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject)repository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_DOMAIN_OBJECT__REPOSITORY, null, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_DOMAIN_OBJECT__REPOSITORY, null, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DOMAIN_OBJECT__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptordslPackage.DSL_DOMAIN_OBJECT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_DOMAIN_OBJECT__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_DOMAIN_OBJECT__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_DOMAIN_OBJECT__REPOSITORY:
				return basicSetRepository(null, msgs);
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
			case SculptordslPackage.DSL_DOMAIN_OBJECT__ABSTRACT:
				return isAbstract();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__EXTENDS_NAME:
				return getExtendsName();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__TRAITS:
				return getTraits();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__CACHE:
				return isCache();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__GAP_CLASS:
				return isGapClass();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__NO_GAP_CLASS:
				return isNoGapClass();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__SCAFFOLD:
				return isScaffold();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DATABASE_TABLE:
				return getDatabaseTable();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_VALUE:
				return getDiscriminatorValue();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_COLUMN:
				return getDiscriminatorColumn();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_TYPE:
				return getDiscriminatorType();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_LENGTH:
				return getDiscriminatorLength();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__INHERITANCE_TYPE:
				return getInheritanceType();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__VALIDATE:
				return getValidate();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__NOT_AGGREGATE_ROOT:
				return isNotAggregateRoot();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__BELONGS_TO:
				if (resolve) return getBelongsTo();
				return basicGetBelongsTo();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__ATTRIBUTES:
				return getAttributes();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__REFERENCES:
				return getReferences();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__OPERATIONS:
				return getOperations();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__REPOSITORY:
				return getRepository();
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
			case SculptordslPackage.DSL_DOMAIN_OBJECT__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__EXTENDS_NAME:
				setExtendsName((String)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__TRAITS:
				getTraits().clear();
				getTraits().addAll((Collection<? extends DslTrait>)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__CACHE:
				setCache((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__GAP_CLASS:
				setGapClass((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__NO_GAP_CLASS:
				setNoGapClass((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__SCAFFOLD:
				setScaffold((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DATABASE_TABLE:
				setDatabaseTable((String)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_VALUE:
				setDiscriminatorValue((String)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_COLUMN:
				setDiscriminatorColumn((String)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_TYPE:
				setDiscriminatorType((DslDiscriminatorType)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_LENGTH:
				setDiscriminatorLength((String)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__INHERITANCE_TYPE:
				setInheritanceType((DslInheritanceType)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__VALIDATE:
				setValidate((String)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__NOT_AGGREGATE_ROOT:
				setNotAggregateRoot((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__BELONGS_TO:
				setBelongsTo((DslDomainObject)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends DslAttribute>)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends DslReference>)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends DslDomainObjectOperation>)newValue);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__REPOSITORY:
				setRepository((DslRepository)newValue);
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
			case SculptordslPackage.DSL_DOMAIN_OBJECT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__EXTENDS_NAME:
				setExtendsName(EXTENDS_NAME_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__TRAITS:
				getTraits().clear();
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__CACHE:
				setCache(CACHE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__GAP_CLASS:
				setGapClass(GAP_CLASS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__NO_GAP_CLASS:
				setNoGapClass(NO_GAP_CLASS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__SCAFFOLD:
				setScaffold(SCAFFOLD_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DATABASE_TABLE:
				setDatabaseTable(DATABASE_TABLE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_VALUE:
				setDiscriminatorValue(DISCRIMINATOR_VALUE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_COLUMN:
				setDiscriminatorColumn(DISCRIMINATOR_COLUMN_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_TYPE:
				setDiscriminatorType(DISCRIMINATOR_TYPE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_LENGTH:
				setDiscriminatorLength(DISCRIMINATOR_LENGTH_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__INHERITANCE_TYPE:
				setInheritanceType(INHERITANCE_TYPE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__VALIDATE:
				setValidate(VALIDATE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__NOT_AGGREGATE_ROOT:
				setNotAggregateRoot(NOT_AGGREGATE_ROOT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__BELONGS_TO:
				setBelongsTo((DslDomainObject)null);
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__REFERENCES:
				getReferences().clear();
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__OPERATIONS:
				getOperations().clear();
				return;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__REPOSITORY:
				setRepository((DslRepository)null);
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
			case SculptordslPackage.DSL_DOMAIN_OBJECT__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__EXTENDS_NAME:
				return EXTENDS_NAME_EDEFAULT == null ? extendsName != null : !EXTENDS_NAME_EDEFAULT.equals(extendsName);
			case SculptordslPackage.DSL_DOMAIN_OBJECT__TRAITS:
				return traits != null && !traits.isEmpty();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__CACHE:
				return cache != CACHE_EDEFAULT;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__GAP_CLASS:
				return gapClass != GAP_CLASS_EDEFAULT;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__NO_GAP_CLASS:
				return noGapClass != NO_GAP_CLASS_EDEFAULT;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__SCAFFOLD:
				return scaffold != SCAFFOLD_EDEFAULT;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DATABASE_TABLE:
				return DATABASE_TABLE_EDEFAULT == null ? databaseTable != null : !DATABASE_TABLE_EDEFAULT.equals(databaseTable);
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_VALUE:
				return DISCRIMINATOR_VALUE_EDEFAULT == null ? discriminatorValue != null : !DISCRIMINATOR_VALUE_EDEFAULT.equals(discriminatorValue);
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_COLUMN:
				return DISCRIMINATOR_COLUMN_EDEFAULT == null ? discriminatorColumn != null : !DISCRIMINATOR_COLUMN_EDEFAULT.equals(discriminatorColumn);
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_TYPE:
				return discriminatorType != DISCRIMINATOR_TYPE_EDEFAULT;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__DISCRIMINATOR_LENGTH:
				return DISCRIMINATOR_LENGTH_EDEFAULT == null ? discriminatorLength != null : !DISCRIMINATOR_LENGTH_EDEFAULT.equals(discriminatorLength);
			case SculptordslPackage.DSL_DOMAIN_OBJECT__INHERITANCE_TYPE:
				return inheritanceType != INHERITANCE_TYPE_EDEFAULT;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__VALIDATE:
				return VALIDATE_EDEFAULT == null ? validate != null : !VALIDATE_EDEFAULT.equals(validate);
			case SculptordslPackage.DSL_DOMAIN_OBJECT__NOT_AGGREGATE_ROOT:
				return notAggregateRoot != NOT_AGGREGATE_ROOT_EDEFAULT;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__BELONGS_TO:
				return belongsTo != null;
			case SculptordslPackage.DSL_DOMAIN_OBJECT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__REFERENCES:
				return references != null && !references.isEmpty();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case SculptordslPackage.DSL_DOMAIN_OBJECT__REPOSITORY:
				return repository != null;
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", extendsName: ");
		result.append(extendsName);
		result.append(", cache: ");
		result.append(cache);
		result.append(", gapClass: ");
		result.append(gapClass);
		result.append(", noGapClass: ");
		result.append(noGapClass);
		result.append(", scaffold: ");
		result.append(scaffold);
		result.append(", databaseTable: ");
		result.append(databaseTable);
		result.append(", discriminatorValue: ");
		result.append(discriminatorValue);
		result.append(", discriminatorColumn: ");
		result.append(discriminatorColumn);
		result.append(", discriminatorType: ");
		result.append(discriminatorType);
		result.append(", discriminatorLength: ");
		result.append(discriminatorLength);
		result.append(", inheritanceType: ");
		result.append(inheritanceType);
		result.append(", validate: ");
		result.append(validate);
		result.append(", notAggregateRoot: ");
		result.append(notAggregateRoot);
		result.append(')');
		return result.toString();
	}

} //DslDomainObjectImpl
