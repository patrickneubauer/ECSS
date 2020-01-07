/**
 */
package sculptordsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Resource Operation Delegate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslResourceOperationDelegate#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link sculptordsl.DslResourceOperationDelegate#getDelegateOperation <em>Delegate Operation</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslResourceOperationDelegate()
 * @model
 * @generated
 */
public interface DslResourceOperationDelegate extends EObject {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(DslService)
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperationDelegate_Delegate()
	 * @model
	 * @generated
	 */
	DslService getDelegate();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperationDelegate#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(DslService value);

	/**
	 * Returns the value of the '<em><b>Delegate Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Operation</em>' reference.
	 * @see #setDelegateOperation(DslServiceOperation)
	 * @see sculptordsl.SculptordslPackage#getDslResourceOperationDelegate_DelegateOperation()
	 * @model
	 * @generated
	 */
	DslServiceOperation getDelegateOperation();

	/**
	 * Sets the value of the '{@link sculptordsl.DslResourceOperationDelegate#getDelegateOperation <em>Delegate Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Operation</em>' reference.
	 * @see #getDelegateOperation()
	 * @generated
	 */
	void setDelegateOperation(DslServiceOperation value);

} // DslResourceOperationDelegate
