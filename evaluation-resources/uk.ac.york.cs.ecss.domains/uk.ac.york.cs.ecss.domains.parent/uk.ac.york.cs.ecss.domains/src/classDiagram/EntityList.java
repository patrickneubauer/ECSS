/**
 */
package classDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classDiagram.EntityList#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see classDiagram.ClassDiagramPackage#getEntityList()
 * @model
 * @generated
 */
public interface EntityList extends EObject {
	/**
	 * Returns the value of the '<em><b>Refs</b></em>' reference list.
	 * The list contents are of type {@link classDiagram.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' reference list.
	 * @see classDiagram.ClassDiagramPackage#getEntityList_Refs()
	 * @model
	 * @generated
	 */
	EList<Entity> getRefs();

} // EntityList
