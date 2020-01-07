/**
 */
package wollokDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WVariable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WVariableDeclaration#isWriteable <em>Writeable</em>}</li>
 *   <li>{@link wollokDsl.WVariableDeclaration#isProperty <em>Property</em>}</li>
 *   <li>{@link wollokDsl.WVariableDeclaration#getVariable <em>Variable</em>}</li>
 *   <li>{@link wollokDsl.WVariableDeclaration#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWVariableDeclaration()
 * @model
 * @generated
 */
public interface WVariableDeclaration extends WExpression {
	/**
	 * Returns the value of the '<em><b>Writeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writeable</em>' attribute.
	 * @see #setWriteable(boolean)
	 * @see wollokDsl.WollokDslPackage#getWVariableDeclaration_Writeable()
	 * @model
	 * @generated
	 */
	boolean isWriteable();

	/**
	 * Sets the value of the '{@link wollokDsl.WVariableDeclaration#isWriteable <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writeable</em>' attribute.
	 * @see #isWriteable()
	 * @generated
	 */
	void setWriteable(boolean value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(boolean)
	 * @see wollokDsl.WollokDslPackage#getWVariableDeclaration_Property()
	 * @model
	 * @generated
	 */
	boolean isProperty();

	/**
	 * Sets the value of the '{@link wollokDsl.WVariableDeclaration#isProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #isProperty()
	 * @generated
	 */
	void setProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(WVariable)
	 * @see wollokDsl.WollokDslPackage#getWVariableDeclaration_Variable()
	 * @model containment="true"
	 * @generated
	 */
	WVariable getVariable();

	/**
	 * Sets the value of the '{@link wollokDsl.WVariableDeclaration#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(WVariable value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWVariableDeclaration_Right()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getRight();

	/**
	 * Sets the value of the '{@link wollokDsl.WVariableDeclaration#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(WExpression value);

} // WVariableDeclaration
