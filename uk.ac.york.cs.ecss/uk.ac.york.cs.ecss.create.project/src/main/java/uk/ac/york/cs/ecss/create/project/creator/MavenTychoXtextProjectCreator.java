package uk.ac.york.cs.ecss.create.project.creator;

import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.maven.wrapper.BootstrapMainStarter;
import org.apache.maven.wrapper.Downloader;
import org.apache.maven.wrapper.Installer;
//import org.apache.maven.shared.invoker.DefaultInvocationRequest;
//import org.apache.maven.shared.invoker.DefaultInvoker;
//import org.apache.maven.shared.invoker.InvocationRequest;
//import org.apache.maven.shared.invoker.InvocationResult;
//import org.apache.maven.shared.invoker.Invoker;
//import org.apache.maven.shared.invoker.MavenInvocationException;
import org.apache.maven.wrapper.WrapperExecutor;
import org.eclipse.emf.ecore.resource.ResourceSet;

import uk.ac.york.cs.ecss.create.project.configuration.MavenTychoXtextProjectConfiguration;
import uk.ac.york.cs.ecss.migrated.ResourceLoader;

public class MavenTychoXtextProjectCreator extends BaseXtextProjectCreator {
	
	private static final Logger logger = LogManager.getLogger(MavenTychoXtextProjectCreator.class);
	 private Installer install;
	 private BootstrapMainStarter start;
	
	private static final String DEFAULT_BUILD_COMMAND = "clean install";
//	private Invoker invoker;

	public MavenTychoXtextProjectCreator(ResourceLoader resourceLoader, String reportFileLocation, String baseName, String languageName, List<String> fileExtensions) throws Exception {
		super(resourceLoader, reportFileLocation, baseName, languageName, fileExtensions);
		logger.info("Initiating " + this.getClass().getCanonicalName() + " at " + LocalDateTime.now());
		
		projectConfiguration = new MavenTychoXtextProjectConfiguration(baseName);
		projectConfiguration.setLanguageName(languageName);
		projectConfiguration.setFileExtensions(fileExtensions);
		
		// setup maven invoker for project build execution
//		invoker = new DefaultInvoker();
//		invoker.setMavenHome(new File(mavenHome));
		File parentProject = new File(projectConfiguration.getWizardConfiguration().getRootLocation() + File.separator + projectConfiguration.getWizardConfiguration().getBaseName() + ".parent");
		WrapperExecutor wrapper = WrapperExecutor.forProjectDirectory(new File(parentProject, "unknown"), System.out);
		
		Downloader download = new Downloader() {
			
			@Override
			public void download(URI address, File destination) throws Exception {
				// TODO Auto-generated method stub
				
			}
		};
		// FIXME
		/* 
		install = new Installer(download, pathAssembler);
		
		wrapper.execute(new String[] {
			      "arg"
			    }, install, start);
			    */
	}
	
	// TODO: implement MavenTychoXtextProjectCreator.build() by use of build-in maven JAR instead of OS-installed maven
//	/**
//	 * builds the created project
//	 * 
//	 * (!) make sure the project has been created beforehand
//	 * @throws MavenInvocationException in case of project build failure
//	 */
//	public void build() throws MavenInvocationException {
//		build(DEFAULT_BUILD_COMMAND);
//	}
//	
//	/**
//	 * builds the created project
//	 * 
//	 * (!) make sure the project has been created beforehand
//	 * @throws MavenInvocationException in case of project build failure
//	 */
//	public void build(String command) throws MavenInvocationException {
//		logger.info("Starting to execute build for project " + projectConfiguration.getWizardConfiguration().getBaseName());
//
//		File parentPom = new File(projectConfiguration.getWizardConfiguration().getRootLocation() + File.separator + projectConfiguration.getWizardConfiguration().getBaseName() + ".parent" + File.separator + "pom.xml");
//
//		
//		
//		
//		InvocationRequest request = new DefaultInvocationRequest();
//		request.setPomFile( parentPom );
//		request.setGoals( Collections.singletonList( command ) );
//		
//		InvocationResult result;
//		result = invoker.execute( request );
//		logger.info("Successfully executed build for project " + projectConfiguration.getWizardConfiguration().getBaseName());
//	}
	
}
