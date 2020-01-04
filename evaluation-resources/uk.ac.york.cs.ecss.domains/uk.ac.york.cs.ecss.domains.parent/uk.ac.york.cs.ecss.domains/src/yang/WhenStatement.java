/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.WhenStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.WhenStatement#getWhensubstatements <em>Whensubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getWhenStatement()
 * @model
 * @generated
 */
public interface WhenStatement extends ContainerSubstatement, ListSubstatement, LeafSubstatement, LeafListSubstatement, ChoiceSubstatement, CaseSubstatement, AnyxmlSubstatement, UsesSubstatement, AugmentSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getWhenStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.WhenStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Whensubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.WhenSubstatements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whensubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getWhenStatement_Whensubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<WhenSubstatements> getWhensubstatements();

} // WhenStatement
