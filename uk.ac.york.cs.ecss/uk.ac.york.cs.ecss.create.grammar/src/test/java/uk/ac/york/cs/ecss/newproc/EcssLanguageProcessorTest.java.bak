package uk.ac.york.cs.ecss.newproc;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class EcssLanguageProcessorTest {

	@Test
	public void basicTest() {
		EcssLanguageProcessor processor = new EcssLanguageProcessor();
		try {
			processor.process(new File("../../styles/test.ecss"),new File("../../data-example/spacetransportationservice.ecore"),
					new File("../../data-example/stsecoreout.xtext"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
