package uk.ac.york.cs.ecss.newproc.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.util.Collection;

public class WrapperEObject extends MinimalEObjectImpl {

	private Object obj;
	private EClassInfo eclassInfo;
	
	@Deprecated
	public WrapperEObject() {
		
	}
	
	public WrapperEObject(Object obj, EClassInfo ecl) {
		init(obj, ecl);
	}

	public void init(Object obj, EClassInfo ecl) {
		this.obj = obj;
		this.eclassInfo = ecl;
	}

	protected EClass eStaticClass()
	{
	    return eclassInfo.getEClass();
	}
	

	  @Override
	  public int eContainerFeatureID()
	  {
		  super.eContainerFeatureID();
		  EStructuralFeature feat = eContainingFeature();
		  if (feat == null) {
			  return -1;
		  }
		  if (feat instanceof EReference) {
			  EReference ref = (EReference)feat;
			  EReference op = ref.getEOpposite();
			  if (op != null) {
				  return op.getFeatureID();
			  }
		  }
		  return -feat.getFeatureID()-1;
	  }
	  

	  protected void eBasicSetContainerFeatureID(int newContainerFeatureID)
	  {
	    
	  }
	
	  @Override
	  protected void eBasicSetContainer(InternalEObject newContainer, int newContainerFeatureID)
	  {
		  System.out.println("Set container to "+newContainer);
	  }

	protected void eBasicSetContainer(InternalEObject newContainer) {
		//???
		System.out.println("Set container to "+newContainer);
		
	}
	

	@Override
	public Object eGet(EStructuralFeature feature) {
		return eclassInfo.getValue(feature.getName(), obj);
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return eGet(feature);
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		Object obj = eGet(feature);
		if (obj == null) {
			return false;
		}
		if (feature.isMany() && ((Collection)obj).isEmpty()) {
			return false;
		}
		return true;
	}
	
}
