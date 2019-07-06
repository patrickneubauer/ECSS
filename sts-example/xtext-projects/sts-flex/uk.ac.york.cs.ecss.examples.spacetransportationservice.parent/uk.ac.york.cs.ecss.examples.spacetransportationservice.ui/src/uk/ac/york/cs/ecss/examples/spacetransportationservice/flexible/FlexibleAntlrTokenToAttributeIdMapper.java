/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package uk.ac.york.cs.ecss.examples.spacetransportationservice.flexible;

import java.util.regex.Pattern;

import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

import com.google.inject.Singleton;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Singleton
public class FlexibleAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

	private static final Pattern QUOTED = Pattern.compile("(?:^'([^']*)'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE);
		
	private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		System.out.print("calculateId( " + tokenName + ", " + tokenType + " ): ");
		
		if(PUNCTUATION.matcher(tokenName).matches()) {
			System.out.println("PUNCTUATION_ID");
			return HighlightingStyles.PUNCTUATION_ID;
		}
		if(QUOTED.matcher(tokenName).matches() || tokenName.endsWith("_FLEXTERM")) {
			System.out.println("KEYWORD_ID");
			return HighlightingStyles.KEYWORD_ID;
		}
		if("RULE_STRING".equals(tokenName)) {
			System.out.println("STRING_ID");
			return HighlightingStyles.STRING_ID;
		}
		if("RULE_INT".equals(tokenName)) {
			System.out.println("NUMBER_ID");
			return HighlightingStyles.NUMBER_ID;
		}
		if("RULE_ML_COMMENT".equals(tokenName) || "RULE_SL_COMMENT".equals(tokenName)) {
			System.out.println("COMMENT_ID");
			return HighlightingStyles.COMMENT_ID;
		}
		System.out.println("DEFAULT_ID");
		return HighlightingStyles.DEFAULT_ID;
	}
	
}