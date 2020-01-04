/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Elements Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.MinElementsStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.MinElementsStatement#getMinelementsunknownstatements <em>Minelementsunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getMinElementsStatement()
 * @model
 * @generated
 */
public interface MinElementsStatement extends ListSubstatement, LeafListSubstatement, RefineSubstatement, DeviateSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getMinElementsStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.MinElementsStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Minelementsunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minelementsunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getMinElementsStatement_Minelementsunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getMinelementsunknownstatements();

} // MinElementsStatement
