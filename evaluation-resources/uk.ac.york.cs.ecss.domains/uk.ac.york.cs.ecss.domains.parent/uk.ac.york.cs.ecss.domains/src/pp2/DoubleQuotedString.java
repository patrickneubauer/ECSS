/**
 */
package pp2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Quoted String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.DoubleQuotedString#getStringPart <em>String Part</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getDoubleQuotedString()
 * @model
 * @generated
 */
public interface DoubleQuotedString extends StringExpression, IQuotedString {
	/**
	 * Returns the value of the '<em><b>String Part</b></em>' containment reference list.
	 * The list contents are of type {@link pp2.TextExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Part</em>' containment reference list.
	 * @see pp2.Pp2Package#getDoubleQuotedString_StringPart()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextExpression> getStringPart();

} // DoubleQuotedString
