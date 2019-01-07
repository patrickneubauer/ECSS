package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.resource.Resource;
import uk.ac.york.cs.ecss.ecss2xtext.ConvertToXmi;

import java.io.File;
import java.io.IOException;

// renamed from PropLTest (also model names end with .ecss now instead of .propl)
public class EcssLanguageProcessor {
	
	public static void process(File ecssFile, File ecoreFile, File outputFile) throws IOException {
		Resource propL = ConvertToXmi.getEcsslResource(ecssFile);
		process(propL, ecoreFile,outputFile);
	}
	
	public static void process(Resource propL, File ecoreFile, File outputFile) throws IOException {
		
		//TestXtendRule rule = TestXtendRule.getTestRule();
		//ShorterXtendClass rule = TestXtendRule.getShorterTest();
		//Resource propL = ConvertToXmi.getPropLResource(new File("C:\\\\\\\\Users\\\\\\\\Robert\\\\\\\\Documents\\\\\\\\eclipse-modeling-neon-2-win32-x86_64\\\\\\\\eclipse\\\\\\\\runtime-ECSS\\\\\\\\TestPro\\\\\\\\test.ecss"));
		//Resource stsEcore = ConvertToXmi.getEcoreResource(new File("C:\\\\Users\\\\Robert\\\\Documents\\\\AME\\\\ECSS\\\\examples\\\\sts\\\\model\\\\sts.ecore"));
		
		Resource stsEcore = ConvertToXmi.getEcoreResource(ecoreFile);
		
		CompleteManager cm = new CompleteManager();
		cm.read(propL);
		//TemplateManager manager = new TemplateManager(cm );
		//manager.addTemplate(ShorterXtendClass.class, "classRules");
		
		//manager.addTemplate(AttributeXtendRule.class, "attributeRules");
		cm.prepareFor(stsEcore);
		cm.getTemplateManager().addTemplate(EnumXtendRule.class, "enumRules");
		cm.getTemplateManager().addTemplate(TerminalXtendRule.class, "terminalRules");
		/*
		FileOutputStream stsEcoreOut = new FileOutputStream("stsecoreout.xtext");
		List<AbstractEcssXtendRule> rootClasses = new ArrayList<>();
		stsEcore.getAllContents().forEachRemaining(x->{
			if (x instanceof EClass || x instanceof EEnum) {
				AbstractEcssXtendRule generatedRule = cm.generateRule(x);
				if (x instanceof EClass) {
					EClass ecl = (EClass)x;
					if ("SpaceTransportationService".equals(ecl.getName())) {
						rootClasses.add(generatedRule);
					}
				} else {
					String generated = generatedRule.getString();
					System.out.println(generated);
					generated = generated+"\n\n";
					try {
						stsEcoreOut.write(generated.getBytes());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} 
		});
		List<AbstractEcssXtendRule> allDependentRules = cm.getAllDependentRules(rootClasses.toArray(new AbstractEcssXtendRule[]{}));
		for (AbstractEcssXtendRule generatedRule: allDependentRules) {
			String generated = generatedRule.getString();
			System.out.println(generated);
			generated = generated+"\n\n";
			try {
				stsEcoreOut.write(generated.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		stsEcoreOut.flush();
		stsEcoreOut.close();

//		{
//		String generated = cm.generateString(testClass);
//		System.out.println("Generated: "+generated);
//		String generated2 = cm.generateString(testClass2);
//		System.out.println("Generated: "+generated2);
//		}*/
		
		Resource newXtextResource = ConvertToXmi.getOrCreateXtextResource(outputFile);
		  cm.saveInResource(newXtextResource);	
	}
	
	public static void main(String[] args) throws IOException {
	
		process(new File("../../styles/test.ecss"),new File("../../sts-example/meta-modelling/spacetransportationservice/model/spacetransportationservice.ecore"),
				new File("../../sts-example/generated/sts-ecss-based.xtext"));
	}

}
