/*
 * generated by Xtext 2.19.0
 */
package srclang.org.wesnoth.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import srclang.org.wesnoth.services.WMLGrammarAccess
import wML.WMLRoot
import wML.WMLTag

class WMLFormatter extends AbstractFormatter2 {
	
	@Inject extension WMLGrammarAccess

	def dispatch void format(WMLRoot wMLRoot, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (wMLRootExpression : wMLRoot.Expressions) {
			wMLRootExpression.format
		}
	}

	def dispatch void format(WMLTag wMLTag, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (wMLExpression : wMLTag.Expressions) {
			wMLExpression.format
		}
	}
	
	// TODO: implement for WMLKey, WMLMacroCall, WMLArrayCall, WMLMacroDefine, WMLPreprocIF
}
