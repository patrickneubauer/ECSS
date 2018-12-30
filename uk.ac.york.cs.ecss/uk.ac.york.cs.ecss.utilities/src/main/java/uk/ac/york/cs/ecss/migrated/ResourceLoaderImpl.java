package uk.ac.york.cs.ecss.migrated;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ResourceLoaderImpl extends ResourceLoader {

	public ResourceLoaderImpl(ResourceResolver resolver) {
		super(resolver);
	}


	@Override
	protected ResourceSet initResourceSet() {
		return new ResourceSetImpl();
	}



	

}
