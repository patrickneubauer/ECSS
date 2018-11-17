package uk.ac.york.cs.ecss.newproc;

import java.util.List;

public interface SubSelector<T> {
	
	public List<SubSingleSelector<T>> getSubSelectors();

	public default SubSingleSelector<T> getSubSelector(int i) {
		return getSubSelectors().get(i);
	}

	public SubPropertyRule getPropertyRule();
}
