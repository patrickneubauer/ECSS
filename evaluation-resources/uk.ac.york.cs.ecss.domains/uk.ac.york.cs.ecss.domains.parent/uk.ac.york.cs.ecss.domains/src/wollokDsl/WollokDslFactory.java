/**
 */
package wollokDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see wollokDsl.WollokDslPackage
 * @generated
 */
public interface WollokDslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WollokDslFactory eINSTANCE = wollokDsl.impl.WollokDslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>WFile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WFile</em>'.
	 * @generated
	 */
	WFile createWFile();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>WProgram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WProgram</em>'.
	 * @generated
	 */
	WProgram createWProgram();

	/**
	 * Returns a new object of class '<em>WTest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WTest</em>'.
	 * @generated
	 */
	WTest createWTest();

	/**
	 * Returns a new object of class '<em>WSuite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSuite</em>'.
	 * @generated
	 */
	WSuite createWSuite();

	/**
	 * Returns a new object of class '<em>WFixture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WFixture</em>'.
	 * @generated
	 */
	WFixture createWFixture();

	/**
	 * Returns a new object of class '<em>WPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WPackage</em>'.
	 * @generated
	 */
	WPackage createWPackage();

	/**
	 * Returns a new object of class '<em>WLibrary Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WLibrary Element</em>'.
	 * @generated
	 */
	WLibraryElement createWLibraryElement();

	/**
	 * Returns a new object of class '<em>WNamed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WNamed</em>'.
	 * @generated
	 */
	WNamed createWNamed();

	/**
	 * Returns a new object of class '<em>WMethod Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WMethod Container</em>'.
	 * @generated
	 */
	WMethodContainer createWMethodContainer();

	/**
	 * Returns a new object of class '<em>WReferenciable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WReferenciable</em>'.
	 * @generated
	 */
	WReferenciable createWReferenciable();

	/**
	 * Returns a new object of class '<em>WExpression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WExpression</em>'.
	 * @generated
	 */
	WExpression createWExpression();

	/**
	 * Returns a new object of class '<em>WMethod Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WMethod Declaration</em>'.
	 * @generated
	 */
	WMethodDeclaration createWMethodDeclaration();

	/**
	 * Returns a new object of class '<em>WParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WParameter</em>'.
	 * @generated
	 */
	WParameter createWParameter();

	/**
	 * Returns a new object of class '<em>WVariable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WVariable</em>'.
	 * @generated
	 */
	WVariable createWVariable();

	/**
	 * Returns a new object of class '<em>WFeature Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WFeature Call</em>'.
	 * @generated
	 */
	WFeatureCall createWFeatureCall();

	/**
	 * Returns a new object of class '<em>WVariable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WVariable Reference</em>'.
	 * @generated
	 */
	WVariableReference createWVariableReference();

	/**
	 * Returns a new object of class '<em>WIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WIf Expression</em>'.
	 * @generated
	 */
	WIfExpression createWIfExpression();

	/**
	 * Returns a new object of class '<em>WCollection Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WCollection Literal</em>'.
	 * @generated
	 */
	WCollectionLiteral createWCollectionLiteral();

	/**
	 * Returns a new object of class '<em>WList Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WList Literal</em>'.
	 * @generated
	 */
	WListLiteral createWListLiteral();

	/**
	 * Returns a new object of class '<em>WSet Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSet Literal</em>'.
	 * @generated
	 */
	WSetLiteral createWSetLiteral();

	/**
	 * Returns a new object of class '<em>WNamed Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WNamed Object</em>'.
	 * @generated
	 */
	WNamedObject createWNamedObject();

	/**
	 * Returns a new object of class '<em>WCan Extend Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WCan Extend Class</em>'.
	 * @generated
	 */
	WCanExtendClass createWCanExtendClass();

	/**
	 * Returns a new object of class '<em>WClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WClass</em>'.
	 * @generated
	 */
	WClass createWClass();

	/**
	 * Returns a new object of class '<em>WMixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WMixin</em>'.
	 * @generated
	 */
	WMixin createWMixin();

	/**
	 * Returns a new object of class '<em>WMember</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WMember</em>'.
	 * @generated
	 */
	WMember createWMember();

	/**
	 * Returns a new object of class '<em>WConstructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WConstructor</em>'.
	 * @generated
	 */
	WConstructor createWConstructor();

	/**
	 * Returns a new object of class '<em>WDelegating Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WDelegating Constructor Call</em>'.
	 * @generated
	 */
	WDelegatingConstructorCall createWDelegatingConstructorCall();

	/**
	 * Returns a new object of class '<em>WSelf Delegating Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSelf Delegating Constructor Call</em>'.
	 * @generated
	 */
	WSelfDelegatingConstructorCall createWSelfDelegatingConstructorCall();

	/**
	 * Returns a new object of class '<em>WSuper Delegating Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSuper Delegating Constructor Call</em>'.
	 * @generated
	 */
	WSuperDelegatingConstructorCall createWSuperDelegatingConstructorCall();

	/**
	 * Returns a new object of class '<em>WConstructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WConstructor Call</em>'.
	 * @generated
	 */
	WConstructorCall createWConstructorCall();

	/**
	 * Returns a new object of class '<em>WArgument List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WArgument List</em>'.
	 * @generated
	 */
	WArgumentList createWArgumentList();

	/**
	 * Returns a new object of class '<em>WNamed Arguments List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WNamed Arguments List</em>'.
	 * @generated
	 */
	WNamedArgumentsList createWNamedArgumentsList();

	/**
	 * Returns a new object of class '<em>WPositional Arguments List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WPositional Arguments List</em>'.
	 * @generated
	 */
	WPositionalArgumentsList createWPositionalArgumentsList();

	/**
	 * Returns a new object of class '<em>WInitializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WInitializer</em>'.
	 * @generated
	 */
	WInitializer createWInitializer();

	/**
	 * Returns a new object of class '<em>WTry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WTry</em>'.
	 * @generated
	 */
	WTry createWTry();

	/**
	 * Returns a new object of class '<em>WCatch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WCatch</em>'.
	 * @generated
	 */
	WCatch createWCatch();

	/**
	 * Returns a new object of class '<em>WReturn Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WReturn Expression</em>'.
	 * @generated
	 */
	WReturnExpression createWReturnExpression();

	/**
	 * Returns a new object of class '<em>WThrow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WThrow</em>'.
	 * @generated
	 */
	WThrow createWThrow();

	/**
	 * Returns a new object of class '<em>WObject Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WObject Literal</em>'.
	 * @generated
	 */
	WObjectLiteral createWObjectLiteral();

	/**
	 * Returns a new object of class '<em>WVariable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WVariable Declaration</em>'.
	 * @generated
	 */
	WVariableDeclaration createWVariableDeclaration();

	/**
	 * Returns a new object of class '<em>WAssignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WAssignment</em>'.
	 * @generated
	 */
	WAssignment createWAssignment();

	/**
	 * Returns a new object of class '<em>WBinary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WBinary Operation</em>'.
	 * @generated
	 */
	WBinaryOperation createWBinaryOperation();

	/**
	 * Returns a new object of class '<em>WUnary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WUnary Operation</em>'.
	 * @generated
	 */
	WUnaryOperation createWUnaryOperation();

	/**
	 * Returns a new object of class '<em>WPostfix Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WPostfix Operation</em>'.
	 * @generated
	 */
	WPostfixOperation createWPostfixOperation();

	/**
	 * Returns a new object of class '<em>WMember Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WMember Feature Call</em>'.
	 * @generated
	 */
	WMemberFeatureCall createWMemberFeatureCall();

	/**
	 * Returns a new object of class '<em>WSelf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSelf</em>'.
	 * @generated
	 */
	WSelf createWSelf();

	/**
	 * Returns a new object of class '<em>WSuper Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSuper Invocation</em>'.
	 * @generated
	 */
	WSuperInvocation createWSuperInvocation();

	/**
	 * Returns a new object of class '<em>WBlock Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WBlock Expression</em>'.
	 * @generated
	 */
	WBlockExpression createWBlockExpression();

	/**
	 * Returns a new object of class '<em>WBoolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WBoolean Literal</em>'.
	 * @generated
	 */
	WBooleanLiteral createWBooleanLiteral();

	/**
	 * Returns a new object of class '<em>WNull Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WNull Literal</em>'.
	 * @generated
	 */
	WNullLiteral createWNullLiteral();

	/**
	 * Returns a new object of class '<em>WString Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WString Literal</em>'.
	 * @generated
	 */
	WStringLiteral createWStringLiteral();

	/**
	 * Returns a new object of class '<em>WNumber Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WNumber Literal</em>'.
	 * @generated
	 */
	WNumberLiteral createWNumberLiteral();

	/**
	 * Returns a new object of class '<em>WClosure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WClosure</em>'.
	 * @generated
	 */
	WClosure createWClosure();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WollokDslPackage getWollokDslPackage();

} //WollokDslFactory
