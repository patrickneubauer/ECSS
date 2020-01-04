/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.OutputStatement#getOutputsubstatements <em>Outputsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getOutputStatement()
 * @model
 * @generated
 */
public interface OutputStatement extends RpcSubstatement {
	/**
	 * Returns the value of the '<em><b>Outputsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.OutputSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getOutputStatement_Outputsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputSubstatement> getOutputsubstatements();

} // OutputStatement
