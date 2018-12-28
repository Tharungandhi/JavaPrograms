	/******************************************************************************
	 *  Compilation:  javac -d bin NewtonMethod.java
	 *  Execution:    java -cp bin com.bridgelabz.util.NewtonMethod n
	 *  
	 *  Purpose: Determines square root of a non negative number.
	 *
	 *  @author  Tharun Kumar
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class SquareRoot {
	/*
	* The main function is written to take input from the user and
	* call the squareRoot() function that finds square root of a number
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number"); 
		double c=Algorithmprograms.readdouble();  
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		Algorithmprograms.newtonMethod(c); 
		
	}

}
