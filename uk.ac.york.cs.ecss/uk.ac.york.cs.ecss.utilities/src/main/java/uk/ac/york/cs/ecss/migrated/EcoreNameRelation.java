package uk.ac.york.cs.ecss.migrated;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import uk.ac.york.cs.ecss.migrated.EcoreKeywordConfig.SparseInfo;
import weka.core.Attribute;
import weka.core.EuclideanDistance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;


public class EcoreNameRelation extends AbstractEcoreRelation {
	
	private static final Logger logger = LogManager.getLogger(EcoreNameRelation.class);

	public static void getKeywordMap(EPackage g, Map<String,Double> map, EcoreKeywordConfig config) {
		for (EObject eobj: (Iterable<EObject>)(()->g.eAllContents())) {
			if (eobj instanceof EClassifier) {
				EClassifier kw = (EClassifier)eobj;
				String val = getValue(kw,config);
				map.put(val, map.getOrDefault(val, 0.0)+1);
			} else if (eobj instanceof EStructuralFeature) {
				EStructuralFeature kw = (EStructuralFeature)eobj;
				String val = getValue(kw,config);
				map.put(val, map.getOrDefault(val, 0.0)+1);
			}
		}
	}
	
	public int getAttributeNums() {
		//Initialize nameSet if necessary
		getMatrix();
		return EcoreKeywordConfig.getNameSet().size();
	}
	
	public Set<String> getAttributeNames() {
		//Initialize nameSet if necessary
		getMatrix();
		return EcoreKeywordConfig.getNameSet();
	}
	
	public static String getValue(EClassifier kw, EcoreKeywordConfig cfg) {
		String ret = kw.getName();
		if (ret != null) {
			if (cfg.lowercaseTerminal) {
				ret = ret.toLowerCase();
			}
		}
		return ret;
	}

	public static String getValue(EStructuralFeature kw, EcoreKeywordConfig cfg) {
		String ret = kw.getName();
		if (ret != null) {
			if (cfg.lowercaseTerminal) {
				ret = ret.toLowerCase();
			}
		}
		return ret;
	}
	
	
	public Map<String,Double>[] getFeatureMaps(Resource res, EcoreKeywordConfig config) {
		Map<String,Double> keywordMap = new HashMap<>();
	
		//TODO: Only use used rules
		Set<EPackage> allEPackages = new HashSet<EPackage>();
		Stack<EPackage> processEPackage = new Stack<>();
		for (EObject eobj: res.getContents()) {
			if (eobj instanceof EPackage) {
				EPackage g = (EPackage)eobj;
				if (allEPackages.add(g)) {
					processEPackage.add(g);
				}
			}
		}
		while (!processEPackage.isEmpty()) {
			EPackage cur = processEPackage.pop();
		}
		for (EPackage g: allEPackages) {
			if (config.useKeywords) {
				getKeywordMap(g, keywordMap, config);
			}
		}
		return new Map[]{keywordMap};
	}
	
	public EcoreNameRelation(String reportFile, List<Resource> resources, ResourceSet resourceSet, EcoreKeywordConfig config) {
		super(reportFile);
		this.EcoreKeywordConfig.setFrom(config);
		for (Resource r: resources) {
			EcoreKeywordConfig.getResources().add(r);
		}
		initNameListWithResources();
	}
	
