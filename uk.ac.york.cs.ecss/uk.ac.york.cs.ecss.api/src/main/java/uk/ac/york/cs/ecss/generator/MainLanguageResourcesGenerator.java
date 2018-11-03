package uk.ac.york.cs.ecss.generator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xtext.GrammarResource;

import com.google.common.io.Files;
import com.google.inject.Injector;

import uk.ac.york.cs.ecss.analysis.grammaranalysis.SimpleResourceHandler;
import uk.ac.york.cs.ecss.analysis.grammaranalysis.XtextToDefaultEcoreTransformer;
import uk.ac.york.cs.ecss.basicdistance.EcoreNameRelationDistanceManager;
import uk.ac.york.cs.ecss.create.language.project.creator.BaseXtextProjectCreator;
import uk.ac.york.cs.ecss.create.language.project.creator.MavenTychoXtextProjectCreator;
import uk.ac.york.cs.ecss.ecssal.EcssalPackage;
import uk.ac.york.cs.ecss.helper.AnalysisModelHelper;
import uk.ac.york.cs.ecss.helper.FileUtils;
import uk.ac.york.cs.ecss.language.ECSSLanguageStandaloneSetup;
import uk.ac.york.cs.ecss.loader.EcoreResourceLoader;
import uk.ac.york.cs.ecss.optimize.ResourceResolver;

public class MainLanguageResourcesGenerator implements LanguageResourcesGenerator {

	private static final Logger logger = LogManager.getLogger(MainLanguageResourcesGenerator.class);

	protected Charset DEFAULT_ENCODING = Charset.defaultCharset();
	
	protected String GRAMMAR_FILE_EXTENSION = "xtext";
	protected String METAMODEL_FILE_EXTENSION = "ecore";
	protected String STYLE_LANGUAGE_FILE_EXTENSION = "ecss";
	protected String DEFAULT_STYLE_GRAMMAR_FILE_NAME_POSTFIX = "_ECSS_DEFAULT";
	
	private ResourceResolver ecssResolver;
	private EcoreResourceLoader ecoreLoader;
	private EcoreNameRelationDistanceManager distanceManager;
	
	protected File DEFAULT_STYLE_MODEL_FILE = new File("../../styles/default." + STYLE_LANGUAGE_FILE_EXTENSION);
	
	protected String analysisModelFileLocation;
	protected File reportFile;
	protected Path outputPath;
	
	public Path getOutputPath() {
		return outputPath;
	}

	public void setOutputPath(Path outputPath) {
		this.outputPath = outputPath;
	}
	
	public void setEcssResolver(ResourceResolver resolver) {
		this.ecssResolver = resolver; 
	}
	
	public void initEcoreUtil(EcoreResourceLoader loader, EcoreNameRelationDistanceManager man) {
		this.distanceManager = man;
		this.distanceManager.setResourceLoader(loader);
		this.distanceManager.generateInstances();
	}
	
	public void loadEcoreModelsAndDistances() {
		ecoreLoader.loadAll();
		this.distanceManager.generateInstances();
	}

