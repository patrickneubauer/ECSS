/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.BlockSet#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getBlockSet()
 * @model
 * @generated
 */
public interface BlockSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.SetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getBlockSet_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetElement> getElements();

} // BlockSet
