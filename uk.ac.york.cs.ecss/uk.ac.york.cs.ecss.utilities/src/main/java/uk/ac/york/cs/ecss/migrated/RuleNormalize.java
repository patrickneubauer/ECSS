package uk.ac.york.cs.ecss.migrated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuleNormalize {
	
	public enum StringType {
		STRING, KEYWORD, PUNCTUATION
	}
	
	public static class StringPart {
		public StringPart(StringType type, String string) {
			this.type = type;
			this.string = string;
		}
		
		private StringType type;
		private String string;
	}
	
	public static char[] smallchars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	public static char[] bigchars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	public static String getString(int index) {
		int suffix = (index/smallchars.length)+1;
		if (suffix == 1) {
			return ""+smallchars[index%smallchars.length];
		} else {
			return smallchars[index%smallchars.length]+""+suffix;
		}
	}
	
	
	public static boolean isLetterAllowed(char c) {
		return Character.isLetter(c) || Character.getType(c) == Character.CONNECTOR_PUNCTUATION ||
				Character.isDigit(c);
	}
	
	public static String normalizeString(String fullinput) {
		return normalizeString(fullinput, true);
	}
	
	public static String normalizeString(String fullinput, boolean alsoTerminals) {
		StringBuilder ret = new StringBuilder();
		String[] whiteSplit = fullinput.split("\\s+");
		List<StringPart> parts = new ArrayList<>();
		//Split: Alphanumeric, String, Other
		for (String input: whiteSplit) {
			for (int i = 0; i < input.length(); ++i) {
				char curChar = input.charAt(i);
				if (curChar == '\'' || curChar == '\"') {
					//String A
					StringBuilder cur = new StringBuilder();
					for (++i; i < input.length(); ++i) {
						char subChar = input.charAt(i);
						if (subChar == '\\') {
							cur.append(subChar);
							if (i < input.length()) {
								++i;
								cur.append(input.charAt(i));
							}
						} else if (subChar == curChar) {
							break;
						} else {
							cur.append(subChar);
						}
					}
					parts.add(new StringPart(StringType.STRING,"\'"+cur.toString()+"\'"));
				} else if (isLetterAllowed(curChar)) {
					StringBuilder partBuilder = new StringBuilder();
					for(; i < input.length(); ++i) {
						char subChar = input.charAt(i);
						if (!isLetterAllowed(subChar)) {
							--i;
							break;
						}
						partBuilder.append(subChar);
					}
					parts.add(new StringPart(StringType.KEYWORD,"\'"+partBuilder.toString()+"\'"));
				} else {
					
					for(; i < input.length(); ++i) {
						StringBuilder partBuilder = new StringBuilder();
						char subChar = input.charAt(i);
						if (isLetterAllowed(subChar) || subChar == '\'' || subChar == '\"') {
							--i;
							break;
						}
						partBuilder.append(subChar);
						parts.add(new StringPart(StringType.PUNCTUATION,partBuilder.toString()));
					}
				}
			}
		}
		Map<String,String> keywordMap = new HashMap<>();
		Map<String,String> stringMap = new HashMap<>();
		
		{
			boolean first = true;
			for (StringPart part: parts) {
				if (first) {first = false;} else {ret.append(" ");}
				if (part.type == StringType.KEYWORD) {
					String realString = keywordMap.get(part.string);
					if (realString == null) {
						keywordMap.put(part.string, realString = getString(keywordMap.size()));
					}
					part.string = realString;
				} else if (part.type == StringType.STRING) {
					if (alsoTerminals) {
						String realString = stringMap.get(part.string);
						if (realString == null) {
							stringMap.put(part.string, realString = "'"+getString(stringMap.size())+"'");
						}
						part.string = realString;
					} else {
						//Leave it
					}
				}
				ret.append(part.string);
			}
		}
		return ret.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(normalizeString("Domainmodel :\n   (elements+=Type)*;"));
		System.out.println(normalizeString("Type:\n    DataType | DataType;"));
		System.out.println(normalizeString("DataType:\n		    'datatype' name=ID;",false));
		
	}

}
