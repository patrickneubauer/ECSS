package uk.ac.york.cs.ecss.migrated;

import org.eclipse.core.resources.IFile;

public interface FileFilter {

	public boolean satisfy(IFile file);

}
