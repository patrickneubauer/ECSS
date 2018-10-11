package uk.ac.york.cs.ecss.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class WordNetUtilTest {

	@Test
	public void testDefault() {
		WordNetUtil wnUtil = new WordNetUtil();
		
		long t0 = System.currentTimeMillis();
		double dist = wnUtil.getWordSimilarity( "food","meal" );
		long t1 = System.currentTimeMillis();
		System.out.println( wnUtil.getRelatednessCalculatorName() + " relatedness (" + dist + ") computed in in "+(t1-t0)+" msec." );
		
		assertNotNull(dist);
	}
	
	@Test
	public void testHirstStOnge() {
		WordNetUtil wnUtil = new WordNetUtil(RelatednessCalculatorType.HirstStOnge);
		
		long t0 = System.currentTimeMillis();
		double dist = wnUtil.getWordSimilarity( "food","meal" );
		long t1 = System.currentTimeMillis();
		System.out.println( wnUtil.getRelatednessCalculatorName() + " relatedness (" + dist + ") computed in in "+(t1-t0)+" msec." );
		
		assertEquals(6.0, dist, 0.001);
	}
	
	@Test
	public void testLeacockChodorow() {
		WordNetUtil wnUtil = new WordNetUtil(RelatednessCalculatorType.LeacockChodorow);
		
		long t0 = System.currentTimeMillis();
		double dist = wnUtil.getWordSimilarity( "food","meal" );
		long t1 = System.currentTimeMillis();
		System.out.println( wnUtil.getRelatednessCalculatorName() + " relatedness (" + dist + ") computed in in "+(t1-t0)+" msec." );
		
		assertEquals(2.5902671654458267, dist, 0.001);
	}
	
	@Test
	public void testLesk() {
		WordNetUtil wnUtil = new WordNetUtil(RelatednessCalculatorType.Lesk);
		
		long t0 = System.currentTimeMillis();
		double dist = wnUtil.getWordSimilarity( "food","meal" );
		long t1 = System.currentTimeMillis();
		System.out.println( wnUtil.getRelatednessCalculatorName() + " relatedness (" + dist + ") computed in in "+(t1-t0)+" msec." );
		
		assertEquals(2.0, dist, 0.001);
	}
	
	@Test
	public void testWuPalmer() {
		WordNetUtil wnUtil = new WordNetUtil(RelatednessCalculatorType.WuPalmer);
		
		long t0 = System.currentTimeMillis();
		double dist = wnUtil.getWordSimilarity( "food","meal" );
		long t1 = System.currentTimeMillis();
		System.out.println( wnUtil.getRelatednessCalculatorName() + " relatedness (" + dist + ") computed in in "+(t1-t0)+" msec." );
		
		assertEquals(0.8571428571428571, dist, 0.001);
	}
	
	@Test
	public void testResnik() {
		WordNetUtil wnUtil = new WordNetUtil(RelatednessCalculatorType.Resnik);
		
		long t0 = System.currentTimeMillis();
		double dist = wnUtil.getWordSimilarity( "food","meal" );
		long t1 = System.currentTimeMillis();
		System.out.println( wnUtil.getRelatednessCalculatorName() + " relatedness (" + dist + ") computed in in "+(t1-t0)+" msec." );
		
		assertEquals(5.463140872899669, dist, 0.001);
	}
	
	@Test
	public void testJiangConrath() {
		WordNetUtil wnUtil = new WordNetUtil(RelatednessCalculatorType.JiangConrath);
		
		long t0 = System.currentTimeMillis();
		double dist = wnUtil.getWordSimilarity( "food","meal" );
		long t1 = System.currentTimeMillis();
		System.out.println( wnUtil.getRelatednessCalculatorName() + " relatedness (" + dist + ") computed in in "+(t1-t0)+" msec." );
		
		assertEquals(0.5512732022265942, dist, 0.001);
	}
	
	@Test
	public void testLin() {
		WordNetUtil wnUtil = new WordNetUtil(RelatednessCalculatorType.Lin);
		
		long t0 = System.currentTimeMillis();
		double dist = wnUtil.getWordSimilarity( "food","meal" );
		long t1 = System.currentTimeMillis();
		System.out.println( wnUtil.getRelatednessCalculatorName() + " relatedness (" + dist + ") computed in in "+(t1-t0)+" msec." );
		
		assertEquals(0.8576181344498747, dist, 0.001);
	}
	
	@Test
	public void testPath() {
		WordNetUtil wnUtil = new WordNetUtil(RelatednessCalculatorType.Path);
		
		long t0 = System.currentTimeMillis();
		double dist = wnUtil.getWordSimilarity( "food","meal" );
		long t1 = System.currentTimeMillis();
		System.out.println( wnUtil.getRelatednessCalculatorName() + " relatedness (" + dist + ") computed in in "+(t1-t0)+" msec." );
		
		assertEquals(0.3333333333333333, dist, 0.001);
	}
	
	@Test
	public void tryAllTest() {
		
		HashMap<String,String> wordCombinations = new HashMap<String, String>();
		wordCombinations.put("food", "meal");
		wordCombinations.put("food", "computer");
		wordCombinations.put("router", "computer");
		wordCombinations.put("wheel", "car");
		wordCombinations.put("car", "bus");
		wordCombinations.put("car", "car");
		wordCombinations.put("network", "internet");
		
		for (RelatednessCalculatorType rct : RelatednessCalculatorType.values()) {
			runSimilarityCalc(rct, wordCombinations, false);
			System.out.println("");
		}
		
	}
	
	@Test
	public void tryAllNormalizedTest() {
		
		HashMap<String,String> wordCombinations = new HashMap<String, String>();
		wordCombinations.put("food", "meal");
		wordCombinations.put("food", "computer");
		wordCombinations.put("router", "computer");
		wordCombinations.put("wheel", "car");
		wordCombinations.put("car", "bus");
		wordCombinations.put("car", "car");
		wordCombinations.put("network", "internet");
		
		
		for (RelatednessCalculatorType rct : RelatednessCalculatorType.values()) {
			runSimilarityCalc(rct, wordCombinations, true);
			System.out.println("");
		}
		
	}
	
	public void runSimilarityCalc(RelatednessCalculatorType relatednessCalculatorType, HashMap<String,String> wordCombinations, boolean normalized) {
		WordNetUtil wnUtil = new WordNetUtil(relatednessCalculatorType);
		
		for (Entry<String,String> wordCombination : wordCombinations.entrySet()) {
			long t0 = System.currentTimeMillis();
			String word1 = wordCombination.getKey();
			String word2 = wordCombination.getValue();
			double dist;
			if (normalized) {
				dist = wnUtil.getNormalizedWordSimilarity( word1, word2 );
			} else {
				dist = wnUtil.getWordSimilarity( word1, word2 );
			}
			long t1 = System.currentTimeMillis();
			System.out.println( wnUtil.getRelatednessCalculatorName() + " relatedness (" + word1 + ", " + word2 + ") = " + dist + " computed in in "+(t1-t0)+" msec." );
		}
	}
	
}
