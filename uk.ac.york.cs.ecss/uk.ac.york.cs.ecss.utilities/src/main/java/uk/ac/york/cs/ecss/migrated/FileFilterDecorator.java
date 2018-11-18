package uk.ac.york.cs.ecss.migrated;

import org.eclipse.core.resources.IFile;

public abstract class FileFilterDecorator implements FileFilter {

	protected final FileFilter decoratedFilter;

	public FileFilterDecorator(FileFilter decoratedFiles) {
		this.decoratedFilter = decoratedFiles;
	}

	public boolean satisfy(IFile file) {
		return decoratedFilter.satisfy(file);
	}

}
