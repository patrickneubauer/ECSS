/**
 * generated by Xtext 2.15.0
 */
package uk.ac.york.cs.ecss.language.ecssLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Gen Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.TemplateGenDef#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.TemplateGenDef#getSuperRule <em>Super Rule</em>}</li>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.TemplateGenDef#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getTemplateGenDef()
 * @model
 * @generated
 */
public interface TemplateGenDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getTemplateGenDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.ecss.language.ecssLanguage.TemplateGenDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Rule</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Rule</em>' reference.
   * @see #setSuperRule(TemplateRuleOrDef)
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getTemplateGenDef_SuperRule()
   * @model
   * @generated
   */
  TemplateRuleOrDef getSuperRule();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.ecss.language.ecssLanguage.TemplateGenDef#getSuperRule <em>Super Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Rule</em>' reference.
   * @see #getSuperRule()
   * @generated
   */
  void setSuperRule(TemplateRuleOrDef value);

  /**
   * Returns the value of the '<em><b>Java Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Class</em>' attribute.
   * @see #setJavaClass(String)
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getTemplateGenDef_JavaClass()
   * @model
   * @generated
   */
  String getJavaClass();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.ecss.language.ecssLanguage.TemplateGenDef#getJavaClass <em>Java Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Class</em>' attribute.
   * @see #getJavaClass()
   * @generated
   */
  void setJavaClass(String value);

} // TemplateGenDef
