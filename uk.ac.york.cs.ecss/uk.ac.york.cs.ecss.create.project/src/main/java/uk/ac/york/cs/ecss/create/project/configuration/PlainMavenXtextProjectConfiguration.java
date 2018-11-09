package uk.ac.york.cs.ecss.create.project.configuration;

import org.eclipse.xtext.xtext.wizard.BuildSystem;
import org.eclipse.xtext.xtext.wizard.IdeProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.ProjectLayout;
import org.eclipse.xtext.xtext.wizard.SourceLayout;
import org.eclipse.xtext.xtext.wizard.WebProjectDescriptor;

/**
 * Xtext project configuration for plain maven build 
 * 
 * @author blizzfire
 *
 */
public class PlainMavenXtextProjectConfiguration extends BaseXtextProjectConfiguration {
	
	public PlainMavenXtextProjectConfiguration(String baseName) {
		super(baseName);
		projectConfiguratorName = this.getClass().getSimpleName();
		
		wizardConfiguration.setPreferredBuildSystem(BuildSystem.MAVEN);
		wizardConfiguration.setSourceLayout(SourceLayout.MAVEN); // if also an eclipse plug-in, SourceLayout.PLAIN is required!
		wizardConfiguration.setProjectLayout(ProjectLayout.HIERARCHICAL);
		
		webProjectDescriptor = new WebProjectDescriptor(wizardConfiguration);
		ideProjectDescriptor = new IdeProjectDescriptor(wizardConfiguration);
		
		ideProjectDescriptor.setEnabled(true);
		webProjectDescriptor.setEnabled(true);
	}

}
