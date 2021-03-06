package util;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
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
	public static String extractGrammarUriPartFromNsURI(String nsURI) {
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
	
	/**
	 * Utility method for legal a legal Style name from a given String (used as part of the grammar name)
	 * Example:
	 * 		INPUT: 		default-style.ecss; defaultStyle.ecss
	 * 		OUTPUT: 	Defaultstyle; DefaultStyle
	 */
	public static String getStyleName(String str) {
		// remove file extension
		str = str.substring(0, str.lastIndexOf('.'));
		
		StringBuilder sb = new StringBuilder();
	    
		if (Character.isLetter(str.charAt(0)) && Character.isLowerCase(str.charAt(0))) {
	        sb.append(Character.toUpperCase(str.charAt(0))); // needs to be an upper-case letter
	    
		} else if(!Character.isLetter(str.charAt(0))) {
	        sb.append('A'); // needs to be an upper-case letter
	    }
		
		// remove first character
		str = str.substring(1);
	    
		for (char c : str.toCharArray()) {
	    	if(!Character.isLetter(c)) {
		        // skip
		    } else {
	            sb.append(c);
	        }
	    }
	    return sb.toString();
	}
	
	public static void main(String args[]) {
		System.out.println(getStyleName("default-style.ecss"));
		System.out.println(getStyleName("defaultStyle.ecss"));
	}
	
}
