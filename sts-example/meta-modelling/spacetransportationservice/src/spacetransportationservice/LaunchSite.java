/**
 */
package spacetransportationservice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spacetransportationservice.LaunchSite#getLocationLatitude <em>Location Latitude</em>}</li>
 *   <li>{@link spacetransportationservice.LaunchSite#getLocationLongitude <em>Location Longitude</em>}</li>
 *   <li>{@link spacetransportationservice.LaunchSite#getOperator <em>Operator</em>}</li>
 *   <li>{@link spacetransportationservice.LaunchSite#getNumberOfLaunchpads <em>Number Of Launchpads</em>}</li>
 *   <li>{@link spacetransportationservice.LaunchSite#getPhysicalProperties <em>Physical Properties</em>}</li>
 *   <li>{@link spacetransportationservice.LaunchSite#isOperational <em>Operational</em>}</li>
 * </ul>
 *
 * @see spacetransportationservice.SpacetransportationservicePackage#getLaunchSite()
 * @model
 * @generated
 */
public interface LaunchSite extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Location Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Latitude</em>' attribute.
	 * @see #setLocationLatitude(double)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getLaunchSite_LocationLatitude()
	 * @model required="true"
	 * @generated
	 */
	double getLocationLatitude();

	/**
	 * Sets the value of the '{@link spacetransportationservice.LaunchSite#getLocationLatitude <em>Location Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Latitude</em>' attribute.
	 * @see #getLocationLatitude()
	 * @generated
	 */
	void setLocationLatitude(double value);

	/**
	 * Returns the value of the '<em><b>Location Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Longitude</em>' attribute.
	 * @see #setLocationLongitude(double)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getLaunchSite_LocationLongitude()
	 * @model required="true"
	 * @generated
	 */
	double getLocationLongitude();

	/**
	 * Sets the value of the '{@link spacetransportationservice.LaunchSite#getLocationLongitude <em>Location Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Longitude</em>' attribute.
	 * @see #getLocationLongitude()
	 * @generated
	 */
	void setLocationLongitude(double value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getLaunchSite_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link spacetransportationservice.LaunchSite#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Launchpads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Launchpads</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Launchpads</em>' attribute.
	 * @see #setNumberOfLaunchpads(int)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getLaunchSite_NumberOfLaunchpads()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfLaunchpads();

	/**
	 * Sets the value of the '{@link spacetransportationservice.LaunchSite#getNumberOfLaunchpads <em>Number Of Launchpads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Launchpads</em>' attribute.
	 * @see #getNumberOfLaunchpads()
	 * @generated
	 */
	void setNumberOfLaunchpads(int value);

	/**
	 * Returns the value of the '<em><b>Physical Properties</b></em>' containment reference list.
	 * The list contents are of type {@link spacetransportationservice.PhysicalProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Properties</em>' containment reference list.
	 * @see spacetransportationservice.SpacetransportationservicePackage#getLaunchSite_PhysicalProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalProperty> getPhysicalProperties();

	/**
	 * Returns the value of the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational</em>' attribute.
	 * @see #setOperational(boolean)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getLaunchSite_Operational()
	 * @model required="true"
	 * @generated
	 */
	boolean isOperational();

	/**
	 * Sets the value of the '{@link spacetransportationservice.LaunchSite#isOperational <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational</em>' attribute.
	 * @see #isOperational()
	 * @generated
	 */
	void setOperational(boolean value);

} // LaunchSite
