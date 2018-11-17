package util;

import com.google.inject.Injector;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;

public class XtextSerialization {

	private static XtextStandaloneSetup xtextSetup = new XtextStandaloneSetup();
	private static Injector xtextInjector = xtextSetup.createInjectorAndDoEMFRegistration();
	private static XtextFactory xfact = XtextFactory.eINSTANCE;
	
	public static Grammar getGrammar(String fullGrammar) {
		XtextResourceSet rs = xtextInjector.getInstance(XtextResourceSet.class);
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource regExpResource = rs.createResource(URI.createURI("file:/grammar.xtext"));
		ByteArrayInputStream in = new ByteArrayInputStream(fullGrammar.getBytes());
		try {
			regExpResource.load(in, rs.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (regExpResource.getContents().isEmpty()) {
			System.err.println("Could not load grammar "+fullGrammar);
			return null;
		}
		return (Grammar)regExpResource.getContents().get(0);
	}

	public static String getString(Grammar gr, Collection<String> dataTypeNames) {
		XtextResourceSet rs = xtextInjector.getInstance(XtextResourceSet.class);
		//rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource regExpResource = rs.createResource(URI.createURI("file:/grammar.xtext"));
		gr = EcoreUtil.copy(gr);
		//TODO: Why doesn't this work??
		List<String> usedGrammars = new ArrayList<String>();
		for (Grammar g: gr.getUsedGrammars()) {
			usedGrammars.add(g.getName());
		}
		gr.getUsedGrammars().clear();
		regExpResource.getContents().add(gr);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			regExpResource.save(out, Collections.emptyMap());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		String str = new String(out.toByteArray());
		List<String> strs = Arrays.asList(str.split("\n"));
		/*strs.replaceAll(x->{
			//TODO: Why isn't this generated with the default serialization???
			if (x.trim().endsWith(":")) {
				String retx = x.trim();
				String[] split = retx.split(" ",2);
				if (dataTypeNames.contains(split[0]) && split.length>1 && !split[1].trim().equals(":")) {
					x = split[0] +" returns "+split[1];
				}
			}
			return x;
		});*/
		//Don't know, but I have used this already for the grammarCreator ...
		postProcessStrings(strs);
		StringBuilder retStr = new StringBuilder();
		for (int i = 0; i < strs.size(); ++i) {
			if (i>0) {retStr.append("\n");}
			retStr.append(strs.get(i));
			if (i == 0 && !usedGrammars.isEmpty()) {
				retStr.append(" with "+usedGrammars.get(0));
				for (int j = 1; j < usedGrammars.size(); ++j) {
					retStr.append(", "+usedGrammars.get(j));
				}
			}
		}		
		return retStr.toString();
	}

	// ----------- MOVED FROM GrammarCreator START ---------------
	public static void postProcessStrings(List<String> str) {
		for (int i = 0; i < str.size(); ++i) {
			String line = str.get(i);
			if (line.isEmpty()) {continue;}
			if (Character.isWhitespace(line.charAt(0))) {
				continue;
			}
			if (!line.endsWith(":")) {
				continue;
			}
			if (line.startsWith("enum ") || line.startsWith("terminal ") || line.startsWith("import ") || line.startsWith("grammar ")) {
				continue;
			}
			String[] split = line.split(" ",2);
			str.set(i, split[0]+((split.length>1)?(" returns "+split[1]):""));
		}
	}
	// ----------- MOVED FROM GrammarCreator END ---------------

}
