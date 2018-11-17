package uk.ac.york.cs.ecss.priority.rigen;


import org.jamesframework.core.problems.Problem;
import org.jamesframework.core.problems.constraints.validations.Validation;
import org.jamesframework.core.problems.objectives.evaluations.Evaluation;
import org.jamesframework.core.problems.sol.Solution;
import org.jamesframework.core.search.Search;
import org.jamesframework.core.search.algo.tabu.TabuMemory;
import org.jamesframework.core.search.algo.tabu.TabuSearch;
import org.jamesframework.core.search.neigh.Move;
import org.jamesframework.core.search.neigh.Neighbourhood;
import org.jamesframework.core.search.stopcriteria.StopCriterion;

import java.util.*;
import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;

public class SlotAssignmentProblem<Subthing> {
	
	public static class Slot implements util.NamedElement {
		public Slot(String name, int minValues, int maxValues) {
			this.name = name;
			this.minValues = minValues;
			this.maxValues = maxValues;
		}
		
		public String toString() {
			return name+"["+minValues+"-"+maxValues+"]";
		}
		
		private String name;
		private int minValues;
		private int maxValues;
		private double avgCount;
		
		public void setAvgCount(double avgCount) {
			this.avgCount = avgCount;
		}
		
		public double getAvgCount() {
			return this.avgCount;
		}
		
		public int getMinValues() {
			return minValues;
		}
		
		public int getMaxValues() {
			return maxValues;
		}
		
		public int numErrors(int assignmentNumb) {
			int error = 0;
			if (assignmentNumb < minValues) {
				error = minValues-assignmentNumb;
			} else if (assignmentNumb > maxValues && maxValues >= 0) {
				error = assignmentNumb-maxValues;
			}
			return error;
		}
		
		public int hashCode() {
			return name.hashCode();
		}

		public String getName() {
			return name;
		}

	}
	
	public static class SolutionQuality implements Comparable<SolutionQuality> {
		private int hardErrors;
		private int missingSlots;
		private int slotsTooMany;
		private double valueSum;
		
		public double getQuality() {
			double ret = 0.0;
			ret-= missingSlots*2000000.0; //Just hope for the best ...
			ret-= slotsTooMany*20000.0;
			ret-= hardErrors*200.0;
			//[-1,1]
			ret+= valueSum/(1.0+Math.abs(valueSum));
			return ret;
		}
		
		@Override
		public int compareTo(SolutionQuality o) {
			int cmp = Integer.compare(missingSlots, o.missingSlots);
			if (cmp != 0) {return cmp;}
			cmp = Integer.compare(slotsTooMany, o.slotsTooMany);
			if (cmp != 0) {return cmp;}
			cmp = Integer.compare(hardErrors, o.hardErrors);
			if (cmp != 0) {return cmp;}
			cmp = Double.compare(valueSum, o.valueSum);
			return -cmp;
		}
		
	}
	
	public SlotAssignmentProblem(List<Slot> slots, List<Subthing> features, Map<Subthing, Map<String, Double>> priorities)  {
		this.slots = slots;
		this.features = features;
		this.qualityTable = new double[slots.size()][features.size()];
		for (int i = 0; i < slots.size(); ++i) {
			Slot slot = slots.get(i);
			String slotName = slot.name;
			for (int j = 0; j < features.size(); ++j) {
				qualityTable[i][j] = priorities.getOrDefault(features.get(j),Collections.emptyMap()).getOrDefault(slotName, 0.0);
			}
		}
		calculateAllMoves();
	}
	
	public static class SimpleMove implements Move<SlotAssignmentProblem.SlotSolution> {
		
		private int feature;
		private int rotation;
		private int total;
		
		public int getFeature() {
			return feature;
		}
		
		public SimpleMove(int feature, int rotation, int total) {
			this.feature = feature;
			this.rotation = rotation;
			this.total = total;
		}

		@Override
		public void apply(SlotAssignmentProblem.SlotSolution arg0) {
			arg0.associatedSlots[feature]+= rotation;
			if (arg0.associatedSlots[feature] > total) {
				arg0.associatedSlots[feature]-= total;
			}
		}

		@Override
		public void undo(SlotAssignmentProblem.SlotSolution arg0) {
			arg0.associatedSlots[feature]-= rotation;
			if (arg0.associatedSlots[feature] <= 0) {
				arg0.associatedSlots[feature]+= total;  
			}
		}
		
		public String toString() {
			return "["+rotation+","+feature+","+total+"]";
		}
		
	}
	
	private void calculateAllMoves() {
		for (int i = 0; i < slots.size()-1; ++i) {
			for (int j = 0; j < features.size(); ++j) {
				allMoves.add(new SimpleMove(j, i+1, slots.size()));
			}
		}
	}
	
