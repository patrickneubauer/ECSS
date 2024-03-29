/*
 * generated by Xtext 2.19.0
 */
package trglang.com.puppetlabs.geppetto.module2.dsl.formatting2

import com.google.inject.Inject
import module2.JsonObject
import module2.Pair
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import trglang.com.puppetlabs.geppetto.module2.dsl.services.Module2GrammarAccess

class Module2Formatter extends AbstractFormatter2 {
	
	@Inject extension Module2GrammarAccess

	def dispatch void format(JsonObject jsonObject, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (pair : jsonObject.pairs) {
			pair.format
		}
	}

	def dispatch void format(Pair pair, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		pair.value.format
	}
	
	// TODO: implement for JsonMetadata, JsonDependency, JsonRequirement, JsonOS, UnrecognizedPair, MetadataRefPair, JsonArray
}
