/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WTry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WTry#getExpression <em>Expression</em>}</li>
 *   <li>{@link wollokDsl.WTry#getCatchBlocks <em>Catch Blocks</em>}</li>
 *   <li>{@link wollokDsl.WTry#getAlwaysExpression <em>Always Expression</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWTry()
 * @model
 * @generated
 */
public interface WTry extends WExpression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWTry_Expression()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getExpression();

	/**
	 * Sets the value of the '{@link wollokDsl.WTry#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(WExpression value);

	/**
	 * Returns the value of the '<em><b>Catch Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WCatch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Blocks</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWTry_CatchBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<WCatch> getCatchBlocks();

	/**
	 * Returns the value of the '<em><b>Always Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Expression</em>' containment reference.
	 * @see #setAlwaysExpression(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWTry_AlwaysExpression()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getAlwaysExpression();

	/**
	 * Sets the value of the '{@link wollokDsl.WTry#getAlwaysExpression <em>Always Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Expression</em>' containment reference.
	 * @see #getAlwaysExpression()
	 * @generated
	 */
	void setAlwaysExpression(WExpression value);

} // WTry
