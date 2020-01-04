/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.RevisionStatement#getDate <em>Date</em>}</li>
 *   <li>{@link yang.RevisionStatement#getRevisionsubstatements <em>Revisionsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getRevisionStatement()
 * @model
 * @generated
 */
public interface RevisionStatement extends ModuleStatement, SubmoduleStatement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see yang.YangPackage#getRevisionStatement_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link yang.RevisionStatement#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Revisionsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.RevisionSubstatements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisionsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getRevisionStatement_Revisionsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RevisionSubstatements> getRevisionsubstatements();

} // RevisionStatement
