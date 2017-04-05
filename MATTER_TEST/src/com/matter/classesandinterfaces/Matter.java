
package com.matter.classesandinterfaces;

/*****************************************************************************************
 * Q: On the basis of composition, how matter is classified?
 * A: Pure Subtance, and Mixture 
 * 
 * 
 * @author	Samuel Mayol
 * @company DB Schenker, Inc.
 * @date	07/11/2014
 * @version 1.0
 * 
 * ---------------------------------------------------------------------------------
 *
 * Here you can define what new you add to these interfaces and classes!!!!!!!!!!!!!
 * <THIS IS JUST A FORMAT, TO CONTINUE DEVELOPING THAT WAY WE ARE DOING THIS CLASSES SELF>
 * <DOCUMENTED >
 * 
 * @author	Jay Raparla
 * @date	07/11/2014
 * @version 1.0.1
 *****************************************************************************************/

public interface Matter {
	
	//public static String mass = null; 
	// The only fields that can appear in an interface must be declared both static and final.
		
	/*
	 * An interface is implicitly abstract. You do not need to use the abstract keyword when declaring an interface.
	 * e.g. public abstract void mass(); [the 'abstract' is unnecessary]. */
	
	public void mass(String mass);
	public void compositon();
	public void properties(); // Mixtures of different compositions may have widely different properties.
	// Pure substance properties do not vary.
}
