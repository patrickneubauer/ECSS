package uk.ac.york.cs.ecss.evaluation;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Injector;

import classDiagram.ClassDiagramPackage;
import srclang.rethink.uml.ClassDiagramStandaloneSetup;

public class XtextResourceComparatorClassDiagramLangsTest {

	private static XtextResourceComparator evaluationRunner;
	private static String langName;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Register common meta model (Statemachine.ecore)
		EPackage pkg = ClassDiagramPackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
		langName = pkg.getName().substring(0, 1).toUpperCase() + pkg.getName().substring(1);
		
		evaluationRunner = new XtextResourceComparator();
	}// setUpBeforeClass

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
	public void loadDefLangModels() {
		Injector srcLangInj = new srclang.rethink.uml.ClassDiagramStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet srcLangResSet = srcLangInj.getInstance(XtextResourceSet.class);
		String basePath = "models/" + langName + "/";
				
		try {
			for ( File srcModelFile : new File(basePath + "/SrcModels").listFiles() ) {
				XtextResource srcModel = (XtextResource) srcLangResSet.getResource(
						URI.createURI(srcModelFile.getAbsolutePath()), true);
				System.out.println("Loaded model: " + srcModelFile.getName());
				assertTrue( srcModel.isLoaded() );
			}
		} catch (Exception e) {
			System.err.println("Failed to load model");
			e.printStackTrace();
		}
	}
	
	@Test
	public void serializeSrcLangModels() throws IOException {
		Injector srcLangInj = new srclang.rethink.uml.ClassDiagramStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector defLangInj = new deflang.rethink.uml.ClassDiagramStandaloneSetup().createInjectorAndDoEMFRegistration();
		String basePath = "models/" + langName + "/";
		
		File defModelsPath = new File(basePath + "DefModels");
		XtextResourceComparatorUtils.recreateDirectory(defModelsPath);
		
		// serialize model of source language using serializer of default language
		for ( File srcModelFile : new File(basePath + "/SrcModels").listFiles() ) {
			evaluationRunner.serialize(srcLangInj, defLangInj, srcModelFile.getAbsolutePath(), defModelsPath.getAbsolutePath() + "/" + srcModelFile.getName());
		}
	}// serializeDefLangModels
	
	@Test
	public void serializeTrgLangModels() throws IOException {
		Injector srcLangInj = new srclang.rethink.uml.ClassDiagramStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector trgLangInj = new trglang.rethink.uml.ClassDiagramStandaloneSetup().createInjectorAndDoEMFRegistration();
		String basePath = "models/" + langName + "/";
		
		File trgModelsPath = new File(basePath + "TrgModels");
		XtextResourceComparatorUtils.recreateDirectory(trgModelsPath);
		
		// serialize model of source language using serializer of target language
		for ( File srcModelFile : new File(basePath + "/SrcModels").listFiles() ) {
			evaluationRunner.serialize(srcLangInj, trgLangInj, srcModelFile.getAbsolutePath(), trgModelsPath.getAbsolutePath() + "/" + srcModelFile.getName());
		}
		
	}// serializeTrgLangModels

	@Test
	public void test() {
//		
//		// Compare scopes
//		Comparison comparison1 = evaluationRunner.compare(srcLangInj, trgLangInj, "models/model1.mydsl1", "models/model1.mydsl2");
//		Comparison comparison2 = evaluationRunner.compare(srcLangInj, trgLangInj, "models/model1.mydsl1", "models/model2.mydsl2");
//				
//		// assert results
//		assertTrue( XtextResourceComparatorUtils.getMatchCount(comparison1) == 6 );
//		assertTrue( comparison1.getDifferences().size() == 0 );
//		assertTrue( comparison1.getConflicts().size() == 0 );
//		
//		assertTrue( XtextResourceComparatorUtils.getMatchCount(comparison2) == 7 );
//		assertTrue( comparison2.getDifferences().size() == 1 );
//		assertTrue( comparison2.getDifferences().get(0).getKind() == DifferenceKind.DELETE );
//		assertTrue( comparison2.getConflicts().size() == 0 );
//		
//		double matchFactor1 = XtextResourceComparatorUtils.getMatchFactor(comparison2, comparison1);
//		assertTrue( matchFactor1 == 0.8571428571428571 );
//		System.out.println("Fraction of matching structural features: " + matchFactor1);
//
//		// ----------
//		
//		// serialize model of target language using serializer of source language
//		evaluationRunner.serialize(trgLangInj, srcLangInj, "models/model2.mydsl2", "models/generated/model2.mydsl1");
//		
//		// parse model serialized with source language serializer with parser of target language
//		Comparison comparison3 = evaluationRunner.compare(srcLangInj, trgLangInj, "models/generated/model2.mydsl1", "models/model2.mydsl2");
//		assertTrue( comparison3.getDifferences().size() == 0 );
//	
//		// print fraction of matching structural features
//		double matchFactor2 = XtextResourceComparatorUtils.getMatchFactor(comparison3, comparison2);
//		assertTrue( matchFactor2 == 1.0 );
//		System.out.println("Fraction of matching structural features: " + matchFactor2);
//	
//		System.out.println("Finished !");
	}

}
