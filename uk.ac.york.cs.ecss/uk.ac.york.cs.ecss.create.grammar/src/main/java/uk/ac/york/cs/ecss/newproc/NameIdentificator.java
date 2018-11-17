package uk.ac.york.cs.ecss.newproc;

import java.util.Objects;

public class NameIdentificator implements Identificator {
	
	private String name;
	private String fullName;
	private Identificator parent;
	
	public NameIdentificator(Identificator parent, String name) {
		this.name = name;
		if (parent != null) {
			this.fullName = parent.getQualifiedName()+"."+name;
		} else {
			this.fullName = name;
		}
	}

	@Override
	public String getSimpleName() {
		return name;
	}

	@Override
	public String getQualifiedName() {
		return fullName;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Identificator)) {
			return false;
		}
		Identificator id = (Identificator)o;
		return (Objects.equals(id.getQualifiedName(), getQualifiedName()));
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(fullName);
	}
	

}
