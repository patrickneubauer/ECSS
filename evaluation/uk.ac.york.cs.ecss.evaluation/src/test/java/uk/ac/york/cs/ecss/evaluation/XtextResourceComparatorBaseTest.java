package uk.ac.york.cs.ecss.evaluation;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xtext.GrammarResource;

import com.google.inject.Injector;

import uk.ac.york.cs.ecss.utilities.CSVUtil;

public class XtextResourceComparatorBaseTest {

	protected static XtextResourceComparator resComp;

	public XtextResourceComparatorBaseTest() {
		super();
	}

	protected List<String[]> computeModelStats(Injector langInj, String langModelPath) {
			List<String[]> result = new LinkedList<String[]>();
			
			// setup resource set
			XtextResourceSet langResSet = langInj.getInstance(XtextResourceSet.class);
			langResSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			
			// load resource
			Resource resource = langResSet.getResource(
				    URI.createURI(langModelPath), true);
			
			List<EObject> eObjectList = EcoreUtil2.eAllContentsAsList(resource);
			
			int enumCount = 0;
			int eClassCount = 0;
			int eDataTypeCount = 0;
			int eStrFeaCount = 0;
			
			for ( EObject eObject : eObjectList ) {
				EClass eClass = eObject.eClass();
				EList<EStructuralFeature> eClassStrFeaList = eClass.getEAllStructuralFeatures();
				eStrFeaCount = eStrFeaCount + eClassStrFeaList.size();
				for (EStructuralFeature strFea : eClassStrFeaList) {
					if (strFea.getEType() instanceof EEnum) {
						++enumCount;
					}
					else if (strFea.getEType() instanceof EClass) {
						++eClassCount;
					}
					else if (strFea.getEType() instanceof EDataType) {
						++eDataTypeCount;
					} else {
						System.out.println();
					}
				}
			}// for each EObject
			
			System.out.println("EStructuralFeature count = " + eStrFeaCount);
			System.out.println("EENum count = " + enumCount);
			System.out.println("EClass count = " + eClassCount);
			System.out.println("EDataType count = " + eDataTypeCount);
					
			// run comparison and return result
			Comparison comparison = resComp.compare(langInj, langInj, langModelPath, langModelPath);
			int matchCount = XtextResourceComparatorUtils.getMatchCount(comparison);
	
			System.out.println("EMFCompare matchCount = " + matchCount);
			System.out.println("\n");
			
			result.add(new String[] {new File(langModelPath).getName(), String.valueOf(eStrFeaCount), String.valueOf(enumCount), String.valueOf(eClassCount),String.valueOf(eDataTypeCount),String.valueOf(matchCount)});
			return result;
			
	}// computeModelStats
	
	protected List<String[]> computeGrammarStats(Injector langInj, String langModelPath) {
		List<String[]> result = new LinkedList<String[]>();
		
		// setup resource set
		XtextResourceSet langResSet = langInj.getInstance(XtextResourceSet.class);
		langResSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		// load resource
		Resource resource = langResSet.getResource(
			    URI.createURI(langModelPath), true);
		
		List<EObject> eObjectList = EcoreUtil2.eAllContentsAsList(resource);
		
		int parserRuleCount = 0;
		int enumRuleCount = 0;
		int terminalRuleCount = 0;
		int typeRefCount = 0;
		int keywordCount = 0;
		int alternativesCount = 0;
		int groupCount = 0;
		int assignmentCount = 0;
		int actionCount = 0;
		int otherCount = 0;
		
		for ( EObject eObject : eObjectList ) {
			EClass eClass = eObject.eClass();
			if (eClass.getName().contentEquals("ParserRule")) {
				++parserRuleCount;
			} else if (eClass.getName().contentEquals("EnumRule")) {
				++enumRuleCount;
			} else if (eClass.getName().contentEquals("TerminalRule")) {
				++terminalRuleCount;
			} else if (eClass.getName().contentEquals("TypeRef")) {
				++typeRefCount;
			} else if (eClass.getName().contentEquals("Keyword")) {
				++keywordCount;
			} else if (eClass.getName().contentEquals("Alternatives")) {
				++alternativesCount;
			} else if (eClass.getName().contentEquals("Group")) {
				++groupCount;
			} else if (eClass.getName().contentEquals("Assignment")) {
				++assignmentCount;
			} else if (eClass.getName().contentEquals("Action")) {
				++actionCount;
			} else {
				++otherCount;
			}
		
		}// for each EObject
		
		System.out.println("ParserRule count = " + parserRuleCount);
		System.out.println("EnumRule count = " + enumRuleCount);
		System.out.println("TerminalRule count = " + terminalRuleCount);
		System.out.println("TypeRef count = " + typeRefCount);
		System.out.println("Keyword count = " + keywordCount);
		System.out.println("Alternatives count = " + alternativesCount);
		System.out.println("Group count = " + groupCount);
		System.out.println("Assignment count = " + assignmentCount);
		System.out.println("Action count = " + actionCount);
		System.out.println("Other count = " + otherCount);
				
		result.add(new String[] {
				new File(langModelPath).getName(), 
				String.valueOf(parserRuleCount), 
				String.valueOf(enumRuleCount), 
				String.valueOf(terminalRuleCount), 
				String.valueOf(typeRefCount), 
				String.valueOf(keywordCount),
				String.valueOf(alternativesCount), 
				String.valueOf(groupCount), 
				String.valueOf(assignmentCount), 
				String.valueOf(actionCount),
				String.valueOf(otherCount)
		});
		return result;
		
	}// computeGrammarStats
	
