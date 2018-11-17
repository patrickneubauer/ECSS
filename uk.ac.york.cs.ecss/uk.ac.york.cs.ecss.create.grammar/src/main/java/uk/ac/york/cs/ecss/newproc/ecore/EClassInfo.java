package uk.ac.york.cs.ecss.newproc.ecore;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EClassInfo extends EClassifierInfo {
	
	public static class ConversionInfo {
		public Field field;
		public EStructuralFeature feat;
		
		public ConversionInfo(Field field, EStructuralFeature feat) {
			this.field = field;
			this.feat = feat;
		}

		public Object convert(Object obj) {
			if (obj == null) {
				return null;
			}
			if (feat.isMany()) {
				if (obj.getClass().isArray()) {
					obj = new BasicEList<>(Arrays.asList((Object[])obj));
				} else if (obj instanceof Collection && !(obj instanceof EList)) {
					obj = new BasicEList<>((Collection)obj);
				}
			}
			if (feat instanceof EReference) {
				//Convert
				if (obj instanceof Collection) {
					EList ret = new BasicEList<>();
					Collection col = (Collection)obj;
					for (Object o: col) {
						ret.add(StaticEClassConverter.convertStaticEobj(o));
					}
					obj= ret;
				} else {
					obj = StaticEClassConverter.convertStaticEobj(obj);
				}
			}
			return obj;
		}
	}
	
	public EClassInfo(EClass eclass, Map<String, ConversionInfo> fields) {
		super(eclass);
		this.eclass = eclass;
		this.fields = fields;
	}
	
	private EClass eclass;
	private Map<String, ConversionInfo> fields = new HashMap<>();
	
	public ConversionInfo getFieldInfo(String name) {
		return fields.get(name);
	}
	
	public Object getValue(String fieldName, Object obj) {
		ConversionInfo info = fields.get(fieldName);
		if (info == null) {
			return null;
		}
		Field field = info.field;
		try {
			Object ret = field.get(obj);
			return info.convert(ret);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public EClass getEClass() {
		return eclass;
	}
}
