package uk.ac.york.lang.newrules;

import java.util.*;
import uk.ac.york.cs.ecss.newproc.*;
import org.eclipse.emf.ecore.*;

public class defaultAttributeDistr extends uk.ac.york.cs.ecss.newproc.AttributeXtendRule {
	public defaultAttributeDistr(java.util.List arg0) {
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

		builder.append(callRule("attributeRule",esf));
		}
}
		return builder.toString();
	}
}