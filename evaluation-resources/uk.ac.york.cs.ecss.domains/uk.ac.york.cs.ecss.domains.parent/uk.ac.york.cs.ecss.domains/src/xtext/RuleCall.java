/**
 */
package xtext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.RuleCall#getRule <em>Rule</em>}</li>
 *   <li>{@link xtext.RuleCall#getArguments <em>Arguments</em>}</li>
 *   <li>{@link xtext.RuleCall#isExplicitlyCalled <em>Explicitly Called</em>}</li>
 * </ul>
 *
 * @see xtext.XtextPackage#getRuleCall()
 * @model
 * @generated
 */
public interface RuleCall extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(AbstractRule)
	 * @see xtext.XtextPackage#getRuleCall_Rule()
	 * @model
	 * @generated
	 */
	AbstractRule getRule();

	/**
	 * Sets the value of the '{@link xtext.RuleCall#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(AbstractRule value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link xtext.NamedArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see xtext.XtextPackage#getRuleCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedArgument> getArguments();

	/**
	 * Returns the value of the '<em><b>Explicitly Called</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicitly Called</em>' attribute.
	 * @see #setExplicitlyCalled(boolean)
	 * @see xtext.XtextPackage#getRuleCall_ExplicitlyCalled()
	 * @model
	 * @generated
	 */
	boolean isExplicitlyCalled();

	/**
	 * Sets the value of the '{@link xtext.RuleCall#isExplicitlyCalled <em>Explicitly Called</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicitly Called</em>' attribute.
	 * @see #isExplicitlyCalled()
	 * @generated
	 */
	void setExplicitlyCalled(boolean value);

} // RuleCall
