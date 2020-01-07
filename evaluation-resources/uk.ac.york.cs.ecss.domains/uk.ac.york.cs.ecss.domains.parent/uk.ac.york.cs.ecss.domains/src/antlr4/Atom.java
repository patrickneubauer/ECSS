/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.Atom#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getAtom()
 * @model
 * @generated
 */
public interface Atom extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(EObject)
	 * @see antlr4.Antlr4Package#getAtom_Body()
	 * @model containment="true"
	 * @generated
	 */
	EObject getBody();

	/**
	 * Sets the value of the '{@link antlr4.Atom#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(EObject value);

} // Atom
