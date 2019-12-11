package uk.ac.york.cs.ecss.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.utils.DirectoryCleaner;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import uk.ac.york.cs.ecss.api.MainLanguageResourcesGenerator;
import uk.ac.york.cs.ecss.create.project.creator.MavenTychoXtextProjectCreator;
import uk.ac.york.cs.ecss.migrated.EcoreKeywordConfig;
import uk.ac.york.cs.ecss.migrated.EcoreNameRelation;
import uk.ac.york.cs.ecss.migrated.EcoreNameRelationDistanceManager;
import uk.ac.york.cs.ecss.migrated.MultiExtensionResourceResolver;
import uk.ac.york.cs.ecss.utilities.FileUtils;

//@Ignore("to be executed manually")
@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainLanguageResourceGeneratorMQLExampleTest extends BaseLanguageResourcesGeneratorTest {

	private static final String ECORE_FILE_NAME = "spacetransportationservice.ecore";
	private static final String LANGUAGE_FILE_EXTENSION = "sts";
	private static final String LANGUAGE_NAME_PREFIX = "uk.ac.york.cs.ecss.examples.spacetransportationservice";
	private static final String languageProjectBaseName = LANGUAGE_NAME_PREFIX;

	private static final Logger logger = LogManager.getLogger(MainLanguageResourceGeneratorMQLExampleTest.class);

	protected static final String INPUT_DATA_FOLDER = "../../sts-example";
	protected static final String XTEXT_INPUT_PATH = "/grammar-variations/";
	protected static final String ECORE_PATH = INPUT_DATA_FOLDER + "/meta-modelling/spacetransportationservice/model/";
	protected static final String STYLES_FOLDER = "../../styles/";
	protected static final String DEFAULT_STYLE_NAME = "default.ecss";
	protected static final String YAML_STYLE_NAME = "yaml.ecss";
	protected static final String HUTN_STYLE_NAME = "hutn.ecss";
	protected static final String WSAWARE_STYLE_NAME = "wsaware.ecss";

	
	private String uniqueLanguageId;

	private Path outputPath;
	private String languageName;

	private static MainLanguageResourcesGenerator generator;

	private static File reportFile;

	@Parameters
	public static List<File> data() {
		File dataFolder = new File(INPUT_DATA_FOLDER + XTEXT_INPUT_PATH);
		File[] dataFolderFileArray = FileUtils.getListOfAcceptedFiles(dataFolder, GRAMMAR_FILE_EXTENSION);
		return Arrays.asList(dataFolderFileArray);
	}

	public MainLanguageResourceGeneratorMQLExampleTest(File inputFile) {
		uniqueLanguageId = com.google.common.io.Files.getNameWithoutExtension(inputFile.toString());
		languageName = LANGUAGE_NAME_PREFIX + "." + uniqueLanguageId;
		outputPath = Paths.get(INPUT_DATA_FOLDER + OUTPUT_PATH + uniqueLanguageId + "/");
		try {
			FileUtils.deleteDirectory(outputPath);
			Files.createDirectories(outputPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		generator.setLanguageName(languageName);
		generator.setLanguageId(uniqueLanguageId);
		generator.setOutputPath(outputPath);

		logger.info("Running " + this.getClass().getName() + "( " + uniqueLanguageId + " )");
	}

	@BeforeClass
	public static void setUp() throws Exception {
		// prepare destination (wipe previously generated; re-create generation target location)
		FileUtils.deleteDirectory(Paths.get(INPUT_DATA_FOLDER+OUTPUT_PATH));
		Files.createDirectories(Paths.get(INPUT_DATA_FOLDER+OUTPUT_PATH));
		// copy language language meta-model to generation target location, i.e. used by ResourceResolver
//		Files.copy(Paths.get(ECORE_PATH+ECORE_FILE_NAME), Paths.get(INPUT_DATA_FOLDER+OUTPUT_PATH+ECORE_FILE_NAME));
		
		languageFileExtensions.add(LANGUAGE_FILE_EXTENSION);
		reportFile = new File(INPUT_DATA_FOLDER + REPORT_FILE_LOCATION);

		generator = new MainLanguageResourcesGenerator(reportFile, Paths.get(""), 
				languageProjectBaseName, "", languageFileExtensions);
		List<File> basePaths = new LinkedList<File>();
		basePaths.add(new File(INPUT_DATA_FOLDER+OUTPUT_PATH));
		basePaths.add(new File(ECORE_PATH));
		basePaths.add(new File(ECSS_LANGUAGE_OTHER_MODELS_PATH));
		generator.setResourceResolver(MultiExtensionResourceResolver.get(basePaths,
				"", true, "ecore", "ecss", "xtext"));
		generator.getResourceLoader().loadAll();
		EcoreKeywordConfig config = new EcoreKeywordConfig();
		config.useKeywords = true;
		EcoreNameRelation relation = new EcoreNameRelation(reportFile.getAbsolutePath(), generator.getResourceLoader().getResources(), 
				generator.getResourceLoader().getResourceSet(), config);
		EcoreNameRelationDistanceManager man = new EcoreNameRelationDistanceManager(generator.getResourceLoader(), relation);
		generator.initEcoreUtil(generator.getResourceLoader(), man);
		
	}

	@Test
	@Ignore("Spacetransportationservice.xtext references an existing metamodel. Therefore, this is not applicable.")
	public void _1_testGenerateMetamodel() {
		logger.info("Running test on " + uniqueLanguageId + " ...");
		try {
			Resource ecoreMetamodel = generator.generateMetamodel(
					new File(INPUT_DATA_FOLDER + XTEXT_INPUT_PATH + uniqueLanguageId + "." + GRAMMAR_FILE_EXTENSION));
			ecoreMetamodel.save(Collections.emptyMap());
			
			generator.getResourceLoader().getResources().remove(ecoreMetamodel);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void _1_testGenerateEnhancedMetamodel() {
		logger.info("Running test on " + uniqueLanguageId + " ...");
		try {
			Resource ecoreMetamodel = generator.generateEnhancedMetamodel(new File(INPUT_DATA_FOLDER + XTEXT_INPUT_PATH
					+ uniqueLanguageId + ENHANCED_POSTFIX + "." + GRAMMAR_FILE_EXTENSION));

			generator.getResourceLoader().getResources().remove(ecoreMetamodel);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	public void _2_testGenerateDefaultGrammar() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);
			File xtextGrammarFile = new File(ECORE_PATH + ECORE_FILE_NAME.replace(".ecore", "_DEFAULT.xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerialiseDefaultGrammarResource(metamodelFile);
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			generator.getResourceLoader().getResources().remove(xtextGrammar);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * ecore --> specific xtext grammar-based ecss style (non-optimized) same as
	 * {@code testGenerateStyleModelFileBooleanFalse} -- just a convenience call
	 */
	@Test
	@Ignore("same as {@code testGenerateStyleModelFileBooleanFalse} -- just a convenience method")
	public void _3convenience_testGenerateStyleModelFile() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			Resource ecssModel = generator.generateStyleModel(new File(INPUT_DATA_FOLDER + OUTPUT_PATH
					+ uniqueLanguageId + "/" + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION));

			generator.getResourceLoader().getResources().remove(ecssModel);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * ecore --> specific xtext grammar-based ecss style (optimized)
	 */
	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void _3optimized_testGenerateStyleModelFileBooleanTrue() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			Resource ecssModel = generator.generateStyleModel(new File(INPUT_DATA_FOLDER + OUTPUT_PATH
					+ uniqueLanguageId + "/" + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION), true);
	
			generator.getResourceLoader().getResources().remove(ecssModel);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * ecore --> specific xtext grammar-based ecss style (non-optimized)
	 */
	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void _3_testGenerateStyleModelFileBooleanFalse() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			Resource ecssModel = generator.generateStyleModel(new File(ECORE_PATH + ECORE_FILE_NAME), false);
			
			generator.getResourceLoader().getResources().remove(ecssModel);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * Tests the generation of Xtext grammar from given ecore (by using default ecss)
	 */
	@Test
	public void _4default_testGenerateAndSerializeGrammarFile() {
		logger.info("Running test on " + uniqueLanguageId + " ...");
		
		try {
			File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);
			File xtextGrammarFile = new File(ECORE_PATH + ECORE_FILE_NAME.replace(".ecore", ".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile);
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
	
			generator.getResourceLoader().getResources().remove(xtextGrammar);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * Tests the generation of Xtext grammar from given ecore + default ecss
	 */
	@Test
	public void _4specific_testGenerateAndSerializeGrammarFileFileDefaultStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);
			File xtextGrammarFile = new File(ECORE_PATH + ECORE_FILE_NAME.replace(".ecore", ".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + DEFAULT_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			generator.getResourceLoader().getResources().remove(xtextGrammar);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	/**
	 * Tests the generation of Xtext grammar from given ecore + YAML-based ecss
	 */
	@Test
	public void _4specific_testGenerateAndSerializeGrammarFileFileYamlStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);
			File xtextGrammarFile = new File(ECORE_PATH + ECORE_FILE_NAME.replace(".ecore", ".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + YAML_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			generator.getResourceLoader().getResources().remove(xtextGrammar);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	/**
	 * Tests the generation of Xtext grammar from given ecore + HUTN-based ecss
	 */
	@Test
	public void _4specific_testGenerateAndSerializeGrammarFileFileHutnStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);
			File xtextGrammarFile = new File(ECORE_PATH + ECORE_FILE_NAME.replace(".ecore", ".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + HUTN_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );		
			
			generator.getResourceLoader().getResources().remove(xtextGrammar);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	/**
	 * Tests the generation of Xtext grammar from given ecore + WsAware-based ecss
	 */
	@Test
	public void _4specific_testGenerateAndSerializeGrammarFileFileWsAwareStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);
			File xtextGrammarFile = new File(ECORE_PATH + ECORE_FILE_NAME.replace(".ecore", ".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + WSAWARE_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			generator.getResourceLoader().getResources().remove(xtextGrammar);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	

	/**
	 * ecore --> specific ecss-based xtext grammar (optimized)
	 */
	@Test
	@Ignore("grammar file optimization not supported in this framework version")
	public void _4specific_testGenerateOptimizedGrammarFileFile() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		File metamodelFile = new File(INPUT_DATA_FOLDER + OUTPUT_PATH + uniqueLanguageId + "/"
				+ uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
		try {
			Resource xtextGrammar = generator.generateGrammar(metamodelFile, true);
			xtextGrammar.save(new FileOutputStream(metamodelFile.getAbsolutePath()+".xtext"), Collections.emptyMap());
		
			generator.getResourceLoader().getResources().remove(xtextGrammar);
			logger.info("test completed!");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
	
	

	
	/**
	 * Tests the generation of Maven Tycho Xtext project skeleton containing MWE2 and Xtext file
	 */
	@Test
	public void _5_testGenerateLanguageProjectSkeleton() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			assertFalse( FileUtils.containsFileByName( outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext" ) );
			assertFalse( FileUtils.containsFileByName( outputPath.toFile(), "Generate" + outputPath.toFile().getName().toString() + ".mwe2" ) );
		
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
			
			assertTrue( FileUtils.containsFileByName( outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext" ) );
			assertTrue( FileUtils.containsFileByName( outputPath.toFile(), "Generate" + outputPath.toFile().getName().toString() + ".mwe2" ) );
			
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	/**
	 * Tests the execution of MWE2 workflow producing [languageName]StandaloneSetupGenerated.java (among others)
	 */
	@Test
	public void _5_testGenerateLanguageProjectAndRunWorkflow() {
		try {
			assertFalse( FileUtils.containsFileByName( outputPath.toFile(), outputPath.toFile().getName().toString() + "StandaloneSetupGenerated.java" ) );

			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
			projectCreator.runWorkflow();
			
			assertTrue( FileUtils.containsFileByName( outputPath.toFile(), outputPath.toFile().getName().toString() + "StandaloneSetupGenerated.java" ) );
			
			logger.info("test completed!");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	@Ignore("implement MavenTychoXtextProjectCreator.build() by use of build-in maven JAR instead of OS-installed maven")
	public void _5withBuild_testGenerateAndBuildLanguageProject() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
//			projectCreator.build();
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void _6_testGenerateEnhancedLanguageProject() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			MavenTychoXtextProjectCreator projectCreator = generator
					.generateEnhancedLanguageProject(outputPath.toFile());
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void _6withBuild_testGenerateAndBuildEnhancedLanguageProject() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			MavenTychoXtextProjectCreator projectCreator = generator
					.generateEnhancedLanguageProject(outputPath.toFile());
//			projectCreator.build();
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	public void _6_testGenerateDefaultGrammarAndLanguageProjectWithGrammarReplacement() {
		logger.info("Running test on " + uniqueLanguageId + " ...");
			
		try {
			File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);

			assertFalse( FileUtils.containsFileByName( outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext" ) );
			assertFalse( FileUtils.containsFileByName( outputPath.toFile(), "Generate" + outputPath.toFile().getName().toString() + ".mwe2" ) );
			
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
			CharSequence skeletonGrammar = FileUtils.read( FileUtils.findFirstFileByName(outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext") );

			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + DEFAULT_STYLE_NAME));
			projectCreator.replaceGrammar(outputPath.toString(), xtextGrammar); // <====
			CharSequence nonSkeletonGrammar = FileUtils.read( FileUtils.findFirstFileByName(outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext") );
			
			assertTrue( FileUtils.containsFileByName( outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext" ) );
			assertTrue( FileUtils.containsFileByName( outputPath.toFile(), "Generate" + outputPath.toFile().getName().toString() + ".mwe2" ) );
			assertFalse( skeletonGrammar.equals( nonSkeletonGrammar ) ); 
			
			generator.getResourceLoader().getResources().remove(xtextGrammar);		
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	@Ignore("TODO: SERIALIZE ecoreMetamodelFile and ADD it as referencedResource in MWE2 workflow !!!\n" + 
			"Otherwise, runWorkflow() will not succeed ! See MainLanguageResourceGenerator.generateAndSerializeGrammar(..)")
	public void _6_testGenerateDefaultGrammarAndLanguageProjectWithGrammarReplacementAndRunWorkflow() {
		logger.info("Running test on " + uniqueLanguageId + " ...");
			
		try {
			File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);

			assertFalse( FileUtils.containsFileByName( outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext" ) );
			assertFalse( FileUtils.containsFileByName( outputPath.toFile(), "Generate" + outputPath.toFile().getName().toString() + ".mwe2" ) );
			
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
			CharSequence skeletonGrammar = FileUtils.read( FileUtils.findFirstFileByName(outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext") );

			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + DEFAULT_STYLE_NAME));
			projectCreator.replaceGrammar(outputPath.toString(), xtextGrammar);
			projectCreator.runWorkflow(); // <====
			CharSequence nonSkeletonGrammar = FileUtils.read( FileUtils.findFirstFileByName(outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext") );
			
			assertTrue( FileUtils.containsFileByName( outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext" ) );
			assertTrue( FileUtils.containsFileByName( outputPath.toFile(), "Generate" + outputPath.toFile().getName().toString() + ".mwe2" ) );
			assertFalse( skeletonGrammar.equals( nonSkeletonGrammar ) ); 
			assertTrue( FileUtils.containsFileByName( outputPath.toFile(), outputPath.toFile().getName().toString() + "StandaloneSetupGenerated.java" ) );
			
			generator.getResourceLoader().getResources().remove(xtextGrammar);		
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("uk.ac.york.cs.ecss.api.MainLanguageResourceGeneratorStsExampleTest");
	}

}
