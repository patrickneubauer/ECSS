/*
 * generated by Xtext 2.18.0
 */
package uk.ac.york.cs.ecss.examples.spacetransportationservice


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class StsLanguageFlexStandaloneSetup extends StsLanguageFlexStandaloneSetupGenerated {

	def static void doSetup() {
		new StsLanguageFlexStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
