/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WMethod Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WMethodContainer#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWMethodContainer()
 * @model
 * @generated
 */
public interface WMethodContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWMethodContainer_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMember> getMembers();

} // WMethodContainer
