/**
 */
package pp2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.Case#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getCase()
 * @model
 * @generated
 */
public interface Case extends ExpressionBlock {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link pp2.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see pp2.Pp2Package#getCase_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getValues();

} // Case
