/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WNamed Arguments List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WNamedArgumentsList#getInitializers <em>Initializers</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWNamedArgumentsList()
 * @model
 * @generated
 */
public interface WNamedArgumentsList extends WArgumentList {
	/**
	 * Returns the value of the '<em><b>Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WInitializer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializers</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWNamedArgumentsList_Initializers()
	 * @model containment="true"
	 * @generated
	 */
	EList<WInitializer> getInitializers();

} // WNamedArgumentsList
