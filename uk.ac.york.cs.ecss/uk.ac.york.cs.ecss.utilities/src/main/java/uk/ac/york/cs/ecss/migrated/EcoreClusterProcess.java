package uk.ac.york.cs.ecss.migrated;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import weka.clusterers.ClusterEvaluation;
import weka.clusterers.HierarchicalClusterer;
import weka.core.Attribute;
import weka.core.EuclideanDistance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SelectedTag;
import weka.core.SparseInstance;

public class EcoreClusterProcess extends AbstractClusterProcess{
	
	private static final Logger logger = LogManager.getLogger(EcoreClusterProcess.class);

	public static String[] linkTypesValue = new String[] { "SINGLE", "COMPLETE", "AVERAGE", "MEAN", "CENTROID", "WARD", "ADJCOMLPETE", "NEIGHBOR_JOINING" };
	public static String[] linkTypesText = new String[] {"Single", "Complete", "Average", "Mean", "Centroid", "Ward", "Adjusted Complete", "Neighbor Joining"};

	private int clusterNo;
	private Map<String,EcoreKeywordConfig.SparseInfo> matrix;
	private String linkType;	

	private List<Cluster> clusters;
	private List<String> names;
	private String reportFile;
	private Collection<String> attributeNames;
	private boolean normalizeVectors;
	private EcoreNameRelation relation;

	public EcoreClusterProcess(String reportFile, EcoreNameRelation relation, int clusterNo, String linkType) {
		this.reportFile = reportFile;
		this.matrix = relation.getMatrix();
		this.attributeNames = relation.getAttributeNames();
		this.names = relation.getNames();
		this.clusterNo = clusterNo;
		this.linkType = linkType;
		this.normalizeVectors = relation.EcoreKeywordConfig.isNormalizeVectors();
		this.relation = relation;
	}
	
	public interface FakeNodeCallback<T> {
		public void process(FakeNode<T> node, T instance, boolean isRight);
	}
	
	public static class FakeNode<T> {
		
		static Field _m_left;
		static Field _m_right;
		static Field _m_parent;
		static Field _m_iLeftInstance;
		static Field _m_iRightInstance;
		static Field _m_fLeftLength;
		static Field _m_fRightLength;
		static Field _m_fHeight;
		
		static {
			
		}
		
