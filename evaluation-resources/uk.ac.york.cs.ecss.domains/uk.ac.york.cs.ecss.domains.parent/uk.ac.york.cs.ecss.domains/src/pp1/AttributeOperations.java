/**
 */
package pp1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Operations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pp1.AttributeOperations#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see pp1.Pp1Package#getAttributeOperations()
 * @model
 * @generated
 */
public interface AttributeOperations extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link pp1.AttributeOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see pp1.Pp1Package#getAttributeOperations_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeOperation> getAttributes();

} // AttributeOperations
