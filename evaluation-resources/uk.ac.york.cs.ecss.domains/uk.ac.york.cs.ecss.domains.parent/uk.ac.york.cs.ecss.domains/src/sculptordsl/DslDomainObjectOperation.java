/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Domain Object Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslDomainObjectOperation#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObjectOperation#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObjectOperation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObjectOperation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObjectOperation#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObjectOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObjectOperation#getThrows <em>Throws</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObjectOperation#getHint <em>Hint</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslDomainObjectOperation()
 * @model
 * @generated
 */
public interface DslDomainObjectOperation extends DslDomainObjectTypedElement {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObjectOperation_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObjectOperation#getDoc <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' attribute.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObjectOperation_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObjectOperation#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link sculptordsl.DslVisibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see sculptordsl.DslVisibility
	 * @see #setVisibility(DslVisibility)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObjectOperation_Visibility()
	 * @model
	 * @generated
	 */
	DslVisibility getVisibility();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObjectOperation#getVisibility <em>Visibility</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslDomainObjectOperation_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	DslComplexType getReturnType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObjectOperation#getReturnType <em>Return Type</em>}' containment reference.
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
	 * @see sculptordsl.SculptordslPackage#getDslDomainObjectOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObjectOperation#getName <em>Name</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslDomainObjectOperation_Parameters()
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
	 * @see sculptordsl.SculptordslPackage#getDslDomainObjectOperation_Throws()
	 * @model
	 * @generated
	 */
	String getThrows();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObjectOperation#getThrows <em>Throws</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslDomainObjectOperation_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObjectOperation#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

} // DslDomainObjectOperation
