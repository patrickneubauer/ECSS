/**
 */
package wollokDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WDelegating Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WDelegatingConstructorCall#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWDelegatingConstructorCall()
 * @model
 * @generated
 */
public interface WDelegatingConstructorCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument List</em>' containment reference.
	 * @see #setArgumentList(WPositionalArgumentsList)
	 * @see wollokDsl.WollokDslPackage#getWDelegatingConstructorCall_ArgumentList()
	 * @model containment="true"
	 * @generated
	 */
	WPositionalArgumentsList getArgumentList();

	/**
	 * Sets the value of the '{@link wollokDsl.WDelegatingConstructorCall#getArgumentList <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument List</em>' containment reference.
	 * @see #getArgumentList()
	 * @generated
	 */
	void setArgumentList(WPositionalArgumentsList value);

} // WDelegatingConstructorCall
