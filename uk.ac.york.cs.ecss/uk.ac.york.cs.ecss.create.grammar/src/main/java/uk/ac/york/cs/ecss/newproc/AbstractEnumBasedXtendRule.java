package uk.ac.york.cs.ecss.newproc;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.util.Collection;
import java.util.List;

public abstract class AbstractEnumBasedXtendRule extends AbstractEcssXtendRule  {

	protected EEnum loc_class;
	protected List<EEnumLiteral> loc_values;
	protected SlotContainer[] allSlots;

		
	public AbstractEnumBasedXtendRule(EEnum cl) {
		//slot("name") --> get value of that one
		//Automatically inject slots! Default: slot_ --> 1,1, slotm_ --> 0,*, slotp_ --> 1,* - put into lists according to key
		this.loc_class = cl;
		this.loc_values = loc_class.getELiterals();
	}

	@Override
	public void afterInit() {
		distributeOn(loc_values, allSlots);
	}

	public abstract String getString();
	
	@Override
	public String getSubName() {
		return loc_class.getName();
	}
	
}
