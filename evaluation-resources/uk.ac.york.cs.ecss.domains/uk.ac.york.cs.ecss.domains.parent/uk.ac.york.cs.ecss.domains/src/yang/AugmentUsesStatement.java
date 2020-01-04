/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Augment Uses Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.AugmentUsesStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.AugmentUsesStatement#getAugmentsubstatements <em>Augmentsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getAugmentUsesStatement()
 * @model
 * @generated
 */
public interface AugmentUsesStatement extends UsesSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getAugmentUsesStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.AugmentUsesStatement#getArg <em>Arg</em>}' attribute.
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
	 * @see yang.YangPackage#getAugmentUsesStatement_Augmentsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AugmentSubstatement> getAugmentsubstatements();

} // AugmentUsesStatement