	public String getLanguageProjectBaseName() {
		return languageProjectBaseName;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public List<String> getLanguageFileExtensions() {
		return languageFileExtensions;
	}

	public void setLanguageFileExtensions(List<String> languageFileExtensions) {
		this.languageFileExtensions = languageFileExtensions;
	}

	protected String languageProjectBaseName;
	protected String languageName;
	protected List<String> languageFileExtensions;
	
	protected ResourceSet emfResourceSet;
	protected ResourceSet ecssResourceSet;
	protected XtextResourceSet xtextResourceSet;
	
	protected Resource analysisModelResource;

	/**
	 * Initialize {@link MainLanguageResourcesGenerator} with use of analysis model (enables enhanced optimization).
	 * 
	 * @param reportFile file where to report the console output to
	 * @param analysisModelFileLocation analysis model (conforming to ecssal.ecore) file location
	 * @param outputPath location where to place generated resources
	 * @param languageProjectBaseName example: me.ecss.language
	 * @param languageName example: me.ecss.language.MyDsl
	 * @param languageFileExtensions example: mydsl
	 */
	public MainLanguageResourcesGenerator(File reportFile, Path outputPath, String analysisModelFileLocation, String languageProjectBaseName, String languageName,
			List<String> languageFileExtensions) {
		this.reportFile = reportFile;
		this.outputPath = outputPath;
		this.languageProjectBaseName = languageProjectBaseName;
		this.languageName = languageName;
		this.languageFileExtensions = languageFileExtensions;		
		this.analysisModelFileLocation = analysisModelFileLocation;
		init();
	}
	
	/**
	 * Initialize {@link MainLanguageResourcesGenerator} without use of analysis model (disables enhanced optimization).
	 * 
	 * @param reportFile file where to report the console output to
	 * @param outputPath location where to place generated resources
	 * @param languageProjectBaseName example: me.ecss.language
	 * @param languageName example: me.ecss.language.MyDsl
	 * @param languageFileExtensions example: mydsl
	 */
	public MainLanguageResourcesGenerator(File reportFile, Path outputPath, String languageProjectBaseName, String languageName,
			List<String> languageFileExtensions) {
		this(reportFile, outputPath, AnalysisModelHelper.UNDEFINED_ANALYSIS_MODEL_LOCATION_PLACEHOLDER_STRING, languageProjectBaseName, languageName, languageFileExtensions);
		
	}

	@Deprecated
	public GrammarResource generateGrammar(File ecoreMetamodelFile) {
		return generateGrammar(ecoreMetamodelFile, DEFAULT_STYLE_MODEL_FILE);
	}

	@Deprecated
	public GrammarResource generateGrammar(File ecoreMetamodelFile, File ecssModelFile) {
		File targetFile;
		if (ecssModelFile.equals(DEFAULT_STYLE_MODEL_FILE)) {
			targetFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(ecoreMetamodelFile.toString()) + DEFAULT_STYLE_GRAMMAR_FILE_NAME_POSTFIX + "." + GRAMMAR_FILE_EXTENSION);
		} else {
			targetFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(ecoreMetamodelFile.toString()) + "." + GRAMMAR_FILE_EXTENSION);
		}

		// FIXME: to be replaced to match new ECSS implementation
//		GrammarCreator grammarCreator = new GrammarCreator(reportFile.toString(), analysisModelFileLocation, ecoreMetamodelFile, ecssModelFile, targetFile);
//		grammarCreator.generateGrammar();
		
		// create resource by loading from disk
		GrammarResource grammarResource = (GrammarResource) xtextResourceSet.createResource(URI.createFileURI(targetFile.toString()));
		
