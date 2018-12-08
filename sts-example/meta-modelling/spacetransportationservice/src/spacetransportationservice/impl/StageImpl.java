/**
 */
package spacetransportationservice.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spacetransportationservice.EngineType;
import spacetransportationservice.PhysicalProperty;
import spacetransportationservice.SpacetransportationservicePackage;
import spacetransportationservice.Stage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spacetransportationservice.impl.StageImpl#getEngineType <em>Engine Type</em>}</li>
 *   <li>{@link spacetransportationservice.impl.StageImpl#getEngineAmount <em>Engine Amount</em>}</li>
 *   <li>{@link spacetransportationservice.impl.StageImpl#getPhysicalProperties <em>Physical Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageImpl extends NamedElementImpl implements Stage {
	/**
	 * The cached value of the '{@link #getEngineType() <em>Engine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineType()
	 * @generated
	 * @ordered
	 */
	protected EngineType engineType;

	/**
	 * The default value of the '{@link #getEngineAmount() <em>Engine Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineAmount()
	 * @generated
	 * @ordered
	 */
	protected static final int ENGINE_AMOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEngineAmount() <em>Engine Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineAmount()
	 * @generated
	 * @ordered
	 */
	protected int engineAmount = ENGINE_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhysicalProperties() <em>Physical Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalProperty> physicalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpacetransportationservicePackage.Literals.STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineType getEngineType() {
		if (engineType != null && engineType.eIsProxy()) {
			InternalEObject oldEngineType = (InternalEObject)engineType;
			engineType = (EngineType)eResolveProxy(oldEngineType);
			if (engineType != oldEngineType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpacetransportationservicePackage.STAGE__ENGINE_TYPE, oldEngineType, engineType));
			}
		}
		return engineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineType basicGetEngineType() {
		return engineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineType(EngineType newEngineType) {
		EngineType oldEngineType = engineType;
		engineType = newEngineType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacetransportationservicePackage.STAGE__ENGINE_TYPE, oldEngineType, engineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEngineAmount() {
		return engineAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineAmount(int newEngineAmount) {
		int oldEngineAmount = engineAmount;
		engineAmount = newEngineAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacetransportationservicePackage.STAGE__ENGINE_AMOUNT, oldEngineAmount, engineAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalProperty> getPhysicalProperties() {
		if (physicalProperties == null) {
			physicalProperties = new EObjectContainmentEList<PhysicalProperty>(PhysicalProperty.class, this, SpacetransportationservicePackage.STAGE__PHYSICAL_PROPERTIES);
		}
		return physicalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpacetransportationservicePackage.STAGE__PHYSICAL_PROPERTIES:
				return ((InternalEList<?>)getPhysicalProperties()).basicRemove(otherEnd, msgs);
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
			case SpacetransportationservicePackage.STAGE__ENGINE_TYPE:
				if (resolve) return getEngineType();
				return basicGetEngineType();
			case SpacetransportationservicePackage.STAGE__ENGINE_AMOUNT:
				return getEngineAmount();
			case SpacetransportationservicePackage.STAGE__PHYSICAL_PROPERTIES:
				return getPhysicalProperties();
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
			case SpacetransportationservicePackage.STAGE__ENGINE_TYPE:
				setEngineType((EngineType)newValue);
				return;
			case SpacetransportationservicePackage.STAGE__ENGINE_AMOUNT:
				setEngineAmount((Integer)newValue);
				return;
			case SpacetransportationservicePackage.STAGE__PHYSICAL_PROPERTIES:
				getPhysicalProperties().clear();
				getPhysicalProperties().addAll((Collection<? extends PhysicalProperty>)newValue);
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
			case SpacetransportationservicePackage.STAGE__ENGINE_TYPE:
				setEngineType((EngineType)null);
				return;
			case SpacetransportationservicePackage.STAGE__ENGINE_AMOUNT:
				setEngineAmount(ENGINE_AMOUNT_EDEFAULT);
				return;
			case SpacetransportationservicePackage.STAGE__PHYSICAL_PROPERTIES:
				getPhysicalProperties().clear();
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
			case SpacetransportationservicePackage.STAGE__ENGINE_TYPE:
				return engineType != null;
			case SpacetransportationservicePackage.STAGE__ENGINE_AMOUNT:
				return engineAmount != ENGINE_AMOUNT_EDEFAULT;
			case SpacetransportationservicePackage.STAGE__PHYSICAL_PROPERTIES:
				return physicalProperties != null && !physicalProperties.isEmpty();
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
		result.append(" (engineAmount: ");
		result.append(engineAmount);
		result.append(')');
		return result.toString();
	}

} //StageImpl
