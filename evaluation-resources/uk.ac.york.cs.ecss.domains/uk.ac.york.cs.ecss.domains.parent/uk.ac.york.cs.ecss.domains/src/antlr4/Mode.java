/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.Mode#getId <em>Id</em>}</li>
 *   <li>{@link antlr4.Mode#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getMode()
 * @model
 * @generated
 */
public interface Mode extends LexerCommandArg {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see antlr4.Antlr4Package#getMode_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link antlr4.Mode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.LexerRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getMode_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<LexerRule> getRules();

} // Mode
