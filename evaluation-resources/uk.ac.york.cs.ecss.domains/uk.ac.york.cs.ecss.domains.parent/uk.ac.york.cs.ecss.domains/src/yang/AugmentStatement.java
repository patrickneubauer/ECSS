/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Augment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.AugmentStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.AugmentStatement#getAugmentsubstatements <em>Augmentsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getAugmentStatement()
 * @model
 * @generated
 */
public interface AugmentStatement extends ModuleStatement, SubmoduleStatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getAugmentStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.AugmentStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Augmentsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.AugmentSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Augmentsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getAugmentStatement_Augmentsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AugmentSubstatement> getAugmentsubstatements();

} // AugmentStatement
