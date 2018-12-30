package uk.ac.york.cs.ecss.migrated;

import org.eclipse.emf.ecore.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EcoreNameRelationDistanceManager implements BasicDistanceManager {
	
	private ResourceLoaderImpl resourceLoader;
	private EcoreNameRelation relation;
	
	public EcoreNameRelationDistanceManager(ResourceLoaderImpl loader, EcoreNameRelation relation) {
		this.resourceLoader = loader;
		this.relation = relation;
	}
	
	public void setResourceLoader(ResourceLoaderImpl loader) {
		this.resourceLoader = loader;
	}


	@Override
	public Map<Resource, Double> getDistanceTable(Resource any) {
		Map<String,Double> ret = relation.getAllDistances(any);
		Map<Resource,Double> rret = new HashMap<>();
		ret.forEach((str,v)->{
			try {
				System.out.println("Putting "+str+" = "+v);
				rret.put(resourceLoader.load(str), v);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		return rret;
	}

	public void generateInstances() {
		relation.getMatrix();
		relation.generateInstances();
	}
}