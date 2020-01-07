/**
 */
package sculptordsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Service Operation Delegate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslServiceOperationDelegate#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link sculptordsl.DslServiceOperationDelegate#getDelegateOperation <em>Delegate Operation</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslServiceOperationDelegate()
 * @model
 * @generated
 */
public interface DslServiceOperationDelegate extends EObject {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(DslServiceRepositoryOption)
	 * @see sculptordsl.SculptordslPackage#getDslServiceOperationDelegate_Delegate()
	 * @model
	 * @generated
	 */
	DslServiceRepositoryOption getDelegate();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceOperationDelegate#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(DslServiceRepositoryOption value);

	/**
	 * Returns the value of the '<em><b>Delegate Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Operation</em>' reference.
	 * @see #setDelegateOperation(DslServiceRepositoryOperationOption)
	 * @see sculptordsl.SculptordslPackage#getDslServiceOperationDelegate_DelegateOperation()
	 * @model
	 * @generated
	 */
	DslServiceRepositoryOperationOption getDelegateOperation();

	/**
	 * Sets the value of the '{@link sculptordsl.DslServiceOperationDelegate#getDelegateOperation <em>Delegate Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Operation</em>' reference.
	 * @see #getDelegateOperation()
	 * @generated
	 */
	void setDelegateOperation(DslServiceRepositoryOperationOption value);

} // DslServiceOperationDelegate
