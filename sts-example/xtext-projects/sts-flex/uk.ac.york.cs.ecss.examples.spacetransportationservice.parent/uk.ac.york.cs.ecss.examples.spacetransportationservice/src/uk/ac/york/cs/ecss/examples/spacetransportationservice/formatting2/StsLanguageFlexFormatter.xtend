/*
 * generated by Xtext 2.18.0
 */
package uk.ac.york.cs.ecss.examples.spacetransportationservice.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import spacetransportationservice.LaunchSite
import spacetransportationservice.SpaceTransportationService
import uk.ac.york.cs.ecss.examples.spacetransportationservice.services.StsLanguageFlexGrammarAccess

class StsLanguageFlexFormatter extends AbstractFormatter2 {
	
	@Inject extension StsLanguageFlexGrammarAccess

	def dispatch void format(SpaceTransportationService spaceTransportationService, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (launchSite : spaceTransportationService.launchSites) {
			launchSite.format
		}
		for (engineType : spaceTransportationService.engineTypes) {
			engineType.format
		}
		for (spacecraft : spaceTransportationService.spacecrafts) {
			spacecraft.format
		}
	}

	def dispatch void format(LaunchSite launchSite, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (physicalProperty : launchSite.physicalProperties) {
			physicalProperty.format
		}
	}
	
	// TODO: implement for Spacecraft, Stage
}
