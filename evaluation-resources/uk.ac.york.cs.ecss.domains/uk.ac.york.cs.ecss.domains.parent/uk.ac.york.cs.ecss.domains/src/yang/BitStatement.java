/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.BitStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.BitStatement#getBitsubstatements <em>Bitsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getBitStatement()
 * @model
 * @generated
 */
public interface BitStatement extends TypeSubStatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getBitStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.BitStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bitsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.BitSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bitsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getBitStatement_Bitsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BitSubstatement> getBitsubstatements();

} // BitStatement
