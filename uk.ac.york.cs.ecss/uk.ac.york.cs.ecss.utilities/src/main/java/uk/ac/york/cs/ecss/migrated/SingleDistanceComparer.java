package uk.ac.york.cs.ecss.migrated;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.output.NullOutputStream;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class SingleDistanceComparer {
	private static final Logger logger = LogManager.getLogger(SingleDistanceComparer.class);

	
	private DistanceComparer comparer;
	
	public SingleDistanceComparer(DistanceComparer comparer) {
		this.comparer = comparer;
	}
	
	public static SingleDistanceComparer getEmfComparer() {
		return new SingleDistanceComparer(new EMFDistanceComparer());
	}
	
	public static SingleDistanceComparer getKeywordComparer(KeywordConfig config) {		
		return new SingleDistanceComparer(new KeywordDistanceComparer(config));
	}
	
	public List<Resource> compareImput = new ArrayList<>();
	public Map<Resource,Double> compareOutput = new HashMap<Resource,Double>();
	private OutputStream reportStream = new NullOutputStream();
	
	public static void getAllFiles(File current, List<File> files) {
		if (current.isDirectory()) {
			for (File file: current.listFiles()) {
				getAllFiles(file, files);
			}
		} else {
			if (current.getName().endsWith(".xtext")) {
				files.add(current);
			}
		}
	}
	
	public static List<Resource> getAllDirectoryInput(ResourceSet rs, List<File> inputDirs, List<String> postfix) {
		List<Resource> ret = new ArrayList<>();
		{
			int i = 0;
			for (File file: inputDirs) {
				List<File> subFiles = new ArrayList<File>();
				getAllFiles(file,subFiles);
				for (File sfile: subFiles) {
					try {
						Resource subRes = rs.getResource(URI.createFileURI(sfile.getCanonicalPath()), true);
						ret.add(subRes);
					} catch (Exception e) {
						System.err.println(e.getMessage());
						e.printStackTrace();
					}
				}
				++i;
			}
		}
		return ret;
	}
	
	public void associateAllDirectoryContent(ResourceSet rs, List<File> inputDirs, List<String> postfix) {
		compareImput = getAllDirectoryInput(rs,inputDirs, postfix);
	}
	
	public void calculateDistances() {
		List<Resource> resources = compareImput;
		double[] toAdd = new double[resources.size()];
		for (int i = 1; i < toAdd.length; ++i) {
			toAdd[i] = Double.NaN;
		}
		try {
			Resource base = resources.get(0);
			List<Integer> haveIndex = new ArrayList<Integer>();
			List<Resource> otherRes = new ArrayList<Resource>();
			for (int i = 1; i < resources.size(); ++i) {
				if (resources.get(i) != null) {
					haveIndex.add(i);
					otherRes.add(resources.get(i));
				}
			}
			if (!otherRes.isEmpty()) {
				comparer.clear();
				comparer.setResources(base, otherRes);
				comparer.calcDifferences();
				for (int i = 0; i < otherRes.size(); ++i)  {
					double distance = comparer.getDifference(otherRes.get(i));
					toAdd[haveIndex.get(i)] = distance;
					if (!Double.isNaN(distance)) {
						compareOutput.put(otherRes.get(i), distance);
					}
				}
				String csvLine = getCsvLine(base, toAdd);
				logger.debug(csvLine);
				reportStream.write((csvLine+"\n").getBytes());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public String getCsvLine(Resource base, double[] array) {
		File file = new File(base.getURI().toFileString());
		String name = file.getName();
		String ret = Arrays.toString(array);
		ret = ret.substring(1,ret.length()-1);
		return name+","+ret;
	}
	
	public void printAscending(OutputStream os, boolean shortName) throws IOException {
		List<Resource> outputs = new ArrayList<Resource>(compareImput);
		Collections.sort(outputs, (x,y)->Double.compare(compareOutput.getOrDefault(x,Double.POSITIVE_INFINITY), compareOutput.getOrDefault(y, Double.POSITIVE_INFINITY)));
		for (Resource r: outputs) {
			String name = r.getURI().toString();
			if (shortName) {
				name = r.getURI().lastSegment();
			}
			os.write((name+","+compareOutput.getOrDefault(r,Double.POSITIVE_INFINITY)+"\n").getBytes());
		}
		os.flush();
	}

	public void setReportFile(File file) {
		try {
			this.reportStream = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
