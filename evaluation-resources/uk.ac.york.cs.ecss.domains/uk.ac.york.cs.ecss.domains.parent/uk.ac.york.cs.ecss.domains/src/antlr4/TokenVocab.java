/**
 */
package antlr4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Vocab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.TokenVocab#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getTokenVocab()
 * @model
 * @generated
 */
public interface TokenVocab extends Option {
	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' reference.
	 * @see #setImportURI(Grammar)
	 * @see antlr4.Antlr4Package#getTokenVocab_ImportURI()
	 * @model
	 * @generated
	 */
	Grammar getImportURI();

	/**
	 * Sets the value of the '{@link antlr4.TokenVocab#getImportURI <em>Import URI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' reference.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(Grammar value);

} // TokenVocab
