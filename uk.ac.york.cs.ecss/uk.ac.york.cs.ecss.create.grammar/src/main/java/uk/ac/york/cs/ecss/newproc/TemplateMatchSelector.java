package uk.ac.york.cs.ecss.newproc;

import uk.ac.york.cs.ecss.newproc.PropState.PropertyStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

public class TemplateMatchSelector  {
	private SubSingleSelector<? super AbstractEcssXtendRule> ruleSelector;
	private List<BiConsumer<? super TemplateMatchQualityEnv, ? super PropertyStore>> consumers = new ArrayList<>();
	
	
	public TemplateMatchSelector(SubSingleSelector<? super AbstractEcssXtendRule> ruleSelector, BiConsumer<? super TemplateMatchQualityEnv, ? super PropertyStore>... consumers) {
		this.ruleSelector = ruleSelector;
		this.consumers.addAll(Arrays.asList(consumers));
	}
	

	public double getQuality(AbstractEcssXtendRule parent, AbstractEcssXtendRule rule) {
		double slotValueQ = ruleSelector.getQuality(rule);
		if (slotValueQ == 0.0) {
			return 0.0;
		}
		TemplateMatchQualityEnv templateMatchQualityEnv = TemplateMatchQualityEnv.get(parent, rule);
		PropertyStore store = new PropertyStore();
		for (BiConsumer<? super TemplateMatchQualityEnv, ? super PropertyStore> consumer: consumers) {
			consumer.accept(templateMatchQualityEnv, store);
		}
		double ret = slotValueQ*store.getRPV().getValue();
		return ret;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ruleSelector);
	}
	
	public boolean equals(TemplateMatchSelector ts) {
		return Objects.equals(ruleSelector, ts.ruleSelector);
	}
	
	@Override
	public boolean equals(Object o) {
		return (o instanceof TemplateMatchSelector) && equals((TemplateMatchSelector)o);
	}

	public void addChange(BiConsumer<? super TemplateMatchQualityEnv, ? super PropertyStore>consumer) {
		this.consumers.add(consumer);
	}
	public void addChange(double value) {
		addChange(null, value);
	}
	
	public void addChange(String key, double value) {
		if (value > 0) {
			this.consumers.add((s,ps)->{
				ps.addBasicValue(key, value);
			});
		}
	}

	public void merge(TemplateMatchSelector sms) {
		if (this != sms) {
			sms.consumers.removeAll(consumers);
			consumers.addAll(sms.consumers);
		}
	}

	
}
