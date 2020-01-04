/**
 */
package wML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preproc IF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wML.WMLPreprocIF#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link wML.WMLPreprocIF#getElses <em>Elses</em>}</li>
 *   <li>{@link wML.WMLPreprocIF#getElseExpressions <em>Else Expressions</em>}</li>
 *   <li>{@link wML.WMLPreprocIF#getEndName <em>End Name</em>}</li>
 * </ul>
 *
 * @see wML.WMLPackage#getWMLPreprocIF()
 * @model
 * @generated
 */
public interface WMLPreprocIF extends WMLRootExpression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link wML.WMLValuedExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see wML.WMLPackage#getWMLPreprocIF_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMLValuedExpression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Elses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elses</em>' attribute.
	 * @see #setElses(String)
	 * @see wML.WMLPackage#getWMLPreprocIF_Elses()
	 * @model
	 * @generated
	 */
	String getElses();

	/**
	 * Sets the value of the '{@link wML.WMLPreprocIF#getElses <em>Elses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elses</em>' attribute.
	 * @see #getElses()
	 * @generated
	 */
	void setElses(String value);

	/**
	 * Returns the value of the '<em><b>Else Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link wML.WMLValuedExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expressions</em>' containment reference list.
	 * @see wML.WMLPackage#getWMLPreprocIF_ElseExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMLValuedExpression> getElseExpressions();

	/**
	 * Returns the value of the '<em><b>End Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Name</em>' attribute.
	 * @see #setEndName(String)
	 * @see wML.WMLPackage#getWMLPreprocIF_EndName()
	 * @model
	 * @generated
	 */
	String getEndName();

	/**
	 * Sets the value of the '{@link wML.WMLPreprocIF#getEndName <em>End Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Name</em>' attribute.
	 * @see #getEndName()
	 * @generated
	 */
	void setEndName(String value);

} // WMLPreprocIF
