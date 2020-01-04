/**
 */
package wML.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import wML.MacroTokens;
import wML.WMLArrayCall;
import wML.WMLExpression;
import wML.WMLFactory;
import wML.WMLGrammarElement;
import wML.WMLKey;
import wML.WMLKeyValue;
import wML.WMLLuaCode;
import wML.WMLMacroCall;
import wML.WMLMacroCallParameter;
import wML.WMLMacroDefine;
import wML.WMLMacroParameter;
import wML.WMLPackage;
import wML.WMLPreprocIF;
import wML.WMLRoot;
import wML.WMLRootExpression;
import wML.WMLTag;
import wML.WMLTextdomain;
import wML.WMLValue;
import wML.WMLValuedExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WMLPackageImpl extends EPackageImpl implements WMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlGrammarElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlKeyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlMacroCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlMacroCallParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlArrayCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlMacroDefineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlPreprocIFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlRootExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlValuedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlTextdomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlLuaCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlMacroParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmlValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroTokensEClass = null;

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
	 * @see wML.WMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WMLPackageImpl() {
		super(eNS_URI, WMLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WMLPackage init() {
		if (isInited) return (WMLPackage)EPackage.Registry.INSTANCE.getEPackage(WMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WMLPackageImpl theWMLPackage = registeredWMLPackage instanceof WMLPackageImpl ? (WMLPackageImpl)registeredWMLPackage : new WMLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWMLPackage.createPackageContents();

		// Initialize created meta-data
		theWMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WMLPackage.eNS_URI, theWMLPackage);
		return theWMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLRoot() {
		return wmlRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMLRoot_Expressions() {
		return (EReference)wmlRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLGrammarElement() {
		return wmlGrammarElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLTag() {
		return wmlTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMLTag_Plus() {
		return (EAttribute)wmlTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMLTag_Expressions() {
		return (EReference)wmlTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMLTag_EndName() {
		return (EAttribute)wmlTagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLKey() {
		return wmlKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMLKey_Values() {
		return (EReference)wmlKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMLKey_Eol() {
		return (EAttribute)wmlKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLKeyValue() {
		return wmlKeyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLMacroCall() {
		return wmlMacroCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMLMacroCall_Point() {
		return (EAttribute)wmlMacroCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMLMacroCall_Relative() {
		return (EAttribute)wmlMacroCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMLMacroCall_Parameters() {
		return (EReference)wmlMacroCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLMacroCallParameter() {
		return wmlMacroCallParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLArrayCall() {
		return wmlArrayCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMLArrayCall_Value() {
		return (EReference)wmlArrayCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLMacroDefine() {
		return wmlMacroDefineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMLMacroDefine_Expressions() {
		return (EReference)wmlMacroDefineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMLMacroDefine_EndName() {
		return (EAttribute)wmlMacroDefineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLPreprocIF() {
		return wmlPreprocIFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMLPreprocIF_Expressions() {
		return (EReference)wmlPreprocIFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMLPreprocIF_Elses() {
		return (EAttribute)wmlPreprocIFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMLPreprocIF_ElseExpressions() {
		return (EReference)wmlPreprocIFEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMLPreprocIF_EndName() {
		return (EAttribute)wmlPreprocIFEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLRootExpression() {
		return wmlRootExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLExpression() {
		return wmlExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMLExpression_Name() {
		return (EAttribute)wmlExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLValuedExpression() {
		return wmlValuedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLTextdomain() {
		return wmlTextdomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLLuaCode() {
		return wmlLuaCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMLLuaCode_Value() {
		return (EAttribute)wmlLuaCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLMacroParameter() {
		return wmlMacroParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMLMacroParameter_Value() {
		return (EAttribute)wmlMacroParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMLValue() {
		return wmlValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMacroTokens() {
		return macroTokensEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMLFactory getWMLFactory() {
		return (WMLFactory)getEFactoryInstance();
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
		wmlRootEClass = createEClass(WML_ROOT);
		createEReference(wmlRootEClass, WML_ROOT__EXPRESSIONS);

		wmlGrammarElementEClass = createEClass(WML_GRAMMAR_ELEMENT);

		wmlTagEClass = createEClass(WML_TAG);
		createEAttribute(wmlTagEClass, WML_TAG__PLUS);
		createEReference(wmlTagEClass, WML_TAG__EXPRESSIONS);
		createEAttribute(wmlTagEClass, WML_TAG__END_NAME);

		wmlKeyEClass = createEClass(WML_KEY);
		createEReference(wmlKeyEClass, WML_KEY__VALUES);
		createEAttribute(wmlKeyEClass, WML_KEY__EOL);

		wmlKeyValueEClass = createEClass(WML_KEY_VALUE);

		wmlMacroCallEClass = createEClass(WML_MACRO_CALL);
		createEAttribute(wmlMacroCallEClass, WML_MACRO_CALL__POINT);
		createEAttribute(wmlMacroCallEClass, WML_MACRO_CALL__RELATIVE);
		createEReference(wmlMacroCallEClass, WML_MACRO_CALL__PARAMETERS);

		wmlMacroCallParameterEClass = createEClass(WML_MACRO_CALL_PARAMETER);

		wmlArrayCallEClass = createEClass(WML_ARRAY_CALL);
		createEReference(wmlArrayCallEClass, WML_ARRAY_CALL__VALUE);

		wmlMacroDefineEClass = createEClass(WML_MACRO_DEFINE);
		createEReference(wmlMacroDefineEClass, WML_MACRO_DEFINE__EXPRESSIONS);
		createEAttribute(wmlMacroDefineEClass, WML_MACRO_DEFINE__END_NAME);

		wmlPreprocIFEClass = createEClass(WML_PREPROC_IF);
		createEReference(wmlPreprocIFEClass, WML_PREPROC_IF__EXPRESSIONS);
		createEAttribute(wmlPreprocIFEClass, WML_PREPROC_IF__ELSES);
		createEReference(wmlPreprocIFEClass, WML_PREPROC_IF__ELSE_EXPRESSIONS);
		createEAttribute(wmlPreprocIFEClass, WML_PREPROC_IF__END_NAME);

		wmlRootExpressionEClass = createEClass(WML_ROOT_EXPRESSION);

		wmlExpressionEClass = createEClass(WML_EXPRESSION);
		createEAttribute(wmlExpressionEClass, WML_EXPRESSION__NAME);

		wmlValuedExpressionEClass = createEClass(WML_VALUED_EXPRESSION);

		wmlTextdomainEClass = createEClass(WML_TEXTDOMAIN);

		wmlLuaCodeEClass = createEClass(WML_LUA_CODE);
		createEAttribute(wmlLuaCodeEClass, WML_LUA_CODE__VALUE);

		wmlMacroParameterEClass = createEClass(WML_MACRO_PARAMETER);
		createEAttribute(wmlMacroParameterEClass, WML_MACRO_PARAMETER__VALUE);

		wmlValueEClass = createEClass(WML_VALUE);

		macroTokensEClass = createEClass(MACRO_TOKENS);
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
		wmlRootEClass.getESuperTypes().add(this.getWMLGrammarElement());
		wmlTagEClass.getESuperTypes().add(this.getWMLRootExpression());
		wmlKeyEClass.getESuperTypes().add(this.getWMLExpression());
		wmlKeyValueEClass.getESuperTypes().add(this.getWMLGrammarElement());
		wmlMacroCallEClass.getESuperTypes().add(this.getWMLKeyValue());
		wmlMacroCallEClass.getESuperTypes().add(this.getWMLMacroCallParameter());
		wmlMacroCallEClass.getESuperTypes().add(this.getWMLRootExpression());
		wmlMacroCallParameterEClass.getESuperTypes().add(this.getWMLGrammarElement());
		wmlArrayCallEClass.getESuperTypes().add(this.getWMLKeyValue());
		wmlMacroDefineEClass.getESuperTypes().add(this.getWMLRootExpression());
		wmlPreprocIFEClass.getESuperTypes().add(this.getWMLRootExpression());
		wmlRootExpressionEClass.getESuperTypes().add(this.getWMLExpression());
		wmlExpressionEClass.getESuperTypes().add(this.getWMLValuedExpression());
		wmlValuedExpressionEClass.getESuperTypes().add(this.getWMLGrammarElement());
		wmlTextdomainEClass.getESuperTypes().add(this.getWMLRootExpression());
		wmlLuaCodeEClass.getESuperTypes().add(this.getWMLKeyValue());
		wmlMacroParameterEClass.getESuperTypes().add(this.getWMLMacroCallParameter());
		wmlValueEClass.getESuperTypes().add(this.getWMLKeyValue());
		wmlValueEClass.getESuperTypes().add(this.getWMLValuedExpression());
		wmlValueEClass.getESuperTypes().add(this.getWMLMacroParameter());
		macroTokensEClass.getESuperTypes().add(this.getWMLMacroParameter());

		// Initialize classes, features, and operations; add parameters
		initEClass(wmlRootEClass, WMLRoot.class, "WMLRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWMLRoot_Expressions(), this.getWMLRootExpression(), null, "Expressions", null, 0, -1, WMLRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmlGrammarElementEClass, WMLGrammarElement.class, "WMLGrammarElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wmlTagEClass, WMLTag.class, "WMLTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWMLTag_Plus(), ecorePackage.getEString(), "plus", null, 0, 1, WMLTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMLTag_Expressions(), this.getWMLExpression(), null, "Expressions", null, 0, -1, WMLTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMLTag_EndName(), ecorePackage.getEString(), "endName", null, 0, 1, WMLTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmlKeyEClass, WMLKey.class, "WMLKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWMLKey_Values(), this.getWMLKeyValue(), null, "values", null, 0, -1, WMLKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMLKey_Eol(), ecorePackage.getEString(), "eol", null, 0, -1, WMLKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmlKeyValueEClass, WMLKeyValue.class, "WMLKeyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wmlMacroCallEClass, WMLMacroCall.class, "WMLMacroCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWMLMacroCall_Point(), ecorePackage.getEString(), "point", null, 0, 1, WMLMacroCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMLMacroCall_Relative(), ecorePackage.getEString(), "relative", null, 0, 1, WMLMacroCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMLMacroCall_Parameters(), this.getWMLMacroCallParameter(), null, "Parameters", null, 0, -1, WMLMacroCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmlMacroCallParameterEClass, WMLMacroCallParameter.class, "WMLMacroCallParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wmlArrayCallEClass, WMLArrayCall.class, "WMLArrayCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWMLArrayCall_Value(), this.getWMLValue(), null, "value", null, 0, -1, WMLArrayCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmlMacroDefineEClass, WMLMacroDefine.class, "WMLMacroDefine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWMLMacroDefine_Expressions(), this.getWMLValuedExpression(), null, "Expressions", null, 0, -1, WMLMacroDefine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMLMacroDefine_EndName(), ecorePackage.getEString(), "endName", null, 0, 1, WMLMacroDefine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmlPreprocIFEClass, WMLPreprocIF.class, "WMLPreprocIF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWMLPreprocIF_Expressions(), this.getWMLValuedExpression(), null, "Expressions", null, 0, -1, WMLPreprocIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMLPreprocIF_Elses(), ecorePackage.getEString(), "Elses", null, 0, 1, WMLPreprocIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMLPreprocIF_ElseExpressions(), this.getWMLValuedExpression(), null, "ElseExpressions", null, 0, -1, WMLPreprocIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMLPreprocIF_EndName(), ecorePackage.getEString(), "endName", null, 0, 1, WMLPreprocIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmlRootExpressionEClass, WMLRootExpression.class, "WMLRootExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wmlExpressionEClass, WMLExpression.class, "WMLExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWMLExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, WMLExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmlValuedExpressionEClass, WMLValuedExpression.class, "WMLValuedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wmlTextdomainEClass, WMLTextdomain.class, "WMLTextdomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wmlLuaCodeEClass, WMLLuaCode.class, "WMLLuaCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWMLLuaCode_Value(), ecorePackage.getEString(), "value", null, 0, 1, WMLLuaCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmlMacroParameterEClass, WMLMacroParameter.class, "WMLMacroParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWMLMacroParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, WMLMacroParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmlValueEClass, WMLValue.class, "WMLValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(macroTokensEClass, MacroTokens.class, "MacroTokens", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //WMLPackageImpl
