package uk.ac.york.cs.ecss.migrated;

import org.eclipse.core.resources.IFile;

public class FileFilterDefault implements FileFilter {

	public boolean satisfy(IFile file) {
		return true;
	}

}
