/**
 */
package rIMDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rIMDsl.DomainDeclaration;
import rIMDsl.MdfAnnotation;
import rIMDsl.RIMDslPackage;
import rIMDsl.Ref;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.impl.DomainDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link rIMDsl.impl.DomainDeclarationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link rIMDsl.impl.DomainDeclarationImpl#getRims <em>Rims</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainDeclarationImpl extends RefImpl implements DomainDeclaration {
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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<MdfAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getRims() <em>Rims</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRims()
	 * @generated
	 * @ordered
	 */
	protected EList<Ref> rims;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMDslPackage.Literals.DOMAIN_DECLARATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.DOMAIN_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MdfAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<MdfAnnotation>(MdfAnnotation.class, this, RIMDslPackage.DOMAIN_DECLARATION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ref> getRims() {
		if (rims == null) {
			rims = new EObjectContainmentEList<Ref>(Ref.class, this, RIMDslPackage.DOMAIN_DECLARATION__RIMS);
		}
		return rims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RIMDslPackage.DOMAIN_DECLARATION__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case RIMDslPackage.DOMAIN_DECLARATION__RIMS:
				return ((InternalEList<?>)getRims()).basicRemove(otherEnd, msgs);
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
			case RIMDslPackage.DOMAIN_DECLARATION__NAME:
				return getName();
			case RIMDslPackage.DOMAIN_DECLARATION__ANNOTATIONS:
				return getAnnotations();
			case RIMDslPackage.DOMAIN_DECLARATION__RIMS:
				return getRims();
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
			case RIMDslPackage.DOMAIN_DECLARATION__NAME:
				setName((String)newValue);
				return;
			case RIMDslPackage.DOMAIN_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends MdfAnnotation>)newValue);
				return;
			case RIMDslPackage.DOMAIN_DECLARATION__RIMS:
				getRims().clear();
				getRims().addAll((Collection<? extends Ref>)newValue);
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
			case RIMDslPackage.DOMAIN_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RIMDslPackage.DOMAIN_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case RIMDslPackage.DOMAIN_DECLARATION__RIMS:
				getRims().clear();
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
			case RIMDslPackage.DOMAIN_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RIMDslPackage.DOMAIN_DECLARATION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case RIMDslPackage.DOMAIN_DECLARATION__RIMS:
				return rims != null && !rims.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainDeclarationImpl
