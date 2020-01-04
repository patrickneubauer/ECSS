/**
 */
package pp1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.ResourceBody#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link pp1.ResourceBody#getNameExpr <em>Name Expr</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getResourceBody()
 * @model
 * @generated
 */
public interface ResourceBody extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(AttributeOperations)
	 * @see pp1.Pp1Package#getResourceBody_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	AttributeOperations getAttributes();

	/**
	 * Sets the value of the '{@link pp1.ResourceBody#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributeOperations value);

	/**
	 * Returns the value of the '<em><b>Name Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Expr</em>' containment reference.
	 * @see #setNameExpr(Expression)
	 * @see pp1.Pp1Package#getResourceBody_NameExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getNameExpr();

	/**
	 * Sets the value of the '{@link pp1.ResourceBody#getNameExpr <em>Name Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Expr</em>' containment reference.
	 * @see #getNameExpr()
	 * @generated
	 */
	void setNameExpr(Expression value);

} // ResourceBody
