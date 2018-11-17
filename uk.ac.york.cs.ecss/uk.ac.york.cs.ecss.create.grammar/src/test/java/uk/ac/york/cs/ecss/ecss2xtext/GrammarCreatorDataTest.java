/**
 *
 */
package uk.ac.york.cs.ecss.ecss2xtext;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Path;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import uk.ac.york.cs.ecss.utilities.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Transformer for: ecore + ecss(l) --> xtext
 *
 * in case of failure stating: The accumulated size of entities is "50,000,001"
 * that exceeded the "50,000,000" limit set by "FEATURE_SECURE_PROCESSING" ...
 * ... run with the following Java VM arguments:
 * -DentityExpansionLimit=2147480000 -DtotalEntitySizeLimit=2147480000
 * -Djdk.xml.totalEntitySizeLimit=2147480000
 *
 * @author blizzfire
 *
 */
@RunWith(Parameterized.class)
@Ignore("to be executed manually")
public class GrammarCreatorDataTest {
	
	private static final Logger logger = LogManager.getLogger(GrammarCreatorDataTest.class);

	protected static final String INPUT_DATA_FOLDER = "../../data";

	private String uniqueLanguageId;

	private Path outputPath;
	private String languageName;

	private static String ECORE_INPUT_PATH = "/analysis/default-ecore/";
	private static String ECSS_INPUT_PATH = "/analysis/ecss/";

	private static String DEFAULT_ECSS = "../../styles/default.ecss";

	private static String XTEXT_OUTUT_PATH = "/generated/";

	private static String REPORT_FILE_LOCATION = "/analysis/ecss-to-xtext-report.txt";
	protected static final String languageProjectBaseName = "me.ecss.language";
	protected static final String LANGUAGE_NAME_PREFIX = "me.ecss.language";

	protected static final String ECORE_PATH = "/analysis/default-ecore/";
	protected static final String ECSS_PATH = "/analysis/ecss/";
	protected static final String XTEXT_INPUT_PATH = "/search/";
	protected static final String OUTPUT_PATH = "/generated/";

	protected static final String METAMODEL_FILE_EXTENSION = "ecore";
	protected static final String GRAMMAR_FILE_EXTENSION = "xtext";
	protected static final String STYLE_FILE_EXTENSION = "ecss";

	protected static List<String> languageFileExtensions = new LinkedList<String>();

	private static int fromIndexInclusive;

	private static int toIndexExclusive;

	private void runGrammarGenerator(String baseFolder, String ecoreFileName, String ecssFileName) throws IOException {
		File ecoreFile = new File(baseFolder + XTEXT_OUTUT_PATH + Path.SEPARATOR + ecoreFileName + Path.SEPARATOR
				+ ecoreFileName + "_DEFAULT." + METAMODEL_FILE_EXTENSION);
		File ecssFile = new File(baseFolder + XTEXT_OUTUT_PATH + Path.SEPARATOR + ecssFileName + Path.SEPARATOR
				+ ecssFileName + "." + STYLE_FILE_EXTENSION);
		File xtextFile = new File(
				baseFolder + XTEXT_OUTUT_PATH + ecoreFileName + Path.SEPARATOR + ecoreFileName + "." + GRAMMAR_FILE_EXTENSION);
		try {
			if (xtextFile.exists()) {
				return;
			}

			// FIXME: to be replaced to match new ECSS implementation
//			GrammarCreator grammarCreator = new GrammarCreator(baseFolder + REPORT_FILE_LOCATION, ECSSAL_MODEL_FILE_LOCATION, ecoreFile, ecssFile,
//					xtextFile);
//			grammarCreator.generateGrammar();
		} catch (Exception e) {
			e.printStackTrace();
			if (!xtextFile.exists()) {
				try {
					FileOutputStream fos = new FileOutputStream(xtextFile);
					fos.flush();
					fos.close();
				} catch (Exception e2) {}
			}
			throw e;
		}
	}

	@Parameters
	public static List<File> data() {
		File dataFolder = new File(INPUT_DATA_FOLDER + Path.SEPARATOR + XTEXT_INPUT_PATH);
		File[] dataFolderFileArray = FileUtils.getListOfAcceptedFiles(dataFolder, GRAMMAR_FILE_EXTENSION);
		// constraint the range of instances
		fromIndexInclusive = 0;
		toIndexExclusive = dataFolderFileArray.length;
		return Arrays.asList(dataFolderFileArray).subList(fromIndexInclusive, toIndexExclusive);
	}

	public GrammarCreatorDataTest(File inputFile) {
		uniqueLanguageId = com.google.common.io.Files.getNameWithoutExtension(inputFile.toString());
		languageName = LANGUAGE_NAME_PREFIX + "." + uniqueLanguageId;
		outputPath = new Path(INPUT_DATA_FOLDER + OUTPUT_PATH + uniqueLanguageId);
	}

	@Before
	public void setUp() throws Exception {
		languageFileExtensions.add("mydsl");
		File reportFile = new File(INPUT_DATA_FOLDER + REPORT_FILE_LOCATION);
		// File analysisModelFile = new File(INPUT_DATA_FOLDER +
		// ECSSAL_MODEL_FILE_LOCATION);
		logger.debug("Running " + this.getClass().getName() + "( " + uniqueLanguageId + " )");
	}

	@Test
	public void test() throws Exception {
		String ecoreFileName = uniqueLanguageId;
		String ecssFileName = uniqueLanguageId;

		runGrammarGenerator(INPUT_DATA_FOLDER, ecoreFileName, ecssFileName);
	}

}
