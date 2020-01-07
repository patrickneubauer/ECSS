/**
 */
package xturtle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directive Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xturtle.DirectiveBlock#getDirectives <em>Directives</em>}</li>
 *   <li>{@link xturtle.DirectiveBlock#getTriples <em>Triples</em>}</li>
 *   <li>{@link xturtle.DirectiveBlock#getDirectiveblock <em>Directiveblock</em>}</li>
 * </ul>
 *
 * @see xturtle.XturtlePackage#getDirectiveBlock()
 * @model
 * @generated
 */
public interface DirectiveBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directives</em>' containment reference.
	 * @see #setDirectives(Directives)
	 * @see xturtle.XturtlePackage#getDirectiveBlock_Directives()
	 * @model containment="true"
	 * @generated
	 */
	Directives getDirectives();

	/**
	 * Sets the value of the '{@link xturtle.DirectiveBlock#getDirectives <em>Directives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directives</em>' containment reference.
	 * @see #getDirectives()
	 * @generated
	 */
	void setDirectives(Directives value);

	/**
	 * Returns the value of the '<em><b>Triples</b></em>' containment reference list.
	 * The list contents are of type {@link xturtle.Triples}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triples</em>' containment reference list.
	 * @see xturtle.XturtlePackage#getDirectiveBlock_Triples()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triples> getTriples();

	/**
	 * Returns the value of the '<em><b>Directiveblock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directiveblock</em>' containment reference.
	 * @see #setDirectiveblock(DirectiveBlock)
	 * @see xturtle.XturtlePackage#getDirectiveBlock_Directiveblock()
	 * @model containment="true"
	 * @generated
	 */
	DirectiveBlock getDirectiveblock();

	/**
	 * Sets the value of the '{@link xturtle.DirectiveBlock#getDirectiveblock <em>Directiveblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directiveblock</em>' containment reference.
	 * @see #getDirectiveblock()
	 * @generated
	 */
	void setDirectiveblock(DirectiveBlock value);

} // DirectiveBlock
