/*
 * generated by Xtext 2.19.0
 */
package trglang.com.temenos.interaction.rimdsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import trglang.com.temenos.interaction.rimdsl.RIMDslRuntimeModule
import trglang.com.temenos.interaction.rimdsl.RIMDslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RIMDslIdeSetup extends RIMDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RIMDslRuntimeModule, new RIMDslIdeModule))
	}
	
}
