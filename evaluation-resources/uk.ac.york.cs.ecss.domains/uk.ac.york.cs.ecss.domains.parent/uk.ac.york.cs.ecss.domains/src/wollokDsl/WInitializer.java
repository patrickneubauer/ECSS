/**
 */
package wollokDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WInitializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WInitializer#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link wollokDsl.WInitializer#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWInitializer()
 * @model
 * @generated
 */
public interface WInitializer extends EObject {
	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(WVariable)
	 * @see wollokDsl.WollokDslPackage#getWInitializer_Initializer()
	 * @model containment="true"
	 * @generated
	 */
	WVariable getInitializer();

	/**
	 * Sets the value of the '{@link wollokDsl.WInitializer#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(WVariable value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWInitializer_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getInitialValue();

	/**
	 * Sets the value of the '{@link wollokDsl.WInitializer#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(WExpression value);

} // WInitializer
