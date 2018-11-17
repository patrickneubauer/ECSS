package uk.ac.york.cs.ecss.newproc;

public interface SubSingleSelector<T> {
	
	public default boolean isValid(T state) {
		return getQuality(state)>0.0;
	}

	public double getQuality(T state);

}
