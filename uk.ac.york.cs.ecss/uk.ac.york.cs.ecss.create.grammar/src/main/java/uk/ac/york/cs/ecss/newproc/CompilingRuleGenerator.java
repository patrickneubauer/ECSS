package uk.ac.york.cs.ecss.newproc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.util.EList;
import org.joor.Reflect;

import uk.ac.york.cs.ecss.language.ecssLanguage.EvaluationCall;
import uk.ac.york.cs.ecss.language.ecssLanguage.ForEachExpression;
import uk.ac.york.cs.ecss.language.ecssLanguage.IfExpression;
import uk.ac.york.cs.ecss.language.ecssLanguage.LocalEvaluationCall;
import uk.ac.york.cs.ecss.language.ecssLanguage.LocalOrValueCall;
import uk.ac.york.cs.ecss.language.ecssLanguage.SlotCall;
import uk.ac.york.cs.ecss.language.ecssLanguage.StaticTemplateRulePart;
import uk.ac.york.cs.ecss.language.ecssLanguage.TemplateDef;
import uk.ac.york.cs.ecss.language.ecssLanguage.TemplateFunctionCall;
import uk.ac.york.cs.ecss.language.ecssLanguage.TemplateGeneratorRule;
import uk.ac.york.cs.ecss.language.ecssLanguage.TemplateParameterValue;
import uk.ac.york.cs.ecss.language.ecssLanguage.TemplateRule;
import uk.ac.york.cs.ecss.language.ecssLanguage.TemplateRuleOrDef;
import uk.ac.york.cs.ecss.language.ecssLanguage.TemplateRulePart;
import uk.ac.york.cs.ecss.language.ecssLanguage.TypeDef;

public class CompilingRuleGenerator implements AbstractXtendRuleGenerator {
	
	public CompilingRuleGenerator() {
	}

	private static final String PACKAGE_NAME = "uk.ac.york.lang.newrules";
	private static final String ID_NAME = "id";
	private static final String MAIN_NAME = "main";

	private static final String getQN(String simpleName) {
		return PACKAGE_NAME + "." + simpleName;
	}

	private static final Map<Class<?>, Map<String, Field>> allFields = new HashMap<>();

	private static final Map<String, Field> getAllFields(Class<?> forClass) {
		return allFields.computeIfAbsent(forClass, cl -> {
			if (cl == AbstractEcssXtendRule.class || cl == Object.class || cl == null) {
				return Collections.emptyMap();
			}
			Map<String, Field> preMap = new HashMap<>(getAllFields(cl.getSuperclass()));
			for (Field f : forClass.getDeclaredFields()) {
				f.setAccessible(true);
				preMap.put(f.getName(), f);
			}

			return preMap;
		});
	}

	public static class RuleGenerator {
		Map<String, Class<?>> variables = new TreeMap<>();
		Map<String, String> initializers = new TreeMap<>();

		private Map<String,List<PrintInfo>> mainMethod = new HashMap<>();
		private Class<?> superClass;
		private String className;

		private static class PrintInfo {
			private String string;
			private boolean isRaw;

			public PrintInfo(String string, boolean isRaw) {
				this.string = string;
				this.isRaw = isRaw;
			}
		}

		public RuleGenerator(String className, Class<? extends AbstractEcssXtendRule> superClass) {
			this.className = className;
			this.superClass = superClass;
		}

		public String getVarFieldName(String varName) {
			// Check if direct field
			Map<String, Field> fieldMap = getAllFields(superClass);
			if (!fieldMap.containsKey(varName) && fieldMap.containsKey("loc_" + varName)) {
				return "loc_" + varName;
			}
			return varName;
		}

		public Field getVarField(String varName) {
			// Check if direct field
			Map<String, Field> fieldMap = getAllFields(superClass);
			return fieldMap.getOrDefault(varName, fieldMap.get("loc_" + varName));
		}

		public String getValFieldName(String varName) {
			// Check if direct field
			Map<String, Field> fieldMap = getAllFields(superClass);
			if (!fieldMap.containsKey(varName) && fieldMap.containsKey("val_" + varName)) {
				return "val_" + varName;
			}
			return varName;
		}

		public void addConstant(String key, String str) {
			addToMain(key,"\""
					+ str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\t", "\\t") + "\"",
					false);
		}
		
		private int findIndex = 1;

		private static class ShortFieldInfo {
			private String name;
			private Class<?> type;
			private ShortFieldInfo parent;

			public ShortFieldInfo(ShortFieldInfo parent, String name, Class<?> type) {
				this.parent = parent;
				this.name = name;
				this.type = type;
			}
		}

