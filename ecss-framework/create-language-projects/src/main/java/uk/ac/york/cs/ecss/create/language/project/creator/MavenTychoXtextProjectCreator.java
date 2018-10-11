package uk.ac.york.cs.ecss.create.language.project.creator;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.InvocationResult;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;
import org.eclipse.core.runtime.Path;

import uk.ac.york.cs.ecss.create.language.project.configuration.MavenTychoXtextProjectConfiguration;

public class MavenTychoXtextProjectCreator extends BaseXtextProjectCreator {
	
	private static final Logger logger = LogManager.getLogger(MavenTychoXtextProjectCreator.class);

	
	private static final String DEFAULT_BUILD_COMMAND = "clean install";
	private String[] MAVEN_LOCATIONS = {"$M2_HOME", "$MAVEN_HOME", "/usr/share/maven", "/usr/local/maven-3.5.0", "/usr/local/Cellar/maven/3.5.0"}; 
	private Invoker invoker;

	public MavenTychoXtextProjectCreator(String reportFileLocation, String baseName, String languageName, List<String> fileExtensions) throws Exception {
		super(reportFileLocation, baseName, languageName, fileExtensions);
		logger.info("Initiating " + this.getClass().getCanonicalName() + " at " + LocalDateTime.now());
		
		projectConfiguration = new MavenTychoXtextProjectConfiguration(baseName);
		projectConfiguration.setLanguageName(languageName);
		projectConfiguration.setFileExtensions(fileExtensions);
		
		// setup maven invoker for project build execution
		invoker = new DefaultInvoker();
		setupMavenHome();
	}
	
	/**
	 * builds the created project
	 * 
	 * (!) make sure the project has been created beforehand
	 * @throws MavenInvocationException in case of project build failure
	 */
	public void build() throws MavenInvocationException {
		build(DEFAULT_BUILD_COMMAND);
	}
	
	/**
	 * builds the created project
	 * 
	 * (!) make sure the project has been created beforehand
	 * @throws MavenInvocationException in case of project build failure
	 */
	public void build(String command) throws MavenInvocationException {
		logger.info("Starting to execute build for project " + projectConfiguration.getWizardConfiguration().getBaseName());

		File parentPom = new File(projectConfiguration.getWizardConfiguration().getRootLocation() + Path.SEPARATOR + projectConfiguration.getWizardConfiguration().getBaseName() + ".parent" + Path.SEPARATOR + "pom.xml");

		InvocationRequest request = new DefaultInvocationRequest();
		request.setPomFile( parentPom );
		request.setGoals( Collections.singletonList( command ) );
		
		InvocationResult result;
		result = invoker.execute( request );
		logger.info("Successfully executed build for project " + projectConfiguration.getWizardConfiguration().getBaseName());
	}

	private void setupMavenHome() throws Exception {
		if (invoker.getMavenHome()==null) {
			logger.warn("Maven home not found by invoker. Looking for alternative locations ...");
			// try finding maven location in system environment variables and system properties
			for (String mavenLocation : MAVEN_LOCATIONS) {
				File potentialMavenLocation = new File(mavenLocation);
				if (potentialMavenLocation.exists()) {
					invoker.setMavenHome(potentialMavenLocation);
					logger.info("... found maven at " + mavenLocation);
					break;
				}
			}
		}
		if (invoker.getMavenHome()==null) {
			logger.info("... maven home still not found.");
			throw new Exception("Cannot continue (unable to determine maven home).");
		} else {
			logger.info("Setup maven home to " + invoker.getMavenHome());
		}
	}
	
}
