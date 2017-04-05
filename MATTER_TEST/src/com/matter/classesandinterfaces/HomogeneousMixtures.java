
package com.matter.classesandinterfaces;


/*****************************************************************************************
 * Q: List Homogenous Mixture characteristics:
 * A:  
 * 	1. Constituents have uniform composition throughout the mixture. 
 *	2. Air, blood, saturated sugar, water solution, alloys are examples of homogenous 
 *	mixture. 
 *	3. Particles Not visible to unaided eye.  
 *	4. All solutions are homogenous mixture. 
 * 
 * 
 * @author	Samuel Mayol
 * @company DB Schenker, Inc.
 * @date	07/11/2014
 * @version 1.0
 * 
 *****************************************************************************************/

public class HomogeneousMixtures implements Mixtures{
	
	// instance fields
	private boolean trueSolutions;
	private int particleSize;
	
	/**
	 * Constructor
	 */	
		
	
	/* This class that implements Mixtures interface needs to implement all five methods,
	 * the three methods from Matter interface and the two methods from Mixture interface. */
	
	// Methods from the Matter interface (parent)
	
	@Override
	public void mass(String mass) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * @param trueSolutions
	 * @param particleSize
	 */
	public HomogeneousMixtures(boolean trueSolutions, int particleSize) {
		super();
		this.trueSolutions = trueSolutions;
		this.particleSize = particleSize;
	}

	@Override
	public void compositon() {
		// TODO Auto-generated method stub
		
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

	

}
