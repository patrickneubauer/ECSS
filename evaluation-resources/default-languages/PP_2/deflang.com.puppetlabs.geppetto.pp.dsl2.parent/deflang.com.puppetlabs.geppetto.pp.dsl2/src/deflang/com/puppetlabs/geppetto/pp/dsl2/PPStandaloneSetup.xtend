/*
 * generated by Xtext 2.19.0
 */
package deflang.com.puppetlabs.geppetto.pp.dsl2


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PPStandaloneSetup extends PPStandaloneSetupGenerated {

	def static void doSetup() {
		new PPStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
