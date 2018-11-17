package uk.ac.york.cs.ecss.newproc;

import uk.ac.york.cs.ecss.newproc.PropState.PropertyStore;
import uk.ac.york.cs.ecss.priority.rigen.SlotAssignmentProblem.Slot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

public class SlotMatchSelector  {
	private SubSingleSelector<Object> valueSelector;
	private SubSingleSelector<Slot> slotSelector;
	private List<BiConsumer<? super SlotMatchQualityEnv, ? super PropertyStore>> consumers = new ArrayList<>();
	
	
	public SlotMatchSelector(SubSingleSelector<Object> valueSelector, SubSingleSelector<Slot> slotSelector,  BiConsumer<? super SlotMatchQualityEnv, ? super PropertyStore>... consumers) {
		this.slotSelector = slotSelector;
		this.valueSelector = valueSelector;
		this.consumers.addAll(Arrays.asList(consumers));
	}
	

	public double getQuality(AbstractEcssXtendRule parent, Object sv, Slot slot) {
		double slotValueQ = valueSelector.getQuality(sv);
		if (slotValueQ == 0.0) {
			return 0.0;
		}
		double subSelectorQuality = 0.0;
		SlotMatchQualityEnv smqe = SlotMatchQualityEnv.get(parent, sv, slot);

		double slotQ = slotSelector.getQuality(slot);
		if (slotQ == 0.0) {
			return 0.0;
		}
		
		PropertyStore ret = new PropertyStore();
		for (BiConsumer<? super SlotMatchQualityEnv, ? super PropertyStore> consumer: consumers) {
			consumer.accept(smqe, ret);
		}
		
		double retV = slotValueQ*slotQ*ret.getRPV().getValue();
		return retV;
	}


	@Override
	public int hashCode() {
		return Objects.hash(valueSelector,slotSelector);
	}
	
	public boolean equals(SlotMatchSelector ts) {
		return Objects.equals(valueSelector, ts.valueSelector) &&  Objects.equals(slotSelector, ts.slotSelector);
	}
	
	@Override
	public boolean equals(Object o) {
		return (o instanceof SlotMatchSelector) && equals((SlotMatchSelector)o);
	}


	public void addChange(BiConsumer<? super SlotMatchQualityEnv, ? super PropertyStore> consumer) {
		this.consumers.add(consumer);
	}
	
	public void addChange(double value) {
		addChange(null, value);
	}
	
	public void addChange(String key, double value) {
		if (value > 0) {
			this.consumers.add((o,ps)->{
				ps.addBasicValue(key, value);
			});
		}
	}

	public void merge(SlotMatchSelector sms) {
		if (this != sms) {
			sms.consumers.removeAll(consumers);
			this.consumers.addAll(sms.consumers);
		}
	}

}
