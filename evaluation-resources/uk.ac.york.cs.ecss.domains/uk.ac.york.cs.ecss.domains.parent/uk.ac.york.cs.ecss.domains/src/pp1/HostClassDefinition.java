/**
 */
package pp1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Class Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.HostClassDefinition#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getHostClassDefinition()
 * @model
 * @generated
 */
public interface HostClassDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(LiteralExpression)
	 * @see pp1.Pp1Package#getHostClassDefinition_Parent()
	 * @model containment="true"
	 * @generated
	 */
	LiteralExpression getParent();

	/**
	 * Sets the value of the '{@link pp1.HostClassDefinition#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(LiteralExpression value);

} // HostClassDefinition
