/**
 */
package sculptordsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sculptordsl.SculptordslPackage
 * @generated
 */
public interface SculptordslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SculptordslFactory eINSTANCE = sculptordsl.impl.SculptordslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dsl Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Model</em>'.
	 * @generated
	 */
	DslModel createDslModel();

	/**
	 * Returns a new object of class '<em>Dsl Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Import</em>'.
	 * @generated
	 */
	DslImport createDslImport();

	/**
	 * Returns a new object of class '<em>Dsl Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Application</em>'.
	 * @generated
	 */
	DslApplication createDslApplication();

	/**
	 * Returns a new object of class '<em>Dsl Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Module</em>'.
	 * @generated
	 */
	DslModule createDslModule();

	/**
	 * Returns a new object of class '<em>Dsl Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Service</em>'.
	 * @generated
	 */
	DslService createDslService();

	/**
	 * Returns a new object of class '<em>Dsl Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Resource</em>'.
	 * @generated
	 */
	DslResource createDslResource();

	/**
	 * Returns a new object of class '<em>Dsl Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Consumer</em>'.
	 * @generated
	 */
	DslConsumer createDslConsumer();

	/**
	 * Returns a new object of class '<em>Dsl Subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Subscribe</em>'.
	 * @generated
	 */
	DslSubscribe createDslSubscribe();

	/**
	 * Returns a new object of class '<em>Dsl Publish</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Publish</em>'.
	 * @generated
	 */
	DslPublish createDslPublish();

	/**
	 * Returns a new object of class '<em>Dsl Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Event</em>'.
	 * @generated
	 */
	DslEvent createDslEvent();

	/**
	 * Returns a new object of class '<em>Dsl Domain Object Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Domain Object Typed Element</em>'.
	 * @generated
	 */
	DslDomainObjectTypedElement createDslDomainObjectTypedElement();

	/**
	 * Returns a new object of class '<em>Dsl Service Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Service Operation</em>'.
	 * @generated
	 */
	DslServiceOperation createDslServiceOperation();

	/**
	 * Returns a new object of class '<em>Dsl Service Operation Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Service Operation Delegate</em>'.
	 * @generated
	 */
	DslServiceOperationDelegate createDslServiceOperationDelegate();

	/**
	 * Returns a new object of class '<em>Dsl Service Repository Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Service Repository Option</em>'.
	 * @generated
	 */
	DslServiceRepositoryOption createDslServiceRepositoryOption();

	/**
	 * Returns a new object of class '<em>Dsl Service Repository Operation Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Service Repository Operation Option</em>'.
	 * @generated
	 */
	DslServiceRepositoryOperationOption createDslServiceRepositoryOperationOption();

	/**
	 * Returns a new object of class '<em>Dsl Resource Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Resource Operation</em>'.
	 * @generated
	 */
	DslResourceOperation createDslResourceOperation();

	/**
	 * Returns a new object of class '<em>Dsl Resource Operation Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Resource Operation Delegate</em>'.
	 * @generated
	 */
	DslResourceOperationDelegate createDslResourceOperationDelegate();

	/**
	 * Returns a new object of class '<em>Dsl Repository Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Repository Operation</em>'.
	 * @generated
	 */
	DslRepositoryOperation createDslRepositoryOperation();

	/**
	 * Returns a new object of class '<em>Dsl Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Parameter</em>'.
	 * @generated
	 */
	DslParameter createDslParameter();

	/**
	 * Returns a new object of class '<em>Dsl Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Complex Type</em>'.
	 * @generated
	 */
	DslComplexType createDslComplexType();

	/**
	 * Returns a new object of class '<em>Dsl Simple Domain Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Simple Domain Object</em>'.
	 * @generated
	 */
	DslSimpleDomainObject createDslSimpleDomainObject();

	/**
	 * Returns a new object of class '<em>Dsl Domain Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Domain Object</em>'.
	 * @generated
	 */
	DslDomainObject createDslDomainObject();

	/**
	 * Returns a new object of class '<em>Dsl Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Entity</em>'.
	 * @generated
	 */
	DslEntity createDslEntity();

	/**
	 * Returns a new object of class '<em>Dsl Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Value Object</em>'.
	 * @generated
	 */
	DslValueObject createDslValueObject();

	/**
	 * Returns a new object of class '<em>Dsl Domain Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Domain Event</em>'.
	 * @generated
	 */
	DslDomainEvent createDslDomainEvent();

	/**
	 * Returns a new object of class '<em>Dsl Command Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Command Event</em>'.
	 * @generated
	 */
	DslCommandEvent createDslCommandEvent();

	/**
	 * Returns a new object of class '<em>Dsl Trait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Trait</em>'.
	 * @generated
	 */
	DslTrait createDslTrait();

	/**
	 * Returns a new object of class '<em>Dsl Domain Object Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Domain Object Operation</em>'.
	 * @generated
	 */
	DslDomainObjectOperation createDslDomainObjectOperation();

	/**
	 * Returns a new object of class '<em>Dsl Data Transfer Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Data Transfer Object</em>'.
	 * @generated
	 */
	DslDataTransferObject createDslDataTransferObject();

	/**
	 * Returns a new object of class '<em>Dsl Basic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Basic Type</em>'.
	 * @generated
	 */
	DslBasicType createDslBasicType();

	/**
	 * Returns a new object of class '<em>Dsl Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Attribute</em>'.
	 * @generated
	 */
	DslAttribute createDslAttribute();

	/**
	 * Returns a new object of class '<em>Dsl Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Reference</em>'.
	 * @generated
	 */
	DslReference createDslReference();

	/**
	 * Returns a new object of class '<em>Dsl Dto Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Dto Attribute</em>'.
	 * @generated
	 */
	DslDtoAttribute createDslDtoAttribute();

	/**
	 * Returns a new object of class '<em>Dsl Dto Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Dto Reference</em>'.
	 * @generated
	 */
	DslDtoReference createDslDtoReference();

	/**
	 * Returns a new object of class '<em>Dsl Opposite Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Opposite Holder</em>'.
	 * @generated
	 */
	DslOppositeHolder createDslOppositeHolder();

	/**
	 * Returns a new object of class '<em>Dsl Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Repository</em>'.
	 * @generated
	 */
	DslRepository createDslRepository();

	/**
	 * Returns a new object of class '<em>Dsl Service Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Service Dependency</em>'.
	 * @generated
	 */
	DslServiceDependency createDslServiceDependency();

	/**
	 * Returns a new object of class '<em>Dsl Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Dependency</em>'.
	 * @generated
	 */
	DslDependency createDslDependency();

	/**
	 * Returns a new object of class '<em>Dsl Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Enum</em>'.
	 * @generated
	 */
	DslEnum createDslEnum();

	/**
	 * Returns a new object of class '<em>Dsl Enum Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Enum Attribute</em>'.
	 * @generated
	 */
	DslEnumAttribute createDslEnumAttribute();

	/**
	 * Returns a new object of class '<em>Dsl Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Enum Value</em>'.
	 * @generated
	 */
	DslEnumValue createDslEnumValue();

	/**
	 * Returns a new object of class '<em>Dsl Enum Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Enum Parameter</em>'.
	 * @generated
	 */
	DslEnumParameter createDslEnumParameter();

	/**
	 * Returns a new object of class '<em>Dsl Any Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Any Property</em>'.
	 * @generated
	 */
	DslAnyProperty createDslAnyProperty();

	/**
	 * Returns a new object of class '<em>Dsl Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Property</em>'.
	 * @generated
	 */
	DslProperty createDslProperty();

	/**
	 * Returns a new object of class '<em>Dsl Dto Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Dto Property</em>'.
	 * @generated
	 */
	DslDtoProperty createDslDtoProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SculptordslPackage getSculptordslPackage();

} //SculptordslFactory
