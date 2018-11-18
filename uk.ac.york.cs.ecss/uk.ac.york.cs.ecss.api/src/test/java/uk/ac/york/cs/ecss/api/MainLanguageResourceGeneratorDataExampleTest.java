package uk.ac.york.cs.ecss.api;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
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
import uk.ac.york.cs.ecss.migrated.EcoreResourceLoader;
import uk.ac.york.cs.ecss.migrated.ResourceResolver;
import uk.ac.york.cs.ecss.utilities.FileUtils;

//@Ignore("to be executed manually")
@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainLanguageResourceGeneratorDataExampleTest extends BaseLanguageResourcesGeneratorTest {
	private static final Logger logger = LogManager.getLogger(MainLanguageResourceGeneratorDataExampleTest.class);

	protected static final String INPUT_DATA_FOLDER = "../../data-example";

	private String uniqueLanguageId;

	private Path outputPath;
	private String languageName;

	private static MainLanguageResourcesGenerator generator;

	private static File reportFile;

	@Parameters
	public static List<File> data() {
		File dataFolder = new File(INPUT_DATA_FOLDER + Path.SEPARATOR + XTEXT_INPUT_PATH);
		File[] dataFolderFileArray = FileUtils.getListOfAcceptedFiles(dataFolder, GRAMMAR_FILE_EXTENSION);
		return Arrays.asList(dataFolderFileArray);
	}

	public MainLanguageResourceGeneratorDataExampleTest(File inputFile) {
		uniqueLanguageId = com.google.common.io.Files.getNameWithoutExtension(inputFile.toString());
		languageName = LANGUAGE_NAME_PREFIX + "." + uniqueLanguageId;
		outputPath = new Path(INPUT_DATA_FOLDER + OUTPUT_PATH + uniqueLanguageId);

		generator.setLanguageName(languageName);
		generator.setOutputPath(outputPath);

		logger.info("Running " + this.getClass().getName() + "( " + uniqueLanguageId + " )");
	}

	@BeforeClass
	public static void setUp() throws Exception {
		languageFileExtensions.add("mydsl");
		reportFile = new File(INPUT_DATA_FOLDER + REPORT_FILE_LOCATION);

		generator = new MainLanguageResourcesGenerator(reportFile, new Path(""), 
				languageProjectBaseName, "", languageFileExtensions);
		ResourceResolver ecssResolver = ResourceResolver.get(new File(INPUT_DATA_FOLDER+OUTPUT_PATH),
				"","ecss", true);
		generator.setEcssResolver(ecssResolver);
		ResourceResolver ecoreResolver = ResourceResolver.get(new File(INPUT_DATA_FOLDER+OUTPUT_PATH),
				"","ecore", true);
		EcoreResourceLoader loader = new EcoreResourceLoader(ecoreResolver);
		loader.loadAll();
		EcoreKeywordConfig config = new EcoreKeywordConfig();
		config.useKeywords = true;
		EcoreNameRelation relation = new EcoreNameRelation(reportFile.getAbsolutePath(), loader.getResources(), 
				loader.getResourceSet(), config);
		EcoreNameRelationDistanceManager man = new EcoreNameRelationDistanceManager(loader, relation);
		generator.initEcoreUtil(loader, man);
		
	}

	@Test
	public void _1_testGenerateMetamodel() {
		logger.info("RUNNING: _1_testGenerateMetamodel");
		try {
			Resource ecoreMetamodel = generator.generateMetamodel(
					new File(INPUT_DATA_FOLDER + XTEXT_INPUT_PATH + uniqueLanguageId + "." + GRAMMAR_FILE_EXTENSION));
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void _1_testGenerateEnhancedMetamodel() {
		logger.info("RUNNING: testGenerateEnhancedMetamodel: " + uniqueLanguageId);
		try {
			Resource ecoreMetamodel = generator.generateEnhancedMetamodel(new File(INPUT_DATA_FOLDER + XTEXT_INPUT_PATH
					+ uniqueLanguageId + ENHANCED_POSTFIX + "." + GRAMMAR_FILE_EXTENSION));
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	public void _2_testGenerateDefaultGrammar() {
		logger.info("RUNNING: _2_testGenerateDefaultGrammar: " + uniqueLanguageId);

		try {
			Resource xtextGrammar = generator.generateDefaultGrammar(new File(INPUT_DATA_FOLDER + OUTPUT_PATH
					+ uniqueLanguageId + Path.SEPARATOR + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION));
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
		logger.info("RUNNING: _3convenience_testGenerateStyleModelFile: " + uniqueLanguageId);

		try {
			Resource ecssModel = generator.generateStyleModel(new File(INPUT_DATA_FOLDER + OUTPUT_PATH
					+ uniqueLanguageId + Path.SEPARATOR + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION));
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * ecore --> specific xtext grammar-based ecss style (optimized)
	 */
	@Test
//	@Ignore("remove @Ignore when feature implemented")
	public void _3optimized_testGenerateStyleModelFileBooleanTrue() {
		logger.info(
				"RUNNING: _3optimized_testGenerateStyleModelFileBooleanTrue: " + uniqueLanguageId);

		try {
			Resource ecssModel = generator.generateStyleModel(new File(INPUT_DATA_FOLDER + OUTPUT_PATH
					+ uniqueLanguageId + Path.SEPARATOR + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION), true);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * ecore --> specific xtext grammar-based ecss style (non-optimized)
	 */
	@Test
	public void _3_testGenerateStyleModelFileBooleanFalse() {
		logger.info("RUNNING: _3_testGenerateStyleModelFileBooleanFalse: " + uniqueLanguageId);

		try {
			Resource ecssModel = generator.generateStyleModel(new File(INPUT_DATA_FOLDER + OUTPUT_PATH
					+ uniqueLanguageId + Path.SEPARATOR + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION), false);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * ecore --> default ecss-based xtext grammar
	 */
	@Test
	public void _4default_testGenerateGrammarFile() {
		logger.info("RUNNING: _4default_testGenerateGrammarFile: " + uniqueLanguageId);
		try {
			Resource xtextGrammar = generator.generateGrammar(new File(INPUT_DATA_FOLDER + OUTPUT_PATH
					+ uniqueLanguageId + Path.SEPARATOR + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION));
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * ecore --> specific ecss-based xtext grammar
	 */
	@Test
	public void _4specific_testGenerateGrammarFileFile() {
		logger.info("RUNNING: _4specific_testGenerateGrammarFileFile: " + uniqueLanguageId);

		File metamodelFile = new File(INPUT_DATA_FOLDER + OUTPUT_PATH + uniqueLanguageId + Path.SEPARATOR
				+ uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
		try {
			Resource xtextGrammar = generator.generateGrammar(metamodelFile, new File(INPUT_DATA_FOLDER + OUTPUT_PATH
					+ uniqueLanguageId + Path.SEPARATOR + uniqueLanguageId + "." + STYLE_FILE_EXTENSION));
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
		logger.info("RUNNING: _4specific_testGenerateOptimizedGrammarFileFile: " + uniqueLanguageId);

		File metamodelFile = new File(INPUT_DATA_FOLDER + OUTPUT_PATH + uniqueLanguageId + Path.SEPARATOR
				+ uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
		try {
			Resource xtextGrammar = generator.generateGrammar(metamodelFile, true);
			xtextGrammar.save(new FileOutputStream(metamodelFile.getAbsolutePath()+".xtext"), Collections.emptyMap());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

	@Test
	public void _5_testGenerateLanguageProject() {
		logger.info("RUNNING: _5_testGenerateLanguageProject: " + uniqueLanguageId);

		try {
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	@Test
	public void _5_testGenerateLanguageProjectAndRunWorkflow() {
		try {
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
			projectCreator.runWorkflow();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	@Ignore("temporarily")
	public void _5withBuild_testGenerateAndBuildLanguageProject() {
		logger.info(
				"RUNNING: _5withBuild_testGenerateAndBuildLanguageProject: " + uniqueLanguageId);

		try {
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
//			projectCreator.build();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void _6_testGenerateEnhancedLanguageProject() {
		logger.info("RUNNING: _6_testGenerateEnhancedLanguageProject: " + uniqueLanguageId);

		try {
			MavenTychoXtextProjectCreator projectCreator = generator
					.generateEnhancedLanguageProject(outputPath.toFile());
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void _6withBuild_testGenerateAndBuildEnhancedLanguageProject() {
		logger.info(
				"RUNNING: _6withBuild_testGenerateAndBuildEnhancedLanguageProject: " + uniqueLanguageId);

		try {
			MavenTychoXtextProjectCreator projectCreator = generator
					.generateEnhancedLanguageProject(outputPath.toFile());
//			projectCreator.build();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("uk.ac.york.cs.ecss.api.MainLanguageResourceGeneratorDataTest");
	}

}
