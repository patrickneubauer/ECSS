/**
 */
package xtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.CompositeCondition#getLeft <em>Left</em>}</li>
 *   <li>{@link xtext.CompositeCondition#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see xtext.XtextPackage#getCompositeCondition()
 * @model
 * @generated
 */
public interface CompositeCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Condition)
	 * @see xtext.XtextPackage#getCompositeCondition_Left()
	 * @model containment="true"
	 * @generated
	 */
	Condition getLeft();

	/**
	 * Sets the value of the '{@link xtext.CompositeCondition#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Condition value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Condition)
	 * @see xtext.XtextPackage#getCompositeCondition_Right()
	 * @model containment="true"
	 * @generated
	 */
	Condition getRight();

	/**
	 * Sets the value of the '{@link xtext.CompositeCondition#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Condition value);

} // CompositeCondition
