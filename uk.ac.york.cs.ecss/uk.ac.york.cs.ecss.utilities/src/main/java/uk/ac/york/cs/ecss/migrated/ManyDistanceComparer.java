package uk.ac.york.cs.ecss.migrated;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.output.NullOutputStream;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class ManyDistanceComparer {
	private static final Logger logger = LogManager.getLogger(ManyDistanceComparer.class);

	
	private DistanceComparer comparer;
	
	public ManyDistanceComparer(DistanceComparer comparer) {
		this.comparer = comparer;
	}
	
	public static ManyDistanceComparer getEmfComparer() {
		return new ManyDistanceComparer(new EMFDistanceComparer());
	}
	
	public static ManyDistanceComparer getKeywordComparer(KeywordConfig config) {		
		return new ManyDistanceComparer(new KeywordDistanceComparer(config));
	}
	
	public List<List<Resource>> compareImput = new ArrayList<>();
	public List<double[]> compareOutput = new ArrayList<double[]>();
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
	
	public static List<List<Resource>> getAllDirectoryInput(ResourceSet rs, List<File> inputDirs, List<String> postfix) {
		List<Map<String,Resource>> allResources = new ArrayList<Map<String,Resource>>();
		{
			int i = 0;
			for (File file: inputDirs) {
				List<File> subFiles = new ArrayList<File>();
				getAllFiles(file,subFiles);
				Map<String,Resource> curMap = new HashMap<String, Resource>();
				allResources.add(curMap);
				for (File sfile: subFiles) {
					try {
						Resource subRes = rs.getResource(URI.createFileURI(sfile.getCanonicalPath()), true);
						curMap.put(sfile.getName(), subRes);
					} catch (Exception e) {
						System.err.println(e.getMessage());
						e.printStackTrace();
					}
				}
				++i;
			}
		}
		for (int i = 0; i < postfix.size(); ++i) {
			String pf = postfix.get(i);
			if (pf != null && !"".equals(pf)) {
				Map<String,Resource> additionalEntry = new HashMap<String, Resource>();
				Map<String,Resource> removeEntry = new HashMap<String, Resource>();
				for (Entry<String,Resource> entr: allResources.get(i).entrySet()) {
					int ind = entr.getKey().lastIndexOf('.');
					if (ind != -1) {
						String preEnd = entr.getKey().substring(0,ind);
						if (preEnd.endsWith(pf)) {
							preEnd = preEnd.substring(0,preEnd.length()-pf.length());
							additionalEntry.put(preEnd+ entr.getKey().substring(ind),entr.getValue());
						} else {
							removeEntry.put(entr.getKey(), entr.getValue());
						}
					} else {
						removeEntry.put(entr.getKey(), entr.getValue());
					}
				}
				allResources.get(i).keySet().removeAll(removeEntry.keySet());
				allResources.get(i).putAll(additionalEntry);
			}
		}
		List<List<Resource>> ret = new ArrayList<List<Resource>>();
		Set<String> allNames = new TreeSet<String>();
		for (Map<String,Resource> map: allResources) {
			allNames.addAll(map.keySet());
		}
		for (String str: allNames) {
			List<Resource> res = new ArrayList<Resource>();
			for (Map<String,Resource> map: allResources) {
				res.add(map.get(str));
			}
			if (res.get(0) != null) { //Base is not null, otherwise comparison is pointless!
				ret.add(res);
			}
		}
		return ret;
	}
	
	public void associateAllDirectoryContent(ResourceSet rs, List<File> inputDirs, List<String> postfix) {
		compareImput = getAllDirectoryInput(rs,inputDirs, postfix);
	}
	
	public void calculateDistances() {
		for (List<Resource> resources: compareImput) {
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
					}
					String csvLine = getCsvLine(base, toAdd);
					logger.debug(csvLine);
					reportStream.write((csvLine+"\n").getBytes());
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			} finally {
				compareOutput.add(toAdd);
			}
		}
	}
	
	public String getCsvLine(Resource base, double[] array) {
		File file = new File(base.getURI().toFileString());
		String name = file.getName();
		String ret = Arrays.toString(array);
		ret = ret.substring(1,ret.length()-1);
		return name+","+ret;
	}
	
	public void printCsv(OutputStream os) throws IOException {
		for (int i = 0; i < compareImput.size(); ++i) {
			double[] values = compareOutput.get(i);
			os.write((getCsvLine(compareImput.get(i).get(0),values)+"\n").getBytes());
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
