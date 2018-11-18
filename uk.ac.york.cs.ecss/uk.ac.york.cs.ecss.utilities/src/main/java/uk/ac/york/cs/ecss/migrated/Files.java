package uk.ac.york.cs.ecss.migrated;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class Files implements FileFilter {

	private int total = 0;

	private FileFilter filter;
	private IProject[] projects;
	private List<IFile> files = new ArrayList<IFile>();

	public Files(FileFilter filter) {
		this.filter = filter;
	}

	public Files(FileFilter filter, IProject[] projects) {
		this.filter = filter;
		this.projects = projects;
	}

	public static IFile getIFileFromURI(URI uri){ 
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot(); 
		URI rootUri = root.getLocationURI(); 
		uri = rootUri.relativize(uri); 
		IPath path = new Path(uri.getPath()); 
		return root.getFile(path); 
	} 

	public IFile[] getFiles() {
		return files.toArray(new IFile[files.size()]);
	}

	public int getTotal() {
		return total;
	}

	public void process() {
		try {
			if (projects.length == 0) {
				projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			}

			for (IProject project : projects) {
				IResource[] resources = project.members();

				for (IResource resource : resources) {
					if (resource instanceof IFile) {
						if (filter.satisfy((IFile)resource)) {
							files.add((IFile)resource);
							total++;							
						}
					} else if (resource instanceof IFolder){
						traverseFolder((IFolder)resource);
					}
				}
			}
		} catch (CoreException e) {
			System.err.println(e.getMessage());
		}
	}

	public boolean satisfy(IFile file) {
		return true;
	}

	private void traverseFolder(IFolder folder) {
		try {
			IResource[] resources = folder.members();

			for (IResource resource : resources) {
				if (resource instanceof IFile) {
					if (filter.satisfy((IFile)resource)) {
						files.add((IFile)resource);
						total++;							
					}
				} else if (resource instanceof IFolder){
					traverseFolder((IFolder)resource);
				}
			}
		} catch (CoreException e) {
			System.err.println(e.getMessage());
		}
	}

}
