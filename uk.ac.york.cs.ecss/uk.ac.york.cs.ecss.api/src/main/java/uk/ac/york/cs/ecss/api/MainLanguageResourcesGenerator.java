package uk.ac.york.cs.ecss.api;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xtext.GrammarResource;

import com.google.common.io.Files;
import uk.ac.york.cs.ecss.create.project.creator.BaseXtextProjectCreator;
import uk.ac.york.cs.ecss.create.project.creator.MavenTychoXtextProjectCreator;
import uk.ac.york.cs.ecss.migrated.EcoreNameRelationDistanceManager;
import uk.ac.york.cs.ecss.migrated.ResourceLoaderImpl;
import uk.ac.york.cs.ecss.migrated.ResourceLoaderImpl;
import uk.ac.york.cs.ecss.migrated.ResourceResolver;
import uk.ac.york.cs.ecss.migrated.XtextToDefaultEcoreTransformer;
import uk.ac.york.cs.ecss.newproc.CompleteManager;
import uk.ac.york.cs.ecss.newproc.EnumXtendRule;
import uk.ac.york.cs.ecss.newproc.TerminalXtendRule;
import uk.ac.york.cs.ecss.utilities.FileUtils;

public class MainLanguageResourcesGenerator implements LanguageResourcesGenerator {

	private static final Logger logger = LogManager.getLogger(MainLanguageResourcesGenerator.class);

	protected Charset DEFAULT_ENCODING = Charset.defaultCharset();
	
	protected String GRAMMAR_FILE_EXTENSION = "xtext";
	protected String METAMODEL_FILE_EXTENSION = "ecore";
	protected String STYLE_LANGUAGE_FILE_EXTENSION = "ecss";
	protected String DEFAULT_STYLE_GRAMMAR_FILE_NAME_POSTFIX = "_ECSS_DEFAULT";
	
	private ResourceResolver ecssResolver;
	private ResourceResolver ecoreResolver;
	
	private ResourceLoaderImpl ecoreResourceLoader;
	private ResourceLoaderImpl ecssResourceLoader;

	private EcoreNameRelationDistanceManager distanceManager;
	
	protected File DEFAULT_STYLE_MODEL_FILE = new File("../../styles/default." + STYLE_LANGUAGE_FILE_EXTENSION);
	
	protected String analysisModelFileLocation;
	protected File reportFile;
	protected Path outputPath;

	
	public Path getOutputPath() {
		return outputPath;
	}

	public ResourceLoaderImpl getEcoreLoader() {
		return ecoreResourceLoader;
	}
	
	public void setOutputPath(Path outputPath) {
		this.outputPath = outputPath;
	}
	
	public void setEcssResolver(ResourceResolver resolver) {
		this.ecssResolver = resolver; 
		if ( ecssResourceLoader == null ) 
			ecssResourceLoader = new ResourceLoaderImpl(ecssResolver);
	}
	
	public void setEcoreResolver(ResourceResolver resolver) {
		this.ecoreResolver = resolver;
		if ( ecoreResourceLoader == null ) 
			ecoreResourceLoader = new ResourceLoaderImpl(ecoreResolver);
	}
	
	public void initEcoreUtil(ResourceLoaderImpl loader, EcoreNameRelationDistanceManager man) {
		this.distanceManager = man;
		this.distanceManager.setResourceLoader(loader);
		this.distanceManager.generateInstances();
	}
	
