/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.QualifiedId#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getQualifiedId()
 * @model
 * @generated
 */
public interface QualifiedId extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see antlr4.Antlr4Package#getQualifiedId_Name()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getName();

} // QualifiedId
