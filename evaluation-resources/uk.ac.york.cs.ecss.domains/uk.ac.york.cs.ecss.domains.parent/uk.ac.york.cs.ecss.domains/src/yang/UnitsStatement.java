/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Units Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.UnitsStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.UnitsStatement#getUnitsunknownstatements <em>Unitsunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getUnitsStatement()
 * @model
 * @generated
 */
public interface UnitsStatement extends LeafSubstatement, LeafListSubstatement, DeviateSubstatement, TypedefSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getUnitsStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.UnitsStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Unitsunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitsunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getUnitsStatement_Unitsunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getUnitsunknownstatements();

} // UnitsStatement
