/**
 */
package pp2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.DefinitionArgument#getPuppetType <em>Puppet Type</em>}</li>
 *   <li>{@link pp2.DefinitionArgument#getArgName <em>Arg Name</em>}</li>
 *   <li>{@link pp2.DefinitionArgument#getValue <em>Value</em>}</li>
 *   <li>{@link pp2.DefinitionArgument#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getDefinitionArgument()
 * @model
 * @generated
 */
public interface DefinitionArgument extends EObject {
	/**
	 * Returns the value of the '<em><b>Puppet Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puppet Type</em>' containment reference.
	 * @see #setPuppetType(Expression)
	 * @see pp2.Pp2Package#getDefinitionArgument_PuppetType()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPuppetType();

	/**
	 * Sets the value of the '{@link pp2.DefinitionArgument#getPuppetType <em>Puppet Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puppet Type</em>' containment reference.
	 * @see #getPuppetType()
	 * @generated
	 */
	void setPuppetType(Expression value);

	/**
	 * Returns the value of the '<em><b>Arg Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg Name</em>' attribute.
	 * @see #setArgName(String)
	 * @see pp2.Pp2Package#getDefinitionArgument_ArgName()
	 * @model
	 * @generated
	 */
	String getArgName();

	/**
	 * Sets the value of the '{@link pp2.DefinitionArgument#getArgName <em>Arg Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg Name</em>' attribute.
	 * @see #getArgName()
	 * @generated
	 */
	void setArgName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see pp2.Pp2Package#getDefinitionArgument_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link pp2.DefinitionArgument#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see pp2.Pp2Package#getDefinitionArgument_Op()
	 * @model
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link pp2.DefinitionArgument#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

} // DefinitionArgument
