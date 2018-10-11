/**
 * generated by Xtext 2.15.0
 */
package uk.ac.york.simpleregexp.simplereg.simpleReg.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.york.simpleregexp.simplereg.simpleReg.AbstractElement;
import uk.ac.york.simpleregexp.simplereg.simpleReg.MultiCharacters;
import uk.ac.york.simpleregexp.simplereg.simpleReg.RegexAlternatives;
import uk.ac.york.simpleregexp.simplereg.simpleReg.RegexGroup;
import uk.ac.york.simpleregexp.simplereg.simpleReg.SimpleRegFactory;
import uk.ac.york.simpleregexp.simplereg.simpleReg.SimpleRegPackage;
import uk.ac.york.simpleregexp.simplereg.simpleReg.SingleChars;
import uk.ac.york.simpleregexp.simplereg.simpleReg.Wildcard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleRegPackageImpl extends EPackageImpl implements SimpleRegPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleCharsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiCharactersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regexAlternativesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regexGroupEClass = null;

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
   * @see uk.ac.york.simpleregexp.simplereg.simpleReg.SimpleRegPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimpleRegPackageImpl()
  {
    super(eNS_URI, SimpleRegFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SimpleRegPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimpleRegPackage init()
  {
    if (isInited) return (SimpleRegPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleRegPackage.eNS_URI);

    // Obtain or create and register package
    SimpleRegPackageImpl theSimpleRegPackage = (SimpleRegPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleRegPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleRegPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSimpleRegPackage.createPackageContents();

    // Initialize created meta-data
    theSimpleRegPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimpleRegPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimpleRegPackage.eNS_URI, theSimpleRegPackage);
    return theSimpleRegPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_Cardinality()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_HasMinCard()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_MinCardinality()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_HasMaxCard()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_MaxCardinality()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleChars()
  {
    return singleCharsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleChars_Value()
  {
    return (EAttribute)singleCharsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcard()
  {
    return wildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiCharacters()
  {
    return multiCharactersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiCharacters_Value()
  {
    return (EAttribute)multiCharactersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegexAlternatives()
  {
    return regexAlternativesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegexAlternatives_Elements()
  {
    return (EReference)regexAlternativesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegexGroup()
  {
    return regexGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegexGroup_Elements()
  {
    return (EReference)regexGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleRegFactory getSimpleRegFactory()
  {
    return (SimpleRegFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__CARDINALITY);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__HAS_MIN_CARD);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__MIN_CARDINALITY);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__HAS_MAX_CARD);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__MAX_CARDINALITY);

    singleCharsEClass = createEClass(SINGLE_CHARS);
    createEAttribute(singleCharsEClass, SINGLE_CHARS__VALUE);

    wildcardEClass = createEClass(WILDCARD);

    multiCharactersEClass = createEClass(MULTI_CHARACTERS);
    createEAttribute(multiCharactersEClass, MULTI_CHARACTERS__VALUE);

    regexAlternativesEClass = createEClass(REGEX_ALTERNATIVES);
    createEReference(regexAlternativesEClass, REGEX_ALTERNATIVES__ELEMENTS);

    regexGroupEClass = createEClass(REGEX_GROUP);
    createEReference(regexGroupEClass, REGEX_GROUP__ELEMENTS);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    singleCharsEClass.getESuperTypes().add(this.getAbstractElement());
    wildcardEClass.getESuperTypes().add(this.getAbstractElement());
    multiCharactersEClass.getESuperTypes().add(this.getAbstractElement());
    regexAlternativesEClass.getESuperTypes().add(this.getAbstractElement());
    regexGroupEClass.getESuperTypes().add(this.getAbstractElement());

    // Initialize classes and features; add operations and parameters
    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractElement_Cardinality(), ecorePackage.getEString(), "cardinality", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractElement_HasMinCard(), ecorePackage.getEBoolean(), "hasMinCard", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractElement_MinCardinality(), ecorePackage.getEInt(), "minCardinality", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractElement_HasMaxCard(), ecorePackage.getEBoolean(), "hasMaxCard", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractElement_MaxCardinality(), ecorePackage.getEInt(), "maxCardinality", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleCharsEClass, SingleChars.class, "SingleChars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSingleChars_Value(), ecorePackage.getEString(), "value", null, 0, 1, SingleChars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardEClass, Wildcard.class, "Wildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiCharactersEClass, MultiCharacters.class, "MultiCharacters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiCharacters_Value(), ecorePackage.getEString(), "value", null, 0, 1, MultiCharacters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regexAlternativesEClass, RegexAlternatives.class, "RegexAlternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRegexAlternatives_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, RegexAlternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regexGroupEClass, RegexGroup.class, "RegexGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRegexGroup_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, RegexGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SimpleRegPackageImpl
