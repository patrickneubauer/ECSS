/**
 * 
 */
package uk.ac.york.cs.ecss.create.project.creator;

import static org.junit.Assert.fail;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.junit.Test;

import uk.ac.york.cs.ecss.create.project.creator.BaseXtextProjectCreator;
import uk.ac.york.cs.ecss.create.project.creator.EclipsePluginXtextProjectCreator;

/**
 * @author blizzfire
 *
 */
public class EclipsePluginXtextProjectCreatorTest extends BaseXtextProjectCreatorTest {

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

		BaseXtextProjectCreator projectCreator = new EclipsePluginXtextProjectCreator(
				EXAMPLE_DATA_FOLDER + REPORT_FILE_LOCATION, projectBaseName, languageName, fileExtensions);
		projectCreator.prepareDestination(outputLocation);
		try {
			projectCreator.create(outputLocation);
			projectCreator.runWorkflow();
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

		BaseXtextProjectCreator projectCreator = new EclipsePluginXtextProjectCreator(
				EXAMPLE_DATA_FOLDER + REPORT_FILE_LOCATION, projectBaseName, languageName, fileExtensions);
		projectCreator.prepareDestination(outputLocation);
		try {
			projectCreator.create(outputLocation);
			projectCreator.runWorkflow();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
