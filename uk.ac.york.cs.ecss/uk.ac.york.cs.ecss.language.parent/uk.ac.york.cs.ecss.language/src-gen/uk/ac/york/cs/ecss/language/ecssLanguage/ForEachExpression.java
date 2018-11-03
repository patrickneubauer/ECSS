/**
 * generated by Xtext 2.14.0
 */
package uk.ac.york.cs.ecss.language.ecssLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.ForEachExpression#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.ForEachExpression#getVariable <em>Variable</em>}</li>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.ForEachExpression#getExprVar <em>Expr Var</em>}</li>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.ForEachExpression#getCompleteExpr <em>Complete Expr</em>}</li>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.ForEachExpression#getJoin <em>Join</em>}</li>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.ForEachExpression#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getForEachExpression()
 * @model
 * @generated
 */
public interface ForEachExpression extends TemplateRulePart
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getForEachExpression_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.ecss.language.ecssLanguage.ForEachExpression#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getForEachExpression_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.ecss.language.ecssLanguage.ForEachExpression#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

  /**
   * Returns the value of the '<em><b>Expr Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Var</em>' attribute.
   * @see #setExprVar(String)
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getForEachExpression_ExprVar()
   * @model
   * @generated
   */
  String getExprVar();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.ecss.language.ecssLanguage.ForEachExpression#getExprVar <em>Expr Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Var</em>' attribute.
   * @see #getExprVar()
   * @generated
   */
  void setExprVar(String value);

  /**
   * Returns the value of the '<em><b>Complete Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complete Expr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complete Expr</em>' attribute.
   * @see #setCompleteExpr(String)
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getForEachExpression_CompleteExpr()
   * @model
   * @generated
   */
  String getCompleteExpr();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.ecss.language.ecssLanguage.ForEachExpression#getCompleteExpr <em>Complete Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Complete Expr</em>' attribute.
   * @see #getCompleteExpr()
   * @generated
   */
  void setCompleteExpr(String value);

  /**
   * Returns the value of the '<em><b>Join</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.ecss.language.ecssLanguage.TemplateRulePart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join</em>' containment reference list.
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getForEachExpression_Join()
   * @model containment="true"
   * @generated
   */
  EList<TemplateRulePart> getJoin();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.ecss.language.ecssLanguage.TemplateRulePart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getForEachExpression_Body()
   * @model containment="true"
   * @generated
   */
  EList<TemplateRulePart> getBody();

} // ForEachExpression
