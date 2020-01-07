/**
 */
package wollokDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import wollokDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see wollokDsl.WollokDslPackage
 * @generated
 */
public class WollokDslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WollokDslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WollokDslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WollokDslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WollokDslSwitch<Adapter> modelSwitch =
		new WollokDslSwitch<Adapter>() {
			@Override
			public Adapter caseWFile(WFile object) {
				return createWFileAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseWProgram(WProgram object) {
				return createWProgramAdapter();
			}
			@Override
			public Adapter caseWTest(WTest object) {
				return createWTestAdapter();
			}
			@Override
			public Adapter caseWSuite(WSuite object) {
				return createWSuiteAdapter();
			}
			@Override
			public Adapter caseWFixture(WFixture object) {
				return createWFixtureAdapter();
			}
			@Override
			public Adapter caseWPackage(WPackage object) {
				return createWPackageAdapter();
			}
			@Override
			public Adapter caseWLibraryElement(WLibraryElement object) {
				return createWLibraryElementAdapter();
			}
			@Override
			public Adapter caseWNamed(WNamed object) {
				return createWNamedAdapter();
			}
			@Override
			public Adapter caseWMethodContainer(WMethodContainer object) {
				return createWMethodContainerAdapter();
			}
			@Override
			public Adapter caseWReferenciable(WReferenciable object) {
				return createWReferenciableAdapter();
			}
			@Override
			public Adapter caseWExpression(WExpression object) {
				return createWExpressionAdapter();
			}
			@Override
			public Adapter caseWMethodDeclaration(WMethodDeclaration object) {
				return createWMethodDeclarationAdapter();
			}
			@Override
			public Adapter caseWParameter(WParameter object) {
				return createWParameterAdapter();
			}
			@Override
			public Adapter caseWVariable(WVariable object) {
				return createWVariableAdapter();
			}
			@Override
			public Adapter caseWFeatureCall(WFeatureCall object) {
				return createWFeatureCallAdapter();
			}
			@Override
			public Adapter caseWVariableReference(WVariableReference object) {
				return createWVariableReferenceAdapter();
			}
			@Override
			public Adapter caseWIfExpression(WIfExpression object) {
				return createWIfExpressionAdapter();
			}
			@Override
			public Adapter caseWCollectionLiteral(WCollectionLiteral object) {
				return createWCollectionLiteralAdapter();
			}
			@Override
			public Adapter caseWListLiteral(WListLiteral object) {
				return createWListLiteralAdapter();
			}
			@Override
			public Adapter caseWSetLiteral(WSetLiteral object) {
				return createWSetLiteralAdapter();
			}
			@Override
			public Adapter caseWNamedObject(WNamedObject object) {
				return createWNamedObjectAdapter();
			}
			@Override
			public Adapter caseWCanExtendClass(WCanExtendClass object) {
				return createWCanExtendClassAdapter();
			}
			@Override
			public Adapter caseWClass(WClass object) {
				return createWClassAdapter();
			}
			@Override
			public Adapter caseWMixin(WMixin object) {
				return createWMixinAdapter();
			}
			@Override
			public Adapter caseWMember(WMember object) {
				return createWMemberAdapter();
			}
			@Override
			public Adapter caseWConstructor(WConstructor object) {
				return createWConstructorAdapter();
			}
			@Override
			public Adapter caseWDelegatingConstructorCall(WDelegatingConstructorCall object) {
				return createWDelegatingConstructorCallAdapter();
			}
			@Override
			public Adapter caseWSelfDelegatingConstructorCall(WSelfDelegatingConstructorCall object) {
				return createWSelfDelegatingConstructorCallAdapter();
			}
			@Override
			public Adapter caseWSuperDelegatingConstructorCall(WSuperDelegatingConstructorCall object) {
				return createWSuperDelegatingConstructorCallAdapter();
			}
			@Override
			public Adapter caseWConstructorCall(WConstructorCall object) {
				return createWConstructorCallAdapter();
			}
			@Override
			public Adapter caseWArgumentList(WArgumentList object) {
				return createWArgumentListAdapter();
			}
			@Override
			public Adapter caseWNamedArgumentsList(WNamedArgumentsList object) {
				return createWNamedArgumentsListAdapter();
			}
			@Override
			public Adapter caseWPositionalArgumentsList(WPositionalArgumentsList object) {
				return createWPositionalArgumentsListAdapter();
			}
			@Override
			public Adapter caseWInitializer(WInitializer object) {
				return createWInitializerAdapter();
			}
			@Override
			public Adapter caseWTry(WTry object) {
				return createWTryAdapter();
			}
			@Override
			public Adapter caseWCatch(WCatch object) {
				return createWCatchAdapter();
			}
			@Override
			public Adapter caseWReturnExpression(WReturnExpression object) {
				return createWReturnExpressionAdapter();
			}
			@Override
			public Adapter caseWThrow(WThrow object) {
				return createWThrowAdapter();
			}
			@Override
			public Adapter caseWObjectLiteral(WObjectLiteral object) {
				return createWObjectLiteralAdapter();
			}
			@Override
			public Adapter caseWVariableDeclaration(WVariableDeclaration object) {
				return createWVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseWAssignment(WAssignment object) {
				return createWAssignmentAdapter();
			}
			@Override
			public Adapter caseWBinaryOperation(WBinaryOperation object) {
				return createWBinaryOperationAdapter();
			}
			@Override
			public Adapter caseWUnaryOperation(WUnaryOperation object) {
				return createWUnaryOperationAdapter();
			}
			@Override
			public Adapter caseWPostfixOperation(WPostfixOperation object) {
				return createWPostfixOperationAdapter();
			}
			@Override
			public Adapter caseWMemberFeatureCall(WMemberFeatureCall object) {
				return createWMemberFeatureCallAdapter();
			}
			@Override
			public Adapter caseWSelf(WSelf object) {
				return createWSelfAdapter();
			}
			@Override
			public Adapter caseWSuperInvocation(WSuperInvocation object) {
				return createWSuperInvocationAdapter();
			}
			@Override
			public Adapter caseWBlockExpression(WBlockExpression object) {
				return createWBlockExpressionAdapter();
			}
			@Override
			public Adapter caseWBooleanLiteral(WBooleanLiteral object) {
				return createWBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseWNullLiteral(WNullLiteral object) {
				return createWNullLiteralAdapter();
			}
			@Override
			public Adapter caseWStringLiteral(WStringLiteral object) {
				return createWStringLiteralAdapter();
			}
			@Override
			public Adapter caseWNumberLiteral(WNumberLiteral object) {
				return createWNumberLiteralAdapter();
			}
			@Override
			public Adapter caseWClosure(WClosure object) {
				return createWClosureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WFile <em>WFile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WFile
	 * @generated
	 */
	public Adapter createWFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WProgram <em>WProgram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WProgram
	 * @generated
	 */
	public Adapter createWProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WTest <em>WTest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WTest
	 * @generated
	 */
	public Adapter createWTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WSuite <em>WSuite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WSuite
	 * @generated
	 */
	public Adapter createWSuiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WFixture <em>WFixture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WFixture
	 * @generated
	 */
	public Adapter createWFixtureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WPackage <em>WPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WPackage
	 * @generated
	 */
	public Adapter createWPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WLibraryElement <em>WLibrary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WLibraryElement
	 * @generated
	 */
	public Adapter createWLibraryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WNamed <em>WNamed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WNamed
	 * @generated
	 */
	public Adapter createWNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WMethodContainer <em>WMethod Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WMethodContainer
	 * @generated
	 */
	public Adapter createWMethodContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WReferenciable <em>WReferenciable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WReferenciable
	 * @generated
	 */
	public Adapter createWReferenciableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WExpression <em>WExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WExpression
	 * @generated
	 */
	public Adapter createWExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WMethodDeclaration <em>WMethod Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WMethodDeclaration
	 * @generated
	 */
	public Adapter createWMethodDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WParameter <em>WParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WParameter
	 * @generated
	 */
	public Adapter createWParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WVariable <em>WVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WVariable
	 * @generated
	 */
	public Adapter createWVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WFeatureCall <em>WFeature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WFeatureCall
	 * @generated
	 */
	public Adapter createWFeatureCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WVariableReference <em>WVariable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WVariableReference
	 * @generated
	 */
	public Adapter createWVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WIfExpression <em>WIf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WIfExpression
	 * @generated
	 */
	public Adapter createWIfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WCollectionLiteral <em>WCollection Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WCollectionLiteral
	 * @generated
	 */
	public Adapter createWCollectionLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WListLiteral <em>WList Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WListLiteral
	 * @generated
	 */
	public Adapter createWListLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WSetLiteral <em>WSet Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WSetLiteral
	 * @generated
	 */
	public Adapter createWSetLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WNamedObject <em>WNamed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WNamedObject
	 * @generated
	 */
	public Adapter createWNamedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WCanExtendClass <em>WCan Extend Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WCanExtendClass
	 * @generated
	 */
	public Adapter createWCanExtendClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WClass <em>WClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WClass
	 * @generated
	 */
	public Adapter createWClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WMixin <em>WMixin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WMixin
	 * @generated
	 */
	public Adapter createWMixinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WMember <em>WMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WMember
	 * @generated
	 */
	public Adapter createWMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WConstructor <em>WConstructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WConstructor
	 * @generated
	 */
	public Adapter createWConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WDelegatingConstructorCall <em>WDelegating Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WDelegatingConstructorCall
	 * @generated
	 */
	public Adapter createWDelegatingConstructorCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WSelfDelegatingConstructorCall <em>WSelf Delegating Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WSelfDelegatingConstructorCall
	 * @generated
	 */
	public Adapter createWSelfDelegatingConstructorCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WSuperDelegatingConstructorCall <em>WSuper Delegating Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WSuperDelegatingConstructorCall
	 * @generated
	 */
	public Adapter createWSuperDelegatingConstructorCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WConstructorCall <em>WConstructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WConstructorCall
	 * @generated
	 */
	public Adapter createWConstructorCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WArgumentList <em>WArgument List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WArgumentList
	 * @generated
	 */
	public Adapter createWArgumentListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WNamedArgumentsList <em>WNamed Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WNamedArgumentsList
	 * @generated
	 */
	public Adapter createWNamedArgumentsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WPositionalArgumentsList <em>WPositional Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WPositionalArgumentsList
	 * @generated
	 */
	public Adapter createWPositionalArgumentsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WInitializer <em>WInitializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WInitializer
	 * @generated
	 */
	public Adapter createWInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WTry <em>WTry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WTry
	 * @generated
	 */
	public Adapter createWTryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WCatch <em>WCatch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WCatch
	 * @generated
	 */
	public Adapter createWCatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WReturnExpression <em>WReturn Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WReturnExpression
	 * @generated
	 */
	public Adapter createWReturnExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WThrow <em>WThrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WThrow
	 * @generated
	 */
	public Adapter createWThrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WObjectLiteral <em>WObject Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WObjectLiteral
	 * @generated
	 */
	public Adapter createWObjectLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WVariableDeclaration <em>WVariable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WVariableDeclaration
	 * @generated
	 */
	public Adapter createWVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WAssignment <em>WAssignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WAssignment
	 * @generated
	 */
	public Adapter createWAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WBinaryOperation <em>WBinary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WBinaryOperation
	 * @generated
	 */
	public Adapter createWBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WUnaryOperation <em>WUnary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WUnaryOperation
	 * @generated
	 */
	public Adapter createWUnaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WPostfixOperation <em>WPostfix Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WPostfixOperation
	 * @generated
	 */
	public Adapter createWPostfixOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WMemberFeatureCall <em>WMember Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WMemberFeatureCall
	 * @generated
	 */
	public Adapter createWMemberFeatureCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WSelf <em>WSelf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WSelf
	 * @generated
	 */
	public Adapter createWSelfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WSuperInvocation <em>WSuper Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WSuperInvocation
	 * @generated
	 */
	public Adapter createWSuperInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WBlockExpression <em>WBlock Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WBlockExpression
	 * @generated
	 */
	public Adapter createWBlockExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WBooleanLiteral <em>WBoolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WBooleanLiteral
	 * @generated
	 */
	public Adapter createWBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WNullLiteral <em>WNull Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WNullLiteral
	 * @generated
	 */
	public Adapter createWNullLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WStringLiteral <em>WString Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WStringLiteral
	 * @generated
	 */
	public Adapter createWStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WNumberLiteral <em>WNumber Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WNumberLiteral
	 * @generated
	 */
	public Adapter createWNumberLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wollokDsl.WClosure <em>WClosure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wollokDsl.WClosure
	 * @generated
	 */
	public Adapter createWClosureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WollokDslAdapterFactory
