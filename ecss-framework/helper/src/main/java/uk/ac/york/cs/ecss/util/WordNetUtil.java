package uk.ac.york.cs.ecss.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.cmu.lti.lexical_db.ILexicalDatabase;
import edu.cmu.lti.lexical_db.NictWordNet;
import edu.cmu.lti.ws4j.RelatednessCalculator;
import edu.cmu.lti.ws4j.impl.HirstStOnge;
import edu.cmu.lti.ws4j.impl.JiangConrath;
import edu.cmu.lti.ws4j.impl.LeacockChodorow;
import edu.cmu.lti.ws4j.impl.Lesk;
import edu.cmu.lti.ws4j.impl.Lin;
import edu.cmu.lti.ws4j.impl.Path;
import edu.cmu.lti.ws4j.impl.Resnik;
import edu.cmu.lti.ws4j.impl.WuPalmer;
import edu.cmu.lti.ws4j.util.WS4JConfiguration;

/**
 * 
 * DEFAULT RELATEDNESS CALCULATOR TYPE BASED ON: The relatedness measure
 * proposed by Leacock and Chodorow (lch) is -log (length / (2 * D)), where
 * length is the length of the shortest path between the two synsets (using
 * node-counting) and D is the maximum depth of the taxonomy.
 * 
 * @author blizzfire
 *
 */
public class WordNetUtil {

	private ILexicalDatabase db;

	private RelatednessCalculator calculator;
	private SimilarityCalculator camelCaseCalculator;
	private boolean ignoreShort,ignoreNumeric;
	
	public boolean calculateCamelCase() {
		return camelCaseCalculator!=null;
	}
	
	private static ILexicalDatabase getDb() {
		ILexicalDatabase db = new NictWordNet();
		WS4JConfiguration.getInstance().setMFS(true);
		return db;
	}
	
	public WordNetUtil(RelatednessCalculatorType calculatorType) {
		this(getDb(),calculatorType);
	}

	public WordNetUtil(ILexicalDatabase db,RelatednessCalculatorType calculatorType) {
		this(db,calculatorType,false,false,false);
	}
	
	public static interface SimilarityCalculator {
		public double calcSimilarity(int[] wordLengths1, int[] wordLengths2, double[][] similarities);
	}
	public static class TotalMaxSimilarityCalculator implements SimilarityCalculator {

		@Override
		public double calcSimilarity(int[] wordLengths1, int[] wordLengths2, double[][] similarities) {
			double max = Double.NEGATIVE_INFINITY;
			for (int i = 0; i < similarities.length; ++i) {
				double[] v = similarities[i];
				for (int j = 0; j < v.length; ++j) {
					if (v[j] > max) {
						max = v[j];
					}
				}
			}
			return max;
		}
		
	}
	
	public static class BasicMaxSimilarityCalculator implements SimilarityCalculator {
		@Override
		public double calcSimilarity(int[] wordLengths1, int[] wordLengths2, double[][] similarities) {
			if (similarities.length == 0 || similarities[0].length == 0) {
				return 0.0;
			}
			double colmax = 0.0;
			double[] rowmax = new double[similarities[0].length];
			for (int i = 0; i < similarities.length; ++i) {
				double[] v = similarities[i];
				double thisMax = Double.NEGATIVE_INFINITY;
				for (int j = 0; j < v.length; ++j) {
					double val = v[j];
					if (val > thisMax) {
						thisMax = val;
					}
					if (val > rowmax[j]) {
						rowmax[j] = val;
					}
				}
				colmax+= thisMax;
			}
			colmax/=similarities.length;
			double rowmaxS = 0.0;
			for (int j = 0; j < rowmax.length; ++j) {
				rowmaxS+= rowmax[j];
			}
			rowmaxS/= rowmax.length;
			return 0.5*(colmax+rowmaxS);
		}
		
	}
	
	public WordNetUtil(RelatednessCalculatorType calculatorType, SimilarityCalculator camelCalc, boolean ignoreShort, boolean ignoreNumeric) {
		this(getDb(),calculatorType,camelCalc,ignoreShort,ignoreNumeric);
	}
	
	public WordNetUtil(ILexicalDatabase db, RelatednessCalculatorType calculatorType, SimilarityCalculator camelCalc, boolean ignoreShort, boolean ignoreNumeric) {
		this.db = db;
		this.camelCaseCalculator = camelCalc;
		this.ignoreShort = ignoreShort;
		this.ignoreNumeric = ignoreNumeric;

		if (calculatorType == RelatednessCalculatorType.HirstStOnge) {
			calculator = new HirstStOnge(db);

		} else if (calculatorType == RelatednessCalculatorType.LeacockChodorow) {
			calculator = new LeacockChodorow(db);

		} else if (calculatorType == RelatednessCalculatorType.Lesk) {
			calculator = new Lesk(db);

		} else if (calculatorType == RelatednessCalculatorType.WuPalmer) {
			calculator = new WuPalmer(db);

		} else if (calculatorType == RelatednessCalculatorType.Resnik) {
			calculator = new Resnik(db);

		} else if (calculatorType == RelatednessCalculatorType.JiangConrath) {
			calculator = new JiangConrath(db);

		} else if (calculatorType == RelatednessCalculatorType.Lin) {
			calculator = new Lin(db);

		} else if (calculatorType == RelatednessCalculatorType.Path) {
			calculator = new Path(db);
		}
	}
	
	public WordNetUtil(RelatednessCalculatorType calculatorType, boolean separateCamelCase, boolean ignoreShort, boolean ignoreNumeric) {
		this(getDb(),calculatorType,separateCamelCase?new BasicMaxSimilarityCalculator():null,ignoreShort,ignoreNumeric);
	}
	
