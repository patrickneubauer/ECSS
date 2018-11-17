package uk.ac.york.cs.ecss.newproc.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import uk.ac.york.cs.ecss.newproc.ecore.EClassInfo.ConversionInfo;

import java.lang.reflect.Field;
import java.util.*;

public class DynamicEClassConverter {
	
	private static WeakHashMap<Object, EObject> dynamicEObjects = 
			new WeakHashMap<Object, EObject>();

	public static EObject convertDynamic(Object o) {
		if (o == null) {return null;}
		EObject ret = dynamicEObjects.get(o);
		if (ret != null) {
			return ret;
		}
		
		return createDynamic(o);
		
	}
	
	private static EObject createDynamic(Object obj) {
		if (obj instanceof EObject) {
			return ((EObject)obj);
		}
		if (obj == null) {
			return null;
		}
		Class<?> objClass = obj.getClass();

		List<Field> allfields = new ArrayList<>();
		Map<String, ConversionInfo> fieldsMap = new HashMap<>();
		Class<?> curclass = objClass;
		while (curclass != null) {
			for (Field f: curclass.getDeclaredFields()) {
				f.setAccessible(true);
				allfields.add(f);
			}
			curclass = curclass.getSuperclass();
		}
		WrapperEObject ret = new WrapperEObject();
		dynamicEObjects.put(obj, ret);
		EClass retCl = EcoreFactory.eINSTANCE.createEClass();
		EClassInfo retInfo = new EClassInfo(retCl, fieldsMap );
		ret.init(obj, retInfo);
		retCl.setName(objClass.getSimpleName());
		retCl.setInstanceClass(objClass);
		for (Field field: allfields) {
			if (Map.class.isAssignableFrom(field.getType())) {
				//I don't want map classes for now
				//TODO: This is something which should be considered
				continue;
			}
			String fn = StaticEClassConverter.getFieldName(field);
			if (!fieldsMap.containsKey(fn)) {
				Object fieldVal = null;
				try {
					fieldVal = field.get(obj);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				EStructuralFeature esf = TypeFinder.getType(field, fieldVal, true);
				retCl.getEStructuralFeatures().add(esf);
				fieldsMap.put(esf.getName(), new ConversionInfo(field, esf));
			}
		}
		
		return ret;
		
	}
	
}
