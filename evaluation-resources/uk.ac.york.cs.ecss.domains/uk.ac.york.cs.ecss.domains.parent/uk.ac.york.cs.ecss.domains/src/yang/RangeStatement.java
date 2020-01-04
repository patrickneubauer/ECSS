/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.RangeStatement#getRange <em>Range</em>}</li>
 *   <li>{@link yang.RangeStatement#getRangesubstatements <em>Rangesubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getRangeStatement()
 * @model
 * @generated
 */
public interface RangeStatement extends TypeSubStatement {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(String)
	 * @see yang.YangPackage#getRangeStatement_Range()
	 * @model
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link yang.RangeStatement#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(String value);

	/**
	 * Returns the value of the '<em><b>Rangesubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.MultipleSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rangesubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getRangeStatement_Rangesubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultipleSubstatement> getRangesubstatements();

} // RangeStatement
