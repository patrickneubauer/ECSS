package uk.ac.york.cs.ecss.evaluation;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Injector;

import uk.ac.york.cs.ecss.evaluation.statemachine.statemachine.StatemachinePackage;

public class XtextResourceComparatorStatemachineLangsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void compare() {
		// Register common meta model (Statemachine.ecore)
		EPackage pkg = StatemachinePackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
		
		// Establish injectors
		Injector srcLangInj = new org.xtext.example.mydsl1.MyDsl1StandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector trgLangInj = new org.xtext.example.mydsl2.MyDsl2StandaloneSetup().createInjectorAndDoEMFRegistration();
		
		// setup evaluation runner
		XtextResourceComparator evaluationRunner = new XtextResourceComparator();
		
		// Compare scopes
		Comparison comparison1 = evaluationRunner.compare(srcLangInj, trgLangInj, "statemachine-models/model1.mydsl1", "statemachine-models/model1.mydsl2");
		Comparison comparison2 = evaluationRunner.compare(srcLangInj, trgLangInj, "statemachine-models/model1.mydsl1", "statemachine-models/model2.mydsl2");
				
		// assert results
		assertTrue( XtextResourceComparatorUtils.getMatchCount(comparison1) == 6 );
		assertTrue( comparison1.getDifferences().size() == 0 );
		assertTrue( comparison1.getConflicts().size() == 0 );
		
		assertTrue( XtextResourceComparatorUtils.getMatchCount(comparison2) == 7 );
		assertTrue( comparison2.getDifferences().size() == 1 );
		assertTrue( comparison2.getDifferences().get(0).getKind() == DifferenceKind.DELETE );
		assertTrue( comparison2.getConflicts().size() == 0 );
		
		double matchFactor1 = XtextResourceComparatorUtils.getMatchFactor(comparison2, comparison1);
		assertTrue( matchFactor1 == 0.8571428571428571 );
		System.out.println("Fraction of matching structural features: " + matchFactor1);

		// ----------
		
		// serialize model of target language using serializer of source language
		evaluationRunner.serialize(trgLangInj, srcLangInj, "statemachine-models/model2.mydsl2", "statemachine-models/generated/model2.mydsl1");
		
		// parse model serialized with source language serializer with parser of target language
		Comparison comparison3 = evaluationRunner.compare(srcLangInj, trgLangInj, "statemachine-models/generated/model2.mydsl1", "statemachine-models/model2.mydsl2");
		assertTrue( comparison3.getDifferences().size() == 0 );
	
		// print fraction of matching structural features
		double matchFactor2 = XtextResourceComparatorUtils.getMatchFactor(comparison3, comparison2);
		assertTrue( matchFactor2 == 1.0 );
		System.out.println("Fraction of matching structural features: " + matchFactor2);
	
		System.out.println("Finished !");
	}

}
