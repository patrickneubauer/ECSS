package uk.ac.york.cs.ecss.generator;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Path;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import uk.ac.york.cs.ecss.create.language.project.creator.MavenTychoXtextProjectCreator;
import uk.ac.york.cs.ecss.helper.AnalysisModelHelper;
import uk.ac.york.cs.ecss.helper.FileUtils;

@Ignore("to be executed manually")
@RunWith(Parameterized.class)
public class MainLanguageResourceGeneratorPreEvaluationTest extends BaseLanguageResourcesGeneratorTest {
	private static final Logger logger = LogManager.getLogger(MainLanguageResourceGeneratorPreEvaluationTest.class);

	protected static final String INPUT_DATA_FOLDER = "../../../ECSS-DATA";
	
	private String uniqueLanguageId;

	private static Path outputPath;
	private static String languageName;

	private static LanguageResourcesGenerator generator;

	private static File[] dataFolderFileArrays;

	private static File reportFile;

	/**
	 * executed ONCE 
	 * 
	 * @return
	 */
	@Parameters
	public static List<File> data() {
		File dataFolder = new File(INPUT_DATA_FOLDER + Path.SEPARATOR + XTEXT_INPUT_PATH);
		dataFolderFileArrays = FileUtils.getListOfAcceptedFiles(dataFolder, GRAMMAR_FILE_EXTENSION);
		return Arrays.asList(dataFolderFileArrays);
	}

	/**
	 * executed on EVERY PARAMETER
	 */
	public MainLanguageResourceGeneratorPreEvaluationTest(File inputFile) {
		uniqueLanguageId = com.google.common.io.Files.getNameWithoutExtension(inputFile.toString());
		languageName = LANGUAGE_NAME_PREFIX + "." + uniqueLanguageId;
		outputPath = new Path(INPUT_DATA_FOLDER + OUTPUT_PATH + uniqueLanguageId);
		logger.info("Running " + this.getClass().getName() + "( " + uniqueLanguageId + " )");
	}

	/**
	 * executed on EVERY PARAMETER
	 */
	@Before
	public void setUp() throws Exception {
		languageFileExtensions.add("mydsl");

		reportFile = new File(INPUT_DATA_FOLDER + REPORT_FILE_LOCATION);
		generator = new MainLanguageResourcesGenerator(reportFile, outputPath, AnalysisModelHelper.UNDEFINED_ANALYSIS_MODEL_LOCATION_PLACEHOLDER_STRING,
				languageProjectBaseName, languageName, languageFileExtensions);
	}
	
	/**
	 * executed on EVERY PARAMETER
	 * 
	 * (!) remove @Ignore before running manually
	 * (!) fill out targetProjectRootLocation, grammarCharSequence, and workflowCharSequence
	 */
	@Test
	@Ignore("to be executed manually")
	public void testGenerateAndBuildLanguageProject() {
		try {
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
			
			String targetProjectRootLocation = null;
			CharSequence grammarCharSequence = null;
			CharSequence workflowCharSequence = null;

			projectCreator.replaceGrammar(targetProjectRootLocation, grammarCharSequence);
			projectCreator.replaceWorkflow(targetProjectRootLocation, workflowCharSequence);
			projectCreator.build();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
