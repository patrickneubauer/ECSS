/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.KeyStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.KeyStatement#getKeyunknownstatements <em>Keyunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getKeyStatement()
 * @model
 * @generated
 */
public interface KeyStatement extends ListSubstatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getKeyStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.KeyStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Keyunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getKeyStatement_Keyunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getKeyunknownstatements();

} // KeyStatement
