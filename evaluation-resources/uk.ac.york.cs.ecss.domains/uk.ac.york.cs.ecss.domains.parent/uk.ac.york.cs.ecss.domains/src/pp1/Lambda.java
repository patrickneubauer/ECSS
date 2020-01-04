/**
 */
package pp1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.Lambda#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getLambda()
 * @model abstract="true"
 * @generated
 */
public interface Lambda extends ExpressionBlock {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference.
	 * @see #setArguments(DefinitionArgumentList)
	 * @see pp1.Pp1Package#getLambda_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	DefinitionArgumentList getArguments();

	/**
	 * Sets the value of the '{@link pp1.Lambda#getArguments <em>Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments</em>' containment reference.
	 * @see #getArguments()
	 * @generated
	 */
	void setArguments(DefinitionArgumentList value);

} // Lambda
