
package com.matter.classesandinterfaces;

/*****************************************************************************************
 * Q: What is meant by a pure substance?
 * A: A sample of matter containing only one substance is called a pure substance. 
 * In other words all constituents of the substance are same in their chemical nature.
 * 
 * Q: What are the characteristics exhibited by a pure substance?
 * A: 	A pure substance contains only one kind of atoms or molecules. 
 * 		It is perfectly homogenous 
 *		It has definite composition which does not vary with time. 
 *		It has definite melting point, boiling point, density etc.
 *
 * Q: What are different categories of pure substance?
 * A:	Elements, Compounds.
 * 
 * Q: Name two properties of a substance to check its purity?
 * A: A pure substance has a fixed melting point or boiling point at constant pressure. 
 * The purity of a substance can be tested by checking its melting point or boiling point. 
 * If a substance is impure i.e. it contains traces of another substance, the melting and 
 * boiling point of that substance will change.
 * 
 * 
 * @author	Samuel Mayol
 * @company DB Schenker, Inc.
 * @date	07/11/2014
 * @version 1.0
 * 
 *****************************************************************************************/

public interface PureSubstances extends Matter{
	
	// methods
	public boolean pureSubstance(); // behavior True 
	public boolean mixturesSubstance(); // False, then cannot be separated, else it is not a PureSubstance.
	
	

		
		
		
	
}
