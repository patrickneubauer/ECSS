/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.SetElement#getTokenRef <em>Token Ref</em>}</li>
 *   <li>{@link antlr4.SetElement#getStringLiteral <em>String Literal</em>}</li>
 *   <li>{@link antlr4.SetElement#getRange <em>Range</em>}</li>
 *   <li>{@link antlr4.SetElement#getCharSet <em>Char Set</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getSetElement()
 * @model
 * @generated
 */
public interface SetElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Token Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Ref</em>' attribute.
	 * @see #setTokenRef(String)
	 * @see antlr4.Antlr4Package#getSetElement_TokenRef()
	 * @model
	 * @generated
	 */
	String getTokenRef();

	/**
	 * Sets the value of the '{@link antlr4.SetElement#getTokenRef <em>Token Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Ref</em>' attribute.
	 * @see #getTokenRef()
	 * @generated
	 */
	void setTokenRef(String value);

	/**
	 * Returns the value of the '<em><b>String Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Literal</em>' attribute.
	 * @see #setStringLiteral(String)
	 * @see antlr4.Antlr4Package#getSetElement_StringLiteral()
	 * @model
	 * @generated
	 */
	String getStringLiteral();

	/**
	 * Sets the value of the '{@link antlr4.SetElement#getStringLiteral <em>String Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Literal</em>' attribute.
	 * @see #getStringLiteral()
	 * @generated
	 */
	void setStringLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see antlr4.Antlr4Package#getSetElement_Range()
	 * @model containment="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link antlr4.SetElement#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Char Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Set</em>' attribute.
	 * @see #setCharSet(String)
	 * @see antlr4.Antlr4Package#getSetElement_CharSet()
	 * @model
	 * @generated
	 */
	String getCharSet();

	/**
	 * Sets the value of the '{@link antlr4.SetElement#getCharSet <em>Char Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Set</em>' attribute.
	 * @see #getCharSet()
	 * @generated
	 */
	void setCharSet(String value);

} // SetElement
