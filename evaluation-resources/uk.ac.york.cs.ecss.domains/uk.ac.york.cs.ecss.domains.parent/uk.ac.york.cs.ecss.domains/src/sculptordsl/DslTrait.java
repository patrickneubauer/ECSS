/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Trait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslTrait#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sculptordsl.DslTrait#getReferences <em>References</em>}</li>
 *   <li>{@link sculptordsl.DslTrait#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslTrait()
 * @model
 * @generated
 */
public interface DslTrait extends DslSimpleDomainObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslTrait_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslTrait_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslReference> getReferences();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslDomainObjectOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslTrait_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslDomainObjectOperation> getOperations();

} // DslTrait
