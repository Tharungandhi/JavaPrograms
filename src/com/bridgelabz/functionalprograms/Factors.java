/******************************************************************************
 *  Compilation:  javac -d bin Factors.java
 *  Execution:    java -cp bin com.bridgelabz.util.Factors n
 *  
 *  Purpose:Computes the prime factorization of N using brute force.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class Factors {
	/*
	* The main function is written to take input from the user and
	* call the primefactors method that calculate factors
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Number to find the prime factor");  
		int n=Functionalprograms.readInteger();
		
		//Method 1- using static function of FunctionalUtilty class
        //of com.bridgelabz.util package
		Functionalprograms.primeFactors(n); 
	}

}
