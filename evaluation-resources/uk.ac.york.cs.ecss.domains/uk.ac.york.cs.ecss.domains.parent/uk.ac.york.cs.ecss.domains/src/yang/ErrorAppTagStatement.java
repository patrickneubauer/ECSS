/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error App Tag Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.ErrorAppTagStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.ErrorAppTagStatement#getErroraunknownstatements <em>Erroraunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getErrorAppTagStatement()
 * @model
 * @generated
 */
public interface ErrorAppTagStatement extends MultipleSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getErrorAppTagStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.ErrorAppTagStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Erroraunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erroraunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getErrorAppTagStatement_Erroraunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getErroraunknownstatements();

} // ErrorAppTagStatement
