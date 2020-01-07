/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>V4 Tokens</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.V4Tokens#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getV4Tokens()
 * @model
 * @generated
 */
public interface V4Tokens extends Tokens {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.V4Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getV4Tokens_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<V4Token> getTokens();

} // V4Tokens
