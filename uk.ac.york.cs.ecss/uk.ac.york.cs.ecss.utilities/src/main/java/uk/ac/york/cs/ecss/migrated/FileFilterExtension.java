package uk.ac.york.cs.ecss.migrated;

import org.eclipse.core.resources.IFile;

public class FileFilterExtension extends FileFilterDecorator {

	public FileFilterExtension(FileFilter _decoratedFilter) {
		super(_decoratedFilter);
	}

	public boolean satisfy(IFile file) {
		if (file.getName().endsWith(MetamodelFactory.getExtension())) {
			return decoratedFilter.satisfy(file);
		} else {
			return false;
		}
	}

}
