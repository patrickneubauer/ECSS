/**
 */
package spacetransportationservice;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spacetransportationservice.PhysicalProperty#getType <em>Type</em>}</li>
 *   <li>{@link spacetransportationservice.PhysicalProperty#getUnit <em>Unit</em>}</li>
 *   <li>{@link spacetransportationservice.PhysicalProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see spacetransportationservice.SpacetransportationservicePackage#getPhysicalProperty()
 * @model
 * @generated
 */
public interface PhysicalProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link spacetransportationservice.PhysicalPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see spacetransportationservice.PhysicalPropertyType
	 * @see #setType(PhysicalPropertyType)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getPhysicalProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	PhysicalPropertyType getType();

	/**
	 * Sets the value of the '{@link spacetransportationservice.PhysicalProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see spacetransportationservice.PhysicalPropertyType
	 * @see #getType()
	 * @generated
	 */
	void setType(PhysicalPropertyType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getPhysicalProperty_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link spacetransportationservice.PhysicalProperty#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see spacetransportationservice.SpacetransportationservicePackage#getPhysicalProperty_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link spacetransportationservice.PhysicalProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // PhysicalProperty
