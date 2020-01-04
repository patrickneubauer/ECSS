/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.PrefixStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.PrefixStatement#getPrefixunknownstatements <em>Prefixunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getPrefixStatement()
 * @model
 * @generated
 */
public interface PrefixStatement extends ModuleStatement, BelongsToSubstatement, ImportSubstatements {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getPrefixStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.PrefixStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Prefixunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefixunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getPrefixStatement_Prefixunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getPrefixunknownstatements();

} // PrefixStatement
