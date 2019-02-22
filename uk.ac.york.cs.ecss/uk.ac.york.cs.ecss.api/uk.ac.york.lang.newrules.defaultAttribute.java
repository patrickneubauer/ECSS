package uk.ac.york.lang.newrules;

import java.util.*;
import uk.ac.york.cs.ecss.newproc.*;
import org.eclipse.emf.ecore.*;

public class defaultAttribute extends uk.ac.york.cs.ecss.newproc.SingleAttributeXtendRule {


	public defaultAttribute(org.eclipse.emf.ecore.EStructuralFeature arg0) {
		super(arg0);
	}

	@Override
	public String getString() {
		StringBuilder builder = new StringBuilder();
if (feature.getLowerBound() == 0) {
		builder.append("(");
		}
		builder.append(" '");
		builder.append(feature.getName());
		builder.append("' ");
		builder.append(" ':' ");
		if (feature instanceof EReference) {
		builder.append(callRuleRef("BEGIN"));
		builder.append(" ");
		if (!((EReference)feature).isContainment()) {
		builder.append(" '- ' ");
		}
		}
		builder.append(" ");
		builder.append(feature.getName());
		builder.append(xtextOperator);
		builder.append(" ");
		builder.append(callRule("sensibleTerminal",feature));
		builder.append(" ");
		if (feature.isMany()) {
		builder.append("(");
		if (feature instanceof EReference) {
		if (!((EReference)feature).isContainment()) {
		builder.append(" '- ' ");
		}
		}
		builder.append(feature.getName());
		builder.append(xtextOperator);
		builder.append(" ");
		builder.append(callRule("sensibleTerminal",feature));
		builder.append(" ");
		builder.append(")*");
		}
		if (feature instanceof EReference) {
		builder.append(callRuleRef("END"));
		builder.append(" ");
		}
		if (feature.getLowerBound() == 0) {
		builder.append(")?");
		}
		return builder.toString();
	}
}