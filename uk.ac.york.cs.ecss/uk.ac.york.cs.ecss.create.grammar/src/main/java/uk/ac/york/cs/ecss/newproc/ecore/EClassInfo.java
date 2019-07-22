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
import java.util.Map.Entry;

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
		
		public boolean equals(Object o) {
			if (o instanceof ConversionInfo) {
				ConversionInfo ci = (ConversionInfo)o;
				if (feat.getEType() == ci.feat.getEType()) {
					return true;
				}
			}
			return false;
		}
		
		public int hashCode() {
			return feat.getEType().hashCode();
		}
	}
	
	public EClassInfo(EClass eclass, Map<String, ConversionInfo> fields) {
		super(eclass);
		this.eclass = eclass;
		this.fields = fields;
		this.hashCode = 0;
		for (Entry<String,ConversionInfo> entry: fields.entrySet()) {
			this.hashCode+= entry.getKey().hashCode() * entry.getValue().hashCode();
		}
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
	
	public int hashCode;
	
	public int hashCode() {
		return hashCode;
	}
	
	public boolean equals(Object o) {
		if (o instanceof EClassInfo) {
			EClassInfo eci = (EClassInfo)o;

			if (!fields.keySet().equals(eci.fields.keySet())) {
				return false;
			}
			for (Entry<String, ConversionInfo> entr: fields.entrySet()) {
				ConversionInfo other = eci.fields.get(entr.getKey());
				if (!entr.getValue().equals(other)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
