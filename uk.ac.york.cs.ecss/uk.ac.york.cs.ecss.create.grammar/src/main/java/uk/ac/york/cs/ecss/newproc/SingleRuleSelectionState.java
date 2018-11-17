package uk.ac.york.cs.ecss.newproc;

import java.util.Arrays;

public class SingleRuleSelectionState<T> {
	private SubSelector<? super T> selector;
	private SingleRuleSelectionState<T> parent;
	private double[] curVals;
	private T rule;
	
	public SingleRuleSelectionState(SingleRuleSelectionState<T> parent, T rule) {
		this.parent = parent;
		this.selector = parent.selector;
		this.rule = rule;
		updateVals();
	}
	
	public SingleRuleSelectionState(SubSelector<? super T> selector, T rule) {
		this.selector = selector;
		this.rule = rule;
		updateVals();
	}
	
	public double[] getParentVals() {
		if (parent == null) {
			return new double[selector.getSubSelectors().size()];
		} else {
			return parent.curVals;
		}
	}
	
	public void updateVals() {
		double[] vals = getParentVals();
		double[] nextVals = Arrays.copyOf(vals, vals.length);
		// last one is recalculated always
		nextVals[nextVals.length - 1] = 0.0;
		for (int i = 0; i < nextVals.length; ++i) {
			double prevValue = (i==0)?1.0:vals[i-1];
			if (prevValue>0.0) {
				// This might be valid, so evaluate it
				SubSingleSelector<? super T> sss = selector.getSubSelector(i);
				double quality = sss.getQuality(rule);
				if (quality > 0.0) {
					nextVals[i] = Math.max(nextVals[i], quality*prevValue);
				}
			}
		}
		this.curVals = nextVals;
	}

	public double getApplicability() {
		return curVals[curVals.length-1];
	}

}
