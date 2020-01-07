/**
 */
package xtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.Group#getGuardCondition <em>Guard Condition</em>}</li>
 * </ul>
 *
 * @see xtext.XtextPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends CompoundElement {
	/**
	 * Returns the value of the '<em><b>Guard Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Condition</em>' containment reference.
	 * @see #setGuardCondition(Condition)
	 * @see xtext.XtextPackage#getGroup_GuardCondition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getGuardCondition();

	/**
	 * Sets the value of the '{@link xtext.Group#getGuardCondition <em>Guard Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Condition</em>' containment reference.
	 * @see #getGuardCondition()
	 * @generated
	 */
	void setGuardCondition(Condition value);

} // Group
