/**
 */
package classDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classDiagram.Enumer#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see classDiagram.ClassDiagramPackage#getEnumer()
 * @model
 * @generated
 */
public interface Enumer extends Entity {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see classDiagram.ClassDiagramPackage#getEnumer_Types()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTypes();

} // Enumer
