package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.util.Collection;
import java.util.List;

public class SyntheticBegin extends AbstractEcssXtendRule  {

		
	public SyntheticBegin() {
		
	}

	@Override
	public void afterInit() {
	}

	public String getString() {
		return "terminal BEGIN: 'synthetic:BEGIN';\n";
	}
	
	@Override
	public String getSubName() {
		return "BEGIN";
	}
	
}
