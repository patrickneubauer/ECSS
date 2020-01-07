/**
 */
package xtext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.Grammar#getName <em>Name</em>}</li>
 *   <li>{@link xtext.Grammar#getUsedGrammars <em>Used Grammars</em>}</li>
 *   <li>{@link xtext.Grammar#isDefinesHiddenTokens <em>Defines Hidden Tokens</em>}</li>
 *   <li>{@link xtext.Grammar#getHiddenTokens <em>Hidden Tokens</em>}</li>
 *   <li>{@link xtext.Grammar#getMetamodelDeclarations <em>Metamodel Declarations</em>}</li>
 *   <li>{@link xtext.Grammar#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see xtext.XtextPackage#getGrammar()
 * @model
 * @generated
 */
public interface Grammar extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xtext.XtextPackage#getGrammar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xtext.Grammar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Used Grammars</b></em>' reference list.
	 * The list contents are of type {@link xtext.Grammar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Grammars</em>' reference list.
	 * @see xtext.XtextPackage#getGrammar_UsedGrammars()
	 * @model
	 * @generated
	 */
	EList<Grammar> getUsedGrammars();

	/**
	 * Returns the value of the '<em><b>Defines Hidden Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines Hidden Tokens</em>' attribute.
	 * @see #setDefinesHiddenTokens(boolean)
	 * @see xtext.XtextPackage#getGrammar_DefinesHiddenTokens()
	 * @model
	 * @generated
	 */
	boolean isDefinesHiddenTokens();

	/**
	 * Sets the value of the '{@link xtext.Grammar#isDefinesHiddenTokens <em>Defines Hidden Tokens</em>}' attribute.
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
	 * @see xtext.XtextPackage#getGrammar_HiddenTokens()
	 * @model
	 * @generated
	 */
	EList<AbstractRule> getHiddenTokens();

	/**
	 * Returns the value of the '<em><b>Metamodel Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link xtext.AbstractMetamodelDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Declarations</em>' containment reference list.
	 * @see xtext.XtextPackage#getGrammar_MetamodelDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractMetamodelDeclaration> getMetamodelDeclarations();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link xtext.AbstractRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see xtext.XtextPackage#getGrammar_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractRule> getRules();

} // Grammar
