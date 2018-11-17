package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.util.Collection;
import java.util.List;

public abstract class AbstractClassBasedXtendRule extends AbstractEcssXtendRule  {

	protected EClass loc_class;
	protected Collection<EClass> loc_subClasses;
	protected SlotContainer[] allSlots;
	protected List<EStructuralFeature> loc_features;

		
	public AbstractClassBasedXtendRule(EClass cl) {
		//slot("name") --> get value of that one
		//Automatically inject slots! Default: slot_ --> 1,1, slotm_ --> 0,*, slotp_ --> 1,* - put into lists according to key
		this.loc_class = cl;
		this.loc_features = loc_class.getEAllStructuralFeatures();
		
	}

	@Override
	public void afterInit() {
		this.loc_subClasses = manager.getCompleteManager().getSubClasses(loc_class);
		distributeOn(loc_features, allSlots);
	}

	public abstract String getString();
	
	@Override
	public String getSubName() {
		return loc_class.getName();
	}
	
}
