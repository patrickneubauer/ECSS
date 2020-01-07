/**
 */
package sculptordsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sculptordsl.DslAnyProperty;
import sculptordsl.DslCollectionType;
import sculptordsl.DslVisibility;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Any Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#isKey <em>Key</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#isNotChangeable <em>Not Changeable</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#getNullableMessage <em>Nullable Message</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#isNotEmpty <em>Not Empty</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#getNotEmptyMessage <em>Not Empty Message</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#getSize <em>Size</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAnyPropertyImpl#isTransient <em>Transient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslAnyPropertyImpl extends MinimalEObjectImpl.Container implements DslAnyProperty {
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
	 * The default value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected static final DslCollectionType COLLECTION_TYPE_EDEFAULT = DslCollectionType.NONE;

	/**
	 * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected DslCollectionType collectionType = COLLECTION_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #isKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey()
	 * @generated
	 * @ordered
	 */
	protected boolean key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotChangeable() <em>Not Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_CHANGEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotChangeable() <em>Not Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotChangeable()
	 * @generated
	 * @ordered
	 */
	protected boolean notChangeable = NOT_CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNullableMessage() <em>Nullable Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullableMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String NULLABLE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullableMessage() <em>Nullable Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullableMessage()
	 * @generated
	 * @ordered
	 */
	protected String nullableMessage = NULLABLE_MESSAGE_EDEFAULT;

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
	 * The default value of the '{@link #isNotEmpty() <em>Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_EMPTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotEmpty() <em>Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected boolean notEmpty = NOT_EMPTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotEmptyMessage() <em>Not Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEmptyMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String NOT_EMPTY_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotEmptyMessage() <em>Not Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEmptyMessage()
	 * @generated
	 * @ordered
	 */
	protected String notEmptyMessage = NOT_EMPTY_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

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
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslAnyPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_ANY_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__DOC, oldDoc, doc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslCollectionType getCollectionType() {
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionType(DslCollectionType newCollectionType) {
		DslCollectionType oldCollectionType = collectionType;
		collectionType = newCollectionType == null ? COLLECTION_TYPE_EDEFAULT : newCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__COLLECTION_TYPE, oldCollectionType, collectionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(boolean newKey) {
		boolean oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNotChangeable() {
		return notChangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotChangeable(boolean newNotChangeable) {
		boolean oldNotChangeable = notChangeable;
		notChangeable = newNotChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__NOT_CHANGEABLE, oldNotChangeable, notChangeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNullableMessage() {
		return nullableMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullableMessage(String newNullableMessage) {
		String oldNullableMessage = nullableMessage;
		nullableMessage = newNullableMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__NULLABLE_MESSAGE, oldNullableMessage, nullableMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__HINT, oldHint, hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNotEmpty() {
		return notEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotEmpty(boolean newNotEmpty) {
		boolean oldNotEmpty = notEmpty;
		notEmpty = newNotEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__NOT_EMPTY, oldNotEmpty, notEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotEmptyMessage() {
		return notEmptyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotEmptyMessage(String newNotEmptyMessage) {
		String oldNotEmptyMessage = notEmptyMessage;
		notEmptyMessage = newNotEmptyMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__NOT_EMPTY_MESSAGE, oldNotEmptyMessage, notEmptyMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__VALIDATE, oldValidate, validate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ANY_PROPERTY__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptordslPackage.DSL_ANY_PROPERTY__DOC:
				return getDoc();
			case SculptordslPackage.DSL_ANY_PROPERTY__VISIBILITY:
				return getVisibility();
			case SculptordslPackage.DSL_ANY_PROPERTY__COLLECTION_TYPE:
				return getCollectionType();
			case SculptordslPackage.DSL_ANY_PROPERTY__NAME:
				return getName();
			case SculptordslPackage.DSL_ANY_PROPERTY__KEY:
				return isKey();
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_CHANGEABLE:
				return isNotChangeable();
			case SculptordslPackage.DSL_ANY_PROPERTY__REQUIRED:
				return isRequired();
			case SculptordslPackage.DSL_ANY_PROPERTY__NULLABLE:
				return isNullable();
			case SculptordslPackage.DSL_ANY_PROPERTY__NULLABLE_MESSAGE:
				return getNullableMessage();
			case SculptordslPackage.DSL_ANY_PROPERTY__HINT:
				return getHint();
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_EMPTY:
				return isNotEmpty();
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_EMPTY_MESSAGE:
				return getNotEmptyMessage();
			case SculptordslPackage.DSL_ANY_PROPERTY__SIZE:
				return getSize();
			case SculptordslPackage.DSL_ANY_PROPERTY__VALIDATE:
				return getValidate();
			case SculptordslPackage.DSL_ANY_PROPERTY__TRANSIENT:
				return isTransient();
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
			case SculptordslPackage.DSL_ANY_PROPERTY__DOC:
				setDoc((String)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__VISIBILITY:
				setVisibility((DslVisibility)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__COLLECTION_TYPE:
				setCollectionType((DslCollectionType)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__KEY:
				setKey((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_CHANGEABLE:
				setNotChangeable((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NULLABLE_MESSAGE:
				setNullableMessage((String)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__HINT:
				setHint((String)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_EMPTY:
				setNotEmpty((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_EMPTY_MESSAGE:
				setNotEmptyMessage((String)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__SIZE:
				setSize((String)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__VALIDATE:
				setValidate((String)newValue);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__TRANSIENT:
				setTransient((Boolean)newValue);
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
			case SculptordslPackage.DSL_ANY_PROPERTY__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__COLLECTION_TYPE:
				setCollectionType(COLLECTION_TYPE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_CHANGEABLE:
				setNotChangeable(NOT_CHANGEABLE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NULLABLE_MESSAGE:
				setNullableMessage(NULLABLE_MESSAGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__HINT:
				setHint(HINT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_EMPTY:
				setNotEmpty(NOT_EMPTY_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_EMPTY_MESSAGE:
				setNotEmptyMessage(NOT_EMPTY_MESSAGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__VALIDATE:
				setValidate(VALIDATE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ANY_PROPERTY__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
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
			case SculptordslPackage.DSL_ANY_PROPERTY__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case SculptordslPackage.DSL_ANY_PROPERTY__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case SculptordslPackage.DSL_ANY_PROPERTY__COLLECTION_TYPE:
				return collectionType != COLLECTION_TYPE_EDEFAULT;
			case SculptordslPackage.DSL_ANY_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SculptordslPackage.DSL_ANY_PROPERTY__KEY:
				return key != KEY_EDEFAULT;
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_CHANGEABLE:
				return notChangeable != NOT_CHANGEABLE_EDEFAULT;
			case SculptordslPackage.DSL_ANY_PROPERTY__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case SculptordslPackage.DSL_ANY_PROPERTY__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
			case SculptordslPackage.DSL_ANY_PROPERTY__NULLABLE_MESSAGE:
				return NULLABLE_MESSAGE_EDEFAULT == null ? nullableMessage != null : !NULLABLE_MESSAGE_EDEFAULT.equals(nullableMessage);
			case SculptordslPackage.DSL_ANY_PROPERTY__HINT:
				return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_EMPTY:
				return notEmpty != NOT_EMPTY_EDEFAULT;
			case SculptordslPackage.DSL_ANY_PROPERTY__NOT_EMPTY_MESSAGE:
				return NOT_EMPTY_MESSAGE_EDEFAULT == null ? notEmptyMessage != null : !NOT_EMPTY_MESSAGE_EDEFAULT.equals(notEmptyMessage);
			case SculptordslPackage.DSL_ANY_PROPERTY__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case SculptordslPackage.DSL_ANY_PROPERTY__VALIDATE:
				return VALIDATE_EDEFAULT == null ? validate != null : !VALIDATE_EDEFAULT.equals(validate);
			case SculptordslPackage.DSL_ANY_PROPERTY__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
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
		result.append(", collectionType: ");
		result.append(collectionType);
		result.append(", name: ");
		result.append(name);
		result.append(", key: ");
		result.append(key);
		result.append(", notChangeable: ");
		result.append(notChangeable);
		result.append(", required: ");
		result.append(required);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(", nullableMessage: ");
		result.append(nullableMessage);
		result.append(", hint: ");
		result.append(hint);
		result.append(", notEmpty: ");
		result.append(notEmpty);
		result.append(", notEmptyMessage: ");
		result.append(notEmptyMessage);
		result.append(", size: ");
		result.append(size);
		result.append(", validate: ");
		result.append(validate);
		result.append(", transient: ");
		result.append(transient_);
		result.append(')');
		return result.toString();
	}

} //DslAnyPropertyImpl
