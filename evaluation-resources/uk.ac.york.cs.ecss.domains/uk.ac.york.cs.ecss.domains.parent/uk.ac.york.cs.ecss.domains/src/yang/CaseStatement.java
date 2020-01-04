/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.CaseStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.CaseStatement#getCasesubstatements <em>Casesubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getCaseStatement()
 * @model
 * @generated
 */
public interface CaseStatement extends ChoiceSubstatement, AugmentSubstatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getCaseStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.CaseStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Casesubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.CaseSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casesubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getCaseStatement_Casesubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CaseSubstatement> getCasesubstatements();

} // CaseStatement
