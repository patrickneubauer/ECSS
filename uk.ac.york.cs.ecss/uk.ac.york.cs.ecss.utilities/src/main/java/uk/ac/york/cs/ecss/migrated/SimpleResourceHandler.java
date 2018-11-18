/**
 * 
 */
package uk.ac.york.cs.ecss.migrated;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

/**
 * @author blizzfire
 *
 */
public class SimpleResourceHandler implements ResourceHandler {
	
	private static final Logger logger = LogManager.getLogger(SimpleResourceHandler.class);

	String reportFile;
	List<Problem> problemLog = new ArrayList<>();
	List<FileProblems> fileProblems = new ArrayList<FileProblems>();
	protected String analysisModelFileLocation = null;
	protected Resource analysisModelResource;
	protected ResourceSet emfResourceSet;
	protected XtextResourceSet xtextResourceSet;

	protected interface Problem {
			public AbstractElement getElement();
			public ProblemKind getKind();
			public String getText();
	}

	public class ProblemImpl implements Problem {
		
		private AbstractElement element;
		private ProblemKind kind;
		private String text;
		
		public ProblemImpl(ProblemKind kind, AbstractElement el, String text) {
			this.kind = kind;
			this.element = el;
			this.text = text;
		}
		

		@Override
		public AbstractElement getElement() {
			return element;
		}

		@Override
		public ProblemKind getKind() {
			return kind;
		}

		@Override
		public String getText() {
			return text;
		}
		
		public String toString() {
			return kind+" in "+element+": "+text;
		}
		
	}

	public enum ProblemKind {
		WARNING, ERROR, NYI;
	}

	protected static enum GroupType {
			SEQUENCE, ALLOF
		}

	protected static class FileProblems {
			
			public FileProblems(File file, List<Problem> problemLog) {
				this.file = file;
				this.problemLog = problemLog;
			}
			public final File file;
			public final  List<Problem> problemLog;
		}

	public void printLog() {
		if (!problemLog.isEmpty()) {
			logger.info("Problem log contains "+problemLog.size()+" entries!");
			
			for (Problem problem: problemLog) {
				logger.error(problem.toString());
			}
		}
	}

	/**
	 * 
	 */
	public SimpleResourceHandler() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see uk.ac.york.cs.ecss.analysis.grammaranalysis.Transformer#transform(java.lang.String, java.lang.String)
	 */
	@Override
	public void handle(String sourceFile, String targetFile) {
		// TODO Auto-generated method stub

	}

	public List<Problem> getErrorLog() {
		return problemLog;
	}

	public void clearErrorLog() {
		problemLog.clear();
	}

	/* (non-Javadoc)
	 * @see uk.ac.york.cs.ecss.analysis.grammaranalysis.Transformer#transform(java.io.File, java.io.File)
	 */
	@Override
	public void handle(File sourceFile, File targetFile) {
		// TODO Auto-generated method stub

	}
	
	public static<A,B> void putAll(Map<A,B> map, B value, A... keys) {
		for (A key: keys)  {
			map.put(key, value);
		}
	}	

	public void reportProblems() {
		logger.info("=============== " + this.getClass().getName() + " START REPORTING PROBLEMS =============");
		for (FileProblems prob: fileProblems) {
			if (prob.problemLog.isEmpty()) {
				continue;
			}
			logger.error("File: "+prob.file.getName()+": "+prob.problemLog.size()+" Problems");
			for (Problem p: prob.problemLog) {
				logger.error(p.toString());
			}
		}
		logger.info("=============== " + this.getClass().getName() + " FINISHED REPORTING PROBLEMS =============");
	}

	protected void init() {
		logger.info("Initializing transformer ...");

		Injector i = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		xtextResourceSet = i.getInstance(XtextResourceSet.class);
		emfResourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	    
		logger.info("... finished initializing transformer.");

	}
	
}
