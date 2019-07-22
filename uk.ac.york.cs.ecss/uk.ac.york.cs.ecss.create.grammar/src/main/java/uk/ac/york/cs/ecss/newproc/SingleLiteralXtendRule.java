package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

public class SingleLiteralXtendRule extends AbstractEcssXtendRule {

	protected EEnumLiteral literal;
	
	public SingleLiteralXtendRule(EEnumLiteral literal) {
		this.literal = literal;
	}
	
	@Override
	public void afterInit() {
		
	}
	
	@Override
	public String getString() {
		StringBuilder builder = new StringBuilder();
		builder.append("'"+literal.getValue()+"'");
		return builder.toString();
	}

	@Override
	public String getSubName() {
		return literal.getName();
	}

}
