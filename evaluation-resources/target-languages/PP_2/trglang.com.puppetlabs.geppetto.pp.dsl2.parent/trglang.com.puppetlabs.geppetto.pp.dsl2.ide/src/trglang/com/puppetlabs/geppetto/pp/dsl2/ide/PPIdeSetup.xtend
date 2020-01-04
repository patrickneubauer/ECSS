/*
 * generated by Xtext 2.19.0
 */
package trglang.com.puppetlabs.geppetto.pp.dsl2.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import trglang.com.puppetlabs.geppetto.pp.dsl2.PPRuntimeModule
import trglang.com.puppetlabs.geppetto.pp.dsl2.PPStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PPIdeSetup extends PPStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PPRuntimeModule, new PPIdeModule))
	}
	
}
