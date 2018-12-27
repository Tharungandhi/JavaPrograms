/******************************************************************************
 *  Compilation:  javac -d bin Harmonic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Harmonic n
 *  
 *  Purpose:Harmonic Number.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.*;


public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value of n");//user input
		int s1=Functionalprograms.readInteger();//storing the value to ref variable
		Functionalprograms.harmonic(s1);//method calling
	}
}
