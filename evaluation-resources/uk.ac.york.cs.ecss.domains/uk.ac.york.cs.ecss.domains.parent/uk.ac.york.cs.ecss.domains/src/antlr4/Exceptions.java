/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exceptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.Exceptions#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getExceptions()
 * @model
 * @generated
 */
public interface Exceptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.QualifiedId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getExceptions_Exceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<QualifiedId> getExceptions();

} // Exceptions
