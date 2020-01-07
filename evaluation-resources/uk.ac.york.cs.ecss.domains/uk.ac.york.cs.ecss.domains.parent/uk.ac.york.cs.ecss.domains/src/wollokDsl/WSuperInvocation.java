/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WSuper Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WSuperInvocation#getMemberCallArguments <em>Member Call Arguments</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWSuperInvocation()
 * @model
 * @generated
 */
public interface WSuperInvocation extends WExpression {
	/**
	 * Returns the value of the '<em><b>Member Call Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Call Arguments</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWSuperInvocation_MemberCallArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<WExpression> getMemberCallArguments();

} // WSuperInvocation
