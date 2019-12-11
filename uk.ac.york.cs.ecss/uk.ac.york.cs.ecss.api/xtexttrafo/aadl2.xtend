package staticContent

import uk.ac.york.cs.ecss.newproc.AbstractEcssXtendRule
import org.eclipse.emf.ecore.EClass

class Aadl2 extends AbstractEcssXtendRule {
	
	new(EClass bla) {
		
	}
	
	override afterInit() {
	}
	
	override getString() '''

import "http://aadl.info/AADL/2.0" as aadl2

//import "http://www.eclipse.org/emf/2002/Ecore" as ecore


Model returns aadl2::ModelUnit:
	(AadlPackage | PropertySet )?
;


AadlPackage returns aadl2::AadlPackage:
	'package' name=PNAME
	((ownedPublicSection=PublicPackageSection
	(ownedPrivateSection=PrivatePackageSection)?) |
	ownedPrivateSection=PrivatePackageSection)
	('properties'
	(((ownedPropertyAssociation+=BasicPropertyAssociation)+ )
//| (noProperties?='none' ';')
	| ('none' ';') )
	)? 
	'end' PNAME ';';//ID ('::' ID)* ';';


PublicPackageSection returns aadl2::PublicPackageSection:
	{aadl2::PublicPackageSection}
	'public'
	(('with' (importedUnit+=[aadl2::ModelUnit|PNAME])  
	    (',' importedUnit+=[aadl2::ModelUnit|PNAME])* ';')
	 | ownedPackageRename+=(PackageRename|RenameAll)  
	 | ownedFeatureGroupTypeRename+=FGTRename | ownedComponentTypeRename+=CTRename
	)*
	( ownedClassifier+=Classifier
    | ownedAnnexLibrary+=AnnexLibrary
	    )*
	;


PrivatePackageSection returns aadl2::PrivatePackageSection:
	{aadl2::PrivatePackageSection}
	'private'
	(('with' (importedUnit+=[aadl2::ModelUnit|PNAME])  
	    (',' importedUnit+=[aadl2::ModelUnit|PNAME])* ';')
	 | ownedPackageRename+=(PackageRename|RenameAll)  
	 | ownedFeatureGroupTypeRename+=FGTRename | ownedComponentTypeRename+=CTRename
	)*
   ( ownedClassifier += Classifier
    | ownedAnnexLibrary+=AnnexLibrary
     )*
	;
	
PackageRename returns aadl2::PackageRename:
	name=ID 'renames' 'package' renamedPackage=[aadl2::AadlPackage|PNAME] ('::' renameAll?='all')?
	';'
;
RenameAll returns aadl2::PackageRename:
	'renames' renamedPackage=[aadl2::AadlPackage|PNAME] '::' renameAll?='all'
	';'
;

	
FGTRename returns aadl2::FeatureGroupTypeRename:
	(name=ID)? 'renames' 'feature' 'group' renamedFeatureGroupType=[aadl2::FeatureGroupType|QCREF]
	';'
;

	
CTRename returns aadl2::ComponentTypeRename:
	(name=ID)? 'renames' category=ComponentCategory renamedComponentType=[aadl2::ComponentType|QCREF]
	';'
;




TypeExtension returns aadl2::TypeExtension:
	'extends' extended=[aadl2::ComponentType|QCREF];

ImplementationExtension returns aadl2::ImplementationExtension:
	'extends' extended=[aadl2::ComponentImplementation|QCREF];

GroupExtension returns aadl2::GroupExtension:
	'extends' extended=[aadl2::FeatureGroupType|QCREF];



ComponentCategory returns aadl2::ComponentCategory: 'abstract' | 'bus'|'data'
	| 'device' | 'memory' | 'process' | 'processor' | 'subprogram'
	| 'subprogram' 'group' | 'system' | 'thread' 'group'
	| 'thread' | 'virtual' 'bus' | 'virtual' 'processor';

Classifier returns aadl2::Classifier:
	ComponentType | ComponentImplementation | FeatureGroupType 
;


ComponentType returns aadl2::ComponentType: 
	(AbstractType  | SystemType | VirtualProcessorType
		|SubprogramGroupType | DataType 
		| BusType|		 VirtualBusType|MemoryType
		| ProcessorType | ProcessType|ThreadGroupType|ThreadType|DeviceType|SubprogramType
	) 
;

AbstractType returns aadl2::AbstractType:
	'abstract' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort
	| ownedFeatureGroup+=FeatureGroup | ownedDataAccess+=DataAccess | ownedBusAccess+=BusAccess
	| ownedSubprogramAccess+=SubprogramAccess | ownedSubprogramGroupAccess+=SubprogramGroupAccess
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	('flows'
	((ownedFlowSpecification+=FlowSpecification)+ | (noFlows?='none' ';')))?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;


SystemType returns aadl2::SystemType:
	'system' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('features' ( 
			(ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort
				| ownedFeatureGroup+=FeatureGroup | ownedDataAccess+=DataAccess | ownedBusAccess+=BusAccess
			| ownedSubprogramAccess+=SubprogramAccess | ownedSubprogramGroupAccess+=SubprogramGroupAccess
			| ownedAbstractFeature+=AbstractFeature
			)+
			| (noFeatures?='none' ';')
 	) )?
	('flows'
	((ownedFlowSpecification+=FlowSpecification)+ | (noFlows?='none' ';')))?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;


ProcessType returns aadl2::ProcessType:
	'process' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort
		| ownedFeatureGroup+=FeatureGroup | ownedDataAccess+=DataAccess 
	| ownedSubprogramAccess+=SubprogramAccess | ownedSubprogramGroupAccess+=SubprogramGroupAccess
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	('flows'
	((ownedFlowSpecification+=FlowSpecification)+ | (noFlows?='none' ';')))?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;


ThreadGroupType returns aadl2::ThreadGroupType:
	'thread' 'group' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort
		| ownedFeatureGroup+=FeatureGroup | ownedDataAccess+=DataAccess 
	| ownedSubprogramAccess+=SubprogramAccess | ownedSubprogramGroupAccess+=SubprogramGroupAccess
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	('flows'
	((ownedFlowSpecification+=FlowSpecification)+ | (noFlows?='none' ';')))?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;

ThreadType returns aadl2::ThreadType:
	'thread' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort
		| ownedFeatureGroup+=FeatureGroup | ownedDataAccess+=DataAccess 
	| ownedSubprogramAccess+=SubprogramAccess | ownedSubprogramGroupAccess+=SubprogramGroupAccess
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	('flows'
	((ownedFlowSpecification+=FlowSpecification)+ | (noFlows?='none' ';')))?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;

SubprogramType returns aadl2::SubprogramType:
	'subprogram' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedParameter+=Parameter| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort
		| ownedFeatureGroup+=FeatureGroup | ownedDataAccess+=DataAccess 
	| ownedSubprogramAccess+=SubprogramAccess | ownedSubprogramGroupAccess+=SubprogramGroupAccess
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	('flows'
	((ownedFlowSpecification+=FlowSpecification)+ | (noFlows?='none' ';')))?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;

SubprogramGroupType returns aadl2::SubprogramGroupType:
	'subprogram' 'group' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedSubprogramAccess+=SubprogramAccess
		| ownedFeatureGroup+=FeatureGroup  
	| ownedSubprogramGroupAccess+=SubprogramGroupAccess
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	('flows'
	((ownedFlowSpecification+=FlowSpecification)+ | (noFlows?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;


ProcessorType returns aadl2::ProcessorType:
	'processor' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort
		| ownedFeatureGroup+=FeatureGroup | ownedBusAccess+=BusAccess 
	| ownedSubprogramAccess+=SubprogramAccess | ownedSubprogramGroupAccess+=SubprogramGroupAccess
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	('flows'
	((ownedFlowSpecification+=FlowSpecification)+ | (noFlows?='none' ';')))?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;

DeviceType returns aadl2::DeviceType:
	'device' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort
		| ownedFeatureGroup+=FeatureGroup | ownedBusAccess+=BusAccess 
	| ownedSubprogramAccess+=SubprogramAccess | ownedSubprogramGroupAccess+=SubprogramGroupAccess
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	('flows'
	((ownedFlowSpecification+=FlowSpecification)+ | (noFlows?='none' ';')))?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;

MemoryType returns aadl2::MemoryType:
	'memory' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedFeatureGroup+=FeatureGroup |ownedBusAccess+=BusAccess
	| ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort 
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;

BusType returns aadl2::BusType:
	'bus' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedFeatureGroup+=FeatureGroup |ownedBusAccess+=BusAccess
	| ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort 
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;

VirtualBusType returns aadl2::VirtualBusType:
	'virtual' 'bus' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedFeatureGroup+=FeatureGroup 
	| ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort 
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;


VirtualProcessorType returns aadl2::VirtualProcessorType:
	'virtual' 'processor' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') |
	(ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort
		| ownedFeatureGroup+=FeatureGroup  
	| ownedSubprogramAccess+=SubprogramAccess | ownedSubprogramGroupAccess+=SubprogramGroupAccess
	| ownedAbstractFeature+=AbstractFeature
	)+ ) )?
	('flows'
	((ownedFlowSpecification+=FlowSpecification)+ | (noFlows?='none' ';')))?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;

DataType returns aadl2::DataType:
	'data' name=ID
	(ownedExtension=TypeExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' ((noFeatures?='none' ';') 
	| (
	ownedFeatureGroup+=FeatureGroup| ownedDataAccess+=DataAccess | ownedSubprogramAccess+=SubprogramAccess | ownedSubprogramGroupAccess+=SubprogramGroupAccess
	| ownedAbstractFeature+=AbstractFeature
	)+ )
	 )?
	('flows'
	((ownedFlowSpecification+=FlowSpecification)+ | (noFlows?='none' ';')))?
	((derivedModes?='requires' 'modes'
	 ((ownedMode+=Mode)+))
	|
	 ('modes' ((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+ | (noModes?='none' ';')))
	)?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';'
	;

// Component Implementations: 

ComponentImplementation returns aadl2::ComponentImplementation: 
	(AbstractImplementation | SystemImplementation | ProcessorImplementation| ProcessImplementation|ThreadGroupImplementation|ThreadImplementation|DeviceImplementation|BusImplementation|
		VirtualProcessorImplementation| VirtualBusImplementation|MemoryImplementation|SubprogramImplementation|SubprogramGroupImplementation|DataImplementation
	) 
;

Realization returns aadl2::Realization:
	implemented=[aadl2::ComponentType|ID];


AbstractImplementation returns aadl2::AbstractImplementation:
	'abstract' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedSystemSubcomponent+=SystemSubcomponent
	  |ownedSubprogramSubcomponent+=SubprogramSubcomponent |ownedSubprogramGroupSubcomponent+=SubprogramGroupSubcomponent
	  | ownedThreadSubcomponent+=ThreadSubcomponent | ownedThreadGroupSubcomponent+=ThreadGroupSubcomponent
	  | ownedProcessSubcomponent+=ProcessSubcomponent
	  |ownedProcessorSubcomponent+=ProcessorSubcomponent
	  | ownedVirtualProcessorSubcomponent+=VirtualProcessorSubcomponent 
	  | ownedMemorySubcomponent+=MemorySubcomponent | ownedDeviceSubcomponent+=DeviceSubcomponent
	  | ownedBusSubcomponent+=BusSubcomponent | ownedVirtualBusSubcomponent+=VirtualBusSubcomponent
	  |ownedDataSubcomponent+=DataSubcomponent | ownedAbstractSubcomponent+=AbstractSubcomponent
	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	(
		'processor' 'features' (
			ownedPortProxy+= PortProxy
			| ownedSubprogramProxy+= SubprogramProxy
		)+
	)?
	('calls'
	((ownedSubprogramCallSequence+=SubprogramCallSequence)+
	| noCalls?='none' ';'
	)
	)?
	('connections'
	((ownedPortConnection+=PortConnection | ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	| ownedParameterConnection+=ParameterConnection
	)+
	| (noConnections?='none' ';')))?
	('flows'
		((ownedFlowImplementation+=(FlowImplementation)|ownedEndToEndFlow+=EndToEndFlow)+ |
	(noFlows?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

SystemImplementation returns aadl2::SystemImplementation:
	'system' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	( 'subcomponents'
	  ((ownedSystemSubcomponent+=SystemSubcomponent
	  |ownedSubprogramSubcomponent+=SubprogramSubcomponent |ownedSubprogramGroupSubcomponent+=SubprogramGroupSubcomponent
	  | ownedProcessSubcomponent+=ProcessSubcomponent
	  |ownedProcessorSubcomponent+=ProcessorSubcomponent
	  | ownedVirtualProcessorSubcomponent+=VirtualProcessorSubcomponent 
	  | ownedMemorySubcomponent+=MemorySubcomponent | ownedDeviceSubcomponent+=DeviceSubcomponent
	  | ownedBusSubcomponent+=BusSubcomponent | ownedVirtualBusSubcomponent+=VirtualBusSubcomponent
	  |ownedDataSubcomponent+=DataSubcomponent | ownedAbstractSubcomponent+=AbstractSubcomponent
	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	(
		'processor' 'features' (
			ownedPortProxy+= PortProxy
			| ownedSubprogramProxy+= SubprogramProxy
		)+
	)?
	('connections'
	((ownedPortConnection+=PortConnection | ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	)+
	| (noConnections?='none' ';')))?
	('flows'
		((ownedFlowImplementation+=(FlowImplementation)|ownedEndToEndFlow+=EndToEndFlow)+ |
	(noFlows?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

ProcessImplementation returns aadl2::ProcessImplementation:
	'process' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedThreadGroupSubcomponent+=ThreadGroupSubcomponent | ownedThreadSubcomponent+=ThreadSubcomponent
	  |ownedSubprogramSubcomponent+=SubprogramSubcomponent |ownedSubprogramGroupSubcomponent+=SubprogramGroupSubcomponent
	  |ownedDataSubcomponent+=DataSubcomponent | ownedAbstractSubcomponent+=AbstractSubcomponent
	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	(
		'processor' 'features' (
			ownedPortProxy+= PortProxy
			| ownedSubprogramProxy+= SubprogramProxy
		)+
	)?
	('connections'
	((ownedPortConnection+=PortConnection | ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	)+
	| (noConnections?='none' ';')))?
	('flows'
		((ownedFlowImplementation+=(FlowImplementation)|ownedEndToEndFlow+=EndToEndFlow)+ |
	(noFlows?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

ThreadGroupImplementation returns aadl2::ThreadGroupImplementation:
	'thread' 'group' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedThreadGroupSubcomponent+=ThreadGroupSubcomponent | ownedThreadSubcomponent+=ThreadSubcomponent
	  |ownedSubprogramSubcomponent+=SubprogramSubcomponent |ownedSubprogramGroupSubcomponent+=SubprogramGroupSubcomponent
	  |ownedDataSubcomponent+=DataSubcomponent | ownedAbstractSubcomponent+=AbstractSubcomponent
	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	(
		'processor' 'features' (
			ownedPortProxy+= PortProxy
			| ownedSubprogramProxy+= SubprogramProxy
		)+
	)?
	('connections'
	((ownedPortConnection+=PortConnection | ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	)+
	| (noConnections?='none' ';')))?
	('flows'
		((ownedFlowImplementation+=(FlowImplementation)|ownedEndToEndFlow+=EndToEndFlow)+ |
	(noFlows?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

ThreadImplementation returns aadl2::ThreadImplementation:
	'thread' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedSubprogramSubcomponent+=SubprogramSubcomponent
	  |ownedSubprogramGroupSubcomponent+=SubprogramGroupSubcomponent
	  |ownedDataSubcomponent+=DataSubcomponent | ownedAbstractSubcomponent+=AbstractSubcomponent
	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	(
		'processor' 'features' (
			ownedPortProxy+= PortProxy
			| ownedSubprogramProxy+= SubprogramProxy
		)+
	)?
	('calls'
	((ownedSubprogramCallSequence+=SubprogramCallSequence)+
	 | noCalls?='none' ';'
	))?
	('connections'
	((ownedPortConnection+=PortConnection | ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	| ownedParameterConnection+=ParameterConnection
	)+
	| (noConnections?='none' ';')))?
	('flows'
		((ownedFlowImplementation+=(FlowImplementation)|ownedEndToEndFlow+=EndToEndFlow)+ |
	(noFlows?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

SubprogramImplementation returns aadl2::SubprogramImplementation:
	'subprogram' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedAbstractSubcomponent+=AbstractSubcomponent
	  |ownedSubprogramSubcomponent+=SubprogramSubcomponent
	  |ownedDataSubcomponent+=DataSubcomponent)+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	(
		'processor' 'features' (
			ownedPortProxy+= PortProxy
			| ownedSubprogramProxy+= SubprogramProxy
		)+
	)?
	('calls'
	((ownedSubprogramCallSequence+=SubprogramCallSequence)+
	 | noCalls?='none' ';'
	))?
	('connections'
	((ownedPortConnection+=PortConnection | ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	| ownedParameterConnection+=ParameterConnection
	)+
	| (noConnections?='none' ';')))?
	('flows'
		((ownedFlowImplementation+=(FlowImplementation)|ownedEndToEndFlow+=EndToEndFlow)+ |
	(noFlows?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

SubprogramGroupImplementation returns aadl2::SubprogramGroupImplementation:
	'subprogram' 'group' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedSubprogramSubcomponent+=SubprogramSubcomponent | ownedAbstractSubcomponent+=AbstractSubcomponent
	| ownedSubprogramGroupSubcomponent+=SubprogramGroupSubcomponent 
	| ownedDataSubcomponent+=DataSubcomponent 
	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	(
		'processor' 'features' (
			ownedPortProxy+= PortProxy
			| ownedSubprogramProxy+= SubprogramProxy
		)+
	)?
	('connections'
	(( ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	)+
	| (noConnections?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

ProcessorImplementation returns aadl2::ProcessorImplementation:
	'processor' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedMemorySubcomponent+=MemorySubcomponent | ownedAbstractSubcomponent+=AbstractSubcomponent
	  | ownedBusSubcomponent+=BusSubcomponent | ownedVirtualBusSubcomponent+=VirtualBusSubcomponent
	  | ownedVirtualProcessorSubcomponent+=VirtualProcessorSubcomponent	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	('connections'
	((ownedPortConnection+=PortConnection | ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	)+
	| (noConnections?='none' ';')))?
	('flows'
		((ownedFlowImplementation+=(FlowImplementation)|ownedEndToEndFlow+=EndToEndFlow)+ |
	(noFlows?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

VirtualProcessorImplementation returns aadl2::VirtualProcessorImplementation:
	'virtual' 'processor' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedAbstractSubcomponent+=AbstractSubcomponent
	  | ownedVirtualBusSubcomponent+=VirtualBusSubcomponent
	  | ownedVirtualProcessorSubcomponent+=VirtualProcessorSubcomponent
	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	(
		'processor' 'features' (
			ownedPortProxy+= PortProxy
			| ownedSubprogramProxy+= SubprogramProxy
		)+
	)?
	('connections'
	((ownedPortConnection+=PortConnection | ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	)+
	| (noConnections?='none' ';')))?
	('flows'
		((ownedFlowImplementation+=(FlowImplementation)|ownedEndToEndFlow+=EndToEndFlow)+ |
	(noFlows?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

DeviceImplementation returns aadl2::DeviceImplementation:
	'device' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedAbstractSubcomponent+=AbstractSubcomponent | ownedDataSubcomponent+=DataSubcomponent
    	| ownedVirtualBusSubcomponent+=VirtualBusSubcomponent
	  | ownedBusSubcomponent+=BusSubcomponent
	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	(
		'processor' 'features' (
			ownedPortProxy+= PortProxy
			| ownedSubprogramProxy+= SubprogramProxy
		)+
	)?
	('connections'
	((ownedPortConnection+=PortConnection | ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	)+
	| (noConnections?='none' ';')))?
	('flows'
		((ownedFlowImplementation+=(FlowImplementation)|ownedEndToEndFlow+=EndToEndFlow)+ |
	(noFlows?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

MemoryImplementation returns aadl2::MemoryImplementation:
	'memory' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedAbstractSubcomponent+=AbstractSubcomponent
	  | ownedMemorySubcomponent+=MemorySubcomponent
	  | ownedBusSubcomponent+=BusSubcomponent
	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	('connections'
	((ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	)+
	| (noConnections?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

BusImplementation returns aadl2::BusImplementation:
	'bus' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedAbstractSubcomponent+=AbstractSubcomponent
	  | ownedVirtualBusSubcomponent+=VirtualBusSubcomponent
	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

VirtualBusImplementation returns aadl2::VirtualBusImplementation:
	'virtual' 'bus' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedAbstractSubcomponent+=AbstractSubcomponent
	  | ownedVirtualBusSubcomponent+=VirtualBusSubcomponent
	  )+
	| (noSubcomponents?='none' ';'))
	)?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

DataImplementation returns aadl2::DataImplementation:
	{aadl2::DataImplementation}
	'data' 'implementation' 
	ownedRealization=Realization '.' name=INAME
	(ownedExtension=ImplementationExtension )?
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	('prototypes' 
		(  (ownedPrototype+=Prototype)+
		|(noPrototypes?='none' ';')
	))?
	('subcomponents'
	  ((ownedAbstractSubcomponent+=AbstractSubcomponent
	  | ownedDataSubcomponent+=DataSubcomponent | ownedSubprogramSubcomponent+=SubprogramSubcomponent
	  )+
	| (noSubcomponents?='none' ';')))?
	(
		'internal' 'features' (
			ownedEventSource+= EventSource
			| ownedEventDataSource+= EventDataSource
		)+
	)?
	('connections'
	(( ownedAccessConnection+=AccessConnection
	|ownedFeatureGroupConnection+=FeatureGroupConnection | ownedFeatureConnection+=FeatureConnection
	)+
	| (noConnections?='none' ';')))?
	('flows'
		((ownedFlowImplementation+=(FlowImplementation)|ownedEndToEndFlow+=EndToEndFlow)+ |
	(noFlows?='none' ';')))?
	('modes'
	((ownedMode+=Mode | ownedModeTransition+=ModeTransition)+
	| (noModes?='none' ';')))?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' FULLINAME ';'
	;

/* subprogram calls */

SubprogramCallSequence returns aadl2::SubprogramCallSequence:
	name = ID ':' '{'
	( ownedSubprogramCall+=SubprogramCall)+
	'}'
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	( 'in' 'modes' '(' (inMode+=[aadl2::Mode|ID](',' inMode+=[aadl2::Mode|ID])* ) ')')? 
	';'
;


SubprogramCall returns aadl2::SubprogramCall:
     {aadl2::SubprogramCall}name=ID ':' 'subprogram'
		// direct assignment of context does not work because the name <id>.<id> could also refer to a component implementation
		// therefore we let the LinkingService figure out what kind of reference we have and set the context as appropriate
     	//calledSubprogram=[aadl2::CalledSubprogram|QCREF]
    	(
    		(context=[aadl2::CallContext|PNAME] '.' calledSubprogram=[aadl2::CalledSubprogram|ID])
     		| calledSubprogram=[aadl2::CalledSubprogram|PNAME]
    		| ('processor' '.' calledSubprogram=[aadl2::SubprogramProxy|ID])
		)
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	';'
;



//******* Prototypes

Prototype returns aadl2::Prototype:
	((ComponentPrototype
	(constrainingClassifier=[aadl2::ComponentClassifier|QCREF])?
	( array?='[' ']')?
	) | FeatureGroupPrototype | FeaturePrototype)
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	';'
;

ComponentPrototype returns aadl2::ComponentPrototype:
	AbstractPrototype | BusPrototype | DevicePrototype | MemoryPrototype | ProcessPrototype | ProcessorPrototype |
		SubprogramPrototype | SubprogramGroupPrototype | ThreadPrototype | ThreadGroupPrototype | VirtualBusPrototype | VirtualProcessorPrototype | 
	SystemPrototype | DataPrototype
;

AbstractPrototype returns aadl2::AbstractPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'abstract' 
	;

BusPrototype returns aadl2::BusPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'bus' 
	;

DataPrototype returns aadl2::DataPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'data' 
	;

DevicePrototype returns aadl2::DevicePrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'device' 
	;

MemoryPrototype returns aadl2::MemoryPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'memory' 
	;

ProcessPrototype returns aadl2::ProcessPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'process' 
	;

ProcessorPrototype returns aadl2::ProcessorPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'processor' 
	;

SubprogramPrototype returns aadl2::SubprogramPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'subprogram' 
	;

SubprogramGroupPrototype returns aadl2::SubprogramGroupPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'subprogram' 'group'
	;

SystemPrototype returns aadl2::SystemPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'system' 
	;


ThreadPrototype returns aadl2::ThreadPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'thread' 
	;

ThreadGroupPrototype returns aadl2::ThreadGroupPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'thread' 'group'
	;

VirtualBusPrototype returns aadl2::VirtualBusPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'virtual' 'bus'
	;

VirtualProcessorPrototype returns aadl2::VirtualProcessorPrototype:
	((name=ID ':' )|
	(refined=[aadl2::ComponentPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'virtual' 'processor'
	;


FeatureGroupPrototype returns aadl2::FeatureGroupPrototype:
	((name=ID ':' )|
	(refined=[aadl2::FeatureGroupPrototype|REFINEDNAME] ':' 'refined' 'to'))
	'feature' 'group'
	(constrainingFeatureGroupType=[aadl2::FeatureGroupType|QCREF])?
	;

FeaturePrototype returns aadl2::FeaturePrototype:
	((name=ID ':' )|
	(refined=[aadl2::FeaturePrototype|REFINEDNAME] ':' 'refined' 'to'))
	(in ?= 'in' | out ?= 'out')? // only in or out not inout
	'feature'
	(constrainingClassifier=[aadl2::ComponentClassifier|QCREF])?
	;

/*
 * Prototype Bindings
 */

PrototypeBinding returns aadl2::PrototypeBinding:
	FeatureGroupPrototypeBinding | FeaturePrototypeBinding | ComponentPrototypeBinding
	;


FeatureGroupPrototypeBinding returns aadl2::FeatureGroupPrototypeBinding:
	formal=[aadl2::Prototype|ID] '=>'  'feature' 'group' 
	actual=FeatureGroupPrototypeActual
	;

FeatureGroupPrototypeActual returns aadl2::FeatureGroupPrototypeActual:
	featureType=[aadl2::FeatureType|QCREF]
	  ('(' binding+=PrototypeBinding (','  binding+=PrototypeBinding)* ')')?
	;


FeaturePrototypeBinding returns aadl2::FeaturePrototypeBinding:
	formal=[aadl2::Prototype|ID] '=>'   
	actual=(PortSpecification|AccessSpecification|FeaturePrototypeReference)
	;

PortSpecification returns aadl2::PortSpecification:
	(in ?= 'in' out ?= 'out'? | out ?= 'out') 
	category=PortCategory 'port' (classifier=[aadl2::ComponentClassifier|QCREF])?
	;
	
AccessSpecification returns aadl2::AccessSpecification:
	kind=AccessDirection category=AccessCategory 'access' (classifier=[aadl2::ComponentClassifier|QCREF])?
	;

	
FeaturePrototypeReference returns aadl2::FeaturePrototypeReference:
	(in ?= 'in' | out ?= 'out')? 'feature' prototype=[aadl2::FeaturePrototype|ID]
	;


ComponentPrototypeBinding returns aadl2::ComponentPrototypeBinding:
	formal=[aadl2::Prototype|ID] '=>'    
	(actual+=ComponentReference |
	'(' actual+=ComponentReference (',' actual+=ComponentReference)* ')'
	)
	;
ComponentReference returns aadl2::ComponentPrototypeActual:
	 category=ComponentCategory subcomponentType=[aadl2::SubcomponentType|QCREF]('(' binding+=PrototypeBinding (',' binding+=PrototypeBinding)*')')?
	;


/*
 * Subcomponents
 */

AbstractSubcomponent returns aadl2::AbstractSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::AbstractSubcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'abstract'
	(abstractSubcomponentType=[aadl2::AbstractSubcomponentType|QCREF] 
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

SystemSubcomponent returns aadl2::SystemSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'system'
	(systemSubcomponentType=[aadl2::SystemSubcomponentType|QCREF] 
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

ProcessSubcomponent returns aadl2::ProcessSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'process'
	(processSubcomponentType=[aadl2::ProcessSubcomponentType|QCREF] 
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

ThreadGroupSubcomponent returns aadl2::ThreadGroupSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'thread' 'group'
	(threadGroupSubcomponentType=[aadl2::ThreadGroupSubcomponentType|QCREF] 
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

ThreadSubcomponent returns aadl2::ThreadSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'thread'
	(threadSubcomponentType=[aadl2::ThreadSubcomponentType|QCREF] 
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

SubprogramSubcomponent returns aadl2::SubprogramSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'subprogram'
	(subprogramSubcomponentType=[aadl2::SubprogramSubcomponentType|QCREF] 
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

SubprogramGroupSubcomponent returns aadl2::SubprogramGroupSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'subprogram' 'group'
	(subprogramGroupSubcomponentType=[aadl2::SubprogramGroupSubcomponentType|QCREF] 
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

ProcessorSubcomponent returns aadl2::ProcessorSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'processor' 
	 (processorSubcomponentType=[aadl2::ProcessorSubcomponentType|QCREF]
	 	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

VirtualProcessorSubcomponent returns aadl2::VirtualProcessorSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'virtual' 'processor' 
	 (virtualProcessorSubcomponentType=[aadl2::VirtualProcessorSubcomponentType|QCREF]
	 	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

DeviceSubcomponent returns aadl2::DeviceSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'device' 
	 (deviceSubcomponentType=[aadl2::DeviceSubcomponentType|QCREF]
	 	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

MemorySubcomponent returns aadl2::MemorySubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'memory' 
	 (memorySubcomponentType=[aadl2::MemorySubcomponentType|QCREF]
	 	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

BusSubcomponent returns aadl2::BusSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'bus' 
	 (busSubcomponentType=[aadl2::BusSubcomponentType|QCREF]
	 	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

VirtualBusSubcomponent returns aadl2::VirtualBusSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'virtual' 'bus' 
	 (virtualBusSubcomponentType=[aadl2::VirtualBusClassifier|QCREF]
	 	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	 )?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';

DataSubcomponent returns aadl2::DataSubcomponent:
	((name=ID ':' )|
	(refined=[aadl2::Subcomponent|REFINEDNAME] ':' 'refined' 'to'))
	'data' 
	(dataSubcomponentType=[aadl2::DataSubcomponentType|QCREF] 
	 ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	 ( (arrayDimension+=ArrayDimension )+
	  ( '(' implementationReference+=ComponentImplementationReference  
	  (',' implementationReference+=ComponentImplementationReference)*
	  ')' )? 
	 )?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')?  
	('in' 'modes' '(' (ownedModeBinding+=ModeRef(',' ownedModeBinding+=ModeRef)* 
		 ) ')')?
	';';


ArrayDimension returns aadl2::ArrayDimension:
	{aadl2::ArrayDimension}'[' (size=ArraySize)? ']'
;

ArraySize returns aadl2::ArraySize:
	size=INTVALUE | sizeProperty=[aadl2::ArraySizeProperty|QPREF] 
;



ComponentImplementationReference returns aadl2::ComponentImplementationReference:
	{aadl2::ComponentImplementationReference}implementation=[aadl2::ComponentImplementation|QCREF] 
	('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
;



// ******** Features

DataPort returns aadl2::DataPort:
	{aadl2::DataPort}
	((name=ID ':' )|
	(refined=[aadl2::Feature|REFINEDNAME] ':' 'refined' 'to'))
	(in ?= 'in' out ?= 'out'? | out ?= 'out') 
	'data' 'port' (dataFeatureClassifier=[aadl2::DataSubcomponentType|QCREF])? 
	(arrayDimension+=ArrayDimension)?
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')? 
	';' 
	;

EventDataPort returns aadl2::EventDataPort:
	{aadl2::EventDataPort}
	((name=ID ':' )|
	(refined=[aadl2::Feature|REFINEDNAME] ':' 'refined' 'to'))
	(in ?= 'in' out ?= 'out'? | out ?= 'out') 
	'event' 'data' 'port' (dataFeatureClassifier=[aadl2::DataSubcomponentType|QCREF])? 
	(arrayDimension+=ArrayDimension)?
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')? 
	';' 
	;

EventPort returns aadl2::EventPort:
	{aadl2::EventPort}
	((name=ID ':' )|
	(refined=[aadl2::Feature|REFINEDNAME] ':' 'refined' 'to'))
	(in ?= 'in' out ?= 'out'? | out ?= 'out') 
	'event' 'port' 
	(arrayDimension+=ArrayDimension)?
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')? 
	';' 
	;

FeatureGroup returns aadl2::FeatureGroup:
		// default is inout if no direction
	((name=ID ':' )|
	(refined=[aadl2::Feature|REFINEDNAME] ':' 'refined' 'to'))
	(in ?= 'in' | out ?= 'out')? 'feature' 'group' 
	(( inverse?='inverse' 'of')?
	featureType=[aadl2::FeatureType|QCREF] )?
	(arrayDimension+=ArrayDimension)?
	('{' (ownedPropertyAssociation+=ContainedPropertyAssociation)+ '}')? ';' 
	;

Parameter returns aadl2::Parameter:
	((name=ID ':' )|
	(refined=[aadl2::Feature|REFINEDNAME] ':' 'refined' 'to'))
	(in ?= 'in' out ?= 'out'? | out ?= 'out') 'parameter' (dataFeatureClassifier=[aadl2::DataSubcomponentType|QCREF])? 
	(arrayDimension+=ArrayDimension)?
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')? ';' 
	;

// AccessCategory not set (is encoded in type)
SubprogramAccess returns aadl2::SubprogramAccess: 
	((name=ID ':' )|
	(refined=[aadl2::Feature|REFINEDNAME] ':' 'refined' 'to'))
	kind=AccessDirection 
	'subprogram' 'access' (subprogramFeatureClassifier=[aadl2::SubprogramSubcomponentType|QCREF])? 
	(arrayDimension+=ArrayDimension)?
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')? ';' 
;
SubprogramGroupAccess returns aadl2::SubprogramGroupAccess: 
	((name=ID ':' )|
	(refined=[aadl2::Feature|REFINEDNAME] ':' 'refined' 'to'))
	kind=AccessDirection 
	'subprogram' 'group' 'access' (subprogramGroupFeatureClassifier=[aadl2::SubprogramGroupSubcomponentType|QCREF])? 
	(arrayDimension+=ArrayDimension)?
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')? ';' 
;
BusAccess returns aadl2::BusAccess: 
	((name=ID ':' )|
	(refined=[aadl2::Feature|REFINEDNAME] ':' 'refined' 'to'))
	kind=AccessDirection  
	'bus' 'access' (busFeatureClassifier=[aadl2::BusSubcomponentType|QCREF])? 
	(arrayDimension+=ArrayDimension)?
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')? ';' 
;
DataAccess returns aadl2::DataAccess: 
	((name=ID ':' )|
	(refined=[aadl2::Feature|REFINEDNAME] ':' 'refined' 'to'))
	kind=AccessDirection 
	'data' 'access' (dataFeatureClassifier=[aadl2::DataSubcomponentType|QCREF])? 
	(arrayDimension+=ArrayDimension)?
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')? ';' 
;
AbstractFeature returns aadl2::AbstractFeature:
	// default is inout if no direction
	((name=ID ':' )|
	(refined=[aadl2::AbstractFeature|REFINEDNAME] ':' 'refined' 'to'))
	(in ?= 'in' | out ?= 'out')? 
	(('prototype' (featurePrototype=[aadl2::FeaturePrototype|QCREF])? )
	| ('feature' (abstractFeatureClassifier=[aadl2::FeatureClassifier|QCREF])?)
	)
	(arrayDimension+=ArrayDimension)?
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')? ';' 
	;


PortDirection returns aadl2::DirectionType: 'in' | 'out' |  'in' 'out';
InOutDirection returns aadl2::DirectionType: 'in' | 'out' ;
AccessDirection returns aadl2::AccessType: 'requires' | 'provides';

PortCategory returns aadl2::PortCategory: 'data' | 'event' |  ('event' 'data');


FeatureGroupType returns aadl2::FeatureGroupType:
	'feature' 'group' name=ID 
	(  ownedExtension=GroupExtension
	  ('(' ownedPrototypeBinding+=PrototypeBinding (','  ownedPrototypeBinding+=PrototypeBinding)* ')')?
	)?
	('prototypes' ((noPrototypes?='none' ';') |
	(ownedPrototype+=Prototype)+))?
	('features' (// no none for FGT in standard 2.1 (noFeatures?='none' ';') |
	(ownedDataPort+=DataPort| ownedEventPort+=EventPort | ownedEventDataPort+=EventDataPort
	| ownedFeatureGroup+=FeatureGroup | ownedDataAccess+=DataAccess | ownedBusAccess+=BusAccess
	| ownedSubprogramAccess+=SubprogramAccess | ownedSubprogramGroupAccess+=SubprogramGroupAccess
	| ownedAbstractFeature+=AbstractFeature
	| ownedParameter+=Parameter
	)+ ) )?
	('inverse' 'of' inverse=[aadl2::FeatureGroupType|QCREF])?
	('properties'
	((ownedPropertyAssociation+=ContainedPropertyAssociation)+
	| (noProperties?='none' ';')))?
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';';

// ********* internal features

//This rule is dead code in the grammar, but it is needed by the formatter.
InternalFeature returns aadl2::InternalFeature:
	(
		EventSource | EventDataSource
	)
	';' 
;

//This rule is dead code in the grammar, but it is needed by the formatter.
ProcessorFeature returns aadl2::ProcessorFeature:
	(
		PortProxy | SubprogramProxy
	)
	';'
;

EventSource returns aadl2::EventSource:
	name = ID ':' 'event'
	(
		'{'
			(ownedPropertyAssociation+=PropertyAssociation)+
		'}'
	)?
	';'
;

EventDataSource returns aadl2::EventDataSource:
	name = ID ':' 'event' 'data'
	(
		dataClassifier = [aadl2::DataClassifier|QCREF]
	)?
	(
		'{'
			(ownedPropertyAssociation+=PropertyAssociation)+
		'}'
	)?
	';'
;

PortProxy returns aadl2::PortProxy:
	name = ID ':' 'port'
	(
		dataClassifier = [aadl2::DataClassifier|QCREF]
	)?
	(
		'{'
			(ownedPropertyAssociation+=PropertyAssociation)+
		'}'
	)?
	';'
;

SubprogramProxy returns aadl2::SubprogramProxy:
	name = ID ':' 'subprogram'
	(
		subprogramClassifier = [aadl2::SubprogramClassifier|QCREF]
	)?
	(
		'{'
			(ownedPropertyAssociation+=PropertyAssociation)+
		'}'
	)?
	';'
;

// ********* connections 

ConnectedElement returns aadl2::ConnectedElement:
	(context=[aadl2::Context|ID] '.')? 
	connectionEnd=[aadl2::ConnectionEnd|ID]
;

ProcessorPort returns aadl2::ConnectedElement:
	'processor' '.' connectionEnd=[aadl2::PortProxy|ID]
;

ProcessorSubprogram returns aadl2::ConnectedElement:
	'processor' '.' connectionEnd=[aadl2::SubprogramProxy|ID]
;

InternalEvent returns aadl2::ConnectedElement:
	'self' '.' connectionEnd=[aadl2::InternalFeature|ID]
;

AbstractConnectionEnd returns aadl2::ConnectedElement:
	 ConnectedElement | ProcessorPort | InternalEvent
;

ProcessorConnectionEnd returns aadl2::ConnectedElement:
	 ConnectedElement | ProcessorPort
;

AccessConnectionEnd returns aadl2::ConnectedElement:
	 ConnectedElement | ProcessorSubprogram
;

PortConnection returns aadl2::PortConnection:
	((name=ID ':' 'port' 
			source=AbstractConnectionEnd
	('->' | bidirectional?='<->')
	destination=AbstractConnectionEnd )
	|
	(refined=[aadl2::PortConnection|REFINEDNAME] ':' 'refined' 'to' 'port'))
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	( 'in' 'modes' '(' (inModeOrTransition+=[aadl2::ModeFeature|ID] (',' inModeOrTransition+=[aadl2::ModeFeature|ID])* 
	) ')')? 
	';';

AccessConnection returns aadl2::AccessConnection:
	((name=ID ':'  accessCategory=AccessCategory 'access'
			source=AccessConnectionEnd
	        ('->' | bidirectional?='<->')
	        destination=AccessConnectionEnd )
	|
	(refined=[aadl2::AccessConnection|REFINEDNAME] ':' 'refined' 'to' accessCategory=AccessCategory 'access'))
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	( 'in' 'modes' '(' (inModeOrTransition+=[aadl2::ModeFeature|ID] (',' inModeOrTransition+=[aadl2::ModeFeature|ID])* 
	) ')')? 
	';';

FeatureGroupConnection returns aadl2::FeatureGroupConnection:
	((name=ID ':'  'feature' 'group'
	source=ConnectedElement
	( '->' | bidirectional?='<->')
	destination=ConnectedElement )
	|
	(refined=[aadl2::FeatureGroupConnection|REFINEDNAME] ':' 'refined' 'to' 'feature' 'group'))
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	( 'in' 'modes' '(' (inModeOrTransition+=[aadl2::ModeFeature|ID] (',' inModeOrTransition+=[aadl2::ModeFeature|ID])* 
	) ')')? 
	';';

FeatureConnection returns aadl2::FeatureConnection:
	((name=ID ':'  'feature' 
			source=ConnectedElement ('->' | bidirectional?='<->') destination=ConnectedElement )
		|
	(refined=[aadl2::FeatureConnection|REFINEDNAME] ':' 'refined' 'to' 'feature'))
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	( 'in' 'modes' '(' (inModeOrTransition+=[aadl2::ModeFeature|ID] (',' inModeOrTransition+=[aadl2::ModeFeature|ID])* 
	) ')')? 
	';';

ParameterConnection returns aadl2::ParameterConnection:
	((name=ID ':' 'parameter'
	source=ConnectedElement
	 '->'
	destination=ConnectedElement 
	)|
	(refined=[aadl2::ParameterConnection|REFINEDNAME] ':' 'refined' 'to' 'parameter'))
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	( 'in' 'modes' '(' (inModeOrTransition+=[aadl2::ModeFeature|ID] (',' inModeOrTransition+=[aadl2::ModeFeature|ID])* 
	) ')')? 
	';';

AccessCategory returns aadl2::AccessCategory:
	'bus' | 'data' | 'subprogram' | 'subprogram' 'group';


// ******** Flows 

enum FlowKind returns aadl2::FlowKind:
	source='source' | path='path' | sink='sink';
	
FlowSource returns aadl2::FlowKind: 'source';
FlowSink returns aadl2::FlowKind: 'sink';
FlowPath returns aadl2::FlowKind: 'path';

FlowSpecification returns aadl2::FlowSpecification:
	(FlowSourceSpec | FlowSinkSpec | FlowPathSpec 
		| FlowSpecRefinement
	)
		('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	( 'in' 'modes' '(' inModeOrTransition+=[aadl2::ModeFeature|ID](',' inModeOrTransition+=[aadl2::ModeFeature|ID] )* ')')? 
	';'
	;

FlowSourceSpec returns aadl2::FlowSpecification:
	name=ID ':' 
	'flow' kind=FlowSource 
	outEnd=FlowEnd
;

FlowSinkSpec returns aadl2::FlowSpecification:
	name=ID ':' 
	'flow' kind=FlowSink 
	InEnd=FlowEnd
;

FlowPathSpec returns aadl2::FlowSpecification:
	name=ID ':' 
	'flow' kind=FlowPath 
	InEnd=FlowEnd
	'->' 	outEnd=FlowEnd
;

FlowEnd returns aadl2::FlowEnd:
	(context=[aadl2::Context|ID] '.' )? feature=[aadl2::Feature|ID]
;

FlowSpecRefinement returns aadl2::FlowSpecification:
	refined=[aadl2::FlowSpecification|REFINEDNAME] 
	':' 'refined' 'to' 'flow' kind=FlowKind 
	;

FlowImplementation returns aadl2::FlowImplementation:
	( FlowSourceImpl | FlowSinkImpl | FlowPathImpl )
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	( 'in' 'modes' '(' inModeOrTransition+=[aadl2::ModeFeature|ID]( ',' inModeOrTransition+=[aadl2::ModeFeature|ID])*  ')')? 
	';'
;

FlowSourceImpl returns aadl2::FlowImplementation:
	specification=[aadl2::FlowSpecification|ID] 
	':' 'flow' kind=FlowSource 
    (  ownedFlowSegment+=SubcomponentFlow '->' ownedFlowSegment+=ConnectionFlow '->' )*
FLOWOUT
;

FlowSinkImpl returns aadl2::FlowImplementation:
	specification=[aadl2::FlowSpecification|ID]//name=ID 
	':' 'flow' kind=FlowSink 
FLOWIN
    ( '->' ownedFlowSegment+=ConnectionFlow '->' ownedFlowSegment+=SubcomponentFlow  )*
;

FlowPathImpl returns aadl2::FlowImplementation:
	specification=[aadl2::FlowSpecification|ID]//name=ID 
	':' 'flow' kind=FlowPath 
FLOWIN
	(  ( '->' ownedFlowSegment+=ConnectionFlow '->' ownedFlowSegment+=SubcomponentFlow   )*
	    '->' ownedFlowSegment+=ConnectionFlow )?
 '->' FLOWOUT
;



EndToEndFlow returns aadl2::EndToEndFlow: 
    ((name=ID ':' 'end' 'to' 'end' 'flow'
    ownedEndToEndFlowSegment+=ETESubcomponentFlow
    ( '->' ownedEndToEndFlowSegment+=ETEConnectionFlow '->' ownedEndToEndFlowSegment+=ETESubcomponentFlow )+)
    | (refined=[aadl2::EndToEndFlow|REFINEDNAME] ':' 'refined' 'to' 'end' 'to' 'end' 'flow'))
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	( 'in' 'modes' '(' inModeOrTransition+=[aadl2::ModeFeature|ID]( ',' inModeOrTransition+=[aadl2::ModeFeature|ID])*  ')')? 
    ';'
    ;
// refinement should have at elast one of property or in modes. We perform a validation check    

SubcomponentFlow returns aadl2::FlowSegment:
	(context=[aadl2::Subcomponent|ID] '.')? flowElement=[aadl2::FlowElement|ID]
;

ConnectionFlow returns aadl2::FlowSegment:
	 flowElement=[aadl2::Connection|ID]
;

ETESubcomponentFlow returns aadl2::EndToEndFlowSegment:
	(context=[aadl2::Subcomponent|ID] '.')? flowElement=[aadl2::EndToEndFlowElement|ID]
;

ETEConnectionFlow returns aadl2::EndToEndFlowSegment:
	 flowElement=[aadl2::Connection|ID]
;


// Modes 

Mode returns aadl2::Mode:
	name=ID ':' initial?='initial'? 'mode' 
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	';';

ModeTransition returns aadl2::ModeTransition:
	(name=ID ':')?
	source=[aadl2::Mode|ID] '-['
	ownedTrigger+=Trigger
	(',' ownedTrigger+=Trigger)*
	']->' destination=[aadl2::Mode|ID] 
	('{' (ownedPropertyAssociation+=PropertyAssociation)+ '}')?
	';';

Trigger returns aadl2::ModeTransitionTrigger:
	(
		(context=[aadl2::Context|ID] '.')?
		triggerPort=[aadl2::Port|ID]
	)
	| 'self' '.' triggerPort=[aadl2::InternalFeature|ID]
	| 'processor' '.' triggerPort=[aadl2::PortProxy|ID]
;

// used where component_in_modes is shown in standard grammar
ModeRef returns aadl2::ModeBinding:
	parentMode=[aadl2::Mode|ID] ('=>' derivedMode=[aadl2::Mode|ID])?;


AnnexLibrary returns aadl2::AnnexLibrary:
	 DefaultAnnexLibrary;

DefaultAnnexLibrary returns aadl2::DefaultAnnexLibrary:
	'annex' name=ID
	 sourceText=ANNEXTEXT 
	';';


AnnexSubclause returns aadl2::AnnexSubclause:
	 DefaultAnnexSubclause;

DefaultAnnexSubclause returns aadl2::DefaultAnnexSubclause:
	'annex' name=ID
	 sourceText=ANNEXTEXT 
	( 'in' 'modes' '(' (inMode+=[aadl2::Mode|ID](',' inMode+=[aadl2::Mode|ID])* ) ')')? 
	';';


	// **************

// Properties

PropertySet returns aadl2::PropertySet:
	'property' 'set' name=ID 'is'
	('with' (importedUnit+=[aadl2::PropertySet|ID])  
	    (',' importedUnit+=[aadl2::PropertySet|ID])* ';')*
	(ownedPropertyType+=PropertyType | ownedProperty+=PropertyDefinition 
	| ownedPropertyConstant+=PropertyConstant)*
	(ownedAnnexSubclause+=AnnexSubclause)*
	'end' ID ';' ;

PropertyType returns aadl2::PropertyType:
	(BooleanType|StringType|EnumerationType|UnitsType |RealType
	|IntegerType|RangeType|ClassifierType|ReferenceType|RecordType) 
	';';

UnnamedPropertyType returns aadl2::PropertyType:
	(ListType|
		UnnamedBooleanType|UnnamedStringType|UnnamedEnumerationType|UnnamedUnitsType |UnnamedRealType
	|UnnamedIntegerType|UnnamedRangeType|UnnamedClassifierType|UnnamedReferenceType|UnnamedRecordType) 
	;


BooleanType returns aadl2::AadlBoolean:
	 name=ID ':' 'type' 
	'aadlboolean';


UnnamedBooleanType returns aadl2::AadlBoolean:
	{aadl2::AadlBoolean}'aadlboolean';

StringType returns aadl2::AadlString:
	name=ID ':' 'type' 
	'aadlstring';

UnnamedStringType returns aadl2::AadlString:
	{aadl2::AadlString}'aadlstring';

EnumerationType returns aadl2::EnumerationType:
	name=ID ':' 'type' 
	'enumeration'
	'(' ownedLiteral+=EnumerationLiteral (',' ownedLiteral+=EnumerationLiteral)* ')';

UnnamedEnumerationType returns aadl2::EnumerationType:
	'enumeration'
	'(' ownedLiteral+=EnumerationLiteral (',' ownedLiteral+=EnumerationLiteral)* ')';

EnumerationLiteral returns aadl2::EnumerationLiteral:
	name=ID;

UnitsType returns aadl2::UnitsType:
	name=ID ':' 'type' 
	'units'
	'(' ownedLiteral+=UnitLiteral (',' ownedLiteral+=UnitLiteralConversion)* ')';

UnnamedUnitsType returns aadl2::UnitsType:
	'units'
	'(' ownedLiteral+=UnitLiteral (',' ownedLiteral+=UnitLiteralConversion)* ')';

UnitLiteral returns aadl2::UnitLiteral:
	name=ID;

UnitLiteralConversion returns aadl2::UnitLiteral:
	name=ID '=>' baseUnit=[aadl2::UnitLiteral|ID] STAR factor=NumberValue
	;

RealType returns aadl2::AadlReal:
	name=ID ':' 'type' 
	'aadlreal' (range=RealRange)? ( (ownedUnitsType=UnnamedUnitsType| ('units' referencedUnitsType=[aadl2::UnitsType|QPREF])))?
	 ;

UnnamedRealType returns aadl2::AadlReal:
	{aadl2::AadlReal}
	'aadlreal' (range=RealRange)? ((ownedUnitsType=UnnamedUnitsType| ('units' referencedUnitsType=[aadl2::UnitsType|QPREF])))?
	 ;

IntegerType returns aadl2::AadlInteger:
	name=ID ':' 'type' 
	'aadlinteger' (range=IntegerRange)? ((ownedUnitsType=UnnamedUnitsType| ('units' referencedUnitsType=[aadl2::UnitsType|QPREF])))?
	 ;

UnnamedIntegerType returns aadl2::AadlInteger:
	{aadl2::AadlInteger}
	'aadlinteger' (range=IntegerRange)? ( (ownedUnitsType=UnnamedUnitsType| ('units' referencedUnitsType=[aadl2::UnitsType|QPREF])))?
	 ;

RangeType returns aadl2::RangeType:
	name=ID ':' 'type' 
	'range' 'of' (ownedNumberType=(UnnamedIntegerType|UnnamedRealType)
		| referencedNumberType=[aadl2::NumberType|QPREF]
	)
	 ;

UnnamedRangeType returns aadl2::RangeType:
	{aadl2::RangeType}
	'range' 'of' (ownedNumberType=(UnnamedIntegerType|UnnamedRealType)
		| referencedNumberType=[aadl2::NumberType|QPREF]
	)
	 ;

ClassifierType returns aadl2::ClassifierType:
	name=ID ':' 'type' 
	'classifier' 
	('(' classifierReference+=QMReference (',' classifierReference+=QMReference)*')')?
	 ;

UnnamedClassifierType returns aadl2::ClassifierType:
	{aadl2::ClassifierType}
	'classifier' 
	('(' classifierReference+=QMReference (',' classifierReference+=QMReference)*')')?
	 ;

QMReference returns aadl2::MetaclassReference:
	('{'  annexName=ID '}' STAR STAR )?
	( metaclassName+=(CoreKeyWord|ID) )+
	 ;

QCReference returns aadl2::ClassifierValue:
   classifier=[aadl2::ComponentClassifier|FQCREF]
  ;

ReferenceType returns aadl2::ReferenceType:
	name=ID ':' 'type' 
	'reference' 
	('(' namedElementReference+=QMReference (',' namedElementReference+=QMReference)* ')')?
	 ;

UnnamedReferenceType returns aadl2::ReferenceType:
	'reference' {aadl2::ReferenceType}
	('(' namedElementReference+=QMReference (',' namedElementReference+=QMReference)* ')')?
	 ;

RecordType returns aadl2::RecordType:
	name=ID ':' 'type' 
	'record' '('
	(ownedField+=RecordField )+
	')'
	 ;

UnnamedRecordType returns aadl2::RecordType:
	'record' '('
	(ownedField+=RecordField )+
	')'
	 ;

RecordField returns aadl2::BasicProperty:
	name=ID ':'
//	('list' 'of')* is handled as part of UnnamedPropertytype
	(referencedPropertyType=[aadl2::PropertyType|QPREF]|ownedPropertyType=UnnamedPropertyType)
	';'
	 ;

//&&&&& Property Definition


PropertyDefinition returns aadl2::Property:
	name=ID ':'
	(inherit?='inherit')?
//	('list' 'of')* is handled as part of UnnamedPropertytype
	(referencedPropertyType=[aadl2::PropertyType|QPREF]|ownedPropertyType=UnnamedPropertyType)
	('=>' defaultValue=PropertyExpression)?
	'applies' 'to' '('
	((appliesTo+=PropertyOwner (',' appliesTo+=PropertyOwner)*)|
	appliesTo+=AllReference)
	')'
	';'
	 ;

AllReference returns aadl2::MetaclassReference:
	 metaclassName+='all'  // &&&&& actually set it to NamedElement using ALL rule returning "named element" as string
;

ListType returns aadl2::ListType:
	 'list' 'of'  
	(referencedElementType=[aadl2::PropertyType|QPREF]|ownedElementType=UnnamedPropertyType)
;


PropertyOwner returns aadl2::PropertyOwner:
	// classifier value is always qualified by a package name
	QMReference | QCReference
	 ;



PropertyConstant returns aadl2::PropertyConstant:
	name=ID ':' 'constant'
//	('list' 'of')* is handled as part of UnnamedPropertytype
	(referencedPropertyType=[aadl2::PropertyType|QPREF]|ownedPropertyType=UnnamedPropertyType)
	'=>' constantValue=ConstantPropertyExpression  
	';'
	 ;




NumberValue returns aadl2::NumberValue:
	RealLit | IntegerLit ;

RealLit returns aadl2::RealLiteral:
	value=SignedReal ;


IntegerLit returns aadl2::IntegerLiteral:
	value=SignedInt ;

ConstantPropertyExpression returns aadl2::PropertyExpression:
//	OldRecordTerm | 
	RecordTerm | ComponentClassifierTerm
	| ComputedTerm | StringTerm |NumericRangeTerm
	| RealTerm | IntegerTerm 
	  	| ListTerm 
	 |BooleanLiteral | LiteralorReferenceTerm
	 
	;


IntegerRange returns aadl2::NumericRange:
	lowerBound=(IntegerTerm | SignedConstant | ConstantValue )
	'..' upperBound=(IntegerTerm | SignedConstant | ConstantValue )
	;

RealRange returns aadl2::NumericRange:
	lowerBound=(RealTerm | SignedConstant | ConstantValue )
	'..' upperBound=(RealTerm | SignedConstant | ConstantValue )
	;



CoreKeyWord :
	'abstract' |'access' | 'annex'| 'applies' | 'binding'
	| 'bus' |'calls' |'classifier'| 'connections' |'constant'| 'data'| 'device'
	|'end' |'enumeration'|'event'|'extends'
	| 'feature'|'features'|'flow'|'flows'
	| 'group'|'implementation'|'in'|'inherit'|'initial'| 'internal' |'inverse'|'is'|'list'
	| 'memory'|'mode'|'modes'|'none'|'of'|'out'|'package'|'parameter'|'path'| 'port'|'private'
	| 'process'  | 'processor' | 'prototype'
	|'prototypes'|'provides'|'public'
	|'refined'|'renames'|'requires'|'self'|'set'|'sink'|'source'
	|'subcomponents'| 'subprogram'|'system'| 'thread'|'type'|'to'|'virtual'|'with'
//// properties grammar	|'properties'|'property'|'delta'|'false'|'not'| 'and'|'or'|'range'|'record'|'reference'|'true'|'units'
;



// package anme
PNAME:
	ID ('::' ID)*;
	
FLOWOUT: (ID '.')? ID
;
FLOWIN: (ID '.')? ID
;

// fully qualified classifier name (always includes package name
FQCREF:
	(ID '::')+ ID ('.' ID)?;


// implementation name (used by value converter)
INAME:
	ID;
// implementation name (used by value converter)
FULLINAME:
	ID '.' ID;

// name of refined entity. Used to set name field by value converter	
REFINEDNAME:
	ID;


terminal ANNEXTEXT:
	'{**'->'**}';



	'''
	
	override getSubName() '''Aadl2'''
	
}