	public void loadGrammars(String subPathName) {
		Injector langInj = new org.eclipse.xtext.XtextStandaloneSetup().createInjectorAndDoEMFRegistration();

		XtextResourceSet srcLangResSet = langInj.getInstance(XtextResourceSet.class);
		String basePath = "grammars/";
		File modelPath = new File(basePath + subPathName);
				
		try {
			// remove previous statistics
			File csvFile = new File(modelPath.getParent() + "/" + subPathName + "_stats.csv");
			
			List<String[]> header = new LinkedList<String[]>();
			header.add(new String[] {
					"Model name",
					"ParserRule count",
					"EnumRule count",
					"TerminalRule count",
					"TypeRef count",
					"Keyword count",
					"Alternatives count",
					"Group count",
					"Assignment count",
					"Action count",
					"Diagnostic count"
			});
			CSVUtil.csvWriterOneByOne(header, csvFile.toPath(), false);
			
			for ( File srcGrammarFile : modelPath.listFiles() ) {
				GrammarResource srcModel = (GrammarResource) srcLangResSet.getResource(
						URI.createURI(srcGrammarFile.getAbsolutePath()), true);
				System.out.println("\nLoaded model: " + srcGrammarFile.getName());
				assertTrue( srcModel.isLoaded() );
				
				List<Diagnostic> diagnostics = srcModel.validateConcreteSyntax();
				System.out.println("Diagnostic count = " + diagnostics.size());
				
				List<String[]> stats = computeGrammarStats(langInj, srcGrammarFile.getAbsolutePath());
				String[] statLine = new String[11];
				statLine[0] = stats.get(0)[0]; // Model name
				statLine[1] = stats.get(0)[1]; // ParserRuleImpl count
				statLine[2] = stats.get(0)[2]; // EnumRuleImpl count
				statLine[3] = stats.get(0)[3]; // TerminalRuleImpl count
				statLine[4] = stats.get(0)[4]; // TypeRefImpl count
				statLine[5] = stats.get(0)[5]; // KeywordImpl count
				statLine[6] = stats.get(0)[6]; // Alternatives count
				statLine[7] = stats.get(0)[7]; // Group count
				statLine[8] = stats.get(0)[8]; // Assignment count
				statLine[9] = stats.get(0)[9]; // Action count
				statLine[10] = String.valueOf(diagnostics.size()); // Diagnostic count
				stats.set(0, statLine); // replace in list
				
				// store in CSV
				CSVUtil.csvWriterOneByOne(stats, csvFile.toPath(), true);
				
			}// for each model
				
		} catch (Exception e) {
			System.err.println("Failed to load model");
			e.printStackTrace();
		}
	}// loadGrammars
	
	public void loadLangModels(Injector langInj, String langName, String subPathName) {
		XtextResourceSet srcLangResSet = langInj.getInstance(XtextResourceSet.class);
		String basePath = "models/" + langName + "/";
		File modelPath = new File(basePath + "/" + subPathName);
				
		try {
			// remove previous statistics
			File csvFile = new File(modelPath.getParent() + "/" + langName + "_" + subPathName + "_stats.csv");
			
			List<String[]> header = new LinkedList<String[]>();
			header.add(new String[] {"Model name","EStructuralFeature count","EENum count","EClass count","EDataType count","EMFCompare matchCount","Diagnostic count"});
			CSVUtil.csvWriterOneByOne(header, csvFile.toPath(), false);
			
			for ( File srcModelFile : modelPath.listFiles() ) {
				XtextResource srcModel = (XtextResource) srcLangResSet.getResource(
						URI.createURI(srcModelFile.getAbsolutePath()), true);
				System.out.println("\nLoaded model: " + srcModelFile.getName());
				assertTrue( srcModel.isLoaded() );
				
				List<Diagnostic> diagnostics = srcModel.validateConcreteSyntax();
				System.out.println("Diagnostic count = " + diagnostics.size());
				
				List<String[]> stats = computeModelStats(langInj, srcModelFile.getAbsolutePath());
				String[] statLine = new String[7];
				statLine[0] = stats.get(0)[0]; // Model name
				statLine[1] = stats.get(0)[1]; // EStructuralFeature count
				statLine[2] = stats.get(0)[2]; // EENum count
				statLine[3] = stats.get(0)[3]; // EClass count
				statLine[4] = stats.get(0)[4]; // EDataType count
				statLine[5] = stats.get(0)[5]; // EMFCompare count
				statLine[6] = String.valueOf(diagnostics.size()); // Diagnostic count
				stats.set(0, statLine); // replace in list
				
				// store in CSV
				CSVUtil.csvWriterOneByOne(stats, csvFile.toPath(), true);
				
			}// for each model
				
		} catch (Exception e) {
			System.err.println("Failed to load model");
			e.printStackTrace();
		}
	}// loadLangModels

}// XtextResourceComparatorBaseTest