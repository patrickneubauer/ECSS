/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.ElementOptions#getBegin <em>Begin</em>}</li>
 *   <li>{@link antlr4.ElementOptions#getOptions <em>Options</em>}</li>
 *   <li>{@link antlr4.ElementOptions#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getElementOptions()
 * @model
 * @generated
 */
public interface ElementOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(String)
	 * @see antlr4.Antlr4Package#getElementOptions_Begin()
	 * @model
	 * @generated
	 */
	String getBegin();

	/**
	 * Sets the value of the '{@link antlr4.ElementOptions#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.ElementOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getElementOptions_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementOption> getOptions();

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see antlr4.Antlr4Package#getElementOptions_End()
	 * @model
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link antlr4.ElementOptions#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

} // ElementOptions
