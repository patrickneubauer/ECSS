/**
 */
package xtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Negated Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.AbstractNegatedToken#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @see xtext.XtextPackage#getAbstractNegatedToken()
 * @model
 * @generated
 */
public interface AbstractNegatedToken extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' containment reference.
	 * @see #setTerminal(AbstractElement)
	 * @see xtext.XtextPackage#getAbstractNegatedToken_Terminal()
	 * @model containment="true"
	 * @generated
	 */
	AbstractElement getTerminal();

	/**
	 * Sets the value of the '{@link xtext.AbstractNegatedToken#getTerminal <em>Terminal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' containment reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(AbstractElement value);

} // AbstractNegatedToken
