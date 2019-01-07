package uk.ac.york.cs.ecss.postproc.regexp;

import com.google.inject.Injector;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.*;
import org.eclipse.xtext.resource.XtextResourceSet;
import uk.ac.york.cs.ecss.postproc.regexp.MyRegexp.ConflictResolution;
import uk.ac.york.cs.ecss.postproc.regexp.MyRegexp.SetRelation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class RegexpManager {
	
	static {
		
	}
	
	public static Map<MyRegexp, List<MyRegexp>> process(Collection<MyRegexp> regexp) {
		Map<MyRegexp, Set<MyRegexp>> equalRegexp = new HashMap<MyRegexp, Set<MyRegexp>>();
		
		Map<MyRegexp, Set<MyRegexp>> originalCombination = new HashMap<MyRegexp, Set<MyRegexp>>();
		
		Set<MyRegexp> currentlyExisting = new HashSet<MyRegexp>();
		
		
		mainLoop: for (MyRegexp re: regexp) {
			//Check if equal
			for (MyRegexp ce: currentlyExisting) {
				SetRelation relation = re.getRelation(ce);
				if (relation == SetRelation.EQUAL) {
					equalRegexp.computeIfAbsent(ce, x->new HashSet<>()).add(re);
					originalCombination.computeIfAbsent(re, x->new HashSet<>()).add(ce);
					continue mainLoop;
				}
			}
			
			currentlyExisting.add(re);
		}
	
		//Check all relations
		List<MyRegexp> reList = new ArrayList<>(currentlyExisting);
		for (int i = 0; i < reList.size(); ++i) {
			MyRegexp first = reList.get(i);
			for (int j = i+1; j < reList.size(); ++j) {
				MyRegexp second = reList.get(j);
				first.processRelation(second);
			}
		}
		for (MyRegexp mr: reList) {
			mr.removeIndirectSub();
		}
		//Try to pick arbitrary conflicts and resolve them
		boolean hadConflict = false;
		do {
			hadConflict = false;
			for (MyRegexp mr: reList) {
				if (mr.hasConflicts()) {
					hadConflict = true;
					ConflictResolution result = mr.resolveRandomConflict();
					MyRegexp a = result.a;
					MyRegexp b = result.b;
					MyRegexp intersection = result.intersection;
					MyRegexp awithoutb = result.awithoutb;
					MyRegexp bwithouta = result.bwithouta;
					
					reList.remove(a);
					reList.remove(b);
					Arrays.asList(a,b).forEach(x->{
						x.remove();
					});
					List<MyRegexp> addList = new ArrayList<>(Arrays.asList(intersection,awithoutb,bwithouta));
					List<MyRegexp> takeAdd = new ArrayList<>();
					subLoop: for (MyRegexp add: addList) {
						for (MyRegexp smr: reList) {
							if (smr.isEqual(add)) {
								if (intersection == add) {
									intersection = smr;
								} else if (awithoutb == add) {
									awithoutb = smr;
								} else if (bwithouta == add) {
									bwithouta = smr;
								}
								continue subLoop;
							}
						}
						takeAdd.add(add);
					}
					originalCombination.computeIfAbsent(a, x->new HashSet<>()).addAll(Arrays.asList(intersection, awithoutb));
					originalCombination.computeIfAbsent(b, x->new HashSet<>()).addAll(Arrays.asList(intersection, bwithouta));
					for (MyRegexp addExp: takeAdd) {
						for (MyRegexp current: reList) {
							addExp.processRelation(current);
						}
					}
					for (int i = 0; i < takeAdd.size(); ++i) {
						for (int j = i+1; j < takeAdd.size(); ++j) {
							takeAdd.get(i).processRelation(takeAdd.get(j));
						}
					}
					reList.addAll(takeAdd);
					for (MyRegexp addExp: reList) {
						addExp.removeIndirectSub();
					}
					
						
					break;
				}
			}
		} while (hadConflict);
		//Now there should be no more conflicts
		
		//But it is still bad that some expressions may have sub/supertype relations
		//In fact, no "real" (pre-existing) expression may have a 'real' subtype
		//Ok, in fact this is not an issue at all
		//Because the problem is overriding, if you put in all the subtypes before the supertypes
		//And then use any terminal for the supertype, you are covered
		/*boolean hadSubtype = false;
		
		do {
			hadSubtype = false;
			for (MyRegexp mr: reList) {
				//A real must have no real subtypes
				if (regexp.contains(mr)) {
					//it is real
					Set<MyRegexp> subReg = mr.getAllSubReg();
					subReg.retainAll(regexp);
					if (!subReg.isEmpty()) {
						//This is a problem: a real one contains a real sub
						//But maybe it is not a direct subthing
						
						
					}
				}
			}
		} while (hadSubtype);*/
		
		
		//Now calculate what every expression is
		Map<MyRegexp, List<MyRegexp>> ret = new HashMap<MyRegexp, List<MyRegexp>>();
		for (MyRegexp mr: regexp) {
			//Recursively go through all expressions, but only take the last one
			Set<MyRegexp> root = new HashSet<MyRegexp>();
			Set<MyRegexp> used = new HashSet<>();
			Stack<MyRegexp> stack = new Stack<>();
			//Add real subs here??
			Set<MyRegexp> realSubs = mr.getAllSubReg();
			realSubs.retainAll(regexp);
			stack.add(mr);
			used.add(mr);
			stack.addAll(realSubs);
			used.addAll(realSubs);
			while (!stack.isEmpty()) {
				MyRegexp stackPop = stack.pop();
				Set<MyRegexp> oriComb = originalCombination.get(stackPop);
				if (oriComb == null) {
					root.add(stackPop);
				} else {
					for (MyRegexp oc: oriComb) {
						if (used.add(oc)) {
							stack.add(oc);
						}
					}
					
				}
			}
			List<MyRegexp> list = new ArrayList<>(root);
			list.sort((x,y)->{
				//System.out.println("x: "+x.getAllSubReg()+" VS y: " + y.getAllSubReg());
				return Integer.compare(x.getAllSubReg().size(), y.getAllSubReg().size());
			});
			ret.put(mr, list);
		}
		
		return ret;
	}
	
	public static class TerminalConversionInfo {
		private TerminalRule baseRule;
		private List<TerminalRule> replacementRule = new ArrayList<TerminalRule>();
		private int hashCode;
		
		public TerminalConversionInfo(TerminalRule baseRule, List<TerminalRule> replacementRule) {
			this.baseRule = baseRule;
			this.replacementRule = replacementRule;
			this.hashCode = Objects.hash(baseRule, replacementRule);
		}
		
		@Override
		public int hashCode() {
			return this.hashCode;
		}
		
		@Override
		public boolean equals(Object o) {
			if (!(o instanceof TerminalConversionInfo)) {
				return false;
			}
			TerminalConversionInfo tci = (TerminalConversionInfo)o;
			return Objects.equals(baseRule, tci.baseRule) &&
					replacementRule.equals(tci.replacementRule);
		}
	}
	
	public static String getName(String baseName, Set<String> existing) {
		int index = 2;
		if (existing.add(baseName)) {
			return baseName;
		}
		for(;;) {
			String newName = baseName+"_"+index;
			if (existing.add(newName)) {
				return newName;
			}
			++index;
		}
	}
	
	public static List<AbstractRule> postProcess(List<AbstractRule> start, Set<String> dataTypeNames) {
		Map<TerminalRule, List<TerminalRule>> terminalReplacement = new HashMap<TerminalRule, List<TerminalRule>>();
		Map<TerminalRule, AbstractRule> singleReplacement = new HashMap<TerminalRule, AbstractRule>();
		Map<TerminalConversionInfo, AbstractRule> singleThings = new HashMap<>();
		List<TerminalRule> allTerminalRules = new ArrayList<TerminalRule>();
		
		List<MyRegexp> allRegexps = new ArrayList<MyRegexp>();
		Map<MyRegexp, TerminalRule> regexpMap = new HashMap<>();
		Map<TerminalRule, MyRegexp> trMap = new HashMap<>();
		List<AbstractRule> ret = new ArrayList<>(start);
		List<TerminalRule> initTerminalRules = new ArrayList<>();
		for (AbstractRule rule: start) {
			if (rule instanceof TerminalRule) {
				TerminalRule tr = (TerminalRule)rule;
				initTerminalRules.add(tr);
				MyRegexp key = new MyRegexp(tr.getAlternatives());
				regexpMap.put(key, tr);
				trMap.put(tr, key);
			}
		}
		Set<String> usedNames = new HashSet<String>();
		for (AbstractRule s: start) {
			usedNames.add(s.getName());
		}
		
		Map<MyRegexp, List<MyRegexp>> retMap = process(regexpMap.keySet());
		Map<MyRegexp, TerminalRule> backConvert = new HashMap<>();
		int[] index = new int[]{1};
		for (List<MyRegexp> vals: retMap.values()) {
			for (MyRegexp mr: vals) {
				
				backConvert.computeIfAbsent(mr,r->{
					if (regexpMap.containsKey(mr)) {
						return regexpMap.get(mr);
					}
					TerminalRule tr = mr.getTerminalRule(getName("SYNTHETIC"+index[0],usedNames));
					++index[0];
					System.out.println("Generated Xtext "+mr.generateXtextSerialization()+" for "+mr.getRegExp());
					return tr;
				});
			}
		}
		List<MyRegexp> sortedList = new ArrayList<>(backConvert.keySet());
		sortedList.sort((x,y)->Integer.compare(x.getAllSubReg().size(), y.getAllSubReg().size()));
		
		retMap.forEach((k,v)->{
			TerminalRule base =  regexpMap.get(k);
			List<TerminalRule> list = new ArrayList<>(v.size());
			for (MyRegexp mr: v) {
				list.add(backConvert.get(mr));
			}
			terminalReplacement.put(base, list);
		});
		XtextFactory xfact = XtextFactory.eINSTANCE;
		for (TerminalRule tr: initTerminalRules) {
			MyRegexp mr = trMap.get(tr);
			List<MyRegexp> list = retMap.get(mr);
			if (list.size() == 1 && mr == list.get(0)) {
				singleReplacement.put(tr, tr);
				continue;
			}
			/*if (tr.getType() == null) {
				//No type, you can take whatever you want
			} else {*/
				//Create a datatype rule
				ParserRule parserRule = XtextFactory.eINSTANCE.createParserRule();
				parserRule.setName(getName(tr.getName()+"DT",usedNames));
				dataTypeNames.add(parserRule.getName());
				List<TerminalRule> trList = terminalReplacement.get(tr);
				if (trList.isEmpty()) {
					Keyword kw = xfact.createKeyword();
					kw.setValue("UNKNOWN");
					parserRule.setAlternatives(kw);
				} else if (trList.size() == 1) {
					RuleCall rc = xfact.createRuleCall();
					rc.setRule(trList.get(0));
					parserRule.setAlternatives(rc);
				} else {
					Alternatives alt = xfact.createAlternatives();
					for (TerminalRule str: trList) {
						RuleCall rc = xfact.createRuleCall();
						rc.setRule(str);
						alt.getElements().add(rc);
					}
					parserRule.setAlternatives(alt);
				}
				parserRule.setType(EcoreUtil.copy(tr.getType()));
				singleReplacement.put(tr, parserRule);
			/*}*/
		}
		Set<AbstractRule> usedReplacements = new HashSet<AbstractRule>();
		singleReplacement.forEach((k,v)->{
			if (k != v) {
				int idx = ret.indexOf(k);
				if (idx != -1) {
					if (usedReplacements.add(v)) {
						ret.set(idx, v);
					} else {
						ret.remove(idx);
					}
				}
				//EcoreUtil.replace(k, v);
			} 
		});
		
		for (MyRegexp mr: sortedList) {
			TerminalRule tr = backConvert.get(mr);
			if (!ret.contains(tr)) {
				System.out.println("Added "+mr.generateXtextSerialization());
				ret.add(tr);
			}
		}
		for (AbstractRule rule: start) {
			rule.eAllContents().forEachRemaining(y->y.eClass().getEAllReferences().forEach(x->{
				if (x.isMany()) {
					List c = (List)y.eGet(x);
					c.replaceAll(z->{
					if (z instanceof AbstractRule) {
						return singleReplacement.getOrDefault(z, (AbstractRule)z);
					} else {return z;}});
				} else {
					Object z = y.eGet(x);
					if (z instanceof AbstractRule) {
						y.eSet(x, singleReplacement.getOrDefault(z, (AbstractRule)z));
					}
				}
			}));
		}
		return ret;
	}
	
	
	public static List<MyRegexp> getSortedList(Set<MyRegexp> mr) {
		List<MyRegexp> ret = new ArrayList<MyRegexp>(mr);
		ret.sort((x,y)->Integer.compare(x.getAllSubReg().size(), y.getAllSubReg().size()));
		return ret;
	}
	
	/**
	 * not supposed to be used by anything other than main() for testing
	 */
	private static void testXtext() {
		XtextStandaloneSetup xtextSetup = new XtextStandaloneSetup();
		Injector xtextInjector = xtextSetup.createInjectorAndDoEMFRegistration();
		XtextFactory xfact = XtextFactory.eINSTANCE;
		
		XtextResourceSet xrs = xtextInjector.getInstance(XtextResourceSet.class);
		File file = new File("C:\\Users\\Robert\\Documents\\AME\\ECSS\\ecss-framework\\uk.ac.york.simpleregexp.simplereg\\src\\uk\\ac\\york\\simpleregexp\\simplereg\\SimpleReg.xtext");
		if (!file.exists()) {
			file = new File("E:\\patrick\\ECSS\\ecss-framework\\uk.ac.york.simpleregexp.simplereg\\src\\uk\\ac\\york\\simpleregexp\\simplereg\\SimpleReg.xtext");
		}
		
		Resource resource = xrs.getResource(URI.createFileURI(file.getAbsolutePath()),true);
		Grammar g = (Grammar)resource.getContents().get(0);
		List<AbstractRule> newRules = postProcess(g.getRules(), new HashSet<String>());
		if (newRules != g.getRules()) {
			g.getRules().clear();
			g.getRules().addAll(newRules);
		}
		try {
			resource.save(new FileOutputStream(file.getAbsolutePath()+".out2.xtext"), Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		testXtext();
		RegexpManager rm = new RegexpManager();
		MyRegexp first = new MyRegexp("[a-zA-Z]*");
		MyRegexp second = new MyRegexp("[a-z0-9]*");
		MyRegexp third = new MyRegexp("abla[a-zA-Z0-9]*");
		Collection<MyRegexp> regexps = new ArrayList<>(Arrays.asList(first,second/*,third*/));
		Map<MyRegexp, List<MyRegexp>> process = rm.process(regexps);
		List<MyRegexp> sortedList = getSortedList(process.keySet());
		sortedList.forEach(k->{
			List<MyRegexp> v = process.get(k);
			v.forEach(x->x.getRegExp());
			System.out.println(k+" => "+v);
		});
		sortedList.forEach(k->{
			List<MyRegexp> v = process.get(k);
			v.forEach(x->x.getRegExp());
			System.out.println(k.generateXtextSerialization()+" => ");
			for (MyRegexp sub: v) {
				System.out.println("\t"+sub+" ===> \n"+sub.generateXtextSerialization());
			}
		});
	}

}
