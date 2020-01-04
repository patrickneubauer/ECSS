/**
 */
package wML.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import wML.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see wML.WMLPackage
 * @generated
 */
public class WMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WMLPackage.eINSTANCE;
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
	protected WMLSwitch<Adapter> modelSwitch =
		new WMLSwitch<Adapter>() {
			@Override
			public Adapter caseWMLRoot(WMLRoot object) {
				return createWMLRootAdapter();
			}
			@Override
			public Adapter caseWMLGrammarElement(WMLGrammarElement object) {
				return createWMLGrammarElementAdapter();
			}
			@Override
			public Adapter caseWMLTag(WMLTag object) {
				return createWMLTagAdapter();
			}
			@Override
			public Adapter caseWMLKey(WMLKey object) {
				return createWMLKeyAdapter();
			}
			@Override
			public Adapter caseWMLKeyValue(WMLKeyValue object) {
				return createWMLKeyValueAdapter();
			}
			@Override
			public Adapter caseWMLMacroCall(WMLMacroCall object) {
				return createWMLMacroCallAdapter();
			}
			@Override
			public Adapter caseWMLMacroCallParameter(WMLMacroCallParameter object) {
				return createWMLMacroCallParameterAdapter();
			}
			@Override
			public Adapter caseWMLArrayCall(WMLArrayCall object) {
				return createWMLArrayCallAdapter();
			}
			@Override
			public Adapter caseWMLMacroDefine(WMLMacroDefine object) {
				return createWMLMacroDefineAdapter();
			}
			@Override
			public Adapter caseWMLPreprocIF(WMLPreprocIF object) {
				return createWMLPreprocIFAdapter();
			}
			@Override
			public Adapter caseWMLRootExpression(WMLRootExpression object) {
				return createWMLRootExpressionAdapter();
			}
			@Override
			public Adapter caseWMLExpression(WMLExpression object) {
				return createWMLExpressionAdapter();
			}
			@Override
			public Adapter caseWMLValuedExpression(WMLValuedExpression object) {
				return createWMLValuedExpressionAdapter();
			}
			@Override
			public Adapter caseWMLTextdomain(WMLTextdomain object) {
				return createWMLTextdomainAdapter();
			}
			@Override
			public Adapter caseWMLLuaCode(WMLLuaCode object) {
				return createWMLLuaCodeAdapter();
			}
			@Override
			public Adapter caseWMLMacroParameter(WMLMacroParameter object) {
				return createWMLMacroParameterAdapter();
			}
			@Override
			public Adapter caseWMLValue(WMLValue object) {
				return createWMLValueAdapter();
			}
			@Override
			public Adapter caseMacroTokens(MacroTokens object) {
				return createMacroTokensAdapter();
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
	 * Creates a new adapter for an object of class '{@link wML.WMLRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLRoot
	 * @generated
	 */
	public Adapter createWMLRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLGrammarElement <em>Grammar Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLGrammarElement
	 * @generated
	 */
	public Adapter createWMLGrammarElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLTag
	 * @generated
	 */
	public Adapter createWMLTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLKey
	 * @generated
	 */
	public Adapter createWMLKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLKeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLKeyValue
	 * @generated
	 */
	public Adapter createWMLKeyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLMacroCall <em>Macro Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLMacroCall
	 * @generated
	 */
	public Adapter createWMLMacroCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLMacroCallParameter <em>Macro Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLMacroCallParameter
	 * @generated
	 */
	public Adapter createWMLMacroCallParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLArrayCall <em>Array Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLArrayCall
	 * @generated
	 */
	public Adapter createWMLArrayCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLMacroDefine <em>Macro Define</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLMacroDefine
	 * @generated
	 */
	public Adapter createWMLMacroDefineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLPreprocIF <em>Preproc IF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLPreprocIF
	 * @generated
	 */
	public Adapter createWMLPreprocIFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLRootExpression <em>Root Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLRootExpression
	 * @generated
	 */
	public Adapter createWMLRootExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLExpression
	 * @generated
	 */
	public Adapter createWMLExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLValuedExpression <em>Valued Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLValuedExpression
	 * @generated
	 */
	public Adapter createWMLValuedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLTextdomain <em>Textdomain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLTextdomain
	 * @generated
	 */
	public Adapter createWMLTextdomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLLuaCode <em>Lua Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLLuaCode
	 * @generated
	 */
	public Adapter createWMLLuaCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLMacroParameter <em>Macro Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLMacroParameter
	 * @generated
	 */
	public Adapter createWMLMacroParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.WMLValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.WMLValue
	 * @generated
	 */
	public Adapter createWMLValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wML.MacroTokens <em>Macro Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wML.MacroTokens
	 * @generated
	 */
	public Adapter createMacroTokensAdapter() {
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

} //WMLAdapterFactory
