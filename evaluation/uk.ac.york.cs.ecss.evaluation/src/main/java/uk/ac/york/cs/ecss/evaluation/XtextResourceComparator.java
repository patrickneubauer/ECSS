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
import org.eclipse.xtext.mwe.Validator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.google.inject.Injector;

import uk.ac.york.cs.ecss.evaluation.statemachine.statemachine.StatemachinePackage;
import weka.core.pmml.jaxbbindings.ModelVerification;

/**
 * 
 * EMFCompare-based comparison of Xtext languages
 * LEFT = source language
 * RIGHT = target language
 * 
 * PRECONDITION(S):
 * - Register common meta model
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
		} catch (Exception e) {
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

}// EvaluationPoc
