/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WConstructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WConstructor#getParameters <em>Parameters</em>}</li>
 *   <li>{@link wollokDsl.WConstructor#getDelegatingConstructorCall <em>Delegating Constructor Call</em>}</li>
 *   <li>{@link wollokDsl.WConstructor#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWConstructor()
 * @model
 * @generated
 */
public interface WConstructor extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWConstructor_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<WParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Delegating Constructor Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegating Constructor Call</em>' containment reference.
	 * @see #setDelegatingConstructorCall(WDelegatingConstructorCall)
	 * @see wollokDsl.WollokDslPackage#getWConstructor_DelegatingConstructorCall()
	 * @model containment="true"
	 * @generated
	 */
	WDelegatingConstructorCall getDelegatingConstructorCall();

	/**
	 * Sets the value of the '{@link wollokDsl.WConstructor#getDelegatingConstructorCall <em>Delegating Constructor Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegating Constructor Call</em>' containment reference.
	 * @see #getDelegatingConstructorCall()
	 * @generated
	 */
	void setDelegatingConstructorCall(WDelegatingConstructorCall value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWConstructor_Expression()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getExpression();

	/**
	 * Sets the value of the '{@link wollokDsl.WConstructor#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(WExpression value);

} // WConstructor
