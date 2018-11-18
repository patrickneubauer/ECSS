package uk.ac.york.cs.ecss.migrated;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.Files;

import com.google.inject.Injector;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;

public class EMFCompareRelation extends AbstractRelation {
	
	public static SimpleDateFormat time_formatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");

	
	private static final Logger logger = LogManager.getLogger(EMFCompareRelation.class);

	private boolean threaded = false;
	public boolean isThreaded() {
		return threaded;
	}

	public void setThreaded(boolean threaded) {
		this.threaded = threaded;
	}

	private String serverUrl = null;

	private double[][] matrix;

	private List<File> filesList = new ArrayList();
	private File[] files;
	//private ResourceSet resourceSet;
	private List<String> names;
	private Map<String,String> equalFiles = new HashMap<>();
	private Map<String,List<String>> potentialFiles = new HashMap<>();
	private Map<String,Integer> nameIndes = new HashMap<String, Integer>();
	private List<Resource> resources = new ArrayList<Resource>();
	private OutputStream logOutputStream;
	protected Resource ecssalModelResource;
	private File matrixFile;
	private static byte[] reserve = new byte[50 * 1024 * 1024]; // Reserves 50MB.
    List<CompletableFuture<DistanceCalculator>> distanceCalculatorList = new ArrayList<CompletableFuture<DistanceCalculator>>();

	private Map<Long,List<File>> filesWithLength = new HashMap<Long, List<File>>();

	private OkHttpClient client = new OkHttpClient();
	private OkUrlFactory urlFactory = new OkUrlFactory(client);
	
	/**This distance is between 0 and one. 0 means equal, 1 means totally different. Should be symmetric.*/
	
