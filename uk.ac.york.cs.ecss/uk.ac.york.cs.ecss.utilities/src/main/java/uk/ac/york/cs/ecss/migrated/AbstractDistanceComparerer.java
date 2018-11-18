package uk.ac.york.cs.ecss.migrated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

public abstract class AbstractDistanceComparerer implements DistanceComparer {
	protected Resource baseResource;
	protected List<Resource> otherResources;
	protected Map<Resource,Double> differenceMap;

	@Override
	public Resource getBaseResource() {
		return baseResource;
	}

	@Override
	public List<Resource> getCompareResources() {
		return otherResources;
	}

	@Override
	public void setResources(Resource base, List<Resource> compare) {
		this.baseResource = base;
		this.otherResources = compare;
		differenceMap = new HashMap<Resource, Double>();
	}
	
	@Override
	public void calcDifferences() {
		differenceMap = new HashMap<Resource, Double>();
		calcDifferences(baseResource,otherResources,differenceMap);
	}

	public abstract void calcDifferences(Resource base, List<Resource> otherResources, Map<Resource,Double> map);

	@Override
	public double getDifference(Resource res) {
		if (differenceMap == null) {
			calcDifferences();
		}
		return differenceMap.getOrDefault(res,Double.NaN);
	}
	
	public void clear() {
		this.baseResource = null;
		this.otherResources = new ArrayList<Resource>();
		this.differenceMap = new HashMap<Resource, Double>();
	}

}
