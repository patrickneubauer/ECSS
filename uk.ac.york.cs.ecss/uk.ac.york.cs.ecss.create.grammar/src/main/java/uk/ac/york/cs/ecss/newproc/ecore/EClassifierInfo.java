package uk.ac.york.cs.ecss.newproc.ecore;

import org.eclipse.emf.ecore.EClassifier;

public class EClassifierInfo {
	
	private EClassifier cl;

	public EClassifierInfo(EClassifier ecl) {
		this.cl = ecl;
	}
	
	public EClassifier getEClassifier() {
		return this.cl;
	}

}
