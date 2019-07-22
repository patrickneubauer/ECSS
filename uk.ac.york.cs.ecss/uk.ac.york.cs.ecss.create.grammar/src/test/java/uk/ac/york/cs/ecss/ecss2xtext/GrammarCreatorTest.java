/**
 *
 */
package uk.ac.york.cs.ecss.ecss2xtext;

import org.eclipse.core.runtime.Path;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;


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
//@Ignore("to be executed in Eclipse")
public class GrammarCreatorTest {

	private static final String ECSS_FILE_EXTENSION = ".ecss";
	private static final String ECORE_FILE_EXTENSION = ".ecore";
	private static final String XTEXT_FILE_EXTENSION = ".xtext";

	private static String DATA_FOLDER = "../../../ECSS-DATA";
	private static String DATA_EXAMPLE_FOLDER = "../../data-example";

	private static String ECORE_INPUT_PATH = "/analysis/default-ecore/";
	private static String ECSS_INPUT_PATH = "/analysis/ecss/";

	private static String DEFAULT_ECSS = "../../styles/default.ecss";

	private static String XTEXT_OUTUT_PATH = "/generated/";

	private static String ECSSAL_MODEL_FILE_LOCATION = "/analysis/ecssal-analysis-model.xmi";
	private static boolean USE_ANALYSIS_FILE = true;
	private static boolean USE_SUBPATH = true;
	private static String REPORT_FILE_LOCATION = "/analysis/ecss-to-xtext-report.txt";

	private void runGrammarGenerator(String baseFolder, String ecoreFileName, String ecssFileName) throws IOException {
		File ecoreFile = new File(baseFolder + ECORE_INPUT_PATH + ecoreFileName + ECORE_FILE_EXTENSION);
		File ecssFile = new File(baseFolder + ECSS_INPUT_PATH + ecssFileName + ECSS_FILE_EXTENSION);
		File xtextFile = new File(baseFolder + XTEXT_OUTUT_PATH + (USE_SUBPATH?(ecoreFileName + Path.SEPARATOR):"") + ecoreFileName + XTEXT_FILE_EXTENSION);
		System.out.println("ECSS file "+ecssFile.getCanonicalPath()+": "+ecssFile.exists());
		String analysisFile =  baseFolder + ECSSAL_MODEL_FILE_LOCATION;
		if (!USE_ANALYSIS_FILE) {
			// not supported in this framework version
		}
		// FIXME: to be replaced to match new ECSS implementation
//		GrammarCreator grammarCreator = new GrammarCreator(baseFolder + REPORT_FILE_LOCATION, analysisFile, ecoreFile, ecssFile, xtextFile);
//		grammarCreator.generateGrammar();
//		grammarCreator.serializeAnalysisModel();
	}

	@Test
	// @Ignore
	public void testExampleData() throws Exception {
		String ecoreFileName = "SimpleCarModel";
		String ecssFileName = "default";

		runGrammarGenerator(DATA_EXAMPLE_FOLDER, ecoreFileName, ecssFileName);
	}
	

	@Test
	// @Ignore
	public void testExampleHutn() throws Exception {
		String ecoreFileName = "SimpleCarModel";
		String ecssFileName = "hutn";

		runGrammarGenerator(DATA_EXAMPLE_FOLDER, ecoreFileName, ecssFileName);
	}


	@Test
	// @Ignore
	public void grammarCreatorCarLanguageTest() throws Exception {
		String ecoreFileName = "SimpleCarModel";
		String ecssFileName = "default";

		runGrammarGenerator(DATA_EXAMPLE_FOLDER, ecoreFileName, ecssFileName);
	}	

	@Test
	// @Ignore
	public void grammarCreatorCarLanguageMergedTest() throws Exception {
		String ecoreFileName = "SimpleCarModel";
		String ecssFileName = "default_merged";

		runGrammarGenerator(DATA_EXAMPLE_FOLDER, ecoreFileName, ecssFileName);
	}	
	
	@Test
	@Ignore
	public void grammarCreatorSpecificRouterLanguageTest() throws Exception {
		String ecoreFileName = "Router"; 
		String ecssFileName = "Router";
		
		runGrammarGenerator(DATA_EXAMPLE_FOLDER, ecoreFileName, ecssFileName);
	}

	@Test
	// @Ignore
	public void grammarCreatorHeroLanguageTest() throws Exception {
		String ecoreFileName = "HeroLanguage_1";
		String ecssFileName = "default";

		runGrammarGenerator(DATA_EXAMPLE_FOLDER, ecoreFileName, ecssFileName);
	}

	@Test
	// @Ignore
	public void grammarCreatorWMLLanguageTest() throws Exception {
		String ecoreFileName = "WML_6";
		String ecssFileName = "WML_6";

		runGrammarGenerator(DATA_EXAMPLE_FOLDER, ecoreFileName, ecssFileName);
	}

	@Test
	public void grammarCreatorRouterLanguageTest() throws Exception {
		String ecoreFileName = "Router";
		String ecssFileName = "default";

		runGrammarGenerator(DATA_EXAMPLE_FOLDER, ecoreFileName, ecssFileName);
	}
	
	@Test
	public void grammarCreatorRouterJsonLanguageTest() throws Exception {
		String ecoreFileName = "Router";
		String ecssFileName = "json";

		runGrammarGenerator(DATA_EXAMPLE_FOLDER, ecoreFileName, ecssFileName);
	}
	
	@Test
	@Ignore("requires cloned ECSS-DATA repository")
	public void generateGrammarFolderTest() throws Exception {
		String ecssFileName = "hutn";
		String inputEcore = DATA_FOLDER+"/PREPARED/PP_1/TOP-25-COMBINED/";
		ECORE_INPUT_PATH = "/DEFAULT-ECORE/";
		XTEXT_OUTUT_PATH = "/PREPARED/PP_1/TOP-25-COMBINED/generated_"+ecssFileName+"/";
		USE_SUBPATH = false;
		new File(XTEXT_OUTUT_PATH).mkdirs();
		USE_ANALYSIS_FILE = false;
		File folder = new File(inputEcore+ECORE_INPUT_PATH);
		System.out.println("In folder: "+folder.getAbsolutePath());
		for (File file: folder.listFiles()) {
			String firstName = file.getName();
			if (file.getName().lastIndexOf('.') != -1) {
				firstName = firstName.substring(0,firstName.lastIndexOf('.'));
			}
			try {
				runGrammarGenerator(inputEcore, firstName, ecssFileName);
			} catch (Exception e) {
				System.err.println("Could not generate grammar for "+firstName+": "+e.getMessage());
				e.printStackTrace();
			}
		}
	}
	


}
