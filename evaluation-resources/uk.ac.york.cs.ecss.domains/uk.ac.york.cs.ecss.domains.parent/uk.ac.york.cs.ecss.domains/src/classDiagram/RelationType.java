/**
 */
package classDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classDiagram.RelationType#isStrong <em>Strong</em>}</li>
 *   <li>{@link classDiagram.RelationType#isWeak <em>Weak</em>}</li>
 * </ul>
 *
 * @see classDiagram.ClassDiagramPackage#getRelationType()
 * @model
 * @generated
 */
public interface RelationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Strong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' attribute.
	 * @see #setStrong(boolean)
	 * @see classDiagram.ClassDiagramPackage#getRelationType_Strong()
	 * @model
	 * @generated
	 */
	boolean isStrong();

	/**
	 * Sets the value of the '{@link classDiagram.RelationType#isStrong <em>Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strong</em>' attribute.
	 * @see #isStrong()
	 * @generated
	 */
	void setStrong(boolean value);

	/**
	 * Returns the value of the '<em><b>Weak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weak</em>' attribute.
	 * @see #setWeak(boolean)
	 * @see classDiagram.ClassDiagramPackage#getRelationType_Weak()
	 * @model
	 * @generated
	 */
	boolean isWeak();

	/**
	 * Sets the value of the '{@link classDiagram.RelationType#isWeak <em>Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weak</em>' attribute.
	 * @see #isWeak()
	 * @generated
	 */
	void setWeak(boolean value);

} // RelationType
