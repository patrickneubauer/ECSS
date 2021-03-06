/*
 * generated by Xtext 2.15.0
 */
package uk.ac.york.cs.ecss.language.web

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2
import uk.ac.york.cs.ecss.language.EcssLanguageRuntimeModule
import uk.ac.york.cs.ecss.language.EcssLanguageStandaloneSetup
import uk.ac.york.cs.ecss.language.ide.EcssLanguageIdeModule

/**
 * Initialization support for running Xtext languages in web applications.
 */
class EcssLanguageWebSetup extends EcssLanguageStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new EcssLanguageRuntimeModule, new EcssLanguageIdeModule, new EcssLanguageWebModule))
	}
	
}
