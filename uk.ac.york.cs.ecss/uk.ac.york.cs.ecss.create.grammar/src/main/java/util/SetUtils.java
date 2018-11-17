package util;

import java.util.*;
import java.util.function.Function;

public class SetUtils {

	public static<T> List<T> getRecursivelyL(Collection<T> start, Function<T,Collection<T>> continuation) {
		List<T> ret = new ArrayList<>();
		Set<T> retSet = new HashSet<>();
		Stack<T> stack = new Stack<>();
		stack.addAll(start);
		ret.addAll(start);
		retSet.addAll(start);
		while (!stack.isEmpty()) {
			Collection<T> col = continuation.apply(stack.pop());
			for (T next: col) {
				if (retSet.add(next)) {
					ret.add(next);
					stack.add(next);
				}
			}
		}
		return ret;
	}
	
	
	public static<T> Set<T> getRecursivelyS(Collection<T> start, Function<T,Collection<T>> continuation) {
		Set<T> retSet = new HashSet<>();
		Stack<T> stack = new Stack<>();
		stack.addAll(start);
		retSet.addAll(start);
		while (!stack.isEmpty()) {
			Collection<T> col = continuation.apply(stack.pop());
			for (T next: col) {
				if (retSet.add(next)) {
					stack.add(next);
				}
			}
		}
		return retSet;
	}
}
