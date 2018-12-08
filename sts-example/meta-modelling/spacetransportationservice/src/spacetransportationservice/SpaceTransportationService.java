/**
 */
package spacetransportationservice;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space Transportation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spacetransportationservice.SpaceTransportationService#getLaunchSites <em>Launch Sites</em>}</li>
 *   <li>{@link spacetransportationservice.SpaceTransportationService#getEngineTypes <em>Engine Types</em>}</li>
 *   <li>{@link spacetransportationservice.SpaceTransportationService#getSpacecrafts <em>Spacecrafts</em>}</li>
 * </ul>
 *
 * @see spacetransportationservice.SpacetransportationservicePackage#getSpaceTransportationService()
 * @model
 * @generated
 */
public interface SpaceTransportationService extends EObject {
	/**
	 * Returns the value of the '<em><b>Launch Sites</b></em>' containment reference list.
	 * The list contents are of type {@link spacetransportationservice.LaunchSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launch Sites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Sites</em>' containment reference list.
	 * @see spacetransportationservice.SpacetransportationservicePackage#getSpaceTransportationService_LaunchSites()
	 * @model containment="true"
	 * @generated
	 */
	EList<LaunchSite> getLaunchSites();

	/**
	 * Returns the value of the '<em><b>Engine Types</b></em>' containment reference list.
	 * The list contents are of type {@link spacetransportationservice.EngineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Types</em>' containment reference list.
	 * @see spacetransportationservice.SpacetransportationservicePackage#getSpaceTransportationService_EngineTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EngineType> getEngineTypes();

	/**
	 * Returns the value of the '<em><b>Spacecrafts</b></em>' containment reference list.
	 * The list contents are of type {@link spacetransportationservice.Spacecraft}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spacecrafts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spacecrafts</em>' containment reference list.
	 * @see spacetransportationservice.SpacetransportationservicePackage#getSpaceTransportationService_Spacecrafts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Spacecraft> getSpacecrafts();

} // SpaceTransportationService
