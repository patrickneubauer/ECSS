/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.RuleRef#getReference <em>Reference</em>}</li>
 *   <li>{@link antlr4.RuleRef#getArgs <em>Args</em>}</li>
 *   <li>{@link antlr4.RuleRef#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getRuleRef()
 * @model
 * @generated
 */
public interface RuleRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(ParserRule)
	 * @see antlr4.Antlr4Package#getRuleRef_Reference()
	 * @model
	 * @generated
	 */
	ParserRule getReference();

	/**
	 * Sets the value of the '{@link antlr4.RuleRef#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ParserRule value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(String)
	 * @see antlr4.Antlr4Package#getRuleRef_Args()
	 * @model
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link antlr4.RuleRef#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(ElementOptions)
	 * @see antlr4.Antlr4Package#getRuleRef_Options()
	 * @model containment="true"
	 * @generated
	 */
	ElementOptions getOptions();

	/**
	 * Sets the value of the '{@link antlr4.RuleRef#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(ElementOptions value);

} // RuleRef
