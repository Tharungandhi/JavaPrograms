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

public class NewtonMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number");  //user input
		double c=Algorithmprograms.readdouble();  //storing the value to ref variable
		Algorithmprograms.newtonMethod(c); //method calling
		
	}

}
