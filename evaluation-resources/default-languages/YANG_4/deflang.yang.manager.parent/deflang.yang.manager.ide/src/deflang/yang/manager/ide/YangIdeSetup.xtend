/*
 * generated by Xtext 2.19.0
 */
package deflang.yang.manager.ide

import com.google.inject.Guice
import deflang.yang.manager.YangRuntimeModule
import deflang.yang.manager.YangStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class YangIdeSetup extends YangStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new YangRuntimeModule, new YangIdeModule))
	}
	
}
