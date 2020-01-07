/**
 */
package sculptordsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslDependency#getDependency <em>Dependency</em>}</li>
 *   <li>{@link sculptordsl.DslDependency#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslDependency()
 * @model
 * @generated
 */
public interface DslDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' reference.
	 * @see #setDependency(DslServiceRepositoryOption)
	 * @see sculptordsl.SculptordslPackage#getDslDependency_Dependency()
	 * @model
	 * @generated
	 */
	DslServiceRepositoryOption getDependency();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDependency#getDependency <em>Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(DslServiceRepositoryOption value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sculptordsl.SculptordslPackage#getDslDependency_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDependency#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DslDependency
