/**
 */
package pp2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collect Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.CollectExpression#getClassReference <em>Class Reference</em>}</li>
 *   <li>{@link pp2.CollectExpression#getQuery <em>Query</em>}</li>
 *   <li>{@link pp2.CollectExpression#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getCollectExpression()
 * @model
 * @generated
 */
public interface CollectExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Class Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Reference</em>' containment reference.
	 * @see #setClassReference(Expression)
	 * @see pp2.Pp2Package#getCollectExpression_ClassReference()
	 * @model containment="true"
	 * @generated
	 */
	Expression getClassReference();

	/**
	 * Sets the value of the '{@link pp2.CollectExpression#getClassReference <em>Class Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Reference</em>' containment reference.
	 * @see #getClassReference()
	 * @generated
	 */
	void setClassReference(Expression value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(ICollectQuery)
	 * @see pp2.Pp2Package#getCollectExpression_Query()
	 * @model containment="true"
	 * @generated
	 */
	ICollectQuery getQuery();

	/**
	 * Sets the value of the '{@link pp2.CollectExpression#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(ICollectQuery value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(AttributeOperations)
	 * @see pp2.Pp2Package#getCollectExpression_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	AttributeOperations getAttributes();

	/**
	 * Sets the value of the '{@link pp2.CollectExpression#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributeOperations value);

} // CollectExpression
