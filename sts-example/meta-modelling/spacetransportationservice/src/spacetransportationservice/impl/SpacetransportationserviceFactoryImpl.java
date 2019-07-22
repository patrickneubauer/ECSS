/**
 */
package spacetransportationservice.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spacetransportationservice.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpacetransportationserviceFactoryImpl extends EFactoryImpl implements SpacetransportationserviceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpacetransportationserviceFactory init() {
		try {
			SpacetransportationserviceFactory theSpacetransportationserviceFactory = (SpacetransportationserviceFactory)EPackage.Registry.INSTANCE.getEFactory(SpacetransportationservicePackage.eNS_URI);
			if (theSpacetransportationserviceFactory != null) {
				return theSpacetransportationserviceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpacetransportationserviceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacetransportationserviceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpacetransportationservicePackage.SPACECRAFT: return createSpacecraft();
			case SpacetransportationservicePackage.LAUNCH_SITE: return createLaunchSite();
			case SpacetransportationservicePackage.STAGE: return createStage();
			case SpacetransportationservicePackage.PHYSICAL_PROPERTY: return createPhysicalProperty();
			case SpacetransportationservicePackage.ENGINE_TYPE: return createEngineType();
			case SpacetransportationservicePackage.SPACE_TRANSPORTATION_SERVICE: return createSpaceTransportationService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpacetransportationservicePackage.FUNCTION:
				return createFunctionFromString(eDataType, initialValue);
			case SpacetransportationservicePackage.PHYSICAL_PROPERTY_TYPE:
				return createPhysicalPropertyTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpacetransportationservicePackage.FUNCTION:
				return convertFunctionToString(eDataType, instanceValue);
			case SpacetransportationservicePackage.PHYSICAL_PROPERTY_TYPE:
				return convertPhysicalPropertyTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spacecraft createSpacecraft() {
		SpacecraftImpl spacecraft = new SpacecraftImpl();
		return spacecraft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LaunchSite createLaunchSite() {
		LaunchSiteImpl launchSite = new LaunchSiteImpl();
		return launchSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalProperty createPhysicalProperty() {
		PhysicalPropertyImpl physicalProperty = new PhysicalPropertyImpl();
		return physicalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineType createEngineType() {
		EngineTypeImpl engineType = new EngineTypeImpl();
		return engineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceTransportationService createSpaceTransportationService() {
		SpaceTransportationServiceImpl spaceTransportationService = new SpaceTransportationServiceImpl();
		return spaceTransportationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunctionFromString(EDataType eDataType, String initialValue) {
		Function result = Function.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPropertyType createPhysicalPropertyTypeFromString(EDataType eDataType, String initialValue) {
		PhysicalPropertyType result = PhysicalPropertyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhysicalPropertyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacetransportationservicePackage getSpacetransportationservicePackage() {
		return (SpacetransportationservicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpacetransportationservicePackage getPackage() {
		return SpacetransportationservicePackage.eINSTANCE;
	}

} //SpacetransportationserviceFactoryImpl
