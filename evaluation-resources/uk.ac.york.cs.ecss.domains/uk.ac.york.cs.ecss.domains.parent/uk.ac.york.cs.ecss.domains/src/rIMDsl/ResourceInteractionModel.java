/**
 */
package rIMDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Interaction Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.ResourceInteractionModel#getName <em>Name</em>}</li>
 *   <li>{@link rIMDsl.ResourceInteractionModel#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link rIMDsl.ResourceInteractionModel#getEvents <em>Events</em>}</li>
 *   <li>{@link rIMDsl.ResourceInteractionModel#getCommands <em>Commands</em>}</li>
 *   <li>{@link rIMDsl.ResourceInteractionModel#getBasepath <em>Basepath</em>}</li>
 *   <li>{@link rIMDsl.ResourceInteractionModel#getRelations <em>Relations</em>}</li>
 *   <li>{@link rIMDsl.ResourceInteractionModel#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getResourceInteractionModel()
 * @model
 * @generated
 */
public interface ResourceInteractionModel extends Ref {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rIMDsl.RIMDslPackage#getResourceInteractionModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rIMDsl.ResourceInteractionModel#getName <em>Name</em>}' attribute.
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
	 * @see rIMDsl.RIMDslPackage#getResourceInteractionModel_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<MdfAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getResourceInteractionModel_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getResourceInteractionModel_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Basepath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basepath</em>' containment reference.
	 * @see #setBasepath(BasePath)
	 * @see rIMDsl.RIMDslPackage#getResourceInteractionModel_Basepath()
	 * @model containment="true"
	 * @generated
	 */
	BasePath getBasepath();

	/**
	 * Sets the value of the '{@link rIMDsl.ResourceInteractionModel#getBasepath <em>Basepath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basepath</em>' containment reference.
	 * @see #getBasepath()
	 * @generated
	 */
	void setBasepath(BasePath value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getResourceInteractionModel_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getResourceInteractionModel_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // ResourceInteractionModel
