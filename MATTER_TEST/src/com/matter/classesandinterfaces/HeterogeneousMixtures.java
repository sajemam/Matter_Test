
package com.matter.classesandinterfaces;

/*****************************************************************************************
 * Q: List Heterogeneous Mixture characteristics:
 * A:  
 * 	1. Constituents have non-uniform composition throughout mixture. 
 *	2. Rock, oil and water, Mixture of Iron filling and Sulphur. 
 *	3. Particles may be visible to unaided eye.
 *	4. All suspensions are heterogeneous mixture.  
 * 
 * 
 * @author	Samuel Mayol
 * @company DB Schenker, Inc.
 * @date	07/11/2014
 * @version 1.0
 * 
 *****************************************************************************************/

import java.util.List;

public class HeterogeneousMixtures implements Mixtures {
	
	// instance fields
	private String massElementName;
	private double atomicMassValue;
	private List<PureSubstances> pureSubstances; 
	
	/**
	 * @param massElementName
	 * @param atomicMassValue
	 * @param pureSubstances
	 */
	public HeterogeneousMixtures(String massElementName,
			double atomicMassValue, List<PureSubstances> pureSubstances) {
		super();
		this.massElementName = massElementName;
		this.atomicMassValue = atomicMassValue;
		this.pureSubstances = pureSubstances;
	}

	/* This class that implements Mixtures interface needs to implement all five methods,
	 * the three methods from Matter interface and the two methods from Mixture interface. */
	
	// Methods from the Matter interface (parent)
	
	public void mass(String massName, double atomicMass) {
		this.massElementName = massName;
		this.atomicMassValue = atomicMass;
		
	}
	
	@Override
	public void compositon() {
		//it's composition without pure substances I cannot make mixture substances
		// composition means "contains". e.g. a mix substance contain two or more pure substance
		PureSubstances ps;
		if(pureSubstances != null  )
			for(PureSubstances ps1 : pureSubstances) ps1.mixturesSubstance();
		// NOT COMPLETED, BECAUSE IT IS NOT IMPORTAN THE LOGIC RIGHT NOW.
	}

	@Override
	public void properties() {
		// TODO Auto-generated method stub
		
	}

	// Methods from the Mistures interface (child)
		
	@Override
	public boolean pureSubstance() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mixturesSubstance() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void mass(String mass) {
		// TODO Auto-generated method stub
		
	}
	
	

}
