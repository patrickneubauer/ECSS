/*
 * generated by Xtext 2.19.0
 */
package deflang.com.github.jknack.antlr4ide


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class Antlr4StandaloneSetup extends Antlr4StandaloneSetupGenerated {

	def static void doSetup() {
		new Antlr4StandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}