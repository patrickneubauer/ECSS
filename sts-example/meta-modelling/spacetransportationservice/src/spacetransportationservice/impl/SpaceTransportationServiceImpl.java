/**
 */
package spacetransportationservice.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spacetransportationservice.EngineType;
import spacetransportationservice.LaunchSite;
import spacetransportationservice.SpaceTransportationService;
import spacetransportationservice.Spacecraft;
import spacetransportationservice.SpacetransportationservicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Space Transportation Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spacetransportationservice.impl.SpaceTransportationServiceImpl#getLaunchSites <em>Launch Sites</em>}</li>
 *   <li>{@link spacetransportationservice.impl.SpaceTransportationServiceImpl#getEngineTypes <em>Engine Types</em>}</li>
 *   <li>{@link spacetransportationservice.impl.SpaceTransportationServiceImpl#getSpacecrafts <em>Spacecrafts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpaceTransportationServiceImpl extends MinimalEObjectImpl.Container implements SpaceTransportationService {
	/**
	 * The cached value of the '{@link #getLaunchSites() <em>Launch Sites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchSites()
	 * @generated
	 * @ordered
	 */
	protected EList<LaunchSite> launchSites;

	/**
	 * The cached value of the '{@link #getEngineTypes() <em>Engine Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EngineType> engineTypes;

	/**
	 * The cached value of the '{@link #getSpacecrafts() <em>Spacecrafts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacecrafts()
	 * @generated
	 * @ordered
	 */
	protected EList<Spacecraft> spacecrafts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceTransportationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpacetransportationservicePackage.Literals.SPACE_TRANSPORTATION_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LaunchSite> getLaunchSites() {
		if (launchSites == null) {
			launchSites = new EObjectContainmentEList<LaunchSite>(LaunchSite.class, this, SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__LAUNCH_SITES);
		}
		return launchSites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EngineType> getEngineTypes() {
		if (engineTypes == null) {
			engineTypes = new EObjectContainmentEList<EngineType>(EngineType.class, this, SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__ENGINE_TYPES);
		}
		return engineTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Spacecraft> getSpacecrafts() {
		if (spacecrafts == null) {
			spacecrafts = new EObjectContainmentEList<Spacecraft>(Spacecraft.class, this, SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__SPACECRAFTS);
		}
		return spacecrafts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__LAUNCH_SITES:
				return ((InternalEList<?>)getLaunchSites()).basicRemove(otherEnd, msgs);
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__ENGINE_TYPES:
				return ((InternalEList<?>)getEngineTypes()).basicRemove(otherEnd, msgs);
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__SPACECRAFTS:
				return ((InternalEList<?>)getSpacecrafts()).basicRemove(otherEnd, msgs);
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
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__LAUNCH_SITES:
				return getLaunchSites();
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__ENGINE_TYPES:
				return getEngineTypes();
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__SPACECRAFTS:
				return getSpacecrafts();
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
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__LAUNCH_SITES:
				getLaunchSites().clear();
				getLaunchSites().addAll((Collection<? extends LaunchSite>)newValue);
				return;
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__ENGINE_TYPES:
				getEngineTypes().clear();
				getEngineTypes().addAll((Collection<? extends EngineType>)newValue);
				return;
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__SPACECRAFTS:
				getSpacecrafts().clear();
				getSpacecrafts().addAll((Collection<? extends Spacecraft>)newValue);
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
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__LAUNCH_SITES:
				getLaunchSites().clear();
				return;
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__ENGINE_TYPES:
				getEngineTypes().clear();
				return;
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__SPACECRAFTS:
				getSpacecrafts().clear();
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
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__LAUNCH_SITES:
				return launchSites != null && !launchSites.isEmpty();
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__ENGINE_TYPES:
				return engineTypes != null && !engineTypes.isEmpty();
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE__SPACECRAFTS:
				return spacecrafts != null && !spacecrafts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpaceTransportationServiceImpl
