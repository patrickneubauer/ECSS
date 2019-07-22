package uk.ac.york.cs.ecss.newproc.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.EvaluationVisitorImpl;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;

import uk.ac.york.cs.ecss.newproc.CurrentRuleSelectionState;

import org.eclipse.ocl.ecore.OCLExpression;

import java.util.HashMap;
import java.util.Map;

public class OclEvaluator {

	static OCL ocl;
	static Helper oclHelper;

	static {
		ocl = OCL.newInstance();
		oclHelper = ocl.createOCLHelper();
	}
	
	static Map<String, Map<Object, OCLExpression[]>> cachedQueries = new HashMap<>();
	public static OCLExpression getQuery(Object o, EClassInfo eci, String expr ) {
		Object cl = null;
		if (o != null) {
			if (o instanceof CurrentRuleSelectionState) {
				cl = ((CurrentRuleSelectionState) o).getRule().getClass(); 
			} else if (o instanceof EObject) {
				if (o instanceof EStructuralFeature || o instanceof EClass) {
					cl = o;
				} else {
					cl = ((EObject) o).eClass();
				}
			} else {
				System.err.println("Unknown object "+o);
				cl = o.getClass();
				
			}
		}
		if (eci != null) {
			cl = eci;
		}
		//cl = o;
		OCLExpression[] ret = cachedQueries.computeIfAbsent(expr, x->new HashMap<>()).
				computeIfAbsent(cl,
				a->{
					EObject weo = DynamicEClassConverter.convertDynamic(o);
					oclHelper.setInstanceContext(weo);
					OCLExpression query;
					try {
						query = oclHelper.createQuery(expr);
						return new OCLExpression[] {query};
					}  catch (ParserException e) {
						System.err.println("Could not parse " + expr+ " for " + o + ": " + e.getMessage());
						e.printStackTrace();
						return new OCLExpression[0];
					}
					
				});
		if (ret.length == 0) {
			return null;
		}
		return ret[0];
	}

//	public static Object evaluate(String oclExpression, Object instance) {
//		EObject weo = DynamicEClassConverter.convertDynamic(instance);
//		oclHelper.setInstanceContext(weo);
//		System.out.println("Generating query for "+instance);
//		OCLExpression query;
//		try {
//			query = oclHelper.createQuery(oclExpression);
//		}  catch (ParserException e) {
//			System.err.println("Could not parse " + oclExpression + " for " + instance + ": " + e.getMessage());
//			e.printStackTrace();
//			return null;
//		}
//		Object result = evaluate(weo, query);
//		return result;
//	}
	
	public static Object evaluate(String oclExpression, Object instance) {
		EClassInfo[] eci = new EClassInfo[1];
		EObject weo = DynamicEClassConverter.convertDynamic(instance, eci);
		OCLExpression query = getQuery(instance, eci[0], oclExpression);
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
