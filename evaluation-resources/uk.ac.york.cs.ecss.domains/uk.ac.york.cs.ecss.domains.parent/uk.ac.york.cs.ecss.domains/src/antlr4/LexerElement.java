/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexer Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.LexerElement#getBody <em>Body</em>}</li>
 *   <li>{@link antlr4.LexerElement#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getLexerElement()
 * @model
 * @generated
 */
public interface LexerElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(EObject)
	 * @see antlr4.Antlr4Package#getLexerElement_Body()
	 * @model containment="true"
	 * @generated
	 */
	EObject getBody();

	/**
	 * Sets the value of the '{@link antlr4.LexerElement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(EObject value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(EbnfSuffix)
	 * @see antlr4.Antlr4Package#getLexerElement_Operator()
	 * @model containment="true"
	 * @generated
	 */
	EbnfSuffix getOperator();

	/**
	 * Sets the value of the '{@link antlr4.LexerElement#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(EbnfSuffix value);

} // LexerElement
