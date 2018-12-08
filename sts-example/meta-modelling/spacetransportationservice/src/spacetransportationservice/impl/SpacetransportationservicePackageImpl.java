/**
 */
package spacetransportationservice.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import spacetransportationservice.EngineType;
import spacetransportationservice.Function;
import spacetransportationservice.LaunchSite;
import spacetransportationservice.NamedElement;
import spacetransportationservice.PhysicalProperty;
import spacetransportationservice.PhysicalPropertyType;
import spacetransportationservice.SpaceTransportationService;
import spacetransportationservice.Spacecraft;
import spacetransportationservice.SpacetransportationserviceFactory;
import spacetransportationservice.SpacetransportationservicePackage;
import spacetransportationservice.Stage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpacetransportationservicePackageImpl extends EPackageImpl implements SpacetransportationservicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacecraftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launchSiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceTransportationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum physicalPropertyTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see spacetransportationservice.SpacetransportationservicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpacetransportationservicePackageImpl() {
		super(eNS_URI, SpacetransportationserviceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SpacetransportationservicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpacetransportationservicePackage init() {
		if (isInited) return (SpacetransportationservicePackage)EPackage.Registry.INSTANCE.getEPackage(SpacetransportationservicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpacetransportationservicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpacetransportationservicePackageImpl theSpacetransportationservicePackage = registeredSpacetransportationservicePackage instanceof SpacetransportationservicePackageImpl ? (SpacetransportationservicePackageImpl)registeredSpacetransportationservicePackage : new SpacetransportationservicePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSpacetransportationservicePackage.createPackageContents();

		// Initialize created meta-data
		theSpacetransportationservicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpacetransportationservicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpacetransportationservicePackage.eNS_URI, theSpacetransportationservicePackage);
		return theSpacetransportationservicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacecraft() {
		return spacecraftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraft_Stages() {
		return (EReference)spacecraftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraft_LaunchSites() {
		return (EReference)spacecraftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraft_Functions() {
		return (EAttribute)spacecraftEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraft_Manufacturer() {
		return (EAttribute)spacecraftEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraft_CountryOfOrigin() {
		return (EAttribute)spacecraftEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraft_RelaunchCostInMioUSD() {
		return (EAttribute)spacecraftEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraft_PhysicalProperties() {
		return (EReference)spacecraftEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaunchSite() {
		return launchSiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchSite_LocationLatitude() {
		return (EAttribute)launchSiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchSite_LocationLongitude() {
		return (EAttribute)launchSiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchSite_Operator() {
		return (EAttribute)launchSiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchSite_NumberOfLaunchpads() {
		return (EAttribute)launchSiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaunchSite_PhysicalProperties() {
		return (EReference)launchSiteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchSite_Operational() {
		return (EAttribute)launchSiteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStage_EngineType() {
		return (EReference)stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStage_EngineAmount() {
		return (EAttribute)stageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStage_PhysicalProperties() {
		return (EReference)stageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalProperty() {
		return physicalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalProperty_Type() {
		return (EAttribute)physicalPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalProperty_Unit() {
		return (EAttribute)physicalPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalProperty_Value() {
		return (EAttribute)physicalPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineType() {
		return engineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineType_FuelKind() {
		return (EAttribute)engineTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpaceTransportationService() {
		return spaceTransportationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceTransportationService_LaunchSites() {
		return (EReference)spaceTransportationServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceTransportationService_EngineTypes() {
		return (EReference)spaceTransportationServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceTransportationService_Spacecrafts() {
		return (EReference)spaceTransportationServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunction() {
		return functionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhysicalPropertyType() {
		return physicalPropertyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacetransportationserviceFactory getSpacetransportationserviceFactory() {
		return (SpacetransportationserviceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		spacecraftEClass = createEClass(SPACECRAFT);
		createEReference(spacecraftEClass, SPACECRAFT__STAGES);
		createEReference(spacecraftEClass, SPACECRAFT__LAUNCH_SITES);
		createEAttribute(spacecraftEClass, SPACECRAFT__FUNCTIONS);
		createEAttribute(spacecraftEClass, SPACECRAFT__MANUFACTURER);
		createEAttribute(spacecraftEClass, SPACECRAFT__COUNTRY_OF_ORIGIN);
		createEAttribute(spacecraftEClass, SPACECRAFT__RELAUNCH_COST_IN_MIO_USD);
		createEReference(spacecraftEClass, SPACECRAFT__PHYSICAL_PROPERTIES);

		launchSiteEClass = createEClass(LAUNCH_SITE);
		createEAttribute(launchSiteEClass, LAUNCH_SITE__LOCATION_LATITUDE);
		createEAttribute(launchSiteEClass, LAUNCH_SITE__LOCATION_LONGITUDE);
		createEAttribute(launchSiteEClass, LAUNCH_SITE__OPERATOR);
		createEAttribute(launchSiteEClass, LAUNCH_SITE__NUMBER_OF_LAUNCHPADS);
		createEReference(launchSiteEClass, LAUNCH_SITE__PHYSICAL_PROPERTIES);
		createEAttribute(launchSiteEClass, LAUNCH_SITE__OPERATIONAL);

		stageEClass = createEClass(STAGE);
		createEReference(stageEClass, STAGE__ENGINE_TYPE);
		createEAttribute(stageEClass, STAGE__ENGINE_AMOUNT);
		createEReference(stageEClass, STAGE__PHYSICAL_PROPERTIES);

		physicalPropertyEClass = createEClass(PHYSICAL_PROPERTY);
		createEAttribute(physicalPropertyEClass, PHYSICAL_PROPERTY__TYPE);
		createEAttribute(physicalPropertyEClass, PHYSICAL_PROPERTY__UNIT);
		createEAttribute(physicalPropertyEClass, PHYSICAL_PROPERTY__VALUE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		engineTypeEClass = createEClass(ENGINE_TYPE);
		createEAttribute(engineTypeEClass, ENGINE_TYPE__FUEL_KIND);

		spaceTransportationServiceEClass = createEClass(SPACE_TRANSPORTATION_SERVICE);
		createEReference(spaceTransportationServiceEClass, SPACE_TRANSPORTATION_SERVICE__LAUNCH_SITES);
		createEReference(spaceTransportationServiceEClass, SPACE_TRANSPORTATION_SERVICE__ENGINE_TYPES);
		createEReference(spaceTransportationServiceEClass, SPACE_TRANSPORTATION_SERVICE__SPACECRAFTS);

		// Create enums
		functionEEnum = createEEnum(FUNCTION);
		physicalPropertyTypeEEnum = createEEnum(PHYSICAL_PROPERTY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spacecraftEClass.getESuperTypes().add(this.getNamedElement());
		launchSiteEClass.getESuperTypes().add(this.getNamedElement());
		stageEClass.getESuperTypes().add(this.getNamedElement());
		engineTypeEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(spacecraftEClass, Spacecraft.class, "Spacecraft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpacecraft_Stages(), this.getStage(), null, "stages", null, 0, -1, Spacecraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraft_LaunchSites(), this.getLaunchSite(), null, "launchSites", null, 0, -1, Spacecraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraft_Functions(), this.getFunction(), "functions", null, 0, -1, Spacecraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraft_Manufacturer(), ecorePackage.getEString(), "manufacturer", null, 0, 1, Spacecraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraft_CountryOfOrigin(), ecorePackage.getEString(), "countryOfOrigin", null, 0, 1, Spacecraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraft_RelaunchCostInMioUSD(), ecorePackage.getEInt(), "relaunchCostInMioUSD", null, 1, 1, Spacecraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraft_PhysicalProperties(), this.getPhysicalProperty(), null, "physicalProperties", null, 0, -1, Spacecraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(launchSiteEClass, LaunchSite.class, "LaunchSite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLaunchSite_LocationLatitude(), ecorePackage.getEDouble(), "locationLatitude", null, 1, 1, LaunchSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLaunchSite_LocationLongitude(), ecorePackage.getEDouble(), "locationLongitude", null, 1, 1, LaunchSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLaunchSite_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, LaunchSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLaunchSite_NumberOfLaunchpads(), ecorePackage.getEInt(), "numberOfLaunchpads", null, 1, 1, LaunchSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLaunchSite_PhysicalProperties(), this.getPhysicalProperty(), null, "physicalProperties", null, 0, -1, LaunchSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLaunchSite_Operational(), ecorePackage.getEBoolean(), "operational", null, 1, 1, LaunchSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStage_EngineType(), this.getEngineType(), null, "engineType", null, 1, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStage_EngineAmount(), ecorePackage.getEInt(), "engineAmount", null, 1, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStage_PhysicalProperties(), this.getPhysicalProperty(), null, "physicalProperties", null, 0, -1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalPropertyEClass, PhysicalProperty.class, "PhysicalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalProperty_Type(), this.getPhysicalPropertyType(), "type", null, 1, 1, PhysicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalProperty_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, PhysicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalProperty_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, PhysicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineTypeEClass, EngineType.class, "EngineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEngineType_FuelKind(), ecorePackage.getEString(), "fuelKind", null, 1, 1, EngineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spaceTransportationServiceEClass, SpaceTransportationService.class, "SpaceTransportationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpaceTransportationService_LaunchSites(), this.getLaunchSite(), null, "launchSites", null, 0, -1, SpaceTransportationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpaceTransportationService_EngineTypes(), this.getEngineType(), null, "engineTypes", null, 0, -1, SpaceTransportationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpaceTransportationService_Spacecrafts(), this.getSpacecraft(), null, "spacecrafts", null, 0, -1, SpaceTransportationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(functionEEnum, Function.class, "Function");
		addEEnumLiteral(functionEEnum, Function.MARS_COLONIZATION);
		addEEnumLiteral(functionEEnum, Function.EARTH_LUNAR_TRANSPORT);
		addEEnumLiteral(functionEEnum, Function.MULTIPLANETARY_TRANSPORT);
		addEEnumLiteral(functionEEnum, Function.INTERCONTINENTAL_TRANSPORT);
		addEEnumLiteral(functionEEnum, Function.ORBITAL_LAUNCHER);

		initEEnum(physicalPropertyTypeEEnum, PhysicalPropertyType.class, "PhysicalPropertyType");
		addEEnumLiteral(physicalPropertyTypeEEnum, PhysicalPropertyType.LENGTH);
		addEEnumLiteral(physicalPropertyTypeEEnum, PhysicalPropertyType.WIDTH);
		addEEnumLiteral(physicalPropertyTypeEEnum, PhysicalPropertyType.DIAMETER);
		addEEnumLiteral(physicalPropertyTypeEEnum, PhysicalPropertyType.PERIMETER);
		addEEnumLiteral(physicalPropertyTypeEEnum, PhysicalPropertyType.AREA);
		addEEnumLiteral(physicalPropertyTypeEEnum, PhysicalPropertyType.VOLUME);
		addEEnumLiteral(physicalPropertyTypeEEnum, PhysicalPropertyType.MASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

} //SpacetransportationservicePackageImpl
