/*
 * generated by Xtext 2.19.0
 */
package deflang.com.puppetlabs.geppetto.pp.dsl1.ide

import com.google.inject.Guice
import deflang.com.puppetlabs.geppetto.pp.dsl1.PPRuntimeModule
import deflang.com.puppetlabs.geppetto.pp.dsl1.PPStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PPIdeSetup extends PPStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PPRuntimeModule, new PPIdeModule))
	}
	
}
