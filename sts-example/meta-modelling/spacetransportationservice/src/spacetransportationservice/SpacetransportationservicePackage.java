/**
 */
package spacetransportationservice;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see spacetransportationservice.SpacetransportationserviceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface SpacetransportationservicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spacetransportationservice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.york.ac.uk/ecss/examples/spacetransportationservice";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpacetransportationservicePackage eINSTANCE = spacetransportationservice.impl.SpacetransportationservicePackageImpl.init();

	/**
	 * The meta object id for the '{@link spacetransportationservice.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spacetransportationservice.impl.NamedElementImpl
	 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spacetransportationservice.impl.SpacecraftImpl <em>Spacecraft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spacetransportationservice.impl.SpacecraftImpl
	 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getSpacecraft()
	 * @generated
	 */
	int SPACECRAFT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__STAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Launch Sites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__LAUNCH_SITES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__FUNCTIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__MANUFACTURER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Country Of Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__COUNTRY_OF_ORIGIN = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Relaunch Cost In Mio USD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__RELAUNCH_COST_IN_MIO_USD = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Physical Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__PHYSICAL_PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Spacecraft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Spacecraft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spacetransportationservice.impl.LaunchSiteImpl <em>Launch Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spacetransportationservice.impl.LaunchSiteImpl
	 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getLaunchSite()
	 * @generated
	 */
	int LAUNCH_SITE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_SITE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Location Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_SITE__LOCATION_LATITUDE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_SITE__LOCATION_LONGITUDE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_SITE__OPERATOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Of Launchpads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_SITE__NUMBER_OF_LAUNCHPADS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Physical Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_SITE__PHYSICAL_PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_SITE__OPERATIONAL = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Launch Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_SITE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Launch Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_SITE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spacetransportationservice.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spacetransportationservice.impl.StageImpl
	 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Engine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ENGINE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Engine Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ENGINE_AMOUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__PHYSICAL_PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spacetransportationservice.impl.PhysicalPropertyImpl <em>Physical Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spacetransportationservice.impl.PhysicalPropertyImpl
	 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getPhysicalProperty()
	 * @generated
	 */
	int PHYSICAL_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROPERTY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROPERTY__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROPERTY__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Physical Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Physical Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spacetransportationservice.impl.EngineTypeImpl <em>Engine Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spacetransportationservice.impl.EngineTypeImpl
	 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getEngineType()
	 * @generated
	 */
	int ENGINE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fuel Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_TYPE__FUEL_KIND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Engine Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Engine Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spacetransportationservice.impl.SpaceTransportationServiceImpl <em>Space Transportation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spacetransportationservice.impl.SpaceTransportationServiceImpl
	 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getSpaceTransportationService()
	 * @generated
	 */
	int SPACE_TRANSPORTATION_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Launch Sites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TRANSPORTATION_SERVICE__LAUNCH_SITES = 0;

	/**
	 * The feature id for the '<em><b>Engine Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TRANSPORTATION_SERVICE__ENGINE_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Spacecrafts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TRANSPORTATION_SERVICE__SPACECRAFTS = 2;

	/**
	 * The number of structural features of the '<em>Space Transportation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TRANSPORTATION_SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Space Transportation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TRANSPORTATION_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spacetransportationservice.Function <em>Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spacetransportationservice.Function
	 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 7;

	/**
	 * The meta object id for the '{@link spacetransportationservice.PhysicalPropertyType <em>Physical Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spacetransportationservice.PhysicalPropertyType
	 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getPhysicalPropertyType()
	 * @generated
	 */
	int PHYSICAL_PROPERTY_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link spacetransportationservice.Spacecraft <em>Spacecraft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecraft</em>'.
	 * @see spacetransportationservice.Spacecraft
	 * @generated
	 */
	EClass getSpacecraft();

	/**
	 * Returns the meta object for the containment reference list '{@link spacetransportationservice.Spacecraft#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see spacetransportationservice.Spacecraft#getStages()
	 * @see #getSpacecraft()
	 * @generated
	 */
	EReference getSpacecraft_Stages();

	/**
	 * Returns the meta object for the reference list '{@link spacetransportationservice.Spacecraft#getLaunchSites <em>Launch Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Launch Sites</em>'.
	 * @see spacetransportationservice.Spacecraft#getLaunchSites()
	 * @see #getSpacecraft()
	 * @generated
	 */
	EReference getSpacecraft_LaunchSites();

	/**
	 * Returns the meta object for the attribute list '{@link spacetransportationservice.Spacecraft#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Functions</em>'.
	 * @see spacetransportationservice.Spacecraft#getFunctions()
	 * @see #getSpacecraft()
	 * @generated
	 */
	EAttribute getSpacecraft_Functions();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.Spacecraft#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see spacetransportationservice.Spacecraft#getManufacturer()
	 * @see #getSpacecraft()
	 * @generated
	 */
	EAttribute getSpacecraft_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.Spacecraft#getCountryOfOrigin <em>Country Of Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Of Origin</em>'.
	 * @see spacetransportationservice.Spacecraft#getCountryOfOrigin()
	 * @see #getSpacecraft()
	 * @generated
	 */
	EAttribute getSpacecraft_CountryOfOrigin();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.Spacecraft#getRelaunchCostInMioUSD <em>Relaunch Cost In Mio USD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relaunch Cost In Mio USD</em>'.
	 * @see spacetransportationservice.Spacecraft#getRelaunchCostInMioUSD()
	 * @see #getSpacecraft()
	 * @generated
	 */
	EAttribute getSpacecraft_RelaunchCostInMioUSD();

	/**
	 * Returns the meta object for the containment reference list '{@link spacetransportationservice.Spacecraft#getPhysicalProperties <em>Physical Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Properties</em>'.
	 * @see spacetransportationservice.Spacecraft#getPhysicalProperties()
	 * @see #getSpacecraft()
	 * @generated
	 */
	EReference getSpacecraft_PhysicalProperties();

	/**
	 * Returns the meta object for class '{@link spacetransportationservice.LaunchSite <em>Launch Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Site</em>'.
	 * @see spacetransportationservice.LaunchSite
	 * @generated
	 */
	EClass getLaunchSite();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.LaunchSite#getLocationLatitude <em>Location Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Latitude</em>'.
	 * @see spacetransportationservice.LaunchSite#getLocationLatitude()
	 * @see #getLaunchSite()
	 * @generated
	 */
	EAttribute getLaunchSite_LocationLatitude();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.LaunchSite#getLocationLongitude <em>Location Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Longitude</em>'.
	 * @see spacetransportationservice.LaunchSite#getLocationLongitude()
	 * @see #getLaunchSite()
	 * @generated
	 */
	EAttribute getLaunchSite_LocationLongitude();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.LaunchSite#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see spacetransportationservice.LaunchSite#getOperator()
	 * @see #getLaunchSite()
	 * @generated
	 */
	EAttribute getLaunchSite_Operator();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.LaunchSite#getNumberOfLaunchpads <em>Number Of Launchpads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Launchpads</em>'.
	 * @see spacetransportationservice.LaunchSite#getNumberOfLaunchpads()
	 * @see #getLaunchSite()
	 * @generated
	 */
	EAttribute getLaunchSite_NumberOfLaunchpads();

	/**
	 * Returns the meta object for the containment reference list '{@link spacetransportationservice.LaunchSite#getPhysicalProperties <em>Physical Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Properties</em>'.
	 * @see spacetransportationservice.LaunchSite#getPhysicalProperties()
	 * @see #getLaunchSite()
	 * @generated
	 */
	EReference getLaunchSite_PhysicalProperties();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.LaunchSite#isOperational <em>Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational</em>'.
	 * @see spacetransportationservice.LaunchSite#isOperational()
	 * @see #getLaunchSite()
	 * @generated
	 */
	EAttribute getLaunchSite_Operational();

	/**
	 * Returns the meta object for class '{@link spacetransportationservice.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see spacetransportationservice.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the reference '{@link spacetransportationservice.Stage#getEngineType <em>Engine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Engine Type</em>'.
	 * @see spacetransportationservice.Stage#getEngineType()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_EngineType();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.Stage#getEngineAmount <em>Engine Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Amount</em>'.
	 * @see spacetransportationservice.Stage#getEngineAmount()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_EngineAmount();

	/**
	 * Returns the meta object for the containment reference list '{@link spacetransportationservice.Stage#getPhysicalProperties <em>Physical Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Properties</em>'.
	 * @see spacetransportationservice.Stage#getPhysicalProperties()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_PhysicalProperties();

	/**
	 * Returns the meta object for class '{@link spacetransportationservice.PhysicalProperty <em>Physical Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Property</em>'.
	 * @see spacetransportationservice.PhysicalProperty
	 * @generated
	 */
	EClass getPhysicalProperty();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.PhysicalProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see spacetransportationservice.PhysicalProperty#getType()
	 * @see #getPhysicalProperty()
	 * @generated
	 */
	EAttribute getPhysicalProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.PhysicalProperty#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see spacetransportationservice.PhysicalProperty#getUnit()
	 * @see #getPhysicalProperty()
	 * @generated
	 */
	EAttribute getPhysicalProperty_Unit();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.PhysicalProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see spacetransportationservice.PhysicalProperty#getValue()
	 * @see #getPhysicalProperty()
	 * @generated
	 */
	EAttribute getPhysicalProperty_Value();

	/**
	 * Returns the meta object for class '{@link spacetransportationservice.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see spacetransportationservice.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spacetransportationservice.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link spacetransportationservice.EngineType <em>Engine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine Type</em>'.
	 * @see spacetransportationservice.EngineType
	 * @generated
	 */
	EClass getEngineType();

	/**
	 * Returns the meta object for the attribute '{@link spacetransportationservice.EngineType#getFuelKind <em>Fuel Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Kind</em>'.
	 * @see spacetransportationservice.EngineType#getFuelKind()
	 * @see #getEngineType()
	 * @generated
	 */
	EAttribute getEngineType_FuelKind();

	/**
	 * Returns the meta object for class '{@link spacetransportationservice.SpaceTransportationService <em>Space Transportation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Transportation Service</em>'.
	 * @see spacetransportationservice.SpaceTransportationService
	 * @generated
	 */
	EClass getSpaceTransportationService();

	/**
	 * Returns the meta object for the containment reference list '{@link spacetransportationservice.SpaceTransportationService#getLaunchSites <em>Launch Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Launch Sites</em>'.
	 * @see spacetransportationservice.SpaceTransportationService#getLaunchSites()
	 * @see #getSpaceTransportationService()
	 * @generated
	 */
	EReference getSpaceTransportationService_LaunchSites();

	/**
	 * Returns the meta object for the containment reference list '{@link spacetransportationservice.SpaceTransportationService#getEngineTypes <em>Engine Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Engine Types</em>'.
	 * @see spacetransportationservice.SpaceTransportationService#getEngineTypes()
	 * @see #getSpaceTransportationService()
	 * @generated
	 */
	EReference getSpaceTransportationService_EngineTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link spacetransportationservice.SpaceTransportationService#getSpacecrafts <em>Spacecrafts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spacecrafts</em>'.
	 * @see spacetransportationservice.SpaceTransportationService#getSpacecrafts()
	 * @see #getSpaceTransportationService()
	 * @generated
	 */
	EReference getSpaceTransportationService_Spacecrafts();

	/**
	 * Returns the meta object for enum '{@link spacetransportationservice.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function</em>'.
	 * @see spacetransportationservice.Function
	 * @generated
	 */
	EEnum getFunction();

	/**
	 * Returns the meta object for enum '{@link spacetransportationservice.PhysicalPropertyType <em>Physical Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Physical Property Type</em>'.
	 * @see spacetransportationservice.PhysicalPropertyType
	 * @generated
	 */
	EEnum getPhysicalPropertyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpacetransportationserviceFactory getSpacetransportationserviceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link spacetransportationservice.impl.SpacecraftImpl <em>Spacecraft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spacetransportationservice.impl.SpacecraftImpl
		 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getSpacecraft()
		 * @generated
		 */
		EClass SPACECRAFT = eINSTANCE.getSpacecraft();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT__STAGES = eINSTANCE.getSpacecraft_Stages();

		/**
		 * The meta object literal for the '<em><b>Launch Sites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT__LAUNCH_SITES = eINSTANCE.getSpacecraft_LaunchSites();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT__FUNCTIONS = eINSTANCE.getSpacecraft_Functions();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT__MANUFACTURER = eINSTANCE.getSpacecraft_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Country Of Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT__COUNTRY_OF_ORIGIN = eINSTANCE.getSpacecraft_CountryOfOrigin();

		/**
		 * The meta object literal for the '<em><b>Relaunch Cost In Mio USD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT__RELAUNCH_COST_IN_MIO_USD = eINSTANCE.getSpacecraft_RelaunchCostInMioUSD();

		/**
		 * The meta object literal for the '<em><b>Physical Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT__PHYSICAL_PROPERTIES = eINSTANCE.getSpacecraft_PhysicalProperties();

		/**
		 * The meta object literal for the '{@link spacetransportationservice.impl.LaunchSiteImpl <em>Launch Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spacetransportationservice.impl.LaunchSiteImpl
		 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getLaunchSite()
		 * @generated
		 */
		EClass LAUNCH_SITE = eINSTANCE.getLaunchSite();

		/**
		 * The meta object literal for the '<em><b>Location Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCH_SITE__LOCATION_LATITUDE = eINSTANCE.getLaunchSite_LocationLatitude();

		/**
		 * The meta object literal for the '<em><b>Location Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCH_SITE__LOCATION_LONGITUDE = eINSTANCE.getLaunchSite_LocationLongitude();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCH_SITE__OPERATOR = eINSTANCE.getLaunchSite_Operator();

		/**
		 * The meta object literal for the '<em><b>Number Of Launchpads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCH_SITE__NUMBER_OF_LAUNCHPADS = eINSTANCE.getLaunchSite_NumberOfLaunchpads();

		/**
		 * The meta object literal for the '<em><b>Physical Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCH_SITE__PHYSICAL_PROPERTIES = eINSTANCE.getLaunchSite_PhysicalProperties();

		/**
		 * The meta object literal for the '<em><b>Operational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCH_SITE__OPERATIONAL = eINSTANCE.getLaunchSite_Operational();

		/**
		 * The meta object literal for the '{@link spacetransportationservice.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spacetransportationservice.impl.StageImpl
		 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Engine Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__ENGINE_TYPE = eINSTANCE.getStage_EngineType();

		/**
		 * The meta object literal for the '<em><b>Engine Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__ENGINE_AMOUNT = eINSTANCE.getStage_EngineAmount();

		/**
		 * The meta object literal for the '<em><b>Physical Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__PHYSICAL_PROPERTIES = eINSTANCE.getStage_PhysicalProperties();

		/**
		 * The meta object literal for the '{@link spacetransportationservice.impl.PhysicalPropertyImpl <em>Physical Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spacetransportationservice.impl.PhysicalPropertyImpl
		 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getPhysicalProperty()
		 * @generated
		 */
		EClass PHYSICAL_PROPERTY = eINSTANCE.getPhysicalProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PROPERTY__TYPE = eINSTANCE.getPhysicalProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PROPERTY__UNIT = eINSTANCE.getPhysicalProperty_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PROPERTY__VALUE = eINSTANCE.getPhysicalProperty_Value();

		/**
		 * The meta object literal for the '{@link spacetransportationservice.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spacetransportationservice.impl.NamedElementImpl
		 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link spacetransportationservice.impl.EngineTypeImpl <em>Engine Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spacetransportationservice.impl.EngineTypeImpl
		 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getEngineType()
		 * @generated
		 */
		EClass ENGINE_TYPE = eINSTANCE.getEngineType();

		/**
		 * The meta object literal for the '<em><b>Fuel Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINE_TYPE__FUEL_KIND = eINSTANCE.getEngineType_FuelKind();

		/**
		 * The meta object literal for the '{@link spacetransportationservice.impl.SpaceTransportationServiceImpl <em>Space Transportation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spacetransportationservice.impl.SpaceTransportationServiceImpl
		 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getSpaceTransportationService()
		 * @generated
		 */
		EClass SPACE_TRANSPORTATION_SERVICE = eINSTANCE.getSpaceTransportationService();

		/**
		 * The meta object literal for the '<em><b>Launch Sites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_TRANSPORTATION_SERVICE__LAUNCH_SITES = eINSTANCE.getSpaceTransportationService_LaunchSites();

		/**
		 * The meta object literal for the '<em><b>Engine Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_TRANSPORTATION_SERVICE__ENGINE_TYPES = eINSTANCE.getSpaceTransportationService_EngineTypes();

		/**
		 * The meta object literal for the '<em><b>Spacecrafts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_TRANSPORTATION_SERVICE__SPACECRAFTS = eINSTANCE.getSpaceTransportationService_Spacecrafts();

		/**
		 * The meta object literal for the '{@link spacetransportationservice.Function <em>Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spacetransportationservice.Function
		 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getFunction()
		 * @generated
		 */
		EEnum FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link spacetransportationservice.PhysicalPropertyType <em>Physical Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spacetransportationservice.PhysicalPropertyType
		 * @see spacetransportationservice.impl.SpacetransportationservicePackageImpl#getPhysicalPropertyType()
		 * @generated
		 */
		EEnum PHYSICAL_PROPERTY_TYPE = eINSTANCE.getPhysicalPropertyType();

	}

} //SpacetransportationservicePackage
