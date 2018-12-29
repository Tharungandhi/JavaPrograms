	/******************************************************************************
	 *  Compilation:  javac -d bin Payment.java
	 *  Execution:    java -cp bin com.bridgelabz.util.Payment n
	 *  
	 *  Purpose: To calculate monthlyPayment.
	 *
	 *  @author  Tharun Kumar
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class MonthlyPayment {
	/*
	* The main function is written to take input from the user and
	* call the monthlyPayment() function calculates monthly payment
	*/
	public static void main(String[] args) {
		System.out.println("enter the principle amount");   
		double p=Algorithmprograms.readdouble();   
		System.out.println("enter the rate");    
		double r=Algorithmprograms.readdouble();   
		System.out.println("enter the no of year");  
		double n=Algorithmprograms.readdouble();   
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		Algorithmprograms.monthlyPayment(p, n, r);  }}