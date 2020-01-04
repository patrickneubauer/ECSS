/**
 */
package classDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classDiagram.Relation#getLeftRef <em>Left Ref</em>}</li>
 *   <li>{@link classDiagram.Relation#getRelType <em>Rel Type</em>}</li>
 *   <li>{@link classDiagram.Relation#getRightRef <em>Right Ref</em>}</li>
 * </ul>
 *
 * @see classDiagram.ClassDiagramPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends Element {
	/**
	 * Returns the value of the '<em><b>Left Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Ref</em>' reference.
	 * @see #setLeftRef(Node)
	 * @see classDiagram.ClassDiagramPackage#getRelation_LeftRef()
	 * @model
	 * @generated
	 */
	Node getLeftRef();

	/**
	 * Sets the value of the '{@link classDiagram.Relation#getLeftRef <em>Left Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Ref</em>' reference.
	 * @see #getLeftRef()
	 * @generated
	 */
	void setLeftRef(Node value);

	/**
	 * Returns the value of the '<em><b>Rel Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Type</em>' containment reference.
	 * @see #setRelType(RelationParse)
	 * @see classDiagram.ClassDiagramPackage#getRelation_RelType()
	 * @model containment="true"
	 * @generated
	 */
	RelationParse getRelType();

	/**
	 * Sets the value of the '{@link classDiagram.Relation#getRelType <em>Rel Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Type</em>' containment reference.
	 * @see #getRelType()
	 * @generated
	 */
	void setRelType(RelationParse value);

	/**
	 * Returns the value of the '<em><b>Right Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Ref</em>' reference.
	 * @see #setRightRef(Node)
	 * @see classDiagram.ClassDiagramPackage#getRelation_RightRef()
	 * @model
	 * @generated
	 */
	Node getRightRef();

	/**
	 * Sets the value of the '{@link classDiagram.Relation#getRightRef <em>Right Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Ref</em>' reference.
	 * @see #getRightRef()
	 * @generated
	 */
	void setRightRef(Node value);

} // Relation
