/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orderedby Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.OrderedbyStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.OrderedbyStatement#getOrderedbyunknownstatements <em>Orderedbyunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getOrderedbyStatement()
 * @model
 * @generated
 */
public interface OrderedbyStatement extends ListSubstatement, LeafListSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getOrderedbyStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.OrderedbyStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Orderedbyunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderedbyunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getOrderedbyStatement_Orderedbyunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getOrderedbyunknownstatements();

} // OrderedbyStatement
