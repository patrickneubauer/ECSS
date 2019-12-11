package uk.ac.york.cs.ecss.api;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.io.Files;

public class StaticGenerator {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			args = new String[] { "xtexttrafo" };
		}
		if (args.length < 2) {
			args = Arrays.copyOf(args, args.length+1);
			args[1] = "staticContent";
		}
		String packageName = args[1];
		File folder = new File(args[0]);
		for (File file: folder.listFiles()) {
			if (!file.getName().endsWith(".xtext")) {continue;}
			StringBuilder ecssContent = new StringBuilder();
			String mainName = file.getName().replace(".xtext", "");
			mainName = mainName.substring(0,1).toUpperCase()+mainName.substring(1);
			ecssContent.append("template staticRule : "+packageName+"."+mainName+";\n");
			ecssContent.append("javarule staticRule defaultStaticRule ::classRules ;");
			try {
				Files.write(ecssContent.toString().getBytes(), new File(file.getAbsolutePath().replace(".xtext", ".ecss")));
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				StringBuilder xtendContent = new StringBuilder();
				xtendContent.append("package "+packageName+"\n" + 
						"\n" + 
						"import uk.ac.york.cs.ecss.newproc.AbstractEcssXtendRule\n" + 
						"import org.eclipse.emf.ecore.EClass\n" + 
						"\n" + 
						"class "+mainName+" extends AbstractEcssXtendRule {\n" + 
						"	\n" + 
						"	new(EClass bla) {\n" + 
						"		\n" + 
						"	}\n" + 
						"	\n" + 
						"	override afterInit() {\n" + 
						"	}\n" + 
						"	\n" + 
						"	override getString() \'\'\'\n");
				List<String> lines = new ArrayList<>(Files.readLines(file, Charset.forName("UTF-8")));
				while (lines.get(0).trim().startsWith("grammar")) {
					lines.remove(0);
				}
				lines.forEach(x->{xtendContent.append(x);xtendContent.append("\n");});
				xtendContent.append(
						"	\'\'\'\n" + 
						"	\n" + 
						"	override getSubName() \'\'\'"+mainName+"\'\'\'\n" + 
						"	\n" + 
						"}");
				
				Files.write(xtendContent.toString().getBytes(), new File(file.getAbsolutePath().replace(".xtext", ".xtend")));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
