package uk.ac.york.cs.ecss.migrated;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class FileFilterContent extends FileFilterDecorator {

	private static int SIZE = 50;

	private ResourceSet resourceSet;

	public FileFilterContent(ResourceSet resourceSet, FileFilter decoratedFilter) {
		super(decoratedFilter);

		this.resourceSet = resourceSet;
	}

	public FileFilterContent(FileFilter decoratedFilter) {
		super(decoratedFilter);
	}

	public boolean satisfy(IFile file) {
		if (getContentSize(file) >= SIZE)
			return decoratedFilter.satisfy(file);
		else
			return false;
	}

	private int getContentSize(IFile file) {
		Resource resource = resourceSet.getResource(URI.createURI(file.getFullPath().toString()), true);

		TreeIterator<EObject> allContents = resource.getAllContents();

		int total = 0;

		while (allContents.hasNext()) {
			allContents.next();
			total++;
		}

		return total;
	}

}
