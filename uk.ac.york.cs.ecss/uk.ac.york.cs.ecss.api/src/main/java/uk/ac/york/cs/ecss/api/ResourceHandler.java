package uk.ac.york.cs.ecss.api;

import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.io.Files;

import uk.ac.york.cs.ecss.migrated.MultiExtensionResourceResolver;
import uk.ac.york.cs.ecss.migrated.ResourceLoader;
import uk.ac.york.cs.ecss.migrated.ResourceLoaderImpl;
import uk.ac.york.cs.ecss.migrated.ResourceResolver;

public class ResourceHandler {
	
	public static void main(String args[]) {
		List<File> basePaths = new LinkedList<File>();
		//basePaths.add(new File(INPUT_DATA_FOLDER+OUTPUT_PATH));
		String ECORE_PATH = "";
		String XTEXT_PATH = "";
		basePaths.add(new File(ECORE_PATH));
		
		ResourceResolver resourceResolver = MultiExtensionResourceResolver.get(basePaths,
				"", true, "ecore", "xtext");
		
		ResourceLoader resourceLoader = new ResourceLoaderImpl(resourceResolver);

		File targetFile = new File(XTEXT_PATH);

		
		Resource r = resourceLoader.getResourceSet().createResource(URI.createFileURI(targetFile.toString()));
		
//		FileOutputStream fos = new FileOutputStream(r.getURI().toFileString());
////		fos.write(generated.string.getBytes());
//		fos.flush();
//		fos.close();
		
	}

}
