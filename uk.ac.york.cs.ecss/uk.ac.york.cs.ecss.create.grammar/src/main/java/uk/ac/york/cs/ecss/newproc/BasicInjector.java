package uk.ac.york.cs.ecss.newproc;

import at.ac.tuwien.big.generalutil.Pair;
import org.eclipse.emf.ecore.EObject;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BasicInjector {
	
	/*Variable name where all non-grouped slots are matched*/
	public static final String ALL_SLOTS_NAME = "allSlots";
	
	private Object obj;
	private ProcessingState state;
	
	private static Map<Class<?>, List<FieldDesc>> allFields = new HashMap<>();
	
	public static List<FieldDesc> getFieldDescs(Class<?> cl) {
		return allFields.computeIfAbsent(cl, x->getFields(cl));
	}
	
	private static List<FieldDesc> getFields(Class<?> cl) {
		List<Field> fields = new ArrayList<>();
		//Don't inject anything for my class!
		while (cl != null && AbstractEcssXtendRule.class != cl) {
			for (Field field: cl.getDeclaredFields()) {
				fields.add(field);
			}
			cl = cl.getSuperclass();
		}
		List<FieldDesc> fieldDescs = new ArrayList<>();
		for (Field field: fields) {
			field.setAccessible(true);
			fieldDescs.add(new FieldDesc(field));
		}
		
		return fieldDescs;
	}
	
	public BasicInjector(Object obj, ProcessingState state)  {
		this.obj = obj;
		this.state = state;
	}
	
	private static Collection<Class<?>> primitiveClasses = new HashSet<>(
			Arrays.asList(int.class,Integer.class,double.class,Double.class,
					String.class,char.class,Character.class,
					float.class,Float.class,boolean.class,Boolean.class,
					long.class,Long.class,short.class,Short.class,
					byte.class,Byte.class
					));
			
	private static Map<Pair<Class<?>,String>, BiFunction<PropState, String, ?>> propertySelectors = new HashMap<>();
	
	private static Function<?, List<?>> listWrapper = (x)->{
		List<Object> ret = new ArrayList<>();
		if (x!=null) {
			ret.add(x);
		}
		return ret;
	};
	
	
	private static<T> BiFunction<PropState, String, T> getPropertySelector(Class<T> forCl, String name) {
		return (BiFunction<PropState, String, T>)propertySelectors.computeIfAbsent(new Pair<>(forCl, name), x->createPropertySelector(x.a, x.b));
	}
	
	public static<T> BiFunction<PropState, String, T> createPropertySelector(Class<T> forCl, String name) {
		if (Integer.class.equals(forCl) || int.class.equals(forCl)) {
			return (x,n)->(T)(Integer)(int)x.getValue(n, null);
		} else if (Boolean.class.equals(forCl) || boolean.class.equals(forCl)) {
			return (x,n)->(T)(Boolean)(x.getValue(n, null)>=0.5);
		} else if (Double.class.equals(forCl) || double.class.equals(forCl)) {
			return (x,n)->(T)(Double)(double)x.getValue(n, null);
		} else if (float.class.equals(forCl) || float.class.equals(forCl)) {
			return (x,n)->(T)(Float)(float)x.getValue(n, null);
		} else if (Short.class.equals(forCl) || short.class.equals(forCl)) {
			return (x,n)->(T)(Short)(short)x.getValue(n, null);
		} else if (Byte.class.equals(forCl) || byte.class.equals(forCl)) {
			return (x,n)->(T)(Byte)(byte)x.getValue(n, null);
		} else if (Character.class.equals(forCl) || char.class.equals(forCl)) {
			return (x,n)->(T)(Character)(char)(int)x.getValue(n, null);
		} else if (Long.class.equals(forCl) || long.class.equals(forCl)) {
			return (x,n)->(T)(Long)(long)x.getValue(n, null);
		} else if (String.class.equals(forCl)) {
			return (x,n)->(T)x.getStringValue(name);
		} else {
			//Unknown class
			System.err.println("Unknown class "+forCl+"!");
			return null;
		}
	}
	
	public static class FieldDesc {
		
		public FieldDesc(Field field) {
			this.field = field;
			this.fieldName = this.propertyName = field.getName();
			
			if (this.fieldName.indexOf('_') != -1	) {
				this.propertyName = this.fieldName.substring(this.fieldName.indexOf('_')+1);
			}
			this.cl = field.getType();
			try {
				this.set = MethodHandles.lookup().unreflectSetter(field);
				this.get = MethodHandles.lookup().unreflectGetter(field);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			if (cl.isArray()) {
				cl = cl.getComponentType();
				isArray = true;	
			}
			if (shouldInjectValue()) {
				this.propertySelector = getPropertySelector(cl, propertyName);
				if (isArray) {
					BiFunction<PropState, String, ?> oldP = this.propertySelector;
							
					this.propertySelector = (prop,name)->{
						Object oldObj = oldP.apply(prop, name);
						if (oldObj == null) {
							return Array.newInstance(cl, 0);
						} else {
							Object[] ret = (Object[])Array.newInstance(cl, 1);
							ret[0] = oldObj;
							return ret;
						}
					};
				}
			} else {
				this.propertySelector = (a,b)->null;
			}
			
		}
		
		private Field field;
		private MethodHandle set;
		private MethodHandle get;
		private String fieldName;
		private String propertyName;
		private Class<?> cl;
		private boolean isArray = false;
		private BiFunction<PropState, String, ?> propertySelector;
		
		public boolean shouldInjectValue() {
			if (fieldName.startsWith("val")) {
				return true;
			}
			if (fieldName.startsWith("loc_")) {
				return false;
			}
			if (List.class.isAssignableFrom(cl) || EObject.class.isAssignableFrom(cl)) {
				//Not a value
				return false;
			}
			if (primitiveClasses.contains(cl)) {
				return true;
			}
			if (AbstractEcssXtendRule.class.isAssignableFrom(cl)) {
				return false;
			}
			if (SlotContainer.class == cl || RuleCall.class == cl || RuleCallRef.class == cl) {
				return false;
			}
			System.err.println("Don't know how to handle objects of type "+cl+"/field " + fieldName+"!");
			return false;
		}
		
		public boolean shouldInjectRuleCall() {
			if (fieldName.startsWith("loc_")) {
				return false;
			}
			if (cl.isAssignableFrom(RuleCall.class)) {
				return true;
			}
			//Currently no multi-things
			return false;
		}
		

		public boolean shouldInjectRuleCallRef() {
			if (fieldName.startsWith("loc_")) {
				return false;
			}
			if (cl.isAssignableFrom(RuleCallRef.class)) {
				return true;
			}
			//Currently no multi-things
			return false;
		}
		
		public boolean shouldInjectSlot() {
			if (fieldName.startsWith("loc_")) {
				return false;
			}
			if (cl == SlotContainer.class && !isArray) {
				return true;
			}
			return false;
		}
		
		
		public boolean isList() {
			return List.class.isAssignableFrom(cl);
		}
		
		public String getName() {
			return fieldName;
		}
		
		public String getPropertyName() {
			return propertyName;
		}
		
		public Object get(Object fromObj) {
			try {
				return get.invoke(fromObj);
			} catch (Throwable e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public void set(Object forObj, Object value) {
			try {
				set.invoke(forObj, value);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public Object getValue(FieldDesc desc) {
		if (desc.propertySelector != null) {
			return desc.propertySelector.apply(state.getPropState(), desc.getPropertyName());
		}
		return null;
	}
	
	private Map<String, List<SlotContainer>> slotsPerGroup = new HashMap<>();
	
	public SlotContainer getSlotC(FieldDesc desc) {
		String[] spl = desc.fieldName.split("_",3);
		String name = desc.fieldName;
		int minCount = 1;
		int maxCount = 1;
		if (spl[0].equals("sloto")) {
			minCount = 0;
		} else if (spl[0].equals("slotp")) {
			maxCount = Integer.MAX_VALUE;
		} else if (spl[0].equals("slotm")) {
			minCount = 0;
			maxCount = Integer.MAX_VALUE;
		}
		
		if (spl.length > 1) {
			name = spl[spl.length-1];
		}
		SlotContainer ret = new SlotContainer(name, minCount, maxCount);
		addSlotC(desc, ret);
		return ret;
	}
	
	private void addSlotC(FieldDesc desc, SlotContainer cont) {
		String[] spl = desc.fieldName.split("_",3);
		String group = ALL_SLOTS_NAME;
		if (spl.length>2) {
			group = spl[1];
		}
		slotsPerGroup.computeIfAbsent(group, x->new ArrayList<>()).add(cont);
	}
	
	public void injectValues() {
		if (obj == null) {return;}
		//Sollte er nicht zuerst den PropertyState neu berechnen?
		
		
		List<FieldDesc> fds = getFieldDescs(obj.getClass());
		for (FieldDesc fd: fds) {
			if (fd.shouldInjectRuleCall()) {
				Object curValue = fd.get(obj);
				if (curValue == null) {
					if (obj instanceof AbstractEcssXtendRule) {
						String fn = fd.getPropertyName();
						RuleCall ruleCall = ((AbstractEcssXtendRule)obj).getRuleCall(fn);
						fd.set(obj, ruleCall);
					}
				}
			} if (fd.shouldInjectRuleCallRef()) {
				Object curValue = fd.get(obj);
				if (curValue == null) {
					if (obj instanceof AbstractEcssXtendRule) {
						String fn = fd.getPropertyName();
						RuleCallRef ruleCall = ((AbstractEcssXtendRule)obj).getRuleCallRef(fn);
						fd.set(obj, ruleCall);
					}
				}
			} else if (fd.shouldInjectValue()) {
				//Don't inject when the value is currently set!
				Object curValue = fd.get(obj);
				if (curValue == null) {
					Object value = getValue(fd);
					if (value != null) {
						fd.set(obj, value);
					}
				}
			} else if (fd.shouldInjectSlot()) {
				Object curValue = fd.get(obj);
				if (curValue == null) {
					SlotContainer value = getSlotC(fd);
					if (value != null) {
						fd.set(obj, value);
					}
				} else if (curValue instanceof SlotContainer) {
					addSlotC(fd,(SlotContainer)curValue);
				}
			}
		}

		//Associate slot groups
		for (FieldDesc fd: fds) {
			if (fd.cl == SlotContainer.class && fd.isArray) {
				List<SlotContainer> assocSlots = slotsPerGroup.get(fd.propertyName);
				if (assocSlots != null) {
					Object curValue = fd.get(obj);
					if (curValue == null) {
						fd.set(obj, assocSlots.toArray(new SlotContainer[assocSlots.size()]));
					}
				}
			}
		}
	}
	

}
