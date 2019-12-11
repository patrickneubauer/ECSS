package uk.ac.york.cs.ecss.api;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.internal.core.nd.java.TypeRef;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import at.big.tuwien.normalizer.Normalizer;
import uk.ac.york.cs.ecss.migrated.DistanceCalculator;
import uk.ac.york.cs.ecss.migrated.MultiExtensionResourceResolver;
import uk.ac.york.cs.ecss.postproc.regexp.RegexpManager;
import util.XtextSerialization;
import weka.core.DistanceFunction;

public class NormalizingTextThing {
	
	public static Resource normalize(File metaModel, File input) {
		MultiExtensionResourceResolver multiExtensionResourceResolver = MultiExtensionResourceResolver.get(Arrays.asList(input.getParentFile()),
				"", true, "ecore", "ecss", "xtext");
		
		XtextResourceSet rs = new XtextResourceSet();
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		XtextPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		Resource ecoreRes = rs.getResource(URI.createFileURI(input.getAbsolutePath()), true);
		EcoreUtil2.resolveAll(ecoreRes);
		
		Resource ecoreResource = rs.getResource(URI.createURI(EcoreFactory.eINSTANCE.getEPackage().getNsURI()), true);
		try {
			ecoreResource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Resource res = rs.getResource(URI.createFileURI(input.getAbsolutePath()),
				true);
		Grammar gr = null;
			gr = (Grammar)rs.getResource(URI.createFileURI(input.getAbsolutePath()),true).getContents().get(0);
			EcoreUtil2.resolveAll(gr);
		
		Normalizer.normalizeGrammar(gr);
		gr.getMetamodelDeclarations().clear();
		gr.eAllContents().forEachRemaining(x->{
			if (x instanceof org.eclipse.xtext.TypeRef) {
				
				org.eclipse.xtext.TypeRef tr = (org.eclipse.xtext.TypeRef)x;
				tr.setClassifier(EcorePackage.eINSTANCE.getEPackage());
				
			}
		});
			//fos.write(XtextSerialization.getString(gr, Collections.emptyList()).getBytes());
			return res;
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	public static double getDifference(File metaModel, File first, File second) {
		String nrm1 = null;
		String nrm2 = null;
		
		Resource firstGr = normalize(metaModel, first);
		try {
//			ByteArrayOutputStream bos = new ByteArrayOutputStream();
//			firstGr.save(bos, Collections.emptyMap());
//			nrm1 = new String(bos.toByteArray());
			nrm1 = XtextSerialization.getString((Grammar)firstGr.getContents().get(0), Collections.emptyList());
			nrm1 = nrm1.replaceAll("\\s+", "").replace("\n", "").replaceAll("/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\n])))*\\*+/", "");
			System.out.println("Generated "+nrm1);
			} catch (Exception e) {e.printStackTrace();}
		Resource secondGr = normalize(metaModel, second);
		
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			//secondGr.save(bos, Collections.emptyMap());
			//nrm2 = new String(bos.toByteArray());
			nrm2 = XtextSerialization.getString((Grammar)secondGr.getContents().get(0), Collections.emptyList());
			nrm2 = nrm2.replaceAll("\\s+", "").replace("\n", "").replaceAll("/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\n])))*\\*+/", "");
			System.out.println("Generated 2 "+nrm2);	
		} catch (Exception e) {e.printStackTrace();}
		
		
		LevenshteinDistance ld = new LevenshteinDistance();
		try {
			return ld.apply(nrm1,nrm2);
		} catch (Exception e) {
			e.printStackTrace();
			return Double.NaN;
		}
	}
	
	public static void printDistances(File metaModel, File target, File... src) {
		try (FileOutputStream distances = new FileOutputStream("distances.txt")) {
			for (File s: src) {
				String str = "Distance of "+s.getName()+" to "+target.getName()+": "+getDifference(metaModel, s, target);
				System.out.println(str);
				distances.write((str+"\n").getBytes());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		XtextStandaloneSetup.doSetup();
		System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
		final String ECORE_PATH = "D:\\dev\\ECSS\\data-example\\";
		final String ECORE_FILE_NAME = "spacetransportationservice.ecore";
		File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);
		
		printDistances(
				metamodelFile,
				new File("D:\\dev\\ECSS\\data-example\\spacetransportationservice_GENNOAO_1567699625400.xtext"),
				new File("D:\\dev\\ECSS\\data-example\\spacetransportationservice_GENNOAO_1567699417223.xtext"),
				new File("D:\\dev\\ECSS\\data-example\\spacetransportationservice_NOAOBASIC_1567688840699.xtext")
				);
	}

}
