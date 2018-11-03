/**
 * 
 */
package uk.ac.york.cs.ecss.generator;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;

/**
 * @author blizzfire
 *
 */
public class BaseLanguageResourcesGeneratorTest {

	protected static final String languageProjectBaseName = "me.ecss.language";
	protected static final String LANGUAGE_NAME_PREFIX = "me.ecss.language";
	
	protected static final String ECORE_PATH = "/analysis/default-ecore/";
	protected static final String ECSS_PATH = "/analysis/ecss/";
	protected static final String XTEXT_INPUT_PATH = "/search/";
	protected static final String OUTPUT_PATH = "/generated/";

	protected static final String ECSSAL_MODEL_FILE_LOCATION = "/analysis/ecssal-analysis-model.xmi";
	protected static final String REPORT_FILE_LOCATION = "/analysis/language-resources-generator-report.txt";
	
	protected static final String METAMODEL_FILE_EXTENSION = "ecore";
	protected static final String GRAMMAR_FILE_EXTENSION = "xtext";
	protected static final String STYLE_FILE_EXTENSION = "ecss";
	
	protected static final String DEFAULT_POSTFIX = "_DEFAULT";
	protected static final String ENHANCED_POSTFIX = "_ENHANCED";
	protected static final String DEFAULT_ECSS_POSTFIX = "_ECSS_DEFAULT";

	protected static List<String> languageFileExtensions = new LinkedList<String>();
	
	@After
	public void tearDown() throws Exception {
	}

}
