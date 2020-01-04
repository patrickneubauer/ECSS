/**
 */
package pp2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pp2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pp2FactoryImpl extends EFactoryImpl implements Pp2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Pp2Factory init() {
		try {
			Pp2Factory thePp2Factory = (Pp2Factory)EPackage.Registry.INSTANCE.getEFactory(Pp2Package.eNS_URI);
			if (thePp2Factory != null) {
				return thePp2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Pp2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pp2FactoryImpl() {
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
			case Pp2Package.PUPPET_MANIFEST: return createPuppetManifest();
			case Pp2Package.EXPRESSION: return createExpression();
			case Pp2Package.RESOURCE_BODY: return createResourceBody();
			case Pp2Package.ATTRIBUTE_OPERATION: return createAttributeOperation();
			case Pp2Package.ATTRIBUTE_OPERATIONS: return createAttributeOperations();
			case Pp2Package.VIRTUAL_COLLECT_QUERY: return createVirtualCollectQuery();
			case Pp2Package.EXPORTED_COLLECT_QUERY: return createExportedCollectQuery();
			case Pp2Package.HOST_CLASS_DEFINITION: return createHostClassDefinition();
			case Pp2Package.DEFINITION: return createDefinition();
			case Pp2Package.DEFINITION_ARGUMENT_LIST: return createDefinitionArgumentList();
			case Pp2Package.DEFINITION_ARGUMENT: return createDefinitionArgument();
			case Pp2Package.CASE_EXPRESSION: return createCaseExpression();
			case Pp2Package.CASE: return createCase();
			case Pp2Package.IF_EXPRESSION: return createIfExpression();
			case Pp2Package.LITERAL_NAME_OR_REFERENCE: return createLiteralNameOrReference();
			case Pp2Package.RESOURCE_EXPRESSION: return createResourceExpression();
			case Pp2Package.IMPORT_EXPRESSION: return createImportExpression();
			case Pp2Package.LITERAL_LIST: return createLiteralList();
			case Pp2Package.LITERAL_HASH: return createLiteralHash();
			case Pp2Package.HASH_ENTRY: return createHashEntry();
			case Pp2Package.LITERAL_BOOLEAN: return createLiteralBoolean();
			case Pp2Package.LITERAL_UNDEF: return createLiteralUndef();
			case Pp2Package.LITERAL_DEFAULT: return createLiteralDefault();
			case Pp2Package.LITERAL_REGEX: return createLiteralRegex();
			case Pp2Package.LITERAL_NAME: return createLiteralName();
			case Pp2Package.VARIABLE_EXPRESSION: return createVariableExpression();
			case Pp2Package.RELATIONSHIP_EXPRESSION: return createRelationshipExpression();
			case Pp2Package.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
			case Pp2Package.APPEND_EXPRESSION: return createAppendExpression();
			case Pp2Package.OR_EXPRESSION: return createOrExpression();
			case Pp2Package.AND_EXPRESSION: return createAndExpression();
			case Pp2Package.RELATIONAL_EXPRESSION: return createRelationalExpression();
			case Pp2Package.EQUALITY_EXPRESSION: return createEqualityExpression();
			case Pp2Package.SHIFT_EXPRESSION: return createShiftExpression();
			case Pp2Package.ADDITIVE_EXPRESSION: return createAdditiveExpression();
			case Pp2Package.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
			case Pp2Package.MATCHING_EXPRESSION: return createMatchingExpression();
			case Pp2Package.IN_EXPRESSION: return createInExpression();
			case Pp2Package.AT_EXPRESSION: return createAtExpression();
			case Pp2Package.COLLECT_EXPRESSION: return createCollectExpression();
			case Pp2Package.SELECTOR_EXPRESSION: return createSelectorExpression();
			case Pp2Package.SELECTOR_ENTRY: return createSelectorEntry();
			case Pp2Package.FUNCTION_CALL: return createFunctionCall();
			case Pp2Package.NODE_DEFINITION: return createNodeDefinition();
			case Pp2Package.UNARY_MINUS_EXPRESSION: return createUnaryMinusExpression();
			case Pp2Package.UNARY_NOT_EXPRESSION: return createUnaryNotExpression();
			case Pp2Package.ELSE_EXPRESSION: return createElseExpression();
			case Pp2Package.ELSE_IF_EXPRESSION: return createElseIfExpression();
			case Pp2Package.VIRTUAL_NAME_OR_REFERENCE: return createVirtualNameOrReference();
			case Pp2Package.PARENTHESISED_EXPRESSION: return createParenthesisedExpression();
			case Pp2Package.EXPR_LIST: return createExprList();
			case Pp2Package.DOUBLE_QUOTED_STRING: return createDoubleQuotedString();
			case Pp2Package.SINGLE_QUOTED_STRING: return createSingleQuotedString();
			case Pp2Package.UNQUOTED_STRING: return createUnquotedString();
			case Pp2Package.INTERPOLATED_VARIABLE: return createInterpolatedVariable();
			case Pp2Package.VERBATIM_TE: return createVerbatimTE();
			case Pp2Package.EXPRESSION_TE: return createExpressionTE();
			case Pp2Package.VARIABLE_TE: return createVariableTE();
			case Pp2Package.LITERAL_CLASS: return createLiteralClass();
			case Pp2Package.UNLESS_EXPRESSION: return createUnlessExpression();
			case Pp2Package.NAMED_ACCESS_EXPRESSION: return createNamedAccessExpression();
			case Pp2Package.METHOD_CALL: return createMethodCall();
			case Pp2Package.WITH_LAMBDA_EXPRESSION: return createWithLambdaExpression();
			case Pp2Package.JAVA_LAMBDA: return createJavaLambda();
			case Pp2Package.RUBY_LAMBDA: return createRubyLambda();
			case Pp2Package.SEPARATOR_EXPRESSION: return createSeparatorExpression();
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
	public PuppetManifest createPuppetManifest() {
		PuppetManifestImpl puppetManifest = new PuppetManifestImpl();
		return puppetManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceBody createResourceBody() {
		ResourceBodyImpl resourceBody = new ResourceBodyImpl();
		return resourceBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeOperation createAttributeOperation() {
		AttributeOperationImpl attributeOperation = new AttributeOperationImpl();
		return attributeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeOperations createAttributeOperations() {
		AttributeOperationsImpl attributeOperations = new AttributeOperationsImpl();
		return attributeOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualCollectQuery createVirtualCollectQuery() {
		VirtualCollectQueryImpl virtualCollectQuery = new VirtualCollectQueryImpl();
		return virtualCollectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExportedCollectQuery createExportedCollectQuery() {
		ExportedCollectQueryImpl exportedCollectQuery = new ExportedCollectQueryImpl();
		return exportedCollectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostClassDefinition createHostClassDefinition() {
		HostClassDefinitionImpl hostClassDefinition = new HostClassDefinitionImpl();
		return hostClassDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionArgumentList createDefinitionArgumentList() {
		DefinitionArgumentListImpl definitionArgumentList = new DefinitionArgumentListImpl();
		return definitionArgumentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionArgument createDefinitionArgument() {
		DefinitionArgumentImpl definitionArgument = new DefinitionArgumentImpl();
		return definitionArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseExpression createCaseExpression() {
		CaseExpressionImpl caseExpression = new CaseExpressionImpl();
		return caseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfExpression createIfExpression() {
		IfExpressionImpl ifExpression = new IfExpressionImpl();
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralNameOrReference createLiteralNameOrReference() {
		LiteralNameOrReferenceImpl literalNameOrReference = new LiteralNameOrReferenceImpl();
		return literalNameOrReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceExpression createResourceExpression() {
		ResourceExpressionImpl resourceExpression = new ResourceExpressionImpl();
		return resourceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportExpression createImportExpression() {
		ImportExpressionImpl importExpression = new ImportExpressionImpl();
		return importExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralList createLiteralList() {
		LiteralListImpl literalList = new LiteralListImpl();
		return literalList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralHash createLiteralHash() {
		LiteralHashImpl literalHash = new LiteralHashImpl();
		return literalHash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashEntry createHashEntry() {
		HashEntryImpl hashEntry = new HashEntryImpl();
		return hashEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralBoolean createLiteralBoolean() {
		LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
		return literalBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralUndef createLiteralUndef() {
		LiteralUndefImpl literalUndef = new LiteralUndefImpl();
		return literalUndef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralDefault createLiteralDefault() {
		LiteralDefaultImpl literalDefault = new LiteralDefaultImpl();
		return literalDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralRegex createLiteralRegex() {
		LiteralRegexImpl literalRegex = new LiteralRegexImpl();
		return literalRegex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralName createLiteralName() {
		LiteralNameImpl literalName = new LiteralNameImpl();
		return literalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableExpression createVariableExpression() {
		VariableExpressionImpl variableExpression = new VariableExpressionImpl();
		return variableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipExpression createRelationshipExpression() {
		RelationshipExpressionImpl relationshipExpression = new RelationshipExpressionImpl();
		return relationshipExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignmentExpression createAssignmentExpression() {
		AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
		return assignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppendExpression createAppendExpression() {
		AppendExpressionImpl appendExpression = new AppendExpressionImpl();
		return appendExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrExpression createOrExpression() {
		OrExpressionImpl orExpression = new OrExpressionImpl();
		return orExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndExpression createAndExpression() {
		AndExpressionImpl andExpression = new AndExpressionImpl();
		return andExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationalExpression createRelationalExpression() {
		RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EqualityExpression createEqualityExpression() {
		EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
		return equalityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShiftExpression createShiftExpression() {
		ShiftExpressionImpl shiftExpression = new ShiftExpressionImpl();
		return shiftExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditiveExpression createAdditiveExpression() {
		AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
		return additiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicativeExpression createMultiplicativeExpression() {
		MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
		return multiplicativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatchingExpression createMatchingExpression() {
		MatchingExpressionImpl matchingExpression = new MatchingExpressionImpl();
		return matchingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InExpression createInExpression() {
		InExpressionImpl inExpression = new InExpressionImpl();
		return inExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtExpression createAtExpression() {
		AtExpressionImpl atExpression = new AtExpressionImpl();
		return atExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectExpression createCollectExpression() {
		CollectExpressionImpl collectExpression = new CollectExpressionImpl();
		return collectExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectorExpression createSelectorExpression() {
		SelectorExpressionImpl selectorExpression = new SelectorExpressionImpl();
		return selectorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectorEntry createSelectorEntry() {
		SelectorEntryImpl selectorEntry = new SelectorEntryImpl();
		return selectorEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeDefinition createNodeDefinition() {
		NodeDefinitionImpl nodeDefinition = new NodeDefinitionImpl();
		return nodeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryMinusExpression createUnaryMinusExpression() {
		UnaryMinusExpressionImpl unaryMinusExpression = new UnaryMinusExpressionImpl();
		return unaryMinusExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryNotExpression createUnaryNotExpression() {
		UnaryNotExpressionImpl unaryNotExpression = new UnaryNotExpressionImpl();
		return unaryNotExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElseExpression createElseExpression() {
		ElseExpressionImpl elseExpression = new ElseExpressionImpl();
		return elseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElseIfExpression createElseIfExpression() {
		ElseIfExpressionImpl elseIfExpression = new ElseIfExpressionImpl();
		return elseIfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualNameOrReference createVirtualNameOrReference() {
		VirtualNameOrReferenceImpl virtualNameOrReference = new VirtualNameOrReferenceImpl();
		return virtualNameOrReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParenthesisedExpression createParenthesisedExpression() {
		ParenthesisedExpressionImpl parenthesisedExpression = new ParenthesisedExpressionImpl();
		return parenthesisedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExprList createExprList() {
		ExprListImpl exprList = new ExprListImpl();
		return exprList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleQuotedString createDoubleQuotedString() {
		DoubleQuotedStringImpl doubleQuotedString = new DoubleQuotedStringImpl();
		return doubleQuotedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleQuotedString createSingleQuotedString() {
		SingleQuotedStringImpl singleQuotedString = new SingleQuotedStringImpl();
		return singleQuotedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnquotedString createUnquotedString() {
		UnquotedStringImpl unquotedString = new UnquotedStringImpl();
		return unquotedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterpolatedVariable createInterpolatedVariable() {
		InterpolatedVariableImpl interpolatedVariable = new InterpolatedVariableImpl();
		return interpolatedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerbatimTE createVerbatimTE() {
		VerbatimTEImpl verbatimTE = new VerbatimTEImpl();
		return verbatimTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionTE createExpressionTE() {
		ExpressionTEImpl expressionTE = new ExpressionTEImpl();
		return expressionTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableTE createVariableTE() {
		VariableTEImpl variableTE = new VariableTEImpl();
		return variableTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralClass createLiteralClass() {
		LiteralClassImpl literalClass = new LiteralClassImpl();
		return literalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlessExpression createUnlessExpression() {
		UnlessExpressionImpl unlessExpression = new UnlessExpressionImpl();
		return unlessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedAccessExpression createNamedAccessExpression() {
		NamedAccessExpressionImpl namedAccessExpression = new NamedAccessExpressionImpl();
		return namedAccessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodCall createMethodCall() {
		MethodCallImpl methodCall = new MethodCallImpl();
		return methodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WithLambdaExpression createWithLambdaExpression() {
		WithLambdaExpressionImpl withLambdaExpression = new WithLambdaExpressionImpl();
		return withLambdaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaLambda createJavaLambda() {
		JavaLambdaImpl javaLambda = new JavaLambdaImpl();
		return javaLambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RubyLambda createRubyLambda() {
		RubyLambdaImpl rubyLambda = new RubyLambdaImpl();
		return rubyLambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeparatorExpression createSeparatorExpression() {
		SeparatorExpressionImpl separatorExpression = new SeparatorExpressionImpl();
		return separatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pp2Package getPp2Package() {
		return (Pp2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Pp2Package getPackage() {
		return Pp2Package.eINSTANCE;
	}

} //Pp2FactoryImpl
