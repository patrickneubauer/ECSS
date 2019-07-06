/*
 * generated by Xtext 2.18.0
 */
package uk.ac.york.cs.ecss.examples.spacetransportationservice.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import uk.ac.york.cs.ecss.examples.spacetransportationservice.StsLanguageFlexRuntimeModule
import uk.ac.york.cs.ecss.examples.spacetransportationservice.StsLanguageFlexStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class StsLanguageFlexIdeSetup extends StsLanguageFlexStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new StsLanguageFlexRuntimeModule, new StsLanguageFlexIdeModule))
	}
	
}
