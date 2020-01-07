/**
 */
package wollokDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import wollokDsl.Import;
import wollokDsl.WArgumentList;
import wollokDsl.WAssignment;
import wollokDsl.WBinaryOperation;
import wollokDsl.WBlockExpression;
import wollokDsl.WBooleanLiteral;
import wollokDsl.WCanExtendClass;
import wollokDsl.WCatch;
import wollokDsl.WClass;
import wollokDsl.WClosure;
import wollokDsl.WCollectionLiteral;
import wollokDsl.WConstructor;
import wollokDsl.WConstructorCall;
import wollokDsl.WDelegatingConstructorCall;
import wollokDsl.WExpression;
import wollokDsl.WFeatureCall;
import wollokDsl.WFile;
import wollokDsl.WFixture;
import wollokDsl.WIfExpression;
import wollokDsl.WInitializer;
import wollokDsl.WLibraryElement;
import wollokDsl.WListLiteral;
import wollokDsl.WMember;
import wollokDsl.WMemberFeatureCall;
import wollokDsl.WMethodContainer;
import wollokDsl.WMethodDeclaration;
import wollokDsl.WMixin;
import wollokDsl.WNamed;
import wollokDsl.WNamedArgumentsList;
import wollokDsl.WNamedObject;
import wollokDsl.WNullLiteral;
import wollokDsl.WNumberLiteral;
import wollokDsl.WObjectLiteral;
import wollokDsl.WPackage;
import wollokDsl.WParameter;
import wollokDsl.WPositionalArgumentsList;
import wollokDsl.WPostfixOperation;
import wollokDsl.WProgram;
import wollokDsl.WReferenciable;
import wollokDsl.WReturnExpression;
import wollokDsl.WSelf;
import wollokDsl.WSelfDelegatingConstructorCall;
import wollokDsl.WSetLiteral;
import wollokDsl.WStringLiteral;
import wollokDsl.WSuite;
import wollokDsl.WSuperDelegatingConstructorCall;
import wollokDsl.WSuperInvocation;
import wollokDsl.WTest;
import wollokDsl.WThrow;
import wollokDsl.WTry;
import wollokDsl.WUnaryOperation;
import wollokDsl.WVariable;
import wollokDsl.WVariableDeclaration;
import wollokDsl.WVariableReference;
import wollokDsl.WollokDslFactory;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WollokDslPackageImpl extends EPackageImpl implements WollokDslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wSuiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wFixtureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wLibraryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wNamedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wMethodContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wReferenciableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wMethodDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wFeatureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wVariableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wIfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wCollectionLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wListLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wSetLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wNamedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wCanExtendClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wMixinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wDelegatingConstructorCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wSelfDelegatingConstructorCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wSuperDelegatingConstructorCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wConstructorCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wArgumentListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wNamedArgumentsListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wPositionalArgumentsListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wTryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wCatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wReturnExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wThrowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wObjectLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wBinaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wUnaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wPostfixOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wMemberFeatureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wSelfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wSuperInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wBlockExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wBooleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wNullLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wStringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wNumberLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wClosureEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see wollokDsl.WollokDslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WollokDslPackageImpl() {
		super(eNS_URI, WollokDslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WollokDslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WollokDslPackage init() {
		if (isInited) return (WollokDslPackage)EPackage.Registry.INSTANCE.getEPackage(WollokDslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWollokDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WollokDslPackageImpl theWollokDslPackage = registeredWollokDslPackage instanceof WollokDslPackageImpl ? (WollokDslPackageImpl)registeredWollokDslPackage : new WollokDslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWollokDslPackage.createPackageContents();

		// Initialize created meta-data
		theWollokDslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWollokDslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WollokDslPackage.eNS_URI, theWollokDslPackage);
		return theWollokDslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWFile() {
		return wFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWFile_Imports() {
		return (EReference)wFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWFile_Elements() {
		return (EReference)wFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWFile_Main() {
		return (EReference)wFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWFile_Tests() {
		return (EReference)wFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWFile_Suites() {
		return (EReference)wFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImport_ImportedNamespace() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWProgram() {
		return wProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWProgram_Name() {
		return (EAttribute)wProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWProgram_Elements() {
		return (EReference)wProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWTest() {
		return wTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWTest_Name() {
		return (EAttribute)wTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWTest_Elements() {
		return (EReference)wTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWSuite() {
		return wSuiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWSuite_Name() {
		return (EAttribute)wSuiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWSuite_Fixture() {
		return (EReference)wSuiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWSuite_Tests() {
		return (EReference)wSuiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWFixture() {
		return wFixtureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWFixture_Elements() {
		return (EReference)wFixtureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWPackage() {
		return wPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWPackage_Elements() {
		return (EReference)wPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWLibraryElement() {
		return wLibraryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWNamed() {
		return wNamedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWNamed_Name() {
		return (EAttribute)wNamedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMethodContainer() {
		return wMethodContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMethodContainer_Members() {
		return (EReference)wMethodContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWReferenciable() {
		return wReferenciableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWExpression() {
		return wExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMethodDeclaration() {
		return wMethodDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMethodDeclaration_Overrides() {
		return (EAttribute)wMethodDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMethodDeclaration_Parameters() {
		return (EReference)wMethodDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMethodDeclaration_Native() {
		return (EAttribute)wMethodDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMethodDeclaration_Expression() {
		return (EReference)wMethodDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMethodDeclaration_ExpressionReturns() {
		return (EAttribute)wMethodDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWParameter() {
		return wParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWParameter_VarArg() {
		return (EAttribute)wParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWVariable() {
		return wVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWFeatureCall() {
		return wFeatureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWVariableReference() {
		return wVariableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWVariableReference_Ref() {
		return (EReference)wVariableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWIfExpression() {
		return wIfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWIfExpression_Condition() {
		return (EReference)wIfExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWIfExpression_Then() {
		return (EReference)wIfExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWIfExpression_Else() {
		return (EReference)wIfExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWCollectionLiteral() {
		return wCollectionLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWCollectionLiteral_Elements() {
		return (EReference)wCollectionLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWListLiteral() {
		return wListLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWSetLiteral() {
		return wSetLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWNamedObject() {
		return wNamedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWNamedObject_Parent() {
		return (EReference)wNamedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWNamedObject_ParentParameters() {
		return (EReference)wNamedObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWNamedObject_Mixins() {
		return (EReference)wNamedObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWCanExtendClass() {
		return wCanExtendClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWClass() {
		return wClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWClass_Parent() {
		return (EReference)wClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWClass_Mixins() {
		return (EReference)wClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWClass_Constructors() {
		return (EReference)wClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMixin() {
		return wMixinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMember() {
		return wMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWConstructor() {
		return wConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWConstructor_Parameters() {
		return (EReference)wConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWConstructor_DelegatingConstructorCall() {
		return (EReference)wConstructorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWConstructor_Expression() {
		return (EReference)wConstructorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWDelegatingConstructorCall() {
		return wDelegatingConstructorCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWDelegatingConstructorCall_ArgumentList() {
		return (EReference)wDelegatingConstructorCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWSelfDelegatingConstructorCall() {
		return wSelfDelegatingConstructorCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWSuperDelegatingConstructorCall() {
		return wSuperDelegatingConstructorCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWConstructorCall() {
		return wConstructorCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWConstructorCall_ClassRef() {
		return (EReference)wConstructorCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWConstructorCall_ArgumentList() {
		return (EReference)wConstructorCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWConstructorCall_Mixins() {
		return (EReference)wConstructorCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWArgumentList() {
		return wArgumentListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWNamedArgumentsList() {
		return wNamedArgumentsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWNamedArgumentsList_Initializers() {
		return (EReference)wNamedArgumentsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWPositionalArgumentsList() {
		return wPositionalArgumentsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWPositionalArgumentsList_Values() {
		return (EReference)wPositionalArgumentsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWInitializer() {
		return wInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWInitializer_Initializer() {
		return (EReference)wInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWInitializer_InitialValue() {
		return (EReference)wInitializerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWTry() {
		return wTryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWTry_Expression() {
		return (EReference)wTryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWTry_CatchBlocks() {
		return (EReference)wTryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWTry_AlwaysExpression() {
		return (EReference)wTryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWCatch() {
		return wCatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWCatch_ExceptionVarName() {
		return (EReference)wCatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWCatch_ExceptionType() {
		return (EReference)wCatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWCatch_Expression() {
		return (EReference)wCatchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWReturnExpression() {
		return wReturnExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWReturnExpression_Expression() {
		return (EReference)wReturnExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWThrow() {
		return wThrowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWThrow_Exception() {
		return (EReference)wThrowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWObjectLiteral() {
		return wObjectLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWObjectLiteral_Parent() {
		return (EReference)wObjectLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWObjectLiteral_ParentParameters() {
		return (EReference)wObjectLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWObjectLiteral_Mixins() {
		return (EReference)wObjectLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWVariableDeclaration() {
		return wVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWVariableDeclaration_Writeable() {
		return (EAttribute)wVariableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWVariableDeclaration_Property() {
		return (EAttribute)wVariableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWVariableDeclaration_Variable() {
		return (EReference)wVariableDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWVariableDeclaration_Right() {
		return (EReference)wVariableDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWAssignment() {
		return wAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWAssignment_Feature() {
		return (EReference)wAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWAssignment_Value() {
		return (EReference)wAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWBinaryOperation() {
		return wBinaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWBinaryOperation_LeftOperand() {
		return (EReference)wBinaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWBinaryOperation_Feature() {
		return (EAttribute)wBinaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWBinaryOperation_RightOperand() {
		return (EReference)wBinaryOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWUnaryOperation() {
		return wUnaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWUnaryOperation_Feature() {
		return (EAttribute)wUnaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWUnaryOperation_Operand() {
		return (EReference)wUnaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWPostfixOperation() {
		return wPostfixOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWPostfixOperation_Operand() {
		return (EReference)wPostfixOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWPostfixOperation_Feature() {
		return (EAttribute)wPostfixOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMemberFeatureCall() {
		return wMemberFeatureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMemberFeatureCall_MemberCallTarget() {
		return (EReference)wMemberFeatureCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMemberFeatureCall_NullSafe() {
		return (EAttribute)wMemberFeatureCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMemberFeatureCall_Feature() {
		return (EAttribute)wMemberFeatureCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMemberFeatureCall_MemberCallArguments() {
		return (EReference)wMemberFeatureCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWSelf() {
		return wSelfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWSuperInvocation() {
		return wSuperInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWSuperInvocation_MemberCallArguments() {
		return (EReference)wSuperInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWBlockExpression() {
		return wBlockExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWBlockExpression_Expressions() {
		return (EReference)wBlockExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWBooleanLiteral() {
		return wBooleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWBooleanLiteral_IsTrue() {
		return (EAttribute)wBooleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWNullLiteral() {
		return wNullLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWStringLiteral() {
		return wStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWStringLiteral_Value() {
		return (EAttribute)wStringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWNumberLiteral() {
		return wNumberLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWNumberLiteral_Value() {
		return (EAttribute)wNumberLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWClosure() {
		return wClosureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWClosure_Parameters() {
		return (EReference)wClosureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWClosure_Expression() {
		return (EReference)wClosureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WollokDslFactory getWollokDslFactory() {
		return (WollokDslFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wFileEClass = createEClass(WFILE);
		createEReference(wFileEClass, WFILE__IMPORTS);
		createEReference(wFileEClass, WFILE__ELEMENTS);
		createEReference(wFileEClass, WFILE__MAIN);
		createEReference(wFileEClass, WFILE__TESTS);
		createEReference(wFileEClass, WFILE__SUITES);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

		wProgramEClass = createEClass(WPROGRAM);
		createEAttribute(wProgramEClass, WPROGRAM__NAME);
		createEReference(wProgramEClass, WPROGRAM__ELEMENTS);

		wTestEClass = createEClass(WTEST);
		createEAttribute(wTestEClass, WTEST__NAME);
		createEReference(wTestEClass, WTEST__ELEMENTS);

		wSuiteEClass = createEClass(WSUITE);
		createEAttribute(wSuiteEClass, WSUITE__NAME);
		createEReference(wSuiteEClass, WSUITE__FIXTURE);
		createEReference(wSuiteEClass, WSUITE__TESTS);

		wFixtureEClass = createEClass(WFIXTURE);
		createEReference(wFixtureEClass, WFIXTURE__ELEMENTS);

		wPackageEClass = createEClass(WPACKAGE);
		createEReference(wPackageEClass, WPACKAGE__ELEMENTS);

		wLibraryElementEClass = createEClass(WLIBRARY_ELEMENT);

		wNamedEClass = createEClass(WNAMED);
		createEAttribute(wNamedEClass, WNAMED__NAME);

		wMethodContainerEClass = createEClass(WMETHOD_CONTAINER);
		createEReference(wMethodContainerEClass, WMETHOD_CONTAINER__MEMBERS);

		wReferenciableEClass = createEClass(WREFERENCIABLE);

		wExpressionEClass = createEClass(WEXPRESSION);

		wMethodDeclarationEClass = createEClass(WMETHOD_DECLARATION);
		createEAttribute(wMethodDeclarationEClass, WMETHOD_DECLARATION__OVERRIDES);
		createEReference(wMethodDeclarationEClass, WMETHOD_DECLARATION__PARAMETERS);
		createEAttribute(wMethodDeclarationEClass, WMETHOD_DECLARATION__NATIVE);
		createEReference(wMethodDeclarationEClass, WMETHOD_DECLARATION__EXPRESSION);
		createEAttribute(wMethodDeclarationEClass, WMETHOD_DECLARATION__EXPRESSION_RETURNS);

		wParameterEClass = createEClass(WPARAMETER);
		createEAttribute(wParameterEClass, WPARAMETER__VAR_ARG);

		wVariableEClass = createEClass(WVARIABLE);

		wFeatureCallEClass = createEClass(WFEATURE_CALL);

		wVariableReferenceEClass = createEClass(WVARIABLE_REFERENCE);
		createEReference(wVariableReferenceEClass, WVARIABLE_REFERENCE__REF);

		wIfExpressionEClass = createEClass(WIF_EXPRESSION);
		createEReference(wIfExpressionEClass, WIF_EXPRESSION__CONDITION);
		createEReference(wIfExpressionEClass, WIF_EXPRESSION__THEN);
		createEReference(wIfExpressionEClass, WIF_EXPRESSION__ELSE);

		wCollectionLiteralEClass = createEClass(WCOLLECTION_LITERAL);
		createEReference(wCollectionLiteralEClass, WCOLLECTION_LITERAL__ELEMENTS);

		wListLiteralEClass = createEClass(WLIST_LITERAL);

		wSetLiteralEClass = createEClass(WSET_LITERAL);

		wNamedObjectEClass = createEClass(WNAMED_OBJECT);
		createEReference(wNamedObjectEClass, WNAMED_OBJECT__PARENT);
		createEReference(wNamedObjectEClass, WNAMED_OBJECT__PARENT_PARAMETERS);
		createEReference(wNamedObjectEClass, WNAMED_OBJECT__MIXINS);

		wCanExtendClassEClass = createEClass(WCAN_EXTEND_CLASS);

		wClassEClass = createEClass(WCLASS);
		createEReference(wClassEClass, WCLASS__PARENT);
		createEReference(wClassEClass, WCLASS__MIXINS);
		createEReference(wClassEClass, WCLASS__CONSTRUCTORS);

		wMixinEClass = createEClass(WMIXIN);

		wMemberEClass = createEClass(WMEMBER);

		wConstructorEClass = createEClass(WCONSTRUCTOR);
		createEReference(wConstructorEClass, WCONSTRUCTOR__PARAMETERS);
		createEReference(wConstructorEClass, WCONSTRUCTOR__DELEGATING_CONSTRUCTOR_CALL);
		createEReference(wConstructorEClass, WCONSTRUCTOR__EXPRESSION);

		wDelegatingConstructorCallEClass = createEClass(WDELEGATING_CONSTRUCTOR_CALL);
		createEReference(wDelegatingConstructorCallEClass, WDELEGATING_CONSTRUCTOR_CALL__ARGUMENT_LIST);

		wSelfDelegatingConstructorCallEClass = createEClass(WSELF_DELEGATING_CONSTRUCTOR_CALL);

		wSuperDelegatingConstructorCallEClass = createEClass(WSUPER_DELEGATING_CONSTRUCTOR_CALL);

		wConstructorCallEClass = createEClass(WCONSTRUCTOR_CALL);
		createEReference(wConstructorCallEClass, WCONSTRUCTOR_CALL__CLASS_REF);
		createEReference(wConstructorCallEClass, WCONSTRUCTOR_CALL__ARGUMENT_LIST);
		createEReference(wConstructorCallEClass, WCONSTRUCTOR_CALL__MIXINS);

		wArgumentListEClass = createEClass(WARGUMENT_LIST);

		wNamedArgumentsListEClass = createEClass(WNAMED_ARGUMENTS_LIST);
		createEReference(wNamedArgumentsListEClass, WNAMED_ARGUMENTS_LIST__INITIALIZERS);

		wPositionalArgumentsListEClass = createEClass(WPOSITIONAL_ARGUMENTS_LIST);
		createEReference(wPositionalArgumentsListEClass, WPOSITIONAL_ARGUMENTS_LIST__VALUES);

		wInitializerEClass = createEClass(WINITIALIZER);
		createEReference(wInitializerEClass, WINITIALIZER__INITIALIZER);
		createEReference(wInitializerEClass, WINITIALIZER__INITIAL_VALUE);

		wTryEClass = createEClass(WTRY);
		createEReference(wTryEClass, WTRY__EXPRESSION);
		createEReference(wTryEClass, WTRY__CATCH_BLOCKS);
		createEReference(wTryEClass, WTRY__ALWAYS_EXPRESSION);

		wCatchEClass = createEClass(WCATCH);
		createEReference(wCatchEClass, WCATCH__EXCEPTION_VAR_NAME);
		createEReference(wCatchEClass, WCATCH__EXCEPTION_TYPE);
		createEReference(wCatchEClass, WCATCH__EXPRESSION);

		wReturnExpressionEClass = createEClass(WRETURN_EXPRESSION);
		createEReference(wReturnExpressionEClass, WRETURN_EXPRESSION__EXPRESSION);

		wThrowEClass = createEClass(WTHROW);
		createEReference(wThrowEClass, WTHROW__EXCEPTION);

		wObjectLiteralEClass = createEClass(WOBJECT_LITERAL);
		createEReference(wObjectLiteralEClass, WOBJECT_LITERAL__PARENT);
		createEReference(wObjectLiteralEClass, WOBJECT_LITERAL__PARENT_PARAMETERS);
		createEReference(wObjectLiteralEClass, WOBJECT_LITERAL__MIXINS);

		wVariableDeclarationEClass = createEClass(WVARIABLE_DECLARATION);
		createEAttribute(wVariableDeclarationEClass, WVARIABLE_DECLARATION__WRITEABLE);
		createEAttribute(wVariableDeclarationEClass, WVARIABLE_DECLARATION__PROPERTY);
		createEReference(wVariableDeclarationEClass, WVARIABLE_DECLARATION__VARIABLE);
		createEReference(wVariableDeclarationEClass, WVARIABLE_DECLARATION__RIGHT);

		wAssignmentEClass = createEClass(WASSIGNMENT);
		createEReference(wAssignmentEClass, WASSIGNMENT__FEATURE);
		createEReference(wAssignmentEClass, WASSIGNMENT__VALUE);

		wBinaryOperationEClass = createEClass(WBINARY_OPERATION);
		createEReference(wBinaryOperationEClass, WBINARY_OPERATION__LEFT_OPERAND);
		createEAttribute(wBinaryOperationEClass, WBINARY_OPERATION__FEATURE);
		createEReference(wBinaryOperationEClass, WBINARY_OPERATION__RIGHT_OPERAND);

		wUnaryOperationEClass = createEClass(WUNARY_OPERATION);
		createEAttribute(wUnaryOperationEClass, WUNARY_OPERATION__FEATURE);
		createEReference(wUnaryOperationEClass, WUNARY_OPERATION__OPERAND);

		wPostfixOperationEClass = createEClass(WPOSTFIX_OPERATION);
		createEReference(wPostfixOperationEClass, WPOSTFIX_OPERATION__OPERAND);
		createEAttribute(wPostfixOperationEClass, WPOSTFIX_OPERATION__FEATURE);

		wMemberFeatureCallEClass = createEClass(WMEMBER_FEATURE_CALL);
		createEReference(wMemberFeatureCallEClass, WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET);
		createEAttribute(wMemberFeatureCallEClass, WMEMBER_FEATURE_CALL__NULL_SAFE);
		createEAttribute(wMemberFeatureCallEClass, WMEMBER_FEATURE_CALL__FEATURE);
		createEReference(wMemberFeatureCallEClass, WMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS);

		wSelfEClass = createEClass(WSELF);

		wSuperInvocationEClass = createEClass(WSUPER_INVOCATION);
		createEReference(wSuperInvocationEClass, WSUPER_INVOCATION__MEMBER_CALL_ARGUMENTS);

		wBlockExpressionEClass = createEClass(WBLOCK_EXPRESSION);
		createEReference(wBlockExpressionEClass, WBLOCK_EXPRESSION__EXPRESSIONS);

		wBooleanLiteralEClass = createEClass(WBOOLEAN_LITERAL);
		createEAttribute(wBooleanLiteralEClass, WBOOLEAN_LITERAL__IS_TRUE);

		wNullLiteralEClass = createEClass(WNULL_LITERAL);

		wStringLiteralEClass = createEClass(WSTRING_LITERAL);
		createEAttribute(wStringLiteralEClass, WSTRING_LITERAL__VALUE);

		wNumberLiteralEClass = createEClass(WNUMBER_LITERAL);
		createEAttribute(wNumberLiteralEClass, WNUMBER_LITERAL__VALUE);

		wClosureEClass = createEClass(WCLOSURE);
		createEReference(wClosureEClass, WCLOSURE__PARAMETERS);
		createEReference(wClosureEClass, WCLOSURE__EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wSuiteEClass.getESuperTypes().add(this.getWMethodContainer());
		wPackageEClass.getESuperTypes().add(this.getWLibraryElement());
		wPackageEClass.getESuperTypes().add(this.getWNamed());
		wReferenciableEClass.getESuperTypes().add(this.getWNamed());
		wExpressionEClass.getESuperTypes().add(this.getWLibraryElement());
		wExpressionEClass.getESuperTypes().add(this.getWFeatureCall());
		wExpressionEClass.getESuperTypes().add(this.getWMember());
		wMethodDeclarationEClass.getESuperTypes().add(this.getWNamed());
		wMethodDeclarationEClass.getESuperTypes().add(this.getWMember());
		wParameterEClass.getESuperTypes().add(this.getWReferenciable());
		wVariableEClass.getESuperTypes().add(this.getWReferenciable());
		wVariableReferenceEClass.getESuperTypes().add(this.getWExpression());
		wIfExpressionEClass.getESuperTypes().add(this.getWExpression());
		wCollectionLiteralEClass.getESuperTypes().add(this.getWExpression());
		wListLiteralEClass.getESuperTypes().add(this.getWCollectionLiteral());
		wSetLiteralEClass.getESuperTypes().add(this.getWCollectionLiteral());
		wNamedObjectEClass.getESuperTypes().add(this.getWLibraryElement());
		wNamedObjectEClass.getESuperTypes().add(this.getWMethodContainer());
		wNamedObjectEClass.getESuperTypes().add(this.getWReferenciable());
		wNamedObjectEClass.getESuperTypes().add(this.getWCanExtendClass());
		wClassEClass.getESuperTypes().add(this.getWLibraryElement());
		wClassEClass.getESuperTypes().add(this.getWNamed());
		wClassEClass.getESuperTypes().add(this.getWMethodContainer());
		wClassEClass.getESuperTypes().add(this.getWCanExtendClass());
		wMixinEClass.getESuperTypes().add(this.getWLibraryElement());
		wMixinEClass.getESuperTypes().add(this.getWNamed());
		wMixinEClass.getESuperTypes().add(this.getWMethodContainer());
		wSelfDelegatingConstructorCallEClass.getESuperTypes().add(this.getWDelegatingConstructorCall());
		wSuperDelegatingConstructorCallEClass.getESuperTypes().add(this.getWDelegatingConstructorCall());
		wConstructorCallEClass.getESuperTypes().add(this.getWExpression());
		wNamedArgumentsListEClass.getESuperTypes().add(this.getWArgumentList());
		wPositionalArgumentsListEClass.getESuperTypes().add(this.getWArgumentList());
		wTryEClass.getESuperTypes().add(this.getWExpression());
		wReturnExpressionEClass.getESuperTypes().add(this.getWExpression());
		wThrowEClass.getESuperTypes().add(this.getWExpression());
		wObjectLiteralEClass.getESuperTypes().add(this.getWMethodContainer());
		wObjectLiteralEClass.getESuperTypes().add(this.getWExpression());
		wVariableDeclarationEClass.getESuperTypes().add(this.getWExpression());
		wAssignmentEClass.getESuperTypes().add(this.getWExpression());
		wBinaryOperationEClass.getESuperTypes().add(this.getWExpression());
		wUnaryOperationEClass.getESuperTypes().add(this.getWExpression());
		wPostfixOperationEClass.getESuperTypes().add(this.getWExpression());
		wMemberFeatureCallEClass.getESuperTypes().add(this.getWExpression());
		wSelfEClass.getESuperTypes().add(this.getWExpression());
		wSuperInvocationEClass.getESuperTypes().add(this.getWExpression());
		wBlockExpressionEClass.getESuperTypes().add(this.getWExpression());
		wBooleanLiteralEClass.getESuperTypes().add(this.getWExpression());
		wNullLiteralEClass.getESuperTypes().add(this.getWExpression());
		wStringLiteralEClass.getESuperTypes().add(this.getWExpression());
		wNumberLiteralEClass.getESuperTypes().add(this.getWExpression());
		wClosureEClass.getESuperTypes().add(this.getWExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(wFileEClass, WFile.class, "WFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWFile_Imports(), this.getImport(), null, "imports", null, 0, -1, WFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWFile_Elements(), this.getWLibraryElement(), null, "elements", null, 0, -1, WFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWFile_Main(), this.getWProgram(), null, "main", null, 0, 1, WFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWFile_Tests(), this.getWTest(), null, "tests", null, 0, -1, WFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWFile_Suites(), this.getWSuite(), null, "suites", null, 0, -1, WFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wProgramEClass, WProgram.class, "WProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, WProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWProgram_Elements(), this.getWExpression(), null, "elements", null, 0, -1, WProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wTestEClass, WTest.class, "WTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWTest_Name(), ecorePackage.getEString(), "name", null, 0, 1, WTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWTest_Elements(), this.getWExpression(), null, "elements", null, 0, -1, WTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wSuiteEClass, WSuite.class, "WSuite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWSuite_Name(), ecorePackage.getEString(), "name", null, 0, 1, WSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWSuite_Fixture(), this.getWFixture(), null, "fixture", null, 0, 1, WSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWSuite_Tests(), this.getWTest(), null, "tests", null, 0, -1, WSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wFixtureEClass, WFixture.class, "WFixture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWFixture_Elements(), this.getWExpression(), null, "elements", null, 0, -1, WFixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wPackageEClass, WPackage.class, "WPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWPackage_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, WPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wLibraryElementEClass, WLibraryElement.class, "WLibraryElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wNamedEClass, WNamed.class, "WNamed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWNamed_Name(), ecorePackage.getEString(), "name", null, 0, 1, WNamed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wMethodContainerEClass, WMethodContainer.class, "WMethodContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWMethodContainer_Members(), this.getWMember(), null, "members", null, 0, -1, WMethodContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wReferenciableEClass, WReferenciable.class, "WReferenciable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wExpressionEClass, WExpression.class, "WExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wMethodDeclarationEClass, WMethodDeclaration.class, "WMethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWMethodDeclaration_Overrides(), ecorePackage.getEBoolean(), "overrides", null, 0, 1, WMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMethodDeclaration_Parameters(), this.getWParameter(), null, "parameters", null, 0, -1, WMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMethodDeclaration_Native(), ecorePackage.getEBoolean(), "native", null, 0, 1, WMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMethodDeclaration_Expression(), this.getWExpression(), null, "expression", null, 0, 1, WMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMethodDeclaration_ExpressionReturns(), ecorePackage.getEBoolean(), "expressionReturns", null, 0, 1, WMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wParameterEClass, WParameter.class, "WParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWParameter_VarArg(), ecorePackage.getEBoolean(), "varArg", null, 0, 1, WParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wVariableEClass, WVariable.class, "WVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wFeatureCallEClass, WFeatureCall.class, "WFeatureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wVariableReferenceEClass, WVariableReference.class, "WVariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWVariableReference_Ref(), this.getWReferenciable(), null, "ref", null, 0, 1, WVariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wIfExpressionEClass, WIfExpression.class, "WIfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWIfExpression_Condition(), this.getWExpression(), null, "condition", null, 0, 1, WIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWIfExpression_Then(), this.getWExpression(), null, "then", null, 0, 1, WIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWIfExpression_Else(), this.getWExpression(), null, "else", null, 0, 1, WIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wCollectionLiteralEClass, WCollectionLiteral.class, "WCollectionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWCollectionLiteral_Elements(), this.getWExpression(), null, "elements", null, 0, -1, WCollectionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wListLiteralEClass, WListLiteral.class, "WListLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wSetLiteralEClass, WSetLiteral.class, "WSetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wNamedObjectEClass, WNamedObject.class, "WNamedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWNamedObject_Parent(), this.getWClass(), null, "parent", null, 0, 1, WNamedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWNamedObject_ParentParameters(), this.getWArgumentList(), null, "parentParameters", null, 0, 1, WNamedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWNamedObject_Mixins(), this.getWMixin(), null, "mixins", null, 0, -1, WNamedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wCanExtendClassEClass, WCanExtendClass.class, "WCanExtendClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wClassEClass, WClass.class, "WClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWClass_Parent(), this.getWClass(), null, "parent", null, 0, 1, WClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWClass_Mixins(), this.getWMixin(), null, "mixins", null, 0, -1, WClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWClass_Constructors(), this.getWConstructor(), null, "constructors", null, 0, -1, WClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wMixinEClass, WMixin.class, "WMixin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wMemberEClass, WMember.class, "WMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wConstructorEClass, WConstructor.class, "WConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWConstructor_Parameters(), this.getWParameter(), null, "parameters", null, 0, -1, WConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWConstructor_DelegatingConstructorCall(), this.getWDelegatingConstructorCall(), null, "delegatingConstructorCall", null, 0, 1, WConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWConstructor_Expression(), this.getWExpression(), null, "expression", null, 0, 1, WConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wDelegatingConstructorCallEClass, WDelegatingConstructorCall.class, "WDelegatingConstructorCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWDelegatingConstructorCall_ArgumentList(), this.getWPositionalArgumentsList(), null, "argumentList", null, 0, 1, WDelegatingConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wSelfDelegatingConstructorCallEClass, WSelfDelegatingConstructorCall.class, "WSelfDelegatingConstructorCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wSuperDelegatingConstructorCallEClass, WSuperDelegatingConstructorCall.class, "WSuperDelegatingConstructorCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wConstructorCallEClass, WConstructorCall.class, "WConstructorCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWConstructorCall_ClassRef(), this.getWClass(), null, "classRef", null, 0, 1, WConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWConstructorCall_ArgumentList(), this.getWArgumentList(), null, "argumentList", null, 0, 1, WConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWConstructorCall_Mixins(), this.getWMixin(), null, "mixins", null, 0, -1, WConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wArgumentListEClass, WArgumentList.class, "WArgumentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wNamedArgumentsListEClass, WNamedArgumentsList.class, "WNamedArgumentsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWNamedArgumentsList_Initializers(), this.getWInitializer(), null, "initializers", null, 0, -1, WNamedArgumentsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wPositionalArgumentsListEClass, WPositionalArgumentsList.class, "WPositionalArgumentsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWPositionalArgumentsList_Values(), this.getWExpression(), null, "values", null, 0, -1, WPositionalArgumentsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wInitializerEClass, WInitializer.class, "WInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWInitializer_Initializer(), this.getWVariable(), null, "initializer", null, 0, 1, WInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWInitializer_InitialValue(), this.getWExpression(), null, "initialValue", null, 0, 1, WInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wTryEClass, WTry.class, "WTry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWTry_Expression(), this.getWExpression(), null, "expression", null, 0, 1, WTry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWTry_CatchBlocks(), this.getWCatch(), null, "catchBlocks", null, 0, -1, WTry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWTry_AlwaysExpression(), this.getWExpression(), null, "alwaysExpression", null, 0, 1, WTry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wCatchEClass, WCatch.class, "WCatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWCatch_ExceptionVarName(), this.getWVariable(), null, "exceptionVarName", null, 0, 1, WCatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWCatch_ExceptionType(), this.getWClass(), null, "exceptionType", null, 0, 1, WCatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWCatch_Expression(), this.getWExpression(), null, "expression", null, 0, 1, WCatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wReturnExpressionEClass, WReturnExpression.class, "WReturnExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWReturnExpression_Expression(), this.getWExpression(), null, "expression", null, 0, 1, WReturnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wThrowEClass, WThrow.class, "WThrow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWThrow_Exception(), this.getWExpression(), null, "exception", null, 0, 1, WThrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wObjectLiteralEClass, WObjectLiteral.class, "WObjectLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWObjectLiteral_Parent(), this.getWClass(), null, "parent", null, 0, 1, WObjectLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWObjectLiteral_ParentParameters(), this.getWArgumentList(), null, "parentParameters", null, 0, 1, WObjectLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWObjectLiteral_Mixins(), this.getWMixin(), null, "mixins", null, 0, -1, WObjectLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wVariableDeclarationEClass, WVariableDeclaration.class, "WVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWVariableDeclaration_Writeable(), ecorePackage.getEBoolean(), "writeable", null, 0, 1, WVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWVariableDeclaration_Property(), ecorePackage.getEBoolean(), "property", null, 0, 1, WVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWVariableDeclaration_Variable(), this.getWVariable(), null, "variable", null, 0, 1, WVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWVariableDeclaration_Right(), this.getWExpression(), null, "right", null, 0, 1, WVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wAssignmentEClass, WAssignment.class, "WAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWAssignment_Feature(), this.getWVariableReference(), null, "feature", null, 0, 1, WAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWAssignment_Value(), this.getWExpression(), null, "value", null, 0, 1, WAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wBinaryOperationEClass, WBinaryOperation.class, "WBinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWBinaryOperation_LeftOperand(), this.getWExpression(), null, "leftOperand", null, 0, 1, WBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWBinaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, WBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWBinaryOperation_RightOperand(), this.getWExpression(), null, "rightOperand", null, 0, 1, WBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wUnaryOperationEClass, WUnaryOperation.class, "WUnaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWUnaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, WUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWUnaryOperation_Operand(), this.getWExpression(), null, "operand", null, 0, 1, WUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wPostfixOperationEClass, WPostfixOperation.class, "WPostfixOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWPostfixOperation_Operand(), this.getWExpression(), null, "operand", null, 0, 1, WPostfixOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWPostfixOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, WPostfixOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wMemberFeatureCallEClass, WMemberFeatureCall.class, "WMemberFeatureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWMemberFeatureCall_MemberCallTarget(), this.getWExpression(), null, "memberCallTarget", null, 0, 1, WMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMemberFeatureCall_NullSafe(), ecorePackage.getEBoolean(), "nullSafe", null, 0, 1, WMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMemberFeatureCall_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, WMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMemberFeatureCall_MemberCallArguments(), this.getWExpression(), null, "memberCallArguments", null, 0, -1, WMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wSelfEClass, WSelf.class, "WSelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wSuperInvocationEClass, WSuperInvocation.class, "WSuperInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWSuperInvocation_MemberCallArguments(), this.getWExpression(), null, "memberCallArguments", null, 0, -1, WSuperInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wBlockExpressionEClass, WBlockExpression.class, "WBlockExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWBlockExpression_Expressions(), this.getWExpression(), null, "expressions", null, 0, -1, WBlockExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wBooleanLiteralEClass, WBooleanLiteral.class, "WBooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWBooleanLiteral_IsTrue(), ecorePackage.getEBoolean(), "isTrue", null, 0, 1, WBooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wNullLiteralEClass, WNullLiteral.class, "WNullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wStringLiteralEClass, WStringLiteral.class, "WStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, WStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wNumberLiteralEClass, WNumberLiteral.class, "WNumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWNumberLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, WNumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wClosureEClass, WClosure.class, "WClosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWClosure_Parameters(), this.getWParameter(), null, "parameters", null, 0, -1, WClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWClosure_Expression(), this.getWExpression(), null, "expression", null, 0, 1, WClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WollokDslPackageImpl
