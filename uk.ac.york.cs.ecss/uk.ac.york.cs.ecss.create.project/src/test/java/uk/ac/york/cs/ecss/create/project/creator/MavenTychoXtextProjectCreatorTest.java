/**
 * 
 */
package uk.ac.york.cs.ecss.create.project.creator;

import static org.junit.Assert.fail;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.junit.Test;

import uk.ac.york.cs.ecss.create.project.creator.MavenTychoXtextProjectCreator;

/**
 * @author blizzfire
 *
 */
public class MavenTychoXtextProjectCreatorTest extends BaseXtextProjectCreatorTest {

	// run the following in shell to determine maven home directory: echo $M2_HOME
	private static String MAVEN_HOME = "/usr/local/Cellar/maven/3.5.0/libexec"; // macOS homebrew

	@Test
	public void testHeroLanguage_1() {
		String languageShortName = "HeroLanguage_1";
		String projectBaseName = LANGUAGE_GRAMMAR_URI_PREFIX;
		String languageName = LANGUAGE_GRAMMAR_URI_PREFIX + "." + languageShortName;

		String inputFile = EXAMPLE_DATA_FOLDER + TRANSFORMATION_INPUT_PATH + Path.SEPARATOR + languageShortName
				+ INPUT_FILE_EXTENSION;
		String outputLocation = EXAMPLE_DATA_FOLDER + TRANSFORMATION_OUTPUT_PATH + Path.SEPARATOR + languageShortName;
		List<String> fileExtensions = new LinkedList<String>();
		fileExtensions.add(LANGUAGE_FILE_EXTENSION);

		try {
			MavenTychoXtextProjectCreator projectCreator = new MavenTychoXtextProjectCreator(
					EXAMPLE_DATA_FOLDER + REPORT_FILE_LOCATION, projectBaseName, languageName, fileExtensions);
			projectCreator.prepareDestination(outputLocation);
			projectCreator.create(outputLocation);
			projectCreator.runWorkflow();
//			projectCreator.build();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testRouterLanguage() {
		String languageShortName = "Router";
		String projectBaseName = LANGUAGE_GRAMMAR_URI_PREFIX;
		String languageName = LANGUAGE_GRAMMAR_URI_PREFIX + "." + languageShortName;

		String inputFile = EXAMPLE_DATA_FOLDER + TRANSFORMATION_INPUT_PATH + Path.SEPARATOR + languageShortName
				+ INPUT_FILE_EXTENSION;
		String outputLocation = EXAMPLE_DATA_FOLDER + TRANSFORMATION_OUTPUT_PATH + Path.SEPARATOR + languageShortName;
		List<String> fileExtensions = new LinkedList<String>();
		fileExtensions.add(LANGUAGE_FILE_EXTENSION);

		try {
			MavenTychoXtextProjectCreator projectCreator = new MavenTychoXtextProjectCreator(
					EXAMPLE_DATA_FOLDER + REPORT_FILE_LOCATION, projectBaseName, languageName, fileExtensions);
			projectCreator.prepareDestination(outputLocation);
			projectCreator.create(outputLocation);
			projectCreator.runWorkflow();
//			projectCreator.build();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testSimpleCarModelLanguage() {
		String languageShortName = "SimpleCarModel";
		String projectBaseName = LANGUAGE_GRAMMAR_URI_PREFIX;
		String languageName = LANGUAGE_GRAMMAR_URI_PREFIX + "." + languageShortName;

		String inputFile = EXAMPLE_DATA_FOLDER + TRANSFORMATION_INPUT_PATH + Path.SEPARATOR + languageShortName
				+ INPUT_FILE_EXTENSION;
		String outputLocation = EXAMPLE_DATA_FOLDER + TRANSFORMATION_OUTPUT_PATH + Path.SEPARATOR + languageShortName;
		List<String> fileExtensions = new LinkedList<String>();
		fileExtensions.add(LANGUAGE_FILE_EXTENSION);

		try {
			MavenTychoXtextProjectCreator projectCreator = new MavenTychoXtextProjectCreator(
					EXAMPLE_DATA_FOLDER + REPORT_FILE_LOCATION, projectBaseName, languageName, fileExtensions);
			projectCreator.prepareDestination(outputLocation);
			projectCreator.create(outputLocation);
			projectCreator.runWorkflow();
//			projectCreator.build();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testWML_6Language() {
		String languageShortName = "WML_6";
		String projectBaseName = LANGUAGE_GRAMMAR_URI_PREFIX;
		String languageName = LANGUAGE_GRAMMAR_URI_PREFIX + "." + languageShortName;

		String inputFile = EXAMPLE_DATA_FOLDER + TRANSFORMATION_INPUT_PATH + Path.SEPARATOR + languageShortName
				+ INPUT_FILE_EXTENSION;
		String outputLocation = EXAMPLE_DATA_FOLDER + TRANSFORMATION_OUTPUT_PATH + Path.SEPARATOR + languageShortName;
		List<String> fileExtensions = new LinkedList<String>();
		fileExtensions.add(LANGUAGE_FILE_EXTENSION);

		try {
			MavenTychoXtextProjectCreator projectCreator = new MavenTychoXtextProjectCreator(
					EXAMPLE_DATA_FOLDER + REPORT_FILE_LOCATION, projectBaseName, languageName, fileExtensions);
			projectCreator.prepareDestination(outputLocation);
			projectCreator.create(outputLocation);
			projectCreator.runWorkflow();
//			projectCreator.build();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testYangLanguage() {
		String languageShortName = "Yang";
		String projectBaseName = LANGUAGE_GRAMMAR_URI_PREFIX;
		String languageName = LANGUAGE_GRAMMAR_URI_PREFIX + "." + languageShortName;

		String inputFile = EXAMPLE_DATA_FOLDER + TRANSFORMATION_INPUT_PATH + Path.SEPARATOR + languageShortName
				+ INPUT_FILE_EXTENSION;
		String outputLocation = EXAMPLE_DATA_FOLDER + TRANSFORMATION_OUTPUT_PATH + Path.SEPARATOR + languageShortName;
		List<String> fileExtensions = new LinkedList<String>();
		fileExtensions.add(LANGUAGE_FILE_EXTENSION);

		try {
			MavenTychoXtextProjectCreator projectCreator = new MavenTychoXtextProjectCreator(
					EXAMPLE_DATA_FOLDER + REPORT_FILE_LOCATION, projectBaseName, languageName, fileExtensions);
			projectCreator.prepareDestination(outputLocation);
			projectCreator.create(outputLocation);
			projectCreator.runWorkflow();
//			projectCreator.build();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
