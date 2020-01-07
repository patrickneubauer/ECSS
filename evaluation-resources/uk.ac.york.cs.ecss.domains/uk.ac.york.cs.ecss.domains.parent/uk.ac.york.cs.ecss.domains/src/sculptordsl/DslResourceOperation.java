/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Resource Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslResourceOperation#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.DslResourceOperation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link sculptordsl.DslResourceOperation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link sculptordsl.DslResourceOperation#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.DslResourceOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link sculptordsl.DslResourceOperation#getThrows <em>Throws</em>}</li>
 *   <li>{@link sculptordsl.DslResourceOperation#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.DslResourceOperation#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link sculptordsl.DslResourceOperation#getPath <em>Path</em>}</li>
 *   <li>{@link sculptordsl.DslResourceOperation#getReturnString <em>Return String</em>}</li>
 *   <li>{@link sculptordsl.DslResourceOperation#getDelegateHolder <em>Delegate Holder</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslResourceOperation()
 * @model
 * @generated
 */
public interface DslResourceOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperation_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperation#getDoc <em>Doc</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperation_Visibility()
	 * @model
	 * @generated
	 */
	DslVisibility getVisibility();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperation#getVisibility <em>Visibility</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperation_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	DslComplexType getReturnType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperation#getReturnType <em>Return Type</em>}' containment reference.
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
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperation#getName <em>Name</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperation_Parameters()
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
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperation_Throws()
	 * @model
	 * @generated
	 */
	String getThrows();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperation#getThrows <em>Throws</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperation_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperation#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link sculptordsl.DslHttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see sculptordsl.DslHttpMethod
	 * @see #setHttpMethod(DslHttpMethod)
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperation_HttpMethod()
	 * @model
	 * @generated
	 */
	DslHttpMethod getHttpMethod();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperation#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see sculptordsl.DslHttpMethod
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(DslHttpMethod value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperation_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperation#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Return String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return String</em>' attribute.
	 * @see #setReturnString(String)
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperation_ReturnString()
	 * @model
	 * @generated
	 */
	String getReturnString();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperation#getReturnString <em>Return String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return String</em>' attribute.
	 * @see #getReturnString()
	 * @generated
	 */
	void setReturnString(String value);

	/**
	 * Returns the value of the '<em><b>Delegate Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Holder</em>' containment reference.
	 * @see #setDelegateHolder(DslResourceOperationDelegate)
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperation_DelegateHolder()
	 * @model containment="true"
	 * @generated
	 */
	DslResourceOperationDelegate getDelegateHolder();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperation#getDelegateHolder <em>Delegate Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Holder</em>' containment reference.
	 * @see #getDelegateHolder()
	 * @generated
	 */
	void setDelegateHolder(DslResourceOperationDelegate value);

} // DslResourceOperation
