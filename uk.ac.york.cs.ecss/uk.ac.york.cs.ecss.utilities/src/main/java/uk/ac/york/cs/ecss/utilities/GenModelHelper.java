package uk.ac.york.cs.ecss.utilities;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class GenModelHelper {
	
	/**
	 * 
	 * @param ecoreResource 
	 * @return emf genmodel
	 */
	  public static GenModel loadModel(Resource ecoreResource)
	  {
	    EPackage ePackage = (EPackage)ecoreResource.getContents().get(0);
	    GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
	    genModel.initialize(Collections.singletonList(ePackage));
//	    genModel.setComplianceLevel(GenJDKLevel.JDK50_LITERAL);
	    genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);

	    return genModel;
	  }
	  
	  public static void initializeModel(GenModel genModel)
	  {
	    for (Iterator<EObject> i = genModel.eAllContents(); i.hasNext(); )
	    {
	      EObject object = i.next();
	      if (object instanceof GenBase)
	      {
	        GenBase genBase = (GenBase)object;
	        EModelElement eModelElement = genBase.getEcoreModelElement();
	        if (eModelElement != null)
	        {
	          EAnnotation eAnnotation = eModelElement.getEAnnotation(GenModelPackage.eNS_URI);
	          if (eAnnotation != null)
	          {
	            for (Map.Entry<String, String> entry : eAnnotation.getDetails())
	            {
	              EStructuralFeature feature = genBase.eClass().getEStructuralFeature(entry.getKey());
	              if (feature instanceof EAttribute)
	              {
	                EAttribute attribute = (EAttribute)feature;
	                genBase.eSet(attribute, EcoreUtil.createFromString(attribute.getEAttributeType(), entry.getValue()));
	              }
	            }
	          }
	        }
	      }
	    }
	  }
	  
	  public static void prepareModel(GenModel genModel, String qualifiedClassName)
	  {
	    int i = qualifiedClassName.lastIndexOf('.');
	    String packageName = i != -1 ? qualifiedClassName.substring(0, i) : null;
	    String className = i != -1 ? qualifiedClassName.substring(i + 1) : qualifiedClassName;

	    ImportManager importManager = new ImportManager(packageName);
	    importManager.addMasterImport(packageName, className);
	    genModel.setImportManager(importManager);
	  }

}
