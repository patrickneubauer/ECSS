package uk.ac.york.cs.ecss.migrated;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class WithoutMetamodel extends Metamodel implements MetamodelInterface {

	public WithoutMetamodel(ResourceSet resourceSet, Files files) {
		super(resourceSet, files);
	}

	public void updateResourceSet() {
	}

	public ClassInstance[] getClassInstances() {
		if (classInstances == null) {
			classInstances = new ArrayList<ClassInstance>();

			Resource resource = resourceSet.getResource(URI.createURI(files.getFiles()[0].getFullPath().toString()), true);

			TreeIterator<EObject> allContents = resource.getAllContents();

			EList<EClassifier> classifiers = null;

			if (allContents.hasNext()) {
				EObject next = allContents.next();

				EPackage pkg = next.eClass().getEPackage();

				classifiers = pkg.getEClassifiers();
			}

			for (EClassifier classifier : classifiers) {
				if (classifier instanceof EClass)
					processEObject(classifier);
			}
		}

		return classInstances.toArray(new ClassInstance[classInstances.size()]);
	}

}
