/**
 */
package sculptordsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Service Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslServiceDependency#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslServiceDependency()
 * @model
 * @generated
 */
public interface DslServiceDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' reference.
	 * @see #setDependency(DslService)
	 * @see sculptordsl.SculptordslPackage#getDslServiceDependency_Dependency()
	 * @model
	 * @generated
	 */
	DslService getDependency();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceDependency#getDependency <em>Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(DslService value);

} // DslServiceDependency
