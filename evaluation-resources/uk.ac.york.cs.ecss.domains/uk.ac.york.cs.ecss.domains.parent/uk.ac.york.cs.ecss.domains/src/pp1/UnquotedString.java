/**
 */
package pp1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unquoted String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.UnquotedString#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getUnquotedString()
 * @model
 * @generated
 */
public interface UnquotedString extends StringExpression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see pp1.Pp1Package#getUnquotedString_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link pp1.UnquotedString#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // UnquotedString
