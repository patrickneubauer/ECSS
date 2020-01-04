/*
 * generated by Xtext 2.19.0
 */
package deflang.com.puppetlabs.geppetto.pp.dsl1.formatting2

import com.google.inject.Inject
import deflang.com.puppetlabs.geppetto.pp.dsl1.services.PPGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import pp1.PuppetManifest
import pp1.VirtualCollectQuery

class PPFormatter extends AbstractFormatter2 {
	
	@Inject extension PPGrammarAccess

	def dispatch void format(PuppetManifest puppetManifest, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (expression : puppetManifest.statements) {
			expression.format
		}
	}

	def dispatch void format(VirtualCollectQuery virtualCollectQuery, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		virtualCollectQuery.expr.format
	}
	
	// TODO: implement for ExportedCollectQuery, HostClassDefinition, Definition, CaseExpression, IfExpression, ResourceExpression, ImportExpression, LiteralList, LiteralHash, RelationshipExpression, AssignmentExpression, AppendExpression, OrExpression, AndExpression, RelationalExpression, EqualityExpression, ShiftExpression, AdditiveExpression, MultiplicativeExpression, MatchingExpression, InExpression, AtExpression, CollectExpression, SelectorExpression, SelectorEntry, FunctionCall, NodeDefinition, UnaryMinusExpression, UnaryNotExpression, ElseExpression, ElseIfExpression, ParenthesisedExpression, ExprList, DoubleQuotedString, UnquotedString, UnlessExpression, NamedAccessExpression, MethodCall, WithLambdaExpression, JavaLambda, RubyLambda, DefinitionArgumentList, DefinitionArgument, Case, ResourceBody, AttributeOperations, AttributeOperation, HashEntry, ExpressionTE
}
