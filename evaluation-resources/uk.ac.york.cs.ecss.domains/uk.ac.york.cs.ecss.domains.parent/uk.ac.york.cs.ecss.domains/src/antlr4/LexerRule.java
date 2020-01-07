/**
 */
package antlr4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexer Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.LexerRule#isFragment <em>Fragment</em>}</li>
 *   <li>{@link antlr4.LexerRule#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getLexerRule()
 * @model
 * @generated
 */
public interface LexerRule extends Rule, TokenRef, LexerCommandArg {
	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' attribute.
	 * @see #setFragment(boolean)
	 * @see antlr4.Antlr4Package#getLexerRule_Fragment()
	 * @model
	 * @generated
	 */
	boolean isFragment();

	/**
	 * Sets the value of the '{@link antlr4.LexerRule#isFragment <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment</em>' attribute.
	 * @see #isFragment()
	 * @generated
	 */
	void setFragment(boolean value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(LexerRuleBlock)
	 * @see antlr4.Antlr4Package#getLexerRule_Body()
	 * @model containment="true"
	 * @generated
	 */
	LexerRuleBlock getBody();

	/**
	 * Sets the value of the '{@link antlr4.LexerRule#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(LexerRuleBlock value);

} // LexerRule
