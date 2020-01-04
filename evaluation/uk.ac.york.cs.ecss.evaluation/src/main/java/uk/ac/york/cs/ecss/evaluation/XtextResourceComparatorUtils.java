package uk.ac.york.cs.ecss.evaluation;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Match;

public class XtextResourceComparatorUtils {

	/**
	 * Get match count depicted by Comparison result produced by EMFCompare 
	 * 
	 * @param comparison comparison result produced by EMFCompare
	 * @return match count depicted by Comparison result produced by EMFCompare
	 */
	static int getMatchCount(Comparison comparison) {
		int matchQuantity = 0;
		EList<Match> matches = comparison.getMatches();
		for (Match match : matches) {
			matchQuantity++;
			Iterator<Match> subMatchIterator = match.getAllSubmatches().iterator();
			while (subMatchIterator.hasNext()) {
				matchQuantity++;
				subMatchIterator.next();
			}
		}
		return matchQuantity;
	}// getMatchCount
	
	/**
	 * Get the match-fraction between two Comparison results produced by EMFCompare (order not relevant)
	 * 
	 * @param comparison1 comparison result produced by EMFCompare
	 * @param comparison2 comparison result produced by EMFCompare
	 * @return match-fraction between two Comparison results produced by EMFCompare (i.e. double value between 0.0 and 1.0)
	 */
	static double getMatchFactor(Comparison comparison1, Comparison comparison2) {
		if ( (double)XtextResourceComparatorUtils.getMatchCount(comparison2) / XtextResourceComparatorUtils.getMatchCount(comparison1) > 1.0 ) {
			return (double)XtextResourceComparatorUtils.getMatchCount(comparison1) / XtextResourceComparatorUtils.getMatchCount(comparison2);
		}
		return (double)XtextResourceComparatorUtils.getMatchCount(comparison2) / XtextResourceComparatorUtils.getMatchCount(comparison1);	
	}// getMatchFactor

}