	//TODO: Allow slot to be assigned multiple times for multi-valued features
	private List<Slot> slots = new ArrayList<>();
	private List<Subthing> features = new ArrayList<>();
	//Slot-->Subthing
	private double[][] qualityTable;
	
	private Map<Slot, List<Subthing>> assignments;
	
	public Map<Slot, List<Subthing>> getAssignments() {
		if (assignments == null) {
			calcAssignments();
		}
		return assignments;
	}
	
	private static boolean useSearch = false;
	
	private void calcAssignments() {
		boolean useActualAssignments = false;
		for (Slot slot: slots) {
			useActualAssignments|= slot.getAvgCount()!=0.0;
		}
		int[] associatedSlotsArray = null;
		if (useSearch) {
			TabuSearch<SlotSolution> search = getSearch();
			search.run();
			SlotSolution retSol = search.getBestSolution();
			associatedSlotsArray = retSol.associatedSlots;
		} else {
			//First assign minimum slots
			int[] curSolution = new int[features.size()];
			associatedSlotsArray = curSolution;
			SlotSolution sol = new SlotSolution(curSolution);
			
			List<Integer> allowedFeatures = new ArrayList<Integer>();
			for (int i = 0; i < features.size(); ++i) {
				allowedFeatures.add(i);
			}
			for(;;) {
				SolutionQuality qual = sol.getQuality();
				/*System.out.println("Current association:");
				for (int i = 0; i < curSolution.length; ++i) {
					int slot = curSolution[i];
					if (i > 0) {
						System.out.print(",");
					}
					System.out.print(" ");
					System.out.print(features.get(i).getName());
					System.out.print(" = ");
					if (slot == 0) {
						System.out.print("Unassigned");;
					} else {
						System.out.print("Slot "+slots.get(slot-1).getName());;
					}
				}*/
				System.out.println();
				//Need to calculate actualAssignments
				boolean[] allowed = new boolean[slots.size()];
				boolean anyAllowed = false;
				for (int i = 0; i < slots.size(); ++i) {
					if (sol.actualAssignments[i] < slots.get(i).minValues) {
						anyAllowed = allowed[i] = true;
					}
				}
				if (!anyAllowed) {
					for (int i = 0; i < slots.size(); ++i) {
						if (slots.get(i).maxValues == -1 || sol.actualAssignments[i] < slots.get(i).maxValues) {
							anyAllowed = allowed[i] = true;
						}
					}
				}
				if (anyAllowed) {
					//Always associate to the allowed where the sum (2*best - second best slot, second best assoc) is highest
					int[] allowedSlots = new int[allowed.length];
					int curSlot = 0;
					for (int i = 0; i < allowed.length; ++i) {
						if (allowed[i]) {
							allowedSlots[curSlot] = i;
							++curSlot;
						}
					}
					if (curSlot == 1) {
						//Just select the best feature
						int slotIndex = allowedSlots[0];
						int bestFeature = -1;
						double bestFeatureValue = Double.NEGATIVE_INFINITY;
						for (int i = 0; i < allowedFeatures.size(); ++i) {
							double curValue = qualityTable[slotIndex][allowedFeatures.get(i)]+(useActualAssignments?((Math.abs(sol.actualAssignments[slotIndex]-slots.get(slotIndex).avgCount)-Math.abs(sol.actualAssignments[slotIndex]+1-slots.get(slotIndex).avgCount))):0.0);
							if (bestFeature == -1 || curValue > bestFeatureValue) {
								bestFeatureValue = curValue;
								bestFeature = allowedFeatures.get(i);
							}
						}
						if (bestFeature != -1) {
							curSolution[bestFeature] = slotIndex+1;
						}
						allowedFeatures.remove((Integer)bestFeature);
					} else if (allowedFeatures.size() == 1){
						//Just select best slot
						int bestSlot = -1;
						double bestSlotValue = Double.NEGATIVE_INFINITY;
						int featureIndex = allowedFeatures.get(0);
						for (int i = 0; i < curSlot; ++i) {
							int slotIndex = allowedSlots[i];
							double curValue = qualityTable[slotIndex][featureIndex]+(useActualAssignments?((Math.abs(sol.actualAssignments[slotIndex]-slots.get(slotIndex).avgCount)-Math.abs(sol.actualAssignments[slotIndex]+1-slots.get(slotIndex).avgCount))):0.0);
							if (bestSlotValue == -1 || curValue > bestSlotValue) {
								bestSlotValue = curValue;
								bestSlot = slotIndex;
							}
						}
						if (bestSlot != -1) {
							curSolution[featureIndex] = bestSlot+1;
							allowedFeatures.remove((Integer)featureIndex);
						}
					} else if (allowedFeatures.size() > 1){
						//At least 2 features and slots
						double highestSlotDelta = Double.NEGATIVE_INFINITY;
						double highestValue = Double.NEGATIVE_INFINITY;
						int highestSlot = -1;
						int highestFeature = -1;
						for (int i = 0; i < allowedFeatures.size(); ++i) {
							int feature = allowedFeatures.get(i);
							double bestValue = Double.NEGATIVE_INFINITY;
							int bestIndex = -1;
							for (int j = 0; j < curSlot; ++j) {
								int slotIndex = allowedSlots[j];
								double curValue = qualityTable[slotIndex][feature]+(useActualAssignments?((Math.abs(sol.actualAssignments[slotIndex]-slots.get(slotIndex).avgCount)-Math.abs(sol.actualAssignments[slotIndex]+1-slots.get(slotIndex).avgCount))):0.0);
								if (curValue > bestValue) {
									bestValue = curValue;
									bestIndex = slotIndex;
								}
							}
							double secondBestValue = Double.NEGATIVE_INFINITY;
							for (int j = 0; j < curSlot; ++j) {
								if (j == bestIndex) {continue;}
								int slotIndex = allowedSlots[j];
								double curValue = qualityTable[slotIndex][feature]+(useActualAssignments?((Math.abs(sol.actualAssignments[slotIndex]-slots.get(slotIndex).avgCount)-Math.abs(sol.actualAssignments[slotIndex]+1-slots.get(slotIndex).avgCount))):0.0);
								if (curValue > secondBestValue) {
									secondBestValue = curValue;
								}
							}
							double delta = bestValue-secondBestValue;
							if (delta > highestSlotDelta || (delta == highestSlotDelta && bestValue > highestValue)) {
								highestSlotDelta = delta;
								highestValue = bestValue;
								highestSlot = bestIndex;
								highestFeature = feature;
							}
						}
						for (int slot = 0; slot < curSlot; ++slot) {
							int slotIndex = allowedSlots[slot];
							double bestValue = Double.NEGATIVE_INFINITY;
							int bestIndex = -1;
							for (int i = 0; i < allowedFeatures.size(); ++i) {
								int feature = allowedFeatures.get(i);
								double curValue = qualityTable[slotIndex][feature]+(useActualAssignments?((Math.abs(sol.actualAssignments[slotIndex]-slots.get(slotIndex).avgCount)-Math.abs(sol.actualAssignments[slotIndex]+1-slots.get(slotIndex).avgCount))):0.0);
								if (curValue > bestValue) {
									bestValue = curValue;
									bestIndex = feature;
								}
							}
							double secondBestValue = Double.NEGATIVE_INFINITY;
							for (int i = 0; i < allowedFeatures.size(); ++i) {
								int feature = allowedFeatures.get(i);
								if (feature == bestIndex) {continue;}
								double curValue = qualityTable[slotIndex][feature]+(useActualAssignments?((Math.abs(sol.actualAssignments[slotIndex]-slots.get(slotIndex).avgCount)-Math.abs(sol.actualAssignments[slotIndex]+1-slots.get(slotIndex).avgCount))):0.0);
								if (curValue > secondBestValue) {
									secondBestValue = curValue;
								}
							}
							double delta = bestValue-secondBestValue;
							if (delta > highestSlotDelta || delta == highestSlotDelta && bestValue > highestValue) {
								highestSlotDelta = delta;
								highestSlot = slotIndex;
								highestFeature = bestIndex;
								highestValue = bestValue;
							}
						}
						if (highestFeature == -1) {
							//Cannot associate feature - why?
							break;
						} else {
							curSolution[highestFeature] = highestSlot+1;
							allowedFeatures.remove((Integer)highestFeature);
						}
					}
				}
				if (!anyAllowed || allowedFeatures.isEmpty()) {
					break;
				}
			}
		}

		assignments = new HashMap<SlotAssignmentProblem.Slot, List<Subthing>>();
		for (Slot s: slots) {
			assignments.put(s, new ArrayList<Subthing>());
		}
		for (int i = 0; i < associatedSlotsArray.length; ++i) {
			int slot = associatedSlotsArray[i]; 
			if (slot == 0) {
				//Just pick the last slot with the highest number of available features ... hope it is sensible
				int bsmax = 0;
				for (int test = slots.size()-1; test>= 0;--test) {
					Slot s = slots.get(test);
					if (s.maxValues > bsmax) {
						bsmax = s.maxValues;
						slot = test+1;
					}
				}
				if (slot == 0) {continue;} //Can't do anything
				//continue;
			}
			int realSlot = slot-1;
			assignments.get(slots.get(realSlot)).add(features.get(i));
		}
	}
	
