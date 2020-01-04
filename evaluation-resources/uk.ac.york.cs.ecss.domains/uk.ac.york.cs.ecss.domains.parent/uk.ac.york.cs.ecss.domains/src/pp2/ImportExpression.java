/**
 */
package pp2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.ImportExpression#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getImportExpression()
 * @model
 * @generated
 */
public interface ImportExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link pp2.IQuotedString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see pp2.Pp2Package#getImportExpression_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<IQuotedString> getValues();

} // ImportExpression
