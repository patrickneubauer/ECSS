/**
 * generated by Xtext 2.15.0
 */
package uk.ac.york.cs.ecss.language.ecssLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage;
import uk.ac.york.cs.ecss.language.ecssLanguage.TemplateRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.impl.TemplateRuleImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateRuleImpl extends TemplateRuleOrDefImpl implements TemplateRule
{
  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<String> groups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateRuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EcssLanguagePackage.Literals.TEMPLATE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGroups()
  {
    if (groups == null)
    {
      groups = new EDataTypeEList<String>(String.class, this, EcssLanguagePackage.TEMPLATE_RULE__GROUPS);
    }
    return groups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EcssLanguagePackage.TEMPLATE_RULE__GROUPS:
        return getGroups();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EcssLanguagePackage.TEMPLATE_RULE__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EcssLanguagePackage.TEMPLATE_RULE__GROUPS:
        getGroups().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EcssLanguagePackage.TEMPLATE_RULE__GROUPS:
        return groups != null && !groups.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (groups: ");
    result.append(groups);
    result.append(')');
    return result.toString();
  }

} //TemplateRuleImpl
