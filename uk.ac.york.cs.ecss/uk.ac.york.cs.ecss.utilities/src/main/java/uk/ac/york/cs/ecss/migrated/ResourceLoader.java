package uk.ac.york.cs.ecss.migrated;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class ResourceLoader {
	
	protected ResourceSet rs;
	protected ResourceResolver resolver;
	
	public ResourceLoader(ResourceResolver resolver) {
		this.resolver = resolver;
		this.rs = initResourceSet();
	}
	
	
	public void loadAll() {
		ResourceResolver res = getResolver();
		for (URI uri: res.getAllURIs()) {
			Resource r = rs.getResource(uri, true);
		}			
	}
	
	protected abstract ResourceSet initResourceSet();
	
	protected ResourceResolver getResolver() {
		return resolver;
	}
	

	public ResourceSet getResourceSet() {
		return rs;
	}

	
	public Resource load(String name) throws IOException {
		return rs.getResource(resolver.resolveURI(name), true);
	}
	
	public Resource getResource(File ecoreMetamodelFile) throws IOException {
		return rs.getResource(URI.createFileURI(ecoreMetamodelFile.getCanonicalPath()), true);
	}
	
	public List<Resource> getResources() {
		return rs.getResources();
	}

}
