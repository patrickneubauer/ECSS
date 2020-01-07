/**
 */
package xtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.TerminalRule#isFragment <em>Fragment</em>}</li>
 * </ul>
 *
 * @see xtext.XtextPackage#getTerminalRule()
 * @model
 * @generated
 */
public interface TerminalRule extends AbstractRule {
	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' attribute.
	 * @see #setFragment(boolean)
	 * @see xtext.XtextPackage#getTerminalRule_Fragment()
	 * @model
	 * @generated
	 */
	boolean isFragment();

	/**
	 * Sets the value of the '{@link xtext.TerminalRule#isFragment <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment</em>' attribute.
	 * @see #isFragment()
	 * @generated
	 */
	void setFragment(boolean value);

} // TerminalRule