	public EcoreNameRelation(String reportFile, ResourceSet resourceSet,File[] files, Resource ecssalModelResource, 
			EcoreKeywordConfig config) {
		super(reportFile);
		//String reportFile, String matrixFile, ResourceSet resourceSet, ArrayList<ClassInstance> classInstances, File[] files, Resource ecssalModelResource, Root ecssalRoot
		//this(reportFile, resourceSet, classInstances, files, ecssalModelResource, ecssalRoot);
		
		this.EcoreKeywordConfig = config; // otherwise only "normalizeVectors" is used (see below)
		
		//this.files = files;
		this.EcoreKeywordConfig.setNormalizeVectors(config.normalizeVectors);
		this.EcoreKeywordConfig.setFrom(config);
		logger.info("Calculating relation distances ...");

		this.EcoreKeywordConfig.setFiles(files);
		//this.resourceSet = resourceSet;
		this.EcoreKeywordConfig.setEcssalModelResource(ecssalModelResource);
		//Directly get file because needed
		for (int i = 0; i < files.length; ++i) {
			File file = files[i];
			List<File> curList = EcoreKeywordConfig.getFilesWithLength().get(file.length());
			//Skip file if already equal exists
			boolean skip = false;
			if (curList != null) {
				for (File current: curList) {
					try {
						if (FileUtils.contentEquals(current, file)) {
							skip = true;
							break;
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} else {
				curList = new ArrayList<File>();
				EcoreKeywordConfig.getFilesWithLength().put(file.length(), curList);
			}
			if (skip) {
				continue;
			}
			curList.add(file);
			
			try {
				//Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath().toString()), true);
				//Initialize loading - maybe helps - at least it might weed out some resources??
				/*Injector inj = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
				
				XtextResourceSet xtextResourceSet = inj.getInstance(XtextResourceSet.class);
				Resource xtextMetamodelResource = xtextResourceSet.getResource(URI.createFileURI(SimpleXtextClusterGenerator.XTEXT_METAMODEL_FILE_LOCATION), true);
				
			    try {
			    		xtextMetamodelResource.load(null);
			    } catch (IOException e) {
				}
//				Resource xtextMetamodelResource = xtextResourceSet.getResource(URI.createFileURI("resources/Xtext.ecore"), true);*/
				
				Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath().toString()), true);
			    try {
			    	resource.load(null);
			    	
			    } catch (IOException e) {
					e.printStackTrace();
				}	
			    resource.getContents();
				EcoreKeywordConfig.getResources().add(resource);
//				System.out.println(EcoreKeywordConfig.getFilesList().size()+":"+file.getAbsolutePath());
				EcoreKeywordConfig.getFilesList().add(file);
				if (EcoreKeywordConfig.getFilesList().size()%NUMBER_OF_RESOURCES_LOADED_STATUS_UPDATE == 0) {
					logger.info("Loaded " + EcoreKeywordConfig.getFilesList().size()+"/"+(files.length-(i-EcoreKeywordConfig.getFilesList().size()-1))+" files ...");
				}
			} catch (Exception e) {
				logger.warn("Could not load resource "+file);
			}
		}
		//I guess you need to do it?
		initNameList();
		
	}
	
	private Map<String,String> filenameToNormalizedName = new HashMap<>();

	
	private void initNameList() {
		filenameToNormalizedName = new HashMap<>();
		EcoreKeywordConfig.setNames(new ArrayList<String>());
		int i = 0;
		for (File file: EcoreKeywordConfig.getFilesList()) {
			String fn = file.getName().replaceFirst("[.][^.]+$", "");
			while (EcoreKeywordConfig.getNames().contains(fn)) {
				fn = fn+"_";
			}
			filenameToNormalizedName.put(file.getName(), fn);
			EcoreKeywordConfig.getNames().add(fn);
			Resource r = EcoreKeywordConfig.getResources().get(i);
			
			Map<String,Double>[] curMaps = getFeatureMaps(r,EcoreKeywordConfig);
			EcoreKeywordConfig.getPreMatrix().put(fn, curMaps);
			++i;
		}
	}
	
	private void initNameListWithResources() {
		filenameToNormalizedName = new HashMap<>();
		EcoreKeywordConfig.setNames(new ArrayList<String>());
		int i = 0;
		for (Resource r: EcoreKeywordConfig.getResources()) {
			URI uri = r.getURI();
			File file = new File(uri.toFileString());
			String fn = file.getName().replaceFirst("[.][^.]+$", "");
			if (i > 0) {
				fn = fn+i;
			}
			while (EcoreKeywordConfig.getNames().contains(fn)) {
				fn = fn+"_";
			}
			if (i > 0) {
				filenameToNormalizedName.put(file.getName()+i, fn);
			} else {
				filenameToNormalizedName.put(file.getName(), fn);
			}
			EcoreKeywordConfig.getNames().add(fn);
			
			Map<String,Double>[] curMaps = getFeatureMaps(r,EcoreKeywordConfig);
			EcoreKeywordConfig.getPreMatrix().put(fn, curMaps);
			//++i; //TODO:??
		}
	}
	
	@Override
	public void process() {
		
	}
	
	public void clear() {
	}
	
	public static int[] mergeArrays(int[]... matrix) {
		int retSize = 0;
		for (int[] m: matrix) {
			retSize+= m.length;
		}
		int[] ret = new int[retSize];
		int curOffset = 0;
		for (int[] vec: matrix) {
			for (int i = 0; i < vec.length; ++i) {
				ret[curOffset+i] = vec[i];
			}
			curOffset+= vec.length;
		}
		return ret;
	}
	
	public static double[] mergeArrays(double[]... matrix) {
		int retSize = 0;
		for (double[] m: matrix) {
			retSize+= m.length;
		}
		double[] ret = new double[retSize];
		int curOffset = 0;
		for (double[] vec: matrix) {
			for (int i = 0; i < vec.length; ++i) {
				ret[curOffset+i] = vec[i];
			}
			curOffset+= vec.length;
		}
		return ret;
	}
	
	private SparseInfo getSparseInfo(String name, SparseInfo sparseInfo, Map<String,Double>[] vals, int mapIndex, int indexOffset, Map<String,Integer> index) {
		
		Map<String,Double> val = vals[mapIndex];
		List<Object[]> intVals = new ArrayList<>();
		;
		for (Entry<String,Double> sentr: val.entrySet()) {
			Integer indexE = index.get(sentr.getKey());
			if (indexE == null) {continue;}
			intVals.add(new Object[]{indexE,sentr.getValue()});
		}
		Collections.sort(intVals, (x,y)->Integer.compare((Integer)x[0], (Integer)y[0]));
		int[] indices = new int[intVals.size()];
		double[] values = new double[intVals.size()];
		for (int i = 0; i < intVals.size(); ++i) {
			indices[i] = (Integer)intVals.get(i)[0]+indexOffset;
			values[i] = (Double)intVals.get(i)[1];
		}
		if (EcoreKeywordConfig.isNormalizeVectors()) {
			double length = 0.0;
			for (int i = 0; i < values.length; ++i) {
				length+= values[i]*values[i];
			}
			length = Math.sqrt(length);
			if (length > 0) {
				for (int i = 0; i < values.length; ++i) {
					values[i]/=length;
				}
			}
		}
		if (sparseInfo == null) {
			sparseInfo = EcoreKeywordConfig.getMatrix().get(name);
		}
		if (sparseInfo == null) {
			sparseInfo = new EcoreKeywordConfig.SparseInfo(indices, values);
			if (name != null) {
				EcoreKeywordConfig.getMatrix().put(name, sparseInfo);
			}
		} else {
			sparseInfo.indices = mergeArrays(sparseInfo.indices, indices);
			sparseInfo.values = mergeArrays(sparseInfo.values, values);
		}
		return sparseInfo;
	}
	
	public Map<String,Integer> generateIndexMap(int mapIndex, int[] endIndexAr) {
		Set<String> allStrings = new HashSet<String>();
		for (Map<String,Double>[] map: EcoreKeywordConfig.getPreMatrix().values())  {
			endIndexAr[0] = Math.max(endIndexAr[0], map.length);
			allStrings.addAll(map[mapIndex].keySet());
		}
		Set<String> subNameSet = new TreeSet<String>(allStrings);
		Map<String,Integer> index = new HashMap<String, Integer>();
		{
			int i = 0;
			for (String str: subNameSet) {
				index.put(str, i);
				EcoreKeywordConfig.getNameSet().add(mapIndex+""+str);
				attributes.add(new Attribute(mapIndex+" "+str));
				++i;
			}
		}
		return index;
	}
 
	public Map<String,EcoreKeywordConfig.SparseInfo> getMatrix() {
		if (EcoreKeywordConfig.getMatrix() == null || EcoreKeywordConfig.getMatrix().size() != EcoreKeywordConfig.getPreMatrix().size()) {
			//Recalc
			attributes = new ArrayList<Attribute>();
			EcoreKeywordConfig.setMatrix(new HashMap<>(EcoreKeywordConfig.getPreMatrix().size()*4));
			
			EcoreKeywordConfig.setNameSet(new TreeSet<String>());
			int indexOffset = 0;
			int[] endIndexAr = new int[] {1};
			for (int mapIndex = 0; mapIndex < endIndexAr[0]; ++mapIndex) {
				Map<String,Integer> index = generateIndexMap(mapIndex,endIndexAr);
				for (Entry<String,Map<String,Double>[]> entr: EcoreKeywordConfig.getPreMatrix().entrySet()) {
					String name = entr.getKey();
					SparseInfo sparseInfo = getSparseInfo(name, null, entr.getValue(), mapIndex, indexOffset, index);
				}
			
				indexOffset+= index.size();
			}
		} 
		return EcoreKeywordConfig.getMatrix();
	}

	public List<String> getNames() {
		return EcoreKeywordConfig.getNames();
	}

	protected EcoreKeywordConfig EcoreKeywordConfig = new EcoreKeywordConfig(new HashMap<String, EcoreKeywordConfig.SparseInfo>(), new HashMap<>(),
			new TreeSet<String>(), new ArrayList(), new ArrayList<Resource>(), new ArrayList<CompletableFuture<DistanceCalculator>>(), new HashMap<Long, List<File>>(), System.currentTimeMillis());

	private ArrayList<Attribute> attributes;
	
	private Instances instances;
	private EuclideanDistance distance;
	private Map<String,Instance> haveInstances;
	
	public void notifyProcessInfo(Instances instances, EuclideanDistance distance, Map<String,Instance> haveInstances) {
		this.instances = instances;
		this.distance = distance;
		this.haveInstances = haveInstances;
	}
	
	public Map<String,Double> getAllDistances(Resource to) {
		Map<String,Double>[] featureMap = getFeatureMaps(to, EcoreKeywordConfig);

		int[] endIndexAr = new int[] {1};
		SparseInfo sparseInfo = null;
		int indexOffset = 0;
		for (int mapIndex = 0; mapIndex < endIndexAr[0]; ++mapIndex) {
			Map index = generateIndexMap(mapIndex,endIndexAr);
			sparseInfo = getSparseInfo(null, sparseInfo , featureMap, mapIndex, indexOffset, index);
			indexOffset+= index.size();
		}
		EcoreKeywordConfig.SparseInfo si = sparseInfo;
		//Eigentlich könnte man 
		int[] indices = Arrays.copyOf(si.indices, si.indices.length);
		for (int j = 0; j < indices.length; ++j) {
			++indices[j];
		}
		SparseInstance sparseInstance = new SparseInstance(1.0, si.values, si.indices, si.indices.length+1);
		Map<String,Double> ret = new HashMap<>();
		for (Entry<String,Instance> entr: haveInstances.entrySet()) {
			double dist = distance.distance(entr.getValue(), sparseInstance);
			ret.put(entr.getKey(), dist);
		}
		return ret;
	}
	
	@Override
	public double getMatrixDistance(String from, String to) {
		String normalizedFrom = filenameToNormalizedName.get(from);
		String normalizedTo = filenameToNormalizedName.get(to);
		if (normalizedFrom == null || normalizedTo == null || normalizedFrom.isEmpty() || normalizedTo.isEmpty()) {
			return Double.NaN;
		}
		/*SparseInfo fromSi = getMatrix().get(normalizedFrom);
		SparseInfo toSi = getMatrix().get(normalizedTo);
		if (fromSi == null || fromSi.values.length == 0 || toSi == null || toSi.values.length == 0) {
			return Double.NaN;
		}*/
		Instance fromInstance = haveInstances.get(normalizedFrom);//new SparseInstance(1.0, fromSi.values, fromSi.indices, fromSi.indices.length);
		Instance toInstance = haveInstances.get(normalizedTo); //new SparseInstance(1.0, toSi.values, toSi.indices, toSi.indices.length);
		if (fromInstance == null || toInstance == null) {
			return Double.NaN;
		}
		double ret = distance.distance(fromInstance, toInstance);
		return ret;
	}

	public void generateInstances() {
		EcoreClusterProcess proc = new EcoreClusterProcess(reportFile, this, 1, "ALL");
		proc.generateInstances();
	}
	

}
