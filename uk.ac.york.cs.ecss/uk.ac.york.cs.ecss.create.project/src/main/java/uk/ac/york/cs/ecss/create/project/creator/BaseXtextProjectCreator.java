package uk.ac.york.cs.ecss.create.project.creator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xtext.wizard.Ecore2XtextConfiguration;
import org.eclipse.xtext.xtext.wizard.cli.CliProjectsCreator;
import org.eclipse.xtext.xtext.wizard.ecore2xtext.Ecore2XtextGrammarCreator;

import com.google.common.io.Files;
import com.google.inject.Injector;

import uk.ac.york.cs.ecss.create.project.Ecore2XtextConfigurationHelper;
import uk.ac.york.cs.ecss.create.project.configuration.BaseXtextProjectConfiguration;
import uk.ac.york.cs.ecss.utilities.FileUtils;

public class BaseXtextProjectCreator {

	private static final Logger logger = LogManager.getLogger(BaseXtextProjectCreator.class);
	
	protected BaseXtextProjectConfiguration projectConfiguration;
	protected String reportFile;
	protected ResourceSet emfResourceSet;
	protected XtextResourceSet xtextResourceSet;
	protected Mwe2Launcher mwe2launcher;

	/**
	 * 
	 * @param reportFileLocation
	 *            string report file location
	 * @param projectBaseName
	 *            example: me.ecss.language
	 * @param languageName
	 *            example: me.ecss.language.MyDsl
	 * @param fileExtensions
	 *            example: mydsl
	 */
	public BaseXtextProjectCreator(String reportFileLocation, String projectBaseName, String languageName,
			List<String> fileExtensions) {
		this.reportFile = reportFileLocation;
		init();

		projectConfiguration = new BaseXtextProjectConfiguration(projectBaseName);
		projectConfiguration.setLanguageName(languageName);
		projectConfiguration.setFileExtensions(fileExtensions);
	}

	protected void init() {
		logger.info("Initializing creator ...");

		Injector i = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		xtextResourceSet = i.getInstance(XtextResourceSet.class);
		emfResourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		mwe2launcher = new Mwe2Launcher();

		logger.info("... finished initializing creator.");
	}

	/**
	 * Creates a (set of) language projects based on the specified project
	 * configuration
	 * 
	 * (!) the location where to store generated project(s) will be created if not
	 * existing and cleaned, i.e., any existing data is removed from the destination
	 * 
	 * (!) requires {@code BaseXtextProjectConfiguration} to be set beforehand
	 * 
	 * @param targetProjectLocation
	 *            where to create the projects
	 * @throws Exception 
	 */
	public void create(String targetProjectLocation) throws Exception {
		if (!projectConfiguration.isComplete() || !projectConfiguration.isValid()) {
			throw new Exception("Xtext project configuration incomplete and/or invalid. Check configured project wizard.");
		}
		String uniqueShortLanguageName = projectConfiguration.getWizardConfiguration().getLanguage().getSimpleName();
		String targetRootLocation = targetProjectLocation + Path.SEPARATOR
				+ projectConfiguration.getProjectConfiguratorName();

		logger.info(
				"Generating Xtext skeleton projects for " + uniqueShortLanguageName + " ...");

		projectConfiguration.setRootLocation(targetRootLocation);

		// create skeleton projects
		CliProjectsCreator cliProjectsCreator = new CliProjectsCreator();
		cliProjectsCreator.setLineDelimiter(Strings.newLine());
		cliProjectsCreator.createProjects(projectConfiguration.getWizardConfiguration());

		logger.info(
				"... finished generating Xtext skeleton projects for " + uniqueShortLanguageName);

	}

	/**
	 * replace grammar by looking for file with extension "xtext" as each creator
	 * places it somewhere different
	 * 
	 * @param targetProjectRootLocation
	 * @param grammarCharSequence
	 */
	public void replaceGrammar(String targetProjectRootLocation, CharSequence grammarCharSequence) {
		// determine xtext file location
		File targetFile = FileUtils.findFirstFileByExtension(new File(targetProjectRootLocation), "xtext");

		try {
			Files.write(grammarCharSequence, targetFile, projectConfiguration.getWizardConfiguration().getEncoding());
		} catch (IOException e) {
			logger.error("Unable to replace grammar in file " + targetFile.getAbsolutePath());
			e.printStackTrace();
		}
		logger.info("Successfully replaced grammar in file " + targetFile.getName());
	}

	/**
	 * replaces workflow by looking for file with extension "mwe2" as each creator
	 * places it somewhere different
	 * 
	 * @param targetProjectRootLocation
	 * @param workflowCharSequence
	 */
	public void replaceWorkflow(String targetProjectRootLocation, CharSequence workflowCharSequence) {
		// determine workflow file location
		File targetFile = FileUtils.findFirstFileByExtension(new File(targetProjectRootLocation), "mwe2");

		try {
			Files.write(workflowCharSequence, targetFile, projectConfiguration.getWizardConfiguration().getEncoding());
		} catch (IOException e) {
			logger.error("Unable to replace workflow in file " + targetFile.getAbsolutePath());
			e.printStackTrace();
		}
		logger.info("Successfully replaced workflow in file " + targetFile.getName());
	}
	
