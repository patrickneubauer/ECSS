/**
 */
package pp2.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pp2.AdditiveExpression;
import pp2.AndExpression;
import pp2.AppendExpression;
import pp2.AssignmentExpression;
import pp2.AtExpression;
import pp2.AttributeOperation;
import pp2.AttributeOperations;
import pp2.BinaryExpression;
import pp2.BinaryOpExpression;
import pp2.Case;
import pp2.CaseExpression;
import pp2.CollectExpression;
import pp2.Definition;
import pp2.DefinitionArgument;
import pp2.DefinitionArgumentList;
import pp2.DoubleQuotedString;
import pp2.ElseExpression;
import pp2.ElseIfExpression;
import pp2.EqualityExpression;
import pp2.ExportedCollectQuery;
import pp2.ExprList;
import pp2.Expression;
import pp2.ExpressionBlock;
import pp2.ExpressionTE;
import pp2.FunctionCall;
import pp2.HashEntry;
import pp2.HostClassDefinition;
import pp2.ICollectQuery;
import pp2.IQuotedString;
import pp2.IfExpression;
import pp2.ImportExpression;
import pp2.InExpression;
import pp2.InterpolatedVariable;
import pp2.JavaLambda;
import pp2.Lambda;
import pp2.LiteralBoolean;
import pp2.LiteralClass;
import pp2.LiteralDefault;
import pp2.LiteralExpression;
import pp2.LiteralHash;
import pp2.LiteralList;
import pp2.LiteralName;
import pp2.LiteralNameOrReference;
import pp2.LiteralRegex;
import pp2.LiteralUndef;
import pp2.MatchingExpression;
import pp2.MethodCall;
import pp2.MultiplicativeExpression;
import pp2.NamedAccessExpression;
import pp2.NodeDefinition;
import pp2.OrExpression;
import pp2.ParameterizedExpression;
import pp2.ParenthesisedExpression;
import pp2.Pp2Factory;
import pp2.Pp2Package;
import pp2.PuppetManifest;
import pp2.RelationalExpression;
import pp2.RelationshipExpression;
import pp2.ResourceBody;
import pp2.ResourceExpression;
import pp2.RubyLambda;
import pp2.SelectorEntry;
import pp2.SelectorExpression;
import pp2.SeparatorExpression;
import pp2.ShiftExpression;
import pp2.SingleQuotedString;
import pp2.StringExpression;
import pp2.TextExpression;
import pp2.UnaryExpression;
import pp2.UnaryMinusExpression;
import pp2.UnaryNotExpression;
import pp2.UnlessExpression;
import pp2.UnquotedString;
import pp2.VariableExpression;
import pp2.VariableTE;
import pp2.VerbatimTE;
import pp2.VirtualCollectQuery;
import pp2.VirtualNameOrReference;
import pp2.WithLambdaExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pp2PackageImpl extends EPackageImpl implements Pp2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puppetManifestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCollectQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualCollectQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportedCollectQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostClassDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionArgumentListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalNameOrReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalHashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalUndefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalRegexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appendExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicativeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOpExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryMinusExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryNotExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseIfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNameOrReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parenthesisedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exprListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleQuotedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleQuotedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unquotedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iQuotedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interpolatedVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbatimTEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionTEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlessExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedAccessExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withLambdaExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaLambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rubyLambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass separatorExpressionEClass = null;

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
	 * @see pp2.Pp2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Pp2PackageImpl() {
		super(eNS_URI, Pp2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Pp2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Pp2Package init() {
		if (isInited) return (Pp2Package)EPackage.Registry.INSTANCE.getEPackage(Pp2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredPp2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Pp2PackageImpl thePp2Package = registeredPp2Package instanceof Pp2PackageImpl ? (Pp2PackageImpl)registeredPp2Package : new Pp2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePp2Package.createPackageContents();

		// Initialize created meta-data
		thePp2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePp2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Pp2Package.eNS_URI, thePp2Package);
		return thePp2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPuppetManifest() {
		return puppetManifestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceBody() {
		return resourceBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceBody_Attributes() {
		return (EReference)resourceBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceBody_NameExpr() {
		return (EReference)resourceBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeOperation() {
		return attributeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeOperation_Value() {
		return (EReference)attributeOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeOperation_Key() {
		return (EAttribute)attributeOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeOperation_Op() {
		return (EAttribute)attributeOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeOperations() {
		return attributeOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeOperations_Attributes() {
		return (EReference)attributeOperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getICollectQuery() {
		return iCollectQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualCollectQuery() {
		return virtualCollectQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExportedCollectQuery() {
		return exportedCollectQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHostClassDefinition() {
		return hostClassDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHostClassDefinition_Parent() {
		return (EReference)hostClassDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinition_ClassName() {
		return (EAttribute)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_Arguments() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionArgumentList() {
		return definitionArgumentListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionArgumentList_Arguments() {
		return (EReference)definitionArgumentListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionArgument() {
		return definitionArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionArgument_PuppetType() {
		return (EReference)definitionArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinitionArgument_ArgName() {
		return (EAttribute)definitionArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionArgument_Value() {
		return (EReference)definitionArgumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinitionArgument_Op() {
		return (EAttribute)definitionArgumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaseExpression() {
		return caseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseExpression_SwitchExpr() {
		return (EReference)caseExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseExpression_Cases() {
		return (EReference)caseExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCase_Values() {
		return (EReference)caseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfExpression() {
		return ifExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfExpression_CondExpr() {
		return (EReference)ifExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfExpression_ElseStatement() {
		return (EReference)ifExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralExpression() {
		return literalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralNameOrReference() {
		return literalNameOrReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralNameOrReference_Value() {
		return (EAttribute)literalNameOrReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceExpression() {
		return resourceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceExpression_ResourceExpr() {
		return (EReference)resourceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceExpression_ResourceData() {
		return (EReference)resourceExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportExpression() {
		return importExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportExpression_Values() {
		return (EReference)importExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralList() {
		return literalListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLiteralList_Elements() {
		return (EReference)literalListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralHash() {
		return literalHashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLiteralHash_Elements() {
		return (EReference)literalHashEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHashEntry() {
		return hashEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHashEntry_Key() {
		return (EReference)hashEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHashEntry_Value() {
		return (EReference)hashEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralBoolean() {
		return literalBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralBoolean_Value() {
		return (EAttribute)literalBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralUndef() {
		return literalUndefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralDefault() {
		return literalDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralRegex() {
		return literalRegexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralRegex_Value() {
		return (EAttribute)literalRegexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralName() {
		return literalNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralName_Value() {
		return (EAttribute)literalNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableExpression() {
		return variableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableExpression_VarName() {
		return (EAttribute)variableExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipExpression() {
		return relationshipExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignmentExpression() {
		return assignmentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppendExpression() {
		return appendExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrExpression() {
		return orExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndExpression() {
		return andExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationalExpression() {
		return relationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEqualityExpression() {
		return equalityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShiftExpression() {
		return shiftExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditiveExpression() {
		return additiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplicativeExpression() {
		return multiplicativeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatchingExpression() {
		return matchingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInExpression() {
		return inExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtExpression() {
		return atExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollectExpression() {
		return collectExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectExpression_ClassReference() {
		return (EReference)collectExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectExpression_Query() {
		return (EReference)collectExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectExpression_Attributes() {
		return (EReference)collectExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectorExpression() {
		return selectorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectorEntry() {
		return selectorEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionCall() {
		return functionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryOpExpression() {
		return binaryOpExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryOpExpression_OpName() {
		return (EAttribute)binaryOpExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryExpression_LeftExpr() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryExpression_RightExpr() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedExpression() {
		return parameterizedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedExpression_LeftExpr() {
		return (EReference)parameterizedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedExpression_Parameters() {
		return (EReference)parameterizedExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeDefinition() {
		return nodeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeDefinition_HostNames() {
		return (EReference)nodeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeDefinition_ParentName() {
		return (EReference)nodeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryExpression_Expr() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryMinusExpression() {
		return unaryMinusExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryNotExpression() {
		return unaryNotExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionBlock() {
		return expressionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressionBlock_Statements() {
		return (EReference)expressionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElseExpression() {
		return elseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElseIfExpression() {
		return elseIfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualNameOrReference() {
		return virtualNameOrReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVirtualNameOrReference_Value() {
		return (EAttribute)virtualNameOrReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVirtualNameOrReference_Exported() {
		return (EAttribute)virtualNameOrReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParenthesisedExpression() {
		return parenthesisedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParenthesisedExpression_Expr() {
		return (EReference)parenthesisedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExprList() {
		return exprListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExprList_Expressions() {
		return (EReference)exprListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoubleQuotedString() {
		return doubleQuotedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoubleQuotedString_StringPart() {
		return (EReference)doubleQuotedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleQuotedString() {
		return singleQuotedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleQuotedString_Text() {
		return (EAttribute)singleQuotedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringExpression() {
		return stringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnquotedString() {
		return unquotedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnquotedString_Expression() {
		return (EReference)unquotedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIQuotedString() {
		return iQuotedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterpolatedVariable() {
		return interpolatedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterpolatedVariable_VarName() {
		return (EAttribute)interpolatedVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextExpression() {
		return textExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerbatimTE() {
		return verbatimTEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbatimTE_Text() {
		return (EAttribute)verbatimTEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionTE() {
		return expressionTEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressionTE_Expression() {
		return (EReference)expressionTEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableTE() {
		return variableTEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableTE_VarName() {
		return (EAttribute)variableTEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralClass() {
		return literalClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnlessExpression() {
		return unlessExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnlessExpression_CondExpr() {
		return (EReference)unlessExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnlessExpression_ElseStatement() {
		return (EReference)unlessExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambda() {
		return lambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLambda_Arguments() {
		return (EReference)lambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedAccessExpression() {
		return namedAccessExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodCall() {
		return methodCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodCall_Parenthesized() {
		return (EAttribute)methodCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodCall_MethodExpr() {
		return (EReference)methodCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWithLambdaExpression() {
		return withLambdaExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWithLambdaExpression_Lambda() {
		return (EReference)withLambdaExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaLambda() {
		return javaLambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaLambda_Farrow() {
		return (EAttribute)javaLambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRubyLambda() {
		return rubyLambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeparatorExpression() {
		return separatorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pp2Factory getPp2Factory() {
		return (Pp2Factory)getEFactoryInstance();
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
		puppetManifestEClass = createEClass(PUPPET_MANIFEST);

		expressionEClass = createEClass(EXPRESSION);

		resourceBodyEClass = createEClass(RESOURCE_BODY);
		createEReference(resourceBodyEClass, RESOURCE_BODY__ATTRIBUTES);
		createEReference(resourceBodyEClass, RESOURCE_BODY__NAME_EXPR);

		attributeOperationEClass = createEClass(ATTRIBUTE_OPERATION);
		createEReference(attributeOperationEClass, ATTRIBUTE_OPERATION__VALUE);
		createEAttribute(attributeOperationEClass, ATTRIBUTE_OPERATION__KEY);
		createEAttribute(attributeOperationEClass, ATTRIBUTE_OPERATION__OP);

		attributeOperationsEClass = createEClass(ATTRIBUTE_OPERATIONS);
		createEReference(attributeOperationsEClass, ATTRIBUTE_OPERATIONS__ATTRIBUTES);

		iCollectQueryEClass = createEClass(ICOLLECT_QUERY);

		virtualCollectQueryEClass = createEClass(VIRTUAL_COLLECT_QUERY);

		exportedCollectQueryEClass = createEClass(EXPORTED_COLLECT_QUERY);

		hostClassDefinitionEClass = createEClass(HOST_CLASS_DEFINITION);
		createEReference(hostClassDefinitionEClass, HOST_CLASS_DEFINITION__PARENT);

		definitionEClass = createEClass(DEFINITION);
		createEAttribute(definitionEClass, DEFINITION__CLASS_NAME);
		createEReference(definitionEClass, DEFINITION__ARGUMENTS);

		definitionArgumentListEClass = createEClass(DEFINITION_ARGUMENT_LIST);
		createEReference(definitionArgumentListEClass, DEFINITION_ARGUMENT_LIST__ARGUMENTS);

		definitionArgumentEClass = createEClass(DEFINITION_ARGUMENT);
		createEReference(definitionArgumentEClass, DEFINITION_ARGUMENT__PUPPET_TYPE);
		createEAttribute(definitionArgumentEClass, DEFINITION_ARGUMENT__ARG_NAME);
		createEReference(definitionArgumentEClass, DEFINITION_ARGUMENT__VALUE);
		createEAttribute(definitionArgumentEClass, DEFINITION_ARGUMENT__OP);

		caseExpressionEClass = createEClass(CASE_EXPRESSION);
		createEReference(caseExpressionEClass, CASE_EXPRESSION__SWITCH_EXPR);
		createEReference(caseExpressionEClass, CASE_EXPRESSION__CASES);

		caseEClass = createEClass(CASE);
		createEReference(caseEClass, CASE__VALUES);

		ifExpressionEClass = createEClass(IF_EXPRESSION);
		createEReference(ifExpressionEClass, IF_EXPRESSION__COND_EXPR);
		createEReference(ifExpressionEClass, IF_EXPRESSION__ELSE_STATEMENT);

		literalExpressionEClass = createEClass(LITERAL_EXPRESSION);

		literalNameOrReferenceEClass = createEClass(LITERAL_NAME_OR_REFERENCE);
		createEAttribute(literalNameOrReferenceEClass, LITERAL_NAME_OR_REFERENCE__VALUE);

		resourceExpressionEClass = createEClass(RESOURCE_EXPRESSION);
		createEReference(resourceExpressionEClass, RESOURCE_EXPRESSION__RESOURCE_EXPR);
		createEReference(resourceExpressionEClass, RESOURCE_EXPRESSION__RESOURCE_DATA);

		importExpressionEClass = createEClass(IMPORT_EXPRESSION);
		createEReference(importExpressionEClass, IMPORT_EXPRESSION__VALUES);

		literalListEClass = createEClass(LITERAL_LIST);
		createEReference(literalListEClass, LITERAL_LIST__ELEMENTS);

		literalHashEClass = createEClass(LITERAL_HASH);
		createEReference(literalHashEClass, LITERAL_HASH__ELEMENTS);

		hashEntryEClass = createEClass(HASH_ENTRY);
		createEReference(hashEntryEClass, HASH_ENTRY__KEY);
		createEReference(hashEntryEClass, HASH_ENTRY__VALUE);

		literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
		createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__VALUE);

		literalUndefEClass = createEClass(LITERAL_UNDEF);

		literalDefaultEClass = createEClass(LITERAL_DEFAULT);

		literalRegexEClass = createEClass(LITERAL_REGEX);
		createEAttribute(literalRegexEClass, LITERAL_REGEX__VALUE);

		literalNameEClass = createEClass(LITERAL_NAME);
		createEAttribute(literalNameEClass, LITERAL_NAME__VALUE);

		variableExpressionEClass = createEClass(VARIABLE_EXPRESSION);
		createEAttribute(variableExpressionEClass, VARIABLE_EXPRESSION__VAR_NAME);

		relationshipExpressionEClass = createEClass(RELATIONSHIP_EXPRESSION);

		assignmentExpressionEClass = createEClass(ASSIGNMENT_EXPRESSION);

		appendExpressionEClass = createEClass(APPEND_EXPRESSION);

		orExpressionEClass = createEClass(OR_EXPRESSION);

		andExpressionEClass = createEClass(AND_EXPRESSION);

		relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);

		equalityExpressionEClass = createEClass(EQUALITY_EXPRESSION);

		shiftExpressionEClass = createEClass(SHIFT_EXPRESSION);

		additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);

		multiplicativeExpressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);

		matchingExpressionEClass = createEClass(MATCHING_EXPRESSION);

		inExpressionEClass = createEClass(IN_EXPRESSION);

		atExpressionEClass = createEClass(AT_EXPRESSION);

		collectExpressionEClass = createEClass(COLLECT_EXPRESSION);
		createEReference(collectExpressionEClass, COLLECT_EXPRESSION__CLASS_REFERENCE);
		createEReference(collectExpressionEClass, COLLECT_EXPRESSION__QUERY);
		createEReference(collectExpressionEClass, COLLECT_EXPRESSION__ATTRIBUTES);

		selectorExpressionEClass = createEClass(SELECTOR_EXPRESSION);

		selectorEntryEClass = createEClass(SELECTOR_ENTRY);

		functionCallEClass = createEClass(FUNCTION_CALL);

		binaryOpExpressionEClass = createEClass(BINARY_OP_EXPRESSION);
		createEAttribute(binaryOpExpressionEClass, BINARY_OP_EXPRESSION__OP_NAME);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT_EXPR);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT_EXPR);

		parameterizedExpressionEClass = createEClass(PARAMETERIZED_EXPRESSION);
		createEReference(parameterizedExpressionEClass, PARAMETERIZED_EXPRESSION__LEFT_EXPR);
		createEReference(parameterizedExpressionEClass, PARAMETERIZED_EXPRESSION__PARAMETERS);

		nodeDefinitionEClass = createEClass(NODE_DEFINITION);
		createEReference(nodeDefinitionEClass, NODE_DEFINITION__HOST_NAMES);
		createEReference(nodeDefinitionEClass, NODE_DEFINITION__PARENT_NAME);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__EXPR);

		unaryMinusExpressionEClass = createEClass(UNARY_MINUS_EXPRESSION);

		unaryNotExpressionEClass = createEClass(UNARY_NOT_EXPRESSION);

		expressionBlockEClass = createEClass(EXPRESSION_BLOCK);
		createEReference(expressionBlockEClass, EXPRESSION_BLOCK__STATEMENTS);

		elseExpressionEClass = createEClass(ELSE_EXPRESSION);

		elseIfExpressionEClass = createEClass(ELSE_IF_EXPRESSION);

		virtualNameOrReferenceEClass = createEClass(VIRTUAL_NAME_OR_REFERENCE);
		createEAttribute(virtualNameOrReferenceEClass, VIRTUAL_NAME_OR_REFERENCE__VALUE);
		createEAttribute(virtualNameOrReferenceEClass, VIRTUAL_NAME_OR_REFERENCE__EXPORTED);

		parenthesisedExpressionEClass = createEClass(PARENTHESISED_EXPRESSION);
		createEReference(parenthesisedExpressionEClass, PARENTHESISED_EXPRESSION__EXPR);

		exprListEClass = createEClass(EXPR_LIST);
		createEReference(exprListEClass, EXPR_LIST__EXPRESSIONS);

		doubleQuotedStringEClass = createEClass(DOUBLE_QUOTED_STRING);
		createEReference(doubleQuotedStringEClass, DOUBLE_QUOTED_STRING__STRING_PART);

		singleQuotedStringEClass = createEClass(SINGLE_QUOTED_STRING);
		createEAttribute(singleQuotedStringEClass, SINGLE_QUOTED_STRING__TEXT);

		stringExpressionEClass = createEClass(STRING_EXPRESSION);

		unquotedStringEClass = createEClass(UNQUOTED_STRING);
		createEReference(unquotedStringEClass, UNQUOTED_STRING__EXPRESSION);

		iQuotedStringEClass = createEClass(IQUOTED_STRING);

		interpolatedVariableEClass = createEClass(INTERPOLATED_VARIABLE);
		createEAttribute(interpolatedVariableEClass, INTERPOLATED_VARIABLE__VAR_NAME);

		textExpressionEClass = createEClass(TEXT_EXPRESSION);

		verbatimTEEClass = createEClass(VERBATIM_TE);
		createEAttribute(verbatimTEEClass, VERBATIM_TE__TEXT);

		expressionTEEClass = createEClass(EXPRESSION_TE);
		createEReference(expressionTEEClass, EXPRESSION_TE__EXPRESSION);

		variableTEEClass = createEClass(VARIABLE_TE);
		createEAttribute(variableTEEClass, VARIABLE_TE__VAR_NAME);

		literalClassEClass = createEClass(LITERAL_CLASS);

		unlessExpressionEClass = createEClass(UNLESS_EXPRESSION);
		createEReference(unlessExpressionEClass, UNLESS_EXPRESSION__COND_EXPR);
		createEReference(unlessExpressionEClass, UNLESS_EXPRESSION__ELSE_STATEMENT);

		lambdaEClass = createEClass(LAMBDA);
		createEReference(lambdaEClass, LAMBDA__ARGUMENTS);

		namedAccessExpressionEClass = createEClass(NAMED_ACCESS_EXPRESSION);

		methodCallEClass = createEClass(METHOD_CALL);
		createEAttribute(methodCallEClass, METHOD_CALL__PARENTHESIZED);
		createEReference(methodCallEClass, METHOD_CALL__METHOD_EXPR);

		withLambdaExpressionEClass = createEClass(WITH_LAMBDA_EXPRESSION);
		createEReference(withLambdaExpressionEClass, WITH_LAMBDA_EXPRESSION__LAMBDA);

		javaLambdaEClass = createEClass(JAVA_LAMBDA);
		createEAttribute(javaLambdaEClass, JAVA_LAMBDA__FARROW);

		rubyLambdaEClass = createEClass(RUBY_LAMBDA);

		separatorExpressionEClass = createEClass(SEPARATOR_EXPRESSION);
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
		puppetManifestEClass.getESuperTypes().add(this.getExpressionBlock());
		virtualCollectQueryEClass.getESuperTypes().add(this.getUnaryExpression());
		virtualCollectQueryEClass.getESuperTypes().add(this.getICollectQuery());
		exportedCollectQueryEClass.getESuperTypes().add(this.getUnaryExpression());
		exportedCollectQueryEClass.getESuperTypes().add(this.getICollectQuery());
		hostClassDefinitionEClass.getESuperTypes().add(this.getDefinition());
		definitionEClass.getESuperTypes().add(this.getExpressionBlock());
		caseExpressionEClass.getESuperTypes().add(this.getExpression());
		caseEClass.getESuperTypes().add(this.getExpressionBlock());
		ifExpressionEClass.getESuperTypes().add(this.getExpressionBlock());
		literalExpressionEClass.getESuperTypes().add(this.getExpression());
		literalNameOrReferenceEClass.getESuperTypes().add(this.getLiteralExpression());
		resourceExpressionEClass.getESuperTypes().add(this.getExpression());
		importExpressionEClass.getESuperTypes().add(this.getExpression());
		literalListEClass.getESuperTypes().add(this.getLiteralExpression());
		literalHashEClass.getESuperTypes().add(this.getLiteralExpression());
		literalBooleanEClass.getESuperTypes().add(this.getLiteralExpression());
		literalUndefEClass.getESuperTypes().add(this.getLiteralExpression());
		literalDefaultEClass.getESuperTypes().add(this.getLiteralExpression());
		literalRegexEClass.getESuperTypes().add(this.getLiteralExpression());
		literalNameEClass.getESuperTypes().add(this.getLiteralExpression());
		variableExpressionEClass.getESuperTypes().add(this.getExpression());
		relationshipExpressionEClass.getESuperTypes().add(this.getBinaryOpExpression());
		assignmentExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		appendExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		orExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		andExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		relationalExpressionEClass.getESuperTypes().add(this.getBinaryOpExpression());
		equalityExpressionEClass.getESuperTypes().add(this.getBinaryOpExpression());
		shiftExpressionEClass.getESuperTypes().add(this.getBinaryOpExpression());
		additiveExpressionEClass.getESuperTypes().add(this.getBinaryOpExpression());
		multiplicativeExpressionEClass.getESuperTypes().add(this.getBinaryOpExpression());
		matchingExpressionEClass.getESuperTypes().add(this.getBinaryOpExpression());
		inExpressionEClass.getESuperTypes().add(this.getBinaryOpExpression());
		atExpressionEClass.getESuperTypes().add(this.getParameterizedExpression());
		collectExpressionEClass.getESuperTypes().add(this.getExpression());
		selectorExpressionEClass.getESuperTypes().add(this.getParameterizedExpression());
		selectorEntryEClass.getESuperTypes().add(this.getBinaryExpression());
		functionCallEClass.getESuperTypes().add(this.getWithLambdaExpression());
		binaryOpExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		parameterizedExpressionEClass.getESuperTypes().add(this.getExpression());
		nodeDefinitionEClass.getESuperTypes().add(this.getExpressionBlock());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryMinusExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		unaryNotExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		expressionBlockEClass.getESuperTypes().add(this.getExpression());
		elseExpressionEClass.getESuperTypes().add(this.getExpressionBlock());
		elseIfExpressionEClass.getESuperTypes().add(this.getIfExpression());
		virtualNameOrReferenceEClass.getESuperTypes().add(this.getLiteralExpression());
		parenthesisedExpressionEClass.getESuperTypes().add(this.getExpression());
		exprListEClass.getESuperTypes().add(this.getExpression());
		doubleQuotedStringEClass.getESuperTypes().add(this.getStringExpression());
		doubleQuotedStringEClass.getESuperTypes().add(this.getIQuotedString());
		singleQuotedStringEClass.getESuperTypes().add(this.getStringExpression());
		singleQuotedStringEClass.getESuperTypes().add(this.getIQuotedString());
		stringExpressionEClass.getESuperTypes().add(this.getExpression());
		unquotedStringEClass.getESuperTypes().add(this.getStringExpression());
		interpolatedVariableEClass.getESuperTypes().add(this.getExpression());
		verbatimTEEClass.getESuperTypes().add(this.getTextExpression());
		expressionTEEClass.getESuperTypes().add(this.getTextExpression());
		variableTEEClass.getESuperTypes().add(this.getTextExpression());
		literalClassEClass.getESuperTypes().add(this.getLiteralExpression());
		unlessExpressionEClass.getESuperTypes().add(this.getExpressionBlock());
		lambdaEClass.getESuperTypes().add(this.getExpressionBlock());
		namedAccessExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		methodCallEClass.getESuperTypes().add(this.getWithLambdaExpression());
		withLambdaExpressionEClass.getESuperTypes().add(this.getParameterizedExpression());
		javaLambdaEClass.getESuperTypes().add(this.getLambda());
		rubyLambdaEClass.getESuperTypes().add(this.getLambda());
		separatorExpressionEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(puppetManifestEClass, PuppetManifest.class, "PuppetManifest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceBodyEClass, ResourceBody.class, "ResourceBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceBody_Attributes(), this.getAttributeOperations(), null, "attributes", null, 0, 1, ResourceBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceBody_NameExpr(), this.getExpression(), null, "nameExpr", null, 0, 1, ResourceBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeOperationEClass, AttributeOperation.class, "AttributeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeOperation_Value(), this.getExpression(), null, "value", null, 0, 1, AttributeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeOperation_Key(), ecorePackage.getEString(), "key", null, 0, 1, AttributeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeOperation_Op(), ecorePackage.getEString(), "op", null, 0, 1, AttributeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeOperationsEClass, AttributeOperations.class, "AttributeOperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeOperations_Attributes(), this.getAttributeOperation(), null, "attributes", null, 0, -1, AttributeOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iCollectQueryEClass, ICollectQuery.class, "ICollectQuery", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualCollectQueryEClass, VirtualCollectQuery.class, "VirtualCollectQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exportedCollectQueryEClass, ExportedCollectQuery.class, "ExportedCollectQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hostClassDefinitionEClass, HostClassDefinition.class, "HostClassDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostClassDefinition_Parent(), this.getLiteralExpression(), null, "parent", null, 0, 1, HostClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefinition_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_Arguments(), this.getDefinitionArgumentList(), null, "arguments", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionArgumentListEClass, DefinitionArgumentList.class, "DefinitionArgumentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionArgumentList_Arguments(), this.getDefinitionArgument(), null, "arguments", null, 0, -1, DefinitionArgumentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionArgumentEClass, DefinitionArgument.class, "DefinitionArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionArgument_PuppetType(), this.getExpression(), null, "puppetType", null, 0, 1, DefinitionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitionArgument_ArgName(), ecorePackage.getEString(), "argName", null, 0, 1, DefinitionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionArgument_Value(), this.getExpression(), null, "value", null, 0, 1, DefinitionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitionArgument_Op(), ecorePackage.getEString(), "op", null, 0, 1, DefinitionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseExpressionEClass, CaseExpression.class, "CaseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseExpression_SwitchExpr(), this.getExpression(), null, "switchExpr", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseExpression_Cases(), this.getCase(), null, "cases", null, 0, -1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase_Values(), this.getExpression(), null, "values", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifExpressionEClass, IfExpression.class, "IfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfExpression_CondExpr(), this.getExpression(), null, "condExpr", null, 0, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfExpression_ElseStatement(), this.getExpression(), null, "elseStatement", null, 0, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalNameOrReferenceEClass, LiteralNameOrReference.class, "LiteralNameOrReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralNameOrReference_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralNameOrReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceExpressionEClass, ResourceExpression.class, "ResourceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceExpression_ResourceExpr(), this.getExpression(), null, "resourceExpr", null, 0, 1, ResourceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceExpression_ResourceData(), this.getResourceBody(), null, "resourceData", null, 0, -1, ResourceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importExpressionEClass, ImportExpression.class, "ImportExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportExpression_Values(), this.getIQuotedString(), null, "values", null, 0, -1, ImportExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalListEClass, LiteralList.class, "LiteralList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralList_Elements(), this.getExpression(), null, "elements", null, 0, -1, LiteralList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalHashEClass, LiteralHash.class, "LiteralHash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralHash_Elements(), this.getHashEntry(), null, "elements", null, 0, -1, LiteralHash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hashEntryEClass, HashEntry.class, "HashEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHashEntry_Key(), this.getExpression(), null, "key", null, 0, 1, HashEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHashEntry_Value(), this.getExpression(), null, "value", null, 0, 1, HashEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, LiteralBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalUndefEClass, LiteralUndef.class, "LiteralUndef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalDefaultEClass, LiteralDefault.class, "LiteralDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalRegexEClass, LiteralRegex.class, "LiteralRegex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralRegex_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralRegex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalNameEClass, LiteralName.class, "LiteralName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralName_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableExpressionEClass, VariableExpression.class, "VariableExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableExpression_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, VariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipExpressionEClass, RelationshipExpression.class, "RelationshipExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentExpressionEClass, AssignmentExpression.class, "AssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appendExpressionEClass, AppendExpression.class, "AppendExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalityExpressionEClass, EqualityExpression.class, "EqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shiftExpressionEClass, ShiftExpression.class, "ShiftExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additiveExpressionEClass, AdditiveExpression.class, "AdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicativeExpressionEClass, MultiplicativeExpression.class, "MultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matchingExpressionEClass, MatchingExpression.class, "MatchingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inExpressionEClass, InExpression.class, "InExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atExpressionEClass, AtExpression.class, "AtExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectExpressionEClass, CollectExpression.class, "CollectExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectExpression_ClassReference(), this.getExpression(), null, "classReference", null, 0, 1, CollectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectExpression_Query(), this.getICollectQuery(), null, "query", null, 0, 1, CollectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectExpression_Attributes(), this.getAttributeOperations(), null, "attributes", null, 0, 1, CollectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorExpressionEClass, SelectorExpression.class, "SelectorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectorEntryEClass, SelectorEntry.class, "SelectorEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryOpExpressionEClass, BinaryOpExpression.class, "BinaryOpExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryOpExpression_OpName(), ecorePackage.getEString(), "opName", null, 0, 1, BinaryOpExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_LeftExpr(), this.getExpression(), null, "leftExpr", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_RightExpr(), this.getExpression(), null, "rightExpr", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterizedExpressionEClass, ParameterizedExpression.class, "ParameterizedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizedExpression_LeftExpr(), this.getExpression(), null, "leftExpr", null, 0, 1, ParameterizedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterizedExpression_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, ParameterizedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeDefinitionEClass, NodeDefinition.class, "NodeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeDefinition_HostNames(), this.getExpression(), null, "hostNames", null, 0, -1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeDefinition_ParentName(), this.getExpression(), null, "parentName", null, 0, 1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Expr(), this.getExpression(), null, "expr", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryMinusExpressionEClass, UnaryMinusExpression.class, "UnaryMinusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryNotExpressionEClass, UnaryNotExpression.class, "UnaryNotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionBlockEClass, ExpressionBlock.class, "ExpressionBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionBlock_Statements(), this.getExpression(), null, "statements", null, 0, -1, ExpressionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseExpressionEClass, ElseExpression.class, "ElseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elseIfExpressionEClass, ElseIfExpression.class, "ElseIfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualNameOrReferenceEClass, VirtualNameOrReference.class, "VirtualNameOrReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualNameOrReference_Value(), ecorePackage.getEString(), "value", null, 0, 1, VirtualNameOrReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualNameOrReference_Exported(), ecorePackage.getEBoolean(), "exported", null, 0, 1, VirtualNameOrReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parenthesisedExpressionEClass, ParenthesisedExpression.class, "ParenthesisedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParenthesisedExpression_Expr(), this.getExpression(), null, "expr", null, 0, 1, ParenthesisedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exprListEClass, ExprList.class, "ExprList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExprList_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, ExprList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleQuotedStringEClass, DoubleQuotedString.class, "DoubleQuotedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoubleQuotedString_StringPart(), this.getTextExpression(), null, "stringPart", null, 0, -1, DoubleQuotedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleQuotedStringEClass, SingleQuotedString.class, "SingleQuotedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleQuotedString_Text(), ecorePackage.getEString(), "text", null, 0, 1, SingleQuotedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unquotedStringEClass, UnquotedString.class, "UnquotedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnquotedString_Expression(), this.getExpression(), null, "expression", null, 0, 1, UnquotedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iQuotedStringEClass, IQuotedString.class, "IQuotedString", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interpolatedVariableEClass, InterpolatedVariable.class, "InterpolatedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterpolatedVariable_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, InterpolatedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textExpressionEClass, TextExpression.class, "TextExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verbatimTEEClass, VerbatimTE.class, "VerbatimTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerbatimTE_Text(), ecorePackage.getEString(), "text", null, 0, 1, VerbatimTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionTEEClass, ExpressionTE.class, "ExpressionTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionTE_Expression(), this.getExpression(), null, "expression", null, 0, 1, ExpressionTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableTEEClass, VariableTE.class, "VariableTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableTE_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, VariableTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalClassEClass, LiteralClass.class, "LiteralClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unlessExpressionEClass, UnlessExpression.class, "UnlessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnlessExpression_CondExpr(), this.getExpression(), null, "condExpr", null, 0, 1, UnlessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnlessExpression_ElseStatement(), this.getExpression(), null, "elseStatement", null, 0, 1, UnlessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaEClass, Lambda.class, "Lambda", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLambda_Arguments(), this.getDefinitionArgumentList(), null, "arguments", null, 0, 1, Lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedAccessExpressionEClass, NamedAccessExpression.class, "NamedAccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodCallEClass, MethodCall.class, "MethodCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodCall_Parenthesized(), ecorePackage.getEBoolean(), "parenthesized", null, 0, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodCall_MethodExpr(), this.getExpression(), null, "methodExpr", null, 1, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(withLambdaExpressionEClass, WithLambdaExpression.class, "WithLambdaExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWithLambdaExpression_Lambda(), this.getLambda(), null, "lambda", null, 0, 1, WithLambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaLambdaEClass, JavaLambda.class, "JavaLambda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaLambda_Farrow(), ecorePackage.getEBoolean(), "farrow", null, 0, 1, JavaLambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rubyLambdaEClass, RubyLambda.class, "RubyLambda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(separatorExpressionEClass, SeparatorExpression.class, "SeparatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Pp2PackageImpl
