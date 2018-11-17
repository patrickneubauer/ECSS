package uk.ac.york.cs.ecss.postproc.regexp;

import com.google.inject.Injector;
import dk.brics.automaton.Automaton;
import dk.brics.automaton.RegExp;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.*;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.snt.autorex.Autorex;
import uk.ac.york.cs.ecss.simpleregexp.simplereg.SimpleRegStandaloneSetup;
import util.SetUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyRegexp {
	private String regexp;
	private RegExp re;
	private uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.AbstractElement ra;
	private AbstractElement xtextElement;
	private Automaton automaton;
	
	private Set<MyRegexp> subRegexp = new HashSet<>();
	private Set<MyRegexp> superRegexp = new HashSet<>();
	private Set<MyRegexp> equalRegexp = new HashSet<>();
	private Set<MyRegexp> conflictingRegexp = new HashSet<>();
	
	private Map<MyRegexp, SetRelation> knownRelations = new HashMap<>();
	
	
	
	/**Boolean: Whether both are equal*/
	public boolean processRelation(MyRegexp other) {
		SetRelation sr = getRelation(other);
		switch(sr) {
		case NONE:
			break;
		case EQUAL:
			equalRegexp.add(other);
			other.equalRegexp.add(this);
			break;
		case INTERSECT:
			conflictingRegexp.add(other);
			other.conflictingRegexp.add(this);
		break;
		case SUBSET:
			superRegexp.add(other);
			other.subRegexp.add(this);
			break;
		case SUPERSET:
			subRegexp.add(other);
			other.superRegexp.add(this);
			break;
		}
		return sr == SetRelation.EQUAL;
	}
	
	
	public Set<MyRegexp> getAllSubReg() {
		return SetUtils.getRecursivelyS(subRegexp, x->x.subRegexp);
	}
	
	public void removeIndirectSub() {
		//TODO: That is slow, a faster way is possible
		Set<MyRegexp> indirectSub = new HashSet<MyRegexp>();
		Set<MyRegexp> allSub = getAllSubReg();
		for (MyRegexp s: subRegexp) {
			indirectSub.addAll(SetUtils.getRecursivelyS(s.subRegexp, x->x.subRegexp));
		}
		allSub.removeAll(indirectSub);
		for (MyRegexp indSub: indirectSub) {
			indSub.superRegexp.remove(this);
		}
		this.subRegexp.removeAll(indirectSub);
	}
	
	/**Returns: A, B, A n B, A \ B, B \ A*/
	public ConflictResolution getConflictResolution(MyRegexp other) {
		MyRegexp intersection = new MyRegexp(automaton.intersection(other.automaton));
		MyRegexp awithoutb = new MyRegexp(automaton.minus(other.automaton));
		MyRegexp bwithouta = new MyRegexp(other.automaton.minus(automaton));
		return new ConflictResolution(this, other, intersection, awithoutb, bwithouta);
	}
	
	public boolean hasConflicts() {
		return !conflictingRegexp.isEmpty();
	}
	
	public static class ConflictResolution {
		public final MyRegexp a;
		public final MyRegexp b;
		public final MyRegexp intersection;
		public final MyRegexp awithoutb;
		public final MyRegexp bwithouta;
		
		public ConflictResolution(MyRegexp a, MyRegexp b, MyRegexp intersection, MyRegexp awithoutb, MyRegexp bwithouta) {
			this.a = a;
			this.b = b;
			this.intersection = intersection;
			this.awithoutb = awithoutb;
			this.bwithouta = bwithouta;
		}
	}
	
	public ConflictResolution resolveRandomConflict() {
		MyRegexp resolve = conflictingRegexp.iterator().next();
		return getConflictResolution(resolve);
	}
	
	private static SimpleRegStandaloneSetup setup = new SimpleRegStandaloneSetup();
	private static Injector injector = setup.createInjectorAndDoEMFRegistration();
	private static XtextStandaloneSetup xtextSetup = new XtextStandaloneSetup();
	private static Injector xtextInjector = xtextSetup.createInjectorAndDoEMFRegistration();
	private static XtextFactory xfact = XtextFactory.eINSTANCE;
	static {
		
	}
	
	
	public static enum SetRelation {
		NONE, SUBSET, SUPERSET, EQUAL, INTERSECT
	}
	
	public MyRegexp(String regexp) {
		initWithoutAutomaton(regexp);
		this.automaton = re.toAutomaton(true);
	}
	

	public TerminalRule getTerminalRule(String string) {
		TerminalRule tr = xfact.createTerminalRule();
		tr.setName(string);
		tr.setAlternatives(EcoreUtil.copy(getXtextElement()));
		return tr;
	}
	
	public AbstractElement getXtextElement() {
		if (xtextElement == null) {
			completeRegexp();
		}
		return xtextElement;
	}
	
	public String generateXtextSerialization() {
		if (xtextElement == null) {
			completeRegexp();
		}
		XtextResourceSet xrs = new XtextResourceSet();
		xrs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource res = xrs.createResource(URI.createFileURI("file://bla.xtext"));
		Grammar g = xfact.createGrammar();
		g.setName("removeMe");
		AbstractRule tr = getTerminalRule("synthetic");
		g.getRules().add(tr);
		res.getContents().add(g);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try {
			res.save(outputStream, xrs.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		String ret = new String(outputStream.toByteArray());
		ret = ret.substring(ret.indexOf(':')+1).trim();
		ret = ret.substring(0,ret.lastIndexOf(';'));
		return ret;
	}
	

	public MyRegexp(AbstractElement xtextElement) {
		this.xtextElement = xtextElement;
		this.regexp = TerminalAlternatives2RegexpSt.convert(xtextElement,-1);
		System.out.println("Converted "+generateXtextSerialization()+" to "+regexp);
		this.ra = getRA(regexp);
		try {
			this.re = new RegExp(regexp, RegExp.COMPLEMENT);
			this.automaton = re.toAutomaton(true);
		} catch (IllegalArgumentException e) {
			System.err.println("Could not convert " + this.regexp+": "+e.getMessage());
			e.printStackTrace();
			this.re = new RegExp("unknown", RegExp.COMPLEMENT);
			this.automaton = re.toAutomaton(true);
		}
		
	}
	
	private void initWithoutAutomaton(String regexp) {
		this.regexp = regexp;
		this.ra = getRA(regexp);
		this.xtextElement = RegExp2TerminalAlternatives.convert(ra);
		this.re = new RegExp(regexp, RegExp.COMPLEMENT);
	}
	
	//This is only for intermediate things
	public MyRegexp(Automaton automaton) {
		this.automaton = automaton;
		//this.automaton.minimize();
	}
	
	public void completeRegexp() {
		String regexp = Autorex.getRegexFromAutomaton(this.automaton);
		initWithoutAutomaton(regexp);
	}
	
	private static uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.AbstractElement getRA(String regex) {
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource regExpResource = rs.createResource(URI.createURI("file:/regexp.sreg"));
		ByteArrayInputStream in = new ByteArrayInputStream(regex.getBytes());
		try {
			regExpResource.load(in, rs.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.AbstractElement)regExpResource.getContents().get(0);
	}
	
	public SetRelation getRelation(MyRegexp ot) {
		return knownRelations.computeIfAbsent(ot, other->{
		Automaton intersect = automaton.intersection(other.automaton);
		if (intersect.isEmpty()) {
			return SetRelation.NONE;
		}
		//Check for equal
		boolean thisSubsetOther = automaton.minus(other.automaton).isEmpty();
		boolean otherSubsetThis = other.automaton.minus(this.automaton).isEmpty();
		if (thisSubsetOther) {
			if (otherSubsetThis) {
				return SetRelation.EQUAL;
			} else {
				return SetRelation.SUBSET;
			}
		} else {
			if (otherSubsetThis) {
				return SetRelation.SUPERSET;
			} else {
				return SetRelation.INTERSECT;
			}
		}
		});
	}


	public boolean isEqual(MyRegexp add) {
		return getRelation(add) == SetRelation.EQUAL;
	}


	public void remove() {
		superRegexp.forEach(x->x.subRegexp.remove(this));
		subRegexp.forEach(x->x.superRegexp.remove(this));
		conflictingRegexp.forEach(x->x.conflictingRegexp.remove(this));
		
	}
	
	public String getRegExp() {
		if (this.regexp == null) {
			completeRegexp();
		}
		return this.regexp;
	}
	
	public String toString() {
		return getRegExp();
	}


}
