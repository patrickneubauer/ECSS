/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Feature Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.IfFeatureStatement#getPref <em>Pref</em>}</li>
 *   <li>{@link yang.IfFeatureStatement#getIdent <em>Ident</em>}</li>
 *   <li>{@link yang.IfFeatureStatement#getIffeatureunknownstatements <em>Iffeatureunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getIfFeatureStatement()
 * @model
 * @generated
 */
public interface IfFeatureStatement extends RpcSubstatement, NotificationSubstatement, ContainerSubstatement, ListSubstatement, LeafSubstatement, LeafListSubstatement, ChoiceSubstatement, CaseSubstatement, AnyxmlSubstatement, UsesSubstatement, AugmentSubstatement, FeatureSubstatement {
	/**
	 * Returns the value of the '<em><b>Pref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pref</em>' attribute.
	 * @see #setPref(String)
	 * @see yang.YangPackage#getIfFeatureStatement_Pref()
	 * @model
	 * @generated
	 */
	String getPref();

	/**
	 * Sets the value of the '{@link yang.IfFeatureStatement#getPref <em>Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pref</em>' attribute.
	 * @see #getPref()
	 * @generated
	 */
	void setPref(String value);

	/**
	 * Returns the value of the '<em><b>Ident</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident</em>' reference.
	 * @see #setIdent(FeatureStatement)
	 * @see yang.YangPackage#getIfFeatureStatement_Ident()
	 * @model
	 * @generated
	 */
	FeatureStatement getIdent();

	/**
	 * Sets the value of the '{@link yang.IfFeatureStatement#getIdent <em>Ident</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident</em>' reference.
	 * @see #getIdent()
	 * @generated
	 */
	void setIdent(FeatureStatement value);

	/**
	 * Returns the value of the '<em><b>Iffeatureunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iffeatureunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getIfFeatureStatement_Iffeatureunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getIffeatureunknownstatements();

} // IfFeatureStatement
