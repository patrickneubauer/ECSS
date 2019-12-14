package uk.ac.york.cs.ecss.api;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.xtext.GrammarResource;

import com.google.common.io.Files;

import uk.ac.york.cs.ecss.create.project.creator.BaseXtextProjectCreator;
import uk.ac.york.cs.ecss.create.project.creator.MavenTychoXtextProjectCreator;
import uk.ac.york.cs.ecss.migrated.EcoreNameRelationDistanceManager;
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
	
	private ResourceResolver resourceResolver;
	private ResourceLoaderImpl resourceLoader;

	public ResourceResolver getResourceResolver() {
		return resourceResolver;
	}

	public ResourceLoaderImpl getResourceLoader() {
		return resourceLoader;
	}

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
	
	public void setResourceResolver(ResourceResolver resolver) {
		this.resourceResolver = resolver; 
		if ( resourceLoader == null ) 
			resourceLoader = new ResourceLoaderImpl(resourceResolver);
	}
	
	public void initEcoreUtil(ResourceLoaderImpl loader, EcoreNameRelationDistanceManager man) {
		this.distanceManager = man;
		this.distanceManager.setResourceLoader(loader);
		this.distanceManager.generateInstances();
	}
	
	public void loadModelsAndDistances() {
		if ( resourceLoader == null ) {
			logger.error("CANNOT LOAD MODELS AND GENERATE DISTANCES --- ResourceLoader has not been initialized. Call setResourceResolver(..) first!");
		} else { 
			resourceLoader.loadAll();
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

	private String languageId;
	
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
		return generateAndSerializeGrammar(ecoreMetamodelFile, ecssModelFile, new String[1]);
	}
	
	public GrammarResource generateAndSerializeGrammar(File ecoreMetamodelFile, File ecssModelFile, String[] outputString) {
		File targetFile = new File(outputPath.toString() + "/" + languageId + "." + GRAMMAR_FILE_EXTENSION);

		Resource ecoreResource = resourceLoader.getResourceSet().getResource(URI.createFileURI(ecoreMetamodelFile.getAbsolutePath()), true);
		
		/* TODO is ResourceLoaderImpl capable of loading ecss models?  */
		Resource ecssResource = resourceLoader.getResourceSet().getResource(URI.createFileURI(ecssModelFile.getAbsolutePath()), true);
		
		CompleteManager cm = new CompleteManager(resourceLoader);
		cm.setGrammarName(languageName);
		cm.read(ecssResource);
		
		cm.prepareFor(ecoreResource);
		cm.getTemplateManager().addTemplate(EnumXtendRule.class, "enumRules");
		cm.getTemplateManager().addTemplate(TerminalXtendRule.class, "terminalRules");
		
		Resource newXtextResource = resourceLoader.getResourceSet().createResource(URI.createFileURI(targetFile.toString()));
		cm.saveInResource(newXtextResource,outputString);
		
		// create resource by loading from disk
		GrammarResource grammarResource = (GrammarResource) resourceLoader.getResourceSet().getResource(URI.createFileURI(targetFile.toString()), true);
		
		grammarResource.getContents().forEach(x->{
			if (x instanceof Grammar) {
				Grammar g = (Grammar)x;
				Normalizer.moveSort(g.getRules(),(a,b)->{
					int aVal = 0;
					int bVal = 0;
					if (a instanceof TerminalRule) {
						aVal = 2;
					}
					if (a instanceof EnumRule) {
						aVal = 1;
					}
					if (b instanceof TerminalRule) {
						bVal = 2;
					}
					if (b instanceof EnumRule) {
						bVal = 1;
					}
					return Integer.compare(aVal, bVal);
				});
				g.eAllContents().forEachRemaining(cont->{
					if (cont instanceof Alternatives) {
						Normalizer.moveSort(((Alternatives)cont).getElements(), null);						
					} else if (cont instanceof UnorderedGroup) {
						Normalizer.moveSort(((UnorderedGroup)cont).getElements(), null);
					} 
				});
			}
		});
		
		// TODO: SERIALIZE ecoreMetamodelFile and ADD it as referencedResource in MWE2 workflow !!!
		// Otherwise, runWorkflow() will not succeed !
		
		return grammarResource;
	}
	
	private File getOptimizedEcssFile(Resource ecoreFile) {
		return resourceResolver.resolveFromOther(ecoreFile,"","_optimized");
	}
	
	public Resource getBestMatch(File ecoreMetamodelFile) throws IOException {
		Resource res = resourceLoader.getResourceSet().getResource(URI.createFileURI(ecoreMetamodelFile.getCanonicalPath()),true);
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
		File grammarFile = new File(outputPath.toString() + "/" + Files.getNameWithoutExtension(ecoreMetamodelFile.toString()) + "." + GRAMMAR_FILE_EXTENSION);
		File styleModelFile = new File(outputPath.toString() + "/" + Files.getNameWithoutExtension(ecoreMetamodelFile.toString()) + "." + STYLE_LANGUAGE_FILE_EXTENSION);

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
		Resource styleModelResource =  resourceLoader.getResourceSet().createResource(URI.createFileURI(styleModelFile.toString()));
	
		return styleModelResource;
	}
	
	public Resource generateEnhancedMetamodel(File xmlSchemaFile) {
		// TODO implement use of XMLIntellEdit for enhanced ecore metamodel generation
		return null;
	}
	
	public Resource generateMetamodel(File grammarFile) {
		File targetFile = new File(outputPath.toString() + "/" + Files.getNameWithoutExtension(grammarFile.toString()) + "." + METAMODEL_FILE_EXTENSION);

		XtextToDefaultEcoreTransformer transformer = new XtextToDefaultEcoreTransformer(reportFile.toString());

        transformer.handle( grammarFile, targetFile );
        Resource metamodelResource = resourceLoader.getResourceSet().createResource(URI.createFileURI( targetFile.toString()));
       
        return metamodelResource;
	}
	
	public MavenTychoXtextProjectCreator generateLanguageProject(File parentProjectLocationPath) throws Exception {
		MavenTychoXtextProjectCreator projectCreator = new MavenTychoXtextProjectCreator(resourceLoader, reportFile.toString(), languageProjectBaseName, languageName, languageFileExtensions);
	
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
		File targetFile = new File(outputPath.toString() + "/" + languageId + "_XTEXT_DEFAULT." + GRAMMAR_FILE_EXTENSION);

		BaseXtextProjectCreator projectCreator = new BaseXtextProjectCreator(resourceLoader, reportFile.toString(), languageProjectBaseName, languageName, languageFileExtensions);
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
		File targetFile = new File(outputPath.toString() + "/" + Files.getNameWithoutExtension(languageMetamodelFile.toString()) + "_DEFAULT." + GRAMMAR_FILE_EXTENSION);

		BaseXtextProjectCreator projectCreator = new BaseXtextProjectCreator(resourceLoader, reportFile.toString(), languageProjectBaseName, languageName, languageFileExtensions);
		CharSequence grammarCharSequence = projectCreator.obtainDefaultGrammar(languageMetamodelFile.toString());
		
		// save result to disk
		FileUtils.save(grammarCharSequence, targetFile, DEFAULT_ENCODING);
		
		// create resource by loading from disk
		GrammarResource grammarResource = (GrammarResource) resourceLoader.getResourceSet().createResource(URI.createFileURI(targetFile.toString()));
		
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
		File targetFile = new File(outputPath.toString() + "/" + Files.getNameWithoutExtension(languageMetamodelFile.toString()) + "_DEFAULT." + GRAMMAR_FILE_EXTENSION);

		BaseXtextProjectCreator projectCreator = new BaseXtextProjectCreator(resourceLoader, reportFile.toString(), languageProjectBaseName, languageName, languageFileExtensions);
		CharSequence grammarCharSequence = projectCreator.obtainDefaultGrammar(languageMetamodelFile.toString());
		
		// create resource by loading from disk
		GrammarResource grammarResource = (GrammarResource) resourceLoader.getResourceSet().createResource(URI.createFileURI(targetFile.toString()));
		
		return grammarResource;
	}

	public MavenTychoXtextProjectCreator generateEnhancedLanguageProject(File parentProjectLocationPath) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLanguageId(String uniqueLanguageId) {
		this.languageId = uniqueLanguageId;		
	}

	public String getLanguageId() {
		return languageId;
	}

}
