/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslConsumer#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.DslConsumer#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.DslConsumer#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.DslConsumer#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link sculptordsl.DslConsumer#getMessageRoot <em>Message Root</em>}</li>
 *   <li>{@link sculptordsl.DslConsumer#getChannel <em>Channel</em>}</li>
 *   <li>{@link sculptordsl.DslConsumer#getSubscribe <em>Subscribe</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslConsumer()
 * @model
 * @generated
 */
public interface DslConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see sculptordsl.SculptordslPackage#getDslConsumer_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link sculptordsl.DslConsumer#getDoc <em>Doc</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslConsumer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslConsumer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see sculptordsl.SculptordslPackage#getDslConsumer_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link sculptordsl.DslConsumer#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslConsumer_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslDependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Message Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Root</em>' reference.
	 * @see #setMessageRoot(DslDomainObject)
	 * @see sculptordsl.SculptordslPackage#getDslConsumer_MessageRoot()
	 * @model
	 * @generated
	 */
	DslDomainObject getMessageRoot();

	/**
	 * Sets the value of the '{@link sculptordsl.DslConsumer#getMessageRoot <em>Message Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Root</em>' reference.
	 * @see #getMessageRoot()
	 * @generated
	 */
	void setMessageRoot(DslDomainObject value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' attribute.
	 * @see #setChannel(String)
	 * @see sculptordsl.SculptordslPackage#getDslConsumer_Channel()
	 * @model
	 * @generated
	 */
	String getChannel();

	/**
	 * Sets the value of the '{@link sculptordsl.DslConsumer#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(String value);

	/**
	 * Returns the value of the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe</em>' containment reference.
	 * @see #setSubscribe(DslSubscribe)
	 * @see sculptordsl.SculptordslPackage#getDslConsumer_Subscribe()
	 * @model containment="true"
	 * @generated
	 */
	DslSubscribe getSubscribe();

	/**
	 * Sets the value of the '{@link sculptordsl.DslConsumer#getSubscribe <em>Subscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe</em>' containment reference.
	 * @see #getSubscribe()
	 * @generated
	 */
	void setSubscribe(DslSubscribe value);

} // DslConsumer
