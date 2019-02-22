package uk.ac.york.lang.newrules;

import java.util.*;
import uk.ac.york.cs.ecss.newproc.*;
import org.eclipse.emf.ecore.*;

public class defaultTerminal extends uk.ac.york.cs.ecss.newproc.SingleAttributeXtendRule {
	public defaultTerminal(org.eclipse.emf.ecore.EStructuralFeature arg0) {
		super(arg0);
	}

	@Override
	public String getString() {
		StringBuilder builder = new StringBuilder();
if (feature instanceof EReference) {
		if (((EReference)feature).isContainment()) {
		builder.append(callRuleRef("classRules",feature.getEType()));
		} else {
		builder.append("[");
		builder.append(callRuleRef("classRules",feature.getEType()));
		builder.append("]");
		}
		} else { if (feature.getEType() instanceof EEnum) {
		builder.append(callRuleRef("enumRules",feature.getEType()));
		} else {
		builder.append(callRuleRef("terminalRules",feature.getEType()));
		}}
		return builder.toString();
	}
}