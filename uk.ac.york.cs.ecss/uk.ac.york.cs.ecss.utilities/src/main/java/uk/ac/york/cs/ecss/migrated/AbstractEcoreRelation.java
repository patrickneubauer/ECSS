package uk.ac.york.cs.ecss.migrated;

import java.util.List;

public abstract class AbstractEcoreRelation {

	protected static final int NUMBER_OF_DISTANCES_COMPUTED_STATUS_UPDATE = 50;

	protected static final int NUMBER_OF_DISTANCES_SUBMITTED_STATUS_UPDATE = 1000; // avoid too much status output
	protected static final int NUMBER_OF_RESOURCES_LOADED_STATUS_UPDATE = 50;
	
	protected String reportFile;
	
	public AbstractEcoreRelation(String reportFile) {
		this.reportFile = reportFile;
	}
	
	public abstract void process();
	
	public abstract List<String> getNames();

	public abstract double getMatrixDistance(String from, String to);
}
