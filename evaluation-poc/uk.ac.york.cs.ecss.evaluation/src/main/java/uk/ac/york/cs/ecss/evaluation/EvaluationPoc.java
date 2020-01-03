package uk.ac.york.cs.ecss.evaluation;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import uk.ac.york.cs.ecss.evaluation.statemachine.statemachine.Statemachine;
import uk.ac.york.cs.ecss.evaluation.statemachine.statemachine.StatemachinePackage;

public class EvaluationPoc {

	public static void main(String[] args) {
//		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../uk.ac.york.cs.ecss.evaluation.statemachine/uk.ac.york.cs.ecss.evaluation.statemachine.parent/uk.ac.york.cs.ecss.evaluation.statemachine");
		
		// Register common meta model (Statemachine.ecore)
		EPackage statemachinePackage = StatemachinePackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(statemachinePackage.getNsURI(), statemachinePackage);
		
		// Language 1
		Injector injector1 = new org.xtext.example.mydsl1.MyDsl1StandaloneSetup().createInjectorAndDoEMFRegistration();
		System.out.println("Finished with Language 1 setup !");
		XtextResourceSet resourceSet1 = injector1.getInstance(XtextResourceSet.class);
		resourceSet1.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet1.getResource(
		    URI.createURI("models/model1.mydsl1"), true);
//		Statemachine model1 = (Statemachine) resource.getContents().get(0);
		
		// Language 2 with equal model
		Injector injector2 = new org.xtext.example.mydsl2.MyDsl2StandaloneSetup().createInjectorAndDoEMFRegistration();
		System.out.println("Finished with Language 2 setup !");
		XtextResourceSet resourceSet2 = injector2.getInstance(XtextResourceSet.class);
		resourceSet2.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource2 = resourceSet2.getResource(
		    URI.createURI("models/model1.mydsl2"), true);
//		Statemachine model2 = (Statemachine) resource2.getContents().get(0);
		
		// Language 2 with differentiating model
		XtextResourceSet resourceSet3 = injector2.getInstance(XtextResourceSet.class);
		resourceSet3.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource3 = resourceSet3.getResource(
		    URI.createURI("models/model2.mydsl2"), true);
//		Statemachine model3 = (Statemachine) resource3.getContents().get(0);
		
		// -------
		
		// Configure EMF Compare
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
	        matchEngineFactory.setRanking(20);
	        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
	        matchEngineRegistry.add(matchEngineFactory);
        EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();
		
	    // setup comparison scopes
        IComparisonScope scope1 = EMFCompare.createDefaultScope(resourceSet1, resourceSet2);
		IComparisonScope scope2 = EMFCompare.createDefaultScope(resourceSet1, resourceSet3);
		    
		// Compare the equal models
		Comparison comparison1 = comparator.compare(scope1);
		EList<Diff> diffList1 = comparison1.getDifferences();		
		
		// Compare the different models
		Comparison comparison2 = comparator.compare(scope2);
		EList<Diff> diffList2 = comparison2.getDifferences();
				
		// assert results
		assertTrue(diffList1.size()==0);
		assertTrue(diffList2.size()==1);
		assertTrue(diffList2.get(0).getKind()==DifferenceKind.DELETE);

		System.out.println("Finished comparison !");

	}

}
