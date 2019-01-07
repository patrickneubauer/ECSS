package uk.ac.york.cs.ecss.migrated;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public interface ResourceResolver {

	boolean isAddFolder();
	
	String getPostfix();

	List<File> getAllFiles();

	List<File> getAllFiles(FileFilter fileFilter);

	List<URI> getAllURIs();

	List<URI> getAllURIs(FileFilter filter);

	File resolve(String name);

	File resolve(String name, String postfix);

	URI resolveURI(String name) throws IOException;

	URI resolveURI(String name, String postfix) throws IOException;

	File resolveFromOther(File otherFile);

	File resolveFromOther(File otherFile, String unpostfix);

	File resolveFromOther(File otherFile, String unpostfix, String postfix);

	File resolveFromOther(String otherFileName, String unpostfix, String postfix);

	File resolveFromOther(Resource ecoreFile, String unpostfix, String postfix);

	File resolveFromOther(Resource ecoreFile, String unpostfix);

	File resolveFromOther(Resource ecoreFile);

}