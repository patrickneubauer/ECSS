package uk.ac.york.cs.ecss.migrated;

import org.eclipse.emf.ecore.resource.Resource;

import java.util.Map;
import java.util.Map.Entry;

public interface BasicDistanceManager {
	
	
	public default double getDistance(Resource lhs, Resource any) {
		return getDistanceTable(any).getOrDefault(lhs,Double.POSITIVE_INFINITY);
	}
	
	
	public default Resource getBestMatch(Resource any, double[] bestDistanceAr) {
		Map<Resource,Double> map = getDistanceTable(any);
		double bestDistance = Double.POSITIVE_INFINITY;
		Resource ret = null;
		for (Entry<Resource,Double> entry: map.entrySet()) {
			System.out.println("Distance between "+entry.getKey().getURI()+" "+any.getURI()+" "+entry.getValue());
			if (entry.getValue() < bestDistance) {
				ret = entry.getKey();
				bestDistance = entry.getValue();
			}
		}
		if (bestDistanceAr != null) {
			bestDistanceAr[0] = bestDistance;
		}
		return ret;
	}
	
	public Map<Resource,Double> getDistanceTable(Resource any);

}
