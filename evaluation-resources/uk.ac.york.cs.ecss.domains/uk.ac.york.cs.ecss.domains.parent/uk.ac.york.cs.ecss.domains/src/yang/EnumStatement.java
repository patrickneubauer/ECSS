/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.EnumStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.EnumStatement#getEnumsubstatements <em>Enumsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getEnumStatement()
 * @model
 * @generated
 */
public interface EnumStatement extends TypeSubStatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getEnumStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.EnumStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enumsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.EnumSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getEnumStatement_Enumsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumSubstatement> getEnumsubstatements();

} // EnumStatement
