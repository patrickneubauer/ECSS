/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Message Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.ErrorMessageStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.ErrorMessageStatement#getErrormunknownstatements <em>Errormunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getErrorMessageStatement()
 * @model
 * @generated
 */
public interface ErrorMessageStatement extends MultipleSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getErrorMessageStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.ErrorMessageStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Errormunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errormunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getErrorMessageStatement_Errormunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getErrormunknownstatements();

} // ErrorMessageStatement
