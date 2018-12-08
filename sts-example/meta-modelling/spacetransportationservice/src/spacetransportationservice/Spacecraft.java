/**
 */
package spacetransportationservice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecraft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spacetransportationservice.Spacecraft#getStages <em>Stages</em>}</li>
 *   <li>{@link spacetransportationservice.Spacecraft#getLaunchSites <em>Launch Sites</em>}</li>
 *   <li>{@link spacetransportationservice.Spacecraft#getFunctions <em>Functions</em>}</li>
 *   <li>{@link spacetransportationservice.Spacecraft#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link spacetransportationservice.Spacecraft#getCountryOfOrigin <em>Country Of Origin</em>}</li>
 *   <li>{@link spacetransportationservice.Spacecraft#getRelaunchCostInMioUSD <em>Relaunch Cost In Mio USD</em>}</li>
 *   <li>{@link spacetransportationservice.Spacecraft#getPhysicalProperties <em>Physical Properties</em>}</li>
 * </ul>
 *
 * @see spacetransportationservice.SpacetransportationservicePackage#getSpacecraft()
 * @model
 * @generated
 */
public interface Spacecraft extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link spacetransportationservice.Stage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see spacetransportationservice.SpacetransportationservicePackage#getSpacecraft_Stages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stage> getStages();

	/**
	 * Returns the value of the '<em><b>Launch Sites</b></em>' reference list.
	 * The list contents are of type {@link spacetransportationservice.LaunchSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launch Sites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Sites</em>' reference list.
	 * @see spacetransportationservice.SpacetransportationservicePackage#getSpacecraft_LaunchSites()
	 * @model
	 * @generated
	 */
	EList<LaunchSite> getLaunchSites();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' attribute list.
	 * The list contents are of type {@link spacetransportationservice.Function}.
	 * The literals are from the enumeration {@link spacetransportationservice.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' attribute list.
	 * @see spacetransportationservice.Function
	 * @see spacetransportationservice.SpacetransportationservicePackage#getSpacecraft_Functions()
	 * @model
	 * @generated
	 */
	EList<Function> getFunctions();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getSpacecraft_Manufacturer()
	 * @model
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link spacetransportationservice.Spacecraft#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Country Of Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Of Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Of Origin</em>' attribute.
	 * @see #setCountryOfOrigin(String)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getSpacecraft_CountryOfOrigin()
	 * @model
	 * @generated
	 */
	String getCountryOfOrigin();

	/**
	 * Sets the value of the '{@link spacetransportationservice.Spacecraft#getCountryOfOrigin <em>Country Of Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Of Origin</em>' attribute.
	 * @see #getCountryOfOrigin()
	 * @generated
	 */
	void setCountryOfOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Relaunch Cost In Mio USD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaunch Cost In Mio USD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaunch Cost In Mio USD</em>' attribute.
	 * @see #setRelaunchCostInMioUSD(int)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getSpacecraft_RelaunchCostInMioUSD()
	 * @model required="true"
	 * @generated
	 */
	int getRelaunchCostInMioUSD();

	/**
	 * Sets the value of the '{@link spacetransportationservice.Spacecraft#getRelaunchCostInMioUSD <em>Relaunch Cost In Mio USD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relaunch Cost In Mio USD</em>' attribute.
	 * @see #getRelaunchCostInMioUSD()
	 * @generated
	 */
	void setRelaunchCostInMioUSD(int value);

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
	 * @see spacetransportationservice.SpacetransportationservicePackage#getSpacecraft_PhysicalProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalProperty> getPhysicalProperties();

} // Spacecraft
