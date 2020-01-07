/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ebnf Suffix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.EbnfSuffix#getOperator <em>Operator</em>}</li>
 *   <li>{@link antlr4.EbnfSuffix#getNongreedy <em>Nongreedy</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getEbnfSuffix()
 * @model
 * @generated
 */
public interface EbnfSuffix extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see antlr4.Antlr4Package#getEbnfSuffix_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link antlr4.EbnfSuffix#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Nongreedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nongreedy</em>' attribute.
	 * @see #setNongreedy(String)
	 * @see antlr4.Antlr4Package#getEbnfSuffix_Nongreedy()
	 * @model
	 * @generated
	 */
	String getNongreedy();

	/**
	 * Sets the value of the '{@link antlr4.EbnfSuffix#getNongreedy <em>Nongreedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nongreedy</em>' attribute.
	 * @see #getNongreedy()
	 * @generated
	 */
	void setNongreedy(String value);

} // EbnfSuffix
