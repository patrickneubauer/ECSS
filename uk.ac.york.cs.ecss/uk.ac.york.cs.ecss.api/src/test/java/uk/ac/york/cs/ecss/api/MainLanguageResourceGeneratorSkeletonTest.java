package uk.ac.york.cs.ecss.api;

import static org.junit.Assert.fail;

import java.io.File;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import uk.ac.york.cs.ecss.api.LanguageResourcesGenerator;
import uk.ac.york.cs.ecss.api.MainLanguageResourcesGenerator;
import uk.ac.york.cs.ecss.create.project.creator.MavenTychoXtextProjectCreator;

@Ignore("SKELETON TO CREATE INDIVIDUAL TESTS ONLY")
public class MainLanguageResourceGeneratorSkeletonTest extends BaseLanguageResourcesGeneratorTest {

	protected static final String INPUT_DATA_FOLDER = "../../data";
	
	private static final String UNIQUE_LANGUAGE_ID = "SKELETON"; // <== specify unique language name here

	private static final Path outputPath = new Path(INPUT_DATA_FOLDER + OUTPUT_PATH);
	private static final String languageName = LANGUAGE_NAME_PREFIX + "." + UNIQUE_LANGUAGE_ID;

	private static LanguageResourcesGenerator generator;

	@Before
	public void setUp() throws Exception {
		languageFileExtensions.add("mydsl");

		generator = new MainLanguageResourcesGenerator(new File(INPUT_DATA_FOLDER + REPORT_FILE_LOCATION), outputPath,
				languageProjectBaseName, languageName,
				languageFileExtensions);
	}

	@Test
	public void testGenerateGrammarFile() {
		Resource xtextGrammar = generator.generateAndSerializeGrammar(
				new File(INPUT_DATA_FOLDER + ECORE_PATH + UNIQUE_LANGUAGE_ID + "." + METAMODEL_FILE_EXTENSION));
	}

	@Test
	public void testGenerateGrammarFileFile() {
		Resource xtextGrammar = generator.generateAndSerializeGrammar(
				new File(INPUT_DATA_FOLDER + ECORE_PATH + UNIQUE_LANGUAGE_ID + "." + METAMODEL_FILE_EXTENSION),
				new File(INPUT_DATA_FOLDER + ECSS_PATH + UNIQUE_LANGUAGE_ID + ".ecss"));
	}

	@Test
	public void testGenerateStyleModelFile() {
		try {
			Resource ecssModel = generator.generateStyleModel(
					new File(INPUT_DATA_FOLDER + ECORE_PATH + UNIQUE_LANGUAGE_ID + "." + METAMODEL_FILE_EXTENSION));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGenerateStyleModelFileBooleanTrue() {
		try {
			Resource ecssModel = generator.generateStyleModel(
					new File(INPUT_DATA_FOLDER + ECORE_PATH + UNIQUE_LANGUAGE_ID + "." + METAMODEL_FILE_EXTENSION),
					true);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGenerateStyleModelFileBooleanFalse() {
		try {
			Resource ecssModel = generator.generateStyleModel(
					new File(INPUT_DATA_FOLDER + ECORE_PATH + UNIQUE_LANGUAGE_ID + "." + METAMODEL_FILE_EXTENSION),
					false);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void testGenerateEnhancedMetamodel() {
		Resource ecoreMetamodel = generator.generateEnhancedMetamodel(
				new File(INPUT_DATA_FOLDER + XTEXT_INPUT_PATH + UNIQUE_LANGUAGE_ID + "." + GRAMMAR_FILE_EXTENSION));
	}

	@Test
	public void testGenerateMetamodel() {
		Resource ecoreMetamodel = generator.generateMetamodel(
				new File(INPUT_DATA_FOLDER + XTEXT_INPUT_PATH + UNIQUE_LANGUAGE_ID + "." + GRAMMAR_FILE_EXTENSION));
	}

	@Test
	public void testGenerateLanguageProject() {
		try {
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGenerateLanguageProjectAndRunWorkflow() {
		try {
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
			projectCreator.runWorkflow();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void testGenerateAndBuildLanguageProject() {
		try {
			MavenTychoXtextProjectCreator projectCreator = generator.generateLanguageProject(outputPath.toFile());
//			projectCreator.build();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGenerateDefaultGrammar() {
		try {
			Resource xtextGrammar = generator.generateAndSerialiseDefaultGrammarResource(
					new File(INPUT_DATA_FOLDER + ECORE_PATH + UNIQUE_LANGUAGE_ID + "." + METAMODEL_FILE_EXTENSION));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void testGenerateEnhancedLanguageProject() {
		try {
			MavenTychoXtextProjectCreator projectCreator = generator
					.generateEnhancedLanguageProject(outputPath.toFile());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	@Ignore("remove @Ignore when feature implemented")
	public void testGenerateAndBuildEnhancedLanguageProject() {
		try {
			MavenTychoXtextProjectCreator projectCreator = generator
					.generateEnhancedLanguageProject(outputPath.toFile());
//			projectCreator.build();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
