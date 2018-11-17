package uk.ac.york.cs.ecss.newproc.ecore;

import org.eclipse.emf.ecore.*;
import uk.ac.york.cs.ecss.newproc.ecore.EClassInfo.ConversionInfo;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticEClassConverter {
	
	static final EDataType OBJECT_CLASSIFIER = EcorePackage.eINSTANCE.getEJavaObject();
	static final EClassifierInfo OBJECT_CLASSIFIER_INFO = new EClassifierInfo(OBJECT_CLASSIFIER);
	
	private static Map<Type, EClassifierInfo> calculatedThings = new HashMap<>();
	
	public static EObject convertStaticEobj(Object obj) {
		return convertStaticEobj((Field)null, obj);
	}
	
	public static EObject convertStaticEobj(Field parentField, Object obj) {
		if (obj == null) {
			return convertStaticEobj(parentField==null?Object.class:parentField.getGenericType(), obj);
		} else {
			return convertStaticEobj(parentField==null?obj.getClass():parentField.getGenericType(), obj);
		}
	}
	
	public static EObject convertStaticEobj(Type type, Object obj) {
		if (obj instanceof EObject) {
			return ((EObject)obj);
		}
		EClassifierInfo eci = convertStatic(type);
		if (eci instanceof EClassInfo) {
			EClassInfo eclI = (EClassInfo)eci;
			WrapperEObject ret = new WrapperEObject(obj, eclI);
			return ret;
		} else {
			System.err.println("I didn't get an EClassInfo for "+obj+"!");
			return null;
		}
	}
	
	public static EClassifierInfo convertStatic(Type objClass) {
		EClassifierInfo ret = calculatedThings.get(objClass);
		if (ret != null) {
			return ret;
		}
		return createStatic(objClass);
	}
	
	private static EClassifierInfo createStatic(Type objClass) {
		if (objClass instanceof Class) {
			return createStatic((Class)objClass);
		} else {
			System.err.println("Don't know how to handle "+objClass);
			return OBJECT_CLASSIFIER_INFO;
		}
	}
	
	static String getFieldName(Field f) {
		String fn = f.getName();
		if (fn.startsWith("loc_")) {
			fn = fn.substring("loc_".length());
		}
		return fn;
	}
	
	private static EStructuralFeature createStaticFeature(Field f) {
		EStructuralFeature fieldType = TypeFinder.getType(f, null, false);
		EClass ecl;
		return fieldType;
	}
	
	private static EClassInfo createStatic(Class<?> objClass) {
		List<Field> fields = new ArrayList<>();
		Map<String, ConversionInfo> fieldsMap = new HashMap<>();
		Class<?> curclass = objClass;
		while (curclass != null) {
			for (Field f: curclass.getDeclaredFields()) {
				f.setAccessible(true);
				fields.add(f);
			}
			curclass = curclass.getSuperclass();
		}
		EClass retCl = EcoreFactory.eINSTANCE.createEClass();
		EClassInfo ret = new EClassInfo(retCl, fieldsMap );
		calculatedThings.put(objClass, ret);
		retCl.setName(objClass.getSimpleName());
		retCl.setInstanceClass(objClass);
		
		for (Field field: fields) {
			String fn = getFieldName(field);
			if (!fieldsMap.containsKey(fn)) {
				EStructuralFeature esf = createStaticFeature(field);
				ConversionInfo ci = new ConversionInfo(field, esf);
				fieldsMap.put(esf.getName(), ci);
				retCl.getEStructuralFeatures().add(esf);
			}
		}
		
		return ret;
	}
	
}
