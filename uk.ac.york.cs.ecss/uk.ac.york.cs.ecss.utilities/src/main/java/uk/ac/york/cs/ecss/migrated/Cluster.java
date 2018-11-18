package uk.ac.york.cs.ecss.migrated;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Cluster {

	@Override
	public String toString() {
		String clusterString = "Cluster [id=" + id + ", newick=" + newick + ", items=";
		ListIterator<ClusterItem> clusterItemIterator = items.listIterator();
		while (clusterItemIterator.hasNext()) {
			clusterString += clusterItemIterator.next().getName() + ";";
		}
		clusterString += "]";
		return clusterString;
	}

	private int id;
	private String newick = "";

	private List<ClusterItem> items = new ArrayList<ClusterItem>();

	public Cluster(int id) {
		this.id = id;
	}

	public void addItem(ClusterItem item) {
		items.add(item);
	}

	public ClusterItem[] getItems() {
		return items.toArray(new ClusterItem[items.size()]);
	}

	public int getSize() {
		return items.size();
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return "Cluster " + id;
	}

	public String getNewick() {
		return newick;
	}

	public void setNewick(String newick) {
		this.newick = newick;
	}

}
