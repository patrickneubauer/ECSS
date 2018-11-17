package uk.ac.york.cs.ecss2xtext.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.File;
import java.io.FileFilter;
import java.util.*;
import java.util.Map.Entry;

public class Util {

	
	public static Map<EObject,Integer> getInstances(Resource res) {
		Map<EObject,Integer> ret = new HashMap<>();
		getInstances(()->res.getAllContents(),ret);
		return ret;
	}
	
	public static void getInstances(Iterable<EObject> allEObjects, Map<EObject, Integer> map) {
		for (EObject eobj: allEObjects)  {
			EClass cl = eobj.eClass(); 
			map.put(cl, map.getOrDefault(cl, 0)+1);
			for (EStructuralFeature esf: cl.getEAllStructuralFeatures()) {
				Object o = eobj.eGet(esf);
				if (o == null) {continue;}
				if (esf.isMany() && (o instanceof Collection))  {
					map.put(esf, map.getOrDefault(esf, 0)+((Collection)o).size());
				} else if (o != null) {
					map.put(esf, map.getOrDefault(esf, 0)+1);
				}
			}
		}
	}
	
	public static class ResourceQuality implements Comparable<ResourceQuality> {
		private Set<EClass> haveClasses = new HashSet<EClass>();
		private Set<EStructuralFeature> haveFeatures = new HashSet<EStructuralFeature>();
		private int size;
		private long fileSize = 0;
		private Resource res;
		
		public Resource getResource() {
			return res;
		}
		
		public ResourceQuality(Resource res) {
			this.res = res;
			Map<EObject,Integer> instances = getInstances(res);
			for (Integer val: instances.values()) {
				size+= val;
			}
			for (Entry<EObject, Integer> entr: instances.entrySet())  {
				if (entr.getValue() > 0) {
					if (entr.getKey() instanceof EClass)  {
						haveClasses.add((EClass)entr.getKey());
					} else if (entr.getKey() instanceof EStructuralFeature) {
						haveFeatures.add((EStructuralFeature)entr.getKey());
					}
				}
			}
			String fileString = res.getURI().toFileString();
			System.out.println(fileString);
			try {
				File file = new File(fileString);
				fileSize = file.length();
			} catch (Exception e) {
				
			}
		} 
		
		/**Greater == better*/
		public int compareTo(ResourceQuality qual) {
			int ret = Integer.compare(haveClasses.size(), qual.haveClasses.size());
			if (ret != 0) {return ret;}
			ret = Integer.compare(haveFeatures.size(), qual.haveFeatures.size());
			if (ret != 0) {return ret;}
			ret = Integer.compare(size, qual.size);
			if (ret != 0) {return -ret;}
			ret = Long.compare(fileSize, qual.fileSize);
			return ret;
		}
		
		public String toString() {
			return "["+haveClasses.size()+","+haveFeatures.size()+","+size+","+fileSize+"]: "+res.getURI();
		}
	}
	
	public static List<ResourceQuality> orderResourcesQualityDescendingQuality(Iterable<Resource> res) {
		List<ResourceQuality> resQuality = new ArrayList<Util.ResourceQuality>();
		for (Resource r: res) {
			resQuality.add(new ResourceQuality(r));
		}
		Collections.sort(resQuality);
		Collections.reverse(resQuality);
		return resQuality;
	}
	
	public static List<Resource> getResources(List<ResourceQuality> quality) {
		List<Resource> ret = new ArrayList<Resource>();
		for (ResourceQuality rq: quality) {
			ret.add(rq.getResource());
		}
		return ret;
	}
	
	public static List<Resource> orderResourcesDescendingQuality(Iterable<Resource> res) {
		return getResources(orderResourcesQualityDescendingQuality(res));
		
	}
	
	public static void addToResources(ResourceSet rs, File dir, FileFilter filter, List<Resource> resources) {
		if (dir.isDirectory()) {
			for (File sub: dir.listFiles()) {
				addToResources(rs, sub, filter, resources);
			}
		} else if (filter.accept(dir)) {
			System.out.println("Accepting "+dir);
			try {
				resources.add(rs.getResource(URI.createFileURI(dir.getCanonicalPath()), true));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static List<ResourceQuality> orderResourcesQualityDescendingQuality(ResourceSet rs, File dir, String extension) {
		List<Resource> ret  = new ArrayList<Resource>();
		addToResources(rs, dir, (x)->x.getName().endsWith("."+extension), ret);
		List<ResourceQuality> rq = orderResourcesQualityDescendingQuality(ret);
		return rq;
	}
	
	public static List<Resource> orderResourcesDescendingQuality(ResourceSet rs, File dir, String extension) {
		return getResources(orderResourcesQualityDescendingQuality(rs, dir, extension));
	}
	/*
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Robert\\Documents\\eclipseMars\\eclipseEcore2ASP\\runtime-EclipseXtext\\TestSimpleJava");
		new StandaloneSetup().setPlatformUri("../");
		SimplejavaStandaloneSetup.doSetup();
		
		Injector injector = new SimplejavaStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		List<ResourceQuality> res = orderResourcesQualityDescendingQuality(rs, file, "sijava");
		for (ResourceQuality rq: res) {
			System.out.println(rq);
		}
	}
	*/
	
	
}