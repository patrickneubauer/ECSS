/*
 * generated by Xtext 2.19.0
 */
package srclang.rethink.uml.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import srclang.rethink.uml.ClassDiagramRuntimeModule
import srclang.rethink.uml.ClassDiagramStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ClassDiagramIdeSetup extends ClassDiagramStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ClassDiagramRuntimeModule, new ClassDiagramIdeModule))
	}
	
}
