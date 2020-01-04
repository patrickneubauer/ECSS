/**
 */
package wML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Define</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wML.WMLMacroDefine#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link wML.WMLMacroDefine#getEndName <em>End Name</em>}</li>
 * </ul>
 *
 * @see wML.WMLPackage#getWMLMacroDefine()
 * @model
 * @generated
 */
public interface WMLMacroDefine extends WMLRootExpression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link wML.WMLValuedExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see wML.WMLPackage#getWMLMacroDefine_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMLValuedExpression> getExpressions();

	/**
	 * Returns the value of the '<em><b>End Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Name</em>' attribute.
	 * @see #setEndName(String)
	 * @see wML.WMLPackage#getWMLMacroDefine_EndName()
	 * @model
	 * @generated
	 */
	String getEndName();

	/**
	 * Sets the value of the '{@link wML.WMLMacroDefine#getEndName <em>End Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Name</em>' attribute.
	 * @see #getEndName()
	 * @generated
	 */
	void setEndName(String value);

} // WMLMacroDefine
