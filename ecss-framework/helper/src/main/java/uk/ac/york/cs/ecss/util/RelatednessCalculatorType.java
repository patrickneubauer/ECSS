package uk.ac.york.cs.ecss.util;

/**
 * 
 * HirstStOnge (Hirst & St-Onge, 1998)
 * Two lexicalized concepts are semantically close if their WordNet synsets are connected by a path that is not too long and that "does not change direction too often".
 * 
 * LeacockChodorow (Leacock & Chodorow, 1998) This measure relies on the length of the shortest path between two synsets for their measure of similarity. They limit their attention to IS-A links and scale the path length by the overall depth D of the taxonomy.
 *  
 * Lesk (Banerjee & Pedersen, 2002)
 * Lesk (1985) proposed that the relatedness of two words is proportional to to the extent of overlaps of their dictionary definitions. Banerjee and Pedersen (2002) extended this notion to use WordNet as the dictionary for the word definitions.
 *  
 * WuPalmer (Wu & Palmer, 1994)
 * The Wu & Palmer measure calculates relatedness by considering the depths of the two synsets in the WordNet taxonomies, along with the depth of the LCS|.
 * 
 * Resnik (Resnik, 1995) 
 * Resnik defined the similarity between two synsets to be the information content of their lowest super-ordinate (most specific common subsumer).
 * 
 * JiangConrath (Jiang & Conrath, 1997)
 * Also uses the notion of information content, but in the form of the conditional probability of encountering an instance of a child-synset given an instance of a parent synset: 1 / jcn_distance, where jcn_distance is equal to IC(synset1) + IC(synset2) - 2 * IC(lcs).
 * 
 * Lin (Lin, 1998)
 * Math equation is modified a little bit from Jiang and Conrath: 2 * IC(lcs) / (IC(synset1) + IC(synset2)). Where IC(x) is the information content of x. One can observe, then, that the relatedness value will be greater-than or equal-to zero and less-than or equal-to one.
 * 
 * Path (?)
 * NOT DOCUMENTED.
 * 
 * @author blizzfire
 *
 */
public enum RelatednessCalculatorType {

	HirstStOnge, LeacockChodorow, Lesk, WuPalmer, Resnik, JiangConrath, Lin, Path
	
}
