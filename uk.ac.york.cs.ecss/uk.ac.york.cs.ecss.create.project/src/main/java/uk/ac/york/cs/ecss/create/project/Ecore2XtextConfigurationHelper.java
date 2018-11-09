package uk.ac.york.cs.ecss.create.project;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xtext.wizard.EPackageInfo;
import org.eclipse.xtext.xtext.wizard.Ecore2XtextConfiguration;
import org.eclipse.xtext.xtext.wizard.RuntimeProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.WizardConfiguration;
import org.eclipse.xtext.xtext.wizard.ecore2xtext.Ecore2XtextGrammarCreator;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class Ecore2XtextConfigurationHelper {
	
	public static final List<String> BROKEN_PACKAGE_NS_URIS = Arrays
			.asList(new String[] { "http://www.eclipse.org/ocl/1.1.0/Ecore",
			"http://www.eclipse.org/ui/2010/UIModel/application/ui/menu" /* see https://bugs.eclipse.org/bugs/show_bug.cgi?id=395457 */});
	
	public final static List<String> EPACKAGE_NS_URIS = Arrays.asList(new String[] {
			"http://www.eclipse.org/emf/2002/Ecore", "http://www.eclipse.org/2008/Xtext"});

	public static boolean addImportedEPackages(EPackage ePackage, Set<EPackage> importedEPackages) {
		if (BROKEN_PACKAGE_NS_URIS.contains(ePackage.getNsURI())) {
			return false;
		}
		if (importedEPackages.add(ePackage)) {
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					for (EStructuralFeature feature : ((EClass) eClassifier).getEAllStructuralFeatures()) {
						if (!feature.isTransient() && !feature.isDerived()) {
							EPackage referencedEPackage = feature.getEType().getEPackage();
							if (referencedEPackage == null) { 
								return false;
							}
							if (EPACKAGE_NS_URIS.contains(referencedEPackage.getNsURI())) { //In the latter case we don't need it
								continue;
							}
							if (feature instanceof EAttribute) {
								if (((EAttribute) feature).getEAttributeType().isSerializable()) {
									if (!addImportedEPackages(referencedEPackage, importedEPackages)) {
										return false;
									}
								}
							}
							if (feature instanceof EReference) {
								if (((EReference) feature).isContainment()) {
									if (!addImportedEPackages(referencedEPackage, importedEPackages)) {
										return false;
									}
								}
							}
						}
					}
				}
			}
		}
		return true;
	}
	
	public static Ecore2XtextConfiguration createEcore2XtextConfiguration(List<String> ePackageURIs) {
		Ecore2XtextConfiguration ecore2XtextConfiguration = new Ecore2XtextConfiguration();
		for (String nsURI : ePackageURIs) {
//			System.out.println("Adding nsURI: " + nsURI);
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI); 
			Set<EPackage> ePackages = new HashSet<EPackage>();
			if (!addImportedEPackages(ePackage, ePackages)) {
//				System.out.println("Skipped adding EPackages: " + ePackages);
			} else {
				List<EPackageInfo> ePackageInfos = Lists.newArrayList(Iterables.transform(ePackages,
						new Function<EPackage, EPackageInfo>() {
							@Override
							public EPackageInfo apply(EPackage from) {
								return new EPackageInfo(from, URI.createURI(from.getNsURI()), null, null, null);
							}
						}));
				ecore2XtextConfiguration.getEPackageInfos().addAll(ePackageInfos);
			}
		}
		return ecore2XtextConfiguration;
	}
	
	/**
	 * reflective call to set "ecore2xtext" field in {@code WizardConfiguration}
	 * 
	 * (!) may break in different xtext versions
	 * 
	 * @param ecore2XtextConfiguration 
	 */
	public static WizardConfiguration setupEcore2XtextWizardConfiguration(WizardConfiguration wizardConfiguration, Ecore2XtextConfiguration ecore2XtextConfiguration) {
		Class<?> c = wizardConfiguration.getClass();
		// may require cloning?
		
  	    try {
	  	    	Field ecore2Xtext = c.getDeclaredField("ecore2Xtext");
	  	    	ecore2Xtext.setAccessible(true);
			ecore2Xtext.set(wizardConfiguration, ecore2XtextConfiguration);
			System.out.println("");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

  	    return wizardConfiguration;
		
	}

	/**
	 * reflective call to set "grammarCreator" field in {@code RuntimeProjectDescriptor}
	 * 
	 * (!) may break in different xtext versions
	 * 
	 * @param runtimeProjectDescriptor
	 * @param ecore2XtextGrammarCreator
	 */
	public static void setupEcore2XtextGrammarCreator(RuntimeProjectDescriptor runtimeProjectDescriptor,
			Ecore2XtextGrammarCreator ecore2XtextGrammarCreator) {
		Class<?> c = runtimeProjectDescriptor.getClass();
			
  	    try {
	  	    	Field grammarCreator = c.getDeclaredField("grammarCreator");
	  	    	grammarCreator.setAccessible(true);
	  	    	grammarCreator.set(runtimeProjectDescriptor, ecore2XtextGrammarCreator);
	  	    	
			System.out.println("Setup Ecore2XtextGrammarCreator completed.");
			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}