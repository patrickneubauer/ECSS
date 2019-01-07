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
	
	/**
	 * Create ResourceLoader and register all known factories (Ecore, Xtext, XtextBin, Ecss, Xmi, Xml, Default).
	 * 
	 * @param resolver
	 */
	public ResourceLoader(ResourceResolver resolver) {
		this(resolver, false);
	}
	
	/**
	 * Create ResourceLoader and register single or all known factories
	 * 
	 * @param resolver 
	 * @param registerSingle if true, only single extension factory (based on ResourceResolver) is registered.
	 */
	public ResourceLoader(ResourceResolver resolver, boolean registerSingle) {
		this.resolver = resolver;
		this.rs = initResourceSet();
		if ( registerSingle ) {
			registerSingle();
		} else {
			registerAll();
		}
	}
	
	/**
	 * Register all extension factories (default).
	 */
	private void registerAll() {
		registerEcoreExtensionFactory();
		TerminalsStandaloneSetup.doSetup(); 
		registerXtextExtensionFactory();
		registerXtextBinExtensionFactory();
		registerEcssExtensionFactory();
		registerXmiExtensionFactory();
		registerXmlExtensionFactory();
		registerDefaultExtensionFactory();
	}
	
	private void registerSingle() {
		if ( resolver instanceof SingleExtensionResourceResolver ) {
			switch (((SingleExtensionResourceResolver)resolver).getExtension()) {
			
			case "ecore": 
				registerEcoreExtensionFactory();
				break;
				
			case "xtext":
				TerminalsStandaloneSetup.doSetup(); 
				registerXtextExtensionFactory();
				break;
				
			case "xtextbin":
				TerminalsStandaloneSetup.doSetup(); 
				registerXtextBinExtensionFactory();
				break;
								
			case "ecss":
				TerminalsStandaloneSetup.doSetup(); 
				registerEcssExtensionFactory();
				break;
				
			case "xmi":
				registerXmiExtensionFactory();
				break;
				
			case "xml":
				registerXmlExtensionFactory();
				break;
				
			default: 
				registerDefaultExtensionFactory();
				break;
			}
		}
	}

	private void registerDefaultExtensionFactory() {
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
		 new XMIResourceFactoryImpl());
	}

	private void registerXmlExtensionFactory() {
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		("xml", new XMLResourceFactoryImpl());
	}

	private void registerXmiExtensionFactory() {
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		("xmi", new XMIResourceFactoryImpl());
	}

	private void registerEcssExtensionFactory() {
		Injector ecssInjector = Guice.createInjector(new EcssLanguageRuntimeModule());
		IResourceFactory ecssResourceFactory = ecssInjector.getInstance(IResourceFactory.class);
//		        IResourceServiceProvider ecssServiceProvider = ecssInjector.getInstance(IResourceServiceProvider.class);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		("ecss", ecssResourceFactory);
	}

	private void registerXtextBinExtensionFactory() {
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		("xtextbin", new BinaryGrammarResourceFactoryImpl());
	}

	private void registerXtextExtensionFactory() {
		Injector xtextInjector = Guice.createInjector(new XtextRuntimeModule());
		IResourceFactory xtextResourceFactory = xtextInjector.getInstance(IResourceFactory.class);
//		        IResourceServiceProvider xtextServiceProvider = xtextInjector.getInstance(IResourceServiceProvider.class);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		("xtext", xtextResourceFactory);
	}

	private void registerEcoreExtensionFactory() {
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		("ecore", new EcoreResourceFactoryImpl());
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
