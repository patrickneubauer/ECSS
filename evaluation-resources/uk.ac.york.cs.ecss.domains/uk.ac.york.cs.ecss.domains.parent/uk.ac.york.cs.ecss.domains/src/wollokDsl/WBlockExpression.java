/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WBlock Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WBlockExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWBlockExpression()
 * @model
 * @generated
 */
public interface WBlockExpression extends WExpression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWBlockExpression_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<WExpression> getExpressions();

} // WBlockExpression
