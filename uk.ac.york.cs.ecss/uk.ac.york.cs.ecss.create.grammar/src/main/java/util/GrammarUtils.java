package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrammarUtils {

	/**
	 * Utility method for extracting grammar URI from Ns URI in a String.
	 * Example:
	 * 		INPUT: 		http://cs.york.ac.uk/ecss/examples/spacetransportationservice
	 * 		OUTPUT: 	uk.ac.york.cs.ecss.examples.spacetransportationservice
	 * 
	 * @param nsURI
	 * @return
	 */
	public static String extractGrammarUriFromNsURI(String nsURI) {
		String grammarName = "";
	
		// Split URL into protocol, domain, port and URI
		Pattern pattern = Pattern.compile("(https?://)([^:^/]*)(:\\d*)?(.*)?");
		Matcher matcher = pattern.matcher(nsURI);
		matcher.find();

		String[] domain   = matcher.group(2).split("\\.");
		String[] uri      = matcher.group(4).split("\\/");
		
		for ( int i = domain.length-1; i >= 0; i-- ) {
			grammarName += domain[i].isEmpty() ? "" : domain[i] + ".";

		}
		
		if ( uri.length > 0 ) {
			for ( int i = 0; i < uri.length; i++ ) {
				grammarName += uri[i].isEmpty() ? "" : uri[i] + ".";
			}
		} 
		
		// remove last dot
		grammarName = grammarName.substring(0, grammarName.length()-1);
		
		return grammarName;
	}
	
}
