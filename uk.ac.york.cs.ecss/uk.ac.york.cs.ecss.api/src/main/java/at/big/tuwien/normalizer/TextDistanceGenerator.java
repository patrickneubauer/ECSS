package at.big.tuwien.normalizer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.text.similarity.LevenshteinDistance;

public class TextDistanceGenerator {
	
	public static void main(String[] args) {
		File first = new File("");
		File second = new File("");
		
		try {
			byte[] firstBytes = Files.readAllBytes(first.toPath());
			byte[] secondBytes = Files.readAllBytes(second.toPath());
			String firstString = new String(firstBytes);
			String secondString = new String(secondBytes);
			Integer diff = new LevenshteinDistance().apply(firstString, secondString);
			double score = 1.0- ((double)diff)/Math.max(firstString.length()
					, secondString.length());
			System.out.println("Score: "+score);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
