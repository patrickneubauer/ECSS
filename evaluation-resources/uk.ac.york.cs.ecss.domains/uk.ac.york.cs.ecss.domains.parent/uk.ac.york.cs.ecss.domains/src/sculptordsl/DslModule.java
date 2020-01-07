/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslModule#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.DslModule#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.DslModule#isExternal <em>External</em>}</li>
 *   <li>{@link sculptordsl.DslModule#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link sculptordsl.DslModule#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.DslModule#getServices <em>Services</em>}</li>
 *   <li>{@link sculptordsl.DslModule#getResources <em>Resources</em>}</li>
 *   <li>{@link sculptordsl.DslModule#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link sculptordsl.DslModule#getDomainObjects <em>Domain Objects</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslModule()
 * @model
 * @generated
 */
public interface DslModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see sculptordsl.SculptordslPackage#getDslModule_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link sculptordsl.DslModule#getDoc <em>Doc</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslModule_External()
	 * @model
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link sculptordsl.DslModule#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see sculptordsl.SculptordslPackage#getDslModule_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslModule#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see sculptordsl.SculptordslPackage#getDslModule_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link sculptordsl.DslModule#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslModule_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslService> getServices();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslModule_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslResource> getResources();

	/**
	 * Returns the value of the '<em><b>Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslConsumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumers</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslModule_Consumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslConsumer> getConsumers();

	/**
	 * Returns the value of the '<em><b>Domain Objects</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslSimpleDomainObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Objects</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslModule_DomainObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslSimpleDomainObject> getDomainObjects();

} // DslModule
