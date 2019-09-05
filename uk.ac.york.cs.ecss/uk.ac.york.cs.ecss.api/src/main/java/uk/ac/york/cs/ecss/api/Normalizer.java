package uk.ac.york.cs.ecss.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.bouncycastle.jce.provider.JDKKeyFactory.EC;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class Normalizer {

	public static Map<EObject, Set<EObject>> getDependencies(List<? extends EObject> startingObject) {
		Map<EObject, Set<EObject>> ret = new HashMap<>();
		for (EObject eobj : startingObject) {
			List<EObject> everything = new ArrayList<>();
			everything.add(eobj);
			eobj.eAllContents().forEachRemaining(x -> everything.add(x));
			Set<EObject> dep = new HashSet<>();
			for (EObject seobj : everything) {
				seobj.eCrossReferences().forEach(cr -> {
					dep.add(cr);
				});
			}
			ret.put(eobj, dep);
		}
		ret.values().forEach(x -> x.retainAll(startingObject));
		ret = fixPoint(ret);
		return ret;
	}

	private static Map<EClass, EAttribute> idAttrMap = new HashMap<>();

	public static EAttribute getIdAttr(EClass cl) {
		return idAttrMap.computeIfAbsent(cl, x -> {
			EAttribute idAttr = cl.getEIDAttribute();
			if (idAttr != null) {
				return idAttr;
			}
			for (EAttribute attr : cl.getEAllAttributes()) {
				if ("name".equals(attr.getName())) {
					return attr;
				}
			}
			return null;
		});
	}

	public static String getName(EObject eobj) {
		if (eobj instanceof EClass) {
			return ((EClass) eobj).getName();
		}
		EClass cl = eobj.eClass();
		EAttribute idAttr = getIdAttr(cl);
		if (idAttr != null) {
			return String.valueOf(eobj.eGet(idAttr));
		}
		return "";
	}

	public static<T extends EObject> void moveSort(EList<T> eobjList, Comparator<? super T> eobjComp) {
		List<T> sorted = new ArrayList<>(eobjList);
		sort(sorted, eobjComp);
		int newPos = 0;
		for (T sort: sorted) {
			eobjList.move(newPos, sort);
			++newPos;
		}
	}
	
	public static<T extends EObject> void sort(List<T> eobjList, Comparator<? super T> eobjComp) {
		Map<EObject, Set<EObject>> dependencies = getDependencies(eobjList);
		Set<EClass> classBasedObjList = new HashSet<>();
		for (EObject eobj : dependencies.keySet()) {
			classBasedObjList.add(eobj.eClass());
		}
		Map<EClass, Set<EClass>> refClasses = new HashMap<>();
		for (EClass x : classBasedObjList) {
			refClasses.put(x, new HashSet<>());
		}
		boolean[] changed = new boolean[1];
		do {
			changed[0] = false;
			for (EClass cl : new HashSet<>(refClasses.keySet())) {
				cl.getEAllContainments().stream().filter(x -> (x instanceof EReference)).forEach(esf -> {
					EReference er = (EReference) esf;
					EClassifier classifier = er.getEType();
					if (classifier instanceof EClass) {
						EClass subc = (EClass) classifier;
						if (refClasses.computeIfAbsent(cl, x -> new HashSet<>()).add(subc)) {
							changed[0] = true;
							refClasses.computeIfAbsent(subc, x -> new HashSet<>());
						}
					}
				});
			}
		} while (changed[0]);
		Map<EClass, Set<EClass>> frefClasses = fixPoint(refClasses);
		Comparator<EObject> basicComparator = (x,y)->{
			int ret = 0;
			
			if (ret == 0) {
				// 1. based on dependencies

				ret = -Boolean.compare(dependencies.getOrDefault(x, Collections.emptySet()).contains(y),
						dependencies.getOrDefault(y, Collections.emptySet()).contains(x));
			}
			if (ret == 0) {
				// 2. based on class dependencies
				ret = -Boolean.compare(
						frefClasses.getOrDefault(x.eClass(), Collections.emptySet()).contains(y.eClass()),
						frefClasses.getOrDefault(y.eClass(), Collections.emptySet()).contains(x.eClass()));

			}
			if (ret == 0) {
				// 3. based on the class name itself
				ret = x.eClass().getName().compareTo(y.eClass().getName());
			}
			if (ret == 0) {
				// 4. based on the object name
				ret = getName(x).compareTo(getName(y));
			}
			if (ret == 0) {
				// 5. based on any other thing
				ret = x.eClass().hashCode() - y.eClass().hashCode();
			}
			return ret;
		};
		eobjList.sort((x, y) -> {
			int ret = 0;
			if (eobjComp != null) {
				ret = eobjComp.compare(x, y);
			}
			if (ret == 0) {
				ret = basicComparator.compare(x,y);
			}
			if (ret == 0) {
				if (x.eClass() != y.eClass()) {
					// ???
					System.err.println("I can't handle this situation!");
				} else {
					// 6. based on any other thing
					for (EAttribute attr : x.eClass().getEAllAttributes()) {
						String str1 = String.valueOf(x.eGet(attr));
						String str2 = String.valueOf(y.eGet(attr));
						ret = str1.compareTo(str2);
						if (ret != 0) {
							break;
						}
					}
					if (ret == 0) {
						//Well ... no other chance!
						List<EObject> firstRef = x.eCrossReferences();
						List<EObject> secondRef = y.eCrossReferences();
						ret = Integer.compare(firstRef.size(), secondRef.size());
						if (ret == 0) {
							for (int i = 0; i < firstRef.size(); ++i) {
								ret = basicComparator.compare(firstRef.get(i), secondRef.get(i));
								if (ret != 0) {
									break;
								}
							}
						}
					}
				}
			}
			System.out.println(x+" VS "+y+": "+ret);
			return ret;

		});
	}

	// Von meinem ColUtil
	public static <T> Map<T, Set<T>> fixPoint(Map<T, Set<T>> preKeyProp) {
		Map<T, Set<T>> ret = new HashMap<>(preKeyProp);
		ret.entrySet().forEach(x -> x.setValue(new HashSet<>(x.getValue())));
		for (;;) {
			boolean changed = false;
			for (Entry<T, Set<T>> entry : ret.entrySet()) {
				Set<T> newSet = new HashSet<>(entry.getValue());
				for (T v : entry.getValue()) {
					changed |= newSet.addAll(ret.getOrDefault(v, Collections.emptySet()));
				}
				entry.setValue(newSet);
			}
			if (!changed) {
				break;
			}
		}
		return ret;
	}

}
