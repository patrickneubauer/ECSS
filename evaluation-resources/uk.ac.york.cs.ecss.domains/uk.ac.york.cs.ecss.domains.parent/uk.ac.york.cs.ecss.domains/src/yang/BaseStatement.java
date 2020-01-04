/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.BaseStatement#getBase <em>Base</em>}</li>
 *   <li>{@link yang.BaseStatement#getBaseunknownstatements <em>Baseunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getBaseStatement()
 * @model
 * @generated
 */
public interface BaseStatement extends IdentitySubstatement, TypeSubStatement {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see yang.YangPackage#getBaseStatement_Base()
	 * @model
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link yang.BaseStatement#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Baseunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getBaseStatement_Baseunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getBaseunknownstatements();

} // BaseStatement
