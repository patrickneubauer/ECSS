/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.ArgumentStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.ArgumentStatement#getArgumentsubstatements <em>Argumentsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getArgumentStatement()
 * @model
 * @generated
 */
public interface ArgumentStatement extends ExtensionSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getArgumentStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.ArgumentStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Argumentsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.ArgumentSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getArgumentStatement_Argumentsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentSubstatement> getArgumentsubstatements();

} // ArgumentStatement
