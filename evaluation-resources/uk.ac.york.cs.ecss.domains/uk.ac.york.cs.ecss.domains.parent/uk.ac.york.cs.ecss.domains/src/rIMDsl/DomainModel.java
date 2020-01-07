/**
 */
package rIMDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.DomainModel#getRims <em>Rims</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Rims</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.Ref}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rims</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getDomainModel_Rims()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ref> getRims();

} // DomainModel
