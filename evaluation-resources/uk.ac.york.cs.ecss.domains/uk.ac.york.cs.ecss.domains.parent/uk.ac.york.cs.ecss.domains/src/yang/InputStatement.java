/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.InputStatement#getInputsubstatements <em>Inputsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getInputStatement()
 * @model
 * @generated
 */
public interface InputStatement extends RpcSubstatement {
	/**
	 * Returns the value of the '<em><b>Inputsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.InputSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getInputStatement_Inputsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputSubstatement> getInputsubstatements();

} // InputStatement
