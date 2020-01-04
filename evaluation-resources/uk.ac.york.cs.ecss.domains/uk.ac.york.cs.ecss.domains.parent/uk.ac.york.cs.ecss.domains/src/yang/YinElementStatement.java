/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Yin Element Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.YinElementStatement#getBoolarg <em>Boolarg</em>}</li>
 *   <li>{@link yang.YinElementStatement#getYinelementunknownstatements <em>Yinelementunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getYinElementStatement()
 * @model
 * @generated
 */
public interface YinElementStatement extends ArgumentSubstatement {
	/**
	 * Returns the value of the '<em><b>Boolarg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolarg</em>' attribute.
	 * @see #setBoolarg(String)
	 * @see yang.YangPackage#getYinElementStatement_Boolarg()
	 * @model
	 * @generated
	 */
	String getBoolarg();

	/**
	 * Sets the value of the '{@link yang.YinElementStatement#getBoolarg <em>Boolarg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolarg</em>' attribute.
	 * @see #getBoolarg()
	 * @generated
	 */
	void setBoolarg(String value);

	/**
	 * Returns the value of the '<em><b>Yinelementunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yinelementunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getYinElementStatement_Yinelementunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getYinelementunknownstatements();

} // YinElementStatement
