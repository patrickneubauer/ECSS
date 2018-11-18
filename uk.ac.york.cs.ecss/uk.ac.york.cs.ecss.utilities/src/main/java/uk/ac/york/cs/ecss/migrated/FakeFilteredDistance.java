package uk.ac.york.cs.ecss.migrated;

import java.util.Enumeration;
import java.util.Vector;

import weka.core.DistanceFunction;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.neighboursearch.PerformanceStats;

public class FakeFilteredDistance implements DistanceFunction {
 
	private Instances instances;
	private boolean invertSelection;
	
	@Override
	public String[] getOptions() {
		return new String[]{};
	}

	@Override
	public Enumeration listOptions() {
		return new Vector().elements();
	}

	@Override
	public void setOptions(String[] arg0) throws Exception {
		
	}

	@Override
	public double distance(Instance arg0, Instance arg1) {
		//The first attribute is the name, then comes the index of the object, the others are the distances to this object
		int index = 2+(int)(arg1.value(1));
		double ret = arg0.value(index);
		return ret;
	}

	@Override
	public double distance(Instance arg0, Instance arg1, PerformanceStats arg2) throws Exception {
		return distance(arg0,arg1);
	}

	@Override
	public double distance(Instance arg0, Instance arg1, double cutoff) {
		return distance(arg0,arg1);
	}

	@Override
	public double distance(Instance arg0, Instance arg1, double cutoff, PerformanceStats arg3) {
		return distance(arg0,arg1);
	}

	@Override
	public String getAttributeIndices() {
		return "first-last";
	}

	@Override
	public Instances getInstances() {
		return instances;
	}

	@Override
	public boolean getInvertSelection() {
		return invertSelection;
	}

	@Override
	public void postProcessDistances(double[] arg0) {
		
	}

	@Override
	public void setAttributeIndices(String arg0) {		
	}

	@Override
	public void setInstances(Instances arg0) {
		this.instances = instances;
	}

	@Override
	public void setInvertSelection(boolean arg0) {
		this.invertSelection = arg0;
	}

	@Override
	public void update(Instance arg0) {
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		
	}

}
