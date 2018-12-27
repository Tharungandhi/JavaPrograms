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

	public static void main(String[] args) {
		// TODO Auto-generated method stud		
		System.out.println("enter the value of a"); //user input
		int a=Functionalprograms.readInteger();  //storing the value to ref variable
		System.out.println("enter the value of b"); //user input
		int b=Functionalprograms.readInteger();  //storing the value to ref variable
		System.out.println("enter the value of c"); //user input
		int c=Functionalprograms.readInteger();  //storing the value to ref variable
		Functionalprograms.quadratic(a,b,c);  //method calling
		
		

	}

}
