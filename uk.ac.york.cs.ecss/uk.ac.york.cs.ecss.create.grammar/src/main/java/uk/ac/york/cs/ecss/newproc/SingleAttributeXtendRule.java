package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

public class SingleAttributeXtendRule extends AbstractEcssXtendRule {

	protected EStructuralFeature feature;
	protected String xtextOperator;
	protected boolean loc_arbord;
	protected String featureType;
	protected boolean isEnum;
	
	public SingleAttributeXtendRule(EStructuralFeature feature) {
		this.feature = feature;
		this.xtextOperator = "=";
		if (feature.isMany()) {
			this.xtextOperator = "+=";
		} else if (feature.getEType() == EcorePackage.eINSTANCE.getEBoolean() || feature.getEType() == EcorePackage.eINSTANCE.getEBooleanObject()) {
			this.xtextOperator = "?=";
		}
		this.featureType = feature.getEType().getName();
		this.isEnum = feature.getEType() instanceof EEnum;
	}
	
	@Override
	public void afterInit() {
		
	}
	
	@Override
	public String getString() {
		StringBuilder builder = new StringBuilder();
		builder.append("feature "+feature.getName());
		return builder.toString();
	}

	@Override
	public String getSubName() {
		return feature.getName();
	}

}
