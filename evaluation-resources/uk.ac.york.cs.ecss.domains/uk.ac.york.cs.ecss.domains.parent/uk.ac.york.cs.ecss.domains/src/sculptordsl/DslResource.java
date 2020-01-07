/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslResource#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.DslResource#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.DslResource#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link sculptordsl.DslResource#isNoGapClass <em>No Gap Class</em>}</li>
 *   <li>{@link sculptordsl.DslResource#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.DslResource#isScaffold <em>Scaffold</em>}</li>
 *   <li>{@link sculptordsl.DslResource#getPath <em>Path</em>}</li>
 *   <li>{@link sculptordsl.DslResource#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link sculptordsl.DslResource#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslResource()
 * @model
 * @generated
 */
public interface DslResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see sculptordsl.SculptordslPackage#getDslResource_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResource#getDoc <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' attribute.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sculptordsl.SculptordslPackage#getDslResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslResource_GapClass()
	 * @model
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResource#isGapClass <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Class</em>' attribute.
	 * @see #isGapClass()
	 * @generated
	 */
	void setGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Gap Class</em>' attribute.
	 * @see #setNoGapClass(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslResource_NoGapClass()
	 * @model
	 * @generated
	 */
	boolean isNoGapClass();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResource#isNoGapClass <em>No Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Gap Class</em>' attribute.
	 * @see #isNoGapClass()
	 * @generated
	 */
	void setNoGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see sculptordsl.SculptordslPackage#getDslResource_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResource#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

	/**
	 * Returns the value of the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaffold</em>' attribute.
	 * @see #setScaffold(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslResource_Scaffold()
	 * @model
	 * @generated
	 */
	boolean isScaffold();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResource#isScaffold <em>Scaffold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaffold</em>' attribute.
	 * @see #isScaffold()
	 * @generated
	 */
	void setScaffold(boolean value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see sculptordsl.SculptordslPackage#getDslResource_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResource#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslServiceDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslResource_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslServiceDependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslResourceOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslResource_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslResourceOperation> getOperations();

} // DslResource
