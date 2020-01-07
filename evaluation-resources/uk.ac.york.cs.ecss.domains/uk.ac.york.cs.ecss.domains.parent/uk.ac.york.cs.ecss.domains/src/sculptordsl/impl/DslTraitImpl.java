/**
 */
package sculptordsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sculptordsl.DslAttribute;
import sculptordsl.DslDomainObjectOperation;
import sculptordsl.DslReference;
import sculptordsl.DslTrait;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Trait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslTraitImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sculptordsl.impl.DslTraitImpl#getReferences <em>References</em>}</li>
 *   <li>{@link sculptordsl.impl.DslTraitImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslTraitImpl extends DslSimpleDomainObjectImpl implements DslTrait {
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
	protected DslTraitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_TRAIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<DslAttribute>(DslAttribute.class, this, SculptordslPackage.DSL_TRAIT__ATTRIBUTES);
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
			references = new EObjectContainmentEList<DslReference>(DslReference.class, this, SculptordslPackage.DSL_TRAIT__REFERENCES);
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
			operations = new EObjectContainmentEList<DslDomainObjectOperation>(DslDomainObjectOperation.class, this, SculptordslPackage.DSL_TRAIT__OPERATIONS);
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
			case SculptordslPackage.DSL_TRAIT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_TRAIT__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_TRAIT__OPERATIONS:
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
			case SculptordslPackage.DSL_TRAIT__ATTRIBUTES:
				return getAttributes();
			case SculptordslPackage.DSL_TRAIT__REFERENCES:
				return getReferences();
			case SculptordslPackage.DSL_TRAIT__OPERATIONS:
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
			case SculptordslPackage.DSL_TRAIT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends DslAttribute>)newValue);
				return;
			case SculptordslPackage.DSL_TRAIT__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends DslReference>)newValue);
				return;
			case SculptordslPackage.DSL_TRAIT__OPERATIONS:
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
			case SculptordslPackage.DSL_TRAIT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case SculptordslPackage.DSL_TRAIT__REFERENCES:
				getReferences().clear();
				return;
			case SculptordslPackage.DSL_TRAIT__OPERATIONS:
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
			case SculptordslPackage.DSL_TRAIT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case SculptordslPackage.DSL_TRAIT__REFERENCES:
				return references != null && !references.isEmpty();
			case SculptordslPackage.DSL_TRAIT__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DslTraitImpl
