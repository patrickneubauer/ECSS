/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parser Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.ParserRule#getArgs <em>Args</em>}</li>
 *   <li>{@link antlr4.ParserRule#getReturn <em>Return</em>}</li>
 *   <li>{@link antlr4.ParserRule#getThrows <em>Throws</em>}</li>
 *   <li>{@link antlr4.ParserRule#getLocals <em>Locals</em>}</li>
 *   <li>{@link antlr4.ParserRule#getPrequels <em>Prequels</em>}</li>
 *   <li>{@link antlr4.ParserRule#getBody <em>Body</em>}</li>
 *   <li>{@link antlr4.ParserRule#getCaught <em>Caught</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getParserRule()
 * @model
 * @generated
 */
public interface ParserRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(String)
	 * @see antlr4.Antlr4Package#getParserRule_Args()
	 * @model
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link antlr4.ParserRule#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(Return)
	 * @see antlr4.Antlr4Package#getParserRule_Return()
	 * @model containment="true"
	 * @generated
	 */
	Return getReturn();

	/**
	 * Sets the value of the '{@link antlr4.ParserRule#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Return value);

	/**
	 * Returns the value of the '<em><b>Throws</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' containment reference.
	 * @see #setThrows(Exceptions)
	 * @see antlr4.Antlr4Package#getParserRule_Throws()
	 * @model containment="true"
	 * @generated
	 */
	Exceptions getThrows();

	/**
	 * Sets the value of the '{@link antlr4.ParserRule#getThrows <em>Throws</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' containment reference.
	 * @see #getThrows()
	 * @generated
	 */
	void setThrows(Exceptions value);

	/**
	 * Returns the value of the '<em><b>Locals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals</em>' containment reference.
	 * @see #setLocals(LocalVars)
	 * @see antlr4.Antlr4Package#getParserRule_Locals()
	 * @model containment="true"
	 * @generated
	 */
	LocalVars getLocals();

	/**
	 * Sets the value of the '{@link antlr4.ParserRule#getLocals <em>Locals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locals</em>' containment reference.
	 * @see #getLocals()
	 * @generated
	 */
	void setLocals(LocalVars value);

	/**
	 * Returns the value of the '<em><b>Prequels</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.RulePrequel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prequels</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getParserRule_Prequels()
	 * @model containment="true"
	 * @generated
	 */
	EList<RulePrequel> getPrequels();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(RuleBlock)
	 * @see antlr4.Antlr4Package#getParserRule_Body()
	 * @model containment="true"
	 * @generated
	 */
	RuleBlock getBody();

	/**
	 * Sets the value of the '{@link antlr4.ParserRule#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(RuleBlock value);

	/**
	 * Returns the value of the '<em><b>Caught</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caught</em>' containment reference.
	 * @see #setCaught(ExceptionGroup)
	 * @see antlr4.Antlr4Package#getParserRule_Caught()
	 * @model containment="true"
	 * @generated
	 */
	ExceptionGroup getCaught();

	/**
	 * Sets the value of the '{@link antlr4.ParserRule#getCaught <em>Caught</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caught</em>' containment reference.
	 * @see #getCaught()
	 * @generated
	 */
	void setCaught(ExceptionGroup value);

} // ParserRule
