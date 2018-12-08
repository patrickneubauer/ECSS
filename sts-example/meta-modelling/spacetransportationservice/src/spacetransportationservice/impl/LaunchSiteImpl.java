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

import spacetransportationservice.LaunchSite;
import spacetransportationservice.PhysicalProperty;
import spacetransportationservice.SpacetransportationservicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launch Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spacetransportationservice.impl.LaunchSiteImpl#getLocationLatitude <em>Location Latitude</em>}</li>
 *   <li>{@link spacetransportationservice.impl.LaunchSiteImpl#getLocationLongitude <em>Location Longitude</em>}</li>
 *   <li>{@link spacetransportationservice.impl.LaunchSiteImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link spacetransportationservice.impl.LaunchSiteImpl#getNumberOfLaunchpads <em>Number Of Launchpads</em>}</li>
 *   <li>{@link spacetransportationservice.impl.LaunchSiteImpl#getPhysicalProperties <em>Physical Properties</em>}</li>
 *   <li>{@link spacetransportationservice.impl.LaunchSiteImpl#isOperational <em>Operational</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaunchSiteImpl extends NamedElementImpl implements LaunchSite {
	/**
	 * The default value of the '{@link #getLocationLatitude() <em>Location Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LOCATION_LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLocationLatitude() <em>Location Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationLatitude()
	 * @generated
	 * @ordered
	 */
	protected double locationLatitude = LOCATION_LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationLongitude() <em>Location Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LOCATION_LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLocationLongitude() <em>Location Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationLongitude()
	 * @generated
	 * @ordered
	 */
	protected double locationLongitude = LOCATION_LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfLaunchpads() <em>Number Of Launchpads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLaunchpads()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_LAUNCHPADS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfLaunchpads() <em>Number Of Launchpads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLaunchpads()
	 * @generated
	 * @ordered
	 */
	protected int numberOfLaunchpads = NUMBER_OF_LAUNCHPADS_EDEFAULT;

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
	 * The default value of the '{@link #isOperational() <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperational()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPERATIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperational() <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperational()
	 * @generated
	 * @ordered
	 */
	protected boolean operational = OPERATIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaunchSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpacetransportationservicePackage.Literals.LAUNCH_SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLocationLatitude() {
		return locationLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationLatitude(double newLocationLatitude) {
		double oldLocationLatitude = locationLatitude;
		locationLatitude = newLocationLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacetransportationservicePackage.LAUNCH_SITE__LOCATION_LATITUDE, oldLocationLatitude, locationLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLocationLongitude() {
		return locationLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationLongitude(double newLocationLongitude) {
		double oldLocationLongitude = locationLongitude;
		locationLongitude = newLocationLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacetransportationservicePackage.LAUNCH_SITE__LOCATION_LONGITUDE, oldLocationLongitude, locationLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacetransportationservicePackage.LAUNCH_SITE__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfLaunchpads() {
		return numberOfLaunchpads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfLaunchpads(int newNumberOfLaunchpads) {
		int oldNumberOfLaunchpads = numberOfLaunchpads;
		numberOfLaunchpads = newNumberOfLaunchpads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacetransportationservicePackage.LAUNCH_SITE__NUMBER_OF_LAUNCHPADS, oldNumberOfLaunchpads, numberOfLaunchpads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalProperty> getPhysicalProperties() {
		if (physicalProperties == null) {
			physicalProperties = new EObjectContainmentEList<PhysicalProperty>(PhysicalProperty.class, this, SpacetransportationservicePackage.LAUNCH_SITE__PHYSICAL_PROPERTIES);
		}
		return physicalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOperational() {
		return operational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperational(boolean newOperational) {
		boolean oldOperational = operational;
		operational = newOperational;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacetransportationservicePackage.LAUNCH_SITE__OPERATIONAL, oldOperational, operational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpacetransportationservicePackage.LAUNCH_SITE__PHYSICAL_PROPERTIES:
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
			case SpacetransportationservicePackage.LAUNCH_SITE__LOCATION_LATITUDE:
				return getLocationLatitude();
			case SpacetransportationservicePackage.LAUNCH_SITE__LOCATION_LONGITUDE:
				return getLocationLongitude();
			case SpacetransportationservicePackage.LAUNCH_SITE__OPERATOR:
				return getOperator();
			case SpacetransportationservicePackage.LAUNCH_SITE__NUMBER_OF_LAUNCHPADS:
				return getNumberOfLaunchpads();
			case SpacetransportationservicePackage.LAUNCH_SITE__PHYSICAL_PROPERTIES:
				return getPhysicalProperties();
			case SpacetransportationservicePackage.LAUNCH_SITE__OPERATIONAL:
				return isOperational();
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
			case SpacetransportationservicePackage.LAUNCH_SITE__LOCATION_LATITUDE:
				setLocationLatitude((Double)newValue);
				return;
			case SpacetransportationservicePackage.LAUNCH_SITE__LOCATION_LONGITUDE:
				setLocationLongitude((Double)newValue);
				return;
			case SpacetransportationservicePackage.LAUNCH_SITE__OPERATOR:
				setOperator((String)newValue);
				return;
			case SpacetransportationservicePackage.LAUNCH_SITE__NUMBER_OF_LAUNCHPADS:
				setNumberOfLaunchpads((Integer)newValue);
				return;
			case SpacetransportationservicePackage.LAUNCH_SITE__PHYSICAL_PROPERTIES:
				getPhysicalProperties().clear();
				getPhysicalProperties().addAll((Collection<? extends PhysicalProperty>)newValue);
				return;
			case SpacetransportationservicePackage.LAUNCH_SITE__OPERATIONAL:
				setOperational((Boolean)newValue);
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
			case SpacetransportationservicePackage.LAUNCH_SITE__LOCATION_LATITUDE:
				setLocationLatitude(LOCATION_LATITUDE_EDEFAULT);
				return;
			case SpacetransportationservicePackage.LAUNCH_SITE__LOCATION_LONGITUDE:
				setLocationLongitude(LOCATION_LONGITUDE_EDEFAULT);
				return;
			case SpacetransportationservicePackage.LAUNCH_SITE__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case SpacetransportationservicePackage.LAUNCH_SITE__NUMBER_OF_LAUNCHPADS:
				setNumberOfLaunchpads(NUMBER_OF_LAUNCHPADS_EDEFAULT);
				return;
			case SpacetransportationservicePackage.LAUNCH_SITE__PHYSICAL_PROPERTIES:
				getPhysicalProperties().clear();
				return;
			case SpacetransportationservicePackage.LAUNCH_SITE__OPERATIONAL:
				setOperational(OPERATIONAL_EDEFAULT);
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
			case SpacetransportationservicePackage.LAUNCH_SITE__LOCATION_LATITUDE:
				return locationLatitude != LOCATION_LATITUDE_EDEFAULT;
			case SpacetransportationservicePackage.LAUNCH_SITE__LOCATION_LONGITUDE:
				return locationLongitude != LOCATION_LONGITUDE_EDEFAULT;
			case SpacetransportationservicePackage.LAUNCH_SITE__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case SpacetransportationservicePackage.LAUNCH_SITE__NUMBER_OF_LAUNCHPADS:
				return numberOfLaunchpads != NUMBER_OF_LAUNCHPADS_EDEFAULT;
			case SpacetransportationservicePackage.LAUNCH_SITE__PHYSICAL_PROPERTIES:
				return physicalProperties != null && !physicalProperties.isEmpty();
			case SpacetransportationservicePackage.LAUNCH_SITE__OPERATIONAL:
				return operational != OPERATIONAL_EDEFAULT;
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
		result.append(" (locationLatitude: ");
		result.append(locationLatitude);
		result.append(", locationLongitude: ");
		result.append(locationLongitude);
		result.append(", operator: ");
		result.append(operator);
		result.append(", numberOfLaunchpads: ");
		result.append(numberOfLaunchpads);
		result.append(", operational: ");
		result.append(operational);
		result.append(')');
		return result.toString();
	}

} //LaunchSiteImpl