	/**
	 * Runs the language project workflow based on the previously specified project
	 * configuration
	 * 
	 * (!) requires {@code BaseXtextProjectConfiguration} to be set beforehand
	 * 
	 * (!) Limited by means of choosing the first mwe2 workflow found rather than a specific one
	 * 
	 * @throws Exception 
	 */
	@SuppressWarnings("static-access")
	public void runWorkflow() throws Exception {
		if (!projectConfiguration.isComplete() || !projectConfiguration.isValid()) {
			throw new Exception("Xtext project configuration incomplete and/or invalid. Check configured project wizard.");
		}
		String uniqueShortLanguageName = projectConfiguration.getWizardConfiguration().getLanguage().getSimpleName();
		String targetProjectRootLocation = "";
		
		if ( projectConfiguration.getWizardConfiguration().getParentProject().isEnabled() ) {
			// for Maven and Tycho-based projects
			targetProjectRootLocation = projectConfiguration.getWizardConfiguration().getParentProject().getLocation() ;
		} else if ( !projectConfiguration.getWizardConfiguration().getParentProject().isEnabled() ) {
			// for projects that do not have a parent project
			targetProjectRootLocation = projectConfiguration.getWizardConfiguration().getRootLocation();
		}
		
		logger.info(
				"Running MWE2 workflow for " + uniqueShortLanguageName + " ...");

		// run mwe2 workflow
		File targetFile = FileUtils.findFirstFileByExtension(new File(targetProjectRootLocation), "mwe2");
		mwe2launcher.main(new String[]{targetFile.getCanonicalPath(), "-p", "rootPath="+targetProjectRootLocation});

		logger.info(
				"... finished running MWE2 workflow for " + uniqueShortLanguageName);
	}

	public CharSequence obtainDefaultGrammar(String sourceFileLocation) {
		File sourceFile = new File(sourceFileLocation);
		Resource sourceResource = emfResourceSet.getResource(URI.createFileURI(sourceFile.getAbsolutePath()), true);

		try {
			sourceResource.load(Collections.emptyMap());
		} catch (IOException e) {
			logger.error("Error when loading source resource from " + sourceResource.getURI());
			logger.error(e.getMessage());
			return null; // abort when resource loading fails
		}

		if (sourceResource.getContents().isEmpty() || !(sourceResource.getContents().get(0) instanceof EPackage)) {
			// root not an EPackage
			logger.warn(
					"Source file " + sourceFile + " does not have an EPackage as root object -- SKIPPING.\n");
			return null; // do not consider this resource
		}

		// add nsURIs
		EPackage rootEPackage = (EPackage) sourceResource.getContents().get(0);
		List<String> ePackageURIs = new LinkedList<String>();
		/*for (String nsURI : Ecore2XtextConfigurationHelper.EPACKAGE_NS_URIS) {
			ePackageURIs.add(nsURI);
		}*/
		ePackageURIs.add(rootEPackage.getNsURI());

		// register package
		EPackage.Registry.INSTANCE.putIfAbsent(rootEPackage.getNsURI(), rootEPackage);

		Ecore2XtextGrammarCreator ecore2XtextGrammarCreator = new Ecore2XtextGrammarCreator();
		Ecore2XtextConfiguration ecore2XtextConfiguration = Ecore2XtextConfigurationHelper
				.createEcore2XtextConfiguration(ePackageURIs);
		Ecore2XtextConfigurationHelper.setupEcore2XtextWizardConfiguration(
				projectConfiguration.getWizardConfiguration(), ecore2XtextConfiguration);
		CharSequence grammarCharSequence = ecore2XtextGrammarCreator
				.grammar(projectConfiguration.getWizardConfiguration());

		// remove package from registry in case an equally named package is handled
		// later
		EPackage.Registry.INSTANCE.remove(rootEPackage.getNsURI(), rootEPackage);

		return grammarCharSequence;
	}

	/**
	 * clears destination folder for preceding Xtext project generation
	 * 
	 * (!) removes all contents within provided {@code String} directory location's
	 * project configuration-specific sub-folder
	 * 
	 * @param destinationDirectory
	 *            folder location to be cleared
	 */
	public void prepareDestination(String destinationDirectory) {
		prepareDestination(new File(destinationDirectory));
	}

	/**
	 * clears destination folder for preceding Xtext project generation
	 * 
	 * (!) removes all contents within provided {@code File} directory location's
	 * project configuration-specific sub-folder
	 * 
	 * @param destinationDirectory
	 *            folder location to be cleared
	 */
	public void prepareDestination(File destinationDirectory) {
		File creatorSpecificDestinationDirectory = new File(
				destinationDirectory.toString() + Path.SEPARATOR + projectConfiguration.getProjectConfiguratorName());
		try {
			if (creatorSpecificDestinationDirectory.exists()) {
				org.eclipse.xtext.util.Files.sweepFolder(creatorSpecificDestinationDirectory);
			}
		} catch (FileNotFoundException e) {
			logger.info(
					"Unable to prepare destination location for Xtext project generation: " + e.getMessage());
		}
	}

}
