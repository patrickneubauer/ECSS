package uk.ac.york.cs.ecss.newproc.ecore;

//import org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator.Set; // TODO PN: import if required or remove entire class if not used
import org.eclipse.emf.ecore.*;
import uk.ac.york.cs.ecss.newproc.BasicInjector;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TypeFinder {
	
	private static final Map<Class<?>, EClassifier> primitiveTypes = new HashMap<>();
	
	private static void addClassifier(EClassifier ecl, Class<?>... classes) {
		for (Class<?> cl: classes) {
			primitiveTypes.put(cl, ecl);
		}
	}
	
	static {
		EcorePackage epkg = EcorePackage.eINSTANCE;
		addClassifier(epkg.getEByte(), byte.class);
		addClassifier(epkg.getEByteObject(), Byte.class);
		addClassifier(epkg.getEShort(), short.class);
		addClassifier(epkg.getEShortObject(), Short.class);
		addClassifier(epkg.getEInt(), int.class);
		addClassifier(epkg.getEIntegerObject(), Integer.class);
		addClassifier(epkg.getEBoolean(), boolean.class);
		addClassifier(epkg.getEBooleanObject(), Boolean.class);
		addClassifier(epkg.getELong(), long.class);
		addClassifier(epkg.getELongObject(), Long.class);
		addClassifier(epkg.getEFloat(), float.class);
		addClassifier(epkg.getEFloatObject(), Float.class);
		addClassifier(epkg.getEDouble(), double.class);
		addClassifier(epkg.getEDoubleObject(), Double.class);
		addClassifier(epkg.getEString(), String.class);
	}

	public static EStructuralFeature getType(Field field) {
		return getType(field, null, false);
	}
	
	public boolean processField(Field field) {
		return !new BasicInjector.FieldDesc(field).shouldInjectValue();
	}
	
	public static EStructuralFeature getType(Field field, Object instance, boolean useDynamicType) {
		//You can only get the field type
		Type type = field.getGenericType();
		Class<?> cl = field.getType();
		Class<?> subType = cl;
		boolean isMulti = false;
		boolean isOrdered = true;
		boolean isUnique = false;
		if (Collection.class.isAssignableFrom(cl)) {
			//A multi-valued feature
			if (type instanceof ParameterizedType) {
				ParameterizedType pt = (ParameterizedType)type;
				Type[] args = pt.getActualTypeArguments();
				if (args.length != 1) {
					System.out.println("Don't know how to handle "+type+"!");
					subType = Object.class;
				} else {
					Type st = args[0];
					if (st instanceof ParameterizedType) {
						st = ((ParameterizedType)st).getRawType();
						}
					if (st instanceof Class) {
						subType = (Class)st;
					} else {
						System.out.println("Don't know how to handle subtype "+st+"!");
						subType = Object.class;
					}
				}
			} else {
				subType = Object.class;
			}
			
			isMulti = true;
			 // TODO PN: import if required or remove entire class if not used			
//			if (Set.class.isAssignableFrom(cl)) {
//				isOrdered = false;
//				isUnique = true;
//			}
		} else if (cl.isArray()) {
			subType = cl.getComponentType();
			isMulti = true;
		}
		EClassifier exactClassifier = null;
		//If a concrete instance is given, make the things more special
		//For now, only if it is a single-valued feature
		if (instance != null) {
			if (!isMulti) {
				if (subType != instance.getClass()) {
					subType = instance.getClass();
				}
				if (instance instanceof EObject) {
					exactClassifier = ((EObject)instance).eClass();
				}
			}
		}
		if (instance == null || (isMulti)) {
			if (EObject.class.isAssignableFrom(subType)) {
				//Try it ...
				try {
					Class<?> instType = subType;
					if (subType.isInterface()) {
						//Try something else
						String name = subType.getName();
						int ind = name.lastIndexOf('.');
						if (ind >= 0) {
							name = name.substring(0,ind)+".impl"+name.substring(ind)+"Impl";
							instType = Class.forName(name);
						} 
					}
					Constructor<?> constructor = instType.getDeclaredConstructor();
					if (constructor != null) {
						constructor.setAccessible(true);
						Object obj = constructor.newInstance();

						//That is only a possibility, but I think that if that is the case
						//Then maybe this is already the best we can have?!
						if (obj instanceof EObject) {
							EObject eobj = (EObject)obj;
							exactClassifier = eobj.eClass();
						}
					}
				} catch (Exception e) {
					
				}
			}
		}
		EStructuralFeature ret;
		if (subType.isPrimitive() || primitiveTypes.containsKey(subType)) {
			EAttribute eattr =  EcoreFactory.eINSTANCE.createEAttribute();
			ret = eattr;
		} else {
			EReference eref = EcoreFactory.eINSTANCE.createEReference();
			ret = eref;
		}
		ret.setLowerBound(0);
		if (isMulti) {
			ret.setUpperBound(-1);
		} else {
			ret.setUpperBound(1);
		}
		ret.setOrdered(isOrdered);
		ret.setUnique(isUnique);
		if (exactClassifier == null) {
			if (useDynamicType) {
				exactClassifier = getDynamicType(subType,isMulti?null:instance);
					
			} else {
				exactClassifier = getBasicType(subType,isMulti?null:instance);
			}
		}
		ret.setEType(exactClassifier);
		ret.setName(StaticEClassConverter.getFieldName(field));
		return ret;
	}

	private static EClassifier getBasicType(Class<?> subType, Object instance) {
		if ((subType.isPrimitive() || primitiveTypes.containsKey(subType))) {
			return primitiveTypes.getOrDefault(subType,StaticEClassConverter.OBJECT_CLASSIFIER);
		}
		//We know it is not an EObject or something like that (it might be a multi-eobject)
		return StaticEClassConverter.convertStatic(subType).getEClassifier();
	}
	
	private static EClassifier getDynamicType(Class<?> subType, Object instance) {
		if (subType.isPrimitive() || primitiveTypes.containsKey(subType)) {
			return primitiveTypes.getOrDefault(subType,StaticEClassConverter.OBJECT_CLASSIFIER);
		}
		//We know it is not an EObject or something like that (it might be a multi-eobject)
		//TODO: ??
		EObject retObj = StaticEClassConverter.convertStaticEobj(instance);
		if (retObj == null) {
			return getBasicType(subType, instance);
		}
		return retObj.eClass();
	}
}
