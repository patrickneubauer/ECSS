package uk.ac.york.cs.ecss2xtext.util;

import java.util.IdentityHashMap;

public interface ReallyCloneable extends Cloneable {

	public default Object clone() {
		return clone(new IdentityHashMap<Object, Object>());
	}
	
	public Object clone(IdentityHashMap<Object, Object> subMap);
	
	public default Object priv_subClone(Object sub, IdentityHashMap<Object, Object> subMap) {
		return subMap.computeIfAbsent(sub, x->{
			if (x instanceof ReallyCloneable) {
				return ((ReallyCloneable)x).clone(subMap);
			} else {
				return x;
			}
		});
	}
}
