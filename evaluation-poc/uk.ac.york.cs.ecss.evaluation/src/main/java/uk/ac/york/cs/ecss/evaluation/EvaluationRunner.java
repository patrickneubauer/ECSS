package uk.ac.york.cs.ecss.evaluation;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.google.inject.Injector;

import uk.ac.york.cs.ecss.evaluation.statemachine.statemachine.StatemachinePackage;

/**
 * 
 * EMFCompare-based comparison of Xtext languages
 * LEFT = source language
 * RIGHT = target language
 * 
 * PRECONDITION(S):
 * - Register common meta model (see main-method for example)
 * 
 * @author patrickneubauer
 *
 */
public class EvaluationRunner {
	
	public EMFCompare comparator;
	
	public EvaluationRunner() {
		if (comparator == null) {
			initComparator();
		}
	}// constructor
	
	private void initComparator() {
		// Configure EMF Compare
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
	        matchEngineFactory.setRanking(20);
	        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
	        matchEngineRegistry.add(matchEngineFactory);
	    comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();
	}// initComparator
	
	public void serialize(Injector langInj, String modelPath) {
		Serializer serializer = langInj.getInstance(Serializer.class);
		XtextResourceSet langResSet = langInj.getInstance(XtextResourceSet.class);

		try {
			XtextResource modelRes = (XtextResource) langResSet.getResource(
				    URI.createURI(modelPath), true);
			Files.write(Paths.get(modelPath), serializer.serialize(modelRes.getContents().get(0)).getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			System.err.println("Failed to serialize model: " + modelPath);
			e.printStackTrace();
		}
	}// serialize
	
	public Comparison compare(Injector srcLangInj, Injector trgLangInj, String srcLangModelPath, String trgLangModelPath) {
		// setup source and target resource sets
		XtextResourceSet srcLangResSet = srcLangInj.getInstance(XtextResourceSet.class);
		XtextResourceSet trgLangResSet = trgLangInj.getInstance(XtextResourceSet.class);
		srcLangResSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		trgLangResSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		// load source and target resource
		srcLangResSet.getResource(
			    URI.createURI(srcLangModelPath), true);
		trgLangResSet.getResource(
			    URI.createURI(trgLangModelPath), true);
		
		// run comparison and return result
		IComparisonScope scope = this.comparator.createDefaultScope(srcLangResSet, trgLangResSet);
		return this.comparator.compare(scope);
	}// compare

	public static void main(String[] args) {
		
		// Register common meta model (Statemachine.ecore)
		EPackage statemachinePackage = StatemachinePackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(statemachinePackage.getNsURI(), statemachinePackage);
		
		// Establish injectors
		Injector srcLangInj = new org.xtext.example.mydsl1.MyDsl1StandaloneSetup().createInjectorAndDoEMFRegistration();
		Injector trgLangInj = new org.xtext.example.mydsl2.MyDsl2StandaloneSetup().createInjectorAndDoEMFRegistration();
		
		// setup evaluation runner
		EvaluationRunner evaluationRunner = new EvaluationRunner();
		
		// Compare scopes
		Comparison comparison1 = evaluationRunner.compare(srcLangInj, trgLangInj, "models/model1.mydsl1", "models/model1.mydsl2");
		Comparison comparison2 = evaluationRunner.compare(srcLangInj, trgLangInj, "models/model1.mydsl1", "models/model2.mydsl2");
				
		// assert results
		assertTrue( EvaluationHelper.getMatchCount(comparison1) == 6 );
		assertTrue( comparison1.getDifferences().size() == 0 );
		assertTrue( comparison1.getConflicts().size() == 0 );
		
		assertTrue( EvaluationHelper.getMatchCount(comparison2) == 7 );
		assertTrue( comparison2.getDifferences().size() == 1 );
		assertTrue( comparison2.getDifferences().get(0).getKind() == DifferenceKind.DELETE );
		assertTrue( comparison2.getConflicts().size() == 0 );

		// ----------
		
		// serialize model of target language using serializer of source language
		evaluationRunner.serialize(srcLangInj, "models/generated/model2.mydsl1");
		
		// parse model serialized with source language serializer with parser of target language
		Comparison comparison3 = evaluationRunner.compare(srcLangInj, trgLangInj, "models/generated/model2.mydsl1", "models/model2.mydsl2");
		assertTrue( comparison3.getDifferences().size() == 0 );
	
		// print fraction of matching structural features
		System.out.println("Fraction of matching structural features: " + (double)EvaluationHelper.getMatchCount(comparison2) / EvaluationHelper.getMatchCount(comparison3));
	
		System.out.println("Finished !");

	}// main

}// EvaluationPoc
