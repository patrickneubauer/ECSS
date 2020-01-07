package uk.ac.york.cs.ecss.evaluation;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xtext.GrammarResource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Injector;

import uk.ac.york.cs.ecss.utilities.CSVUtil;

public class XtextResourceComparatorDefGrasTest extends XtextResourceComparatorBaseTest {

	private static String langName;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Register common meta model 
		EPackage pkg = XtextPackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
//		langName = "Xtext";
		
		resComp = new XtextResourceComparator();
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
	public void loadSrcGrammars() {
		String subPathName = "SrcGras";
		
		loadGrammars(subPathName);
	}// loadSrcGrammars
	
	@Test
	public void loadDefGrammars() {
		String subPathName = "DefGras";

		loadGrammars(subPathName);
	}// loadDefGrammars
	
	@Test
	public void loadTrgGrammars() {
		String subPathName = "TrgGras";

		loadGrammars(subPathName);
	}// loadDefGrammars
	
	@Test
	public void serializeDefGrammars() throws IOException {
		Injector srcLangInj = new org.eclipse.xtext.XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector defLangInj = new org.eclipse.xtext.XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		String basePath = "grammars/" + langName + "/";
		
		File defModelsPath = new File(basePath + "DefModels");
		XtextResourceComparatorUtils.recreateDirectory(defModelsPath);
		
		// serialize model of source language using serializer of default language
		for ( File srcModelFile : new File(basePath + "/SrcModels").listFiles() ) {
			resComp.serialize(srcLangInj, defLangInj, srcModelFile.getAbsolutePath(), defModelsPath.getAbsolutePath() + "/" + srcModelFile.getName());
		}
	}// serializeDefGrammars
	
	@Test
	public void serializeTrgGrammars() throws IOException {
		Injector srcLangInj = new org.eclipse.xtext.XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector trgLangInj = new org.eclipse.xtext.XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		String basePath = "grammars/" + langName + "/";
		
		File trgModelsPath = new File(basePath + "TrgModels");
		XtextResourceComparatorUtils.recreateDirectory(trgModelsPath);
		
		// serialize model of source language using serializer of target language
		for ( File srcModelFile : new File(basePath + "/SrcModels").listFiles() ) {
			resComp.serialize(srcLangInj, trgLangInj, srcModelFile.getAbsolutePath(), trgModelsPath.getAbsolutePath() + "/" + srcModelFile.getName());
		}
		
	}// serializeTrgGrammars

	@Test
	public void compareGrammars() {
		Injector srcLangInj = new org.eclipse.xtext.XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector defLangInj = new org.eclipse.xtext.XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector trgLangInj = new org.eclipse.xtext.XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		String basePath = "grammars/" + langName + "/";

		try {
			for ( File srcModelFile : new File(basePath + "/SrcGras").listFiles() ) {
				File trgModelFile = new File(basePath + "/TrgGras/" + srcModelFile.getName());
				File defModelFile = new File(basePath + "/DefGras/" + srcModelFile.getName());

				Comparison comparison1 = resComp.compare(srcLangInj, trgLangInj, srcModelFile.getAbsolutePath(), trgModelFile.getAbsolutePath());
				Comparison comparison2 = resComp.compare(srcLangInj, defLangInj, srcModelFile.getAbsolutePath(), defModelFile.getAbsolutePath());
				double matchFactor = XtextResourceComparatorUtils.getMatchFactor(comparison2, comparison1);
				
				System.out.println("Fraction of matching structural features: " + matchFactor);
			}
		} catch (Exception e) {
			System.err.println("Failed to load model");
			e.printStackTrace();
		}
		
		System.out.println("Finished !");
	}// compareGrammars

}
