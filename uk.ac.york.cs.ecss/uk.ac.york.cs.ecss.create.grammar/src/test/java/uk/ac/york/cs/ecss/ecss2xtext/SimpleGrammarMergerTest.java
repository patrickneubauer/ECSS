/**
 *
 */
package uk.ac.york.cs.ecss.ecss2xtext;

import com.google.inject.Injector;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Ignore;
import org.junit.Test;
import uk.ac.york.cs.ecss.language.EcssLanguageStandaloneSetup;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;


/**
 * Transformer for: ecore + ecss(l) --> xtext
 *
 * in case of failure stating: The accumulated size of entities is "50,000,001"
 * that exceeded the "50,000,000" limit set by "FEATURE_SECURE_PROCESSING" ...
 * ... run with the following Java VM arguments:
 * -DentityExpansionLimit=2147480000 -DtotalEntitySizeLimit=2147480000
 * -Djdk.xml.totalEntitySizeLimit=2147480000
 *
 * @author blizzfire
 *
 */
public class SimpleGrammarMergerTest {

	private static String ECSS_FILE_INPUT = "../../data-example/analysis/ecss/default.ecss";
	private static String ECSS_FILE_OUTPUT ="../../data-example/analysis/ecss/default_merged.ecss";
	private static String FIRST_RULE = "otherAttributeOptional";
	private static String SECOND_RULE = "otherAttributeManyOptional";


	@Test
	@Ignore("Adaptation to new ECSS implementation required (see FIXME)")
	public void simpleMergerTest() throws Exception {
		Injector inject = new EcssLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet rs = inject.getInstance(XtextResourceSet.class);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource res = rs.getResource(URI.createFileURI(ECSS_FILE_INPUT), true);
		File realInput = new File(ECSS_FILE_INPUT);
		File realOutput = new File(ECSS_FILE_OUTPUT);
		if (realOutput.isDirectory()) {
			realOutput = new File(realOutput.getAbsolutePath()+File.separator+realInput.getName());
		}
		// FIXME: to be replaced to match new ECSS implementation
//		Ecss ecss = (Ecss) res.getContents().get(0);
//		BasicRuleMerger.mergeRules(ecss, FIRST_RULE, SECOND_RULE);

		Resource xres = rs.createResource(URI.createFileURI(realOutput.getAbsolutePath()+".xmi"));
		xres.getContents().addAll(EcoreUtil.copyAll(res.getContents()));
		xres.save(Collections.emptyMap());
		res.save(new FileOutputStream(realOutput), Collections.emptyMap());
	}

}
