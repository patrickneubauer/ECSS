package uk.ac.york.cs.ecss.newproc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public interface TemplateCreator<T extends AbstractEcssXtendRule> {

	/** Creates possible template instanciations */
	public List<T> create(Object... forParams);

	public static <T extends AbstractEcssXtendRule> TemplateCreator<T> createClassTC(Class<T> cl) {
		return (parameters) -> {
			List<T> ret = new ArrayList<>();
			mainLoop: for (Constructor<? extends T> con : ((Class) cl).getConstructors()) {
				if (con.getParameterCount() != parameters.length) {
					continue;
				}
				Parameter[] pars = con.getParameters();
				for (int i = 0; i < pars.length; ++i) {
					Parameter par = pars[i];
					if (!par.getType().isInstance(parameters[i])) {
						continue mainLoop;
					}
				}
				try {
					T newInstance = con.newInstance(parameters);
					ret.add(newInstance);
				} catch (Exception e) {
					e.printStackTrace();
					System.err.println("Cannot generate: "+e.getMessage());
				}
			}
			return ret;
		};
	}
}
