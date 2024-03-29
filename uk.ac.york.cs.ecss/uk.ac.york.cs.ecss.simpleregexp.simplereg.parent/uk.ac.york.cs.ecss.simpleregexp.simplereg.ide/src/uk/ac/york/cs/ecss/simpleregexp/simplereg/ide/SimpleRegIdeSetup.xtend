/*
 * generated by Xtext 2.15.0
 */
package uk.ac.york.cs.ecss.simpleregexp.simplereg.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import uk.ac.york.cs.ecss.simpleregexp.simplereg.SimpleRegRuntimeModule
import uk.ac.york.cs.ecss.simpleregexp.simplereg.SimpleRegStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SimpleRegIdeSetup extends SimpleRegStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SimpleRegRuntimeModule, new SimpleRegIdeModule))
	}
	
}
