/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslService#isWebService <em>Web Service</em>}</li>
 *   <li>{@link sculptordsl.DslService#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslService()
 * @model
 * @generated
 */
public interface DslService extends DslServiceRepositoryOption {
	/**
	 * Returns the value of the '<em><b>Web Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Service</em>' attribute.
	 * @see #setWebService(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslService_WebService()
	 * @model
	 * @generated
	 */
	boolean isWebService();

	/**
	 * Sets the value of the '{@link sculptordsl.DslService#isWebService <em>Web Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Service</em>' attribute.
	 * @see #isWebService()
	 * @generated
	 */
	void setWebService(boolean value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslServiceOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslService_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslServiceOperation> getOperations();

} // DslService
