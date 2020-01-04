/**
 */
package wML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WMLFactoryImpl extends EFactoryImpl implements WMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WMLFactory init() {
		try {
			WMLFactory theWMLFactory = (WMLFactory)EPackage.Registry.INSTANCE.getEFactory(WMLPackage.eNS_URI);
			if (theWMLFactory != null) {
				return theWMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WMLFactoryImpl() {
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
			case WMLPackage.WML_ROOT: return createWMLRoot();
			case WMLPackage.WML_GRAMMAR_ELEMENT: return createWMLGrammarElement();
			case WMLPackage.WML_TAG: return createWMLTag();
			case WMLPackage.WML_KEY: return createWMLKey();
			case WMLPackage.WML_KEY_VALUE: return createWMLKeyValue();
			case WMLPackage.WML_MACRO_CALL: return createWMLMacroCall();
			case WMLPackage.WML_MACRO_CALL_PARAMETER: return createWMLMacroCallParameter();
			case WMLPackage.WML_ARRAY_CALL: return createWMLArrayCall();
			case WMLPackage.WML_MACRO_DEFINE: return createWMLMacroDefine();
			case WMLPackage.WML_PREPROC_IF: return createWMLPreprocIF();
			case WMLPackage.WML_ROOT_EXPRESSION: return createWMLRootExpression();
			case WMLPackage.WML_EXPRESSION: return createWMLExpression();
			case WMLPackage.WML_VALUED_EXPRESSION: return createWMLValuedExpression();
			case WMLPackage.WML_TEXTDOMAIN: return createWMLTextdomain();
			case WMLPackage.WML_LUA_CODE: return createWMLLuaCode();
			case WMLPackage.WML_MACRO_PARAMETER: return createWMLMacroParameter();
			case WMLPackage.WML_VALUE: return createWMLValue();
			case WMLPackage.MACRO_TOKENS: return createMacroTokens();
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
	public WMLRoot createWMLRoot() {
		WMLRootImpl wmlRoot = new WMLRootImpl();
		return wmlRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLGrammarElement createWMLGrammarElement() {
		WMLGrammarElementImpl wmlGrammarElement = new WMLGrammarElementImpl();
		return wmlGrammarElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLTag createWMLTag() {
		WMLTagImpl wmlTag = new WMLTagImpl();
		return wmlTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLKey createWMLKey() {
		WMLKeyImpl wmlKey = new WMLKeyImpl();
		return wmlKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLKeyValue createWMLKeyValue() {
		WMLKeyValueImpl wmlKeyValue = new WMLKeyValueImpl();
		return wmlKeyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLMacroCall createWMLMacroCall() {
		WMLMacroCallImpl wmlMacroCall = new WMLMacroCallImpl();
		return wmlMacroCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLMacroCallParameter createWMLMacroCallParameter() {
		WMLMacroCallParameterImpl wmlMacroCallParameter = new WMLMacroCallParameterImpl();
		return wmlMacroCallParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLArrayCall createWMLArrayCall() {
		WMLArrayCallImpl wmlArrayCall = new WMLArrayCallImpl();
		return wmlArrayCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLMacroDefine createWMLMacroDefine() {
		WMLMacroDefineImpl wmlMacroDefine = new WMLMacroDefineImpl();
		return wmlMacroDefine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLPreprocIF createWMLPreprocIF() {
		WMLPreprocIFImpl wmlPreprocIF = new WMLPreprocIFImpl();
		return wmlPreprocIF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLRootExpression createWMLRootExpression() {
		WMLRootExpressionImpl wmlRootExpression = new WMLRootExpressionImpl();
		return wmlRootExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLExpression createWMLExpression() {
		WMLExpressionImpl wmlExpression = new WMLExpressionImpl();
		return wmlExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLValuedExpression createWMLValuedExpression() {
		WMLValuedExpressionImpl wmlValuedExpression = new WMLValuedExpressionImpl();
		return wmlValuedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLTextdomain createWMLTextdomain() {
		WMLTextdomainImpl wmlTextdomain = new WMLTextdomainImpl();
		return wmlTextdomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLLuaCode createWMLLuaCode() {
		WMLLuaCodeImpl wmlLuaCode = new WMLLuaCodeImpl();
		return wmlLuaCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLMacroParameter createWMLMacroParameter() {
		WMLMacroParameterImpl wmlMacroParameter = new WMLMacroParameterImpl();
		return wmlMacroParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLValue createWMLValue() {
		WMLValueImpl wmlValue = new WMLValueImpl();
		return wmlValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MacroTokens createMacroTokens() {
		MacroTokensImpl macroTokens = new MacroTokensImpl();
		return macroTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLPackage getWMLPackage() {
		return (WMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WMLPackage getPackage() {
		return WMLPackage.eINSTANCE;
	}

} //WMLFactoryImpl
