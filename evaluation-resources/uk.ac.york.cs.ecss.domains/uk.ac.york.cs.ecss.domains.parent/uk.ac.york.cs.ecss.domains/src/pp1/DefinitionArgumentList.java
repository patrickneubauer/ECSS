/**
 */
package pp1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Argument List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.DefinitionArgumentList#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getDefinitionArgumentList()
 * @model
 * @generated
 */
public interface DefinitionArgumentList extends EObject {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link pp1.DefinitionArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see pp1.Pp1Package#getDefinitionArgumentList_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionArgument> getArguments();

} // DefinitionArgumentList
