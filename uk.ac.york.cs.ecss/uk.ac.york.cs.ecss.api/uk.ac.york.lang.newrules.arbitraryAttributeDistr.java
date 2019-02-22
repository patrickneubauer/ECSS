package uk.ac.york.lang.newrules;

import java.util.*;
import uk.ac.york.cs.ecss.newproc.*;
import org.eclipse.emf.ecore.*;

public class arbitraryAttributeDistr extends uk.ac.york.cs.ecss.newproc.AttributeXtendRule {
	public arbitraryAttributeDistr(java.util.List arg0) {
		super(arg0);
	}

	@Override
	public String getString() {
		StringBuilder builder = new StringBuilder();
List<EStructuralFeature> sortedFeatures = new ArrayList<>(features);
		sortedFeatures.sort((x,y)->-Boolean.compare(x.isRequired(),y.isRequired()));
		{
boolean $first_1 = true;
for (Object esf: sortedFeatures) {
		if($first_1) {$first_1 = false;} else {

		builder.append(" & ");
		}

		builder.append("(");
		builder.append(callRule("attributeRule",esf));
		builder.append(")");
		}
}
		return builder.toString();
	}
}