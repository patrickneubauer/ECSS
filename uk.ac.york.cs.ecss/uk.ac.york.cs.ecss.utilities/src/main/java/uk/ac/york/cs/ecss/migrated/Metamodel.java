package uk.ac.york.cs.ecss.migrated;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class Metamodel {

	protected Files files;
	protected List<ClassInstance> classInstances;
	protected ResourceSet resourceSet;

	public Metamodel() {
	}

	public Metamodel(ResourceSet resourceSet, Files files) {
		this.resourceSet = resourceSet;
		this.files = files;
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	protected ClassInstance getClassInstance(String name) {
		for (ClassInstance classInstance : classInstances) {
			if (classInstance.getName().equals(name))
				return classInstance;
		}

		return null;
	}

	protected void processEObject(EObject eObject) {
		EStructuralFeature featureName = eObject.eClass().getEStructuralFeature("name");

		if (featureName != null) {
			String name = (String)eObject.eGet(featureName);

			ClassInstance classInstance = getClassInstance(name);

			if (classInstance == null) {
				classInstance = new ClassInstance(name);
				classInstances.add(classInstance);
			}

			classInstance.setAbstract(((EClass)eObject).isAbstract());

			EStructuralFeature featureESuperTypes = eObject.eClass().getEStructuralFeature("eSuperTypes");

			if (featureESuperTypes != null) {
				EList<EClass> superTypes = (EList<EClass>)eObject.eGet(featureESuperTypes);

				for (EClass superType : superTypes) {
					ClassInstance superInstance = getClassInstance(superType.getName());

					if (superInstance == null) {
						superInstance = new ClassInstance(superType.getName());
						classInstances.add(superInstance);
					}

					superInstance.setIsSuperType(true);
				}			        	
			}
		}
	}

}
