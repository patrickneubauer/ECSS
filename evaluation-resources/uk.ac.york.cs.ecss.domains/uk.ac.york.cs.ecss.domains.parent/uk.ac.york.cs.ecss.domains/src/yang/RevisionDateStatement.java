/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision Date Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.RevisionDateStatement#getDate <em>Date</em>}</li>
 *   <li>{@link yang.RevisionDateStatement#getRevisiondateunknownstatements <em>Revisiondateunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getRevisionDateStatement()
 * @model
 * @generated
 */
public interface RevisionDateStatement extends ImportSubstatements, IncludeSubstatements {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see yang.YangPackage#getRevisionDateStatement_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link yang.RevisionDateStatement#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Revisiondateunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisiondateunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getRevisionDateStatement_Revisiondateunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getRevisiondateunknownstatements();

} // RevisionDateStatement
