/**
 */
package pp2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.Definition#getClassName <em>Class Name</em>}</li>
 *   <li>{@link pp2.Definition#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends ExpressionBlock {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see pp2.Pp2Package#getDefinition_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link pp2.Definition#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference.
	 * @see #setArguments(DefinitionArgumentList)
	 * @see pp2.Pp2Package#getDefinition_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	DefinitionArgumentList getArguments();

	/**
	 * Sets the value of the '{@link pp2.Definition#getArguments <em>Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments</em>' containment reference.
	 * @see #getArguments()
	 * @generated
	 */
	void setArguments(DefinitionArgumentList value);

} // Definition
