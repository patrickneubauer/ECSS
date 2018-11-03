package uk.ac.york.cs.ecss.utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;

/**
 * replaced by log4j
 * @author blizzfire
 *
 */
@Deprecated
public class Reporter {

	private static final String ERROR_LEVEL_INDICATOR = "ERROR: ";
	public static SimpleDateFormat time_formatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");

	private static void createReportFile(File reportFile) {
		try {
			Files.createDirectories(Paths.get(reportFile.getParent()));
			Files.createFile(reportFile.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void report(File reportFile, String reportLine) {
		if (!reportFile.exists()) {
			createReportFile(reportFile);
		}
		
		// produces too much system output
		//System.out.println(reportLine);
		reportLine = time_formatter.format(System.currentTimeMillis()) + " --- " + reportLine;
		writeToFile(reportFile.toPath(), (reportLine + "\n").getBytes(), StandardOpenOption.APPEND);
			

	}
	
	private static synchronized void writeToFile(Path path, byte[] bytes, StandardOpenOption openOption) {
		try {
			Files.write(path, bytes, openOption);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}

	public static void reportAndPrint(File reportFile, String reportLine) {
		report(reportFile, reportLine);
		System.out.println(reportLine);
	}

	
	public static void reportError(File reportFile, String reportLine) {
		if (!reportFile.exists()) {
			createReportFile(reportFile);
		}
		
		try {
			reportLine = time_formatter.format(System.currentTimeMillis()) + " --- " + reportLine;
			System.err.println(reportLine);
			Files.write(reportFile.toPath(), (ERROR_LEVEL_INDICATOR + reportLine + "\n").getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void report(String reportFileString, String reportLine) {
		if (reportFileString != null) {
			Path reportFilePath = Paths.get(reportFileString); // creates a proper path
			File reportFile = new File(reportFilePath.toString());
			report(reportFile, reportLine);
		}
	}
	
	public static void reportAndPrint(String reportFileString, String reportLine) {
		report(reportFileString, reportLine);
		System.out.println(reportLine);
	}
	
	public static void reportError(String reportFileString, String reportLine) {
		if (reportFileString != null) {
			Path reportFilePath = Paths.get(reportFileString); // creates a proper path
			File reportFile = new File(reportFilePath.toString());
			reportError(reportFile, reportLine);
		} else {
			System.err.println(reportLine);
		}
	}

	public static void report(Path reportFilePath, String reportLine) {
		File reportFile = new File(reportFilePath.toString());
		report(reportFile, reportLine);	
	}
	
	public static void reportAndPrint(Path reportFilePath, String reportLine) {
		report(reportFilePath, reportLine);	
		System.out.println(reportLine);
	}
	
	
	public static void reportError(Path reportFilePath, String reportLine) {
		File reportFile = new File(reportFilePath.toString());
		reportError(reportFile, reportLine);	
	}
	


		
}
