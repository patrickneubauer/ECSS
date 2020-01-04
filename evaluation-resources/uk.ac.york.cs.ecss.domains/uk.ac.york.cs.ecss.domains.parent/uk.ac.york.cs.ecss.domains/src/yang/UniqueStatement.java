/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.UniqueStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.UniqueStatement#getUniqueunknownstatements <em>Uniqueunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getUniqueStatement()
 * @model
 * @generated
 */
public interface UniqueStatement extends ListSubstatement, DeviateSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getUniqueStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.UniqueStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Uniqueunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uniqueunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getUniqueStatement_Uniqueunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getUniqueunknownstatements();

} // UniqueStatement