		public ShortFieldInfo getPseudoField(ShortFieldInfo sfi, String name, String... mayPrefix) {
			String otherName = mayPrefix + name;
			java.util.Set<String> possibleNames = new HashSet<>();
			possibleNames.add(name);
			for (String pr : mayPrefix) {
				possibleNames.add(pr + name);
			}
			// Check if there is a field (A declared one!)
			Class<?> cl = sfi.type;
			for (Field f : cl.getFields()) {
				if (f.getName().equals(name) || f.getName().equals(otherName)) {
					return new ShortFieldInfo(sfi, f.getName(), f.getType());
				}
			}
			// Check if there is a method

			for (Method m : cl.getMethods()) {
				if (m.getName().toLowerCase().equals(name) || m.getName().toLowerCase().equals("get" + name)) {
					if (m.getParameterCount() == 0) {
						return new ShortFieldInfo(sfi, m.getName() + "()", m.getReturnType());
					}
				}
			}
			for (Method m : cl.getMethods()) {
				if (m.getName().toLowerCase().equals("is" + name)) {
					if (m.getParameterCount() == 0) {
						return new ShortFieldInfo(sfi, m.getName() + "()", m.getReturnType());
					}
				}
			}
			return null;
		}

		public ShortFieldInfo getPseudoField(Field field, String name, String... mayPrefix) {
			Class<?> cl = field.getType();
			return getPseudoField(new ShortFieldInfo(null, field.getName(), cl), name, mayPrefix);
		}
		
		public void addToMain(String key, String value, boolean isRaw) {
			mainMethod.computeIfAbsent(key, x->new ArrayList<>()).add(new PrintInfo(value, isRaw));
		}

