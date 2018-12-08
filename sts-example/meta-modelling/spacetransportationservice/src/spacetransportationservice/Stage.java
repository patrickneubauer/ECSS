/**
 */
package spacetransportationservice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spacetransportationservice.Stage#getEngineType <em>Engine Type</em>}</li>
 *   <li>{@link spacetransportationservice.Stage#getEngineAmount <em>Engine Amount</em>}</li>
 *   <li>{@link spacetransportationservice.Stage#getPhysicalProperties <em>Physical Properties</em>}</li>
 * </ul>
 *
 * @see spacetransportationservice.SpacetransportationservicePackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Engine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Type</em>' reference.
	 * @see #setEngineType(EngineType)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getStage_EngineType()
	 * @model required="true"
	 * @generated
	 */
	EngineType getEngineType();

	/**
	 * Sets the value of the '{@link spacetransportationservice.Stage#getEngineType <em>Engine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Type</em>' reference.
	 * @see #getEngineType()
	 * @generated
	 */
	void setEngineType(EngineType value);

	/**
	 * Returns the value of the '<em><b>Engine Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Amount</em>' attribute.
	 * @see #setEngineAmount(int)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getStage_EngineAmount()
	 * @model required="true"
	 * @generated
	 */
	int getEngineAmount();

	/**
	 * Sets the value of the '{@link spacetransportationservice.Stage#getEngineAmount <em>Engine Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Amount</em>' attribute.
	 * @see #getEngineAmount()
	 * @generated
	 */
	void setEngineAmount(int value);

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
	 * @see spacetransportationservice.SpacetransportationservicePackage#getStage_PhysicalProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalProperty> getPhysicalProperties();

} // Stage
