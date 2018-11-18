package uk.ac.york.cs.ecss.migrated;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class Instance {
	
	private static final Logger logger = LogManager.getLogger(Instance.class);


	private ClassInstance[] classInstances;
	private Files files;
	private ResourceSet resourceSet;

	public Instance(MetamodelInterface metamodel, Files files) {
		resourceSet = metamodel.getResourceSet();
		classInstances = metamodel.getClassInstances();
		this.files = files;
	}

	public ClassInstance[] getClassInstances() {
		return classInstances;
	}

	public int getTotal() {
		return classInstances.length;
	}

	public void process() {
		for (IFile file : files.getFiles()) {
			Set<String> uniqueNames = new HashSet<String>();

			Resource resource = resourceSet.getResource(URI.createURI(file.getFullPath().toString()), true);

			TreeIterator<EObject> contents = resource.getAllContents();

			int count = 0;
			
			while (contents.hasNext()) {
				EObject next = contents.next();

				getClassInstance(next.eClass().getName()).incrementAll();

				uniqueNames.add(next.eClass().getName());
				
				count++;
			}
			
			logger.debug(count);

			for (String name : uniqueNames) {
				getClassInstance(name).incrementFile();				
			}
		}
	}

	private ClassInstance getClassInstance(String name) {
		for (ClassInstance classInstance : classInstances) {
			if (classInstance.getName().equals(name))
				return classInstance;
		}

		return null;
	}

}