		public void process(String key, TemplateRulePart trp) {
			if (trp instanceof EvaluationCall) {
				EvaluationCall ec = (EvaluationCall) trp;
				String value = ec.getValue();
				// Directly add!
				addToMain(key, value, true);
			}  else if (trp instanceof LocalEvaluationCall) {
				LocalEvaluationCall ec = (LocalEvaluationCall) trp;
				String value = ec.getValue();
				// Directly add!
				addToMain(key, value, false);
			} else if (trp instanceof LocalOrValueCall) {
				LocalOrValueCall ec = (LocalOrValueCall) trp;
				
				String value = ec.getName();
				if (value.contains(".")) {
				List<String> propAccess = Arrays.asList(value.split("\\."));
				value = propAccess.get(0);
				propAccess = propAccess.subList(1, propAccess.size());
				
				// Das waere deutlich einfacher koennten wir eine Xtend-Datei
				// generieren ...
				Field field = getVarField(value);
				StringBuilder temp = new StringBuilder();
				if (field == null) {
					System.err.println("Could not find field " + value + " in " + superClass + "!");
				} else {
					temp.append(field.getName());
					List<ShortFieldInfo> allInfos = new ArrayList<CompilingRuleGenerator.RuleGenerator.ShortFieldInfo>();
					if (!propAccess.isEmpty()) {
						String firstAccess = propAccess.get(0);
						ShortFieldInfo basic = getPseudoField(field, firstAccess, "val_", "loc_");
						if (basic == null) {
							System.err.println(
									"Could not find field " + value + "." + firstAccess + " in " + superClass + "!");
							return;
						}
						allInfos.add(basic);
						temp.append("." + basic.name);
						for (int i = 1; i < propAccess.size(); ++i) {
							String nextAccess = propAccess.get(i);
							ShortFieldInfo next = getPseudoField(basic, nextAccess, "val_", "loc_");
							if (next == null) {
								System.err.println("Could not find field " + value + "." + propAccess.subList(0, i)
										+ " in " + superClass + "!");
								return;
							}
							allInfos.add(next);
							basic = next;
							temp.append("." + basic.name);
						}
					}

				}
				addToMain(key, temp.toString(), false);
				} else {
					String vn = getValFieldName(value);
					variables.putIfAbsent(vn, String.class);
					addToMain(key, vn, false);
					
				}
			} else if (trp instanceof SlotCall) {
				SlotCall sc = (SlotCall)trp;
				String vn = getVarFieldName(sc.getName());
				variables.putIfAbsent("slot_"+vn, SlotContainer.class);
				int minValue = sc.getMinValue();
				int maxValue = sc.getMaxValue();
				if (maxValue == 0) {
					maxValue = minValue;
				}
				if (maxValue == 0) {
					maxValue = 1;
				}
				initializers.putIfAbsent("slot_"+vn, "new SlotContainer(\""+vn+"\", "+minValue+","+maxValue+")");
				addToMain(key, "slot_"+vn, false);
			}else if (trp instanceof StaticTemplateRulePart) {
				StaticTemplateRulePart ec = (StaticTemplateRulePart) trp;
				String value = ec.getValue();
				addConstant(key,value);
			} else if (trp instanceof TemplateFunctionCall) {
				TemplateFunctionCall ec = (TemplateFunctionCall) trp;
				String value = ec.getName();
				EList<TemplateParameterValue> parValue = ec.getParValue();
				StringBuilder functionCall = new StringBuilder();
				functionCall.append("callRule"+(ec.isIsReference()?"Ref":"")+"(\"" + value + "\",");
				{
					boolean first = true;
					for (TemplateParameterValue tpv : parValue) {
						if (first) {
							first = false;
						} else {
							functionCall.append(",");
						}
						
						functionCall.append(getContent(tpv));
					}
				}

				functionCall.append(")");
				addToMain(key,functionCall.toString(), false);
			} else if (trp instanceof ForEachExpression) {
				ForEachExpression fee = (ForEachExpression)trp;
				String variable = fee.getVariable();
				Class<?> type = null;
				String singleType = fee.getType();
				String otherStr;
				if (fee.getExprVar() != null) {
					otherStr = getVarFieldName(fee.getExprVar());
					Field field = getVarField(fee.getExprVar());
					if (field != null) {
						if (field.getType().isArray()) {
							otherStr = "Arrays.asList("+otherStr+")";
							if (singleType != null) {
								singleType = field.getType().getComponentType().getName();
							}
						} else {
							if (singleType == null && Collection.class.isAssignableFrom(field.getType())) {
								//Just try it ...
								Type genType = field.getGenericType();
								if (genType instanceof ParameterizedType) {
									ParameterizedType pt = (ParameterizedType)genType;
									Type[] arg = pt.getActualTypeArguments();
									if (arg.length == 1) {
										Type first = arg[0];
										if (first instanceof ParameterizedType) {
											ParameterizedType subPt = (ParameterizedType)first;
											Type subrt = subPt.getRawType();
											if (subrt instanceof Class<?>) {
												singleType = ((Class)subrt).getCanonicalName();
											}
										} else if (first instanceof Class) {
											singleType = ((Class)first).getCanonicalName();
										}
									}
								}
							} 
						}
						
					}
				} else {
					otherStr = "("+fee.getCompleteExpr()+")";
				}
				
				StringBuilder builder = new StringBuilder();
				//Avoid having to type the type
				if (singleType == null) {
					singleType = "Object";
				}
				String findVar = "$first_"+findIndex;
				builder.append("{\nboolean "+findVar+" = true;\n");
				builder.append("for ("+singleType+" "+variable+": "+otherStr+") {\n");
				builder.append("\t\tif("+findVar+") {"+findVar+" = false;} else {\n");

				++findIndex;
				addToMain(key, builder.toString(), true);
				EList<TemplateRulePart> body = fee.getBody();
				//Join
				EList<TemplateRulePart> join = fee.getJoin();
				for (TemplateRulePart subtrp: join) {
					process(key, subtrp);
				}
				addToMain(key,"}\n",true);
				//Body
				for (TemplateRulePart asubtrp: body) {
					process(key, asubtrp);
				}
				builder = new StringBuilder();
				builder.append("}\n");
				builder.append("}");
				addToMain(key,builder.toString(), true);
				fee.getCompleteExpr();
				fee.getExprVar();
				fee.getVariable();
			} else if (trp instanceof IfExpression) {
				IfExpression ifExp = (IfExpression)trp;
				//Get type
				String propName = getVarFieldName(ifExp.getVal());
				addToMain(key, "if (isTrue("+propName+")) {", true);
				for (TemplateRulePart strp: ifExp.getThen()) {
					process(key, strp);
				}
				addToMain(key, "} else {", true);
				for (TemplateRulePart strp: ifExp.getElse()) {
					process(key, strp);
				}
				addToMain(key, "}", true);
				
			}
		}

		public String getContent(TemplateParameterValue tpv) {
			String propName = tpv.getPropName();
			if (propName != null) {
				String vn = propName;
				variables.putIfAbsent(vn, String.class);
				String realValName = getValFieldName(vn);
				return realValName;
			}
			String varName = tpv.getVarName();
			if (varName != null) {
				// Must exist
				String realVarName = getVarFieldName(varName);
				return realVarName;
			}
			String slotName = tpv.getSlotName();
			if (slotName != null) {
				variables.putIfAbsent("slot_"+slotName, SlotContainer.class);
				String vn = slotName;
				int minValue = tpv.getMinValue();
				int maxValue = tpv.getMaxValue();
				if (maxValue == 0) {
					maxValue = minValue;
				}
				if (maxValue == 0) {
					maxValue = 1;
				}
				initializers.putIfAbsent("slot_"+vn, "new SlotContainer(\""+vn+"\", "+minValue+","+maxValue+")");
				return "slot_"+slotName+".getValues()";
			}
			String direct = tpv.getDirect();
			if (direct != null) {
				return direct;
			}
			/*
			 * String varName = tpv.getVarName(); if (varName != null) { String
			 * vn = "loc_"+varName; //Assume it is a string
			 * variables.putIfAbsent(vn, String.class); }
			 */
			return "";
		}
		
