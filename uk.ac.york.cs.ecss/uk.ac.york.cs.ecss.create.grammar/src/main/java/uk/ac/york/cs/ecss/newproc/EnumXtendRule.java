package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

public class EnumXtendRule extends AbstractEcssXtendRule {
	EEnum feature;
	
	public EnumXtendRule(EEnum feature) {
		this.feature = feature;
		
	}
	
	@Override
	public void afterInit() {
		
	}
	
	@Override
	public String getString() {
		StringBuilder builder = new StringBuilder();
		boolean first = true;
		builder.append("enum "+feature.getName()+":\n");
		for (EEnumLiteral literal: feature.getELiterals()) {
			if (first) {first = false;} else {builder.append(" | ");}
			builder.append(literal.getName()+" = '"+literal.getLiteral()+"'");
		}
		builder.append(";");
		return builder.toString();
	}

	@Override
	public String getSubName() {
		return feature.getName();
	}

}
