/*
 * generated by Xtext 2.19.0
 */
package uk.ac.york.cs.ecss.evaluation.statemachine


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class StatemachineStandaloneSetup extends StatemachineStandaloneSetupGenerated {

	def static void doSetup() {
		new StatemachineStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
