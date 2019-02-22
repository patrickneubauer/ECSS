package uk.ac.york.lang.newrules;

import java.util.*;
import uk.ac.york.cs.ecss.newproc.*;
import org.eclipse.emf.ecore.*;

public class defaultClassRule extends uk.ac.york.cs.ecss.newproc.AbstractClassBasedXtendRule {

protected uk.ac.york.cs.ecss.newproc.SlotContainer slot_name = new SlotContainer("name", 0,1);
protected uk.ac.york.cs.ecss.newproc.SlotContainer slot_other = new SlotContainer("other", 0,99);

	public defaultClassRule(org.eclipse.emf.ecore.EClass arg0) {
		super(arg0);
	}

	@Override
	public String getString() {
		StringBuilder builder = new StringBuilder();
builder.append(loc_class.getName());
		builder.append(" returns ");
		builder.append(loc_class.getName());
		builder.append(":");
		if (loc_subClasses.isEmpty()) {
		builder.append("{");
		builder.append(loc_class.getName());
		builder.append("}");
		if (slot_name.getValues().isEmpty()) {
		builder.append(" '");
		builder.append(loc_class.getName());
		builder.append("' ");
		builder.append(" ':' ");
		} else {
		builder.append(callRule("nameDistRules",slot_name.getValues()));
		}
		builder.append(callRuleRef("BEGIN"));
		builder.append(" (");
		builder.append(callRule("attributeDistRules",slot_other.getValues()));
		builder.append(")");
		builder.append(callRuleRef("END"));
		} else { 
		{
boolean $first_1 = true;
for (org.eclipse.emf.ecore.EClass subCl: loc_subClasses) {
		if($first_1) {$first_1 = false;} else {

		builder.append(" | ");
		}

		builder.append(callRuleRef("classRules",subCl));
		}
}
		}
		builder.append(";");
		return builder.toString();
	}
}