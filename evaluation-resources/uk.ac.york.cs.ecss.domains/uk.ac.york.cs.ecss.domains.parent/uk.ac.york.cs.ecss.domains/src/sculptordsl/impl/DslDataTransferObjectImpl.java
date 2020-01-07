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

import sculptordsl.DslDataTransferObject;
import sculptordsl.DslDtoAttribute;
import sculptordsl.DslDtoReference;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Data Transfer Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslDataTransferObjectImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDataTransferObjectImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDataTransferObjectImpl#getExtendsName <em>Extends Name</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDataTransferObjectImpl#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDataTransferObjectImpl#isNoGapClass <em>No Gap Class</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDataTransferObjectImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDataTransferObjectImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sculptordsl.impl.DslDataTransferObjectImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslDataTransferObjectImpl extends DslSimpleDomainObjectImpl implements DslDataTransferObject {
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
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected DslDataTransferObject extends_;

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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DslDtoAttribute> attributes;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<DslDtoReference> references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslDataTransferObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_DATA_TRANSFER_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDataTransferObject getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (DslDataTransferObject)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslDataTransferObject basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtends(DslDataTransferObject newExtends) {
		DslDataTransferObject oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__EXTENDS, oldExtends, extends_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__EXTENDS_NAME, oldExtendsName, extendsName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__GAP_CLASS, oldGapClass, gapClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__NO_GAP_CLASS, oldNoGapClass, noGapClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__VALIDATE, oldValidate, validate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslDtoAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<DslDtoAttribute>(DslDtoAttribute.class, this, SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslDtoReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<DslDtoReference>(DslDtoReference.class, this, SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__ABSTRACT:
				return isAbstract();
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__EXTENDS_NAME:
				return getExtendsName();
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__GAP_CLASS:
				return isGapClass();
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__NO_GAP_CLASS:
				return isNoGapClass();
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__VALIDATE:
				return getValidate();
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__ATTRIBUTES:
				return getAttributes();
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__REFERENCES:
				return getReferences();
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
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__EXTENDS:
				setExtends((DslDataTransferObject)newValue);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__EXTENDS_NAME:
				setExtendsName((String)newValue);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__GAP_CLASS:
				setGapClass((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__NO_GAP_CLASS:
				setNoGapClass((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__VALIDATE:
				setValidate((String)newValue);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends DslDtoAttribute>)newValue);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends DslDtoReference>)newValue);
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
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__EXTENDS:
				setExtends((DslDataTransferObject)null);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__EXTENDS_NAME:
				setExtendsName(EXTENDS_NAME_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__GAP_CLASS:
				setGapClass(GAP_CLASS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__NO_GAP_CLASS:
				setNoGapClass(NO_GAP_CLASS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__VALIDATE:
				setValidate(VALIDATE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__REFERENCES:
				getReferences().clear();
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
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__EXTENDS:
				return extends_ != null;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__EXTENDS_NAME:
				return EXTENDS_NAME_EDEFAULT == null ? extendsName != null : !EXTENDS_NAME_EDEFAULT.equals(extendsName);
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__GAP_CLASS:
				return gapClass != GAP_CLASS_EDEFAULT;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__NO_GAP_CLASS:
				return noGapClass != NO_GAP_CLASS_EDEFAULT;
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__VALIDATE:
				return VALIDATE_EDEFAULT == null ? validate != null : !VALIDATE_EDEFAULT.equals(validate);
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT__REFERENCES:
				return references != null && !references.isEmpty();
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
		result.append(", gapClass: ");
		result.append(gapClass);
		result.append(", noGapClass: ");
		result.append(noGapClass);
		result.append(", validate: ");
		result.append(validate);
		result.append(')');
		return result.toString();
	}

} //DslDataTransferObjectImpl
