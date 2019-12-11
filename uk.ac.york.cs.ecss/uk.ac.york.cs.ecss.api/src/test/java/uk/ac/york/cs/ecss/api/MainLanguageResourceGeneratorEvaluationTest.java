package uk.ac.york.cs.ecss.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import uk.ac.york.cs.ecss.create.project.creator.MavenTychoXtextProjectCreator;
import uk.ac.york.cs.ecss.migrated.EcoreKeywordConfig;
import uk.ac.york.cs.ecss.migrated.EcoreNameRelation;
import uk.ac.york.cs.ecss.migrated.EcoreNameRelationDistanceManager;
import uk.ac.york.cs.ecss.migrated.MultiExtensionResourceResolver;
import uk.ac.york.cs.ecss.utilities.FileUtils;

/**
 * WARNING: beware of the following !
 * 
 * 1) the first element (i.e. in the set of elements being iterated elements) does not produce a result.
 * As a workaround, make a copy of the first element (i.e. both xtext and ecore file) with a different name and re-execute.
 * 
 * 2) all tests in this class have to be executed rather than only a selection of tests. To do so, right-click on the class in the Package Explorer and select "Run as JUnit test".
 * 
 * 3) Both xtext and ecore file must have the same name (i.e. only difference is the file extension).
 * 
 * @author blizzfire
 *
 */
