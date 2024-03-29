/*
 * generated by Xtext 2.19.0
 */
package srclang.de.itemis.tooling.xturtle.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import srclang.de.itemis.tooling.xturtle.XturtleRuntimeModule
import srclang.de.itemis.tooling.xturtle.XturtleStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class XturtleIdeSetup extends XturtleStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new XturtleRuntimeModule, new XturtleIdeModule))
	}
	
}
