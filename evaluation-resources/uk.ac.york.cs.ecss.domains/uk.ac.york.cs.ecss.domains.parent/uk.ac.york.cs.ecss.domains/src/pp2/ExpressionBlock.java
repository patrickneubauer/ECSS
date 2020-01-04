/**
 */
package pp2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.ExpressionBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getExpressionBlock()
 * @model abstract="true"
 * @generated
 */
public interface ExpressionBlock extends Expression {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link pp2.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see pp2.Pp2Package#getExpressionBlock_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getStatements();

} // ExpressionBlock
