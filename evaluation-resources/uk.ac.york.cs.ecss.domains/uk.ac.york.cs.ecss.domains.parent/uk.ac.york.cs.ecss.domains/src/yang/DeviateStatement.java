/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deviate Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.DeviateStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.DeviateStatement#getDeviatesubstatements <em>Deviatesubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getDeviateStatement()
 * @model
 * @generated
 */
public interface DeviateStatement extends DeviationSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getDeviateStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.DeviateStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Deviatesubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.DeviateSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviatesubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getDeviateStatement_Deviatesubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviateSubstatement> getDeviatesubstatements();

} // DeviateStatement
