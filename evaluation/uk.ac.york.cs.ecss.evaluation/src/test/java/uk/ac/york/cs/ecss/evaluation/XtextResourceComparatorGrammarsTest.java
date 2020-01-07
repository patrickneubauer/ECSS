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

public class XtextResourceComparatorGrammarsTest extends XtextResourceComparatorBaseTest {

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
	public void compareGrammars() {
		Injector srcLangInj = new org.eclipse.xtext.XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector defLangInj = new org.eclipse.xtext.XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector trgLangInj = new org.eclipse.xtext.XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		String basePath = "grammars/";

		try {
			for ( File srcGraFile : new File(basePath + "/SrcGras").listFiles() ) {
				File trgGraFile = new File(basePath + "/TrgGras/" + srcGraFile.getName());
				File defGraFile = new File(basePath + "/DefGras/" + srcGraFile.getName());

				Comparison comparison1 = null;
				Comparison comparison2 = null;
				double matchFactor = -1.0;
				
				if ( trgGraFile.exists() ) {
					comparison1 = resComp.compare(srcLangInj, trgLangInj, srcGraFile.getAbsolutePath(), trgGraFile.getAbsolutePath());
					System.out.println(srcGraFile.getName() + " src/trg match count = " + XtextResourceComparatorUtils.getMatchCount(comparison1));
				}
				
				if ( defGraFile.exists() ) {
					comparison2 = resComp.compare(srcLangInj, defLangInj, srcGraFile.getAbsolutePath(), defGraFile.getAbsolutePath());
					System.out.println(srcGraFile.getName() + " src/def match count = " + XtextResourceComparatorUtils.getMatchCount(comparison2));
				}
				
				if ( comparison1 != null && comparison2 != null ) {
					matchFactor = XtextResourceComparatorUtils.getMatchFactor(comparison2, comparison1);
					System.out.println(srcGraFile.getName() + " match factor = " + matchFactor);
				}
			}
		} catch (Exception e) {
			System.err.println("Failed to load model");
			e.printStackTrace();
		}
		
		System.out.println("Finished !");
	}// compareGrammars

}
