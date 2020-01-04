/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uses Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.UsesStatement#getPre <em>Pre</em>}</li>
 *   <li>{@link yang.UsesStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.UsesStatement#getUsessubstatements <em>Usessubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getUsesStatement()
 * @model
 * @generated
 */
public interface UsesStatement extends DatadefStatement {
	/**
	 * Returns the value of the '<em><b>Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' attribute.
	 * @see #setPre(String)
	 * @see yang.YangPackage#getUsesStatement_Pre()
	 * @model
	 * @generated
	 */
	String getPre();

	/**
	 * Sets the value of the '{@link yang.UsesStatement#getPre <em>Pre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' attribute.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(String value);

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' reference.
	 * @see #setArg(GroupingStatement)
	 * @see yang.YangPackage#getUsesStatement_Arg()
	 * @model
	 * @generated
	 */
	GroupingStatement getArg();

	/**
	 * Sets the value of the '{@link yang.UsesStatement#getArg <em>Arg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' reference.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(GroupingStatement value);

	/**
	 * Returns the value of the '<em><b>Usessubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UsesSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usessubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getUsesStatement_Usessubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsesSubstatement> getUsessubstatements();

} // UsesStatement
