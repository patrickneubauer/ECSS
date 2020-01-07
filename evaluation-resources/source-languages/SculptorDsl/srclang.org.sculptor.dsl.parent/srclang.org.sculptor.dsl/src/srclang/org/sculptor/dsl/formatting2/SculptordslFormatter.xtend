/*
 * generated by Xtext 2.19.0
 */
package srclang.org.sculptor.dsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import sculptordsl.DslApplication
import sculptordsl.DslModel
import srclang.org.sculptor.dsl.services.SculptordslGrammarAccess

class SculptordslFormatter extends AbstractFormatter2 {
	
	@Inject extension SculptordslGrammarAccess

	def dispatch void format(DslModel dslModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (dslImport : dslModel.imports) {
			dslImport.format
		}
		dslModel.app.format
	}

	def dispatch void format(DslApplication dslApplication, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (dslModule : dslApplication.modules) {
			dslModule.format
		}
	}
	
	// TODO: implement for DslModule, DslService, DslResource, DslConsumer, DslServiceOperation, DslResourceOperation, DslRepositoryOperation, DslParameter, DslEntity, DslValueObject, DslDomainEvent, DslCommandEvent, DslTrait, DslDomainObjectOperation, DslDataTransferObject, DslBasicType, DslReference, DslRepository, DslEnum, DslEnumValue
}