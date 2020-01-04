/**
 */
package wML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wML.WMLMacroCall#getPoint <em>Point</em>}</li>
 *   <li>{@link wML.WMLMacroCall#getRelative <em>Relative</em>}</li>
 *   <li>{@link wML.WMLMacroCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see wML.WMLPackage#getWMLMacroCall()
 * @model
 * @generated
 */
public interface WMLMacroCall extends WMLKeyValue, WMLMacroCallParameter, WMLRootExpression {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' attribute.
	 * @see #setPoint(String)
	 * @see wML.WMLPackage#getWMLMacroCall_Point()
	 * @model
	 * @generated
	 */
	String getPoint();

	/**
	 * Sets the value of the '{@link wML.WMLMacroCall#getPoint <em>Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' attribute.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(String value);

	/**
	 * Returns the value of the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative</em>' attribute.
	 * @see #setRelative(String)
	 * @see wML.WMLPackage#getWMLMacroCall_Relative()
	 * @model
	 * @generated
	 */
	String getRelative();

	/**
	 * Sets the value of the '{@link wML.WMLMacroCall#getRelative <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative</em>' attribute.
	 * @see #getRelative()
	 * @generated
	 */
	void setRelative(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link wML.WMLMacroCallParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see wML.WMLPackage#getWMLMacroCall_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMLMacroCallParameter> getParameters();

} // WMLMacroCall
