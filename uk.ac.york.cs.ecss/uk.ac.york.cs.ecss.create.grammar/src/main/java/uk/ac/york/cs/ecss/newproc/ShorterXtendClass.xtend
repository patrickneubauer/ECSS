package uk.ac.york.cs.ecss.newproc

import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor.RuleCallToken

class ShorterXtendClass extends AbstractClassBasedXtendRule {
	
	private String val_a;
	private SlotContainer slot_name = new SlotContainer("name",1,1);
	private SlotContainer slotm_other;
	private RuleCall attributeRules;
	
	new(EClass cl) {
		super(cl)
	}
	
	override getString() '''rule «loc_class.name»: 
					«attributeRules.apply(slot_name.values)»
					 <something> '«val_a»' 
					«attributeRules.apply(slotm_other.values)»'''
					
					
}