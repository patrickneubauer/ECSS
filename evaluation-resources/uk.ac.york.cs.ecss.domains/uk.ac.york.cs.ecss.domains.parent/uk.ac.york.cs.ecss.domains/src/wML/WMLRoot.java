/**
 */
package wML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wML.WMLRoot#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see wML.WMLPackage#getWMLRoot()
 * @model
 * @generated
 */
public interface WMLRoot extends WMLGrammarElement {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link wML.WMLRootExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see wML.WMLPackage#getWMLRoot_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMLRootExpression> getExpressions();

} // WMLRoot
