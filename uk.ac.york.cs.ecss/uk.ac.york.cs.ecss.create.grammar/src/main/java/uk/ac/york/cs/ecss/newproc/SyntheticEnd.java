package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.util.Collection;
import java.util.List;

public  class SyntheticEnd extends AbstractEcssXtendRule  {

		
	public SyntheticEnd() {		
	}

	@Override
	public void afterInit() {
	}

	public String getString() {
		return "terminal END: 'synthetic:END';\n";
	}
	
	@Override
	public String getSubName() {
		return "END";
	}
	
}
