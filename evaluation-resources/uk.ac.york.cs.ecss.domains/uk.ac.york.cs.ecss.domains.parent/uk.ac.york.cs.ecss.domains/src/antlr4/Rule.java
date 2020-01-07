/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.Rule#getName <em>Name</em>}</li>
 *   <li>{@link antlr4.Rule#getSemicolonSymbol <em>Semicolon Symbol</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see antlr4.Antlr4Package#getRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link antlr4.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semicolon Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semicolon Symbol</em>' attribute.
	 * @see #setSemicolonSymbol(String)
	 * @see antlr4.Antlr4Package#getRule_SemicolonSymbol()
	 * @model
	 * @generated
	 */
	String getSemicolonSymbol();

	/**
	 * Sets the value of the '{@link antlr4.Rule#getSemicolonSymbol <em>Semicolon Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semicolon Symbol</em>' attribute.
	 * @see #getSemicolonSymbol()
	 * @generated
	 */
	void setSemicolonSymbol(String value);

} // Rule
