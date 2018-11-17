package uk.ac.york.cs.ecss.postproc.regexp;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.*;
import uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.MultiCharacters;
import uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.RegexAlternatives;
import uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.RegexGroup;
import uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.SingleChars;
import uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class RegExp2TerminalAlternatives {
	
	private static XtextFactory xfact = XtextFactory.eINSTANCE;

	public static void processPrintable(EObject el) {
		if (el instanceof CharacterRange) {
			//TODO: Single keywords not covered, but hopefully they don't occur
			CharacterRange cr = (CharacterRange)el;
			Keyword kw = (Keyword)cr.getLeft();
			if (kw.getValue() != null) {
				kw.setValue(printable(kw.getValue()));
			}
			Keyword kw2 = (Keyword)cr.getRight();
			if (kw2.getValue() != null) {
				kw2.setValue(printable(kw2.getValue()));
			}
		} else {
			el.eContents().forEach(x->processPrintable(x));
		}
	}
	

	public static String printable(String str) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < str.charAt(i); ++i) {
			char c = ret.charAt(i);
			if (c < ' ') {
				//We can't handle non-printable characters
				//TODO: I hope this doesn't occurr in a negated rule
				
				ret.append(" ");
			} else {
				ret.append(c);
			}
		}
		return ret.toString();
	}
	
	
	public static AbstractElement convert(uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.AbstractElement ra)  {
		if (ra instanceof MultiCharacters) {
			return convert((MultiCharacters)ra);
		} else if (ra instanceof RegexAlternatives) {
			return convert((RegexAlternatives)ra);
		} else if (ra instanceof RegexGroup) {
			return convert((RegexGroup)ra);
		} else if (ra instanceof SingleChars) {
			return convert((SingleChars)ra);
		} else if (ra instanceof Wildcard) {
			return convert((Wildcard)ra);
		} else if (ra instanceof uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.AbstractElement) {
			return convertBasic((uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.AbstractElement)ra);
		}
		throw new UnsupportedOperationException("Unknown type "+ra+"!");
	}
	
	public static org.eclipse.xtext.AbstractElement convertChars(String val, boolean mayNegate) {
		if (val.startsWith("^")) {
			//Negated
			NegatedToken ret = xfact.createNegatedToken();
			AbstractElement sub = convertChars(val.substring(1), false);
			ret.setTerminal(sub);
			return ret;
		} else {
			List<org.eclipse.xtext.AbstractElement> allowed = new ArrayList<org.eclipse.xtext.AbstractElement>();
			boolean hadRange = false;
			for (int i = 0; i < val.length(); ++i) {
				char c = val.charAt(i);
				if (c == '\\' && i < val.length()-1) {
					++i;
					c = val.charAt(i);
					Keyword kw = xfact.createKeyword();
					kw.setValue(String.valueOf(c));
					allowed.add(kw);
				} else if (c == '-' && i < val.length()-1 && !allowed.isEmpty() && allowed.get(allowed.size()-1) instanceof Keyword) {
					++i;
					c = val.charAt(i);
					CharacterRange cr = xfact.createCharacterRange();
					cr.setLeft((Keyword)(allowed.get(allowed.size()-1)));
					Keyword kw = xfact.createKeyword();
					kw.setValue(String.valueOf(c));
					cr.setRight(kw);
					allowed.set(allowed.size()-1,cr);	
				} else {
					Keyword kw = xfact.createKeyword();
					kw.setValue(String.valueOf(c));
					allowed.add(kw);
				}
			}
			if (allowed.isEmpty()) {
				return null;
			} else if (allowed.size()==1) {
				return allowed.get(0);
			} else {
				Alternatives alt = xfact.createAlternatives();
				alt.getElements().addAll(allowed);
				return alt;
			}
		}
	}
	
	public static AbstractElement convert(MultiCharacters ra)  {
		String val = ra.getValue();
		 //Manually parse things ...
		AbstractElement chars = convertChars(val.substring(1,val.length()-1), true);
		return wrapMultiplicity(chars, ra);
	}
	public static AbstractElement convertBasic(uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.AbstractElement ra)  {
		Keyword ret = xfact.createKeyword();
		return wrapMultiplicity(ret, ra);
	}
	
	
	public static AbstractElement wrapMultiplicity(AbstractElement el, uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.AbstractElement ae) {
		if (el == null) {
			return null;
		}
		applyCardinality(ae.getCardinality(), el);
		if (ae.isHasMinCard()) {
			int realMinCard = ae.getMinCardinality();
			int realMaxCard = realMinCard;
			if (ae.isHasMaxCard()) {
				realMaxCard = ae.getMaxCardinality();
				if (realMaxCard == 0) {
					realMaxCard = Integer.MAX_VALUE;
				}
			}
			if (realMinCard == 0 && realMaxCard == 0) {
				return null;
			}
			//Repeat the element now 
			//Check if it is star-equivalent
			if (realMinCard == 0) {
				if (realMaxCard == 1) {
					//Optional
					applyCardinality("?", el);
					return el;
				} else if (realMaxCard == Integer.MAX_VALUE) {
					applyCardinality("*", el);
					return el;
				}
			} else if (realMinCard == 1) {
				if (realMaxCard == 1) {
					//1:1 - just return
					return el;
				} else if (realMaxCard == Integer.MAX_VALUE) {
					//Must be at least once
					applyCardinality("+", el);
					return el;
				}
			}
			//Not a star-equivalent thing
			if (realMaxCard == Integer.MAX_VALUE) {
				//Fixed upper bound, so we just have to repeat everything
				Group rg = xfact.createGroup();
				for (int i = 0; i < realMinCard; ++i) {
					AbstractElement copy = EcoreUtil.copy(el);
					rg.getElements().add(copy);
				}
				//All others must be wrapped in options
				if (realMinCard < realMaxCard) {
					if (realMinCard == realMaxCard-1) {
						//Just once
						applyCardinality("?", el);
						rg.getElements().add(el);
					} else {
						//Many times
						Group newGr = null;
						AbstractElement oldEl = el;
						for (int i = realMinCard; i < realMaxCard-1; ++i) {
							newGr = xfact.createGroup();
							newGr.setCardinality("?");
							AbstractElement copy = EcoreUtil.copy(el);
							newGr.getElements().add(copy);
							newGr.getElements().add(oldEl);
							oldEl = newGr;
						}
						applyCardinality("?", el);
						rg.getElements().add(newGr);
					}
				}
				return rg;
			} else {
				Group rg = xfact.createGroup();
				//We can save the last repetition with a plus
				for (int i = 0; i < realMinCard-1; ++i) {
					AbstractElement copy = EcoreUtil.copy(el);
					rg.getElements().add(copy);
				}
				//It is not star-equivalent, so we know that the former is at least 1!
				applyCardinality("+", el);
				rg.getElements().add(el);
				return rg;
			}
		} else {
			//Nothing to do
			return el;
		}
		
	}
	

	public static AbstractElement convert(RegexAlternatives ra)  {
		//Hoffentlich?!
		Alternatives alt = xfact.createAlternatives(); 
		ra.getElements().forEach(x->{
			AbstractElement toAdd = convert(x);
			if (toAdd != null) {
				alt.getElements().add(toAdd);
			}
		});
		if (alt.getElements().size() == 0) {
			return null;
		} else if (alt.getElements().size() == 1) {
			wrapMultiplicity(alt.getElements().get(0), ra);
			return alt.getElements().get(0);
		}
		return wrapMultiplicity(alt, ra);
	}
	

	public static AbstractElement convert(RegexGroup ra)  {
		Group gr = xfact.createGroup();
		ra.getElements().forEach(x->{
			AbstractElement toAdd = convert(x);
			if (toAdd != null) {
				gr.getElements().add(toAdd);
			}
		});
		if (gr.getElements().size() == 0) {
			return null;
		} else if (gr.getElements().size() == 1) {
			wrapMultiplicity(gr.getElements().get(0), ra);
			return gr.getElements().get(0);
		}
		return wrapMultiplicity(gr, ra);
	}
	

	public static AbstractElement convert(SingleChars ra)  {
		Keyword kw = xfact.createKeyword();
		kw.setValue(ra.getValue());
		return wrapMultiplicity(kw, ra);
	}
	

	public static AbstractElement convert(Wildcard ra)  {
		org.eclipse.xtext.Wildcard ret = xfact.createWildcard();
		return wrapMultiplicity(ret, ra);
	}

	// ----------- MOVED FROM GrammarCreator START ---------------
	public static void applyCardinality(String fromCard, AbstractElement to) {
		if (fromCard != null) {
			if (to.getCardinality() == null) {
				to.setCardinality(fromCard);
			} else {
				switch(fromCard) {
					case "+": to.setCardinality("+"); break;
					case "*": to.setCardinality("*"); break;
					case "?": if ("+".equals(to.getCardinality()) || "*".equals(to.getCardinality())) {
						to.setCardinality("*");
					} else {
						to.setCardinality("?");
					}
						break;
				}
			}
		}
	}
	// ----------- MOVED FROM GrammarCreator END ---------------
	
}
