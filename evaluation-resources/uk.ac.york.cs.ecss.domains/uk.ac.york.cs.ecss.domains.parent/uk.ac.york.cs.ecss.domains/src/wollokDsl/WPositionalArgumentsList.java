/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WPositional Arguments List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WPositionalArgumentsList#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWPositionalArgumentsList()
 * @model
 * @generated
 */
public interface WPositionalArgumentsList extends WArgumentList {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWPositionalArgumentsList_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<WExpression> getValues();

} // WPositionalArgumentsList
