package uk.ac.york.lang.newrules;

import java.util.*;
import uk.ac.york.cs.ecss.newproc.*;
import org.eclipse.emf.ecore.*;

public class nameAttributeDistr extends uk.ac.york.cs.ecss.newproc.AttributeXtendRule {
	public nameAttributeDistr(java.util.List arg0) {
		super(arg0);
	}

	@Override
	public String getString() {
		StringBuilder builder = new StringBuilder();
{
boolean $first_1 = true;
for (org.eclipse.emf.ecore.EStructuralFeature esf: features) {
		if($first_1) {$first_1 = false;} else {

		}

		builder.append(" '");
		builder.append(esf.getName());
		builder.append("' ");
		builder.append(" ':' ");
		builder.append(esf.getName());
		builder.append(" = ");
		if (esf.getEType() != null && esf.getEType().getInstanceClass() == String.class) {
		builder.append("ID ");
		} else {
		builder.append(callRule("sensibleTerminal",esf));
		builder.append(" ");
		}
		}
}
		return builder.toString();
	}
}