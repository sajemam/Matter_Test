
package com.matter.classesandinterfaces;

/*****************************************************************************************
 * Q: Define mixture.
 * A: If two or more substances (elements or compounds) are mixed together in any 
 * proportion, do not undergo any chemical change but retain their properties, 
 * the resulting substance is called mixture.
 * 
 * Q: What are the kinds of mixture?
 * A: Homogenous mixture, Hetrogenous mixture 
 * 
 * Q: What are the characteristics of mixture?
 * A: 
 * 1.  	Variable composition: The constituents of a mixture are present in any ratio. 
 * 	Example: A mixture of sand and salt can be in a ratio of 1:2 or 1:3 by weight. 
 * 2. 	Only Physical change: The mixture is a result of physical change. 
 * 	The constituents of a mixture do not bind each other by chemical bonds. 
 * 	Example: In air the main constituents, i.e., oxygen, nitrogen and carbon dioxide, 
 * 	do not bind each other with chemical bonds. 
 * 3.	No specific properties: The properties of a mixture are the average of 
 * 	the properties of its constituents. Example: The properties of air are average 
 * 	common properties of nitrogen and oxygen. 
 * 4.	Homogeneity: Most of the mixtures are heterogeneous, 
 * 	i.e., their constituents are not spread evenly throughout. However, 
 * 	some mixtures are homogeneous i.e. constituents are uniformly spread out. 
 * 	Example: In the mixture of iron and sulphur, at some places iron is more 
 * 	and at some places sulphur is more. 
 * 5.	Separation Methods: In general, the constituents of mixture can be separated 
 * 	by applying suitable physical methods. E.g. Iron can be separated from the 
 * 	mixture of iron and sulphur with the help of a magnet. 
 * 6.	Energy changes: In general, no energy is released or absorbed during the formation 
 * 	of a mixture.  Example: On mixing iron and sulphur, 
 * 	heat energy is neither absorbed nor evolved. 
 * 
 * 
 * @author	Samuel Mayol
 * @company DB Schenker, Inc.
 * @date	07/11/2014
 * @version 1.0
 * 
 *****************************************************************************************/

public interface Mixtures extends Matter {
	
	/*
	 * An interface can extend another interface, similarly to the way that a class can 
	 * extend another class. The extends keyword is used to extend an interface, and the 
	 * child interface inherits the methods of the parent interface.
	 * e.g. this is unnecessary: [ public void mass(); , etc.] because mass() method is 
	 * part of the interface parent interface Matter. 
	 * 
	 * 				!!!! LOOOK !!!!!!!
	 * A class that implements Mixtures interface needs to implement all five methods,
	 * the three methods from Matter interface and the two methods from Mixture interface. */

	
	// methods
	public boolean pureSubstance(); // behavior False 
	public boolean mixturesSubstance(); // True, then can be separated, else it is not a Mixture.
	

}






