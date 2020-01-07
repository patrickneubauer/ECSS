/**
 */
package wollokDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WThrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WThrow#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWThrow()
 * @model
 * @generated
 */
public interface WThrow extends WExpression {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWThrow_Exception()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getException();

	/**
	 * Sets the value of the '{@link wollokDsl.WThrow#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(WExpression value);

} // WThrow
