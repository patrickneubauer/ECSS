/**
 */
package spacetransportationservice.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spacetransportationservice.EngineType;
import spacetransportationservice.SpacetransportationservicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spacetransportationservice.impl.EngineTypeImpl#getFuelKind <em>Fuel Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineTypeImpl extends NamedElementImpl implements EngineType {
	/**
	 * The default value of the '{@link #getFuelKind() <em>Fuel Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelKind()
	 * @generated
	 * @ordered
	 */
	protected static final String FUEL_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuelKind() <em>Fuel Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelKind()
	 * @generated
	 * @ordered
	 */
	protected String fuelKind = FUEL_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpacetransportationservicePackage.Literals.ENGINE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFuelKind() {
		return fuelKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuelKind(String newFuelKind) {
		String oldFuelKind = fuelKind;
		fuelKind = newFuelKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacetransportationservicePackage.ENGINE_TYPE__FUEL_KIND, oldFuelKind, fuelKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpacetransportationservicePackage.ENGINE_TYPE__FUEL_KIND:
				return getFuelKind();
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
			case SpacetransportationservicePackage.ENGINE_TYPE__FUEL_KIND:
				setFuelKind((String)newValue);
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
			case SpacetransportationservicePackage.ENGINE_TYPE__FUEL_KIND:
				setFuelKind(FUEL_KIND_EDEFAULT);
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
			case SpacetransportationservicePackage.ENGINE_TYPE__FUEL_KIND:
				return FUEL_KIND_EDEFAULT == null ? fuelKind != null : !FUEL_KIND_EDEFAULT.equals(fuelKind);
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
		result.append(" (fuelKind: ");
		result.append(fuelKind);
		result.append(')');
		return result.toString();
	}

} //EngineTypeImpl
