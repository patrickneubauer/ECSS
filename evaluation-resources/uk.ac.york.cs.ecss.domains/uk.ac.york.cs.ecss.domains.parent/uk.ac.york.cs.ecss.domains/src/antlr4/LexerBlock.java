/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexer Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.LexerBlock#getOptions <em>Options</em>}</li>
 *   <li>{@link antlr4.LexerBlock#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getLexerBlock()
 * @model
 * @generated
 */
public interface LexerBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Options)
	 * @see antlr4.Antlr4Package#getLexerBlock_Options()
	 * @model containment="true"
	 * @generated
	 */
	Options getOptions();

	/**
	 * Sets the value of the '{@link antlr4.LexerBlock#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Options value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(LexerAltList)
	 * @see antlr4.Antlr4Package#getLexerBlock_Body()
	 * @model containment="true"
	 * @generated
	 */
	LexerAltList getBody();

	/**
	 * Sets the value of the '{@link antlr4.LexerBlock#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(LexerAltList value);

} // LexerBlock
