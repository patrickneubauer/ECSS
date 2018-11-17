package uk.ac.york.cs.ecss.newproc.ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import uk.ac.york.cs.ecss.newproc.SlotMatchQualityEnv;
import uk.ac.york.cs.ecss.newproc.TestXtendRule;
import uk.ac.york.cs.ecss.priority.rigen.SlotAssignmentProblem.Slot;

import java.util.Arrays;
import java.util.List;

import static uk.ac.york.cs.ecss.newproc.ecore.OclEvaluator.evaluate;

public class OclEvaluatorTest {

	public static class Test {
		private List<String> bla = Arrays.asList("a", "b", "c");
	}

	public static void main(String[] args) {
		if (true) {
			TestXtendRule rule = TestXtendRule.getTestRule();
			Slot slot = new Slot("slotsABC", 982, 2);
			SlotMatchQualityEnv smqe = SlotMatchQualityEnv.get(rule, "blabla", slot);

			Object ret = evaluate("rule.class.name +'  ' +slot.name+' '+slot.minValues.toString()", smqe);
			System.out.println("Result: " + ret);
		}
		{
			Test test = new Test();
			Object ret = evaluate("bla->size()", test);
			System.out.println("Result 2: " + ret);
		}
	}
}