	public void loadEcoreModelsAndDistances() {
		if ( ecoreResourceLoader == null ) {
			logger.error("CANNOT LOAD ECORE MODELS AND GENERATE DISTANCES --- EcoreLoader has not been initialized. Call setEcoreResolver(..) first!");
		} else { 
			ecoreResourceLoader.loadAll();
			this.distanceManager.generateInstances();			
		}
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
	
	protected Resource analysisModelResource;
	
	/**
	 * Initialize {@link MainLanguageResourcesGenerator} 
	 * 
	 * @param reportFile file where to report the console output to
	 * @param outputPath location where to place generated resources
	 * @param languageProjectBaseName example: me.ecss.language
	 * @param languageName example: me.ecss.language.MyDsl
	 * @param languageFileExtensions example: mydsl
	 */
	public MainLanguageResourcesGenerator(File reportFile, Path outputPath, String languageProjectBaseName, String languageName,
			List<String> languageFileExtensions) {
		this.reportFile = reportFile;
		this.outputPath = outputPath;
		this.languageProjectBaseName = languageProjectBaseName;
		this.languageName = languageName;
		this.languageFileExtensions = languageFileExtensions;		
	}

	public GrammarResource generateAndSerializeGrammar(File ecoreMetamodelFile) {
		return generateAndSerializeGrammar(ecoreMetamodelFile, DEFAULT_STYLE_MODEL_FILE);
	}

	public GrammarResource generateAndSerializeGrammar(File ecoreMetamodelFile, File ecssModelFile) {
		File targetFile;
		if (ecssModelFile.equals(DEFAULT_STYLE_MODEL_FILE)) {
			targetFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(ecoreMetamodelFile.toString()) + DEFAULT_STYLE_GRAMMAR_FILE_NAME_POSTFIX + "." + GRAMMAR_FILE_EXTENSION);
		} else {
			targetFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(ecoreMetamodelFile.toString()) + "." + GRAMMAR_FILE_EXTENSION);
		}

		Resource ecoreResource = ecoreResourceLoader.getResourceSet().getResource(URI.createFileURI(ecoreMetamodelFile.getAbsolutePath()), true);
		
		/* TODO is ResourceLoaderImpl capable of loading ecss models?  */
		Resource ecssResource = ecssResourceLoader.getResourceSet().getResource(URI.createFileURI(ecssModelFile.getAbsolutePath()), true);
		
		CompleteManager cm = new CompleteManager();
		cm.read(ecssResource);
		
		cm.prepareFor(ecoreResource);
		cm.getTemplateManager().addTemplate(EnumXtendRule.class, "enumRules");
		cm.getTemplateManager().addTemplate(TerminalXtendRule.class, "terminalRules");
		
		/* TODO is ResourceLoaderImpl capable of loading ecss models?  */
		Resource newXtextResource = ecssResourceLoader.getResourceSet().createResource(URI.createFileURI(targetFile.toString()));
		cm.saveInResource(newXtextResource);	
		
		// create resource by loading from disk
		GrammarResource grammarResource = (GrammarResource) ecssResourceLoader.getResourceSet().getResource(URI.createFileURI(targetFile.toString()), true);
		
		return grammarResource;
	}
	
	private File getOptimizedEcssFile(Resource ecoreFile) {
		return ecssResolver.resolveFromOther(ecoreFile,"","_optimized");
	}
	
	public Resource getBestMatch(File ecoreMetamodelFile) throws IOException {
		Resource res = ecoreResourceLoader.getResourceSet().getResource(URI.createFileURI(ecoreMetamodelFile.getCanonicalPath()),true);
		double[] val = new double[1];
		Resource ret = distanceManager.getBestMatch(res, val);
		logger.info("Best match for "+ecoreMetamodelFile.getName()+" is "+ret.getURI()+" with value "+val[0]);
		return ret;
	}
	
	public GrammarResource generateGrammar(File ecoreMetamodelFile, boolean useOptimized) throws IOException {
		File useFile = DEFAULT_STYLE_MODEL_FILE;
		if (useOptimized) {
			logger.warn("Optimized ECSS model use not available in this framework version--using default ECSS model instead.");
//			Resource bestEcoreFile = getBestMatch(ecoreMetamodelFile);
//			useFile = getOptimizedEcssFile(bestEcoreFile);
//			return generateGrammar(ecoreMetamodelFile, useFile);
		}
		return generateAndSerializeGrammar(ecoreMetamodelFile, useFile);
	}
	
	/**
	 * Not offered by this framework version
	 */
	@Deprecated
	public Resource generateStyleModel(File ecoreMetamodelFile) throws Exception {
		return generateStyleModel(ecoreMetamodelFile, false);
	}
	
	/**
	 * Not offered by this framework version
	 */
	@Deprecated
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
			//generateGrammar(ecoreMetamodelFile);
//			generateDefaultGrammarResource(ecoreMetamodelFile);
			// second, generate style model from generated grammar
			// FIXME: to be replaced to match new ECSS implementation
