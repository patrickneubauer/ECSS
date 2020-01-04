/**
 */
package wML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wML.WMLTag#getPlus <em>Plus</em>}</li>
 *   <li>{@link wML.WMLTag#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link wML.WMLTag#getEndName <em>End Name</em>}</li>
 * </ul>
 *
 * @see wML.WMLPackage#getWMLTag()
 * @model
 * @generated
 */
public interface WMLTag extends WMLRootExpression {
	/**
	 * Returns the value of the '<em><b>Plus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plus</em>' attribute.
	 * @see #setPlus(String)
	 * @see wML.WMLPackage#getWMLTag_Plus()
	 * @model
	 * @generated
	 */
	String getPlus();

	/**
	 * Sets the value of the '{@link wML.WMLTag#getPlus <em>Plus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plus</em>' attribute.
	 * @see #getPlus()
	 * @generated
	 */
	void setPlus(String value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link wML.WMLExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see wML.WMLPackage#getWMLTag_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMLExpression> getExpressions();

	/**
	 * Returns the value of the '<em><b>End Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Name</em>' attribute.
	 * @see #setEndName(String)
	 * @see wML.WMLPackage#getWMLTag_EndName()
	 * @model
	 * @generated
	 */
	String getEndName();

	/**
	 * Sets the value of the '{@link wML.WMLTag#getEndName <em>End Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Name</em>' attribute.
	 * @see #getEndName()
	 * @generated
	 */
	void setEndName(String value);

} // WMLTag
