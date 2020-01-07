package uk.ac.york.cs.ecss.evaluation;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Injector;

import antlr4.Antlr4Package;
import pp2.Pp2Package;
import uk.ac.york.cs.ecss.utilities.CSVUtil;
import wML.WMLPackage;
import xturtle.XturtlePackage;

public class XtextResourceComparatorXturtleLangsTest extends XtextResourceComparatorBaseTest {

	private static String langName;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Register common meta model (Statemachine.ecore)
		EPackage pkg = XturtlePackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
		langName = "Xturtle";
		
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
	public void loadSrcLangModels() {
		Injector srcLangInj = new srclang.de.itemis.tooling.xturtle.XturtleStandaloneSetup().createInjectorAndDoEMFRegistration();
		String subPathName = "SrcModels";

		XtextResourceSet srcLangResSet = srcLangInj.getInstance(XtextResourceSet.class);
		String basePath = "models/" + langName + "/";
		File modelPath = new File(basePath + "/" + subPathName);
				
		try {
			// remove previous statistics
			File csvFile = new File(modelPath.getParent() + "/" + langName + "_" + subPathName + "_stats.csv");
			
			List<String[]> header = new LinkedList<String[]>();
			header.add(new String[] {"Model name","EENum count","EClass count","EDataType count","EMFCompare matchCount","Diagnostic count"});
			CSVUtil.csvWriterOneByOne(header, csvFile.toPath(), false);
			
			for ( File srcModelFile : modelPath.listFiles() ) {
				XtextResource srcModel = (XtextResource) srcLangResSet.getResource(
						URI.createURI(srcModelFile.getAbsolutePath()), true);
				System.out.println("\nLoaded model: " + srcModelFile.getName());
				assertTrue( srcModel.isLoaded() );
				
				List<Diagnostic> diagnostics = srcModel.validateConcreteSyntax();
				System.out.println("Diagnostic count = " + diagnostics.size());
				
				List<String[]> stats = computeModelStats(srcLangInj, srcModelFile.getAbsolutePath());
				String[] statLine = new String[6];
				statLine[0] = stats.get(0)[0]; // Model name
				statLine[1] = stats.get(0)[1]; // EENum count
				statLine[2] = stats.get(0)[2]; // EClass count
				statLine[3] = stats.get(0)[3]; // EDataType count
				statLine[4] = stats.get(0)[4]; // EMFCompare count
				statLine[5] = String.valueOf(diagnostics.size()); // Diagnostic count
				stats.set(0, statLine); // replace in list
				
				// store in CSV
				CSVUtil.csvWriterOneByOne(stats, csvFile.toPath(), true);
				
			}// for each model
				
		} catch (Exception e) {
			System.err.println("Failed to load model");
			e.printStackTrace();
		}
	}
	
	@Test
	public void serializeDefLangModels() throws IOException {
		Injector srcLangInj = new srclang.de.itemis.tooling.xturtle.XturtleStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector defLangInj = new deflang.de.itemis.tooling.xturtle.XturtleStandaloneSetup().createInjectorAndDoEMFRegistration();
		String basePath = "models/" + langName + "/";
		
		File defModelsPath = new File(basePath + "DefModels");
		XtextResourceComparatorUtils.recreateDirectory(defModelsPath);
		
		// serialize model of source language using serializer of default language
		for ( File srcModelFile : new File(basePath + "/SrcModels").listFiles() ) {
			resComp.serialize(srcLangInj, defLangInj, srcModelFile.getAbsolutePath(), defModelsPath.getAbsolutePath() + "/" + srcModelFile.getName());
		}
	}// serializeDefLangModels
	
	@Test
	public void serializeTrgLangModels() throws IOException {
		Injector srcLangInj = new srclang.de.itemis.tooling.xturtle.XturtleStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector trgLangInj = new trglang.de.itemis.tooling.xturtle.XturtleStandaloneSetup().createInjectorAndDoEMFRegistration();
		String basePath = "models/" + langName + "/";
		
		File trgModelsPath = new File(basePath + "TrgModels");
		XtextResourceComparatorUtils.recreateDirectory(trgModelsPath);
		
		// serialize model of source language using serializer of target language
		for ( File srcModelFile : new File(basePath + "/SrcModels").listFiles() ) {
			resComp.serialize(srcLangInj, trgLangInj, srcModelFile.getAbsolutePath(), trgModelsPath.getAbsolutePath() + "/" + srcModelFile.getName());
		}
		
	}// serializeTrgLangModels

	@Test
	public void compareModels() {
		Injector srcLangInj = new srclang.de.itemis.tooling.xturtle.XturtleStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector defLangInj = new deflang.de.itemis.tooling.xturtle.XturtleStandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector trgLangInj = new trglang.de.itemis.tooling.xturtle.XturtleStandaloneSetup().createInjectorAndDoEMFRegistration();
		String basePath = "models/" + langName + "/";

		try {
			for ( File srcModelFile : new File(basePath + "/SrcModels").listFiles() ) {
				File trgModelFile = new File(basePath + "/TrgModels/" + srcModelFile.getName());
				File defModelFile = new File(basePath + "/DefModels/" + srcModelFile.getName());

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
	}

}
