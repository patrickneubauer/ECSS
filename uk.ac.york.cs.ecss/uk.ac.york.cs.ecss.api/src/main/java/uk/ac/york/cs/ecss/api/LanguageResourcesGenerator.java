package uk.ac.york.cs.ecss.api;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xtext.GrammarResource;

import uk.ac.york.cs.ecss.create.project.creator.MavenTychoXtextProjectCreator;

public interface LanguageResourcesGenerator {

	/**
	 * Generates {@link GrammarResource} from language metamodel that applies the
	 * ECSS default style. To be used programmatically and within eclipse-wizard
	 * module.
	 * 
	 * @param languageMetamodelFile
	 *            language metamodel of language for which to produce grammar
	 * @return {@link GrammarResource} applying ECSS default style
	 */
	GrammarResource generateAndSerializeGrammar(File languageMetamodelFile);
	
	/**
	 * Generates {@link GrammarResource} from language metamodel that applies an ECSS style. 
	 * To be used programmatically and within eclipse-wizard
	 * module.
	 * 
	 * @param languageMetamodelFile
	 *            language metamodel of language for which to produce grammar
	 * @param optimized
	 *            true iff the grammar should be generated from previously generated optimized ecss files
	 * @return {@link GrammarResource} applying ECSS default style
	 * @throws IOException If e.g. the language metamodel file cannot be loaded or is not in the ecore resource set
	 */
	GrammarResource generateGrammar(File languageMetamodelFile, boolean optimized) throws IOException;
	
	/**
	 * Generates {@link GrammarResource} from language metamodel and style model
	 * that applies the provided ECSS style. To be used programmatically and within
	 * eclipse-wizard module.
	 * 
	 * @param languageMetamodelFile
	 *            language metamodel of language for which to produce grammar
	 * @param languageModelFile
	 *            style model conforming to language metamodel
	 * @return {@link GrammarResource} applying provided ECSS style
	 */
	default GrammarResource generateAndSerializeGrammar(File ecoreMetamodelFile, File ecssModelFile) {
		return generateAndSerializeGrammar(ecoreMetamodelFile, ecssModelFile, new String[1]);
	}
	
	/**
	 * Generates {@link GrammarResource} from language metamodel and style model
	 * that applies the provided ECSS style. To be used programmatically and within
	 * eclipse-wizard module.
	 * 
	 * @param languageMetamodelFile
	 *            language metamodel of language for which to produce grammar
	 * @param languageModelFile
	 *            style model conforming to language metamodel
	 * @param outputString
	 *            complete generated string
	 * @return {@link GrammarResource} applying provided ECSS style
	 */
	GrammarResource generateAndSerializeGrammar(File ecoreMetamodelFile, File ecssModelFile, String[] outputString);

	
	/**
	 * Generates {@link GrammarResource} from language metamodel that applies the
	 * Xtext default style. To be used programmatically and within eclipse-wizard
	 * module.
	 * 
	 * @param languageMetamodelFile
	 *            language metamodel of language for which to produce grammar
	 * @return {@link GrammarResource} applying Xtext default style
	 * @throws Exception 
	 */
	GrammarResource generateAndSerialiseDefaultGrammarResource(File languageMetamodelFile) throws Exception;
	
	/**
	 * Generates and returns non-optimized ECSS model from given language meta-model.
	 * 
	 * @param languageMetamodelFile
	 *            language metamodel of language for which to produce style model
	 * @return style model {@link Resource} conforming to {@link ECSSLanguage.ecore}
	 * @throws Exception 
	 */
	Resource generateStyleModel(File languageMetamodelFile) throws Exception;

	/**
	 * Generates and returns (optimized) ECSS model from given language meta-model.
	 * 
	 * If {@code optimize} is set to {@code true}, then an optimized style model
	 * is returned (enhanced optimization requires analysis style model to be
	 * provided during instantiation).
	 * 
	 * @param languageMetamodelFile
	 *            language metamodel of language for which to produce style model
	 * @param optimize
	 *            turn on/off optimization (enhanced optimization requires analysis
	 *            model to be provided during instantiation)
	 * @return style model {@link Resource} conforming to {@link ECSSLanguage.ecore}
	 * @throws Exception 
	 */
	Resource generateStyleModel(File languageMetamodelFile, boolean optimize) throws Exception;

	/**
	 * Generates enhanced language metamodel {@link Resource} from provided XML
	 * schema {@code File}
	 * 
	 * Enhanced metamodel generation provided by XMLIntellEdit framework;
	 * enables portability of XML schema to Xtext framework
	 * 
	 * @param xmlSchemaFile
	 *            XML schema {@code File}
	 * @return language metamodel {@link Resource}
	 */
	Resource generateEnhancedMetamodel(File xmlSchemaFile);
	
	/**
	 * Generates language metamodel {@link Resource} from provided Xtext
	 * grammar {@code File}
	 * 
	 * @param grammarFile
	 *            Xtext grammar {@code File}
	 * @return language metamodel {@link Resource}
	 */
	Resource generateMetamodel(File grammarFile);

	/**
	 * Generates a (set of) language projects from a provided parent project
	 * location {@code File} path
	 * 
	 * (!) the location where to store generated project(s) will be created if not
	 * existing and cleaned, i.e., any existing data is removed from the destination
	 * 
	 * @param parentProjectLocationPath
	 *            parent folder where to store generated project(s)
	 * @return {@code MavenTychoXtextProjectCreator} able to build the created
	 *         project
	 * @throws Exception in case language project generation fails
	 */
	MavenTychoXtextProjectCreator generateLanguageProject(File parentProjectLocationPath) throws Exception;
	
	/**
	 * Generates a (set of) XMLIntellEdit-enhanced language projects from a provided parent project
	 * location {@code File} path
	 * 
	 * (!) the location where to store generated project(s) will be created if not
	 * existing and cleaned, i.e., any existing data is removed from the destination;
	 * 
	 * @param parentProjectLocationPath
	 *            parent folder where to store generated project(s)
	 * @return {@code MavenTychoXtextProjectCreator} able to build the created
	 *         project
	 * @throws Exception in case language project generation fails
	 */
	MavenTychoXtextProjectCreator generateEnhancedLanguageProject(File parentProjectLocationPath) throws Exception;

}