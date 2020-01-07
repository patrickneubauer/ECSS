/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.Wildcard#getDot <em>Dot</em>}</li>
 *   <li>{@link antlr4.Wildcard#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getWildcard()
 * @model
 * @generated
 */
public interface Wildcard extends EObject {
	/**
	 * Returns the value of the '<em><b>Dot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot</em>' attribute.
	 * @see #setDot(String)
	 * @see antlr4.Antlr4Package#getWildcard_Dot()
	 * @model
	 * @generated
	 */
	String getDot();

	/**
	 * Sets the value of the '{@link antlr4.Wildcard#getDot <em>Dot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot</em>' attribute.
	 * @see #getDot()
	 * @generated
	 */
	void setDot(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(ElementOptions)
	 * @see antlr4.Antlr4Package#getWildcard_Options()
	 * @model containment="true"
	 * @generated
	 */
	ElementOptions getOptions();

	/**
	 * Sets the value of the '{@link antlr4.Wildcard#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(ElementOptions value);

} // Wildcard
