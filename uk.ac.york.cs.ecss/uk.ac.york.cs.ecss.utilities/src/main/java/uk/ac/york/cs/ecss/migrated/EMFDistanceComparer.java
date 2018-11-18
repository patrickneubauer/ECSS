package uk.ac.york.cs.ecss.migrated;

import java.util.List;
import java.util.Map;

import org.apache.commons.io.output.NullOutputStream;
import org.eclipse.emf.ecore.resource.Resource;

public class EMFDistanceComparer extends AbstractDistanceComparerer {

	@Override
	public void calcDifferences(Resource base, List<Resource> otherResources, Map<Resource, Double> map) {
		
		for (Resource other: otherResources) {
			try{
				DistanceCalculator emfCalculator = new DistanceCalculator(new NullOutputStream());
				emfCalculator.calculateDistance(base, other, 0, 0);
				map.put(other, emfCalculator.getDistance());
			} catch (Exception e) {
				System.err.println("Error: "+e.getMessage());
				e.printStackTrace();
			}
		}		
	}

}
