/**
 */
package antlr4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.RuleAction#getAtSymbol <em>At Symbol</em>}</li>
 *   <li>{@link antlr4.RuleAction#getName <em>Name</em>}</li>
 *   <li>{@link antlr4.RuleAction#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getRuleAction()
 * @model
 * @generated
 */
public interface RuleAction extends RulePrequel {
	/**
	 * Returns the value of the '<em><b>At Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Symbol</em>' attribute.
	 * @see #setAtSymbol(String)
	 * @see antlr4.Antlr4Package#getRuleAction_AtSymbol()
	 * @model
	 * @generated
	 */
	String getAtSymbol();

	/**
	 * Sets the value of the '{@link antlr4.RuleAction#getAtSymbol <em>At Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Symbol</em>' attribute.
	 * @see #getAtSymbol()
	 * @generated
	 */
	void setAtSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see antlr4.Antlr4Package#getRuleAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link antlr4.RuleAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see antlr4.Antlr4Package#getRuleAction_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link antlr4.RuleAction#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // RuleAction
