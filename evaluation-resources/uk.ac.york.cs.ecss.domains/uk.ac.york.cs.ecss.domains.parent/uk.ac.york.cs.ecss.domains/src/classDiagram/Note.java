/**
 */
package classDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classDiagram.Note#getPosition <em>Position</em>}</li>
 *   <li>{@link classDiagram.Note#getValue <em>Value</em>}</li>
 *   <li>{@link classDiagram.Note#getOf <em>Of</em>}</li>
 * </ul>
 *
 * @see classDiagram.ClassDiagramPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends Node {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link classDiagram.NotePosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see classDiagram.NotePosition
	 * @see #setPosition(NotePosition)
	 * @see classDiagram.ClassDiagramPackage#getNote_Position()
	 * @model
	 * @generated
	 */
	NotePosition getPosition();

	/**
	 * Sets the value of the '{@link classDiagram.Note#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see classDiagram.NotePosition
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(NotePosition value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see classDiagram.ClassDiagramPackage#getNote_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link classDiagram.Note#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of</em>' reference.
	 * @see #setOf(Entity)
	 * @see classDiagram.ClassDiagramPackage#getNote_Of()
	 * @model
	 * @generated
	 */
	Entity getOf();

	/**
	 * Sets the value of the '{@link classDiagram.Note#getOf <em>Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of</em>' reference.
	 * @see #getOf()
	 * @generated
	 */
	void setOf(Entity value);

} // Note
