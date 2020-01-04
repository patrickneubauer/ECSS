/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.DefaultStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.DefaultStatement#getDefaultunknownstatements <em>Defaultunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getDefaultStatement()
 * @model
 * @generated
 */
public interface DefaultStatement extends LeafSubstatement, LeafListSubstatement, ChoiceSubstatement, RefineSubstatement, DeviateSubstatement, TypedefSubstatement, TypeSubStatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getDefaultStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.DefaultStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Defaultunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaultunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getDefaultStatement_Defaultunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getDefaultunknownstatements();

} // DefaultStatement
