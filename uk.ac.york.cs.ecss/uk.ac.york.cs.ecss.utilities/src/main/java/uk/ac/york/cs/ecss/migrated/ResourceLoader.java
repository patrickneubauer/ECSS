package uk.ac.york.cs.ecss.migrated;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.xtext.XtextRuntimeModule;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.impl.BinaryGrammarResourceFactoryImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;

import uk.ac.york.cs.ecss.language.EcssLanguageRuntimeModule;

import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class ResourceLoader {
	
	protected ResourceSet rs;
	protected ResourceResolver resolver;
	
	public ResourceLoader(ResourceResolver resolver) {
		this.resolver = resolver;
		this.rs = initResourceSet();
		register();
	}
	
	private void register() {
		switch (resolver.getExtension()) {
		
			case "ecore": 
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
				("ecore", new EcoreResourceFactoryImpl());
				break;
				
			case "xtext":
				TerminalsStandaloneSetup.doSetup();
		        Injector xtextInjector = Guice.createInjector(new XtextRuntimeModule());
		        IResourceFactory xtextResourceFactory = xtextInjector.getInstance(IResourceFactory.class);
//		        IResourceServiceProvider xtextServiceProvider = xtextInjector.getInstance(IResourceServiceProvider.class);
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
				("xtext", xtextResourceFactory);
				break;
				
			case "xtextbin":
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
				("xtextbin", new BinaryGrammarResourceFactoryImpl());
				break;
								
			case "ecss":
				TerminalsStandaloneSetup.doSetup();
		        Injector ecssInjector = Guice.createInjector(new EcssLanguageRuntimeModule());
		        IResourceFactory ecssResourceFactory = ecssInjector.getInstance(IResourceFactory.class);
//		        IResourceServiceProvider ecssServiceProvider = ecssInjector.getInstance(IResourceServiceProvider.class);
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
				("ecss", ecssResourceFactory);
				break;
				
			case "xmi":
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
				("xmi", new XMIResourceFactoryImpl());
				break;
				
			case "xml":
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
				("xml", new XMLResourceFactoryImpl());
				break;
				
			default: 
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
				(Resource.Factory.Registry.DEFAULT_EXTENSION, 
				 new XMIResourceFactoryImpl());
				break;
		}
		
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
