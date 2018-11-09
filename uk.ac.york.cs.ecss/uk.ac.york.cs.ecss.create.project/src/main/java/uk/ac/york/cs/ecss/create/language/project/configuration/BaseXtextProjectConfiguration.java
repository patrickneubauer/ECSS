/**
 * 
 */
package uk.ac.york.cs.ecss.create.language.project.configuration;

import java.util.List;

import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xtext.wizard.IdeProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.LanguageDescriptor.FileExtensions;
import org.eclipse.xtext.xtext.wizard.RuntimeProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.UiProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.WebProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.WizardConfiguration;

/**
 * Base Xtext Project Configuration
 * 
 * @author blizzfire
 *
 */
public class BaseXtextProjectConfiguration {

	protected String projectConfiguratorName;
	
	public String getProjectConfiguratorName() {
		return projectConfiguratorName;
	}

	public void setProjectConfiguratorName(String projectConfiguratorName) {
		this.projectConfiguratorName = projectConfiguratorName;
	}

	protected WizardConfiguration wizardConfiguration;
	
	protected RuntimeProjectDescriptor runtimeProjectDescriptor;
	protected IdeProjectDescriptor ideProjectDescriptor;
	protected WebProjectDescriptor webProjectDescriptor;
	protected UiProjectDescriptor uiProjectDescriptor;

	public BaseXtextProjectConfiguration(String baseName) {
		wizardConfiguration = new WizardConfiguration();
		wizardConfiguration.setBaseName(baseName);
		wizardConfiguration.setLineDelimiter(Strings.newLine());
		
		projectConfiguratorName = this.getClass().getSimpleName();
		
		runtimeProjectDescriptor = new RuntimeProjectDescriptor(wizardConfiguration);
//		runtimeProjectDescriptor.getTestProject().setEnabled(true);
	}
	
	/**
	 * convenience method 
	 * 
	 * @param rootProjectLocation location of the root project to be created
	 */
	public void setRootLocation(String rootProjectLocation) {
		wizardConfiguration.setRootLocation(rootProjectLocation);
	}
	
	/**
	 * convenience method
	 * 
	 * @param fileExtensions list of language file extensions
	 */
	public void setFileExtensions(List<String> fileExtensionStringList) {
		FileExtensions fileExtensions = new FileExtensions(fileExtensionStringList);
		wizardConfiguration.getLanguage().setFileExtensions(fileExtensions);
	}

	/**
	 * convenience method
	 * 
	 * @param languageName example: "MyDsl"
	 */
	public void setLanguageName(String languageName) {
		wizardConfiguration.getLanguage().setName(languageName);
	}

	public WizardConfiguration getWizardConfiguration() {
		return wizardConfiguration;
	}

	public void setWizardConfiguration(WizardConfiguration wizardConfiguration) {
		this.wizardConfiguration = wizardConfiguration;
	}

	public RuntimeProjectDescriptor getRuntimeProjectDescriptor() {
		return runtimeProjectDescriptor;
	}

	public void setRuntimeProjectDescriptor(RuntimeProjectDescriptor runtimeProjectDescriptor) {
		this.runtimeProjectDescriptor = runtimeProjectDescriptor;
	}

	public IdeProjectDescriptor getIdeProjectDescriptor() {
		return ideProjectDescriptor;
	}

	public void setIdeProjectDescriptor(IdeProjectDescriptor ideProjectDescriptor) {
		this.ideProjectDescriptor = ideProjectDescriptor;
	}

	public WebProjectDescriptor getWebProjectDescriptor() {
		return webProjectDescriptor;
	}

	public void setWebProjectDescriptor(WebProjectDescriptor webProjectDescriptor) {
		this.webProjectDescriptor = webProjectDescriptor;
	}
	
	public void setUiProjectDescriptor(UiProjectDescriptor uiProjectDescriptor) {
		this.uiProjectDescriptor = uiProjectDescriptor;
	}

	/**
	 * Evaluates if the base configuration to create Xtext project(s) is complete
	 * 
	 * @return true if the configuration is complete and false otherwise
	 */
	public boolean isComplete() {
		if (projectConfiguratorName == null || wizardConfiguration.getLanguage() == null || wizardConfiguration.getLanguage().getName() == null || wizardConfiguration.getLanguage().getFileExtensions() == null
				|| wizardConfiguration.getSourceLayout() == null) {
			return false;
		}
		return true; // complete
	}

	/**
	 * Evaluates if the base configuration to create Xtext project(s) is valid
	 * 
	 * @return true if the configuration is valid and false otherwise
	 */
	public boolean isValid() {
		if ( Character.isLowerCase( wizardConfiguration.getLanguage().getName().charAt(wizardConfiguration.getLanguage().getName().lastIndexOf(".")+1) ) ) {
			return false;
		}
		return true;
	}

}
