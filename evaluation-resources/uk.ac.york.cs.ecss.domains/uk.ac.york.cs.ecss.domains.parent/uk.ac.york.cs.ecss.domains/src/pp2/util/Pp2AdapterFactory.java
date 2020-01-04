/**
 */
package pp2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pp2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pp2.Pp2Package
 * @generated
 */
public class Pp2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Pp2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pp2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Pp2Package.eINSTANCE;
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
	protected Pp2Switch<Adapter> modelSwitch =
		new Pp2Switch<Adapter>() {
			@Override
			public Adapter casePuppetManifest(PuppetManifest object) {
				return createPuppetManifestAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseResourceBody(ResourceBody object) {
				return createResourceBodyAdapter();
			}
			@Override
			public Adapter caseAttributeOperation(AttributeOperation object) {
				return createAttributeOperationAdapter();
			}
			@Override
			public Adapter caseAttributeOperations(AttributeOperations object) {
				return createAttributeOperationsAdapter();
			}
			@Override
			public Adapter caseICollectQuery(ICollectQuery object) {
				return createICollectQueryAdapter();
			}
			@Override
			public Adapter caseVirtualCollectQuery(VirtualCollectQuery object) {
				return createVirtualCollectQueryAdapter();
			}
			@Override
			public Adapter caseExportedCollectQuery(ExportedCollectQuery object) {
				return createExportedCollectQueryAdapter();
			}
			@Override
			public Adapter caseHostClassDefinition(HostClassDefinition object) {
				return createHostClassDefinitionAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter caseDefinitionArgumentList(DefinitionArgumentList object) {
				return createDefinitionArgumentListAdapter();
			}
			@Override
			public Adapter caseDefinitionArgument(DefinitionArgument object) {
				return createDefinitionArgumentAdapter();
			}
			@Override
			public Adapter caseCaseExpression(CaseExpression object) {
				return createCaseExpressionAdapter();
			}
			@Override
			public Adapter caseCase(Case object) {
				return createCaseAdapter();
			}
			@Override
			public Adapter caseIfExpression(IfExpression object) {
				return createIfExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralExpression(LiteralExpression object) {
				return createLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralNameOrReference(LiteralNameOrReference object) {
				return createLiteralNameOrReferenceAdapter();
			}
			@Override
			public Adapter caseResourceExpression(ResourceExpression object) {
				return createResourceExpressionAdapter();
			}
			@Override
			public Adapter caseImportExpression(ImportExpression object) {
				return createImportExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralList(LiteralList object) {
				return createLiteralListAdapter();
			}
			@Override
			public Adapter caseLiteralHash(LiteralHash object) {
				return createLiteralHashAdapter();
			}
			@Override
			public Adapter caseHashEntry(HashEntry object) {
				return createHashEntryAdapter();
			}
			@Override
			public Adapter caseLiteralBoolean(LiteralBoolean object) {
				return createLiteralBooleanAdapter();
			}
			@Override
			public Adapter caseLiteralUndef(LiteralUndef object) {
				return createLiteralUndefAdapter();
			}
			@Override
			public Adapter caseLiteralDefault(LiteralDefault object) {
				return createLiteralDefaultAdapter();
			}
			@Override
			public Adapter caseLiteralRegex(LiteralRegex object) {
				return createLiteralRegexAdapter();
			}
			@Override
			public Adapter caseLiteralName(LiteralName object) {
				return createLiteralNameAdapter();
			}
			@Override
			public Adapter caseVariableExpression(VariableExpression object) {
				return createVariableExpressionAdapter();
			}
			@Override
			public Adapter caseRelationshipExpression(RelationshipExpression object) {
				return createRelationshipExpressionAdapter();
			}
			@Override
			public Adapter caseAssignmentExpression(AssignmentExpression object) {
				return createAssignmentExpressionAdapter();
			}
			@Override
			public Adapter caseAppendExpression(AppendExpression object) {
				return createAppendExpressionAdapter();
			}
			@Override
			public Adapter caseOrExpression(OrExpression object) {
				return createOrExpressionAdapter();
			}
			@Override
			public Adapter caseAndExpression(AndExpression object) {
				return createAndExpressionAdapter();
			}
			@Override
			public Adapter caseRelationalExpression(RelationalExpression object) {
				return createRelationalExpressionAdapter();
			}
			@Override
			public Adapter caseEqualityExpression(EqualityExpression object) {
				return createEqualityExpressionAdapter();
			}
			@Override
			public Adapter caseShiftExpression(ShiftExpression object) {
				return createShiftExpressionAdapter();
			}
			@Override
			public Adapter caseAdditiveExpression(AdditiveExpression object) {
				return createAdditiveExpressionAdapter();
			}
			@Override
			public Adapter caseMultiplicativeExpression(MultiplicativeExpression object) {
				return createMultiplicativeExpressionAdapter();
			}
			@Override
			public Adapter caseMatchingExpression(MatchingExpression object) {
				return createMatchingExpressionAdapter();
			}
			@Override
			public Adapter caseInExpression(InExpression object) {
				return createInExpressionAdapter();
			}
			@Override
			public Adapter caseAtExpression(AtExpression object) {
				return createAtExpressionAdapter();
			}
			@Override
			public Adapter caseCollectExpression(CollectExpression object) {
				return createCollectExpressionAdapter();
			}
			@Override
			public Adapter caseSelectorExpression(SelectorExpression object) {
				return createSelectorExpressionAdapter();
			}
			@Override
			public Adapter caseSelectorEntry(SelectorEntry object) {
				return createSelectorEntryAdapter();
			}
			@Override
			public Adapter caseFunctionCall(FunctionCall object) {
				return createFunctionCallAdapter();
			}
			@Override
			public Adapter caseBinaryOpExpression(BinaryOpExpression object) {
				return createBinaryOpExpressionAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseParameterizedExpression(ParameterizedExpression object) {
				return createParameterizedExpressionAdapter();
			}
			@Override
			public Adapter caseNodeDefinition(NodeDefinition object) {
				return createNodeDefinitionAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryMinusExpression(UnaryMinusExpression object) {
				return createUnaryMinusExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryNotExpression(UnaryNotExpression object) {
				return createUnaryNotExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionBlock(ExpressionBlock object) {
				return createExpressionBlockAdapter();
			}
			@Override
			public Adapter caseElseExpression(ElseExpression object) {
				return createElseExpressionAdapter();
			}
			@Override
			public Adapter caseElseIfExpression(ElseIfExpression object) {
				return createElseIfExpressionAdapter();
			}
			@Override
			public Adapter caseVirtualNameOrReference(VirtualNameOrReference object) {
				return createVirtualNameOrReferenceAdapter();
			}
			@Override
			public Adapter caseParenthesisedExpression(ParenthesisedExpression object) {
				return createParenthesisedExpressionAdapter();
			}
			@Override
			public Adapter caseExprList(ExprList object) {
				return createExprListAdapter();
			}
			@Override
			public Adapter caseDoubleQuotedString(DoubleQuotedString object) {
				return createDoubleQuotedStringAdapter();
			}
			@Override
			public Adapter caseSingleQuotedString(SingleQuotedString object) {
				return createSingleQuotedStringAdapter();
			}
			@Override
			public Adapter caseStringExpression(StringExpression object) {
				return createStringExpressionAdapter();
			}
			@Override
			public Adapter caseUnquotedString(UnquotedString object) {
				return createUnquotedStringAdapter();
			}
			@Override
			public Adapter caseIQuotedString(IQuotedString object) {
				return createIQuotedStringAdapter();
			}
			@Override
			public Adapter caseInterpolatedVariable(InterpolatedVariable object) {
				return createInterpolatedVariableAdapter();
			}
			@Override
			public Adapter caseTextExpression(TextExpression object) {
				return createTextExpressionAdapter();
			}
			@Override
			public Adapter caseVerbatimTE(VerbatimTE object) {
				return createVerbatimTEAdapter();
			}
			@Override
			public Adapter caseExpressionTE(ExpressionTE object) {
				return createExpressionTEAdapter();
			}
			@Override
			public Adapter caseVariableTE(VariableTE object) {
				return createVariableTEAdapter();
			}
			@Override
			public Adapter caseLiteralClass(LiteralClass object) {
				return createLiteralClassAdapter();
			}
			@Override
			public Adapter caseUnlessExpression(UnlessExpression object) {
				return createUnlessExpressionAdapter();
			}
			@Override
			public Adapter caseLambda(Lambda object) {
				return createLambdaAdapter();
			}
			@Override
			public Adapter caseNamedAccessExpression(NamedAccessExpression object) {
				return createNamedAccessExpressionAdapter();
			}
			@Override
			public Adapter caseMethodCall(MethodCall object) {
				return createMethodCallAdapter();
			}
			@Override
			public Adapter caseWithLambdaExpression(WithLambdaExpression object) {
				return createWithLambdaExpressionAdapter();
			}
			@Override
			public Adapter caseJavaLambda(JavaLambda object) {
				return createJavaLambdaAdapter();
			}
			@Override
			public Adapter caseRubyLambda(RubyLambda object) {
				return createRubyLambdaAdapter();
			}
			@Override
			public Adapter caseSeparatorExpression(SeparatorExpression object) {
				return createSeparatorExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link pp2.PuppetManifest <em>Puppet Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.PuppetManifest
	 * @generated
	 */
	public Adapter createPuppetManifestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ResourceBody <em>Resource Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ResourceBody
	 * @generated
	 */
	public Adapter createResourceBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.AttributeOperation <em>Attribute Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.AttributeOperation
	 * @generated
	 */
	public Adapter createAttributeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.AttributeOperations <em>Attribute Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.AttributeOperations
	 * @generated
	 */
	public Adapter createAttributeOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ICollectQuery <em>ICollect Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ICollectQuery
	 * @generated
	 */
	public Adapter createICollectQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.VirtualCollectQuery <em>Virtual Collect Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.VirtualCollectQuery
	 * @generated
	 */
	public Adapter createVirtualCollectQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ExportedCollectQuery <em>Exported Collect Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ExportedCollectQuery
	 * @generated
	 */
	public Adapter createExportedCollectQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.HostClassDefinition <em>Host Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.HostClassDefinition
	 * @generated
	 */
	public Adapter createHostClassDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.DefinitionArgumentList <em>Definition Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.DefinitionArgumentList
	 * @generated
	 */
	public Adapter createDefinitionArgumentListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.DefinitionArgument <em>Definition Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.DefinitionArgument
	 * @generated
	 */
	public Adapter createDefinitionArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.CaseExpression <em>Case Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.CaseExpression
	 * @generated
	 */
	public Adapter createCaseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.Case
	 * @generated
	 */
	public Adapter createCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.IfExpression
	 * @generated
	 */
	public Adapter createIfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.LiteralExpression
	 * @generated
	 */
	public Adapter createLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.LiteralNameOrReference <em>Literal Name Or Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.LiteralNameOrReference
	 * @generated
	 */
	public Adapter createLiteralNameOrReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ResourceExpression <em>Resource Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ResourceExpression
	 * @generated
	 */
	public Adapter createResourceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ImportExpression <em>Import Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ImportExpression
	 * @generated
	 */
	public Adapter createImportExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.LiteralList <em>Literal List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.LiteralList
	 * @generated
	 */
	public Adapter createLiteralListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.LiteralHash <em>Literal Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.LiteralHash
	 * @generated
	 */
	public Adapter createLiteralHashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.HashEntry <em>Hash Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.HashEntry
	 * @generated
	 */
	public Adapter createHashEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.LiteralBoolean
	 * @generated
	 */
	public Adapter createLiteralBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.LiteralUndef <em>Literal Undef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.LiteralUndef
	 * @generated
	 */
	public Adapter createLiteralUndefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.LiteralDefault <em>Literal Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.LiteralDefault
	 * @generated
	 */
	public Adapter createLiteralDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.LiteralRegex <em>Literal Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.LiteralRegex
	 * @generated
	 */
	public Adapter createLiteralRegexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.LiteralName <em>Literal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.LiteralName
	 * @generated
	 */
	public Adapter createLiteralNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.VariableExpression <em>Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.VariableExpression
	 * @generated
	 */
	public Adapter createVariableExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.RelationshipExpression <em>Relationship Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.RelationshipExpression
	 * @generated
	 */
	public Adapter createRelationshipExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.AssignmentExpression <em>Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.AssignmentExpression
	 * @generated
	 */
	public Adapter createAssignmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.AppendExpression <em>Append Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.AppendExpression
	 * @generated
	 */
	public Adapter createAppendExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.OrExpression
	 * @generated
	 */
	public Adapter createOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.AndExpression
	 * @generated
	 */
	public Adapter createAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.RelationalExpression
	 * @generated
	 */
	public Adapter createRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.EqualityExpression
	 * @generated
	 */
	public Adapter createEqualityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ShiftExpression <em>Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ShiftExpression
	 * @generated
	 */
	public Adapter createShiftExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.AdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.AdditiveExpression
	 * @generated
	 */
	public Adapter createAdditiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.MultiplicativeExpression
	 * @generated
	 */
	public Adapter createMultiplicativeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.MatchingExpression <em>Matching Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.MatchingExpression
	 * @generated
	 */
	public Adapter createMatchingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.InExpression <em>In Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.InExpression
	 * @generated
	 */
	public Adapter createInExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.AtExpression <em>At Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.AtExpression
	 * @generated
	 */
	public Adapter createAtExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.CollectExpression <em>Collect Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.CollectExpression
	 * @generated
	 */
	public Adapter createCollectExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.SelectorExpression <em>Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.SelectorExpression
	 * @generated
	 */
	public Adapter createSelectorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.SelectorEntry <em>Selector Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.SelectorEntry
	 * @generated
	 */
	public Adapter createSelectorEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.FunctionCall
	 * @generated
	 */
	public Adapter createFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.BinaryOpExpression <em>Binary Op Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.BinaryOpExpression
	 * @generated
	 */
	public Adapter createBinaryOpExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ParameterizedExpression <em>Parameterized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ParameterizedExpression
	 * @generated
	 */
	public Adapter createParameterizedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.NodeDefinition <em>Node Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.NodeDefinition
	 * @generated
	 */
	public Adapter createNodeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.UnaryMinusExpression <em>Unary Minus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.UnaryMinusExpression
	 * @generated
	 */
	public Adapter createUnaryMinusExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.UnaryNotExpression <em>Unary Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.UnaryNotExpression
	 * @generated
	 */
	public Adapter createUnaryNotExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ExpressionBlock <em>Expression Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ExpressionBlock
	 * @generated
	 */
	public Adapter createExpressionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ElseExpression
	 * @generated
	 */
	public Adapter createElseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ElseIfExpression <em>Else If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ElseIfExpression
	 * @generated
	 */
	public Adapter createElseIfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.VirtualNameOrReference <em>Virtual Name Or Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.VirtualNameOrReference
	 * @generated
	 */
	public Adapter createVirtualNameOrReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ParenthesisedExpression <em>Parenthesised Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ParenthesisedExpression
	 * @generated
	 */
	public Adapter createParenthesisedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ExprList <em>Expr List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ExprList
	 * @generated
	 */
	public Adapter createExprListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.DoubleQuotedString <em>Double Quoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.DoubleQuotedString
	 * @generated
	 */
	public Adapter createDoubleQuotedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.SingleQuotedString <em>Single Quoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.SingleQuotedString
	 * @generated
	 */
	public Adapter createSingleQuotedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.StringExpression
	 * @generated
	 */
	public Adapter createStringExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.UnquotedString <em>Unquoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.UnquotedString
	 * @generated
	 */
	public Adapter createUnquotedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.IQuotedString <em>IQuoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.IQuotedString
	 * @generated
	 */
	public Adapter createIQuotedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.InterpolatedVariable <em>Interpolated Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.InterpolatedVariable
	 * @generated
	 */
	public Adapter createInterpolatedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.TextExpression <em>Text Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.TextExpression
	 * @generated
	 */
	public Adapter createTextExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.VerbatimTE <em>Verbatim TE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.VerbatimTE
	 * @generated
	 */
	public Adapter createVerbatimTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.ExpressionTE <em>Expression TE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.ExpressionTE
	 * @generated
	 */
	public Adapter createExpressionTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.VariableTE <em>Variable TE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.VariableTE
	 * @generated
	 */
	public Adapter createVariableTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.LiteralClass <em>Literal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.LiteralClass
	 * @generated
	 */
	public Adapter createLiteralClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.UnlessExpression <em>Unless Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.UnlessExpression
	 * @generated
	 */
	public Adapter createUnlessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.Lambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.Lambda
	 * @generated
	 */
	public Adapter createLambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.NamedAccessExpression <em>Named Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.NamedAccessExpression
	 * @generated
	 */
	public Adapter createNamedAccessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.MethodCall
	 * @generated
	 */
	public Adapter createMethodCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.WithLambdaExpression <em>With Lambda Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.WithLambdaExpression
	 * @generated
	 */
	public Adapter createWithLambdaExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.JavaLambda <em>Java Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.JavaLambda
	 * @generated
	 */
	public Adapter createJavaLambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.RubyLambda <em>Ruby Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.RubyLambda
	 * @generated
	 */
	public Adapter createRubyLambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp2.SeparatorExpression <em>Separator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp2.SeparatorExpression
	 * @generated
	 */
	public Adapter createSeparatorExpressionAdapter() {
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

} //Pp2AdapterFactory
