package uk.ac.york.cs.ecss.migrated;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class WithMetamodel extends Metamodel implements MetamodelInterface {

	public WithMetamodel(ResourceSet resourceSet, Files files) {
		super(resourceSet, files);
	}

	public void updateResourceSet() {
		Collection<EPackage> packages = EcoreUtil.getObjectsByType(getResource().getContents(), EcorePackage.eINSTANCE.getEPackage());

		for (EPackage mm : packages) {
			mm.setNsURI(mm.getName());
			resourceSet.getPackageRegistry().put(mm.getNsURI(), mm);

			for (EPackage mm2 : mm.getESubpackages()) {
				mm2.setNsURI(mm2.getName());
				resourceSet.getPackageRegistry().put(mm2.getNsURI(), mm2);						
			}
		}
	}

	private Resource getResource() {
		Resource res = resourceSet.createResource(URI.createURI(MetamodelFactory.metamodel.getFullPath().toString()));

		try {
			res.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return res;
	}

	public ClassInstance[] getClassInstances() {
		if (classInstances == null) {
			classInstances = new ArrayList<ClassInstance>();

			TreeIterator<EObject> allContents = getResource().getAllContents();

			while (allContents.hasNext()) {
				EObject eObject = allContents.next();

				if (eObject.eClass().getName().equals("EClass")) {
					processEObject(eObject);
				}
			}
		}

		return classInstances.toArray(new ClassInstance[classInstances.size()]);
	}

}