		public String getMethodContent(String key) {
			StringBuilder ret = new StringBuilder("\t\tStringBuilder builder = new StringBuilder();\n");
			boolean first = true;
			for (PrintInfo s : mainMethod.getOrDefault(key, Collections.emptyList())) {
				if (first) {
					first = false;
				} else {
					ret.append("\n\t\t");
				}
				String str;
				if (!s.isRaw) {
					str = "builder.append(" + s.string + ");";
				} else {
					str = s.string;
				}
				ret.append(str);
			}
			ret.append("\n\t\treturn builder.toString();\n");
			return ret.toString();
		}

		public String getMainMethodContent() {
			return getMethodContent(MAIN_NAME);
		}
		

		public String getIdMethodContent() {
			return getMethodContent(ID_NAME);
		}

		public String getClassContent() {
			StringBuilder ret = new StringBuilder();
			ret.append("package " + PACKAGE_NAME + ";\n\n");
			ret.append("import java.util.*;\nimport uk.ac.york.cs.ecss.newproc.*;\n");
			ret.append("import org.eclipse.emf.ecore.*;\n\n");
			ret.append("public class " + className + " extends " + superClass.getCanonicalName() + " {\n");
			// Custom variables
			if (!variables.isEmpty()) {
				ret.append("\n");
				for (java.util.Map.Entry<String, Class<?>> vars : variables.entrySet()) {
					//Exclude if they exist
					Map<String,Field> f = getAllFields(superClass);
					Field alt = f.get(vars.getKey());
					if (alt != null && vars.getValue().isAssignableFrom(alt.getType()) && (Modifier.isProtected(alt.getModifiers()) || Modifier.isPublic(alt.getModifiers()))) {
						continue;
					}
					ret.append("protected " + vars.getValue().getCanonicalName() + " " + vars.getKey());
					String initializer = initializers.get(vars.getKey());
					if (initializer != null) {
						ret.append(" = "+initializer);
					}
					ret.append(";\n");
				}
				ret.append("\n");
			}

			// Constructor inherits from super-constructor
			for (Constructor<?> con : superClass.getConstructors()) {
				ret.append("\tpublic " + className + "(");
				boolean first = true;
				for (Parameter par : con.getParameters()) {
					if (first) {
						first = false;
					} else {
						ret.append(", ");
					}
					ret.append(par.getType().getCanonicalName() + " " + par.getName());
				}
				ret.append(") {\n\t\tsuper(");
				first = true;
				for (Parameter par : con.getParameters()) {
					if (first) {
						first = false;
					} else {
						ret.append(",");
					}
					ret.append(par.getName());
				}
				ret.append(");\n\t}\n\n");
			}

			// Content method
			ret.append("\t@Override\n\tpublic String getString() {\n");
			ret.append(getMainMethodContent());
			ret.append("\t}\n");
			if (!mainMethod.getOrDefault(ID_NAME, Collections.emptyList()).isEmpty()) {
				ret.append("\t@Override\n\tpublic String getSubName() {\n");
				ret.append(getMethodContent(ID_NAME));
				ret.append("\t}\n");
			}
			ret.append("}");
			return ret.toString();
		}

		public void addProperty(String name, Class<?> classOrNull) {
			variables.putIfAbsent(name, classOrNull);
		}

	}

	@Override
	public Class<? extends AbstractEcssXtendRule> generate(TemplateManager tm, TemplateGeneratorRule rule,
			String classSimpleName) {
		TemplateRuleOrDef tr = rule.getType().getSuperRule();
		Class<? extends AbstractEcssXtendRule> superClass = null;
		if (tr instanceof TemplateRule) {
			superClass = tm.getXtendRule((TemplateRule)tr);
		} else if (tr instanceof TemplateDef) {
			superClass = tm.getClass((TemplateDef)tr);
		}
		if (superClass == null) {
			superClass = AbstractEcssXtendRule.class;
		}
		RuleGenerator rg = new RuleGenerator(classSimpleName, superClass);
		
		for (TypeDef td : rule.getTypeDef()) {
			rg.addProperty(td.getName(), tm.getClassOrNull(td.getType()));
		}
		// Where to store things --> Manager
		for (TemplateRulePart trp : rule.getTemplateRulePart()) {
			rg.process(MAIN_NAME,trp);
		}
		for (TemplateRulePart trp: rule.getIdPart()) {
			rg.process(ID_NAME, trp);
		}
		String fullName = getQN(classSimpleName);
		String content = rg.getClassContent();
		System.out.println("Generated class " + fullName + ":\n" + content);
		Reflect compile = Reflect.compile(fullName, content);
		try {
			return compile.get();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error converting class " + fullName + ":" + e.getMessage());
			System.err.println("Generated content was: \n" + content);
			return null;
		}
	}

}
