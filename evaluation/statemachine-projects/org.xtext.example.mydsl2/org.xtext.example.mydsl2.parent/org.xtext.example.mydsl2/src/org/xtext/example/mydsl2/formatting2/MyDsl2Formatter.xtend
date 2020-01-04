/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl2.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl2.services.MyDsl2GrammarAccess
import uk.ac.york.cs.ecss.evaluation.statemachine.statemachine.State
import uk.ac.york.cs.ecss.evaluation.statemachine.statemachine.Statemachine

class MyDsl2Formatter extends AbstractFormatter2 {
	
	@Inject extension MyDsl2GrammarAccess

	def dispatch void format(Statemachine statemachine, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (event : statemachine.events) {
			event.format
		}
		for (command : statemachine.commands) {
			command.format
		}
		for (state : statemachine.states) {
			state.format
		}
	}

	def dispatch void format(State state, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (transition : state.transitions) {
			transition.format
		}
	}
	
	// TODO: implement for 
}