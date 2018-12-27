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

public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the principle amount");   //user input
		double p=Algorithmprograms.readdouble();   //storing the value to ref variable
		System.out.println("enter the rate");    //user input
		double r=Algorithmprograms.readdouble();   //storing the value to ref variable
		System.out.println("enter the no of year");  //user input
		double n=Algorithmprograms.readdouble();   //storing the value to ref variable
		Algorithmprograms.monthlyPayment(p, n, r);   //method calling
	}

}
