/**
 */
package pp1.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pp1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pp1.Pp1Package
 * @generated
 */
public class Pp1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Pp1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pp1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Pp1Package.eINSTANCE;
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
	protected Pp1Switch<Adapter> modelSwitch =
		new Pp1Switch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link pp1.PuppetManifest <em>Puppet Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.PuppetManifest
	 * @generated
	 */
	public Adapter createPuppetManifestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ResourceBody <em>Resource Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ResourceBody
	 * @generated
	 */
	public Adapter createResourceBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.AttributeOperation <em>Attribute Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.AttributeOperation
	 * @generated
	 */
	public Adapter createAttributeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.AttributeOperations <em>Attribute Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.AttributeOperations
	 * @generated
	 */
	public Adapter createAttributeOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ICollectQuery <em>ICollect Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ICollectQuery
	 * @generated
	 */
	public Adapter createICollectQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.VirtualCollectQuery <em>Virtual Collect Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.VirtualCollectQuery
	 * @generated
	 */
	public Adapter createVirtualCollectQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ExportedCollectQuery <em>Exported Collect Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ExportedCollectQuery
	 * @generated
	 */
	public Adapter createExportedCollectQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.HostClassDefinition <em>Host Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.HostClassDefinition
	 * @generated
	 */
	public Adapter createHostClassDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.DefinitionArgumentList <em>Definition Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.DefinitionArgumentList
	 * @generated
	 */
	public Adapter createDefinitionArgumentListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.DefinitionArgument <em>Definition Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.DefinitionArgument
	 * @generated
	 */
	public Adapter createDefinitionArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.CaseExpression <em>Case Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.CaseExpression
	 * @generated
	 */
	public Adapter createCaseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.Case
	 * @generated
	 */
	public Adapter createCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.IfExpression
	 * @generated
	 */
	public Adapter createIfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.LiteralExpression
	 * @generated
	 */
	public Adapter createLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.LiteralNameOrReference <em>Literal Name Or Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.LiteralNameOrReference
	 * @generated
	 */
	public Adapter createLiteralNameOrReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ResourceExpression <em>Resource Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ResourceExpression
	 * @generated
	 */
	public Adapter createResourceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ImportExpression <em>Import Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ImportExpression
	 * @generated
	 */
	public Adapter createImportExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.LiteralList <em>Literal List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.LiteralList
	 * @generated
	 */
	public Adapter createLiteralListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.LiteralHash <em>Literal Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.LiteralHash
	 * @generated
	 */
	public Adapter createLiteralHashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.HashEntry <em>Hash Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.HashEntry
	 * @generated
	 */
	public Adapter createHashEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.LiteralBoolean
	 * @generated
	 */
	public Adapter createLiteralBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.LiteralUndef <em>Literal Undef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.LiteralUndef
	 * @generated
	 */
	public Adapter createLiteralUndefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.LiteralDefault <em>Literal Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.LiteralDefault
	 * @generated
	 */
	public Adapter createLiteralDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.LiteralRegex <em>Literal Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.LiteralRegex
	 * @generated
	 */
	public Adapter createLiteralRegexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.LiteralName <em>Literal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.LiteralName
	 * @generated
	 */
	public Adapter createLiteralNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.VariableExpression <em>Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.VariableExpression
	 * @generated
	 */
	public Adapter createVariableExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.RelationshipExpression <em>Relationship Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.RelationshipExpression
	 * @generated
	 */
	public Adapter createRelationshipExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.AssignmentExpression <em>Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.AssignmentExpression
	 * @generated
	 */
	public Adapter createAssignmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.AppendExpression <em>Append Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.AppendExpression
	 * @generated
	 */
	public Adapter createAppendExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.OrExpression
	 * @generated
	 */
	public Adapter createOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.AndExpression
	 * @generated
	 */
	public Adapter createAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.RelationalExpression
	 * @generated
	 */
	public Adapter createRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.EqualityExpression
	 * @generated
	 */
	public Adapter createEqualityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ShiftExpression <em>Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ShiftExpression
	 * @generated
	 */
	public Adapter createShiftExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.AdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.AdditiveExpression
	 * @generated
	 */
	public Adapter createAdditiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.MultiplicativeExpression
	 * @generated
	 */
	public Adapter createMultiplicativeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.MatchingExpression <em>Matching Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.MatchingExpression
	 * @generated
	 */
	public Adapter createMatchingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.InExpression <em>In Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.InExpression
	 * @generated
	 */
	public Adapter createInExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.AtExpression <em>At Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.AtExpression
	 * @generated
	 */
	public Adapter createAtExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.CollectExpression <em>Collect Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.CollectExpression
	 * @generated
	 */
	public Adapter createCollectExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.SelectorExpression <em>Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.SelectorExpression
	 * @generated
	 */
	public Adapter createSelectorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.SelectorEntry <em>Selector Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.SelectorEntry
	 * @generated
	 */
	public Adapter createSelectorEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.FunctionCall
	 * @generated
	 */
	public Adapter createFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.BinaryOpExpression <em>Binary Op Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.BinaryOpExpression
	 * @generated
	 */
	public Adapter createBinaryOpExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ParameterizedExpression <em>Parameterized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ParameterizedExpression
	 * @generated
	 */
	public Adapter createParameterizedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.NodeDefinition <em>Node Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.NodeDefinition
	 * @generated
	 */
	public Adapter createNodeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.UnaryMinusExpression <em>Unary Minus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.UnaryMinusExpression
	 * @generated
	 */
	public Adapter createUnaryMinusExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.UnaryNotExpression <em>Unary Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.UnaryNotExpression
	 * @generated
	 */
	public Adapter createUnaryNotExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ExpressionBlock <em>Expression Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ExpressionBlock
	 * @generated
	 */
	public Adapter createExpressionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ElseExpression
	 * @generated
	 */
	public Adapter createElseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ElseIfExpression <em>Else If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ElseIfExpression
	 * @generated
	 */
	public Adapter createElseIfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.VirtualNameOrReference <em>Virtual Name Or Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.VirtualNameOrReference
	 * @generated
	 */
	public Adapter createVirtualNameOrReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ParenthesisedExpression <em>Parenthesised Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ParenthesisedExpression
	 * @generated
	 */
	public Adapter createParenthesisedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ExprList <em>Expr List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ExprList
	 * @generated
	 */
	public Adapter createExprListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.DoubleQuotedString <em>Double Quoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.DoubleQuotedString
	 * @generated
	 */
	public Adapter createDoubleQuotedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.SingleQuotedString <em>Single Quoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.SingleQuotedString
	 * @generated
	 */
	public Adapter createSingleQuotedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.StringExpression
	 * @generated
	 */
	public Adapter createStringExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.UnquotedString <em>Unquoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.UnquotedString
	 * @generated
	 */
	public Adapter createUnquotedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.IQuotedString <em>IQuoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.IQuotedString
	 * @generated
	 */
	public Adapter createIQuotedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.InterpolatedVariable <em>Interpolated Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.InterpolatedVariable
	 * @generated
	 */
	public Adapter createInterpolatedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.TextExpression <em>Text Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.TextExpression
	 * @generated
	 */
	public Adapter createTextExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.VerbatimTE <em>Verbatim TE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.VerbatimTE
	 * @generated
	 */
	public Adapter createVerbatimTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.ExpressionTE <em>Expression TE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.ExpressionTE
	 * @generated
	 */
	public Adapter createExpressionTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.VariableTE <em>Variable TE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.VariableTE
	 * @generated
	 */
	public Adapter createVariableTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.LiteralClass <em>Literal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.LiteralClass
	 * @generated
	 */
	public Adapter createLiteralClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.UnlessExpression <em>Unless Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.UnlessExpression
	 * @generated
	 */
	public Adapter createUnlessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.Lambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.Lambda
	 * @generated
	 */
	public Adapter createLambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.NamedAccessExpression <em>Named Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.NamedAccessExpression
	 * @generated
	 */
	public Adapter createNamedAccessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.MethodCall
	 * @generated
	 */
	public Adapter createMethodCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.WithLambdaExpression <em>With Lambda Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.WithLambdaExpression
	 * @generated
	 */
	public Adapter createWithLambdaExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.JavaLambda <em>Java Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.JavaLambda
	 * @generated
	 */
	public Adapter createJavaLambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.RubyLambda <em>Ruby Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.RubyLambda
	 * @generated
	 */
	public Adapter createRubyLambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pp1.SeparatorExpression <em>Separator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pp1.SeparatorExpression
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

} //Pp1AdapterFactory
