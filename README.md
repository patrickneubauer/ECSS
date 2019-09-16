[![Build Status](https://travis-ci.org/patrickneubauer/ECSS.svg?branch=master)](https://travis-ci.org/patrickneubauer/ECSS)
# Ecore Concrete Syntax Specification Framework

#### Setup (tested):
* Oracle Java Development Kit 1.8.0 172 (`jdk-8u172`) - [oracle.com download page](https://www.oracle.com/technetwork/java/javase/downloads/java-archive-javase8-2177648.html)
* Eclipse Modeling Tools Photon Release (4.8.0) Build id: `20180619-1200` - [eclipse.org download page](http://www.eclipse.org/downloads/packages/release/2018-09/r/eclipse-modeling-tools)
* Xtext Complete SDK version `2.15.0.v20180916-1232` - [eclipse.org update site](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/)
* m2e - Maven Integration for Eclipse (includes Incubating components) version `1.9.0.20180606-2036` - [eclipse.org update site](http://download.eclipse.org/technology/m2e/releases)

#### Setup instructions:
* Import projects as Maven projects into new workspace and wait for automated build to complete
* Run [clean-install-all.launch](https://github.com/patrickneubauer/ECSS/blob/master/eclipse-launch/clean-install-all.launch) Eclipse launch configuration

#### Research:
* [Presentation slides](https://www-users.cs.york.ac.uk/neubauer/OCL2019-slides.pdf)
* [Paper](https://www-users.cs.york.ac.uk/neubauer/OCL2019-paper.pdf)

#### Development notes:
* Add dependencies by looking them up on [The Central Repository](https://search.maven.org) and adding them to `pom.xml`; in case not available or specific, place the jar file inside the `libs` folder (create if non-existing) at the root of the module intending to use the dependency and commit it by means of `git add -f *.jar` to force addition, i.e. ignore `.gitignore`.

#### Troubleshooting:

* Eclipse workspace displays compilation errors
	* Refresh, clean, and build workspace
	* Update Maven Project
		* Right-click anywhere inside Eclipse Package Explorer > Maven > Update Project...
		* Click "Select All" button
		* Click "OK" button

* Console displays `ERROR Mwe2Launcher.main{1}:38 - Couldn't find module C:\very-long-pathname\GenerateStsLanguageDefault.mwe2` during MWE2 workflow execution
	* Follow solution(s) described in [Stackoverflow post](https://stackoverflow.com/questions/22575662/filename-too-long-in-git-for-windows) (summarized below)
		* Execute command: `git config --system core.longpaths true`
		* Enable long path names in Windows registry by setting entry `LongPathsEnabled` to `1` in `HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\FileSystem` (use command `regedit` to open Windows registry)

#### Other:
* Module descriptions are provided in [uk.ac.york.cs.ecss/pom.xml](https://github.com/patrickneubauer/ECSS/tree/master/uk.ac.york.cs.ecss/pom.xml)

#### External Resources

* [Eclipse Modeling Framework](https://eclipse.org/modeling/emf/)
* [Xtext](https://eclipse.org/Xtext/)
* [Epsilon](https://www.eclipse.org/epsilon/)
* [XMLIntellEdit](https://github.com/patrickneubauer/XMLIntellEdit)
