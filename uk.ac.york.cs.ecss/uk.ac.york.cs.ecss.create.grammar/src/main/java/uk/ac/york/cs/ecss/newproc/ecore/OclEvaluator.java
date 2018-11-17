package uk.ac.york.cs.ecss.newproc.ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.EvaluationVisitorImpl;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;

import java.util.Map;

public class OclEvaluator {

	static OCL ocl;
	static Helper oclHelper;

	static {
		ocl = OCL.newInstance();
		oclHelper = ocl.createOCLHelper();
	}

	public static Object evaluate(String oclExpression, Object instance) {
		EObject weo = DynamicEClassConverter.convertDynamic(instance);
		oclHelper.setInstanceContext(weo);
		OCLExpression query;
		try {
			query = oclHelper.createQuery(oclExpression);
		}  catch (ParserException e) {
			System.err.println("Could not parse " + oclExpression + " for " + instance + ": " + e.getMessage());
			e.printStackTrace();
			return null;
		}
		Object result = evaluate(weo, query);
		return result;
	}
	
	public static double selectionValue(String oclExpression, Object instance) {
		Object result = evaluate(oclExpression, instance);
		return object2Double(result);
	}

	// ----------- MOVED FROM PrioritySource START ---------------
	private static final EcoreEnvironmentFactory fact = EcoreEnvironmentFactory.INSTANCE;

	public static Object evaluate(EObject context, OCLExpression expr) {
		EvaluationEnvironment env = fact.createEvaluationEnvironment();
		env.add(Environment.SELF_VARIABLE_NAME, context);
		Map extents = env.createExtentMap(context);
		EvaluationVisitorImpl evi = new EvaluationVisitorImpl(fact.createEnvironment(), env, extents);
		return evi.visitExpression(expr);
	}

	public static Double object2Double(Object result) {
		if (result instanceof Boolean) {
			return ((Boolean)result)?1.0:0.0;
		} else if (result instanceof Double) {
			return Math.max(0.0, (Double)result);
		} else {
			return 0.0;
		}
	}
	// ----------- MOVED FROM PrioritySource END ---------------

}
