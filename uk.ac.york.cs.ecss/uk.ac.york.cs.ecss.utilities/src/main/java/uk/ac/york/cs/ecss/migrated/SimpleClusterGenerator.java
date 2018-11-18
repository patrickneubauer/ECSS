/**
 * 
 */
package uk.ac.york.cs.ecss.migrated;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

/**
 * @author blizzfire
 *
 */
public class SimpleClusterGenerator {

	private static final Logger logger = LogManager.getLogger(SimpleClusterGenerator.class);
	
	String matrixFile;
	String reportFile;
	List<Problem> problemLog = new ArrayList<>();
	List<FileProblems> fileProblems = new ArrayList<FileProblems>();
	protected String analysisModelFileLocation;
	public static final String XTEXT_METAMODEL_FILE_LOCATION = "resources/Xtext.ecore";
	public static final String ECORE_METAMODEL_FILE_LOCATION = "resources/Ecore.ecore";
	protected static final int DEFAULT_CLUSTER_NO = 1;
	protected static final String DEFAULT_LINK_TYPE = "COMPLETE";
	protected Resource analysisModelResource;
	protected Resource xtextMetamodelResource;
	protected ResourceSet emfResourceSet;
	protected XtextResourceSet xtextResourceSet;
	protected ArrayList<ClassInstance> classInstances; // elements of Ecore metamodel
	protected Cluster[] clusters;
	protected int clusterNo;
	protected String linkType;
	protected GeneratorStatus generatorStatus = GeneratorStatus.UNDEFINED;
	protected String serverUrl = "http://localhost:7070"; //Default: connect to server
	protected KeywordConfig keywordConfig;
	protected DistanceType distanceType;

	public GeneratorStatus getGeneratorStatus() {
		return generatorStatus;
	}

	/**
	 * Overwrite generator status 
	 * 
	 * @param generatorStatus
	 */
	public void setGeneratorStatus(GeneratorStatus generatorStatus) {
		this.generatorStatus = generatorStatus;
	}

	protected interface Problem {
			public AbstractElement getElement();
			public ProblemKind getKind();
			public String getText();
	}

	public class ProblemImpl implements Problem {
		
		private AbstractElement element;
		private ProblemKind kind;
		private String text;
		
		public ProblemImpl(ProblemKind kind, AbstractElement el, String text) {
			this.kind = kind;
			this.element = el;
			this.text = text;
		}
		

		@Override
		public AbstractElement getElement() {
			return element;
		}

		@Override
		public ProblemKind getKind() {
			return kind;
		}

		@Override
		public String getText() {
			return text;
		}
		
		public String toString() {
			return kind+" in "+element+": "+text;
		}
		
	}

	public enum ProblemKind {
		WARNING, ERROR, NYI;
	}

	protected static enum GroupType {
			SEQUENCE, ALLOF
		}

	protected static class FileProblems {
			
			public FileProblems(File file, List<Problem> problemLog) {
				this.file = file;
				this.problemLog = problemLog;
			}
			public final File file;
			public final  List<Problem> problemLog;
		}

	protected enum GeneratorStatus {
			UNDEFINED, INITIALIZED_WITHOUT_ANALYSIS_MODEL, INITIALIZED_WITH_ANALYSIS_MODEL, DISTANCES_COMPUTED, GENERATION_COMPLETED, analysis_MODEL_UPDATED, analysis_MODEL_SERIALIZED
		}

	public void printLog() {
		if (!problemLog.isEmpty()) {
			logger.info("Problem log contains "+problemLog.size()+" entries!");
			
			for (Problem problem: problemLog) {
				logger.error(problem.toString());
			}
		}
	}

	/**
	 * 
	 */
	public SimpleClusterGenerator() {
		// TODO Auto-generated constructor stub
	}

	

	public List<Problem> getErrorLog() {
		return problemLog;
	}

	public void clearErrorLog() {
		problemLog.clear();
	}

	
	
	public static<A,B> void putAll(Map<A,B> map, B value, A... keys) {
		for (A key: keys)  {
			map.put(key, value);
		}
	}	

	public void reportProblems(boolean alsoSuccessful) {
		logger.info("=============== " + this.getClass().getName() + " START REPORTING PROBLEMS =============");
		for (FileProblems prob: fileProblems) {
			if (!alsoSuccessful && prob.problemLog.isEmpty()) {
				continue;
			}
			logger.info("File: "+prob.file.getName()+": "+prob.problemLog.size()+" Problems");
			for (Problem p: prob.problemLog) {
				logger.info(p.toString());
			}
		}
		logger.info("=============== " + this.getClass().getName() + " FINISHED REPORTING PROBLEMS =============");
	}
	
	public void serializeAnalysisModel() {
		logger.info("Serializing analysis model ... ");

		try {
			analysisModelResource.save(Collections.emptyMap());
		} catch (IOException e) {
			logger.error("Unable to serialize/save analysis model.");
			e.printStackTrace();
		}
		logger.info("... finished serializing analysis model.");
	}
	
