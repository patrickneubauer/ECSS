/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deviation Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.DeviationStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.DeviationStatement#getDeviationsubstatements <em>Deviationsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getDeviationStatement()
 * @model
 * @generated
 */
public interface DeviationStatement extends ModuleStatement, SubmoduleStatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getDeviationStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.DeviationStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Deviationsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.DeviationSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviationsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getDeviationStatement_Deviationsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviationSubstatement> getDeviationsubstatements();

} // DeviationStatement
