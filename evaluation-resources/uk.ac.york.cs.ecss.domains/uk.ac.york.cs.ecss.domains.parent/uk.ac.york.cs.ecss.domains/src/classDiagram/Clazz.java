/**
 */
package classDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classDiagram.Clazz#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link classDiagram.Clazz#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see classDiagram.ClassDiagramPackage#getClazz()
 * @model
 * @generated
 */
public interface Clazz extends Entity {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see classDiagram.ClassDiagramPackage#getClazz_Stereotype()
	 * @model
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link classDiagram.Clazz#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link classDiagram.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see classDiagram.ClassDiagramPackage#getClazz_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // Clazz
