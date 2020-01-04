/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Elements Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.MaxElementsStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.MaxElementsStatement#getMaxelementsunknownstatements <em>Maxelementsunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getMaxElementsStatement()
 * @model
 * @generated
 */
public interface MaxElementsStatement extends ListSubstatement, LeafListSubstatement, RefineSubstatement, DeviateSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getMaxElementsStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.MaxElementsStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Maxelementsunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxelementsunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getMaxElementsStatement_Maxelementsunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getMaxelementsunknownstatements();

} // MaxElementsStatement
