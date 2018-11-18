package uk.ac.york.cs.ecss.migrated;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Stack;

import org.apache.commons.io.output.NullOutputStream;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class DistanceCalculator {

	private boolean finished;
	private EMFCompare ecomp;
	private double matches;
	public double getMatches() {
		return matches;
	}

	public double getDifferences() {
		return differences;
	}
	
	public boolean isFinished() {
		return finished;
	}

	public double getDistance() {
		return distance;
	}

	private double differences;
	private double distance;
	private int posX;
	private int posY;
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	private String firstResourceName;
	public String getFirstResourceName() {
		return firstResourceName;
	}

	public String getSecondResourceName() {
		return secondResourceName;
	}

	private String secondResourceName;
	
	private String firstResourcePath;
	public String getFirstResourcePath() {
		return firstResourcePath;
	}

	public String getSecondResourcePath() {
		return secondResourcePath;
	}

	private String secondResourcePath;
	private OutputStream outputWriter = new NullOutputStream();

	public DistanceCalculator(OutputStream outputWriter) {
		
		this.ecomp = EMFCompare.builder().build();
		this.finished = false;
		this.outputWriter = outputWriter;

		// disable log4j logging
		Logger.getLogger(EMFCompare.class).setLevel(Level.OFF);;
		Logger.getRootLogger().setLevel(Level.OFF);
	}

	public void calculateDistance(Resource first, Resource second, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		
		firstResourcePath = first.getURI().trimFileExtension().toFileString();
		secondResourcePath = second.getURI().trimFileExtension().toFileString();
		
		firstResourceName = new File(firstResourcePath).getName();
		secondResourceName = new File(secondResourcePath).getName();

		try {
			// re-load resource to avoid multi-threading issues
			Resource firstResource = first;//reloadResource(first);
			Resource secondResource = second; //reloadResource(second);
			synchronized (first) {
				synchronized (second) {
					IComparisonScope scope = new DefaultComparisonScope(firstResource, secondResource, null);
					Comparison comp = ecomp.compare(scope);
					matches = 0;
					differences = 0;
					// Really simple, let's see how good it is
					// Decrease severity the lower you go
					for (Match m : comp.getMatches()) {
						++matches;
						double curWeight = 1.0;
						Stack<Stack<Match>> curMatches = new Stack();
						Stack<Match> curmStack = new Stack<Match>();
						curmStack.addAll(m.getSubmatches());
						curMatches.add(curmStack);
						while (!curMatches.isEmpty()) {
							Stack<Match> curStack = curMatches.peek();
							if (curStack.isEmpty()) {
								curMatches.pop();
								curWeight *= 2;
							} else {
								Match curMatch = curStack.pop();
								if (curMatch.getLeft() != null && curMatch.getRight() != null) {
									matches += curWeight;
								} else {
									differences += curWeight;
								}
			//					for (Diff diff : curMatch.getDifferences().size()) {
			//						// DifferenceKind kind = diff.getKind();
			//						differences += curWeight; 
			//					}
								differences += curWeight * curMatch.getDifferences().size();
								Stack<Match> subStack = new Stack<Match>();
								subStack.addAll(curMatch.getSubmatches());
								curMatches.push(subStack);
								curWeight *= 0.5;
							}
						}
					}
					distance = ((double) differences) / (matches + differences);
					distance = Math.pow(distance, 2); // ... to decrease smaller parts??
					finished = true;
					synchronized (outputWriter) {
						outputWriter.write((posX+","+posY+"="+distance+"\n").getBytes());
						outputWriter.flush();
					}
				}
			}
			
		} catch (Exception e) {
			distance = 1.0;
			System.err.println("Error: "+e.getMessage());
			e.printStackTrace();
		}
	}
	public String getReportLine() {
		return "Distance between '" + firstResourceName + "' and '" + secondResourceName + "' is " + distance + " ("
				+ matches + "/" + differences + ")\n";
	}
	
	private Resource reloadResource(Resource resource) {
		
		Injector i = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet xtextResourceSet = i.getInstance(XtextResourceSet.class);
//		Resource xtextMetamodelResource = xtextResourceSet.getResource(URI.createFileURI("resources/Xtext.ecore"), true);
		Resource reloadedResource = xtextResourceSet.getResource(resource.getURI(), true);
		
	    try {
	    		reloadedResource.load(null);
	    } catch (IOException e) {
			e.printStackTrace();
		}
		
	    return reloadedResource;
	}

}