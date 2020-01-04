/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.DescriptionStatement#getDescription <em>Description</em>}</li>
 *   <li>{@link yang.DescriptionStatement#getDescriptionunknownstatements <em>Descriptionunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getDescriptionStatement()
 * @model
 * @generated
 */
public interface DescriptionStatement extends ModuleStatement, SubmoduleStatement, MultipleSubstatement, RpcSubstatement, NotificationSubstatement, ContainerSubstatement, ListSubstatement, GroupingSubstatement, LeafSubstatement, LeafListSubstatement, ChoiceSubstatement, CaseSubstatement, AnyxmlSubstatement, UsesSubstatement, AugmentSubstatement, RefineSubstatement, DeviationSubstatement, ExtensionSubstatement, IdentitySubstatement, FeatureSubstatement, TypedefSubstatement, BitSubstatement, EnumSubstatement, WhenSubstatements, RevisionSubstatements {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see yang.YangPackage#getDescriptionStatement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link yang.DescriptionStatement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Descriptionunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptionunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getDescriptionStatement_Descriptionunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getDescriptionunknownstatements();

} // DescriptionStatement
