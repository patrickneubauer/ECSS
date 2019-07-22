package uk.ac.york.cs.ecss.newproc;

import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;

public class PropState {

	private PropState parent;

	private static class SingleValuation {
		private Map<String, Double> add = new HashMap<String, Double>();
		private Map<String, Double> remove = new HashMap<String, Double>();
		private double value = Double.NaN;

		public void add(String str, double val) {
			add.merge(str, val, (v1, v2) -> Math.max(v1, v2));
			value = Double.NaN;
		}

		public void remove(String str, double val) {
			remove.merge(str, val, (v1, v2) -> Math.max(v1, v2));
			value = Double.NaN;
		}

		public SingleValuation merge(SingleValuation other) {
			SingleValuation ret = new SingleValuation();
			ret.add.putAll(add);
			other.add.forEach((k, v) -> {
				ret.add.merge(k, v, (v1, v2) -> Math.max(v1, v2));
			});
			ret.remove.putAll(remove);
			other.remove.forEach((k, v) -> {
				ret.remove.merge(k, v, (v1, v2) -> Math.max(v1, v2));
			});
			return ret;
		}

		public void mergeInplace(SingleValuation other) {
			other.add.forEach((k, v) -> {
				add.merge(k, v, (v1, v2) -> Math.max(v1, v2));
			});
			other.remove.forEach((k, v) -> {
				remove.merge(k, v, (v1, v2) -> Math.max(v1, v2));
			});
		}

		public SingleValuation clone() {
			SingleValuation ret = new SingleValuation();
			ret.add.putAll(add);
			ret.remove.putAll(remove);
			return ret;
		}

		public double value() {
			if (Double.isNaN(value)) {
				value = 0.0;
				for (Double v : add.values()) {
					value += v;
				}
				for (Double v : remove.values()) {
					value -= v;
				}
			}
			return value;
		}
	}
	
	public static interface DynamicValuator {
		
		public void modify(CurrentRuleSelectionState state, PropertyStore store);
	}

	protected static class PropertyStore {
		private double importance;
		private List<DynamicValuator> dynamicValuators = new ArrayList<>();
		private Map<String, SingleValuation> valuedThings = new HashMap<String, PropState.SingleValuation>();

		public void recalc(CurrentRuleSelectionState state) {
			valuedThings.clear();
			for (DynamicValuator valuator: dynamicValuators) {
				valuator.modify(state, this);
			}
		}
		
		public PropertyStore mergedWith(PropertyStore other) {
			int cmp = Double.compare(importance, other.importance);
			if (cmp < 0) {
				return other;
			} else if (cmp > 0) {
				return this;
			} else {
				PropertyStore ret = new PropertyStore();
				ret.importance = importance;
				ret.valuedThings = new HashMap<String, PropState.SingleValuation>();
				valuedThings.forEach((k, v) -> ret.valuedThings.put(k, v.clone()));
				other.valuedThings.forEach((k, v) -> {
					ret.valuedThings.compute(k, (oldKey, oldV) -> {
						if (oldV == null) {
							return v.clone();
						} else {
							oldV.mergeInplace(v);
							return oldV;
						}
					});
				});
				ret.dynamicValuators.addAll(dynamicValuators);
				ret.dynamicValuators.addAll(other.dynamicValuators);
				return ret;
			}
		}
		
		public void addValue(double importance, String propKey, String subKey, double value) {
			boolean isOk = setImportance(importance);
			if (isOk) {
				if (value > 0.0) {
					getOrCreateSingleValuation(propKey).add(subKey, value);
				} else if (value < 0.0) {
					getOrCreateSingleValuation(propKey).remove(subKey, -value);
				}
			}
		}
	
		public void addBasicValue(String subKey, double value) {
			addValue(1.0, null, subKey,value);
		}

		public String getHighest() {
			String ret = null;
			double maxValue = 0.0;
			for (Entry<String, SingleValuation> entry : valuedThings.entrySet()) {
				double thisVal = entry.getValue().value();
				if (thisVal > maxValue) {
					maxValue = thisVal;
					ret = entry.getKey();
				}
			}
			return ret;
		}

		public double getValue(String property) {
			SingleValuation sv = valuedThings.get(property);
			if (sv != null) {
				return sv.value();
			}
			return 0.0;
		}

		public SingleValuation getOrCreateSingleValuation(String property) {
			SingleValuation ret = valuedThings.computeIfAbsent(property, x -> new SingleValuation());
			return ret;
		}

		public boolean setImportance(double importance) {
			if (this.importance > importance) {
				return false;
			}
			if (this.importance < importance) {
				valuedThings.clear();
				this.importance = importance;
			}
			return true;
		}

		private RulePropertyValue rpv = new RulePropertyValue() {

			@Override
			public double getValue() {
				return PropertyStore.this.getValue(null);
			}

			@Override
			public RulePropertyValue getSubOrNull(String key) {
				return new RulePropertyValue() {

					@Override
					public double getValue() {
						return PropertyStore.this.getValue(key);
					}

					@Override
					public RulePropertyValue getSubOrNull(String key) {
						return null;
					}

					@Override
					public String getStringValue() {
						return null;
					}

					@Override
					public double getImportance() {
						return PropertyStore.this.getValue(key);
					}
				};
			}

			@Override
			public String getStringValue() {
				return PropertyStore.this.getHighest();
			}

			@Override
			public double getImportance() {
				return PropertyStore.this.importance;
			}
		};

		public RulePropertyValue getRPV() {
			return rpv;
		}

		public void addValuator(DynamicValuator valuator) {
			this.dynamicValuators.add(valuator);
		}

		public void addValue(double importance, String mainString, String subKey, BigDecimal mainValue) {
			addValue(importance, mainString, subKey, mainValue.doubleValue());
		}

	}

