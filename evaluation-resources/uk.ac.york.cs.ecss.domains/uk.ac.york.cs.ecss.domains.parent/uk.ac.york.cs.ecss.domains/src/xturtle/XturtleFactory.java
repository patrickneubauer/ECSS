/**
 */
package xturtle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xturtle.XturtlePackage
 * @generated
 */
public interface XturtleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XturtleFactory eINSTANCE = xturtle.impl.XturtleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Directive Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directive Block</em>'.
	 * @generated
	 */
	DirectiveBlock createDirectiveBlock();

	/**
	 * Returns a new object of class '<em>Directives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directives</em>'.
	 * @generated
	 */
	Directives createDirectives();

	/**
	 * Returns a new object of class '<em>Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directive</em>'.
	 * @generated
	 */
	Directive createDirective();

	/**
	 * Returns a new object of class '<em>Prefix Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prefix Id</em>'.
	 * @generated
	 */
	PrefixId createPrefixId();

	/**
	 * Returns a new object of class '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base</em>'.
	 * @generated
	 */
	Base createBase();

	/**
	 * Returns a new object of class '<em>Triples</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triples</em>'.
	 * @generated
	 */
	Triples createTriples();

	/**
	 * Returns a new object of class '<em>Predicate Object List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Object List</em>'.
	 * @generated
	 */
	PredicateObjectList createPredicateObjectList();

	/**
	 * Returns a new object of class '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subject</em>'.
	 * @generated
	 */
	Subject createSubject();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate</em>'.
	 * @generated
	 */
	Predicate createPredicate();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Resource Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Ref</em>'.
	 * @generated
	 */
	ResourceRef createResourceRef();

	/**
	 * Returns a new object of class '<em>Blank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blank</em>'.
	 * @generated
	 */
	Blank createBlank();

	/**
	 * Returns a new object of class '<em>Blank Objects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blank Objects</em>'.
	 * @generated
	 */
	BlankObjects createBlankObjects();

	/**
	 * Returns a new object of class '<em>Blank Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blank Collection</em>'.
	 * @generated
	 */
	BlankCollection createBlankCollection();

	/**
	 * Returns a new object of class '<em>QName Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QName Def</em>'.
	 * @generated
	 */
	QNameDef createQNameDef();

	/**
	 * Returns a new object of class '<em>QName Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QName Ref</em>'.
	 * @generated
	 */
	QNameRef createQNameRef();

	/**
	 * Returns a new object of class '<em>Uri Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uri Def</em>'.
	 * @generated
	 */
	UriDef createUriDef();

	/**
	 * Returns a new object of class '<em>Uri Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uri Ref</em>'.
	 * @generated
	 */
	UriRef createUriRef();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Literal</em>'.
	 * @generated
	 */
	NumberLiteral createNumberLiteral();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Type Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Predicate</em>'.
	 * @generated
	 */
	TypePredicate createTypePredicate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XturtlePackage getXturtlePackage();

} //XturtleFactory
