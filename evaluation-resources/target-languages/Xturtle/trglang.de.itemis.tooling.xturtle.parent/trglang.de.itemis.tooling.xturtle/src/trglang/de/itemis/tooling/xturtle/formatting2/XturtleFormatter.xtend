/*
 * generated by Xtext 2.19.0
 */
package trglang.de.itemis.tooling.xturtle.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import trglang.de.itemis.tooling.xturtle.services.XturtleGrammarAccess
import xturtle.DirectiveBlock
import xturtle.Directives

class XturtleFormatter extends AbstractFormatter2 {
	
	@Inject extension XturtleGrammarAccess

	def dispatch void format(DirectiveBlock directiveBlock, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		directiveBlock.directives.format
		for (triples : directiveBlock.triples) {
			triples.format
		}
		directiveBlock.directiveblock.format
	}

	def dispatch void format(Directives directives, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (directive : directives.directive) {
			directive.format
		}
	}
	
	// TODO: implement for Triples, PredicateObjectList, BlankObjects, BlankCollection, StringLiteral
}
