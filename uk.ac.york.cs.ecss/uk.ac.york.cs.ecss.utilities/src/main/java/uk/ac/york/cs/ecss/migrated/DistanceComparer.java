package uk.ac.york.cs.ecss.migrated;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

public interface DistanceComparer {
	
	public Resource getBaseResource();

	public List<Resource> getCompareResources();
	
	public void setResources(Resource base, List<Resource> compare);

	public void calcDifferences();
	
	public double getDifference(Resource res);	
	
	public void clear();

}
