package uk.ac.york.cs.ecss.migrated;

public class ClusterItem {

	@Override
	public String toString() {
		return "ClusterItem [name=" + name + ", cluster=" + cluster + "]";
	}

	private String name;

	private Cluster cluster;

	public ClusterItem(Cluster cluster, String name) {
		this.cluster = cluster;
		this.name = name;
	}

	public Cluster getCluster() {
		return cluster;
	}

	public String getName() {
		return name;
	}

}
