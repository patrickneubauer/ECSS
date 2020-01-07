/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WClosure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WClosure#getParameters <em>Parameters</em>}</li>
 *   <li>{@link wollokDsl.WClosure#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWClosure()
 * @model
 * @generated
 */
public interface WClosure extends WExpression {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWClosure_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<WParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWClosure_Expression()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getExpression();

	/**
	 * Sets the value of the '{@link wollokDsl.WClosure#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(WExpression value);

} // WClosure