	private Map<String, PropertyStore> properties = new HashMap<>();

	private Map<TemplateMatchSelector, TemplateMatchSelector> templateMatchSelectors = new HashMap<>();
	private Map<SlotMatchSelector, SlotMatchSelector> slotMatchSelectors = new HashMap<>();

	public void addSlotMatchSelector(SlotMatchSelector sms) {
		SlotMatchSelector lsms = slotMatchSelectors.computeIfAbsent(sms, (k) -> k);
		if (sms != lsms) {
			lsms.merge(sms);
		}
	}

	public void addTemplateMatchSelector(TemplateMatchSelector sms) {
		TemplateMatchSelector lsms = templateMatchSelectors.computeIfAbsent(sms, (k) -> k);
		if (sms != lsms) {
			lsms.merge(sms);
		}
	}
	
	public void addValuator(String key, DynamicValuator valuator) {
		getOrCreateNextStoreImmediately(key).addValuator(valuator);
	}

	public Collection<TemplateMatchSelector> getTemplateMatchSelectors() {
		return templateMatchSelectors.keySet();
	}

	public Collection<TemplateMatchSelector> getAllTemplateMatchSelectors() {
		Map<TemplateMatchSelector, TemplateMatchSelector> parentSet = new HashMap<>();
		fillTemplateSelectors(parentSet);
		//parentSet.keySet().removeIf(x -> x.getStoreValue() <= 0.0);
		return parentSet.keySet();
	}

	private void fillTemplateSelectors(Map<TemplateMatchSelector, TemplateMatchSelector> map) {
		if (parent != null) {
			parent.fillTemplateSelectors(map);
		}
		map.putAll(templateMatchSelectors);
	}

	public Collection<SlotMatchSelector> getSlotMatchSelectors() {
		return slotMatchSelectors.keySet();
	}

	public Collection<SlotMatchSelector> getAllSlotMatchSelectors() {
		Map<SlotMatchSelector, SlotMatchSelector> parentSet = new HashMap<>();
		fillSlotMatchSelectors(parentSet);
		//parentSet.keySet().removeIf(x -> x.getStoreValue() <= 0.0);
		return parentSet.keySet();
	}

	private void fillSlotMatchSelectors(Map<SlotMatchSelector, SlotMatchSelector> map) {
		if (parent != null) {
			parent.fillSlotMatchSelectors(map);
		}
		map.putAll(slotMatchSelectors);
	}

	public PropState(PropState parent) {
		this.parent = parent;
		if (getHeight() > 50) {
			System.err.println("High heihgt!");
		}
	}
	
	public int getHeight() {
		if (parent == null) {
			return 1;
		}
		return parent.getHeight()+1;
	}

	private PropertyStore getNextStore(String key) {
		PropertyStore myStore = properties.get(key);
		if (myStore != null) {
			return myStore;
		}
		if (parent != null) {
			return parent.getNextStore(key);
		}
		return null;
	}


	private PropertyStore getNextStoreNonNull(String key) {
		PropertyStore myStore = properties.get(key);
		//TODO: ...
		//TODO: Ich bräuchte etwas, das deutlich schneller ist
		if (myStore != null && myStore.getHighest() != null) {
			return myStore;
		}
		if (parent != null) {
			return parent.getNextStoreNonNull(key);
		}
		return null;
	}

	
	private PropertyStore getOrCreateNextStore(String key) {
		PropertyStore myStore = getNextStore(key);
		if (myStore == null) {
			properties.put(key, myStore = new PropertyStore());
			// Default?!
			// myStore.importance = 1.0;
		}
		return myStore;
	}


	private PropertyStore getOrCreateNextStoreImmediately(String key) {
		PropertyStore myStore = properties.get(key);
		if (myStore == null) {
			properties.put(key, myStore = new PropertyStore());
			// Default?!
			// myStore.importance = 1.0;
		}
		return myStore;
	}

	
	public String getStringValue(String key) {
		PropertyStore store = getNextStoreNonNull(key);
		if (store == null) {
			return null;
		}
		String ret = store.getHighest();
		return ret;
	}

	public double getValue(String key, String property) {
		PropertyStore store = getNextStoreNonNull(key);
		if (store != null) {
			return store.getValue(property);
		}
		return 0;
	}

	public RulePropertyValue getRPV(String key) {
		PropertyStore store = getNextStoreNonNull(key);
		if (store != null) {
			return store.getRPV();
		}
		return RulePropertyValue.EMPTY;
	}

	public void addProperty(String key, String property, String propKey, double importance, double value) {
		changeProperty(key, property, propKey, importance, value, true);
	}

	public void removeProperty(String key, String property, String propKey, double importance, double value) {
		changeProperty(key, property, propKey, importance, value, false);
	}

	private void changeProperty(String key, String property, String propKey, double importance, double value,
			boolean add) {
		// TODO: Das klingt nicht gut ...
		// PropertyStore store = getOrCreateNextStore(key);
		// Ich glaube so ist es richtig, weil wenn ich etwas dazufuegen will,
		// dann heißt das, dass ich in der aktuellen Ebene was mache
		PropertyStore store = properties.computeIfAbsent(key, x -> new PropertyStore());
		boolean isOk = store.setImportance(importance);
		if (isOk) {
			SingleValuation sv = store.getOrCreateSingleValuation(property);
			if (add) {
				sv.add(propKey, value);
			} else {
				sv.remove(propKey, value);
			}
		}
	}

	public void recalc(CurrentRuleSelectionState currentRuleSelectionState) {
		properties.values().forEach(x->x.recalc(currentRuleSelectionState));
		//TODO: Also for parent?! Don't think so
	}
}
