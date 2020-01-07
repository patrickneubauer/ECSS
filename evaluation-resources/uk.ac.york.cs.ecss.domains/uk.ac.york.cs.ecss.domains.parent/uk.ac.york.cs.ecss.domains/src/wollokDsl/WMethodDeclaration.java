/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WMethod Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WMethodDeclaration#isOverrides <em>Overrides</em>}</li>
 *   <li>{@link wollokDsl.WMethodDeclaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link wollokDsl.WMethodDeclaration#isNative <em>Native</em>}</li>
 *   <li>{@link wollokDsl.WMethodDeclaration#getExpression <em>Expression</em>}</li>
 *   <li>{@link wollokDsl.WMethodDeclaration#isExpressionReturns <em>Expression Returns</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWMethodDeclaration()
 * @model
 * @generated
 */
public interface WMethodDeclaration extends WNamed, WMember {
	/**
	 * Returns the value of the '<em><b>Overrides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overrides</em>' attribute.
	 * @see #setOverrides(boolean)
	 * @see wollokDsl.WollokDslPackage#getWMethodDeclaration_Overrides()
	 * @model
	 * @generated
	 */
	boolean isOverrides();

	/**
	 * Sets the value of the '{@link wollokDsl.WMethodDeclaration#isOverrides <em>Overrides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overrides</em>' attribute.
	 * @see #isOverrides()
	 * @generated
	 */
	void setOverrides(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWMethodDeclaration_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<WParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native</em>' attribute.
	 * @see #setNative(boolean)
	 * @see wollokDsl.WollokDslPackage#getWMethodDeclaration_Native()
	 * @model
	 * @generated
	 */
	boolean isNative();

	/**
	 * Sets the value of the '{@link wollokDsl.WMethodDeclaration#isNative <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native</em>' attribute.
	 * @see #isNative()
	 * @generated
	 */
	void setNative(boolean value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWMethodDeclaration_Expression()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getExpression();

	/**
	 * Sets the value of the '{@link wollokDsl.WMethodDeclaration#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(WExpression value);

	/**
	 * Returns the value of the '<em><b>Expression Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Returns</em>' attribute.
	 * @see #setExpressionReturns(boolean)
	 * @see wollokDsl.WollokDslPackage#getWMethodDeclaration_ExpressionReturns()
	 * @model
	 * @generated
	 */
	boolean isExpressionReturns();

	/**
	 * Sets the value of the '{@link wollokDsl.WMethodDeclaration#isExpressionReturns <em>Expression Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Returns</em>' attribute.
	 * @see #isExpressionReturns()
	 * @generated
	 */
	void setExpressionReturns(boolean value);

} // WMethodDeclaration
