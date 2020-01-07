package uk.ac.york.cs.ecss.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSVUtil {

	public static void csvWriterOneByOne(List<String[]> stringArray, Path path, boolean append) throws Exception {
	    CSVWriter writer = new CSVWriter(new FileWriter(path.toString(), append));
	    for (String[] array : stringArray) {
	        writer.writeNext(array);
	    }
	     
	    writer.close();
//	    return readFile(path);
	}
	
	public static String readFile(Path path) {
        String response = "";
        try {
            FileReader fr = new FileReader(path.toString());
            BufferedReader br = new BufferedReader(fr);
            String strLine;
            StringBuffer sb = new StringBuffer();
            while ((strLine = br.readLine()) != null) {
                sb.append(strLine);
            }
            response = sb.toString();
            System.out.println(response);
            fr.close();
            br.close();
        } catch (Exception ex) {
            System.err.println("Exception occurred while reading file: " + path.toAbsolutePath());
        }
        return response;
    }
	
}
