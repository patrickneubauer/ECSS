package uk.ac.york.cs.ecss.api;

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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.york.cs.ecss.migrated.DistanceCalculator;
import uk.ac.york.cs.ecss.migrated.MultiExtensionResourceResolver;
import uk.ac.york.cs.ecss.postproc.regexp.RegexpManager;
import util.XtextSerialization;
import weka.core.DistanceFunction;

public class NormalizingThing {
	
	public static Grammar normalize(File input) {
		MultiExtensionResourceResolver multiExtensionResourceResolver = MultiExtensionResourceResolver.get(Arrays.asList(input.getParentFile()),
				"", true, "ecore", "ecss", "xtext");
		XtextResourceSet rs = new XtextResourceSet();
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		Resource res = rs.getResource(URI.createFileURI(input.getAbsolutePath()),
				true);
		Grammar gr = null;
			gr = (Grammar)rs.getResource(URI.createFileURI(input.getAbsolutePath()),true).getContents().get(0);
		
			
		
		//try (FileOutputStream fos = new FileOutputStream(output)) {
			Set<String> dataTypeNames = new HashSet<String>();
			List<AbstractRule> newRules = RegexpManager.postProcess(gr.getRules(), dataTypeNames);
			if (gr.getRules() != newRules) {
				gr.getRules().clear();
				gr.getRules().addAll(newRules);
			}
			List<AbstractRule> rules = new ArrayList<>(gr.getRules());
			System.out.println("Rules: "+rules);
			gr.getRules().clear();
				
			rules.subList(1, rules.size()).sort((x,y)->{
				return x.getName().compareTo(y.getName());
			});
			gr.getRules().addAll(rules);
			//fos.write(XtextSerialization.getString(gr, Collections.emptyList()).getBytes());
			return gr;
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	public static double getDifference(File first, File second) {
		Grammar firstGr = normalize(first);
		Grammar secondGr = normalize(second);
		OutputStream os = null;
		try {
			os = new FileOutputStream("os.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DistanceCalculator calc =new DistanceCalculator(os);
		calc.calculateDistance(firstGr.eResource(), secondGr.eResource(), 0, 0);
		return calc.getDistance();
//		File nrml1 = new File(first.getAbsolutePath()+".nrml");
//		File nrml2 = new File(second.getAbsolutePath()+".nrml");
//		normalieFile(first, nrml1);
//		normalieFile(second, nrml2);
//		LevenshteinDistance ld = new LevenshteinDistance();
//		try {
//			byte[] b1 = Files.readAllBytes(nrml1.toPath());
//			byte[] b2 = Files.readAllBytes(nrml2.toPath());
//			return ld.apply(new String(b1), new String(b2));
//		} catch (Exception e) {
//			e.printStackTrace();
//			return Double.NaN;
//		}
	}
	
	public static void printDistances(File target, File... src) {
		for (File s: src) {
			System.out.println("Distance of "+s.getName()+": "+getDifference(s, target));
		}
	}
	
	public static void main(String[] args) {
		XtextStandaloneSetup.doSetup();
		printDistances(
				new File("D:\\dev\\workspaceECSS\\de.wwu.md2.framework.MD2\\src\\de\\wwu\\md2\\framework\\MD2\\MD2Lang.xtext"),
				new File("D:\\dev\\workspaceECSS\\org.xtext.example.mddefault\\src\\org\\xtext\\example\\mddefault\\MDDsl.xtext"),
				new File("D:\\default.xtext"),
				new File("D:\\null.xtext"),
				new File("D:\\dev\\ECSS\\uk.ac.york.cs.ecss\\uk.ac.york.cs.ecss.api\\op\\null.xtext"));
	}

}
