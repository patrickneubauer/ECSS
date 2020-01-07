/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.Block#getOptions <em>Options</em>}</li>
 *   <li>{@link antlr4.Block#getActions <em>Actions</em>}</li>
 *   <li>{@link antlr4.Block#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Options)
	 * @see antlr4.Antlr4Package#getBlock_Options()
	 * @model containment="true"
	 * @generated
	 */
	Options getOptions();

	/**
	 * Sets the value of the '{@link antlr4.Block#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Options value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.RuleAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getBlock_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleAction> getActions();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(AltList)
	 * @see antlr4.Antlr4Package#getBlock_Body()
	 * @model containment="true"
	 * @generated
	 */
	AltList getBody();

	/**
	 * Sets the value of the '{@link antlr4.Block#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(AltList value);

} // Block
