package uk.ac.york.cs.ecss2xtext.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FixedMyEcoreUtil {


	public static void setAsCollectionBasic(EObject ret, EStructuralFeature attr, Collection c) {
		if (FeatureMapUtil.isMany(ret, attr)) {
			Collection cur = (Collection)ret.eGet(attr);
			cur.clear();
			cur.addAll(c);
		} else {
			if (c.isEmpty()) {
				ret.eUnset(attr);
			} else {
				ret.eSet(attr, c.iterator().next());
			}
		}
	}

	public static List<EObject> getAsCollection(EObject eobj, EReference ref) {
		if (ref.isMany()) {
			return (List)eobj.eGet(ref);
		} else {
			Object ret = eobj.eGet(ref);
			if (ret == null) {
				return Collections.emptyList();
			} else {
				return Collections.singletonList((EObject)ret);
			}
		}
	}

	
}
