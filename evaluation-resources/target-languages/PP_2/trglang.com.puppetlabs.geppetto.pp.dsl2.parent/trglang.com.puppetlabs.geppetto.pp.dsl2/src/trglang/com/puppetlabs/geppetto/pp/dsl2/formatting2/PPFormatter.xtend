/*
 * generated by Xtext 2.19.0
 */
package trglang.com.puppetlabs.geppetto.pp.dsl2.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import pp2.CollectExpression
import pp2.ExpressionTE
import trglang.com.puppetlabs.geppetto.pp.dsl2.services.PPGrammarAccess

class PPFormatter extends AbstractFormatter2 {
	
	@Inject extension PPGrammarAccess

	def dispatch void format(ExpressionTE expressionTE, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		expressionTE.expression.format
	}

	def dispatch void format(CollectExpression collectExpression, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		collectExpression.classReference.format
		collectExpression.query.format
		collectExpression.attributes.format
	}
	
	// TODO: implement for ParenthesisedExpression, ExprList, CaseExpression, ResourceExpression, ImportExpression, UnaryNotExpression, VirtualCollectQuery, UnaryMinusExpression, ExportedCollectQuery, UnlessExpression, NodeDefinition, Case, ElseExpression, PuppetManifest, LiteralList, LiteralHash, DoubleQuotedString, UnquotedString, AppendExpression, SelectorEntry, OrExpression, AssignmentExpression, NamedAccessExpression, AndExpression, ResourceBody, SelectorExpression, AtExpression, AttributeOperations, RubyLambda, JavaLambda, ElseIfExpression, HostClassDefinition, HashEntry, RelationalExpression, RelationshipExpression, AdditiveExpression, InExpression, ShiftExpression, MultiplicativeExpression, MatchingExpression, EqualityExpression, AttributeOperation, MethodCall, FunctionCall, DefinitionArgumentList, DefinitionArgument
}