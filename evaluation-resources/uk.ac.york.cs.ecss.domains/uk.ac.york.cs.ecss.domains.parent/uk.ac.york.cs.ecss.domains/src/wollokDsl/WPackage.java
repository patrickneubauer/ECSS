/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WPackage#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWPackage()
 * @model
 * @generated
 */
public interface WPackage extends WLibraryElement, WNamed {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWPackage_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getElements();

} // WPackage
