/*
 * generated by Xtext 2.19.0
 */
package deflang.org.uqbar.project.wollok


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class WollokDslStandaloneSetup extends WollokDslStandaloneSetupGenerated {

	def static void doSetup() {
		new WollokDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
