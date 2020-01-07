/**
 */
package xtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.Negation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see xtext.XtextPackage#getNegation()
 * @model
 * @generated
 */
public interface Negation extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Condition)
	 * @see xtext.XtextPackage#getNegation_Value()
	 * @model containment="true"
	 * @generated
	 */
	Condition getValue();

	/**
	 * Sets the value of the '{@link xtext.Negation#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Condition value);

} // Negation
