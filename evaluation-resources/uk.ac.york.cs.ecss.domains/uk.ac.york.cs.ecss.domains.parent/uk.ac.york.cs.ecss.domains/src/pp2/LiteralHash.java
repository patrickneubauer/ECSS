/**
 */
package pp2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Hash</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp2.LiteralHash#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see pp2.Pp2Package#getLiteralHash()
 * @model
 * @generated
 */
public interface LiteralHash extends LiteralExpression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link pp2.HashEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see pp2.Pp2Package#getLiteralHash_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<HashEntry> getElements();

} // LiteralHash