	public TabuSearch<SlotSolution> getSearch() {
		TabuSearch<SlotSolution> ret = new TabuSearch<SlotSolution>("search",getProblem(), getNeighbourhood(), getTabuMemory());
		ret.addStopCriterion(new StopCriterion() {
			
			@Override
			public boolean searchShouldStop(Search<?> arg0) {
				return arg0.getSteps() > slots.size()*features.size()*2;
			}
		});
		//Everything unassigned to be deterministic
		ret.setCurrentSolution(new SlotSolution());
		return ret;
	}
	
	public TabuMemory<SlotSolution> getTabuMemory() {
		return new TabuMemory<SlotSolution>() {
			private int[] lastChange = new int[features.size()];
			private int curStep;
			private int limit = Math.min(slots.size()/2, 1);
					
			@Override
			public void clear() {
				curStep = 0;
				lastChange = new int[features.size()];
			}

			@Override
			public boolean isTabu(Move<? super SlotSolution> arg0, SlotSolution arg1) {
				SimpleMove move = (SimpleMove)arg0;
				return lastChange[move.feature] + limit > curStep;
			}

			@Override
			public void registerVisitedSolution(SlotSolution arg0, Move<? super SlotSolution> arg1) {
				SimpleMove move = (SimpleMove)arg1;
				if (move != null) {
					lastChange[move.feature] = curStep;
					++curStep;
				}
			}
		};
	}
	
