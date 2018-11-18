package uk.ac.york.cs.ecss.migrated;

import org.eclipse.emf.ecore.resource.ResourceSet;

public interface MetamodelInterface {

	public ResourceSet getResourceSet();

	public void updateResourceSet();

	public ClassInstance[] getClassInstances();

}
