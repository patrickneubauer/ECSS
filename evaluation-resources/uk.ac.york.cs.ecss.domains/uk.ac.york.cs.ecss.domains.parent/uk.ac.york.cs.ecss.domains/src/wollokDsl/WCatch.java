/**
 */
package wollokDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WCatch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WCatch#getExceptionVarName <em>Exception Var Name</em>}</li>
 *   <li>{@link wollokDsl.WCatch#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link wollokDsl.WCatch#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWCatch()
 * @model
 * @generated
 */
public interface WCatch extends EObject {
	/**
	 * Returns the value of the '<em><b>Exception Var Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Var Name</em>' containment reference.
	 * @see #setExceptionVarName(WVariable)
	 * @see wollokDsl.WollokDslPackage#getWCatch_ExceptionVarName()
	 * @model containment="true"
	 * @generated
	 */
	WVariable getExceptionVarName();

	/**
	 * Sets the value of the '{@link wollokDsl.WCatch#getExceptionVarName <em>Exception Var Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Var Name</em>' containment reference.
	 * @see #getExceptionVarName()
	 * @generated
	 */
	void setExceptionVarName(WVariable value);

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Type</em>' reference.
	 * @see #setExceptionType(WClass)
	 * @see wollokDsl.WollokDslPackage#getWCatch_ExceptionType()
	 * @model
	 * @generated
	 */
	WClass getExceptionType();

	/**
	 * Sets the value of the '{@link wollokDsl.WCatch#getExceptionType <em>Exception Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type</em>' reference.
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(WClass value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWCatch_Expression()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getExpression();

	/**
	 * Sets the value of the '{@link wollokDsl.WCatch#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(WExpression value);

} // WCatch
