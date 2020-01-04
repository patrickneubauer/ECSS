/**
 */
package classDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classDiagram.DataType#getNative <em>Native</em>}</li>
 *   <li>{@link classDiagram.DataType#getEntity <em>Entity</em>}</li>
 *   <li>{@link classDiagram.DataType#isIsArray <em>Is Array</em>}</li>
 * </ul>
 *
 * @see classDiagram.ClassDiagramPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Native</b></em>' attribute.
	 * The literals are from the enumeration {@link classDiagram.NativeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native</em>' attribute.
	 * @see classDiagram.NativeType
	 * @see #setNative(NativeType)
	 * @see classDiagram.ClassDiagramPackage#getDataType_Native()
	 * @model
	 * @generated
	 */
	NativeType getNative();

	/**
	 * Sets the value of the '{@link classDiagram.DataType#getNative <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native</em>' attribute.
	 * @see classDiagram.NativeType
	 * @see #getNative()
	 * @generated
	 */
	void setNative(NativeType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see classDiagram.ClassDiagramPackage#getDataType_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link classDiagram.DataType#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Array</em>' attribute.
	 * @see #setIsArray(boolean)
	 * @see classDiagram.ClassDiagramPackage#getDataType_IsArray()
	 * @model
	 * @generated
	 */
	boolean isIsArray();

	/**
	 * Sets the value of the '{@link classDiagram.DataType#isIsArray <em>Is Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Array</em>' attribute.
	 * @see #isIsArray()
	 * @generated
	 */
	void setIsArray(boolean value);

} // DataType