	public WordNetUtil(ILexicalDatabase db, RelatednessCalculatorType calculatorType, boolean separateCamelCase, boolean ignoreShort, boolean ignoreNumeric) {
		this(db,calculatorType,separateCamelCase?new BasicMaxSimilarityCalculator():null,ignoreShort,ignoreNumeric);
		
	}

	public WordNetUtil() {
		db = new NictWordNet();
		WS4JConfiguration.getInstance().setMFS(true);

		if (calculator == null) {
			calculator = new LeacockChodorow(db); // this acts as default!
		}
	}
	
	public static List<String> splitCamelCase(String str, int minLength, boolean ignoreNumeric) {
		String[] split  = str.split("\\_");
		List<String> ret = new ArrayList<String>();
		for (String spl: split) {
			List<Integer> divider = new ArrayList<Integer>();
			for (int i = 1; i < spl.length(); ++i) {
				char c = spl.charAt(i);
				if (Character.isLowerCase(c) && Character.isUpperCase(spl.charAt(i-1))) {
					//Divider before that upperCase!
					if (!divider.contains(i-1)) divider.add(i-1);
				}
				if (Character.isUpperCase(c) && Character.isLowerCase(spl.charAt(i-1))) {
					if (!divider.contains(i)) divider.add(i);
				}
				if (Character.isDigit(c) && !Character.isDigit(spl.charAt(i-1))) {
					if (!divider.contains(i)) divider.add(i);
				}
				if (!Character.isDigit(c) && Character.isDigit(spl.charAt(i-1))) {
					if (!divider.contains(i)) divider.add(i);
				}
				if (Character.isAlphabetic(c) && !Character.isAlphabetic(spl.charAt(i-1))) {
					if (!divider.contains(i)) divider.add(i);
				}
				if (!Character.isAlphabetic(c) && Character.isAlphabetic(spl.charAt(i-1))) {
					if (!divider.contains(i)) divider.add(i);
				}
			}
			divider.add(spl.length());
			int lastI = 0;
			for (Integer v: divider) {
				if (lastI == v) {continue;}
				ret.add(spl.substring(lastI,v));
				lastI = v;
			}
					
		}
		//Only alphanumeric
		for (int i = 0; i < ret.size(); ++i) {
			String sstr = ret.get(i);
			StringBuilder reduced = new StringBuilder();
			for (int j = 0; j < sstr.length(); ++j) {
				char c = sstr.charAt(j);
				if (Character.isAlphabetic(c) || (!ignoreNumeric && Character.isDigit(c))) {
					reduced.append(c);
				}
			}
			ret.set(i, reduced.toString());
		}
		ret.removeIf(x->x.trim().isEmpty() || x.length()<minLength);
		return ret;
	}

	public double getWordSimilarity(String word1, String word2) {
		if (calculateCamelCase()) {
			List<String> firstString = splitCamelCase(word1,ignoreShort?2:1,ignoreNumeric);
			List<String> secondString = splitCamelCase(word2,ignoreShort?2:1,ignoreNumeric);
			int[] wordLengths1 = new int[firstString.size()];
			for (int i = 0; i < firstString.size(); ++i) {
				wordLengths1[i] = firstString.size();
			}
			int[] wordLengths2 = new int[secondString.size()];
			for (int i = 0; i < secondString.size(); ++i) {
				wordLengths2[i] = secondString.size();
			}
			double[][] similarities = new double[firstString.size()][secondString.size()];
			for (int i = 0; i < firstString.size(); ++i) {
				for (int j = 0; j < secondString.size(); ++j) {
					double distance = calculator.calcRelatednessOfWords(firstString.get(i), secondString.get(j));
					similarities[i][j] = distance;
				}
			}
			return camelCaseCalculator.calcSimilarity(wordLengths1, wordLengths2, similarities);
		} else {
			double distance = calculator.calcRelatednessOfWords(word1, word2);
	//		System.out.println("Distance (" + word1 + ", " + word2 + ") = " + distance);
			return distance;
		}
	}
	
	public double getNormalizedWordSimilarity(String word1, String word2) {
		double distance = getWordSimilarity(word1, word2);
//		System.out.println("Distance (" + word1 + ", " + word2 + ") = " + distance);
		return 1.0-Math.exp(-distance);
	}
	
	public double[][] getWordMatrix(String words1[], String words2[]) {
		return calculator.getSimilarityMatrix(words1, words2);
	}
	
	public double[][] getNormalizedWordMatrix(String words1[], String words2[]) {
		return calculator.getNormalizedSimilarityMatrix(words1, words2);
	}

	public RelatednessCalculator getRelatednessCalculator() {
		return calculator;
	}

	public String getRelatednessCalculatorName() {
		return calculator.getClass().getSimpleName();
	}
	
	public static void main(String[] args) {
		List<String> split = splitCamelCase("CategoryA",1,true);
		System.out.println(Arrays.toString(split.toArray()));
		split = splitCamelCase("Category2",1,true);
		System.out.println(Arrays.toString(split.toArray()));
		split = splitCamelCase("Category2A",1,true);
		System.out.println(Arrays.toString(split.toArray()));
		split = splitCamelCase("Category2A",1,false);
		System.out.println(Arrays.toString(split.toArray()));
		split = splitCamelCase("CategoryA",2,true);
		System.out.println(Arrays.toString(split.toArray()));
		split = splitCamelCase("Category2",2,true);
		System.out.println(Arrays.toString(split.toArray()));
		split = splitCamelCase("Category2A",2,true);
		System.out.println(Arrays.toString(split.toArray()));
		split = splitCamelCase("Category2A",2,false);
		System.out.println(Arrays.toString(split.toArray()));
	}

}