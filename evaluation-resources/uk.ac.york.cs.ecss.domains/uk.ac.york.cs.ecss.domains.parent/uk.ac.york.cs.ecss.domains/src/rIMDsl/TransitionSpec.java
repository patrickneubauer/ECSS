/**
 */
package rIMDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.TransitionSpec#getEval <em>Eval</em>}</li>
 *   <li>{@link rIMDsl.TransitionSpec#getUriLinks <em>Uri Links</em>}</li>
 *   <li>{@link rIMDsl.TransitionSpec#getTitle <em>Title</em>}</li>
 *   <li>{@link rIMDsl.TransitionSpec#getId <em>Id</em>}</li>
 *   <li>{@link rIMDsl.TransitionSpec#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getTransitionSpec()
 * @model
 * @generated
 */
public interface TransitionSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Eval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eval</em>' containment reference.
	 * @see #setEval(Expression)
	 * @see rIMDsl.RIMDslPackage#getTransitionSpec_Eval()
	 * @model containment="true"
	 * @generated
	 */
	Expression getEval();

	/**
	 * Sets the value of the '{@link rIMDsl.TransitionSpec#getEval <em>Eval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eval</em>' containment reference.
	 * @see #getEval()
	 * @generated
	 */
	void setEval(Expression value);

	/**
	 * Returns the value of the '<em><b>Uri Links</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.UriLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Links</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getTransitionSpec_UriLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<UriLink> getUriLinks();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(Title)
	 * @see rIMDsl.RIMDslPackage#getTransitionSpec_Title()
	 * @model containment="true"
	 * @generated
	 */
	Title getTitle();

	/**
	 * Sets the value of the '{@link rIMDsl.TransitionSpec#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Title value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(LinkId)
	 * @see rIMDsl.RIMDslPackage#getTransitionSpec_Id()
	 * @model containment="true"
	 * @generated
	 */
	LinkId getId();

	/**
	 * Sets the value of the '{@link rIMDsl.TransitionSpec#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(LinkId value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(SourceField)
	 * @see rIMDsl.RIMDslPackage#getTransitionSpec_Field()
	 * @model containment="true"
	 * @generated
	 */
	SourceField getField();

	/**
	 * Sets the value of the '{@link rIMDsl.TransitionSpec#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(SourceField value);

} // TransitionSpec
