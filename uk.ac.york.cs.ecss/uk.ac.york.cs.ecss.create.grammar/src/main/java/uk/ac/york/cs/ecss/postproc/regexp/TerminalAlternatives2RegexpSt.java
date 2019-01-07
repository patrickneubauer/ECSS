package uk.ac.york.cs.ecss.postproc.regexp;

import org.eclipse.xtext.*;
import org.eclipse.xtext.impl.ActionImpl;

public class TerminalAlternatives2RegexpSt {
	
	private static final int COLLATION_PRECEDENCE = 9;
	private static final int ESCAPED_PRECEDENCE = 8;
	private static final int CHARACTERSET_PRECEDENCE = 7;
	private static final int GROUPING_PRECEDENCE = 6;
	private static final int NEGATION_PRECEDENCE = 5;
	private static final int CARDINALITY_PRECEDENCE = 4;
	private static final int CONCATENATION_PRECEDENCE = 3;
	private static final int ANCHORING_PRECEDENCE = 2;
	private static final int ALTERNATION_PRECEDENCE = 1;
	
	public static String escape(String str) {
		return escapeP(str, "\\", "\n", "\t", ".", "\"","'","(", ")", "[", "]", "^", "|", "*", "+", "?", "{","}");
	}
	

	public static String charRep(String str) {
		return escapeP(str, "\\","^","-","]","[","(",")","{","}","|");
	}
	
	public static String escapeP(String str, String... things) {
		for (int i = 0; i < things.length; ++i) {
			str = str.replace(things[i], "\\"+things[i]);
		}
		return str;
	}
	
	public static boolean allSize1(AbstractElement e) {
		if (e instanceof Keyword) {
			return ((Keyword)e).getValue().length() == 1;
		} else if (e instanceof CharacterRange) {
			return allSize1(((CharacterRange) e).getLeft()) && 
					allSize1(((CharacterRange) e).getRight());
		}
		return false;
	}
	
	private static boolean isSimpleNegatedToken(NegatedToken tk) {
		AbstractElement ae = tk.getTerminal();
		if (allSize1(ae)) {
			return true;
		}
		if (ae instanceof Alternatives) {
			Alternatives alt = (Alternatives)ae;
			for (AbstractElement sae: alt.getElements()) {
				if (!allSize1(sae)) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	private static void addSimpleNegatedToken(StringBuilder builder, AbstractElement ae) {
		if (ae instanceof Keyword) {
			String val = ((Keyword) ae).getValue();
			builder.append(charRep(val));
		} else if (ae instanceof CharacterRange) {
			builder.append(charRep(((CharacterRange) ae).getLeft().getValue()));
			builder.append("-");
			builder.append(charRep(((CharacterRange) ae).getRight().getValue()));
		} else if (ae instanceof Alternatives) {
			for (AbstractElement sae: ((Alternatives) ae).getElements()) {
				addSimpleNegatedToken(builder, sae);
			}
		}
	}
	
	public static String convertSimpleNegatedToken(NegatedToken tk) {
		AbstractElement ae = tk.getTerminal();
		StringBuilder builder = new StringBuilder();
		builder.append("[^");
		addSimpleNegatedToken(builder, ae);
		builder.append("]");
		return builder.toString();
	}
	

	public static  String convert(AbstractElement ae, int prec) {
		// skip if ae.elements == ae.elements.RullCallImpl.elements
		String card = ae.getCardinality();
		StringBuilder builder = new StringBuilder();
		boolean didWrap = false;
		if (card != null) {
			didWrap = true;
			builder.append("(");
		}
		if (ae instanceof NegatedToken) {
			if (isSimpleNegatedToken((NegatedToken)ae)) {
				builder.append(convertSimpleNegatedToken((NegatedToken)ae));
			} else {
				builder.append("~");
				String conv = 
						convert(((NegatedToken)ae).getTerminal(), NEGATION_PRECEDENCE);
				if (prec > NEGATION_PRECEDENCE) {
					builder.append("("+conv+")");
				} else {
					builder.append(conv);
				}
			}
			
		} else if (ae instanceof UntilToken) {
			//A (~E)* E
			UntilToken ut = (UntilToken)ae;
			String first = convert(ut.getTerminal(), CONCATENATION_PRECEDENCE);
			String second = convert(ut.getTerminal(), Math.min(NEGATION_PRECEDENCE, CONCATENATION_PRECEDENCE));
			if (prec > CONCATENATION_PRECEDENCE) {
				builder.append("(");
			}
			builder.append(first);
			builder.append("(~"+second+")* "+second);
			if (prec > CONCATENATION_PRECEDENCE) {
				builder.append(")");
			}
		} else if (ae instanceof CharacterRange) {
			builder.append("[");
			CharacterRange cr = (CharacterRange)ae;
			builder.append(escape(cr.getLeft().getValue()));
			builder.append("-");
			builder.append(escape(cr.getRight().getValue()));
			builder.append("]");
		} else if (ae instanceof Keyword) {
			Keyword kw = (Keyword)ae;
			String val = kw.getValue();
			if (prec > CONCATENATION_PRECEDENCE && val.length()>1) {
				builder.append("(");
			}
			builder.append(escape(kw.getValue()));
			if (prec > CONCATENATION_PRECEDENCE && val.length()>1) {
				builder.append(")");
			}
		} else if (ae instanceof Wildcard) {
			Wildcard kw = (Wildcard)ae;
			builder.append(".");
		} else if (ae instanceof org.eclipse.xtext.RuleCall) {
			org.eclipse.xtext.RuleCall rc = (org.eclipse.xtext.RuleCall)ae;
			if (rc.getRule() != null) {
				String conv = convert(rc.getRule().getAlternatives(), prec);
				builder.append(conv);
			} else {
				System.out.println("Could not find rule for "+ae);
				builder.append("/*"+"Could not find rule for "+ae+"*/");
			}
		} else if (ae instanceof Alternatives) {
			Alternatives gr = (Alternatives)ae;
			if (prec > ALTERNATION_PRECEDENCE) {
				builder.append("(");
			}
			boolean first = true;
			for (AbstractElement sae: gr.getElements()) {
				if (first) {first=false;} else {builder.append("|");}
				String conv = convert(sae, ALTERNATION_PRECEDENCE);
				builder.append(conv);
			}
			if (prec > ALTERNATION_PRECEDENCE) {
				builder.append(")");
			}
		} else if (ae instanceof Group) {
			//Just everything after each other ...
			Group gr = (Group)ae;
			if (prec > CONCATENATION_PRECEDENCE) {
				builder.append("(");
			}
			for (AbstractElement sae: gr.getElements()) {
				String conv = convert(sae, CONCATENATION_PRECEDENCE);
				builder.append(conv);
			}
			if (prec > CONCATENATION_PRECEDENCE) {
				builder.append(")");
			}
		} else if (ae instanceof UnorderedGroup) {
			throw new UnsupportedOperationException("I think it should not occur");
			
		} else if (ae instanceof Action) {
			System.out.println("Encountered 'Action'.");
			// TODO: ???
			
		} else if (ae instanceof Assignment) {
			System.out.println("Encountered 'Assignment'.");
			// TODO: ???
			
		} else {
			throw new UnsupportedOperationException("Cannot support "+ae);
			
		}
		if (didWrap) {
			builder.append(")");
			if (card != null) {
				builder.append(card);
			}
		}
		return builder.toString();
	}
}
