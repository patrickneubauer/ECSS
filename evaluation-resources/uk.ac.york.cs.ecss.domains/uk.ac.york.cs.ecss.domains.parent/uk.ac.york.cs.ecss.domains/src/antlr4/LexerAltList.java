/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexer Alt List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.LexerAltList#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getLexerAltList()
 * @model
 * @generated
 */
public interface LexerAltList extends EObject {
	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.LexerAlt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getLexerAltList_Alternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<LexerAlt> getAlternatives();

} // LexerAltList
