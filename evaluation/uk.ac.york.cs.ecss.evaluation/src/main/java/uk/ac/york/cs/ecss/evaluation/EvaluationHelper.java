package uk.ac.york.cs.ecss.evaluation;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Match;

public class EvaluationHelper {

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

}
