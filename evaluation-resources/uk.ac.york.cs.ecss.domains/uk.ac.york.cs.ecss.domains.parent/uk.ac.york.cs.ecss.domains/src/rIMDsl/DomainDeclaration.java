/**
 */
package rIMDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.DomainDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link rIMDsl.DomainDeclaration#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link rIMDsl.DomainDeclaration#getRims <em>Rims</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getDomainDeclaration()
 * @model
 * @generated
 */
public interface DomainDeclaration extends Ref {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rIMDsl.RIMDslPackage#getDomainDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rIMDsl.DomainDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.MdfAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getDomainDeclaration_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<MdfAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Rims</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.Ref}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rims</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getDomainDeclaration_Rims()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ref> getRims();

} // DomainDeclaration
