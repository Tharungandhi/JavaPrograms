/******************************************************************************
 *  Compilation:  javac -d bin Quadratic .java
 *  Execution:    java -cp bin com.bridgelabz.util.Quadratic  n
 *  
 *  Purpose:to find the roots of the equation.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class Quadratic {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stud		
		
		//Reading input number from the user
		System.out.println("enter the value of a"); 
		int a=Functionalprograms.readInteger();  
		System.out.println("enter the value of b"); 
		int b=Functionalprograms.readInteger();  
		System.out.println("enter the value of c"); 
		int c=Functionalprograms.readInteger(); 
		
		
		//Method 1- using static function of FunctionalUtilty class
    	//of com.bridgelabz.util package
		Functionalprograms.quadratic(a,b,c);  
		}}
