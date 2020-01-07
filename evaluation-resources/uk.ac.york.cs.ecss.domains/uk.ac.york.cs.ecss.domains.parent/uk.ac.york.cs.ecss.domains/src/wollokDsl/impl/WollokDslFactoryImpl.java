/**
 */
package wollokDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wollokDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WollokDslFactoryImpl extends EFactoryImpl implements WollokDslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WollokDslFactory init() {
		try {
			WollokDslFactory theWollokDslFactory = (WollokDslFactory)EPackage.Registry.INSTANCE.getEFactory(WollokDslPackage.eNS_URI);
			if (theWollokDslFactory != null) {
				return theWollokDslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WollokDslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WollokDslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WollokDslPackage.WFILE: return createWFile();
			case WollokDslPackage.IMPORT: return createImport();
			case WollokDslPackage.WPROGRAM: return createWProgram();
			case WollokDslPackage.WTEST: return createWTest();
			case WollokDslPackage.WSUITE: return createWSuite();
			case WollokDslPackage.WFIXTURE: return createWFixture();
			case WollokDslPackage.WPACKAGE: return createWPackage();
			case WollokDslPackage.WLIBRARY_ELEMENT: return createWLibraryElement();
			case WollokDslPackage.WNAMED: return createWNamed();
			case WollokDslPackage.WMETHOD_CONTAINER: return createWMethodContainer();
			case WollokDslPackage.WREFERENCIABLE: return createWReferenciable();
			case WollokDslPackage.WEXPRESSION: return createWExpression();
			case WollokDslPackage.WMETHOD_DECLARATION: return createWMethodDeclaration();
			case WollokDslPackage.WPARAMETER: return createWParameter();
			case WollokDslPackage.WVARIABLE: return createWVariable();
			case WollokDslPackage.WFEATURE_CALL: return createWFeatureCall();
			case WollokDslPackage.WVARIABLE_REFERENCE: return createWVariableReference();
			case WollokDslPackage.WIF_EXPRESSION: return createWIfExpression();
			case WollokDslPackage.WCOLLECTION_LITERAL: return createWCollectionLiteral();
			case WollokDslPackage.WLIST_LITERAL: return createWListLiteral();
			case WollokDslPackage.WSET_LITERAL: return createWSetLiteral();
			case WollokDslPackage.WNAMED_OBJECT: return createWNamedObject();
			case WollokDslPackage.WCAN_EXTEND_CLASS: return createWCanExtendClass();
			case WollokDslPackage.WCLASS: return createWClass();
			case WollokDslPackage.WMIXIN: return createWMixin();
			case WollokDslPackage.WMEMBER: return createWMember();
			case WollokDslPackage.WCONSTRUCTOR: return createWConstructor();
			case WollokDslPackage.WDELEGATING_CONSTRUCTOR_CALL: return createWDelegatingConstructorCall();
			case WollokDslPackage.WSELF_DELEGATING_CONSTRUCTOR_CALL: return createWSelfDelegatingConstructorCall();
			case WollokDslPackage.WSUPER_DELEGATING_CONSTRUCTOR_CALL: return createWSuperDelegatingConstructorCall();
			case WollokDslPackage.WCONSTRUCTOR_CALL: return createWConstructorCall();
			case WollokDslPackage.WARGUMENT_LIST: return createWArgumentList();
			case WollokDslPackage.WNAMED_ARGUMENTS_LIST: return createWNamedArgumentsList();
			case WollokDslPackage.WPOSITIONAL_ARGUMENTS_LIST: return createWPositionalArgumentsList();
			case WollokDslPackage.WINITIALIZER: return createWInitializer();
			case WollokDslPackage.WTRY: return createWTry();
			case WollokDslPackage.WCATCH: return createWCatch();
			case WollokDslPackage.WRETURN_EXPRESSION: return createWReturnExpression();
			case WollokDslPackage.WTHROW: return createWThrow();
			case WollokDslPackage.WOBJECT_LITERAL: return createWObjectLiteral();
			case WollokDslPackage.WVARIABLE_DECLARATION: return createWVariableDeclaration();
			case WollokDslPackage.WASSIGNMENT: return createWAssignment();
			case WollokDslPackage.WBINARY_OPERATION: return createWBinaryOperation();
			case WollokDslPackage.WUNARY_OPERATION: return createWUnaryOperation();
			case WollokDslPackage.WPOSTFIX_OPERATION: return createWPostfixOperation();
			case WollokDslPackage.WMEMBER_FEATURE_CALL: return createWMemberFeatureCall();
			case WollokDslPackage.WSELF: return createWSelf();
			case WollokDslPackage.WSUPER_INVOCATION: return createWSuperInvocation();
			case WollokDslPackage.WBLOCK_EXPRESSION: return createWBlockExpression();
			case WollokDslPackage.WBOOLEAN_LITERAL: return createWBooleanLiteral();
			case WollokDslPackage.WNULL_LITERAL: return createWNullLiteral();
			case WollokDslPackage.WSTRING_LITERAL: return createWStringLiteral();
			case WollokDslPackage.WNUMBER_LITERAL: return createWNumberLiteral();
			case WollokDslPackage.WCLOSURE: return createWClosure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WFile createWFile() {
		WFileImpl wFile = new WFileImpl();
		return wFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WProgram createWProgram() {
		WProgramImpl wProgram = new WProgramImpl();
		return wProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WTest createWTest() {
		WTestImpl wTest = new WTestImpl();
		return wTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WSuite createWSuite() {
		WSuiteImpl wSuite = new WSuiteImpl();
		return wSuite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WFixture createWFixture() {
		WFixtureImpl wFixture = new WFixtureImpl();
		return wFixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WPackage createWPackage() {
		WPackageImpl wPackage = new WPackageImpl();
		return wPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WLibraryElement createWLibraryElement() {
		WLibraryElementImpl wLibraryElement = new WLibraryElementImpl();
		return wLibraryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WNamed createWNamed() {
		WNamedImpl wNamed = new WNamedImpl();
		return wNamed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMethodContainer createWMethodContainer() {
		WMethodContainerImpl wMethodContainer = new WMethodContainerImpl();
		return wMethodContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WReferenciable createWReferenciable() {
		WReferenciableImpl wReferenciable = new WReferenciableImpl();
		return wReferenciable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WExpression createWExpression() {
		WExpressionImpl wExpression = new WExpressionImpl();
		return wExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMethodDeclaration createWMethodDeclaration() {
		WMethodDeclarationImpl wMethodDeclaration = new WMethodDeclarationImpl();
		return wMethodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WParameter createWParameter() {
		WParameterImpl wParameter = new WParameterImpl();
		return wParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WVariable createWVariable() {
		WVariableImpl wVariable = new WVariableImpl();
		return wVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WFeatureCall createWFeatureCall() {
		WFeatureCallImpl wFeatureCall = new WFeatureCallImpl();
		return wFeatureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WVariableReference createWVariableReference() {
		WVariableReferenceImpl wVariableReference = new WVariableReferenceImpl();
		return wVariableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WIfExpression createWIfExpression() {
		WIfExpressionImpl wIfExpression = new WIfExpressionImpl();
		return wIfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WCollectionLiteral createWCollectionLiteral() {
		WCollectionLiteralImpl wCollectionLiteral = new WCollectionLiteralImpl();
		return wCollectionLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WListLiteral createWListLiteral() {
		WListLiteralImpl wListLiteral = new WListLiteralImpl();
		return wListLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WSetLiteral createWSetLiteral() {
		WSetLiteralImpl wSetLiteral = new WSetLiteralImpl();
		return wSetLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WNamedObject createWNamedObject() {
		WNamedObjectImpl wNamedObject = new WNamedObjectImpl();
		return wNamedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WCanExtendClass createWCanExtendClass() {
		WCanExtendClassImpl wCanExtendClass = new WCanExtendClassImpl();
		return wCanExtendClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WClass createWClass() {
		WClassImpl wClass = new WClassImpl();
		return wClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMixin createWMixin() {
		WMixinImpl wMixin = new WMixinImpl();
		return wMixin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMember createWMember() {
		WMemberImpl wMember = new WMemberImpl();
		return wMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WConstructor createWConstructor() {
		WConstructorImpl wConstructor = new WConstructorImpl();
		return wConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WDelegatingConstructorCall createWDelegatingConstructorCall() {
		WDelegatingConstructorCallImpl wDelegatingConstructorCall = new WDelegatingConstructorCallImpl();
		return wDelegatingConstructorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WSelfDelegatingConstructorCall createWSelfDelegatingConstructorCall() {
		WSelfDelegatingConstructorCallImpl wSelfDelegatingConstructorCall = new WSelfDelegatingConstructorCallImpl();
		return wSelfDelegatingConstructorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WSuperDelegatingConstructorCall createWSuperDelegatingConstructorCall() {
		WSuperDelegatingConstructorCallImpl wSuperDelegatingConstructorCall = new WSuperDelegatingConstructorCallImpl();
		return wSuperDelegatingConstructorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WConstructorCall createWConstructorCall() {
		WConstructorCallImpl wConstructorCall = new WConstructorCallImpl();
		return wConstructorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WArgumentList createWArgumentList() {
		WArgumentListImpl wArgumentList = new WArgumentListImpl();
		return wArgumentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WNamedArgumentsList createWNamedArgumentsList() {
		WNamedArgumentsListImpl wNamedArgumentsList = new WNamedArgumentsListImpl();
		return wNamedArgumentsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WPositionalArgumentsList createWPositionalArgumentsList() {
		WPositionalArgumentsListImpl wPositionalArgumentsList = new WPositionalArgumentsListImpl();
		return wPositionalArgumentsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WInitializer createWInitializer() {
		WInitializerImpl wInitializer = new WInitializerImpl();
		return wInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WTry createWTry() {
		WTryImpl wTry = new WTryImpl();
		return wTry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WCatch createWCatch() {
		WCatchImpl wCatch = new WCatchImpl();
		return wCatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WReturnExpression createWReturnExpression() {
		WReturnExpressionImpl wReturnExpression = new WReturnExpressionImpl();
		return wReturnExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WThrow createWThrow() {
		WThrowImpl wThrow = new WThrowImpl();
		return wThrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WObjectLiteral createWObjectLiteral() {
		WObjectLiteralImpl wObjectLiteral = new WObjectLiteralImpl();
		return wObjectLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WVariableDeclaration createWVariableDeclaration() {
		WVariableDeclarationImpl wVariableDeclaration = new WVariableDeclarationImpl();
		return wVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WAssignment createWAssignment() {
		WAssignmentImpl wAssignment = new WAssignmentImpl();
		return wAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WBinaryOperation createWBinaryOperation() {
		WBinaryOperationImpl wBinaryOperation = new WBinaryOperationImpl();
		return wBinaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WUnaryOperation createWUnaryOperation() {
		WUnaryOperationImpl wUnaryOperation = new WUnaryOperationImpl();
		return wUnaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WPostfixOperation createWPostfixOperation() {
		WPostfixOperationImpl wPostfixOperation = new WPostfixOperationImpl();
		return wPostfixOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMemberFeatureCall createWMemberFeatureCall() {
		WMemberFeatureCallImpl wMemberFeatureCall = new WMemberFeatureCallImpl();
		return wMemberFeatureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WSelf createWSelf() {
		WSelfImpl wSelf = new WSelfImpl();
		return wSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WSuperInvocation createWSuperInvocation() {
		WSuperInvocationImpl wSuperInvocation = new WSuperInvocationImpl();
		return wSuperInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WBlockExpression createWBlockExpression() {
		WBlockExpressionImpl wBlockExpression = new WBlockExpressionImpl();
		return wBlockExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WBooleanLiteral createWBooleanLiteral() {
		WBooleanLiteralImpl wBooleanLiteral = new WBooleanLiteralImpl();
		return wBooleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WNullLiteral createWNullLiteral() {
		WNullLiteralImpl wNullLiteral = new WNullLiteralImpl();
		return wNullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WStringLiteral createWStringLiteral() {
		WStringLiteralImpl wStringLiteral = new WStringLiteralImpl();
		return wStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WNumberLiteral createWNumberLiteral() {
		WNumberLiteralImpl wNumberLiteral = new WNumberLiteralImpl();
		return wNumberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WClosure createWClosure() {
		WClosureImpl wClosure = new WClosureImpl();
		return wClosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WollokDslPackage getWollokDslPackage() {
		return (WollokDslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WollokDslPackage getPackage() {
		return WollokDslPackage.eINSTANCE;
	}

} //WollokDslFactoryImpl
