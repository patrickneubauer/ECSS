/**
 * 
 */
package uk.ac.york.cs.ecss.migrated;

import java.io.File;

/**
 * @author blizzfire
 *
 */
public interface ResourceHandler {
	
	/**
	 * 
	 * @param sourceFile source file string path
	 * @param targetFile target file string path
	 */
	public void handle(String sourceFile, String targetFile);
	
	/**
	 * 
	 * @param sourceFile source file 
	 * @param targetFile target file 
	 */
	public void handle(File sourceFile, File targetFile);

}
