package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.EStructuralFeature;

import java.util.List;

public class AttributeXtendRule extends AbstractEcssXtendRule {

	protected List<EStructuralFeature> features;
	protected boolean loc_arbord;
	
	public AttributeXtendRule(List<EStructuralFeature> features) {
		this.features = features;
	}
	
	@Override
	public void afterInit() {
		
	}
	
	@Override
	public String getString() {
		StringBuilder builder = new StringBuilder();
		if (loc_arbord) {
			//...
		} else {
			for (EStructuralFeature esf: features) {
				builder.append("feature "+esf.getName());
			}
		}
		
		return builder.toString();
	}

	@Override
	public String getSubName() {
		return "featureRule";
	}

}
