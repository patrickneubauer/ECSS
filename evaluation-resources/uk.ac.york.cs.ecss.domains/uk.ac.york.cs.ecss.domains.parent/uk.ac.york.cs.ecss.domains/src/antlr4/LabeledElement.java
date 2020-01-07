/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.LabeledElement#getName <em>Name</em>}</li>
 *   <li>{@link antlr4.LabeledElement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getLabeledElement()
 * @model
 * @generated
 */
public interface LabeledElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see antlr4.Antlr4Package#getLabeledElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link antlr4.LabeledElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(EObject)
	 * @see antlr4.Antlr4Package#getLabeledElement_Body()
	 * @model containment="true"
	 * @generated
	 */
	EObject getBody();

	/**
	 * Sets the value of the '{@link antlr4.LabeledElement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(EObject value);

} // LabeledElement
