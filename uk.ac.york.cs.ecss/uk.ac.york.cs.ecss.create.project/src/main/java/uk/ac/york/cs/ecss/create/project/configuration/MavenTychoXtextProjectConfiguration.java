package uk.ac.york.cs.ecss.create.project.configuration;

import org.eclipse.xtext.xtext.wizard.BuildSystem;
import org.eclipse.xtext.xtext.wizard.IdeProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.ProjectLayout;
import org.eclipse.xtext.xtext.wizard.SourceLayout;
import org.eclipse.xtext.xtext.wizard.UiProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.WebProjectDescriptor;

/**
 * Xtext project configuration for Eclipse plug-in with maven build 
 * 
 * @author blizzfire
 *
 */
public class MavenTychoXtextProjectConfiguration extends BaseXtextProjectConfiguration {
	
	public MavenTychoXtextProjectConfiguration(String baseName) {
		super(baseName);
		projectConfiguratorName = this.getClass().getSimpleName();
		
		wizardConfiguration.setPreferredBuildSystem(BuildSystem.MAVEN);
		wizardConfiguration.setSourceLayout(SourceLayout.PLAIN); // if also an eclipse plug-in, SourceLayout.PLAIN is required!
		wizardConfiguration.setProjectLayout(ProjectLayout.HIERARCHICAL);
		
		uiProjectDescriptor = new UiProjectDescriptor(wizardConfiguration);
//		uiProjectDescriptor.getTestProject().setEnabled(true);
		ideProjectDescriptor = new IdeProjectDescriptor(wizardConfiguration);
		webProjectDescriptor = new WebProjectDescriptor(wizardConfiguration);
		
		uiProjectDescriptor.setEnabled(true);
		ideProjectDescriptor.setEnabled(true);
		webProjectDescriptor.setEnabled(true);
	}

}
