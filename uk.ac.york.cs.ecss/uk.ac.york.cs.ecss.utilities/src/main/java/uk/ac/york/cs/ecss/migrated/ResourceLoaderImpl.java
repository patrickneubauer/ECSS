package uk.ac.york.cs.ecss.migrated;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

public class ResourceLoaderImpl extends ResourceLoader {

	public ResourceLoaderImpl(ResourceResolver resolver) {
		super(resolver);
	}


	@Override
	protected ResourceSet initResourceSet() {
		return new XtextResourceSet();
	}



	

}
