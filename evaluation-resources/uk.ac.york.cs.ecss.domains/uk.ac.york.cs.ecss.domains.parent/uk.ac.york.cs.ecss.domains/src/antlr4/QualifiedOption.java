/**
 */
package antlr4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.QualifiedOption#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getQualifiedOption()
 * @model
 * @generated
 */
public interface QualifiedOption extends OptionValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(QualifiedId)
	 * @see antlr4.Antlr4Package#getQualifiedOption_Value()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedId getValue();

	/**
	 * Sets the value of the '{@link antlr4.QualifiedOption#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(QualifiedId value);

} // QualifiedOption
