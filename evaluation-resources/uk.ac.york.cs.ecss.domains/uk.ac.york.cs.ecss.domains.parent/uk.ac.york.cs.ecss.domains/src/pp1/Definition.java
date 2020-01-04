/**
 */
package pp1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.Definition#getClassName <em>Class Name</em>}</li>
 *   <li>{@link pp1.Definition#getArguments <em>Arguments</em>}</li>
 *   <li>{@link pp1.Definition#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends Expression {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see pp1.Pp1Package#getDefinition_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link pp1.Definition#getClassName <em>Class Name</em>}' attribute.
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
	 * @see pp1.Pp1Package#getDefinition_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	DefinitionArgumentList getArguments();

	/**
	 * Sets the value of the '{@link pp1.Definition#getArguments <em>Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments</em>' containment reference.
	 * @see #getArguments()
	 * @generated
	 */
	void setArguments(DefinitionArgumentList value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link pp1.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see pp1.Pp1Package#getDefinition_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getStatements();

} // Definition
