/**
 */
package spacetransportationservice;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see spacetransportationservice.SpacetransportationservicePackage
 * @generated
 */
public interface SpacetransportationserviceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpacetransportationserviceFactory eINSTANCE = spacetransportationservice.impl.SpacetransportationserviceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Spacecraft</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecraft</em>'.
	 * @generated
	 */
	Spacecraft createSpacecraft();

	/**
	 * Returns a new object of class '<em>Launch Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Launch Site</em>'.
	 * @generated
	 */
	LaunchSite createLaunchSite();

	/**
	 * Returns a new object of class '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stage</em>'.
	 * @generated
	 */
	Stage createStage();

	/**
	 * Returns a new object of class '<em>Physical Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Property</em>'.
	 * @generated
	 */
	PhysicalProperty createPhysicalProperty();

	/**
	 * Returns a new object of class '<em>Engine Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engine Type</em>'.
	 * @generated
	 */
	EngineType createEngineType();

	/**
	 * Returns a new object of class '<em>Space Transportation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Space Transportation Service</em>'.
	 * @generated
	 */
	SpaceTransportationService createSpaceTransportationService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpacetransportationservicePackage getSpacetransportationservicePackage();

} //SpacetransportationserviceFactory
