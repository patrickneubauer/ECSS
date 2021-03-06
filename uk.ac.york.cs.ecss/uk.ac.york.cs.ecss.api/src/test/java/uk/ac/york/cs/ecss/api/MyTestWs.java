package uk.ac.york.cs.ecss.api;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import uk.ac.york.cs.ecss.migrated.EcoreNameRelation;
import uk.ac.york.cs.ecss.migrated.EcoreNameRelationDistanceManager;
import uk.ac.york.cs.ecss.migrated.MultiExtensionResourceResolver;
import uk.ac.york.cs.ecss.migrated.ResourceLoaderImpl;
import uk.ac.york.cs.ecss.migrated.ResourceResolver;
import util.XtextSerialization;

public class MyTestWs {
	
	public static void main(String[] args) {
		final String ECORE_PATH = "D:\\dev\\ECSS\\data-example\\";
		final String ECORE_FILE_NAME = "spacetransportationservice.ecore";
		File ecssModelFile = new File("D:\\dev\\ECSS\\styles\\wsawarenocomment.ecss");
		File metamodelFile = new File(ECORE_PATH + ECORE_FILE_NAME);
		File xtextGrammarFile = new File(ECORE_PATH + ECORE_FILE_NAME.replace(".ecore", "_GEN_"+new Date().getTime()+".xtext"));

		assertFalse( Files.exists( xtextGrammarFile.toPath() ) );
		MainLanguageResourcesGenerator mlrc = new MainLanguageResourcesGenerator(new File("report"), new File("op").toPath(), "opLang", "opL", Arrays.asList("ol"));
		EcoreNameRelation relation;
		List<File> basePaths = new LinkedList<File>();
		//basePaths.add(new File(INPUT_DATA_FOLDER+OUTPUT_PATH));
		basePaths.add(new File(ECORE_PATH));
		basePaths.add(new File(ecssModelFile.getParent()));
		mlrc.setResourceResolver(MultiExtensionResourceResolver.get(basePaths,
				"", true, "ecore", "ecss", "xtext"));

		Resource xtextGrammar = mlrc.generateAndSerializeGrammar(metamodelFile, ecssModelFile);
		try (FileOutputStream fos = new FileOutputStream(xtextGrammarFile)) {
			xtextGrammar.save(fos, java.util.Collections.emptyMap());
			List<String> lines = Files.readAllLines(xtextGrammarFile.toPath());
			XtextSerialization.postProcessStrings(lines);
			Files.write(xtextGrammarFile.toPath(), lines);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
