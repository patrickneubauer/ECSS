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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spacetransportationservice.Function;
import spacetransportationservice.LaunchSite;
import spacetransportationservice.PhysicalProperty;
import spacetransportationservice.Spacecraft;
import spacetransportationservice.SpacetransportationservicePackage;
import spacetransportationservice.Stage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spacecraft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spacetransportationservice.impl.SpacecraftImpl#getStages <em>Stages</em>}</li>
 *   <li>{@link spacetransportationservice.impl.SpacecraftImpl#getLaunchSites <em>Launch Sites</em>}</li>
 *   <li>{@link spacetransportationservice.impl.SpacecraftImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link spacetransportationservice.impl.SpacecraftImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link spacetransportationservice.impl.SpacecraftImpl#getCountryOfOrigin <em>Country Of Origin</em>}</li>
 *   <li>{@link spacetransportationservice.impl.SpacecraftImpl#getRelaunchCostInMioUSD <em>Relaunch Cost In Mio USD</em>}</li>
 *   <li>{@link spacetransportationservice.impl.SpacecraftImpl#getPhysicalProperties <em>Physical Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpacecraftImpl extends NamedElementImpl implements Spacecraft {
	/**
	 * The cached value of the '{@link #getStages() <em>Stages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStages()
	 * @generated
	 * @ordered
	 */
	protected EList<Stage> stages;

	/**
	 * The cached value of the '{@link #getLaunchSites() <em>Launch Sites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchSites()
	 * @generated
	 * @ordered
	 */
	protected EList<LaunchSite> launchSites;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountryOfOrigin() <em>Country Of Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryOfOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_OF_ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryOfOrigin() <em>Country Of Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryOfOrigin()
	 * @generated
	 * @ordered
	 */
	protected String countryOfOrigin = COUNTRY_OF_ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelaunchCostInMioUSD() <em>Relaunch Cost In Mio USD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaunchCostInMioUSD()
	 * @generated
	 * @ordered
	 */
	protected static final int RELAUNCH_COST_IN_MIO_USD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRelaunchCostInMioUSD() <em>Relaunch Cost In Mio USD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaunchCostInMioUSD()
	 * @generated
	 * @ordered
	 */
	protected int relaunchCostInMioUSD = RELAUNCH_COST_IN_MIO_USD_EDEFAULT;

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
	protected SpacecraftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpacetransportationservicePackage.Literals.SPACECRAFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stage> getStages() {
		if (stages == null) {
			stages = new EObjectContainmentEList<Stage>(Stage.class, this, SpacetransportationservicePackage.SPACECRAFT__STAGES);
		}
		return stages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LaunchSite> getLaunchSites() {
		if (launchSites == null) {
			launchSites = new EObjectResolvingEList<LaunchSite>(LaunchSite.class, this, SpacetransportationservicePackage.SPACECRAFT__LAUNCH_SITES);
		}
		return launchSites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EDataTypeUniqueEList<Function>(Function.class, this, SpacetransportationservicePackage.SPACECRAFT__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacetransportationservicePackage.SPACECRAFT__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryOfOrigin(String newCountryOfOrigin) {
		String oldCountryOfOrigin = countryOfOrigin;
		countryOfOrigin = newCountryOfOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacetransportationservicePackage.SPACECRAFT__COUNTRY_OF_ORIGIN, oldCountryOfOrigin, countryOfOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRelaunchCostInMioUSD() {
		return relaunchCostInMioUSD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelaunchCostInMioUSD(int newRelaunchCostInMioUSD) {
		int oldRelaunchCostInMioUSD = relaunchCostInMioUSD;
		relaunchCostInMioUSD = newRelaunchCostInMioUSD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacetransportationservicePackage.SPACECRAFT__RELAUNCH_COST_IN_MIO_USD, oldRelaunchCostInMioUSD, relaunchCostInMioUSD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalProperty> getPhysicalProperties() {
		if (physicalProperties == null) {
			physicalProperties = new EObjectContainmentEList<PhysicalProperty>(PhysicalProperty.class, this, SpacetransportationservicePackage.SPACECRAFT__PHYSICAL_PROPERTIES);
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
			case SpacetransportationservicePackage.SPACECRAFT__STAGES:
				return ((InternalEList<?>)getStages()).basicRemove(otherEnd, msgs);
			case SpacetransportationservicePackage.SPACECRAFT__PHYSICAL_PROPERTIES:
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
			case SpacetransportationservicePackage.SPACECRAFT__STAGES:
				return getStages();
			case SpacetransportationservicePackage.SPACECRAFT__LAUNCH_SITES:
				return getLaunchSites();
			case SpacetransportationservicePackage.SPACECRAFT__FUNCTIONS:
				return getFunctions();
			case SpacetransportationservicePackage.SPACECRAFT__MANUFACTURER:
				return getManufacturer();
			case SpacetransportationservicePackage.SPACECRAFT__COUNTRY_OF_ORIGIN:
				return getCountryOfOrigin();
			case SpacetransportationservicePackage.SPACECRAFT__RELAUNCH_COST_IN_MIO_USD:
				return getRelaunchCostInMioUSD();
			case SpacetransportationservicePackage.SPACECRAFT__PHYSICAL_PROPERTIES:
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
			case SpacetransportationservicePackage.SPACECRAFT__STAGES:
				getStages().clear();
				getStages().addAll((Collection<? extends Stage>)newValue);
				return;
			case SpacetransportationservicePackage.SPACECRAFT__LAUNCH_SITES:
				getLaunchSites().clear();
				getLaunchSites().addAll((Collection<? extends LaunchSite>)newValue);
				return;
			case SpacetransportationservicePackage.SPACECRAFT__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case SpacetransportationservicePackage.SPACECRAFT__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case SpacetransportationservicePackage.SPACECRAFT__COUNTRY_OF_ORIGIN:
				setCountryOfOrigin((String)newValue);
				return;
			case SpacetransportationservicePackage.SPACECRAFT__RELAUNCH_COST_IN_MIO_USD:
				setRelaunchCostInMioUSD((Integer)newValue);
				return;
			case SpacetransportationservicePackage.SPACECRAFT__PHYSICAL_PROPERTIES:
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
			case SpacetransportationservicePackage.SPACECRAFT__STAGES:
				getStages().clear();
				return;
			case SpacetransportationservicePackage.SPACECRAFT__LAUNCH_SITES:
				getLaunchSites().clear();
				return;
			case SpacetransportationservicePackage.SPACECRAFT__FUNCTIONS:
				getFunctions().clear();
				return;
			case SpacetransportationservicePackage.SPACECRAFT__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case SpacetransportationservicePackage.SPACECRAFT__COUNTRY_OF_ORIGIN:
				setCountryOfOrigin(COUNTRY_OF_ORIGIN_EDEFAULT);
				return;
			case SpacetransportationservicePackage.SPACECRAFT__RELAUNCH_COST_IN_MIO_USD:
				setRelaunchCostInMioUSD(RELAUNCH_COST_IN_MIO_USD_EDEFAULT);
				return;
			case SpacetransportationservicePackage.SPACECRAFT__PHYSICAL_PROPERTIES:
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
			case SpacetransportationservicePackage.SPACECRAFT__STAGES:
				return stages != null && !stages.isEmpty();
			case SpacetransportationservicePackage.SPACECRAFT__LAUNCH_SITES:
				return launchSites != null && !launchSites.isEmpty();
			case SpacetransportationservicePackage.SPACECRAFT__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case SpacetransportationservicePackage.SPACECRAFT__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case SpacetransportationservicePackage.SPACECRAFT__COUNTRY_OF_ORIGIN:
				return COUNTRY_OF_ORIGIN_EDEFAULT == null ? countryOfOrigin != null : !COUNTRY_OF_ORIGIN_EDEFAULT.equals(countryOfOrigin);
			case SpacetransportationservicePackage.SPACECRAFT__RELAUNCH_COST_IN_MIO_USD:
				return relaunchCostInMioUSD != RELAUNCH_COST_IN_MIO_USD_EDEFAULT;
			case SpacetransportationservicePackage.SPACECRAFT__PHYSICAL_PROPERTIES:
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
		result.append(" (functions: ");
		result.append(functions);
		result.append(", manufacturer: ");
		result.append(manufacturer);
		result.append(", countryOfOrigin: ");
		result.append(countryOfOrigin);
		result.append(", relaunchCostInMioUSD: ");
		result.append(relaunchCostInMioUSD);
		result.append(')');
		return result.toString();
	}

} //SpacecraftImpl
