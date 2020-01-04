/**
 */
package pp1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pp1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pp1FactoryImpl extends EFactoryImpl implements Pp1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Pp1Factory init() {
		try {
			Pp1Factory thePp1Factory = (Pp1Factory)EPackage.Registry.INSTANCE.getEFactory(Pp1Package.eNS_URI);
			if (thePp1Factory != null) {
				return thePp1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Pp1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pp1FactoryImpl() {
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
			case Pp1Package.PUPPET_MANIFEST: return createPuppetManifest();
			case Pp1Package.EXPRESSION: return createExpression();
			case Pp1Package.RESOURCE_BODY: return createResourceBody();
			case Pp1Package.ATTRIBUTE_OPERATION: return createAttributeOperation();
			case Pp1Package.ATTRIBUTE_OPERATIONS: return createAttributeOperations();
			case Pp1Package.VIRTUAL_COLLECT_QUERY: return createVirtualCollectQuery();
			case Pp1Package.EXPORTED_COLLECT_QUERY: return createExportedCollectQuery();
			case Pp1Package.HOST_CLASS_DEFINITION: return createHostClassDefinition();
			case Pp1Package.DEFINITION: return createDefinition();
			case Pp1Package.DEFINITION_ARGUMENT_LIST: return createDefinitionArgumentList();
			case Pp1Package.DEFINITION_ARGUMENT: return createDefinitionArgument();
			case Pp1Package.CASE_EXPRESSION: return createCaseExpression();
			case Pp1Package.CASE: return createCase();
			case Pp1Package.IF_EXPRESSION: return createIfExpression();
			case Pp1Package.LITERAL_NAME_OR_REFERENCE: return createLiteralNameOrReference();
			case Pp1Package.RESOURCE_EXPRESSION: return createResourceExpression();
			case Pp1Package.IMPORT_EXPRESSION: return createImportExpression();
			case Pp1Package.LITERAL_LIST: return createLiteralList();
			case Pp1Package.LITERAL_HASH: return createLiteralHash();
			case Pp1Package.HASH_ENTRY: return createHashEntry();
			case Pp1Package.LITERAL_BOOLEAN: return createLiteralBoolean();
			case Pp1Package.LITERAL_UNDEF: return createLiteralUndef();
			case Pp1Package.LITERAL_DEFAULT: return createLiteralDefault();
			case Pp1Package.LITERAL_REGEX: return createLiteralRegex();
			case Pp1Package.LITERAL_NAME: return createLiteralName();
			case Pp1Package.VARIABLE_EXPRESSION: return createVariableExpression();
			case Pp1Package.RELATIONSHIP_EXPRESSION: return createRelationshipExpression();
			case Pp1Package.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
			case Pp1Package.APPEND_EXPRESSION: return createAppendExpression();
			case Pp1Package.OR_EXPRESSION: return createOrExpression();
			case Pp1Package.AND_EXPRESSION: return createAndExpression();
			case Pp1Package.RELATIONAL_EXPRESSION: return createRelationalExpression();
			case Pp1Package.EQUALITY_EXPRESSION: return createEqualityExpression();
			case Pp1Package.SHIFT_EXPRESSION: return createShiftExpression();
			case Pp1Package.ADDITIVE_EXPRESSION: return createAdditiveExpression();
			case Pp1Package.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
			case Pp1Package.MATCHING_EXPRESSION: return createMatchingExpression();
			case Pp1Package.IN_EXPRESSION: return createInExpression();
			case Pp1Package.AT_EXPRESSION: return createAtExpression();
			case Pp1Package.COLLECT_EXPRESSION: return createCollectExpression();
			case Pp1Package.SELECTOR_EXPRESSION: return createSelectorExpression();
			case Pp1Package.SELECTOR_ENTRY: return createSelectorEntry();
			case Pp1Package.FUNCTION_CALL: return createFunctionCall();
			case Pp1Package.NODE_DEFINITION: return createNodeDefinition();
			case Pp1Package.UNARY_MINUS_EXPRESSION: return createUnaryMinusExpression();
			case Pp1Package.UNARY_NOT_EXPRESSION: return createUnaryNotExpression();
			case Pp1Package.ELSE_EXPRESSION: return createElseExpression();
			case Pp1Package.ELSE_IF_EXPRESSION: return createElseIfExpression();
			case Pp1Package.VIRTUAL_NAME_OR_REFERENCE: return createVirtualNameOrReference();
			case Pp1Package.PARENTHESISED_EXPRESSION: return createParenthesisedExpression();
			case Pp1Package.EXPR_LIST: return createExprList();
			case Pp1Package.DOUBLE_QUOTED_STRING: return createDoubleQuotedString();
			case Pp1Package.SINGLE_QUOTED_STRING: return createSingleQuotedString();
			case Pp1Package.UNQUOTED_STRING: return createUnquotedString();
			case Pp1Package.INTERPOLATED_VARIABLE: return createInterpolatedVariable();
			case Pp1Package.VERBATIM_TE: return createVerbatimTE();
			case Pp1Package.EXPRESSION_TE: return createExpressionTE();
			case Pp1Package.VARIABLE_TE: return createVariableTE();
			case Pp1Package.LITERAL_CLASS: return createLiteralClass();
			case Pp1Package.UNLESS_EXPRESSION: return createUnlessExpression();
			case Pp1Package.NAMED_ACCESS_EXPRESSION: return createNamedAccessExpression();
			case Pp1Package.METHOD_CALL: return createMethodCall();
			case Pp1Package.WITH_LAMBDA_EXPRESSION: return createWithLambdaExpression();
			case Pp1Package.JAVA_LAMBDA: return createJavaLambda();
			case Pp1Package.RUBY_LAMBDA: return createRubyLambda();
			case Pp1Package.SEPARATOR_EXPRESSION: return createSeparatorExpression();
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
	public Pp1Package getPp1Package() {
		return (Pp1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Pp1Package getPackage() {
		return Pp1Package.eINSTANCE;
	}

} //Pp1FactoryImpl
