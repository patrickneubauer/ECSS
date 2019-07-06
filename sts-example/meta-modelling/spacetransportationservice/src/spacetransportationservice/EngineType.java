/**
 */
package spacetransportationservice;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spacetransportationservice.EngineType#getFuelKind <em>Fuel Kind</em>}</li>
 * </ul>
 *
 * @see spacetransportationservice.SpacetransportationservicePackage#getEngineType()
 * @model
 * @generated
 */
public interface EngineType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Fuel Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Kind</em>' attribute.
	 * @see #setFuelKind(String)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getEngineType_FuelKind()
	 * @model required="true"
	 * @generated
	 */
	String getFuelKind();

	/**
	 * Sets the value of the '{@link spacetransportationservice.EngineType#getFuelKind <em>Fuel Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Kind</em>' attribute.
	 * @see #getFuelKind()
	 * @generated
	 */
	void setFuelKind(String value);

} // EngineType
