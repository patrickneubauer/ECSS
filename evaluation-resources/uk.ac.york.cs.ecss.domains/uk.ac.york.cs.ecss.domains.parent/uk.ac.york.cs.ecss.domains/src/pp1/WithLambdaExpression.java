/**
 */
package pp1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With Lambda Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.WithLambdaExpression#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getWithLambdaExpression()
 * @model
 * @generated
 */
public interface WithLambdaExpression extends ParameterizedExpression {
	/**
	 * Returns the value of the '<em><b>Lambda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda</em>' containment reference.
	 * @see #setLambda(Lambda)
	 * @see pp1.Pp1Package#getWithLambdaExpression_Lambda()
	 * @model containment="true"
	 * @generated
	 */
	Lambda getLambda();

	/**
	 * Sets the value of the '{@link pp1.WithLambdaExpression#getLambda <em>Lambda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda</em>' containment reference.
	 * @see #getLambda()
	 * @generated
	 */
	void setLambda(Lambda value);

} // WithLambdaExpression
