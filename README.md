[![Build Status](https://travis-ci.com/patrickneubauer/ECSS.png?token=qyMyP4Lpgf4tBCDzoRsa&branch=master)](https://travis-ci.com/patrickneubauer/ECSS)
# Ecore Concrete Syntax Specification Framework

Setup:
- Eclipse Modeling Tools Photon Release (4.8.0) Build id: 20180619-1200
- Xtext Complete SDK version 2.15.0.v20180916-1232
- m2e - Maven Integration for Eclipse (includes Incubating components) version 1.9.0.20180606-2036
- Epsilon version 1.5.0.201808121840

Setup instructions:
- Import projects as Maven projects into new workspace and wait for automated build to complete
- Execute Maven build (optional): right-click on 'eclipse-launch/clean-install-all.launch' and select 'Run As > clean-install-all'
- Clean and build workspace (in case workspace problems are displayed)

Development notes:
- Add dependencies by looking them up on https://search.maven.org and adding them to pom.xml; in case not available or specific, place the *.jar in the 'libs' folder at the root of the module indending to use of the dependency and add it by means of 'git add -f *.jar' (jar files are part of .gitignore)

