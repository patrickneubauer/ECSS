/**
 */
package wML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see wML.WMLPackage
 * @generated
 */
public interface WMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WMLFactory eINSTANCE = wML.impl.WMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	WMLRoot createWMLRoot();

	/**
	 * Returns a new object of class '<em>Grammar Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grammar Element</em>'.
	 * @generated
	 */
	WMLGrammarElement createWMLGrammarElement();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	WMLTag createWMLTag();

	/**
	 * Returns a new object of class '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key</em>'.
	 * @generated
	 */
	WMLKey createWMLKey();

	/**
	 * Returns a new object of class '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value</em>'.
	 * @generated
	 */
	WMLKeyValue createWMLKeyValue();

	/**
	 * Returns a new object of class '<em>Macro Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro Call</em>'.
	 * @generated
	 */
	WMLMacroCall createWMLMacroCall();

	/**
	 * Returns a new object of class '<em>Macro Call Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro Call Parameter</em>'.
	 * @generated
	 */
	WMLMacroCallParameter createWMLMacroCallParameter();

	/**
	 * Returns a new object of class '<em>Array Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Call</em>'.
	 * @generated
	 */
	WMLArrayCall createWMLArrayCall();

	/**
	 * Returns a new object of class '<em>Macro Define</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro Define</em>'.
	 * @generated
	 */
	WMLMacroDefine createWMLMacroDefine();

	/**
	 * Returns a new object of class '<em>Preproc IF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preproc IF</em>'.
	 * @generated
	 */
	WMLPreprocIF createWMLPreprocIF();

	/**
	 * Returns a new object of class '<em>Root Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Expression</em>'.
	 * @generated
	 */
	WMLRootExpression createWMLRootExpression();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	WMLExpression createWMLExpression();

	/**
	 * Returns a new object of class '<em>Valued Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valued Expression</em>'.
	 * @generated
	 */
	WMLValuedExpression createWMLValuedExpression();

	/**
	 * Returns a new object of class '<em>Textdomain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textdomain</em>'.
	 * @generated
	 */
	WMLTextdomain createWMLTextdomain();

	/**
	 * Returns a new object of class '<em>Lua Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lua Code</em>'.
	 * @generated
	 */
	WMLLuaCode createWMLLuaCode();

	/**
	 * Returns a new object of class '<em>Macro Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro Parameter</em>'.
	 * @generated
	 */
	WMLMacroParameter createWMLMacroParameter();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	WMLValue createWMLValue();

	/**
	 * Returns a new object of class '<em>Macro Tokens</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro Tokens</em>'.
	 * @generated
	 */
	MacroTokens createMacroTokens();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WMLPackage getWMLPackage();

} //WMLFactory
