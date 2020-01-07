/**
 */
package antlr4;

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
 *   <li>{@link antlr4.Grammar#getType <em>Type</em>}</li>
 *   <li>{@link antlr4.Grammar#getName <em>Name</em>}</li>
 *   <li>{@link antlr4.Grammar#getPrequels <em>Prequels</em>}</li>
 *   <li>{@link antlr4.Grammar#getRules <em>Rules</em>}</li>
 *   <li>{@link antlr4.Grammar#getModes <em>Modes</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getGrammar()
 * @model
 * @generated
 */
public interface Grammar extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link antlr4.GrammarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see antlr4.GrammarType
	 * @see #setType(GrammarType)
	 * @see antlr4.Antlr4Package#getGrammar_Type()
	 * @model
	 * @generated
	 */
	GrammarType getType();

	/**
	 * Sets the value of the '{@link antlr4.Grammar#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see antlr4.GrammarType
	 * @see #getType()
	 * @generated
	 */
	void setType(GrammarType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see antlr4.Antlr4Package#getGrammar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link antlr4.Grammar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Prequels</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.PrequelConstruct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prequels</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getGrammar_Prequels()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrequelConstruct> getPrequels();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getGrammar_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.Mode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getGrammar_Modes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mode> getModes();

} // Grammar
