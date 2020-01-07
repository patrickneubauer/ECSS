/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WConstructor Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WConstructorCall#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link wollokDsl.WConstructorCall#getArgumentList <em>Argument List</em>}</li>
 *   <li>{@link wollokDsl.WConstructorCall#getMixins <em>Mixins</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWConstructorCall()
 * @model
 * @generated
 */
public interface WConstructorCall extends WExpression {
	/**
	 * Returns the value of the '<em><b>Class Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Ref</em>' reference.
	 * @see #setClassRef(WClass)
	 * @see wollokDsl.WollokDslPackage#getWConstructorCall_ClassRef()
	 * @model
	 * @generated
	 */
	WClass getClassRef();

	/**
	 * Sets the value of the '{@link wollokDsl.WConstructorCall#getClassRef <em>Class Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Ref</em>' reference.
	 * @see #getClassRef()
	 * @generated
	 */
	void setClassRef(WClass value);

	/**
	 * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument List</em>' containment reference.
	 * @see #setArgumentList(WArgumentList)
	 * @see wollokDsl.WollokDslPackage#getWConstructorCall_ArgumentList()
	 * @model containment="true"
	 * @generated
	 */
	WArgumentList getArgumentList();

	/**
	 * Sets the value of the '{@link wollokDsl.WConstructorCall#getArgumentList <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument List</em>' containment reference.
	 * @see #getArgumentList()
	 * @generated
	 */
	void setArgumentList(WArgumentList value);

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' reference list.
	 * The list contents are of type {@link wollokDsl.WMixin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' reference list.
	 * @see wollokDsl.WollokDslPackage#getWConstructorCall_Mixins()
	 * @model
	 * @generated
	 */
	EList<WMixin> getMixins();

} // WConstructorCall