		return grammarResource;
	}
	
	private File getOptimizedEcssFile(Resource ecoreFile) {
		return ecssResolver.resolveFromOther(ecoreFile,"","_optimized");
	}
	
	public Resource getBestMatch(File ecoreMetamodelFile) throws IOException {
		Resource res = ecssResourceSet.getResource(URI.createFileURI(ecoreMetamodelFile.getCanonicalPath()),true);
		double[] val = new double[1];
		Resource ret = distanceManager.getBestMatch(res, val);
		logger.info("Best match for "+ecoreMetamodelFile.getName()+" is "+ret.getURI()+" with value "+val[0]);
		return ret;
	}
	
	public GrammarResource generateGrammar(File ecoreMetamodelFile, boolean useOptimized) throws IOException {
		File useFile = DEFAULT_STYLE_MODEL_FILE;
		if (useOptimized) {
			Resource bestEcoreFile = getBestMatch(ecoreMetamodelFile);
			useFile = getOptimizedEcssFile(bestEcoreFile);
		}
		return generateGrammar(ecoreMetamodelFile, useFile);
	}
	
	public Resource generateStyleModel(File ecoreMetamodelFile) throws Exception {
		return generateStyleModel(ecoreMetamodelFile, false);
	}

	public Resource generateStyleModel(File ecoreMetamodelFile, boolean optimize) throws Exception {
		File grammarFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(ecoreMetamodelFile.toString()) + "." + GRAMMAR_FILE_EXTENSION);
		File styleModelFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(ecoreMetamodelFile.toString()) + "." + STYLE_LANGUAGE_FILE_EXTENSION);

		if (optimize) {
			// case: w/ style model optimization
			//StyleOptimizer optimizer = new ClusterBasedStyleOptimizer(analysisModelResource);
			//optimizer.generateOptimizedStyle(styleModelFile);
			throw new UnsupportedOperationException("Optimizing NYI");
		} else {
			// case: w/o style model optimization
			// first, generate grammar from given metamodel
			generateGrammar(ecoreMetamodelFile);
			// second, generate style model from generated grammar
			// FIXME: to be replaced to match new ECSS implementation
//			Xtext2EcssTransformer xtext2ecssTransformation = new Xtext2EcssTransformer(reportFile.toString(), analysisModelFileLocation);
//			xtext2ecssTransformation.transform(grammarFile, styleModelFile);
		}

		// create resource by loading from disk
		Resource styleModelResource =  ecssResourceSet.createResource(URI.createFileURI(styleModelFile.toString()));
	
		return styleModelResource;
	}
	
	public Resource generateEnhancedMetamodel(File xmlSchemaFile) {
		// TODO implement use of XMLIntellEdit for enhanced ecore metamodel generation
		return null;
	}

	public Resource generateMetamodel(File grammarFile) {
		File targetFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(grammarFile.toString()) + "." + METAMODEL_FILE_EXTENSION);

		SimpleResourceHandler transformer = new XtextToDefaultEcoreTransformer(reportFile.toString(), analysisModelFileLocation);

        transformer.handle( grammarFile, targetFile );
        Resource metamodelResource = emfResourceSet.createResource(URI.createFileURI( targetFile.toString()));
       
        return metamodelResource;
	}

	public MavenTychoXtextProjectCreator generateLanguageProject(File parentProjectLocationPath) throws Exception {
		MavenTychoXtextProjectCreator projectCreator = new MavenTychoXtextProjectCreator(reportFile.toString(), languageProjectBaseName, languageName, languageFileExtensions);
	
		projectCreator.prepareDestination(parentProjectLocationPath);
		projectCreator.create(parentProjectLocationPath.toString());
		
		return projectCreator;
	}

	public GrammarResource generateDefaultGrammar(File languageMetamodelFile) throws Exception {
		File targetFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(languageMetamodelFile.toString()) + "_DEFAULT." + GRAMMAR_FILE_EXTENSION);

		BaseXtextProjectCreator projectCreator = new BaseXtextProjectCreator(reportFile.toString(), languageProjectBaseName, languageName, languageFileExtensions);
		CharSequence grammarCharSequence = projectCreator.obtainDefaultGrammar(languageMetamodelFile.toString());
		
		// save result to disk
		FileUtils.save(grammarCharSequence, targetFile, DEFAULT_ENCODING);
		
		// create resource by loading from disk
		GrammarResource grammarResource = (GrammarResource) xtextResourceSet.createResource(URI.createFileURI(targetFile.toString()));
		
		return grammarResource;
	}
	
	protected void init() {
		logger.info("Initializing " + this.getClass().getName() + " ...");

		// emf xmi and ecssal
		emfResourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(EcssalPackage.eNS_URI, EcssalPackage.eINSTANCE);

		// xtext
		Injector xtextInjector = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		xtextResourceSet = xtextInjector.getInstance(XtextResourceSet.class);

		// ecss
		Injector ecssInjector = new ECSSLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		ecssResourceSet = ecssInjector.getInstance(XtextResourceSet.class);
		
		if ( !analysisModelFileLocation.equals(AnalysisModelHelper.UNDEFINED_ANALYSIS_MODEL_LOCATION_PLACEHOLDER_STRING) ) {
			analysisModelResource = emfResourceSet.getResource(URI.createFileURI(analysisModelFileLocation), true);
	
		    try {
				analysisModelResource.load(null);
		    } catch (IOException e) {
				logger.error("Failed to load model resource from " + analysisModelFileLocation);
				logger.error(e.getMessage());
			}
		}

		logger.info("... finished initializing " + this.getClass().getName());
		
	}

	public MavenTychoXtextProjectCreator generateEnhancedLanguageProject(File parentProjectLocationPath) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
