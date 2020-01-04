/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Belongs To Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.BelongsToStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.BelongsToStatement#getBelongstosubstatement <em>Belongstosubstatement</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getBelongsToStatement()
 * @model
 * @generated
 */
public interface BelongsToStatement extends SubmoduleStatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getBelongsToStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.BelongsToStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Belongstosubstatement</b></em>' containment reference list.
	 * The list contents are of type {@link yang.BelongsToSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongstosubstatement</em>' containment reference list.
	 * @see yang.YangPackage#getBelongsToStatement_Belongstosubstatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<BelongsToSubstatement> getBelongstosubstatement();

} // BelongsToStatement
