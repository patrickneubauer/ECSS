/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Alt List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.RuleAltList#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getRuleAltList()
 * @model
 * @generated
 */
public interface RuleAltList extends EObject {
	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.LabeledAlt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getRuleAltList_Alternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<LabeledAlt> getAlternatives();

} // RuleAltList
