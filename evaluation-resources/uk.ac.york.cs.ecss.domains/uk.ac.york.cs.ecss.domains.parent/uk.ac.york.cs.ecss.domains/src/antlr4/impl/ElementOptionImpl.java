/**
 */
package antlr4.impl;

import antlr4.Antlr4Package;
import antlr4.ElementOption;
import antlr4.OptionValue;
import antlr4.QualifiedId;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link antlr4.impl.ElementOptionImpl#getQualifiedId <em>Qualified Id</em>}</li>
 *   <li>{@link antlr4.impl.ElementOptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link antlr4.impl.ElementOptionImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link antlr4.impl.ElementOptionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementOptionImpl extends MinimalEObjectImpl.Container implements ElementOption {
	/**
	 * The cached value of the '{@link #getQualifiedId() <em>Qualified Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedId()
	 * @generated
	 * @ordered
	 */
	protected QualifiedId qualifiedId;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssign() <em>Assign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssign()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssign() <em>Assign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssign()
	 * @generated
	 * @ordered
	 */
	protected String assign = ASSIGN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected OptionValue value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Antlr4Package.Literals.ELEMENT_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedId getQualifiedId() {
		return qualifiedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifiedId(QualifiedId newQualifiedId, NotificationChain msgs) {
		QualifiedId oldQualifiedId = qualifiedId;
		qualifiedId = newQualifiedId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Antlr4Package.ELEMENT_OPTION__QUALIFIED_ID, oldQualifiedId, newQualifiedId);
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
	public void setQualifiedId(QualifiedId newQualifiedId) {
		if (newQualifiedId != qualifiedId) {
			NotificationChain msgs = null;
			if (qualifiedId != null)
				msgs = ((InternalEObject)qualifiedId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Antlr4Package.ELEMENT_OPTION__QUALIFIED_ID, null, msgs);
			if (newQualifiedId != null)
				msgs = ((InternalEObject)newQualifiedId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Antlr4Package.ELEMENT_OPTION__QUALIFIED_ID, null, msgs);
			msgs = basicSetQualifiedId(newQualifiedId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.ELEMENT_OPTION__QUALIFIED_ID, newQualifiedId, newQualifiedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.ELEMENT_OPTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssign() {
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssign(String newAssign) {
		String oldAssign = assign;
		assign = newAssign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.ELEMENT_OPTION__ASSIGN, oldAssign, assign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(OptionValue newValue, NotificationChain msgs) {
		OptionValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Antlr4Package.ELEMENT_OPTION__VALUE, oldValue, newValue);
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
	public void setValue(OptionValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Antlr4Package.ELEMENT_OPTION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Antlr4Package.ELEMENT_OPTION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.ELEMENT_OPTION__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Antlr4Package.ELEMENT_OPTION__QUALIFIED_ID:
				return basicSetQualifiedId(null, msgs);
			case Antlr4Package.ELEMENT_OPTION__VALUE:
				return basicSetValue(null, msgs);
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
			case Antlr4Package.ELEMENT_OPTION__QUALIFIED_ID:
				return getQualifiedId();
			case Antlr4Package.ELEMENT_OPTION__ID:
				return getId();
			case Antlr4Package.ELEMENT_OPTION__ASSIGN:
				return getAssign();
			case Antlr4Package.ELEMENT_OPTION__VALUE:
				return getValue();
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
			case Antlr4Package.ELEMENT_OPTION__QUALIFIED_ID:
				setQualifiedId((QualifiedId)newValue);
				return;
			case Antlr4Package.ELEMENT_OPTION__ID:
				setId((String)newValue);
				return;
			case Antlr4Package.ELEMENT_OPTION__ASSIGN:
				setAssign((String)newValue);
				return;
			case Antlr4Package.ELEMENT_OPTION__VALUE:
				setValue((OptionValue)newValue);
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
			case Antlr4Package.ELEMENT_OPTION__QUALIFIED_ID:
				setQualifiedId((QualifiedId)null);
				return;
			case Antlr4Package.ELEMENT_OPTION__ID:
				setId(ID_EDEFAULT);
				return;
			case Antlr4Package.ELEMENT_OPTION__ASSIGN:
				setAssign(ASSIGN_EDEFAULT);
				return;
			case Antlr4Package.ELEMENT_OPTION__VALUE:
				setValue((OptionValue)null);
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
			case Antlr4Package.ELEMENT_OPTION__QUALIFIED_ID:
				return qualifiedId != null;
			case Antlr4Package.ELEMENT_OPTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Antlr4Package.ELEMENT_OPTION__ASSIGN:
				return ASSIGN_EDEFAULT == null ? assign != null : !ASSIGN_EDEFAULT.equals(assign);
			case Antlr4Package.ELEMENT_OPTION__VALUE:
				return value != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", assign: ");
		result.append(assign);
		result.append(')');
		return result.toString();
	}

} //ElementOptionImpl
