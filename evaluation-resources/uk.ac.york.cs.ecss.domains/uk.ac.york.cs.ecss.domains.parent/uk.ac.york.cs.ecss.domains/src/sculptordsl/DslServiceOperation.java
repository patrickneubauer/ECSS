/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Service Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslServiceOperation#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.DslServiceOperation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link sculptordsl.DslServiceOperation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link sculptordsl.DslServiceOperation#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.DslServiceOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link sculptordsl.DslServiceOperation#getThrows <em>Throws</em>}</li>
 *   <li>{@link sculptordsl.DslServiceOperation#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.DslServiceOperation#getPublish <em>Publish</em>}</li>
 *   <li>{@link sculptordsl.DslServiceOperation#getDelegateHolder <em>Delegate Holder</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslServiceOperation()
 * @model
 * @generated
 */
public interface DslServiceOperation extends DslDomainObjectTypedElement, DslServiceRepositoryOperationOption {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see sculptordsl.SculptordslPackage#getDslServiceOperation_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceOperation#getDoc <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' attribute.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link sculptordsl.DslVisibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see sculptordsl.DslVisibility
	 * @see #setVisibility(DslVisibility)
	 * @see sculptordsl.SculptordslPackage#getDslServiceOperation_Visibility()
	 * @model
	 * @generated
	 */
	DslVisibility getVisibility();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceOperation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see sculptordsl.DslVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(DslVisibility value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(DslComplexType)
	 * @see sculptordsl.SculptordslPackage#getDslServiceOperation_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	DslComplexType getReturnType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceOperation#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DslComplexType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sculptordsl.SculptordslPackage#getDslServiceOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslServiceOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' attribute.
	 * @see #setThrows(String)
	 * @see sculptordsl.SculptordslPackage#getDslServiceOperation_Throws()
	 * @model
	 * @generated
	 */
	String getThrows();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceOperation#getThrows <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' attribute.
	 * @see #getThrows()
	 * @generated
	 */
	void setThrows(String value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see sculptordsl.SculptordslPackage#getDslServiceOperation_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceOperation#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

	/**
	 * Returns the value of the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish</em>' containment reference.
	 * @see #setPublish(DslPublish)
	 * @see sculptordsl.SculptordslPackage#getDslServiceOperation_Publish()
	 * @model containment="true"
	 * @generated
	 */
	DslPublish getPublish();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceOperation#getPublish <em>Publish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish</em>' containment reference.
	 * @see #getPublish()
	 * @generated
	 */
	void setPublish(DslPublish value);

	/**
	 * Returns the value of the '<em><b>Delegate Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Holder</em>' containment reference.
	 * @see #setDelegateHolder(DslServiceOperationDelegate)
	 * @see sculptordsl.SculptordslPackage#getDslServiceOperation_DelegateHolder()
	 * @model containment="true"
	 * @generated
	 */
	DslServiceOperationDelegate getDelegateHolder();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceOperation#getDelegateHolder <em>Delegate Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Holder</em>' containment reference.
	 * @see #getDelegateHolder()
	 * @generated
	 */
	void setDelegateHolder(DslServiceOperationDelegate value);

} // DslServiceOperation
