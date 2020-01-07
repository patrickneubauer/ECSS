/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Alt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.LabeledAlt#getBody <em>Body</em>}</li>
 *   <li>{@link antlr4.LabeledAlt#getPoundSymbol <em>Pound Symbol</em>}</li>
 *   <li>{@link antlr4.LabeledAlt#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getLabeledAlt()
 * @model
 * @generated
 */
public interface LabeledAlt extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Alternative)
	 * @see antlr4.Antlr4Package#getLabeledAlt_Body()
	 * @model containment="true"
	 * @generated
	 */
	Alternative getBody();

	/**
	 * Sets the value of the '{@link antlr4.LabeledAlt#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Alternative value);

	/**
	 * Returns the value of the '<em><b>Pound Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pound Symbol</em>' attribute.
	 * @see #setPoundSymbol(String)
	 * @see antlr4.Antlr4Package#getLabeledAlt_PoundSymbol()
	 * @model
	 * @generated
	 */
	String getPoundSymbol();

	/**
	 * Sets the value of the '{@link antlr4.LabeledAlt#getPoundSymbol <em>Pound Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pound Symbol</em>' attribute.
	 * @see #getPoundSymbol()
	 * @generated
	 */
	void setPoundSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see antlr4.Antlr4Package#getLabeledAlt_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link antlr4.LabeledAlt#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // LabeledAlt
