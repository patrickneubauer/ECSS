/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fraction Digits Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.FractionDigitsStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.FractionDigitsStatement#getFractiondigitsunknownstatements <em>Fractiondigitsunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getFractionDigitsStatement()
 * @model
 * @generated
 */
public interface FractionDigitsStatement extends TypeSubStatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getFractionDigitsStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.FractionDigitsStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Fractiondigitsunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fractiondigitsunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getFractionDigitsStatement_Fractiondigitsunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getFractiondigitsunknownstatements();

} // FractionDigitsStatement
