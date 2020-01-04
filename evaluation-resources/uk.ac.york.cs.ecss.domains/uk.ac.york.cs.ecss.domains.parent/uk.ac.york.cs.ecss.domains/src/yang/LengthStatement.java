/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.LengthStatement#getLength <em>Length</em>}</li>
 *   <li>{@link yang.LengthStatement#getLengthsubstatements <em>Lengthsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getLengthStatement()
 * @model
 * @generated
 */
public interface LengthStatement extends TypeSubStatement {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see yang.YangPackage#getLengthStatement_Length()
	 * @model
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link yang.LengthStatement#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Lengthsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.MultipleSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lengthsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getLengthStatement_Lengthsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultipleSubstatement> getLengthsubstatements();

} // LengthStatement
