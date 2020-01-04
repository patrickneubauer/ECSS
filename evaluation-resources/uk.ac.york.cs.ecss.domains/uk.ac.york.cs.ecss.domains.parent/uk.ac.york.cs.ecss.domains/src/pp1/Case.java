/**
 */
package pp1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.Case#getStatements <em>Statements</em>}</li>
 *   <li>{@link pp1.Case#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getCase()
 * @model
 * @generated
 */
public interface Case extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link pp1.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see pp1.Pp1Package#getCase_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getStatements();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link pp1.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see pp1.Pp1Package#getCase_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getValues();

} // Case
