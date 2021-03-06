/*
 * generated by Xtext 2.15.0
 */
package uk.ac.york.cs.ecss.language.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import uk.ac.york.cs.ecss.language.EcssLanguageRuntimeModule
import uk.ac.york.cs.ecss.language.EcssLanguageStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class EcssLanguageIdeSetup extends EcssLanguageStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new EcssLanguageRuntimeModule, new EcssLanguageIdeModule))
	}
	
}
