/**
 */
package rIMDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.State#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link rIMDsl.State#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link rIMDsl.State#getName <em>Name</em>}</li>
 *   <li>{@link rIMDsl.State#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link rIMDsl.State#getType <em>Type</em>}</li>
 *   <li>{@link rIMDsl.State#getEntity <em>Entity</em>}</li>
 *   <li>{@link rIMDsl.State#getImpl <em>Impl</em>}</li>
 *   <li>{@link rIMDsl.State#getRelations <em>Relations</em>}</li>
 *   <li>{@link rIMDsl.State#getPath <em>Path</em>}</li>
 *   <li>{@link rIMDsl.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link rIMDsl.State#getErrorState <em>Error State</em>}</li>
 *   <li>{@link rIMDsl.State#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see rIMDsl.RIMDslPackage#getState_IsInitial()
	 * @model
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link rIMDsl.State#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exception</em>' attribute.
	 * @see #setIsException(boolean)
	 * @see rIMDsl.RIMDslPackage#getState_IsException()
	 * @model
	 * @generated
	 */
	boolean isIsException();

	/**
	 * Sets the value of the '{@link rIMDsl.State#isIsException <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exception</em>' attribute.
	 * @see #isIsException()
	 * @generated
	 */
	void setIsException(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rIMDsl.RIMDslPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rIMDsl.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.MdfAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getState_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<MdfAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ResourceType)
	 * @see rIMDsl.RIMDslPackage#getState_Type()
	 * @model containment="true"
	 * @generated
	 */
	ResourceType getType();

	/**
	 * Sets the value of the '{@link rIMDsl.State#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(Entity)
	 * @see rIMDsl.RIMDslPackage#getState_Entity()
	 * @model containment="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link rIMDsl.State#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Impl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl</em>' containment reference.
	 * @see #setImpl(ImplRef)
	 * @see rIMDsl.RIMDslPackage#getState_Impl()
	 * @model containment="true"
	 * @generated
	 */
	ImplRef getImpl();

	/**
	 * Sets the value of the '{@link rIMDsl.State#getImpl <em>Impl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl</em>' containment reference.
	 * @see #getImpl()
	 * @generated
	 */
	void setImpl(ImplRef value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.RelationRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getState_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationRef> getRelations();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Path)
	 * @see rIMDsl.RIMDslPackage#getState_Path()
	 * @model containment="true"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link rIMDsl.State#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.TransitionRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getState_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransitionRef> getTransitions();

	/**
	 * Returns the value of the '<em><b>Error State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error State</em>' reference.
	 * @see #setErrorState(State)
	 * @see rIMDsl.RIMDslPackage#getState_ErrorState()
	 * @model
	 * @generated
	 */
	State getErrorState();

	/**
	 * Sets the value of the '{@link rIMDsl.State#getErrorState <em>Error State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error State</em>' reference.
	 * @see #getErrorState()
	 * @generated
	 */
	void setErrorState(State value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' attribute.
	 * @see #setCache(int)
	 * @see rIMDsl.RIMDslPackage#getState_Cache()
	 * @model
	 * @generated
	 */
	int getCache();

	/**
	 * Sets the value of the '{@link rIMDsl.State#getCache <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' attribute.
	 * @see #getCache()
	 * @generated
	 */
	void setCache(int value);

} // State
