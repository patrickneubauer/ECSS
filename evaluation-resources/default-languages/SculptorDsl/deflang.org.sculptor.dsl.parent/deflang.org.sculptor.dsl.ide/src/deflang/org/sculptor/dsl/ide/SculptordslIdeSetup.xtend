/*
 * generated by Xtext 2.19.0
 */
package deflang.org.sculptor.dsl.ide

import com.google.inject.Guice
import deflang.org.sculptor.dsl.SculptordslRuntimeModule
import deflang.org.sculptor.dsl.SculptordslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SculptordslIdeSetup extends SculptordslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SculptordslRuntimeModule, new SculptordslIdeModule))
	}
	
}