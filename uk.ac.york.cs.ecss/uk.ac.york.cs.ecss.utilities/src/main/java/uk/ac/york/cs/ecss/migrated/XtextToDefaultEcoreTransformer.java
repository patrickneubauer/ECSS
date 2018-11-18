package uk.ac.york.cs.ecss.migrated;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.xtext.ecoreInference.Xtext2EcoreTransformer;

public class XtextToDefaultEcoreTransformer extends SimpleResourceHandler {
	
	private static final Logger logger = LogManager.getLogger(XtextToDefaultEcoreTransformer.class);
	
	private static final String SOURCE_FILE_EXTENSION = "xtext";
	private static final String TARGET_FILE_EXTENSION = "ecore";
	
	public XtextToDefaultEcoreTransformer(String reportFileLocation) {	
		reportFile = reportFileLocation;
		logger.info("Initiating " + this.getClass().getCanonicalName() + " at " + LocalDateTime.now());
		init();
	}

	/**
	 * 
	 * @param sourceFile string file path to xtext grammar file
	 * @param targetFile string file path to empty ecore file
	 */
	public void handle(String sourceFile, String targetFile) {
		handle(new File(sourceFile), new File(targetFile));
	}
	
	private List<AbstractRule> lateHandle = new ArrayList<>();

	public boolean isDeleteRule(AbstractRule rule) {
		if (rule instanceof ParserRule) {
			ParserRule pr = (ParserRule)rule;
			EObject expr = pr.getAlternatives();
			if (expr instanceof Alternatives && !(expr instanceof UnorderedGroup) && !(expr instanceof Group)) {
				Alternatives gr = (Alternatives)expr;
				if (!gr.getElements().isEmpty()) {
					boolean allBasicCalls = true;
					for (AbstractElement alt: gr.getElements()) {
						if (alt instanceof RuleCall) {
							RuleCall ce = (RuleCall)alt;
							if (ce.getCardinality() == null) {
								if (ce.getRule() instanceof ParserRule) {
									continue;
								} else {
									allBasicCalls = false;
									break;
								}
							}
						}
						allBasicCalls = false;
						break;
					}
					if (allBasicCalls) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param sourceFile xtext grammar file
	 * @param targetFile empty ecore file
	 */
	public void handle(File sourceFile, File targetFile) {
		//Don't go in output dir
//		File test = targetFile.getAbsoluteFile().getParentFile();
//		while (test != null) {
//			if (test.equals(sourceFile))  {
//				return;
//			}
//			test = test.getParentFile();
//		}
		if (sourceFile.isDirectory()) {
			logger.info("");
			if (!targetFile.isDirectory()) {
				if (!targetFile.exists()) {
					targetFile.mkdirs();
				} else {
					logger.error("Can't make directory in file "+targetFile.getAbsolutePath());
				}
			}			
			
			for (File file: sourceFile.listFiles()) {
				String newName = file.getName();
				int lastPoint = newName.lastIndexOf('.');
				String baseName = newName;
				if (lastPoint > newName.lastIndexOf(File.separator)) {
					//It's ok, replace
					baseName = newName.substring(0,lastPoint);
				}
				if (!file.isDirectory()) {
					newName = baseName+"."+TARGET_FILE_EXTENSION;
				} 
				try {
					handle(file, new File(targetFile.toString()+File.separator+newName));
				} catch (Exception e) {
					e.printStackTrace();
//					logger.error("Exception "+e.getMessage());
					problemLog.add(new ProblemImpl(ProblemKind.ERROR, null, "Exception: "+e.getMessage()));
					//Reporter.report(); //TODO
					lateHandle.clear();
				}
				if (!file.isDirectory()) {
					fileProblems.add(new FileProblems(file, problemLog));
					//Reporter.report(); //TODO
					problemLog = new ArrayList<XtextToDefaultEcoreTransformer.Problem>();
				}
			}
		} else {
			if (!sourceFile.getName().endsWith("."+SOURCE_FILE_EXTENSION)) {
				//Not an xtext file
				return;
			}
			Resource sourceResource = xtextResourceSet.getResource(URI.createFileURI(sourceFile.getAbsolutePath()), true);
			try {
				sourceResource.load(null);
			} catch (IOException e) {
				logger.error("Error when loading source resource from " + sourceResource.getURI());
				logger.error(e.getMessage());
			}
			
			Resource targetResource = new EcoreResourceFactoryImpl().createResource(URI.createFileURI(targetFile.getAbsolutePath()));
			if ( !sourceResource.getContents().isEmpty() ) {
				Grammar sourceResourceGrammar = (Grammar) sourceResource.getContents().get(0);
				List<Grammar> allGrammars = new ArrayList<Grammar>();
				//TODO: Wenn es mehrere Eclasses mit demselben Namen gibt wird es ein Problem geben
				Stack<Grammar> remaining = new Stack<>();
				Set<Grammar> allGrammarsSet = new HashSet<>();
				remaining.add(sourceResourceGrammar);
				while (!remaining.isEmpty()) {
					Grammar gr = remaining.pop();
					if (allGrammarsSet.add(gr)) {
						allGrammars.add(gr);
						remaining.addAll(gr.getUsedGrammars());
					}
				}
				Map<String,Grammar> epkgToGrammar = new HashMap<>();
				for (Grammar g: allGrammars) {
					for (AbstractMetamodelDeclaration decl: g.getMetamodelDeclarations()) {
						if (decl.getEPackage() == null) continue;
						epkgToGrammar.put(decl.getEPackage().getNsURI(), g);
					}
					//No protected region
//					Xtext2EcoreTransformer transformer = new Xtext2EcoreTransformer(g);
//					transformer.transform(); //Not necessary, it seems to do that anyway on loading
				}
				
				for (EPackage pkg: Xtext2EcoreTransformer.doGetGeneratedPackages(sourceResourceGrammar)) {
					targetResource.getContents().add(pkg);
					Grammar corr = epkgToGrammar.get(pkg.getNsURI());
					if (corr == null) {
						System.err.println("No grammar found for "+pkg.getNsURI());
					} else {
						Map<String,ParserRule> nameToParserRule = new HashMap<>();
						for (AbstractRule rule: corr.getRules()) {
							if (rule instanceof ParserRule) {
								nameToParserRule.put(rule.getName(), (ParserRule)rule);
							}
						}
						for (EClassifier cla: pkg.getEClassifiers()) {
							if (cla instanceof EClass) {
								EClass cl = (EClass)cla;
								ParserRule crule = nameToParserRule.get(cl.getName());
								if (crule != null) {
									boolean isDelete = isDeleteRule(crule);
									if (isDelete) {
										cl.setAbstract(true);
									}
								}
							}
						}
					}
				}
				
			}
		}
	}

}
