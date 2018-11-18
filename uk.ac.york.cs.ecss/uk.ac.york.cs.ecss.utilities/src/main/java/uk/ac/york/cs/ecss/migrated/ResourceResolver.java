package uk.ac.york.cs.ecss.migrated;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ResourceResolver {
	
	private boolean addFolder;
	private File basePath;
	private String extension;
	private String postfix;
	
	public ResourceResolver(File basePath, String postfix, String extension, boolean addFolder) {
		this.basePath = basePath;
		this.postfix = postfix;
		this.extension = extension;
		this.addFolder = addFolder;
	}

	public static ResourceResolver get(File basePath, String postfix, String extension, boolean addFolder) {
		return new ResourceResolver(basePath, postfix, extension, addFolder);
	}
	
	public List<File> getAllFiles() {
		return getAllFiles(x->true);
	}
	
	public List<File> getAllFiles(FileFilter fileFilter) {
		List<File> ret = new ArrayList<>();
		for (File file: basePath.listFiles()) {
			if (addFolder) {
				File subFile = new File(file.getAbsolutePath()+File.separator+file.getName()+postfix+"."+extension);
				if (!subFile.isDirectory() && subFile.exists() && fileFilter.accept(subFile)) {
					ret.add(subFile);
				}
			} else {
				if (file.getName().endsWith(postfix+"."+extension)) {
					if (!file.isDirectory() && fileFilter.accept(file)) {
						ret.add(file);
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
	
	public File resolve(String name, String postfix) {
		try {
			return new File(basePath.getAbsolutePath()+File.separator+(addFolder?(name+File.separator):"")+name+postfix+"."+extension).getCanonicalFile();
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
