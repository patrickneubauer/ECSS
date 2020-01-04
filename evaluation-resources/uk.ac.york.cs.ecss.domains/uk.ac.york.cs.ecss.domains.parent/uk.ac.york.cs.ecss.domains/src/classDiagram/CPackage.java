/**
 */
package classDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classDiagram.CPackage#getStyle <em>Style</em>}</li>
 *   <li>{@link classDiagram.CPackage#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see classDiagram.ClassDiagramPackage#getCPackage()
 * @model
 * @generated
 */
public interface CPackage extends Node {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link classDiagram.PackageStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see classDiagram.PackageStyle
	 * @see #setStyle(PackageStyle)
	 * @see classDiagram.ClassDiagramPackage#getCPackage_Style()
	 * @model
	 * @generated
	 */
	PackageStyle getStyle();

	/**
	 * Sets the value of the '{@link classDiagram.CPackage#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see classDiagram.PackageStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(PackageStyle value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link classDiagram.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see classDiagram.ClassDiagramPackage#getCPackage_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // CPackage
