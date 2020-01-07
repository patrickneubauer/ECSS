/**
 */
package xtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.LiteralCondition#isTrue <em>True</em>}</li>
 * </ul>
 *
 * @see xtext.XtextPackage#getLiteralCondition()
 * @model
 * @generated
 */
public interface LiteralCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True</em>' attribute.
	 * @see #setTrue(boolean)
	 * @see xtext.XtextPackage#getLiteralCondition_True()
	 * @model
	 * @generated
	 */
	boolean isTrue();

	/**
	 * Sets the value of the '{@link xtext.LiteralCondition#isTrue <em>True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True</em>' attribute.
	 * @see #isTrue()
	 * @generated
	 */
	void setTrue(boolean value);

} // LiteralCondition
