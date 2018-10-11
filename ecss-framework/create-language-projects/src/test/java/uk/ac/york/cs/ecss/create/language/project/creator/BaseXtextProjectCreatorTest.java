package uk.ac.york.cs.ecss.create.language.project.creator;

import static org.junit.Assert.fail;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BaseXtextProjectCreatorTest {

	protected static final String LANGUAGE_GRAMMAR_URI_PREFIX = "me.ecss.language";
	protected static final String LANGUAGE_FILE_EXTENSION = "mydsl";
	
	protected static String REPORT_FILE_LOCATION = "generated/create-language-projects-report.txt";

	private static String DATA_FOLDER = "../../data/";
	protected static String EXAMPLE_DATA_FOLDER = "../../data-example/";
	
	private static String ECSSAL_MODEL_FILE_LOCATION = "analysis/ecssal-analysis-model.xmi";
	
	protected static String TRANSFORMATION_INPUT_PATH = "analysis/default-ecore";
	protected static String TRANSFORMATION_OUTPUT_PATH = "generated";
	
	protected static final String INPUT_FILE_EXTENSION = ".ecore";

	public BaseXtextProjectCreatorTest() {
		super();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testHeroLanguage_1() {
		String languageShortName = "HeroLanguage_1";
		String projectBaseName = LANGUAGE_GRAMMAR_URI_PREFIX; 
		String languageName = LANGUAGE_GRAMMAR_URI_PREFIX + "." + languageShortName;
		
		String inputFile = EXAMPLE_DATA_FOLDER + TRANSFORMATION_INPUT_PATH + Path.SEPARATOR + languageShortName + INPUT_FILE_EXTENSION;
		String outputLocation = EXAMPLE_DATA_FOLDER + TRANSFORMATION_OUTPUT_PATH + Path.SEPARATOR + languageShortName;
		List<String> fileExtensions = new LinkedList<String>();
		fileExtensions.add(LANGUAGE_FILE_EXTENSION);
		
		BaseXtextProjectCreator projectCreator = new BaseXtextProjectCreator(EXAMPLE_DATA_FOLDER + REPORT_FILE_LOCATION, projectBaseName, languageName, fileExtensions);
		projectCreator.prepareDestination(outputLocation);
		try {
			projectCreator.create(outputLocation);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testRouterLanguage() {
		String languageShortName = "Router";
		String projectBaseName = LANGUAGE_GRAMMAR_URI_PREFIX; 
		String languageName = LANGUAGE_GRAMMAR_URI_PREFIX + "." + languageShortName;
		
		String inputFile = EXAMPLE_DATA_FOLDER + TRANSFORMATION_INPUT_PATH + Path.SEPARATOR + languageShortName + INPUT_FILE_EXTENSION;
		String outputLocation = EXAMPLE_DATA_FOLDER + TRANSFORMATION_OUTPUT_PATH + Path.SEPARATOR + languageShortName;
		List<String> fileExtensions = new LinkedList<String>();
		fileExtensions.add(LANGUAGE_FILE_EXTENSION);
		
		BaseXtextProjectCreator projectCreator = new BaseXtextProjectCreator(EXAMPLE_DATA_FOLDER + REPORT_FILE_LOCATION, projectBaseName, languageName, fileExtensions);
		projectCreator.prepareDestination(outputLocation);
		try {
			projectCreator.create(outputLocation);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}