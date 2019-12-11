package uk.ac.york.cs.ecss.api

import uk.ac.york.cs.ecss.newproc.AbstractEcssXtendRule
import org.eclipse.emf.ecore.EClass

class StaticRule extends AbstractEcssXtendRule {
	
	new(EClass bla) {
		
	}
	
	override afterInit() {
	}
	
	override getString() '''
		StaticContent
	'''
	
	override getSubName() '''blabla'''
	
}