//			Xtext2EcssTransformer xtext2ecssTransformation = new Xtext2EcssTransformer(reportFile.toString(), analysisModelFileLocation);
//			xtext2ecssTransformation.transform(grammarFile, styleModelFile);
		}

		// create resource by loading from disk
		Resource styleModelResource =  ecssResourceLoader.getResourceSet().createResource(URI.createFileURI(styleModelFile.toString()));
	
		return styleModelResource;
	}
	
	public Resource generateEnhancedMetamodel(File xmlSchemaFile) {
		// TODO implement use of XMLIntellEdit for enhanced ecore metamodel generation
		return null;
	}

	public Resource generateMetamodel(File grammarFile) {
		File targetFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(grammarFile.toString()) + "." + METAMODEL_FILE_EXTENSION);

		XtextToDefaultEcoreTransformer transformer = new XtextToDefaultEcoreTransformer(reportFile.toString());

        transformer.handle( grammarFile, targetFile );
        Resource metamodelResource = ecoreResourceLoader.getResourceSet().createResource(URI.createFileURI( targetFile.toString()));
       
        return metamodelResource;
	}

	public MavenTychoXtextProjectCreator generateLanguageProject(File parentProjectLocationPath) throws Exception {
		MavenTychoXtextProjectCreator projectCreator = new MavenTychoXtextProjectCreator(ecoreResourceLoader, reportFile.toString(), languageProjectBaseName, languageName, languageFileExtensions);
	
		projectCreator.prepareDestination(parentProjectLocationPath);
		projectCreator.create(parentProjectLocationPath.toString());
		
		return projectCreator;
	}

	/**
	 * Generates and returns default Xtext grammar based on given Ecore meta-model.
	 * 
	 * @param languageMetamodelFile
	 * @return {@code CharSequence} object
	 * @throws Exception
	 */
	public CharSequence generateDefaultGrammarCharSequence(File languageMetamodelFile) throws Exception {
		File targetFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(languageMetamodelFile.toString()) + "_DEFAULT." + GRAMMAR_FILE_EXTENSION);

		BaseXtextProjectCreator projectCreator = new BaseXtextProjectCreator(ecoreResourceLoader, reportFile.toString(), languageProjectBaseName, languageName, languageFileExtensions);
		return projectCreator.obtainDefaultGrammar(languageMetamodelFile.toString());	
	}
	
	/**
	 * Generates, serialises, and returns default Xtext grammar based on given Ecore meta-model.
	 * 
	 * @param languageMetamodelFile
	 * @return {@code GrammarResource} object
	 * @throws Exception
	 */
	public GrammarResource generateAndSerialiseDefaultGrammarResource(File languageMetamodelFile) throws Exception {
		File targetFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(languageMetamodelFile.toString()) + "_DEFAULT." + GRAMMAR_FILE_EXTENSION);

		BaseXtextProjectCreator projectCreator = new BaseXtextProjectCreator(ecoreResourceLoader, reportFile.toString(), languageProjectBaseName, languageName, languageFileExtensions);
		CharSequence grammarCharSequence = projectCreator.obtainDefaultGrammar(languageMetamodelFile.toString());
		
		// save result to disk
		FileUtils.save(grammarCharSequence, targetFile, DEFAULT_ENCODING);
		
		// create resource by loading from disk
		GrammarResource grammarResource = (GrammarResource) ecssResourceLoader.getResourceSet().createResource(URI.createFileURI(targetFile.toString()));
		
		return grammarResource;
	}
	
	/**
	 * Generates and returns default Xtext grammar based on given Ecore meta-model.
	 * 
	 * @param languageMetamodelFile
	 * @return {@code GrammarResource} object
	 * @throws Exception
	 */
	public GrammarResource generateDefaultGrammarResource(File languageMetamodelFile) throws Exception {
		File targetFile = new File(outputPath.toString() + Path.SEPARATOR + Files.getNameWithoutExtension(languageMetamodelFile.toString()) + "_DEFAULT." + GRAMMAR_FILE_EXTENSION);

		BaseXtextProjectCreator projectCreator = new BaseXtextProjectCreator(ecoreResourceLoader, reportFile.toString(), languageProjectBaseName, languageName, languageFileExtensions);
		CharSequence grammarCharSequence = projectCreator.obtainDefaultGrammar(languageMetamodelFile.toString());
		
		// create resource by loading from disk
		GrammarResource grammarResource = (GrammarResource) ecssResourceLoader.getResourceSet().createResource(URI.createFileURI(targetFile.toString()));
		
		return grammarResource;
	}

	public MavenTychoXtextProjectCreator generateEnhancedLanguageProject(File parentProjectLocationPath) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
