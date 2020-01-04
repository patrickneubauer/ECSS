/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.ConfigStatement#getBoolarg <em>Boolarg</em>}</li>
 *   <li>{@link yang.ConfigStatement#getConfigunknownstatements <em>Configunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getConfigStatement()
 * @model
 * @generated
 */
public interface ConfigStatement extends ContainerSubstatement, ListSubstatement, LeafSubstatement, LeafListSubstatement, ChoiceSubstatement, AnyxmlSubstatement, RefineSubstatement, DeviateSubstatement {
	/**
	 * Returns the value of the '<em><b>Boolarg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolarg</em>' attribute.
	 * @see #setBoolarg(String)
	 * @see yang.YangPackage#getConfigStatement_Boolarg()
	 * @model
	 * @generated
	 */
	String getBoolarg();

	/**
	 * Sets the value of the '{@link yang.ConfigStatement#getBoolarg <em>Boolarg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolarg</em>' attribute.
	 * @see #getBoolarg()
	 * @generated
	 */
	void setBoolarg(String value);

	/**
	 * Returns the value of the '<em><b>Configunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getConfigStatement_Configunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getConfigunknownstatements();

} // ConfigStatement