//@Ignore("to be executed manually")
@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainLanguageResourceGeneratorEvaluationTest extends BaseLanguageResourcesGeneratorTest {
	private static final Logger logger = LogManager.getLogger(MainLanguageResourceGeneratorEvaluationTest.class);

	protected static final String INPUT_DATA_FOLDER = "../../evaluation";
	protected static final String ECORE_PATH = INPUT_DATA_FOLDER + "/default-ecore/";

//	private static final String ECORE_FILE_NAME = "myDsl.ecore";
	private static final String LANGUAGE_FILE_EXTENSION = "myDsl";

	protected static final String XTEXT_INPUT_PATH = "/source-languages/";
	protected static final String STYLES_FOLDER = "../../styles/";
	protected static final String DEFAULT_STYLE_NAME = "default.ecss";
	protected static final String YAML_STYLE_NAME = "yaml.ecss";
	protected static final String HUTN_STYLE_NAME = "hutn.ecss";
	
	protected static final String WSAWARE_STYLE_NAME = "wsaware.ecss";
	protected static final String WSAWARE_BASIC_AO_UC_STYLE_NAME = "wsawarebasicaouc.ecss";
	protected static final String WSAWARE_BASIC_SQ_STYLE_NAME = "wsawarebasicsq.ecss";
	protected static final String WSAWARE_NO_AO_STYLE_NAME = "wsawarenoao.ecss";
	protected static final String WSAWARE_BASIC_AO_STYLE_NAME = "wsawarebasicao.ecss";
	protected static final String WSAWARE_NO_COMMENT_STYLE_NAME = "wsawarenocomment.ecss";
	protected static final String WSAWARE_NO_WS_STYLE_NAME = "wsawarenows.ecss";
	
	
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

	public MainLanguageResourceGeneratorEvaluationTest(File inputFile) {
		uniqueLanguageId = com.google.common.io.Files.getNameWithoutExtension(inputFile.toString());
		languageName = LANGUAGE_NAME_PREFIX + "." + uniqueLanguageId;
		outputPath = Paths.get(INPUT_DATA_FOLDER + OUTPUT_PATH + uniqueLanguageId + "/");
		try {
//			FileUtils.deleteDirectory(outputPath);
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
	@Ignore("remove @Ignore when feature implemented")
	public void _1_testGenerateMetamodel() {
		logger.info("RUNNING: _1_testGenerateMetamodel");
		try {
			Resource ecoreMetamodel = generator.generateMetamodel(
					new File(INPUT_DATA_FOLDER + XTEXT_INPUT_PATH + uniqueLanguageId + "." + GRAMMAR_FILE_EXTENSION));
			ecoreMetamodel.save(Collections.emptyMap());
			
//			generator.getResourceLoader().getResources().remove(ecoreMetamodel);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	public void _2_testGenerateAndSerialiseDefaultGrammar() {
		logger.info("RUNNING: _2_testGenerateDefaultGrammar: " + uniqueLanguageId);

		try {
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
			Resource xtextGrammar = generator.generateAndSerialiseDefaultGrammarResource(metamodelFile);
			File xtextGrammarFile = new File(metamodelFile.getAbsolutePath().replace(".ecore", "_DEFAULT.xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			//generator.getResourceLoader().getResources().remove(xtextGrammar);
					
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
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
			File xtextGrammarFile = new File(metamodelFile.getAbsolutePath().replace(".ecore", ".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile);
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
	
			//generator.getResourceLoader().getResources().remove(xtextGrammar);
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
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
			File xtextGrammarFile = new File(metamodelFile.getAbsolutePath().replace(".ecore", "_" + DEFAULT_STYLE_NAME +".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + DEFAULT_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			//generator.getResourceLoader().getResources().remove(xtextGrammar);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	/**
	 * Tests the generation of Xtext grammar from given ecore + YAML-based ecss
	 */
	@Test
	@Ignore
	public void _4specific_testGenerateAndSerializeGrammarFileFileYamlStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
			File xtextGrammarFile = new File(metamodelFile.getAbsolutePath().replace(".ecore", "_" + YAML_STYLE_NAME +".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + YAML_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			//generator.getResourceLoader().getResources().remove(xtextGrammar);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	/**
	 * Tests the generation of Xtext grammar from given ecore + HUTN-based ecss
	 */
	@Test
	@Ignore
	public void _4specific_testGenerateAndSerializeGrammarFileFileHutnStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
			File xtextGrammarFile = new File(metamodelFile.getAbsolutePath().replace(".ecore", "_" + HUTN_STYLE_NAME +".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + HUTN_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );		
			
			//generator.getResourceLoader().getResources().remove(xtextGrammar);
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	@Test
	public void _4specific_testGenerateAndSerializeGrammarFileFileWsAwareBasicAoStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
			File xtextGrammarFile = new File(metamodelFile.getAbsolutePath().replace(".ecore", "_" + WSAWARE_BASIC_AO_STYLE_NAME +".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + WSAWARE_BASIC_AO_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			//generator.getResourceLoader().getResources().remove(xtextGrammar);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Test
	public void _4specific_testGenerateAndSerializeGrammarFileFileWsAwareBasicAoUcStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
			File xtextGrammarFile = new File(metamodelFile.getAbsolutePath().replace(".ecore", "_" + WSAWARE_BASIC_AO_UC_STYLE_NAME +".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + WSAWARE_BASIC_AO_UC_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			//generator.getResourceLoader().getResources().remove(xtextGrammar);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	@Test
	public void _4specific_testGenerateAndSerializeGrammarFileFileWsAwareBasicSqStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
			File xtextGrammarFile = new File(metamodelFile.getAbsolutePath().replace(".ecore", "_" + WSAWARE_BASIC_SQ_STYLE_NAME +".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + WSAWARE_BASIC_SQ_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			//generator.getResourceLoader().getResources().remove(xtextGrammar);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	@Test
	public void _4specific_testGenerateAndSerializeGrammarFileFileWsAwareNoAoStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
			File xtextGrammarFile = new File(metamodelFile.getAbsolutePath().replace(".ecore", "_" + WSAWARE_NO_AO_STYLE_NAME +".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + WSAWARE_NO_AO_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			//generator.getResourceLoader().getResources().remove(xtextGrammar);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	@Test
	public void _4specific_testGenerateAndSerializeGrammarFileFileWsAwareNoCommentStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
			File xtextGrammarFile = new File(metamodelFile.getAbsolutePath().replace(".ecore", "_" + WSAWARE_NO_COMMENT_STYLE_NAME +".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + WSAWARE_NO_COMMENT_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			//generator.getResourceLoader().getResources().remove(xtextGrammar);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	@Test
	public void _4specific_testGenerateAndSerializeGrammarFileFileWsAwareNoWsStyle() {
		logger.info("Running test on " + uniqueLanguageId + " ...");

		try {
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);
			File xtextGrammarFile = new File(metamodelFile.getAbsolutePath().replace(".ecore", "_" + WSAWARE_NO_WS_STYLE_NAME +".xtext"));

			assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + WSAWARE_NO_WS_STYLE_NAME));
			assertTrue( Files.exists( Paths.get( xtextGrammar.getURI().toString() ) ) );
			
			//generator.getResourceLoader().getResources().remove(xtextGrammar);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	@Test
	public void _6_testGenerateDefaultGrammarAndLanguageProjectWithGrammarReplacement() {
		logger.info("Running test on " + uniqueLanguageId + " ...");
			
		try {
			File metamodelFile = new File(ECORE_PATH + uniqueLanguageId + "." + METAMODEL_FILE_EXTENSION);

			//assertFalse( FileUtils.containsFileByName( outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext" ) );
			//assertFalse( FileUtils.containsFileByName( outputPath.toFile(), "Generate" + outputPath.toFile().getName().toString() + ".mwe2" ) );
			
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
			CharSequence skeletonGrammar = FileUtils.read( FileUtils.findFirstFileByName(outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext") );

			Resource xtextGrammar = generator.generateAndSerializeGrammar(metamodelFile, new File(STYLES_FOLDER + DEFAULT_STYLE_NAME));
			projectCreator.replaceGrammar(outputPath.toString(), xtextGrammar); // <====
			CharSequence nonSkeletonGrammar = FileUtils.read( FileUtils.findFirstFileByName(outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext") );
			
			assertTrue( FileUtils.containsFileByName( outputPath.toFile(), outputPath.toFile().getName().toString() + ".xtext" ) );
			assertTrue( FileUtils.containsFileByName( outputPath.toFile(), "Generate" + outputPath.toFile().getName().toString() + ".mwe2" ) );
			assertFalse( skeletonGrammar.equals( nonSkeletonGrammar ) ); 
			
			//generator.getResourceLoader().getResources().remove(xtextGrammar);		
			logger.info("test completed!");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("uk.ac.york.cs.ecss.api.MainLanguageResourceGeneratorDataTest");
	}

}
