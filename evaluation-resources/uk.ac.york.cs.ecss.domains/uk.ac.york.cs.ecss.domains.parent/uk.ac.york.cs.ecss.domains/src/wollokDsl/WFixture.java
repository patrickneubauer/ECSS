/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WFixture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WFixture#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWFixture()
 * @model
 * @generated
 */
public interface WFixture extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWFixture_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<WExpression> getElements();

} // WFixture
