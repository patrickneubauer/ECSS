/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslRepository#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslRepository()
 * @model
 * @generated
 */
public interface DslRepository extends DslServiceRepositoryOption {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslRepositoryOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslRepository_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslRepositoryOperation> getOperations();

} // DslRepository
