/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexer Command Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.LexerCommandExpr#getRef <em>Ref</em>}</li>
 *   <li>{@link antlr4.LexerCommandExpr#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getLexerCommandExpr()
 * @model
 * @generated
 */
public interface LexerCommandExpr extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(LexerCommandArg)
	 * @see antlr4.Antlr4Package#getLexerCommandExpr_Ref()
	 * @model
	 * @generated
	 */
	LexerCommandArg getRef();

	/**
	 * Sets the value of the '{@link antlr4.LexerCommandExpr#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(LexerCommandArg value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see antlr4.Antlr4Package#getLexerCommandExpr_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link antlr4.LexerCommandExpr#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // LexerCommandExpr
