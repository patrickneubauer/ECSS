/**
 * generated by Xtext 2.15.0
 */
package uk.ac.york.cs.ecss.language.ecssLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.Property#getTemplateMatch <em>Template Match</em>}</li>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.Property#getSlotMatch <em>Slot Match</em>}</li>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.Property#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.Property#getCondition <em>Condition</em>}</li>
 *   <li>{@link uk.ac.york.cs.ecss.language.ecssLanguage.Property#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Template Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Match</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Match</em>' containment reference.
   * @see #setTemplateMatch(TemplateMatch)
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getProperty_TemplateMatch()
   * @model containment="true"
   * @generated
   */
  TemplateMatch getTemplateMatch();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.ecss.language.ecssLanguage.Property#getTemplateMatch <em>Template Match</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template Match</em>' containment reference.
   * @see #getTemplateMatch()
   * @generated
   */
  void setTemplateMatch(TemplateMatch value);

  /**
   * Returns the value of the '<em><b>Slot Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slot Match</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slot Match</em>' containment reference.
   * @see #setSlotMatch(SlotMatch)
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getProperty_SlotMatch()
   * @model containment="true"
   * @generated
   */
  SlotMatch getSlotMatch();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.ecss.language.ecssLanguage.Property#getSlotMatch <em>Slot Match</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slot Match</em>' containment reference.
   * @see #getSlotMatch()
   * @generated
   */
  void setSlotMatch(SlotMatch value);

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
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.ecss.language.ecssLanguage.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getProperty_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link uk.ac.york.cs.ecss.language.ecssLanguage.Property#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.york.cs.ecss.language.ecssLanguage.PropertyValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see uk.ac.york.cs.ecss.language.ecssLanguage.EcssLanguagePackage#getProperty_Value()
   * @model containment="true"
   * @generated
   */
  EList<PropertyValue> getValue();

} // Property
