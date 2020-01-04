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
public class XtextResourceComparator {
	
	public EMFCompare comparator;
	
	public XtextResourceComparator() {
		if (comparator == null) {
			initComparator();
		}
	}// constructor
	
	/**
	 * Initializer for EMFCompare (configures match engine etc)
	 */
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
	
	/**
	 * Serializer for instances of XtextResource based on injected language
	 * 
	 * @param srcLangInj Xtext-based source language injector
	 * @param trgLangInj Xtext-based target language injector
	 * @param srcModelPath source language-based model path
	 * @param trgModelPath target language-based model path
	 */
	public void serialize(Injector srcLangInj, Injector trgLangInj, String srcModelPath, String trgModelPath) {
		Serializer trgLangSerializer = trgLangInj.getInstance(Serializer.class);
		XtextResourceSet srcLangResSet = srcLangInj.getInstance(XtextResourceSet.class);

		try {
			XtextResource srcModel = (XtextResource) srcLangResSet.getResource(
				    URI.createURI(srcModelPath), true);
			Files.deleteIfExists(Paths.get(trgModelPath));
			Files.write(Paths.get(trgModelPath), trgLangSerializer.serialize(srcModel.getContents().get(0)).getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			System.err.println("Failed to serialize model: " + srcModelPath);
			e.printStackTrace();
		}
	}// serialize
	
	/**
	 * EMFCompare-based comparison between Xtext-based source language model and Xtext-based target language model
	 * 
	 * @param srcLangInj Xtext-based source language injector
	 * @param trgLangInj Xtext-based target language injector
	 * @param srcLangModelPath source language-based model path
	 * @param trgLangModelPath target language-based model path
	 * @return
	 */
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
		XtextResourceComparator evaluationRunner = new XtextResourceComparator();
		
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
		evaluationRunner.serialize(trgLangInj, srcLangInj, "models/model2.mydsl2", "models/generated/model2.mydsl1");
		
		// parse model serialized with source language serializer with parser of target language
		Comparison comparison3 = evaluationRunner.compare(srcLangInj, trgLangInj, "models/generated/model2.mydsl1", "models/model2.mydsl2");
		assertTrue( comparison3.getDifferences().size() == 0 );
	
		// print fraction of matching structural features
		System.out.println("Fraction of matching structural features: " + (double)EvaluationHelper.getMatchCount(comparison2) / EvaluationHelper.getMatchCount(comparison3));
	
		System.out.println("Finished !");

	}// main

}// EvaluationPoc
