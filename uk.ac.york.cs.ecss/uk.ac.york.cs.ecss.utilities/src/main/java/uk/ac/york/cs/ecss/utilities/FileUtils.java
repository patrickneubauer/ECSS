package uk.ac.york.cs.ecss.utilities;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;

public class FileUtils {
	private static final Logger logger = LogManager.getLogger(FileUtils.class);
	
	public String getProperFileNameFromUrl(String filePath) {
		String fileName = null;
		try {
			fileName = java.net.URLDecoder.decode(new File(filePath).getName(), "UTF-8");
			fileName = fileName.replaceAll(" ", "-");
			String regex = "[\\(|\\[|\\{|\\)|\\}|\\]]";
			fileName = fileName.replaceAll(regex, "");
		} catch (UnsupportedEncodingException e) {
			logger.error("Failed to get a proper file name from string file path.");
			e.printStackTrace();
		}
		return fileName;
	}
	
	private static Collection<File> listFileTree(File dir) {
	    Set<File> fileTree = new HashSet<File>();
	    if(dir==null||dir.listFiles()==null){
	        return fileTree;
	    }
	    for (File entry : dir.listFiles()) {
	        if (entry.isFile()) fileTree.add(entry);
	        else fileTree.addAll(listFileTree(entry));
	    }
	    return fileTree;
	}


	/**
	 * 
	 * @param fileLocation file location where to look for 
	 * @param fileExtension file extension to look for
	 */
	public static File findFirstFileByExtension(File fileLocation, String fileExtension) {

	        for ( File f : listFileTree(fileLocation) ) {
	            if (f.getName().endsWith(fileExtension)) {
	            		return f;
	            }
	        }
	        return null;
	}
	
	/**
	 * 
	 * @param fileLocation file location where to look for 
	 * @param fileName file name to look for
	 */
	public static boolean containsFileByName(File fileLocation, String fileName) {
		if ( findFirstFileByExtension(fileLocation, fileName ) != null ) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param fileLocation file location where to look for 
	 * @param fileName file name to look for
	 */
	public static File findFirstFileByName(File fileLocation, String fileName) {

	        for ( File f : listFileTree(fileLocation) ) {
	            if (f.getName().equals(fileName)) {
	            		return f;
	            }
	        }
	        return null;
	}
	
	public static void save(CharSequence charSequence, File targetFile, Charset encoding) throws Exception {
		try {
			Files.createDirectories(targetFile.toPath().getParent());
			Files.write(targetFile.toPath(), charSequence.toString().getBytes(encoding), StandardOpenOption.CREATE);
		} catch (IOException e) {
			throw new Exception("Unable to save file " + targetFile.getAbsolutePath() + " --- " + e.getMessage());
		}
	}
	
	/**
	 * Return file content as CharSequence by reading it using default character set
	 * 
	 * @param sourceFile
	 * @return
	 * @throws Exception
	 */
	public static CharSequence read(File sourceFile) throws Exception {
		return read(sourceFile, Charset.defaultCharset());
	}
	
	/**
	 * Return file content as CharSequence by reading it using specified character set
	 * 
	 * @param sourceFile
	 * @return
	 * @throws Exception
	 */
	public static CharSequence read(File sourceFile, Charset encoding) throws Exception {
		try {
			byte[] readResult = Files.readAllBytes(sourceFile.toPath());
			return new String(readResult, encoding);
		} catch (IOException e) {
			throw new Exception("Unable to read file " + sourceFile.getAbsolutePath() + " --- " + e.getMessage());
		}
	}
	
	public static File[] getListOfAcceptedFiles(File sourceFilePath, String acceptedFileExtension) {
		if ( acceptedFileExtension.startsWith(".") )
			return sourceFilePath.listFiles((d, name) -> name.endsWith(acceptedFileExtension));
		else 
			return sourceFilePath.listFiles((d, name) -> name.endsWith("." + acceptedFileExtension));
	}
	
	public static void serializeEmfResource(Resource resource) {
			logger.info("Serializing model: " + resource.getURI());

			try {
				resource.save(Collections.emptyMap());
			} catch (IOException e) {
				logger.error("Unable to serialize/save model: " + resource.getURI());
				e.printStackTrace();
			}
			logger.info("... finished serializing model: " + resource.getURI());
		}
	
	public static void deleteDirectory(Path directory) {
		deleteDirectory(directory.toFile());
	}
	
	public static void deleteDirectory(File directory) {
		    File[] allContents = directory.listFiles();
		    if (allContents != null) {
		        for (File file : allContents) {
		            deleteDirectory(file);
		        }
		    }
		    directory.delete();
	}

}
