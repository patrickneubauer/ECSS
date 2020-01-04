/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.LeafStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.LeafStatement#getLeafsubstatements <em>Leafsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getLeafStatement()
 * @model
 * @generated
 */
public interface LeafStatement extends DatadefStatement, ChoiceSubstatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getLeafStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.LeafStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Leafsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.LeafSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leafsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getLeafStatement_Leafsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<LeafSubstatement> getLeafsubstatements();

} // LeafStatement
