package uk.ac.york.cs.ecss.migrated;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MultiExtensionResourceResolver implements ResourceResolver {
	
	private boolean addFolder;
	private List<File> basePaths = new LinkedList<File>();
	private List<String> extensions = new LinkedList<String>();
	public boolean isAddFolder() {
		return addFolder;
	}

	public List<File> getBasePath() {
		return basePaths;
	}

	public List<String> getExtensions() {
		return extensions;
	}

	public String getPostfix() {
		return postfix;
	}

	private String postfix;
	
	public MultiExtensionResourceResolver(List<File> basePaths, String postfix, boolean addFolder, String... extensions) {
		this.basePaths = basePaths;
		this.postfix = postfix;
		for ( String extension : extensions ) {
			this.extensions.add(extension);
		}
		this.addFolder = addFolder;
	}

	public static MultiExtensionResourceResolver get(List<File> basePaths, String postfix, boolean addFolder, String... extensions) {
		return new MultiExtensionResourceResolver(basePaths, postfix, addFolder, extensions);
	}
	
	public List<File> getAllFiles() {
		return getAllFiles(x->true);
	}
	
	/**
	 * Returns all files that match passed {@param fileFilter} and defined file extensions
	 * 
	 * @param fileFilter
	 * @return
	 */
	public List<File> getAllFiles(FileFilter fileFilter) {
		List<File> ret = new ArrayList<>();
		for ( File directory : basePaths ) {
			for (File file: directory.listFiles()) {
				if (addFolder && file.isDirectory()) {
					
					for ( String extension : extensions ) {
						File subFile = new File(file.getAbsolutePath()+File.separator+file.getName()+postfix+"."+extension);
						if ( subFile.exists() ) {
							if (!subFile.isDirectory() && subFile.exists() && fileFilter.accept(subFile)) {
								ret.add(subFile);
							} else {
								if (file.getName().endsWith(postfix+"."+extension)) {
									if (!file.isDirectory() && fileFilter.accept(file)) {
										ret.add(file);
									}
								}
							}
						}
					}
				}
			}
		}
		return ret;
	}
	
	public List<URI> getAllURIs() {
		return getAllURIs(x->true);
		
	}

	public List<URI> getAllURIs(FileFilter filter) {
		List<File> files = getAllFiles(filter);
		List<URI> uris = new ArrayList<>();
		files.forEach(x->{
			try {
				uris.add(URI.createFileURI(x.getCanonicalPath()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		return uris;
	}
	
	public File resolve(String name) {
		return resolve(name,postfix);
	}
	
	/**
	 * Returns the first file that matches one of the defined extensions
	 * 
	 * @param name
	 * @param postfix
	 * @return
	 */
	public File resolve(String name, String postfix) {
		try {
			for ( String extension : extensions ) {
				for ( File directory : basePaths ) {
					File file = new File(directory.getAbsolutePath()+File.separator+(addFolder?(name+File.separator):"")+name+postfix+"."+extension);
					if ( file.exists() ) {
						return file.getCanonicalFile();
					}
				}
			}
			return null; // does not exist
			
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public URI resolveURI(String name) throws IOException {
		return URI.createFileURI(resolve(name).getCanonicalPath());
	}

	public URI resolveURI(String name, String postfix) throws IOException {
		return URI.createFileURI(resolve(name, postfix).getCanonicalPath());
	}
	
	public File resolveFromOther(File otherFile) {
		return resolveFromOther(otherFile, "");
	}
	
	public File resolveFromOther(File otherFile, String unpostfix) {
		return resolveFromOther(otherFile.getName(), unpostfix, postfix);
	}
	
	public File resolveFromOther(File otherFile, String unpostfix, String postfix) {
		return resolveFromOther(otherFile.getName(), unpostfix, postfix);
	}
	
	public File resolveFromOther(String otherFileName, String unpostfix, String postfix) {
		String name = otherFileName;
		int lind = name.lastIndexOf('.');
		if (lind != -1) {
			name = name.substring(0,lind);
		}
		if (name.endsWith(unpostfix)) {
			name = name.substring(0,name.length()-unpostfix.length());
		}
		return resolve(name,postfix);
	}
	

	public File resolveFromOther(Resource ecoreFile, String unpostfix, String postfix) {
		return resolveFromOther(ecoreFile.getURI().lastSegment(),unpostfix, postfix);
	}

	public File resolveFromOther(Resource ecoreFile, String unpostfix) {
		return resolveFromOther(ecoreFile.getURI().lastSegment(),unpostfix, postfix);
	}
	
	public File resolveFromOther(Resource ecoreFile) {
		return resolveFromOther(ecoreFile.getURI().lastSegment(),"",postfix);
	}


}