	public Neighbourhood<SlotSolution> getNeighbourhood() {
		return new Neighbourhood<SlotSolution>() {

			@Override
			public List<? extends Move<? super SlotSolution>> getAllMoves(SlotSolution arg0) {
				return arg0.getMoves();
			}

			@Override
			public Move<? super SlotSolution> getRandomMove(SlotSolution arg0, Random arg1) {
				List<? extends Move<? super SlotSolution>> moves = getAllMoves(arg0);
				return moves.get(arg1.nextInt(moves.size()));
			}
		};
	}
		
	public Problem<SlotSolution> getProblem() {
		return new Problem<SlotSolution>() {

			@Override
			public SlotSolution createRandomSolution(Random arg0) {
				IntStream ints = arg0.ints(0, slots.size());
				SlotSolution ret = new SlotSolution();
				OfInt iter = ints.iterator();
				for (int i = 0; i < ret.associatedSlots.length; ++i) {
					ret.associatedSlots[i] = iter.nextInt()+1;
				}
				return ret;
			}

			@Override
			public Evaluation evaluate(SlotSolution arg0) {
				return new Evaluation() {
					private double value = arg0.getQuality().getQuality();
					@Override
					public double getValue() {
						return value;
					}
				};
			}

			@Override
			public boolean isMinimizing() {
				return false;
			}

			@Override
			public Validation validate(SlotSolution arg0) { 
				return new Validation() {
					
					@Override
					public boolean passed() {
						//For now
						return true;
					}
				};
			}

		};
	}
	
	private List<Move<? super SlotSolution>> allMoves = new ArrayList<Move<? super SlotSolution>>();
	
	public class SlotSolution extends Solution {
		private int[] associatedSlots;
		
		public SlotSolution() {
			associatedSlots = new int[features.size()];
			for (int i = 0; i < associatedSlots.length; ++i) {
				associatedSlots[i] = 1;
			}
		}
		
		public SlotSolution(int[] solution) {
			this.associatedSlots = solution;
		}
		
		private int[] actualAssignments;
		
		public SolutionQuality getQuality() {
			actualAssignments = new int[slots.size()];
			int missingSlots = 0;
			double quality = 0.0;
			for (int i = 0; i < associatedSlots.length; ++i) {
				int slot = associatedSlots[i];
				if (slot == 0) {
					++missingSlots;
					continue;
				}
				int realSlot = slot-1;
				actualAssignments[realSlot]++;
				quality+= qualityTable[realSlot][i];
			}
			SolutionQuality ret = new SolutionQuality();
			ret.missingSlots = missingSlots;
			for (int i = 0; i < slots.size(); ++i) {
				Slot slot = slots.get(i);
				ret.hardErrors+= slot.numErrors(actualAssignments[i]);
			}
			return ret;
		}
		
		

		public List<? extends Move<? super SlotSolution>> getMoves() {
			return SlotAssignmentProblem.this.allMoves;
		}


		@Override
		public Solution copy() {
			SlotSolution ret = new SlotSolution();
			ret.associatedSlots = Arrays.copyOf(associatedSlots, associatedSlots.length);
			return ret;
		}

		@Override
		public boolean equals(Object arg0) {
			if (!(arg0 instanceof SlotAssignmentProblem.SlotSolution)) {
				return false;
			}
			return Arrays.equals(associatedSlots, ((SlotSolution)arg0).associatedSlots);
		}

		@Override
		public int hashCode() {
			return Arrays.hashCode(associatedSlots);
		}
	}

}