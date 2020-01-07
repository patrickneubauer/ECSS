/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>V3 Tokens</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.V3Tokens#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getV3Tokens()
 * @model
 * @generated
 */
public interface V3Tokens extends Tokens {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.V3Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getV3Tokens_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<V3Token> getTokens();

} // V3Tokens
