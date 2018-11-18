package uk.ac.york.cs.ecss.migrated;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

public class KeywordDistanceComparer extends AbstractDistanceComparerer {
	private KeywordConfig config;

	public KeywordDistanceComparer(KeywordConfig config) {
		this.config = config;
	}
	
	@Override
	public void calcDifferences(Resource base, List<Resource> otherResources, Map<Resource, Double> map) {
		config = config.basicClone();
		List<Resource> allResources = new ArrayList<Resource>();
		allResources.add(base);
		allResources.addAll(otherResources);
		try {
			File baseFile = new File(base.getURI().toFileString());
			String fakeReport = File.createTempFile("asdf", "report").getAbsolutePath();
			String baseName = baseFile.getName();
			KeywordRelation rel = new KeywordRelation(fakeReport,allResources, base.getResourceSet(), config);
			KeywordClusterProcess kcp = new KeywordClusterProcess(fakeReport, rel, 1, "SINGLE"); //Whatever
			
			
			kcp.generateClusters();
			int i = 1;
			for (Resource r: otherResources) {
				File rFile = new File(r.getURI().toFileString());
				String rName = rFile.getName()+i;
				map.put(r, rel.getMatrixDistance(baseName, rName));
				++i;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	

}
