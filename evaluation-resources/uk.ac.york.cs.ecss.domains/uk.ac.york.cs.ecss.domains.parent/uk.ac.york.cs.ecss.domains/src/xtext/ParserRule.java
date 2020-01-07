/**
 */
package xtext;

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
 *   <li>{@link xtext.ParserRule#isDefinesHiddenTokens <em>Defines Hidden Tokens</em>}</li>
 *   <li>{@link xtext.ParserRule#getHiddenTokens <em>Hidden Tokens</em>}</li>
 *   <li>{@link xtext.ParserRule#getParameters <em>Parameters</em>}</li>
 *   <li>{@link xtext.ParserRule#isFragment <em>Fragment</em>}</li>
 *   <li>{@link xtext.ParserRule#isWildcard <em>Wildcard</em>}</li>
 * </ul>
 *
 * @see xtext.XtextPackage#getParserRule()
 * @model
 * @generated
 */
public interface ParserRule extends AbstractRule {
	/**
	 * Returns the value of the '<em><b>Defines Hidden Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines Hidden Tokens</em>' attribute.
	 * @see #setDefinesHiddenTokens(boolean)
	 * @see xtext.XtextPackage#getParserRule_DefinesHiddenTokens()
	 * @model
	 * @generated
	 */
	boolean isDefinesHiddenTokens();

	/**
	 * Sets the value of the '{@link xtext.ParserRule#isDefinesHiddenTokens <em>Defines Hidden Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defines Hidden Tokens</em>' attribute.
	 * @see #isDefinesHiddenTokens()
	 * @generated
	 */
	void setDefinesHiddenTokens(boolean value);

	/**
	 * Returns the value of the '<em><b>Hidden Tokens</b></em>' reference list.
	 * The list contents are of type {@link xtext.AbstractRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Tokens</em>' reference list.
	 * @see xtext.XtextPackage#getParserRule_HiddenTokens()
	 * @model
	 * @generated
	 */
	EList<AbstractRule> getHiddenTokens();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link xtext.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see xtext.XtextPackage#getParserRule_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' attribute.
	 * @see #setFragment(boolean)
	 * @see xtext.XtextPackage#getParserRule_Fragment()
	 * @model
	 * @generated
	 */
	boolean isFragment();

	/**
	 * Sets the value of the '{@link xtext.ParserRule#isFragment <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment</em>' attribute.
	 * @see #isFragment()
	 * @generated
	 */
	void setFragment(boolean value);

	/**
	 * Returns the value of the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wildcard</em>' attribute.
	 * @see #setWildcard(boolean)
	 * @see xtext.XtextPackage#getParserRule_Wildcard()
	 * @model
	 * @generated
	 */
	boolean isWildcard();

	/**
	 * Sets the value of the '{@link xtext.ParserRule#isWildcard <em>Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wildcard</em>' attribute.
	 * @see #isWildcard()
	 * @generated
	 */
	void setWildcard(boolean value);

} // ParserRule
