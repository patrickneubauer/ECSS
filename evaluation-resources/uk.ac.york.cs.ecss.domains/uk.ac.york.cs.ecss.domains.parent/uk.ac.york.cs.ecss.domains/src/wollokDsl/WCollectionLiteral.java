/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WCollection Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WCollectionLiteral#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWCollectionLiteral()
 * @model
 * @generated
 */
public interface WCollectionLiteral extends WExpression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWCollectionLiteral_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<WExpression> getElements();

} // WCollectionLiteral
