package uk.ac.york.cs.ecss.migrated;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class MetamodelFactory {

	public static final int WITHOUT = 0;
	public static final int WITH = 1;

	public static int selection = WITHOUT;
	public static String extension = "";

	public static IResource metamodel;

	public static MetamodelInterface getMetamodel(ResourceSet resourceSet, Files files) {
		switch(selection) {
		case WITH:
			return new WithMetamodel(resourceSet, files);
		case WITHOUT:
			return new WithoutMetamodel(resourceSet, files);
		default:
			return null;
		}
	}

	public static String getExtension() {
		return extension;		
	}

}
