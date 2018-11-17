package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;

import java.util.HashMap;
import java.util.Map;

public class TerminalXtendRule extends AbstractEcssXtendRule {
	EDataType dataType;
	
	public TerminalXtendRule(EDataType dataType) {
		this.dataType = dataType;
	}
	
	private Map<Class<?>, String> terminalNames = new HashMap<>();
	private Map<String, String> nameContent = new HashMap<>();
	private Map<EDataType, String> dtContent = new HashMap<>();
	{
		associate("STRING", "'\"' ( '\\\\' .  | !('\\\\'|'\"') )* '\"' | \"'\" ( '\\\\' . | !('\\\\'|\"'\") )* \"'\"",String.class);
		associate("INT", "('0'..'9')+", Integer.class, int.class);
		associate("DOUBLE", "('0'..'9')+ ('.' ('0'..'9')+)?", Double.class, double.class);
		associate("BOOLEAN", "'true' | 'false'", Boolean.class);
		associate("'true' | 'false'", EcorePackage.eINSTANCE.getEBoolean(), EcorePackage.eINSTANCE.getEBooleanObject());
	}
	
	public void associate(String name, String content, Class<?>... classes) {
		for (Class<?> cl: classes) {
			terminalNames.put(cl, name);
		}
		nameContent.put(name, content);
	}
	
	public void associate(String content, EDataType... dts) {
		for (EDataType dt: dts) {
			dtContent.put(dt, content);
		}
	}
	
	
	@Override
	public void afterInit() {
		
	}
	
	@Override
	public String getString() {
		String subName = dataType.getName().toUpperCase();
		StringBuilder ret = new StringBuilder();
		String addStr = " returns "+ dataType.getEPackage().getName()+"::"+dataType.getName();
		ret.append("terminal "+getSubName()+addStr+":\n");
		String content = dtContent.get(dataType); 
				  
		if (content == null && dataType.getInstanceClass() != null) {
			String str = terminalNames.get(dataType.getInstanceClass());
			if (str != null) {
				content = nameContent.get(str);
			}
		} 
		if (content == null) {
			content = "'"+subName+"' /*Don't know how to handle "+subName+"!*/\n";
		}
		ret.append(content+";\n");
		return ret.toString();
	}

	@Override
	public String getSubName() {
		//Geht auch nciht, weil er mir hier die eindeutigkeit garantiert
		//String str = terminalNames.getOrDefault(dataType.getInstanceClass(), dataType.getName());
		//return str;
		return dataType.getName().toUpperCase();
	}

}
