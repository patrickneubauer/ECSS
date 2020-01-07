/**
 */
package wollokDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import wollokDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see wollokDsl.WollokDslPackage
 * @generated
 */
public class WollokDslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WollokDslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WollokDslSwitch() {
		if (modelPackage == null) {
			modelPackage = WollokDslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WollokDslPackage.WFILE: {
				WFile wFile = (WFile)theEObject;
				T result = caseWFile(wFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WPROGRAM: {
				WProgram wProgram = (WProgram)theEObject;
				T result = caseWProgram(wProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WTEST: {
				WTest wTest = (WTest)theEObject;
				T result = caseWTest(wTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WSUITE: {
				WSuite wSuite = (WSuite)theEObject;
				T result = caseWSuite(wSuite);
				if (result == null) result = caseWMethodContainer(wSuite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WFIXTURE: {
				WFixture wFixture = (WFixture)theEObject;
				T result = caseWFixture(wFixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WPACKAGE: {
				WPackage wPackage = (WPackage)theEObject;
				T result = caseWPackage(wPackage);
				if (result == null) result = caseWLibraryElement(wPackage);
				if (result == null) result = caseWNamed(wPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WLIBRARY_ELEMENT: {
				WLibraryElement wLibraryElement = (WLibraryElement)theEObject;
				T result = caseWLibraryElement(wLibraryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WNAMED: {
				WNamed wNamed = (WNamed)theEObject;
				T result = caseWNamed(wNamed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WMETHOD_CONTAINER: {
				WMethodContainer wMethodContainer = (WMethodContainer)theEObject;
				T result = caseWMethodContainer(wMethodContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WREFERENCIABLE: {
				WReferenciable wReferenciable = (WReferenciable)theEObject;
				T result = caseWReferenciable(wReferenciable);
				if (result == null) result = caseWNamed(wReferenciable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WEXPRESSION: {
				WExpression wExpression = (WExpression)theEObject;
				T result = caseWExpression(wExpression);
				if (result == null) result = caseWLibraryElement(wExpression);
				if (result == null) result = caseWFeatureCall(wExpression);
				if (result == null) result = caseWMember(wExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WMETHOD_DECLARATION: {
				WMethodDeclaration wMethodDeclaration = (WMethodDeclaration)theEObject;
				T result = caseWMethodDeclaration(wMethodDeclaration);
				if (result == null) result = caseWNamed(wMethodDeclaration);
				if (result == null) result = caseWMember(wMethodDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WPARAMETER: {
				WParameter wParameter = (WParameter)theEObject;
				T result = caseWParameter(wParameter);
				if (result == null) result = caseWReferenciable(wParameter);
				if (result == null) result = caseWNamed(wParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WVARIABLE: {
				WVariable wVariable = (WVariable)theEObject;
				T result = caseWVariable(wVariable);
				if (result == null) result = caseWReferenciable(wVariable);
				if (result == null) result = caseWNamed(wVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WFEATURE_CALL: {
				WFeatureCall wFeatureCall = (WFeatureCall)theEObject;
				T result = caseWFeatureCall(wFeatureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WVARIABLE_REFERENCE: {
				WVariableReference wVariableReference = (WVariableReference)theEObject;
				T result = caseWVariableReference(wVariableReference);
				if (result == null) result = caseWExpression(wVariableReference);
				if (result == null) result = caseWLibraryElement(wVariableReference);
				if (result == null) result = caseWFeatureCall(wVariableReference);
				if (result == null) result = caseWMember(wVariableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WIF_EXPRESSION: {
				WIfExpression wIfExpression = (WIfExpression)theEObject;
				T result = caseWIfExpression(wIfExpression);
				if (result == null) result = caseWExpression(wIfExpression);
				if (result == null) result = caseWLibraryElement(wIfExpression);
				if (result == null) result = caseWFeatureCall(wIfExpression);
				if (result == null) result = caseWMember(wIfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WCOLLECTION_LITERAL: {
				WCollectionLiteral wCollectionLiteral = (WCollectionLiteral)theEObject;
				T result = caseWCollectionLiteral(wCollectionLiteral);
				if (result == null) result = caseWExpression(wCollectionLiteral);
				if (result == null) result = caseWLibraryElement(wCollectionLiteral);
				if (result == null) result = caseWFeatureCall(wCollectionLiteral);
				if (result == null) result = caseWMember(wCollectionLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WLIST_LITERAL: {
				WListLiteral wListLiteral = (WListLiteral)theEObject;
				T result = caseWListLiteral(wListLiteral);
				if (result == null) result = caseWCollectionLiteral(wListLiteral);
				if (result == null) result = caseWExpression(wListLiteral);
				if (result == null) result = caseWLibraryElement(wListLiteral);
				if (result == null) result = caseWFeatureCall(wListLiteral);
				if (result == null) result = caseWMember(wListLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WSET_LITERAL: {
				WSetLiteral wSetLiteral = (WSetLiteral)theEObject;
				T result = caseWSetLiteral(wSetLiteral);
				if (result == null) result = caseWCollectionLiteral(wSetLiteral);
				if (result == null) result = caseWExpression(wSetLiteral);
				if (result == null) result = caseWLibraryElement(wSetLiteral);
				if (result == null) result = caseWFeatureCall(wSetLiteral);
				if (result == null) result = caseWMember(wSetLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WNAMED_OBJECT: {
				WNamedObject wNamedObject = (WNamedObject)theEObject;
				T result = caseWNamedObject(wNamedObject);
				if (result == null) result = caseWLibraryElement(wNamedObject);
				if (result == null) result = caseWMethodContainer(wNamedObject);
				if (result == null) result = caseWReferenciable(wNamedObject);
				if (result == null) result = caseWCanExtendClass(wNamedObject);
				if (result == null) result = caseWNamed(wNamedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WCAN_EXTEND_CLASS: {
				WCanExtendClass wCanExtendClass = (WCanExtendClass)theEObject;
				T result = caseWCanExtendClass(wCanExtendClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WCLASS: {
				WClass wClass = (WClass)theEObject;
				T result = caseWClass(wClass);
				if (result == null) result = caseWLibraryElement(wClass);
				if (result == null) result = caseWNamed(wClass);
				if (result == null) result = caseWMethodContainer(wClass);
				if (result == null) result = caseWCanExtendClass(wClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WMIXIN: {
				WMixin wMixin = (WMixin)theEObject;
				T result = caseWMixin(wMixin);
				if (result == null) result = caseWLibraryElement(wMixin);
				if (result == null) result = caseWNamed(wMixin);
				if (result == null) result = caseWMethodContainer(wMixin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WMEMBER: {
				WMember wMember = (WMember)theEObject;
				T result = caseWMember(wMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WCONSTRUCTOR: {
				WConstructor wConstructor = (WConstructor)theEObject;
				T result = caseWConstructor(wConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WDELEGATING_CONSTRUCTOR_CALL: {
				WDelegatingConstructorCall wDelegatingConstructorCall = (WDelegatingConstructorCall)theEObject;
				T result = caseWDelegatingConstructorCall(wDelegatingConstructorCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WSELF_DELEGATING_CONSTRUCTOR_CALL: {
				WSelfDelegatingConstructorCall wSelfDelegatingConstructorCall = (WSelfDelegatingConstructorCall)theEObject;
				T result = caseWSelfDelegatingConstructorCall(wSelfDelegatingConstructorCall);
				if (result == null) result = caseWDelegatingConstructorCall(wSelfDelegatingConstructorCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WSUPER_DELEGATING_CONSTRUCTOR_CALL: {
				WSuperDelegatingConstructorCall wSuperDelegatingConstructorCall = (WSuperDelegatingConstructorCall)theEObject;
				T result = caseWSuperDelegatingConstructorCall(wSuperDelegatingConstructorCall);
				if (result == null) result = caseWDelegatingConstructorCall(wSuperDelegatingConstructorCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WCONSTRUCTOR_CALL: {
				WConstructorCall wConstructorCall = (WConstructorCall)theEObject;
				T result = caseWConstructorCall(wConstructorCall);
				if (result == null) result = caseWExpression(wConstructorCall);
				if (result == null) result = caseWLibraryElement(wConstructorCall);
				if (result == null) result = caseWFeatureCall(wConstructorCall);
				if (result == null) result = caseWMember(wConstructorCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WARGUMENT_LIST: {
				WArgumentList wArgumentList = (WArgumentList)theEObject;
				T result = caseWArgumentList(wArgumentList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WNAMED_ARGUMENTS_LIST: {
				WNamedArgumentsList wNamedArgumentsList = (WNamedArgumentsList)theEObject;
				T result = caseWNamedArgumentsList(wNamedArgumentsList);
				if (result == null) result = caseWArgumentList(wNamedArgumentsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WPOSITIONAL_ARGUMENTS_LIST: {
				WPositionalArgumentsList wPositionalArgumentsList = (WPositionalArgumentsList)theEObject;
				T result = caseWPositionalArgumentsList(wPositionalArgumentsList);
				if (result == null) result = caseWArgumentList(wPositionalArgumentsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WINITIALIZER: {
				WInitializer wInitializer = (WInitializer)theEObject;
				T result = caseWInitializer(wInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WTRY: {
				WTry wTry = (WTry)theEObject;
				T result = caseWTry(wTry);
				if (result == null) result = caseWExpression(wTry);
				if (result == null) result = caseWLibraryElement(wTry);
				if (result == null) result = caseWFeatureCall(wTry);
				if (result == null) result = caseWMember(wTry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WCATCH: {
				WCatch wCatch = (WCatch)theEObject;
				T result = caseWCatch(wCatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WRETURN_EXPRESSION: {
				WReturnExpression wReturnExpression = (WReturnExpression)theEObject;
				T result = caseWReturnExpression(wReturnExpression);
				if (result == null) result = caseWExpression(wReturnExpression);
				if (result == null) result = caseWLibraryElement(wReturnExpression);
				if (result == null) result = caseWFeatureCall(wReturnExpression);
				if (result == null) result = caseWMember(wReturnExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WTHROW: {
				WThrow wThrow = (WThrow)theEObject;
				T result = caseWThrow(wThrow);
				if (result == null) result = caseWExpression(wThrow);
				if (result == null) result = caseWLibraryElement(wThrow);
				if (result == null) result = caseWFeatureCall(wThrow);
				if (result == null) result = caseWMember(wThrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WOBJECT_LITERAL: {
				WObjectLiteral wObjectLiteral = (WObjectLiteral)theEObject;
				T result = caseWObjectLiteral(wObjectLiteral);
				if (result == null) result = caseWMethodContainer(wObjectLiteral);
				if (result == null) result = caseWExpression(wObjectLiteral);
				if (result == null) result = caseWLibraryElement(wObjectLiteral);
				if (result == null) result = caseWFeatureCall(wObjectLiteral);
				if (result == null) result = caseWMember(wObjectLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WVARIABLE_DECLARATION: {
				WVariableDeclaration wVariableDeclaration = (WVariableDeclaration)theEObject;
				T result = caseWVariableDeclaration(wVariableDeclaration);
				if (result == null) result = caseWExpression(wVariableDeclaration);
				if (result == null) result = caseWLibraryElement(wVariableDeclaration);
				if (result == null) result = caseWFeatureCall(wVariableDeclaration);
				if (result == null) result = caseWMember(wVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WASSIGNMENT: {
				WAssignment wAssignment = (WAssignment)theEObject;
				T result = caseWAssignment(wAssignment);
				if (result == null) result = caseWExpression(wAssignment);
				if (result == null) result = caseWLibraryElement(wAssignment);
				if (result == null) result = caseWFeatureCall(wAssignment);
				if (result == null) result = caseWMember(wAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WBINARY_OPERATION: {
				WBinaryOperation wBinaryOperation = (WBinaryOperation)theEObject;
				T result = caseWBinaryOperation(wBinaryOperation);
				if (result == null) result = caseWExpression(wBinaryOperation);
				if (result == null) result = caseWLibraryElement(wBinaryOperation);
				if (result == null) result = caseWFeatureCall(wBinaryOperation);
				if (result == null) result = caseWMember(wBinaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WUNARY_OPERATION: {
				WUnaryOperation wUnaryOperation = (WUnaryOperation)theEObject;
				T result = caseWUnaryOperation(wUnaryOperation);
				if (result == null) result = caseWExpression(wUnaryOperation);
				if (result == null) result = caseWLibraryElement(wUnaryOperation);
				if (result == null) result = caseWFeatureCall(wUnaryOperation);
				if (result == null) result = caseWMember(wUnaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WPOSTFIX_OPERATION: {
				WPostfixOperation wPostfixOperation = (WPostfixOperation)theEObject;
				T result = caseWPostfixOperation(wPostfixOperation);
				if (result == null) result = caseWExpression(wPostfixOperation);
				if (result == null) result = caseWLibraryElement(wPostfixOperation);
				if (result == null) result = caseWFeatureCall(wPostfixOperation);
				if (result == null) result = caseWMember(wPostfixOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WMEMBER_FEATURE_CALL: {
				WMemberFeatureCall wMemberFeatureCall = (WMemberFeatureCall)theEObject;
				T result = caseWMemberFeatureCall(wMemberFeatureCall);
				if (result == null) result = caseWExpression(wMemberFeatureCall);
				if (result == null) result = caseWLibraryElement(wMemberFeatureCall);
				if (result == null) result = caseWFeatureCall(wMemberFeatureCall);
				if (result == null) result = caseWMember(wMemberFeatureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WSELF: {
				WSelf wSelf = (WSelf)theEObject;
				T result = caseWSelf(wSelf);
				if (result == null) result = caseWExpression(wSelf);
				if (result == null) result = caseWLibraryElement(wSelf);
				if (result == null) result = caseWFeatureCall(wSelf);
				if (result == null) result = caseWMember(wSelf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WSUPER_INVOCATION: {
				WSuperInvocation wSuperInvocation = (WSuperInvocation)theEObject;
				T result = caseWSuperInvocation(wSuperInvocation);
				if (result == null) result = caseWExpression(wSuperInvocation);
				if (result == null) result = caseWLibraryElement(wSuperInvocation);
				if (result == null) result = caseWFeatureCall(wSuperInvocation);
				if (result == null) result = caseWMember(wSuperInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WBLOCK_EXPRESSION: {
				WBlockExpression wBlockExpression = (WBlockExpression)theEObject;
				T result = caseWBlockExpression(wBlockExpression);
				if (result == null) result = caseWExpression(wBlockExpression);
				if (result == null) result = caseWLibraryElement(wBlockExpression);
				if (result == null) result = caseWFeatureCall(wBlockExpression);
				if (result == null) result = caseWMember(wBlockExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WBOOLEAN_LITERAL: {
				WBooleanLiteral wBooleanLiteral = (WBooleanLiteral)theEObject;
				T result = caseWBooleanLiteral(wBooleanLiteral);
				if (result == null) result = caseWExpression(wBooleanLiteral);
				if (result == null) result = caseWLibraryElement(wBooleanLiteral);
				if (result == null) result = caseWFeatureCall(wBooleanLiteral);
				if (result == null) result = caseWMember(wBooleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WNULL_LITERAL: {
				WNullLiteral wNullLiteral = (WNullLiteral)theEObject;
				T result = caseWNullLiteral(wNullLiteral);
				if (result == null) result = caseWExpression(wNullLiteral);
				if (result == null) result = caseWLibraryElement(wNullLiteral);
				if (result == null) result = caseWFeatureCall(wNullLiteral);
				if (result == null) result = caseWMember(wNullLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WSTRING_LITERAL: {
				WStringLiteral wStringLiteral = (WStringLiteral)theEObject;
				T result = caseWStringLiteral(wStringLiteral);
				if (result == null) result = caseWExpression(wStringLiteral);
				if (result == null) result = caseWLibraryElement(wStringLiteral);
				if (result == null) result = caseWFeatureCall(wStringLiteral);
				if (result == null) result = caseWMember(wStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WNUMBER_LITERAL: {
				WNumberLiteral wNumberLiteral = (WNumberLiteral)theEObject;
				T result = caseWNumberLiteral(wNumberLiteral);
				if (result == null) result = caseWExpression(wNumberLiteral);
				if (result == null) result = caseWLibraryElement(wNumberLiteral);
				if (result == null) result = caseWFeatureCall(wNumberLiteral);
				if (result == null) result = caseWMember(wNumberLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WollokDslPackage.WCLOSURE: {
				WClosure wClosure = (WClosure)theEObject;
				T result = caseWClosure(wClosure);
				if (result == null) result = caseWExpression(wClosure);
				if (result == null) result = caseWLibraryElement(wClosure);
				if (result == null) result = caseWFeatureCall(wClosure);
				if (result == null) result = caseWMember(wClosure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WFile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWFile(WFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WProgram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WProgram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWProgram(WProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTest(WTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSuite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSuite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSuite(WSuite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WFixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WFixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWFixture(WFixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWPackage(WPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WLibrary Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WLibrary Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWLibraryElement(WLibraryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WNamed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WNamed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWNamed(WNamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WMethod Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WMethod Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMethodContainer(WMethodContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WReferenciable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WReferenciable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWReferenciable(WReferenciable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWExpression(WExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WMethod Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WMethod Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMethodDeclaration(WMethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWParameter(WParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WVariable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WVariable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWVariable(WVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WFeature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WFeature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWFeatureCall(WFeatureCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WVariable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WVariable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWVariableReference(WVariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WIf Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWIfExpression(WIfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WCollection Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WCollection Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWCollectionLiteral(WCollectionLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WList Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WList Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWListLiteral(WListLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSet Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSet Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSetLiteral(WSetLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WNamed Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WNamed Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWNamedObject(WNamedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WCan Extend Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WCan Extend Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWCanExtendClass(WCanExtendClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWClass(WClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WMixin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WMixin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMixin(WMixin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMember(WMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WConstructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WConstructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWConstructor(WConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WDelegating Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WDelegating Constructor Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWDelegatingConstructorCall(WDelegatingConstructorCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSelf Delegating Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSelf Delegating Constructor Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSelfDelegatingConstructorCall(WSelfDelegatingConstructorCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSuper Delegating Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSuper Delegating Constructor Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSuperDelegatingConstructorCall(WSuperDelegatingConstructorCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WConstructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WConstructor Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWConstructorCall(WConstructorCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WArgument List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WArgument List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWArgumentList(WArgumentList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WNamed Arguments List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WNamed Arguments List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWNamedArgumentsList(WNamedArgumentsList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WPositional Arguments List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WPositional Arguments List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWPositionalArgumentsList(WPositionalArgumentsList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WInitializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WInitializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWInitializer(WInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTry(WTry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WCatch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WCatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWCatch(WCatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WReturn Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WReturn Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWReturnExpression(WReturnExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WThrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WThrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWThrow(WThrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WObject Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WObject Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWObjectLiteral(WObjectLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WVariable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WVariable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWVariableDeclaration(WVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WAssignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WAssignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWAssignment(WAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WBinary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WBinary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWBinaryOperation(WBinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WUnary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WUnary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWUnaryOperation(WUnaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WPostfix Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WPostfix Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWPostfixOperation(WPostfixOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WMember Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WMember Feature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMemberFeatureCall(WMemberFeatureCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSelf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSelf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSelf(WSelf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSuper Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSuper Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSuperInvocation(WSuperInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WBlock Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WBlock Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWBlockExpression(WBlockExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WBoolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WBoolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWBooleanLiteral(WBooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WNull Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WNull Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWNullLiteral(WNullLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WString Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WString Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWStringLiteral(WStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WNumber Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WNumber Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWNumberLiteral(WNumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WClosure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WClosure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWClosure(WClosure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WollokDslSwitch
