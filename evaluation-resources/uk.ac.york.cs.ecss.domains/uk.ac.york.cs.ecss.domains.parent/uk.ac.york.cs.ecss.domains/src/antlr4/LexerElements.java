/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexer Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.LexerElements#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getLexerElements()
 * @model
 * @generated
 */
public interface LexerElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.LexerElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getLexerElements_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<LexerElement> getElements();

} // LexerElements