		public FakeNode(Object node, Map<Object,FakeNode<T>> curNodes) {
			curNodes.put(node,this);
			if (_m_left == null) {
				Class<?> nodeCl = node.getClass();
				try {
					//Lleft und right sind subnodes
					_m_left = nodeCl.getDeclaredField("m_left");
					_m_left.setAccessible(true);
					_m_right = nodeCl.getDeclaredField("m_right");
					_m_right.setAccessible(true);
					_m_parent = nodeCl.getDeclaredField("m_parent");
					_m_parent.setAccessible(true);
					_m_iLeftInstance = nodeCl.getDeclaredField("m_iLeftInstance");
					_m_iLeftInstance.setAccessible(true);
					_m_iRightInstance = nodeCl.getDeclaredField("m_iRightInstance");
					_m_iRightInstance.setAccessible(true);
					_m_fLeftLength = nodeCl.getDeclaredField("m_fLeftLength");
					_m_fLeftLength.setAccessible(true);
					_m_fRightLength = nodeCl.getDeclaredField("m_fRightLength");
					_m_fRightLength.setAccessible(true);
					_m_fHeight = nodeCl.getDeclaredField("m_fHeight");
					_m_fHeight.setAccessible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			try {
				m_iLeftInstance = _m_iLeftInstance.getInt(node);
				m_iRightInstance = _m_iRightInstance.getInt(node);
				m_fLeftLength = _m_fLeftLength.getDouble(node);
				m_fRightLength = _m_fRightLength.getDouble(node);
				m_fHeight = _m_fHeight.getDouble(node);
				Object oriLeft = _m_left.get(node);
				Object oriRight = _m_right.get(node);
				Object oriParent = _m_parent.get(node);
				if (oriLeft != null) {
					m_left = curNodes.get(oriLeft);
					if (m_left == null) {
						m_left = new FakeNode<T>(oriLeft, curNodes);
					}
				}
				if (oriRight != null) {
					m_right = curNodes.get(oriRight);
					if (m_right == null) {
						m_right = new FakeNode<T>(oriRight, curNodes);
					}
				}
				if (oriParent != null) {
					m_parent = curNodes.get(oriParent);
					if (m_parent == null) {
						m_parent = new FakeNode<>(oriParent, curNodes);
					}
					m_parent.m_childs.add(this);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		FakeNode<T> m_left;
		FakeNode<T> m_right;
		FakeNode<T> m_parent;
		List<FakeNode<T>> m_childs = new ArrayList<>();
	    int m_iLeftInstance;
	    int m_iRightInstance;
	    double m_fLeftLength = 0;
	    double m_fRightLength = 0;
	    double m_fHeight = 0;
	    
	    T leftInstanceObj;
	    T rightInstanceObj;
	    
	    public void setInstances(List<T> objs, FakeNodeCallback<T> cb) {
	    	if (m_left == null) {
	    		leftInstanceObj = objs.get(m_iLeftInstance);
	    		if (cb != null) {
	    			cb.process(this, leftInstanceObj, false);
	    		}
	    	} else {
	    		m_left.setInstances(objs,cb);
	    	}
	    	if (m_right == null) {
	    		rightInstanceObj = objs.get(m_iRightInstance);
	    		if (cb != null) {
	    			cb.process(this, rightInstanceObj, true);
	    		}
	    	} else {
	    		m_right.setInstances(objs,cb);
	    	}
	    }

		/*public ClusterElement toClusterElement(int[] idStore, List<AnalysisElement> names) {
			EcssalFactory fact = EcssalFactory.eINSTANCE;
			ClusterElement ret = fact.createClusterElement();
			if (leftInstanceObj != null) {
				ClusterElement leftCluster = fact.createClusterElement();
				leftCluster.getAnalysisElement().add(names.get(index));
				leftCluster.setParent(ret);
			}
			if (rightInstanceObj != null) {
				ClusterElement rightCluster = fact.createClusterElement();
				rightCluster.setParent(ret);
			}
			if (m_left != null) {
				Cluster subLeft = m_left.toCluster(idStore, names);
				//TODO: ...
			}
			if (m_right != null) {
				Cluster subRight = m_right.toCluster(idStore, names);
				//TODO: ...
			}
			return ret;
		}*/
		
	}
	Instances data;
	double[] vals;

	public void generateInstances() {
		// TODO Auto-generated method stub
		ArrayList<Attribute> atts;

		Map<String,Instance> haveInstances = new HashMap<String, Instance>();

		atts = new ArrayList<Attribute>();
		/*atts.add(new Attribute("name", (List<String>) null));
		atts.add(new Attribute("$index", (List<String>) null));*/
		
		String nameAttr = "$name$";
		while (attributeNames.contains(nameAttr)) {
			nameAttr = "§"+nameAttr+"§";
		}
		atts.add(new Attribute(nameAttr,true));
		
		for (String name: attributeNames) {
			atts.add(new Attribute(name));
		}

		data = new Instances("matrix", atts, 0);

		for (int i = 0; i < names.size(); i++) {
			vals = new double[data.numAttributes()];
			String instName = names.get(i);
			EcoreKeywordConfig.SparseInfo si = matrix.get(instName);
			//Eigentlich könnte man 
			int[] indices = Arrays.copyOf(si.indices, si.indices.length);
			for (int j = 0; j < indices.length; ++j) {
				++indices[j];
			}
			SparseInstance sparseInstance = new SparseInstance(1.0, si.values, si.indices, si.indices.length+1);
			haveInstances.put(instName, sparseInstance);
			sparseInstance.setValue(atts.get(0), instName);
			data.add(sparseInstance);
		}

	

		//Ok, to be honest that doesn't really work. I should just use 
		/*EuclideanDistance euclideanDistance = new EuclideanDistance(data);
		euclideanDistance.setDontNormalize(true);*/
		
		
		
		cosDistance  = new EuclideanDistance(data);
		//This is what is intended! Normalize means that each vector is normalized
		cosDistance.setDontNormalize(normalizeVectors);
		//First is name
		cosDistance.setAttributeIndices("2-last");
	
		
		relation.notifyProcessInfo(data, cosDistance, haveInstances);
	}
	
	EuclideanDistance cosDistance;
	
	public void generateClusters(boolean normalizeVectors) {
		logger.info("Start generating clusters ...");
		HierarchicalClusterer   cl;    
		ClusterEvaluation 		eval;

		cl   = new HierarchicalClusterer();

		cl.setLinkType(new SelectedTag(linkType, HierarchicalClusterer.TAGS_LINK_TYPE));
		cl.setNumClusters(clusterNo);
		cl.setPrintNewick(true);
		cl.setDistanceFunction(cosDistance);
		

		try {
			cl.buildClusterer(data);

			eval = new ClusterEvaluation();
			eval.setClusterer(cl);
			eval.evaluateClusterer(new Instances(data));

			clusters = new ArrayList<Cluster>();

			double[] assigned = eval.getClusterAssignments();			

			for (int i = 0; i < assigned.length; i++) {
				Cluster cluster = getCluster((int)assigned[i]);

				cluster.addItem(new ClusterItem(cluster, data.get(i).attribute(0).value(i)));
			}
			List<FakeNode<ClusterItem>> parentClusters = new ArrayList<>();
			{
				Field f = HierarchicalClusterer.class.getDeclaredField("m_clusters");
				f.setAccessible(true);
				Object[] clusters = (Object[])f.get(cl);
				//Filter parents
				List<FakeNode<ClusterItem>> allNodes = new ArrayList<>();
				Map<Object,FakeNode<ClusterItem>> curNodes = new HashMap<>();
				for (Object oricl: clusters) {
					FakeNode<ClusterItem> fn = new FakeNode<>(oricl, curNodes);
					if (fn.m_parent == null) {
						parentClusters.add(fn);
					}
				}
			} 
			/*List<Cluster> rootClusters = new ArrayList<Cluster>();
			for (FakeNode<ClusterItem> fn: parentClusters) {
				rootClusters.add(fn.toCluster());
			}*/
			
			String clusterResults = eval.clusterResultsToString();

			String lines[] = cl.toString().split("[\\r?\\n]+");

			int count = 0;
			

			for (Cluster item : clusters) {
				if (item.getSize() > 1) {
					item.setNewick(lines[count * 2 + 1] + ";");
					count++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.info("... finished generating clusters.");
	}

	private Cluster getCluster(int id) {
		for (Cluster item : clusters) {
			if (item.getID() == id)
				return item;
		}

		Cluster cluster = new Cluster(id);
		clusters.add(cluster);

		return cluster;
	}

	public Cluster[] getClusters() {
		return clusters.toArray(new Cluster[clusters.size()]);
	}

	public int getClusterNo() {
		return clusterNo;
	}

	public String getLinkType() {
		return linkType;
	}

	public static String getLinkTypesText(String value) {
		int index = 0;

		for (int i = 0; i < linkTypesValue.length; i++) {
			if (linkTypesValue[i].equals(value)) {
				index = i;
				break;
			}
		}

		return linkTypesText[index];
	}

	@Override
	public void generateClusters() {
		generateClusters(normalizeVectors);
	}


}
