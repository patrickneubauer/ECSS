package uk.ac.york.cs.ecss.create.language.project.creator;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import uk.ac.york.cs.ecss.create.language.project.configuration.PlainMavenXtextProjectConfiguration;

public class PlainMavenXtextProjectCreator extends BaseXtextProjectCreator {
	
	private static final Logger logger = LogManager.getLogger(PlainMavenXtextProjectCreator.class);
	
	public PlainMavenXtextProjectCreator(String reportFileLocation, String baseName, String languageName, List<String> fileExtensions) {
		super(reportFileLocation, baseName, languageName, fileExtensions);
		logger.info("Initiating " + this.getClass().getCanonicalName() + " at " + LocalDateTime.now());
		
		projectConfiguration = new PlainMavenXtextProjectConfiguration(baseName);
		projectConfiguration.setLanguageName(languageName);
		projectConfiguration.setFileExtensions(fileExtensions);
	}

}
