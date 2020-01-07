/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.Alternative#getOptions <em>Options</em>}</li>
 *   <li>{@link antlr4.Alternative#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends EObject {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(ElementOptions)
	 * @see antlr4.Antlr4Package#getAlternative_Options()
	 * @model containment="true"
	 * @generated
	 */
	ElementOptions getOptions();

	/**
	 * Sets the value of the '{@link antlr4.Alternative#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(ElementOptions value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getAlternative_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Alternative
