/*
 * generated by Xtext 2.19.0
 */
package trglang.de.itemis.tooling.xturtle


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class XturtleStandaloneSetup extends XturtleStandaloneSetupGenerated {

	def static void doSetup() {
		new XturtleStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}