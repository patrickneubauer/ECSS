/**
 */
package wollokDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WParameter#isVarArg <em>Var Arg</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWParameter()
 * @model
 * @generated
 */
public interface WParameter extends WReferenciable {
	/**
	 * Returns the value of the '<em><b>Var Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Arg</em>' attribute.
	 * @see #setVarArg(boolean)
	 * @see wollokDsl.WollokDslPackage#getWParameter_VarArg()
	 * @model
	 * @generated
	 */
	boolean isVarArg();

	/**
	 * Sets the value of the '{@link wollokDsl.WParameter#isVarArg <em>Var Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Arg</em>' attribute.
	 * @see #isVarArg()
	 * @generated
	 */
	void setVarArg(boolean value);

} // WParameter
