package uk.ac.york.cs.ecss.migrated;

public class ClassInstance {

	private boolean superType = false;
	private boolean abstrct = false;
	private int totalAll = 0;
	private int totalFile = 0;
	private String name;

	public ClassInstance(String name) {
		this.name = name;
	}

	public void incrementAll() {
		totalAll++;
	}

	public void incrementFile() {
		totalFile++;
	}

	public void setAbstract(boolean abstrct) {
		this.abstrct = abstrct;
	}

	public void setIsSuperType(boolean superType) {
		this.superType = superType;
	}

	public String getName() {
		return name;
	}

	public int getTotalAll() {
		return totalAll;
	}

	public int getTotalFile() {
		return totalFile;
	}

	public boolean isAbstract() {
		return abstrct;
	}

	public boolean isSuperType() {
		return superType;
	}

}
