/**
 */
package xturtle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blank Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xturtle.BlankCollection#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see xturtle.XturtlePackage#getBlankCollection()
 * @model
 * @generated
 */
public interface BlankCollection extends Blank {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link xturtle.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see xturtle.XturtlePackage#getBlankCollection_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<xturtle.Object> getObjects();

} // BlankCollection