	public EMFCompareRelation(String reportFile, String matrixFile, ResourceSet resourceSet, ArrayList<ClassInstance> classInstances, File[] files, Resource ecssalModelResource,
			String serverUrl) {
		//this.files = files;
		super(reportFile);
		this.serverUrl = serverUrl;
		this.files = files;
		this.matrixFile = new File(matrixFile);
		//this.resourceSet = resourceSet;
		Arrays.sort(files, (x,y)->x.getName().compareToIgnoreCase(y.getName()));
		//Directly get file because needed
		for (int i = 0; i < files.length; ++i) {
			File file = files[i];
			List<File> curList = filesWithLength.get(file.length());
			//Skip file if already equal exists
			boolean skip = false;
			if (curList != null) {
				for (File current: curList) {
					try {
						if (FileUtils.contentEquals(current, file)) {
							skip = true;
							equalFiles.put(file.getName(), current.getName());
							List<String> curPot = potentialFiles.get(current.getName());  //Must be set
							curPot.add(file.getName());
							potentialFiles.put(current.getName(), curPot);
							break;
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} else {
				curList = new ArrayList<File>();
				filesWithLength.put(file.length(), curList);
			}
			if (skip) {
				continue;
			}
			{
				List<String> eqL = new ArrayList<String>();
				eqL.add(file.getName());
				potentialFiles.put(file.getName(), eqL);
				equalFiles.put(file.getName(), file.getName());
			}
			curList.add(file);
			try {
				//Create a new resourceset for each resource. Maybe this helps with sync issues
				ResourceSet xtextResourceSet;
				if (threaded) {
					Injector inj = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
					xtextResourceSet = inj.getInstance(XtextResourceSet.class);
					//This is done in the SimpleXtext... - why not here?
					Resource xtextMetamodelResource = xtextResourceSet.getResource(URI.createFileURI(SimpleClusterGenerator.XTEXT_METAMODEL_FILE_LOCATION), true);
					
				    try {
				    		xtextMetamodelResource.load(null);
				    } catch (IOException e) {
					}
				} else {
					xtextResourceSet = resourceSet;
				}
				//
//				Resource xtextMetamodelResource = xtextResourceSet.getResource(URI.createFileURI("resources/Xtext.ecore"), true);
				Resource resource = xtextResourceSet.getResource(URI.createFileURI(file.getAbsolutePath().toString()), true);
			    try {
			    	resource.load(null);
			    } catch (IOException e) {
					e.printStackTrace();
				}				
				//Initialize loading - maybe helps - at least it might weed out some resources??
				resource.getContents();
				resources.add(resource);
//				System.out.println(filesList.size()+":"+file.getAbsolutePath());
				filesList.add(file);
				if (filesList.size()%NUMBER_OF_RESOURCES_LOADED_STATUS_UPDATE == 0) {
					logger.info("Loaded " + filesList.size()+"/"+(files.length-(i-filesList.size()+1))+" files ...");
				}
			} catch (Exception e) {
				logger.error("Could not load resource "+file);
			}
		}
		
		initializeMatrix(); 

	}
	
	public String getCanonicalFileName(String name) {
		return equalFiles.getOrDefault(name, name);
	}


	private void initNameList() {
		names = new ArrayList<String>();
		for (File file: filesList) {
			int index = names.size();
			for (String equal: potentialFiles.get(file.getName())) {
				nameIndes.put(equal, index);
			}
			nameIndes.put(file.getName(), index);
			String fn = file.getName().replaceFirst("[.][^.]+$", "");
			while (names.contains(fn)) {
				fn = fn+"_";
			}
			names.add(fn);
		}
	}
	
	public double getMatrixDistance(String grammarName1, String grammarName2) {
		Integer index1 = nameIndes.get(grammarName1 + ".xtext");
		Integer index2 = nameIndes.get(grammarName2 + ".xtext");
		if (index1 != null && index2 != null) {
			double ret = matrix[index1][index2];
			if (ret == DEFAULT_MATRIX_VALUE) {
				//Don't have a value
				return 2.0;
			}
			return ret;
		}
		return 2.0;
	}

	

	public boolean hasMatrixDistance(String fileName1, String fileName2) {
		Integer index1 = nameIndes.get(fileName1);
		Integer index2 = nameIndes.get(fileName2);
		if (index1 != null && index2 != null) {
			double ret = matrix[index1][index2];
			return ret != DEFAULT_MATRIX_VALUE;
		}
		return false;
	}

	public void clear() {
	}

	public double[][] getMatrix() {
		return matrix;
	}

	public List<String> getNames() {
		return names;
	}

	long startTime = System.currentTimeMillis();
	List<int[]> positions;
	
	public static final double DEFAULT_MATRIX_VALUE = -1;
	
	@Override
	public void process() {		

//		initializeIFileMatrix();
		initializeLogOutputMatrix();
		logger.info("Processing relations (calculating distances) ...");
		if (serverUrl != null) {
			int errCount = 0;
			
			mainLoop: for (;;) {
				
				try {
					
					InputStream is = new URL(serverUrl).openStream();
					String job = Files.readStreamIntoString(is);
					for (;;) {
						
						try {is.close();} catch (IOException e){}
						if ("null".equals(job)) {
							break mainLoop;
						}
						String[] spl = job.split("\\,");
						
						try {
							Integer posX = nameIndes.get(spl[0]);
							Integer posY = nameIndes.get(spl[1]);
							if (posX == null || posY == null) {
								System.err.println("Cannot process "+spl[0]+"/"+spl[1]+": not found");
								
								HttpURLConnection con = urlFactory.open(new URL(serverUrl+"?job="+job));
								con.setDoOutput(true);
								con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
								con.setRequestMethod("DELETE");
								con.connect();
								is.close();
								break;
							} else {
								logger.debug("Calculating "+posX+","+posY);
								DistanceCalculator distanceCalculator = new DistanceCalculator(logOutputStream);
		                		//Vielleicht ist das ein Problem?
		                		distanceCalculator.calculateDistance(resources.get(posX), resources.get(posY), posX, posY);
		                		double distance = distanceCalculator.getDistance();
		                		matrix[posX][posY] = matrix[posY][posX] = distance;
		                		HttpURLConnection httpCon = urlFactory.open(new URL(serverUrl+"?job="+job+"&result="+distance));
		                		httpCon.setDoInput(true);
		                		httpCon.setRequestMethod("POST");
		                		httpCon.connect();
		                		job = Files.readStreamIntoString(httpCon.getInputStream());
		                		continue;
							}
						} catch (Exception e) {
							try {
								HttpURLConnection con = urlFactory.open(new URL(serverUrl+"?job="+job));
								System.err.println("Job: "+job);
								e.printStackTrace();
								System.err.println("Could not calculate: "+e.getMessage());
								con.setDoOutput(true);
								con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
								con.setRequestMethod("DELETE");
								con.connect();
								is.close();
								break;
							} catch (Exception ee) {
								System.err.println("Could not delete: "+ee.getMessage());
							}
						}
					}

					errCount = 0;
						
				} catch (MalformedURLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
					break;
				} catch (IOException e2) {
					e2.printStackTrace();
					if (++errCount > 10)  {
						break;
					}
					try {
						Thread.sleep(1000L*errCount);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				
			}
		} 
		int resourceCount = resources.size();
		int totalDistanceCount = 0;
		int distancesLeftToSubmit = 0;
		long startTime = System.currentTimeMillis();
		long currentTime = startTime;
		distanceCalculatorList = new ArrayList<CompletableFuture<DistanceCalculator>>(resourceCount*resourceCount/2);
		startTime = System.currentTimeMillis();
		int doneCount = 0;
		positions = new ArrayList<int[]>(resourceCount*resourceCount/2);
		for (int i = 0; i < resourceCount; ++i) {
			//Only half processed
			for (int j = i+1; j < resourceCount; ++j) {
				if (matrix[i][j] == DEFAULT_MATRIX_VALUE) {
					positions.add(new int[]{i,j});
					++totalDistanceCount;
				}
			}
		} 
		distancesLeftToSubmit = totalDistanceCount;
		Collections.shuffle(positions);
		for (int[] pos: positions) {
			int i = pos[0];
			int j = pos[1];
			if (matrix[i][j] != DEFAULT_MATRIX_VALUE) {
				--distancesLeftToSubmit;
				--totalDistanceCount;
				continue;
			}
			Resource first = resources.get(i);
			//String reportLine = "Submitting distance computations for " + new File(first.getURI().trimFileExtension().toFileString()).getName() + " ...";
			//logger.info(reportLine);
			
			Resource second = resources.get(j);
			try {
				
				double percentOfDistancesSubmitted = 100.0 - ((double)distancesLeftToSubmit / (double)totalDistanceCount * 100.0);
				long estimatedCompletion = (currentTime - startTime) * distancesLeftToSubmit;
				
				if ((++doneCount) % NUMBER_OF_DISTANCES_SUBMITTED_STATUS_UPDATE == 0) { 
					logger.info("Status: " + distancesLeftToSubmit + " distance computations left to submit " + "(" + percentOfDistancesSubmitted + "% submitted). Submission estimated to complete at " + time_formatter.format(startTime + estimatedCompletion));
				}
				
				// configure CompletableFuture
		        CompletableFuture<DistanceCalculator> distanceCalculatorFuture = createDistanceCalculatorFuture(first, second, i, j);
		        distanceCalculatorList.add(distanceCalculatorFuture);
				
				--distancesLeftToSubmit;
				currentTime = System.currentTimeMillis();
				
			} catch (Exception e) {
				logger.error("Could not submit or compute distance between "+new File(first.getURI().trimFileExtension().toFileString()).getName()+" and "+new File(second.getURI().trimFileExtension().toFileString()).getName());
				logger.error(e.getMessage());
			} catch (OutOfMemoryError e) {
				// serialize results
				reserve = new byte[0]; // release memory and use for further steps
				//serializeEcssalModel();					
			}
		}
		//logger.info("... finished submitting distance computation for " + new File(first.getURI().trimFileExtension().toFileString()).getName());
		logger.info("... finished submitting distance computations for creating relations.");
	
		//Less likely to get conflicts
		//Collections.shuffle(distanceCalculatorList);
		updateMatrixAndModel();
		//serializeEcssalModel();

	}
	
	private void updateMatrixAndModel() {
		logger.info("Updating distance matrix and analysis model ...");
		String firstResourceName = null;
		
		
		long currentTime = startTime;
		
		// now its time to get the results
        try {
        		int totalDistanceCount = distanceCalculatorList.size();
        		for (int disCalcListIndex=0; disCalcListIndex<totalDistanceCount; disCalcListIndex++) {
        			int[] ind = positions.get(disCalcListIndex);
        			logger.info(ind[0]+","+ind[1]);
    				DistanceCalculator disCalc = distanceCalculatorList.get(disCalcListIndex).get();
        			String currentFirstResourceName = disCalc.getFirstResourceName();
        			matrix[disCalc.getPosX()][disCalc.getPosY()] = matrix[disCalc.getPosY()][disCalc.getPosX()] = disCalc.getDistance();
    				//updateEcssalModel(disCalc.getFirstResourcePath(), disCalc.getSecondResourcePath(), disCalc.getDistance());
    				if (disCalcListIndex % NUMBER_OF_DISTANCES_COMPUTED_STATUS_UPDATE == 0) {
    					int distancesLeftToCompute = totalDistanceCount - disCalcListIndex;
    					double percentOfDistancesComputed = 100.0 - ((double)distancesLeftToCompute / (double)totalDistanceCount * 100.0);
    					currentTime = System.currentTimeMillis();
    					long estimatedCompletion = (long)((currentTime - startTime) * (100.0)/percentOfDistancesComputed);
					logger.info("Status: " + distancesLeftToCompute + " distance computations left to compute " + "(" + percentOfDistancesComputed + "% computed). Calculation estimated to complete at " + time_formatter.format(startTime + estimatedCompletion));
    				}
        			if (firstResourceName!=null && !currentFirstResourceName.equals(firstResourceName)) {
        				//logger.info("COMPLETED ANALYSIS UPDATE OF " + firstResourceName);
        			}
        			firstResourceName = disCalc.getFirstResourceName();
        		}
        		
         } catch (InterruptedException | ExecutionException ex) {
            // Exceptions from the future should be handled here
        	 System.err.println("ERrOR:" +ex.getMessage());
        	 ex.printStackTrace();
        } catch (Exception e) {
        	System.err.println("ERrOR:" +e.getMessage());
        	e.printStackTrace();
        }
		
		logger.info("... finished updating distance matrix and analysis model.");
		
	}

	
//	protected SearchElement obtainSearchElement(File sourceFile) {
//		EList<SearchElement> searchElements = ((Root) ecssalModelResource.getContents().get(0)).getSearchElements();
//		String sourceFileName = sourceFile.getName().replaceFirst("[.][^.]+$", "");
//		
//		java.util.Optional<SearchElement> optionalSearchElement = 
//				searchElements.stream().filter(searchElement -> searchElement.getName().equals(sourceFileName)).findFirst();
//		
//		SearchElement searchElement = optionalSearchElement.get();
//		
//		return searchElement;
//	}
	
	/*
	 * Matrix immer neu kopieren
	 * Immer wenn eine neue Datei kommt die matrix vergrößern
	 * Diese Methode wird es nicht mehr geben
	 */
	private void initializeMatrix() {
		logger.info("Initializing relation matrix ...");
		initNameList();
		matrix = new double[filesList.size()][filesList.size()];		

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = DEFAULT_MATRIX_VALUE;
			}
			matrix[i][i] = 0.0; //Distances have to be positive anyway
		}
		logger.info("... finished initializing relation matrix.");
		
		//Read matrix content
		loadExistingMatrixContent();
	}


	private void loadExistingMatrixContent() {
		logger.info("Loading existing matrix content ...");

		try {
			Map<String,Integer> existingInts = new HashMap<String, Integer>();
			Map<Integer,String> existingFiles = new HashMap<>();
			Map<String,Integer> newInts = new HashMap<String, Integer>();
			//Hope file.getName is unique
			{
				int i = 0;
				for (File file: filesList) {
					String name = file.getName();
					newInts.put(name, i);
					for (String pname: potentialFiles.getOrDefault(name, Collections.emptyList())) {
						newInts.put(pname, i);
					}
					++i;
				}
				existingInts.putAll(newInts);
			}
			
			if (matrixFile != null && matrixFile.exists()) {
				try (BufferedReader reader = new BufferedReader(new FileReader(matrixFile))) {
					String s;
					while ((s = reader.readLine()) != null) {
						if (s.contains(":")) {
							String[] numStr = s.split("\\:",2);
							int index = Integer.valueOf(numStr[0]);
							//So that the state is always correct (hopefully)
							String curFile = existingFiles.get(index);
							existingInts.remove(curFile);
							existingInts.remove(getCanonicalFileName(curFile));
							existingInts.put(numStr[1], index);
							existingInts.put(getCanonicalFileName(numStr[1]), index);
							existingFiles.put(index, getCanonicalFileName(numStr[1]));
						} else {
							String[] values = s.split("[,=]",3); 
							//Workaround II because file names were stored instead of indices
							String firstFile = values[0].endsWith("xtext")?values[0]:existingFiles.get(Integer.valueOf(values[0]));
							String secondFile = values[1].endsWith("xtext")?values[1]:existingFiles.get(Integer.valueOf(values[1]));
							String cfirstFile = getCanonicalFileName(firstFile);
							String csecondFile = getCanonicalFileName(secondFile);
							if (cfirstFile != null && csecondFile != null) {
								//This is a bug! a significant one!
								Integer nowFirstIndex = newInts.get(cfirstFile);
								Integer nowSecondIndex = newInts.get(csecondFile);
								if (nowFirstIndex != null && nowSecondIndex != null) {
									//Workaround because things were stored with []
									values[2] = values[2].replace("]", "").replace("[", "");
									matrix[nowFirstIndex][nowSecondIndex] = matrix[nowSecondIndex][nowFirstIndex] = Double.valueOf(values[2]);
								} else {
									logger.error("Could not get "+firstFile+" (->"+cfirstFile+") ="+nowFirstIndex+", "+secondFile+"(->"+csecondFile+")="+nowSecondIndex);
								}
							} else {
								logger.warn("Could not get "+values[0]+"="+firstFile+", "+values[1]+"="+secondFile);
							}
						}
					}
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.info("... finished loading existing matrix content.");

	}
	
	private void initializeLogOutputMatrix() {

		try {
			this.logOutputStream = new FileOutputStream(matrixFile,true);
			StringBuilder builder = new StringBuilder();
			int i = 0;
			for (File file: filesList) {
				builder.append(i);
				builder.append(":");
				builder.append(file.getName());
				builder.append("\n");
				++i;
			}
			logOutputStream.write(builder.toString().getBytes());
			logOutputStream.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    private CompletableFuture<DistanceCalculator> createDistanceCalculatorFuture(Resource first, Resource second, int posX, int posY) {
        CompletableFuture<DistanceCalculator> futureCount = CompletableFuture.supplyAsync(
                () -> {
                		DistanceCalculator distanceCalculator = new DistanceCalculator(logOutputStream);
                		//Vielleicht ist das ein Problem?
                		distanceCalculator.calculateDistance(first, second, posX, posY);
                    return distanceCalculator;
                });
        return futureCount;
    }

}