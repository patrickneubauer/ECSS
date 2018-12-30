package uk.ac.york.cs.ecss.create.project.creator;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.york.cs.ecss.create.project.configuration.PlainMavenXtextProjectConfiguration;
import uk.ac.york.cs.ecss.migrated.ResourceLoader;

public class PlainMavenXtextProjectCreator extends BaseXtextProjectCreator {
	
	private static final Logger logger = LogManager.getLogger(PlainMavenXtextProjectCreator.class);
	
	public PlainMavenXtextProjectCreator(ResourceLoader resourceLoader, String reportFileLocation, String baseName, String languageName, List<String> fileExtensions) {
		super(resourceLoader, reportFileLocation, baseName, languageName, fileExtensions);
		logger.info("Initiating " + this.getClass().getCanonicalName() + " at " + LocalDateTime.now());
		
		projectConfiguration = new PlainMavenXtextProjectConfiguration(baseName);
		projectConfiguration.setLanguageName(languageName);
		projectConfiguration.setFileExtensions(fileExtensions);
	}

}
