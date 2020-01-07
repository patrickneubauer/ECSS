/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexer Alt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.LexerAlt#getBody <em>Body</em>}</li>
 *   <li>{@link antlr4.LexerAlt#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getLexerAlt()
 * @model
 * @generated
 */
public interface LexerAlt extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(LexerElements)
	 * @see antlr4.Antlr4Package#getLexerAlt_Body()
	 * @model containment="true"
	 * @generated
	 */
	LexerElements getBody();

	/**
	 * Sets the value of the '{@link antlr4.LexerAlt#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(LexerElements value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference.
	 * @see #setCommands(LexerCommands)
	 * @see antlr4.Antlr4Package#getLexerAlt_Commands()
	 * @model containment="true"
	 * @generated
	 */
	LexerCommands getCommands();

	/**
	 * Sets the value of the '{@link antlr4.LexerAlt#getCommands <em>Commands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commands</em>' containment reference.
	 * @see #getCommands()
	 * @generated
	 */
	void setCommands(LexerCommands value);

} // LexerAlt