	/**
	 * init Ecore ResourceSet without intention of analysis model use
	 */
	public void initEcoreResourceSet() {
		// TODO: to be implemented for use by WekaEcoreClusterGenerator
		// ECORE_METAMODEL_FILE_LOCATION and Ecore.ecore file is provided if required
	}
	
	
	/**
	 * init Ecore ResourceSet without intention of analysis model use
	 * 
	 * @param ecssalModelFileLocation
	 */
	public void initEcoreResourceSet(String ecssalModelFileLocation) {
		// TODO: to be implemented for use by WekaEcoreClusterGenerator
		// ECORE_METAMODEL_FILE_LOCATION and Ecore.ecore file is provided if required
	}

	/**
	 * init Xtext ResourceSet without intention of analysis model use
	 */
	public void initXtextResourceSet() {
		Injector i = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		xtextResourceSet = i.getInstance(XtextResourceSet.class);
		xtextMetamodelResource = xtextResourceSet.getResource(URI.createFileURI(XTEXT_METAMODEL_FILE_LOCATION), true);
		
	    try {
	    		xtextMetamodelResource.load(null);
	    		generatorStatus = GeneratorStatus.INITIALIZED_WITHOUT_ANALYSIS_MODEL;
			logger.info("Successfully initialized without analysis model.");
	    } catch (IOException e) {
			logger.error("Failed to initialized without analysis model and only with " + XTEXT_METAMODEL_FILE_LOCATION);
			logger.error(e.getMessage());
		}
	}
	
	/**
	 * init Xtext ResourceSet WITH intention of analysis model use
	 * 
	 * @param ecssalModelFileLocation
	 */
	public void initXtextResourceSet(String ecssalModelFileLocation) {
		this.analysisModelFileLocation = ecssalModelFileLocation;
		Injector i = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		xtextResourceSet = i.getInstance(XtextResourceSet.class);
		xtextMetamodelResource = xtextResourceSet.getResource(URI.createFileURI(XTEXT_METAMODEL_FILE_LOCATION), true);
		
	    try {
	    		xtextMetamodelResource.load(null);
	    } catch (IOException e) {
			logger.error("Failed to load resource from " + XTEXT_METAMODEL_FILE_LOCATION);
			logger.error(e.getMessage());
		}
		
		emfResourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

//		generatorStatus = GeneratorStatus.INITIALIZED_WITHOUT_ANALYSIS_MODELINITIALIZED_WITH_ANALYSIS_MODEL;

	}
	
	protected void processEObject(EObject eObject) {
		EStructuralFeature featureName = eObject.eClass().getEStructuralFeature("name");

		if (featureName != null) {
			String name = (String)eObject.eGet(featureName);

			ClassInstance classInstance = getClassInstance(name);

			if (classInstance == null) {
				classInstance = new ClassInstance(name);
				classInstances.add(classInstance);
			}

			classInstance.setAbstract(((EClass)eObject).isAbstract());

			EStructuralFeature featureESuperTypes = eObject.eClass().getEStructuralFeature("eSuperTypes");

			if (featureESuperTypes != null) {
				EList<EClass> superTypes = (EList<EClass>)eObject.eGet(featureESuperTypes);

				for (EClass superType : superTypes) {
					ClassInstance superInstance = getClassInstance(superType.getName());

					if (superInstance == null) {
						superInstance = new ClassInstance(superType.getName());
						classInstances.add(superInstance);
					}

					superInstance.setIsSuperType(true);
				}			        	
			}
		}
	}
	
	protected ClassInstance getClassInstance(String name) {
		for (ClassInstance classInstance : classInstances) {
			if (classInstance.getName().equals(name))
				return classInstance;
		}

		return null;
	}
	
	public Cluster[] getClusters() {
		return clusters;
	}

	protected void reportData() {
		logger.info("========= PRINTING CLUSTERS =========");
		for (Cluster cluster : clusters) {
			logger.info(cluster.toString());
		}
		logger.info("=====================================");
	}

	protected void printData() {
		logger.info("========= PRINTING CLUSTERS =========");
		for (Cluster cluster : clusters) {
			logger.info(cluster.toString());
		}
		logger.info("=====================================");
	}

	public void setupServerUse(String serverUrl, String serverConfigFile) {
	
			File file = new File(serverConfigFile);
			if (file.exists()) {
				try {
					BufferedReader reader = new BufferedReader(new FileReader(file));
					String serverUrlLine = reader.readLine();
					if (serverUrlLine != null && !"null".equals(serverUrl)) {
						this.serverUrl = serverUrlLine;
					} else {
						this.serverUrl = null;
					}
					reader.close();
					logger.info("Successfully setup server use.");
				} catch (IOException e) {
					logger.error("FAILED to setup server use: " + e.getMessage());
				}
			}
		
	}

	/*public void setKeywordConfig(KeywordConfig config) {
		this.keywordConfig  = config;
		
	}*/

}
