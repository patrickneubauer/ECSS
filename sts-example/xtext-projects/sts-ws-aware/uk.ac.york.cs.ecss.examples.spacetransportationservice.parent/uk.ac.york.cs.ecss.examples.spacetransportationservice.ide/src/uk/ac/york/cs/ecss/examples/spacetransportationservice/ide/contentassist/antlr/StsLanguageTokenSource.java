/*
 * generated by Xtext 2.15.0
 */
package uk.ac.york.cs.ecss.examples.spacetransportationservice.ide.contentassist.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;
import uk.ac.york.cs.ecss.examples.spacetransportationservice.ide.contentassist.antlr.internal.InternalStsLanguageParser;

public class StsLanguageTokenSource extends AbstractIndentationTokenSource {

	public StsLanguageTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalStsLanguageParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalStsLanguageParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalStsLanguageParser.RULE_END;
	}

	@Override
	protected boolean shouldEmitPendingEndTokens() {
		return false;
	}
}
