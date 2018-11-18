package uk.ac.york.cs.ecss.migrated;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;

import org.eclipse.emf.ecore.resource.Resource;

public class EcoreKeywordConfig {
		
	public static class SparseInfo {
		public SparseInfo(int[] indices, double[] values) {
			this.values = values;
			this.indices = indices;
		}
		
		public double[] values;
		public int[] indices;
	}
	
	public double maxWeight = Double.POSITIVE_INFINITY;
	public boolean normalizeVectors = true;
	public boolean excludeComplexTerminal = true;
	public boolean excludeAlphanumericalKeyword = false;
	public boolean lowercaseTerminal = true;
	
	public boolean useKeywords = true;// = true;
	
	
	protected Map<String, SparseInfo> matrix;
	protected Map<String, Map<String, Double>[]> preMatrix;
	protected Set<String> nameSet;
	protected List<File> filesList;
	protected File[] files;
	protected List<String> names;
	protected List<Resource> resources;
	protected Resource ecssalModelResource;
	protected List<CompletableFuture<DistanceCalculator>> distanceCalculatorList;
	/**This distance is between 0 and one. 0 means equal, 1 means totally different. Should be symmetric.*/
	protected Map<Long, List<File>> filesWithLength;
	protected long startTime;
	

	public EcoreKeywordConfig basicClone() {
		EcoreKeywordConfig ret = new EcoreKeywordConfig();
		ret.setFrom(this);
		return ret;
	}
	

	public void setFrom(EcoreKeywordConfig config) {
		this.maxWeight = config.maxWeight;
		this.normalizeVectors = config.normalizeVectors;
		this.excludeComplexTerminal = config.excludeComplexTerminal;
		this.excludeAlphanumericalKeyword = config.excludeAlphanumericalKeyword;
		this.lowercaseTerminal = config.lowercaseTerminal;
		this.useKeywords = config.useKeywords;
	}

	public EcoreKeywordConfig(Map<String, SparseInfo> matrix, Map<String, Map<String, Double>[]> preMatrix,
		Set<String> nameSet, List<File> filesList,
			List<Resource> resources, List<CompletableFuture<DistanceCalculator>> distanceCalculatorList,
			Map<Long, List<File>> filesWithLength, long startTime) {
		this.matrix = matrix;
		this.preMatrix = preMatrix;
		this.nameSet = nameSet;
		this.filesList = filesList;
		this.resources = resources;
		this.distanceCalculatorList = distanceCalculatorList;
		this.filesWithLength = filesWithLength;
		this.startTime = startTime;
	}

	public EcoreKeywordConfig() {
		this(new HashMap<String, EcoreKeywordConfig.SparseInfo>(), new HashMap<>(), 
				new TreeSet<String>(), new ArrayList(), new ArrayList<Resource>(), new ArrayList<CompletableFuture<DistanceCalculator>>(), new HashMap<Long, List<File>>(), System.currentTimeMillis());
	}

	public Map<String, SparseInfo> getMatrix() {
		return matrix;
	}

	public void setMatrix(Map<String, SparseInfo> matrix) {
		this.matrix = matrix;
	}

	public Map<String, Map<String, Double>[]> getPreMatrix() {
		return preMatrix;
	}

	public void setPreMatrix(Map<String, Map<String, Double>[]> preMatrix) {
		this.preMatrix = preMatrix;
	}

	public Set<String> getNameSet() {
		return nameSet;
	}

	public void setNameSet(Set<String> nameSet) {
		this.nameSet = nameSet;
	}

	public List<File> getFilesList() {
		return filesList;
	}

	public void setFilesList(List<File> filesList) {
		this.filesList = filesList;
	}

	public File[] getFiles() {
		return files;
	}

	public void setFiles(File[] files) {
		this.files = files;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public Resource getEcssalModelResource() {
		return ecssalModelResource;
	}

	public void setEcssalModelResource(Resource ecssalModelResource) {
		this.ecssalModelResource = ecssalModelResource;
	}

	public List<CompletableFuture<DistanceCalculator>> getDistanceCalculatorList() {
		return distanceCalculatorList;
	}

	public void setDistanceCalculatorList(List<CompletableFuture<DistanceCalculator>> distanceCalculatorList) {
		this.distanceCalculatorList = distanceCalculatorList;
	}

	public boolean isNormalizeVectors() {
		return normalizeVectors;
	}

	public void setNormalizeVectors(boolean normalizeVectors) {
		this.normalizeVectors = normalizeVectors;
	}

	public Map<Long, List<File>> getFilesWithLength() {
		return filesWithLength;
	}

	public void setFilesWithLength(Map<Long, List<File>> filesWithLength) {
		this.filesWithLength = filesWithLength;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}


}