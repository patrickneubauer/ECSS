/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refine Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.RefineStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.RefineStatement#getRefinesubstatements <em>Refinesubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getRefineStatement()
 * @model
 * @generated
 */
public interface RefineStatement extends UsesSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getRefineStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.RefineStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Refinesubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.RefineSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinesubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getRefineStatement_Refinesubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefineSubstatement> getRefinesubstatements();

} // RefineStatement
