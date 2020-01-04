/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.ListStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.ListStatement#getListsubstatements <em>Listsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getListStatement()
 * @model
 * @generated
 */
public interface ListStatement extends DatadefStatement, ChoiceSubstatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getListStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.ListStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Listsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.ListSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getListStatement_Listsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListSubstatement> getListsubstatements();

} // ListStatement
