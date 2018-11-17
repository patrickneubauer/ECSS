package uk.ac.york.cs.ecss.newproc;

import uk.ac.york.cs.ecss.priority.rigen.SlotAssignmentProblem.Slot;

import java.util.ArrayList;
import java.util.List;

public class SlotContainer {

	public SlotContainer(String name, int minCount, int maxCount) {
		this.slot = new Slot(name, minCount, maxCount);
	}
	
	private List<Object> curValues = new ArrayList<>();
	private Slot slot;
	
	public void addValue(Object obj) {
		curValues.add(obj);
	}
	
	public List<Object> getValues() {
		return curValues;
	}
	
	public String getName() {
		return slot.getName();
	}
	
	public Slot getSlot() {
		return slot;
	}
}
