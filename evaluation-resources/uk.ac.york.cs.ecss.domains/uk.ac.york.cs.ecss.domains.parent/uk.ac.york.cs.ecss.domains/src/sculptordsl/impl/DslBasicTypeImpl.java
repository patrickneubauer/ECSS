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
import sculptordsl.DslBasicType;
import sculptordsl.DslDomainObjectOperation;
import sculptordsl.DslReference;
import sculptordsl.DslTrait;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Basic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslBasicTypeImpl#getTraits <em>Traits</em>}</li>
 *   <li>{@link sculptordsl.impl.DslBasicTypeImpl#isNotImmutable <em>Not Immutable</em>}</li>
 *   <li>{@link sculptordsl.impl.DslBasicTypeImpl#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link sculptordsl.impl.DslBasicTypeImpl#isNoGapClass <em>No Gap Class</em>}</li>
 *   <li>{@link sculptordsl.impl.DslBasicTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sculptordsl.impl.DslBasicTypeImpl#getReferences <em>References</em>}</li>
 *   <li>{@link sculptordsl.impl.DslBasicTypeImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslBasicTypeImpl extends DslSimpleDomainObjectImpl implements DslBasicType {
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
	 * The default value of the '{@link #isNotImmutable() <em>Not Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotImmutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_IMMUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotImmutable() <em>Not Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotImmutable()
	 * @generated
	 * @ordered
	 */
	protected boolean notImmutable = NOT_IMMUTABLE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslBasicTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_BASIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslTrait> getTraits() {
		if (traits == null) {
			traits = new EObjectResolvingEList<DslTrait>(DslTrait.class, this, SculptordslPackage.DSL_BASIC_TYPE__TRAITS);
		}
		return traits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNotImmutable() {
		return notImmutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotImmutable(boolean newNotImmutable) {
		boolean oldNotImmutable = notImmutable;
		notImmutable = newNotImmutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_BASIC_TYPE__NOT_IMMUTABLE, oldNotImmutable, notImmutable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_BASIC_TYPE__GAP_CLASS, oldGapClass, gapClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_BASIC_TYPE__NO_GAP_CLASS, oldNoGapClass, noGapClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<DslAttribute>(DslAttribute.class, this, SculptordslPackage.DSL_BASIC_TYPE__ATTRIBUTES);
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
			references = new EObjectContainmentEList<DslReference>(DslReference.class, this, SculptordslPackage.DSL_BASIC_TYPE__REFERENCES);
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
			operations = new EObjectContainmentEList<DslDomainObjectOperation>(DslDomainObjectOperation.class, this, SculptordslPackage.DSL_BASIC_TYPE__OPERATIONS);
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
			case SculptordslPackage.DSL_BASIC_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_BASIC_TYPE__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_BASIC_TYPE__OPERATIONS:
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
			case SculptordslPackage.DSL_BASIC_TYPE__TRAITS:
				return getTraits();
			case SculptordslPackage.DSL_BASIC_TYPE__NOT_IMMUTABLE:
				return isNotImmutable();
			case SculptordslPackage.DSL_BASIC_TYPE__GAP_CLASS:
				return isGapClass();
			case SculptordslPackage.DSL_BASIC_TYPE__NO_GAP_CLASS:
				return isNoGapClass();
			case SculptordslPackage.DSL_BASIC_TYPE__ATTRIBUTES:
				return getAttributes();
			case SculptordslPackage.DSL_BASIC_TYPE__REFERENCES:
				return getReferences();
			case SculptordslPackage.DSL_BASIC_TYPE__OPERATIONS:
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
			case SculptordslPackage.DSL_BASIC_TYPE__TRAITS:
				getTraits().clear();
				getTraits().addAll((Collection<? extends DslTrait>)newValue);
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__NOT_IMMUTABLE:
				setNotImmutable((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__GAP_CLASS:
				setGapClass((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__NO_GAP_CLASS:
				setNoGapClass((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends DslAttribute>)newValue);
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends DslReference>)newValue);
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends DslDomainObjectOperation>)newValue);
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
			case SculptordslPackage.DSL_BASIC_TYPE__TRAITS:
				getTraits().clear();
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__NOT_IMMUTABLE:
				setNotImmutable(NOT_IMMUTABLE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__GAP_CLASS:
				setGapClass(GAP_CLASS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__NO_GAP_CLASS:
				setNoGapClass(NO_GAP_CLASS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__REFERENCES:
				getReferences().clear();
				return;
			case SculptordslPackage.DSL_BASIC_TYPE__OPERATIONS:
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
			case SculptordslPackage.DSL_BASIC_TYPE__TRAITS:
				return traits != null && !traits.isEmpty();
			case SculptordslPackage.DSL_BASIC_TYPE__NOT_IMMUTABLE:
				return notImmutable != NOT_IMMUTABLE_EDEFAULT;
			case SculptordslPackage.DSL_BASIC_TYPE__GAP_CLASS:
				return gapClass != GAP_CLASS_EDEFAULT;
			case SculptordslPackage.DSL_BASIC_TYPE__NO_GAP_CLASS:
				return noGapClass != NO_GAP_CLASS_EDEFAULT;
			case SculptordslPackage.DSL_BASIC_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case SculptordslPackage.DSL_BASIC_TYPE__REFERENCES:
				return references != null && !references.isEmpty();
			case SculptordslPackage.DSL_BASIC_TYPE__OPERATIONS:
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
		result.append(" (notImmutable: ");
		result.append(notImmutable);
		result.append(", gapClass: ");
		result.append(gapClass);
		result.append(", noGapClass: ");
		result.append(noGapClass);
		result.append(')');
		return result.toString();
	}

} //DslBasicTypeImpl
