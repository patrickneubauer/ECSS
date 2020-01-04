/**
 */
package pp2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.NodeDefinition#getHostNames <em>Host Names</em>}</li>
 *   <li>{@link pp2.NodeDefinition#getParentName <em>Parent Name</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getNodeDefinition()
 * @model
 * @generated
 */
public interface NodeDefinition extends ExpressionBlock {
	/**
	 * Returns the value of the '<em><b>Host Names</b></em>' containment reference list.
	 * The list contents are of type {@link pp2.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Names</em>' containment reference list.
	 * @see pp2.Pp2Package#getNodeDefinition_HostNames()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getHostNames();

	/**
	 * Returns the value of the '<em><b>Parent Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Name</em>' containment reference.
	 * @see #setParentName(Expression)
	 * @see pp2.Pp2Package#getNodeDefinition_ParentName()
	 * @model containment="true"
	 * @generated
	 */
	Expression getParentName();

	/**
	 * Sets the value of the '{@link pp2.NodeDefinition#getParentName <em>Parent Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' containment reference.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(Expression value);

} // NodeDefinition
