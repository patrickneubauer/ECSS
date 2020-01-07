/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Service Repository Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslServiceRepositoryOption#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.DslServiceRepositoryOption#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.DslServiceRepositoryOption#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link sculptordsl.DslServiceRepositoryOption#isNoGapClass <em>No Gap Class</em>}</li>
 *   <li>{@link sculptordsl.DslServiceRepositoryOption#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.DslServiceRepositoryOption#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link sculptordsl.DslServiceRepositoryOption#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslServiceRepositoryOption()
 * @model
 * @generated
 */
public interface DslServiceRepositoryOption extends EObject {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see sculptordsl.SculptordslPackage#getDslServiceRepositoryOption_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceRepositoryOption#getDoc <em>Doc</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslServiceRepositoryOption_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceRepositoryOption#getName <em>Name</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslServiceRepositoryOption_GapClass()
	 * @model
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceRepositoryOption#isGapClass <em>Gap Class</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslServiceRepositoryOption_NoGapClass()
	 * @model
	 * @generated
	 */
	boolean isNoGapClass();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceRepositoryOption#isNoGapClass <em>No Gap Class</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslServiceRepositoryOption_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceRepositoryOption#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

	/**
	 * Returns the value of the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe</em>' containment reference.
	 * @see #setSubscribe(DslSubscribe)
	 * @see sculptordsl.SculptordslPackage#getDslServiceRepositoryOption_Subscribe()
	 * @model containment="true"
	 * @generated
	 */
	DslSubscribe getSubscribe();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceRepositoryOption#getSubscribe <em>Subscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe</em>' containment reference.
	 * @see #getSubscribe()
	 * @generated
	 */
	void setSubscribe(DslSubscribe value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslServiceRepositoryOption_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslDependency> getDependencies();

} // DslServiceRepositoryOption
