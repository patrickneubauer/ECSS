/*
 * generated by Xtext 2.19.0
 */
package trglang.com.puppetlabs.geppetto.module2.dsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import trglang.com.puppetlabs.geppetto.module2.dsl.Module2RuntimeModule
import trglang.com.puppetlabs.geppetto.module2.dsl.Module2StandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class Module2IdeSetup extends Module2StandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new Module2RuntimeModule, new Module2IdeModule))
	}
	
}