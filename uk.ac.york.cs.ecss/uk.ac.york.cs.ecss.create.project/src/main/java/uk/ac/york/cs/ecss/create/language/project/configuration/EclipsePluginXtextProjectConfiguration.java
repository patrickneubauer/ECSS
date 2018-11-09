package uk.ac.york.cs.ecss.create.language.project.configuration;

import org.eclipse.xtext.xtext.wizard.BuildSystem;
import org.eclipse.xtext.xtext.wizard.IdeProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.ProjectLayout;
import org.eclipse.xtext.xtext.wizard.SourceLayout;
import org.eclipse.xtext.xtext.wizard.UiProjectDescriptor;

/**
 * Xtext project configuration for Eclipse plug-in 
 * 
 * @author blizzfire
 *
 */
public class EclipsePluginXtextProjectConfiguration extends BaseXtextProjectConfiguration {
	
	public EclipsePluginXtextProjectConfiguration(String baseName) {
		super(baseName);
		projectConfiguratorName = this.getClass().getSimpleName();
		
		wizardConfiguration.setPreferredBuildSystem(BuildSystem.NONE);
		wizardConfiguration.setSourceLayout(SourceLayout.PLAIN);
		wizardConfiguration.setProjectLayout(ProjectLayout.FLAT);

		ideProjectDescriptor = new IdeProjectDescriptor(wizardConfiguration);
		uiProjectDescriptor = new UiProjectDescriptor(wizardConfiguration);
//		uiProjectDescriptor.getTestProject().setEnabled(true);
		
		uiProjectDescriptor.setEnabled(true);
		ideProjectDescriptor.setEnabled(true);
	}

}
