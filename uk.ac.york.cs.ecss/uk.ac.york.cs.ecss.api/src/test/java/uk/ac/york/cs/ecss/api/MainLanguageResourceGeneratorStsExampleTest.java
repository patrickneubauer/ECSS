package uk.ac.york.cs.ecss.api;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
public class MainLanguageResourceGeneratorStsExampleTest extends BaseLanguageResourcesGeneratorTest {

	private static final String ECORE_FILE_NAME = "spacetransportationservice.ecore";
	private static final String LANGUAGE_FILE_EXTENSION = "sts";
	private static final String LANGUAGE_NAME_PREFIX = "uk.ac.york.cs.ecss.examples.spacetransportationservice";
	private static final String languageProjectBaseName = LANGUAGE_NAME_PREFIX;

	private static final Logger logger = LogManager.getLogger(MainLanguageResourceGeneratorStsExampleTest.class);

	protected static final String INPUT_DATA_FOLDER = "../../sts-example";
	protected static final String XTEXT_INPUT_PATH = "/grammar-variations/";
	protected static final String ECORE_PATH = INPUT_DATA_FOLDER + "/meta-modelling/spacetransportationservice/model/";
	protected static final String ECSS_LANGUAGE_OTHER_MODELS_PATH = "../uk.ac.york.cs.ecss.language.parent/uk.ac.york.cs.ecss.language/model/other/";
	
	protected static final String STYLES_FOLDER = "../../styles/";
	protected static final String DEFAULT_STYLE_NAME = "default.ecss";
	
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

	public MainLanguageResourceGeneratorStsExampleTest(File inputFile) {
		uniqueLanguageId = com.google.common.io.Files.getNameWithoutExtension(inputFile.toString());
		languageName = LANGUAGE_NAME_PREFIX + "." + uniqueLanguageId;
		outputPath = Paths.get(INPUT_DATA_FOLDER + OUTPUT_PATH + uniqueLanguageId + "/");
		try {
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
			Resource xtextGrammar = generator.generateAndSerialiseDefaultGrammarResource(new File(ECORE_PATH + ECORE_FILE_NAME));
	
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
	 * ecore --> default ecss-based xtext grammar
	 */
	@Test
	public void _4default_testGenerateAndSerializeGrammarFile() {
		logger.info("Running test on " + uniqueLanguageId + " ...");
		
		File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);
		try {
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile);
	
			generator.getResourceLoader().getResources().remove(xtextGrammar);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * ecore --> specific ecss-based xtext grammar
	 */
	@Test
	@Ignore("TEMP")
	public void _4specific_testGenerateAndSerializeGrammarFileFile() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);
		try {
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + DEFAULT_STYLE_NAME));
		
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

	@Test
	@Ignore("TEMP")
	public void _5_testGenerateLanguageProject() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	@Test
	public void _5_testGenerateLanguageProjectAndRunWorkflow() {
		try {
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
			projectCreator.runWorkflow();
			logger.info("test completed!");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	@Ignore("temporarily")
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
			CharSequence xtextGrammar = generator.generateDefaultGrammarCharSequence(new File(ECORE_PATH + ECORE_FILE_NAME));
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
			
			projectCreator.replaceGrammar(outputPath.toString(), xtextGrammar);
			
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("uk.ac.york.cs.ecss.api.MainLanguageResourceGeneratorStsExampleTest");
	}

}
